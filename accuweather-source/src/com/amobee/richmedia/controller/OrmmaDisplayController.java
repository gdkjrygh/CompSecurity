// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.content.Context;
import android.content.IntentFilter;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.URLUtil;
import com.amobee.adsdk.AdManager;
import com.amobee.adsdk.Log;
import com.amobee.richmedia.controller.util.OrmmaConfigurationBroadcastReceiver;
import com.amobee.richmedia.view.AmobeeView;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaController

public class OrmmaDisplayController extends OrmmaController
{

    private static final String LOG_TAG = "AmobeeViewDisplayController";
    private boolean bMaxSizeSet;
    private OrmmaConfigurationBroadcastReceiver mBroadCastReceiver;
    private float mDensity;
    private int mLastOrientation;
    private int mMaxHeight;
    private int mMaxWidth;
    private WindowManager mWindowManager;

    public OrmmaDisplayController(AmobeeView amobeeview, Context context)
    {
        super(amobeeview, context);
        bMaxSizeSet = false;
        mMaxWidth = -1;
        mMaxHeight = -1;
        mLastOrientation = -1;
        amobeeview = new DisplayMetrics();
        mWindowManager = (WindowManager)context.getSystemService("window");
        mWindowManager.getDefaultDisplay().getMetrics(amobeeview);
        mDensity = mOrmmaView.metrics.density;
        mLastOrientation = getOrientation();
    }

    private OrmmaController.Dimensions getDeviceDimensions(OrmmaController.Dimensions dimensions1)
    {
        dimensions1.width = (int)((float)dimensions1.width * mDensity);
        dimensions1.height = (int)((float)dimensions1.height * mDensity);
        if (dimensions1.height < 0)
        {
            dimensions1.height = mOrmmaView.getHeight();
        }
        if (dimensions1.width < 0)
        {
            dimensions1.width = mOrmmaView.getWidth();
        }
        int ai[] = new int[2];
        mOrmmaView.getLocationInWindow(ai);
        if (dimensions1.x < 0)
        {
            dimensions1.x = ai[0];
        }
        if (dimensions1.y < 0)
        {
            dimensions1.y = ai[1] - 0;
        }
        if (dimensions1.width > mOrmmaView.metrics.widthPixels)
        {
            dimensions1.width = mOrmmaView.metrics.widthPixels;
        }
        if (dimensions1.height > mOrmmaView.metrics.heightPixels)
        {
            dimensions1.height = mOrmmaView.metrics.heightPixels;
        }
        return dimensions1;
    }

    public void close()
    {
        mOrmmaView.close();
    }

    public String dimensions()
    {
        return (new StringBuilder("{ \"top\" :")).append((int)((float)mOrmmaView.getTop() / mDensity)).append(",").append("\"left\" :").append((int)((float)mOrmmaView.getLeft() / mDensity)).append(",").append("\"bottom\" :").append((int)((float)mOrmmaView.getBottom() / mDensity)).append(",").append("\"right\" :").append((int)((float)mOrmmaView.getRight() / mDensity)).append("}").toString();
    }

    public void expand(String s, String s1, String s2, String s3)
    {
        String s4;
        if (mOrmmaView.getUserGestureRequiredToOpenAds() && !mOrmmaView.getUserTouchedTheView())
        {
            Log.d("AmobeeViewDisplayController", (new StringBuilder("RM Expand blocked: ")).append(s1).toString());
            return;
        }
        s4 = null;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s.equals("") && !s.equals("{}") && !s.equals("undefined")) goto _L3; else goto _L2
_L2:
        OrmmaController.Dimensions dimensions1 = new OrmmaController.Dimensions();
        if (!bMaxSizeSet) goto _L5; else goto _L4
_L4:
        dimensions1.height = mMaxHeight;
        dimensions1.width = mMaxWidth;
_L6:
        if (s2.equals("{}"))
        {
            break MISSING_BLOCK_LABEL_156;
        }
        s2 = (OrmmaController.Properties)getFromJSON(new JSONObject(s2), com/amobee/richmedia/controller/OrmmaController$Properties);
        s4 = s2;
        if (s.equals("{}"))
        {
            break MISSING_BLOCK_LABEL_156;
        }
        s2.useCustomClose = true;
        s4 = s2;
        mOrmmaView.expand(dimensions1, s1, s4, s3);
        return;
        s;
_L15:
        mOrmmaView.raiseError("expand failed", "expand");
        return;
_L5:
        dimensions1.height = mOrmmaView.metrics.heightPixels;
        dimensions1.width = mOrmmaView.metrics.widthPixels;
          goto _L6
_L3:
        dimensions1 = getDeviceDimensions((OrmmaController.Dimensions)getFromJSON(new JSONObject(s), com/amobee/richmedia/controller/OrmmaController$Dimensions));
          goto _L6
        s;
_L14:
        mOrmmaView.raiseError("expand failed", "expand");
        return;
        s;
_L12:
        mOrmmaView.raiseError("expand failed", "expand");
        return;
        s;
_L10:
        mOrmmaView.raiseError("expand failed", "expand");
        return;
        s;
_L8:
        mOrmmaView.raiseError("expand failed", "expand");
        return;
        s;
        if (true) goto _L8; else goto _L7
_L7:
        s;
        if (true) goto _L10; else goto _L9
_L9:
        s;
        if (true) goto _L12; else goto _L11
_L11:
        s;
        if (true) goto _L14; else goto _L13
_L13:
        s;
          goto _L15
    }

    public String getMaxSize()
    {
        if (bMaxSizeSet)
        {
            return (new StringBuilder("{ width: ")).append((int)((float)mMaxWidth / mDensity)).append(", ").append("height: ").append((int)((float)mMaxHeight / mDensity)).append("}").toString();
        } else
        {
            return getScreenSize();
        }
    }

    public int getOrientation()
    {
        switch (mWindowManager.getDefaultDisplay().getOrientation())
        {
        default:
            return -1;

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 90;

        case 2: // '\002'
            return 180;

        case 3: // '\003'
            return 270;
        }
    }

    public String getScreenSize()
    {
        return (new StringBuilder("{ width: ")).append((int)((float)mOrmmaView.metrics.widthPixels / mOrmmaView.metrics.density)).append(", ").append("height: ").append((int)((float)mOrmmaView.metrics.heightPixels / mOrmmaView.metrics.density)).append("}").toString();
    }

    public String getSize()
    {
        return mOrmmaView.getSize();
    }

    public void hide()
    {
        mOrmmaView.hide();
    }

    public boolean isVisible()
    {
        return mOrmmaView.getVisibility() == 0;
    }

    public void logHTML(String s)
    {
    }

    public void onMaxSizeChanged()
    {
        String s = (new StringBuilder("window.ormmaview.fireChangeEvent({ maxSize: ")).append(getMaxSize()).append("});").toString();
        mOrmmaView.injectJavaScriptRichMedia(s);
    }

    public void onOrientationChanged(int i)
    {
        String s = (new StringBuilder("window.ormmaview.fireChangeEvent({ orientation: ")).append(i).append("});").toString();
        mOrmmaView.injectJavaScriptRichMedia(s);
    }

    public void onOrientationMightBeChanged()
    {
label0:
        {
            if (getOrientation() != mLastOrientation)
            {
                if (mOrmmaView.isExpanded() || mOrmmaView.mViewState == com.amobee.richmedia.view.AmobeeView.ViewState.INTERSTITIAL && mOrmmaView.amobeeInterstitial != null)
                {
                    android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                    int i = AdManager.getStatusBarHeight(mContext);
                    ViewGroup viewgroup = (ViewGroup)mOrmmaView.getParent();
                    if (mOrmmaView.parentView == null && !mOrmmaView.hasExpandedView && mOrmmaView.mViewState != com.amobee.richmedia.view.AmobeeView.ViewState.INTERSTITIAL)
                    {
                        if (android.os.Build.VERSION.SDK_INT >= 14)
                        {
                            layoutparams.setMargins(0, i, 0, 0);
                        } else
                        {
                            viewgroup.setPadding(0, i, 0, 0);
                        }
                    }
                    mOrmmaView.setLayoutParams(layoutparams);
                }
                mLastOrientation = getOrientation();
                if (rootViewSizeIsUpdate())
                {
                    break label0;
                }
                mOrmmaView.mUpdateJSOrientation = false;
            }
            return;
        }
        setNewSizeAcoordingToRotation();
        updateJsObjectsNewSizeAndOrientation(mLastOrientation);
    }

    public void onScreenSizeChanged()
    {
        String s = (new StringBuilder("window.ormmaview.fireChangeEvent({ screenSize: ")).append(getScreenSize()).append("});").toString();
        mOrmmaView.injectJavaScriptRichMedia(s);
    }

    public void open(String s, boolean flag, boolean flag1, boolean flag2)
    {
        if (mOrmmaView.getUserGestureRequiredToOpenAds() && !mOrmmaView.getUserTouchedTheView())
        {
            Log.d("AmobeeViewDisplayController", (new StringBuilder("RM open blocked: ")).append(s).toString());
            return;
        } else
        {
            mOrmmaView.open(s, flag, flag1, flag2);
            return;
        }
    }

    public void openMap(String s, boolean flag)
    {
        Log.d("AmobeeViewDisplayController", (new StringBuilder("openMap: url: ")).append(s).toString());
        mOrmmaView.openMap(s, flag);
    }

    public void playAudio(String s, boolean flag, boolean flag1, boolean flag2, boolean flag3, String s1, String s2)
    {
        if (!URLUtil.isValidUrl(s))
        {
            mOrmmaView.raiseError("Invalid url", "playAudio");
            return;
        } else
        {
            mOrmmaView.playAudio(s, flag, flag1, flag2, flag3, s1, s2);
            return;
        }
    }

    public void playVideo(String s)
    {
        mOrmmaView.playVideo(s);
    }

    public void playVideo(String s, boolean flag, boolean flag1, boolean flag2, boolean flag3, int ai[], String s1, 
            String s2)
    {
        OrmmaController.Dimensions dimensions1 = null;
        if (ai[0] != -1)
        {
            dimensions1 = new OrmmaController.Dimensions();
            dimensions1.x = ai[0];
            dimensions1.y = ai[1];
            dimensions1.width = ai[2];
            dimensions1.height = ai[3];
            dimensions1 = getDeviceDimensions(dimensions1);
        }
        if (!URLUtil.isValidUrl(s))
        {
            mOrmmaView.raiseError("Invalid url", "playVideo");
            return;
        } else
        {
            mOrmmaView.playVideo(s, flag, flag1, flag2, flag3, dimensions1, s1, s2);
            return;
        }
    }

    public void resize(String s)
    {
        if (mOrmmaView.getUserGestureRequiredToOpenAds() && !mOrmmaView.getUserTouchedTheView())
        {
            Log.d("AmobeeViewDisplayController", (new StringBuilder("RM resize blocked: ")).append(s).toString());
            return;
        }
        try
        {
            OrmmaController.ResizeProperties resizeproperties = (OrmmaController.ResizeProperties)getFromJSON(new JSONObject(s), com/amobee/richmedia/controller/OrmmaController$ResizeProperties);
            mOrmmaView.resize((int)(mDensity * (float)resizeproperties.width), (int)(mDensity * (float)resizeproperties.height), resizeproperties.customClosePosition, resizeproperties.offsetX, resizeproperties.offsetY, resizeproperties.allowOffscreen);
            android.util.Log.d("AmobeeViewDisplayController", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            mOrmmaView.raiseError("resize failed", "resize");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            mOrmmaView.raiseError("resize failed", "resize");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            mOrmmaView.raiseError("resize failed", "resize");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            mOrmmaView.raiseError("resize failed", "resize");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            mOrmmaView.raiseError("resize failed", "resize");
        }
    }

    public boolean rootViewSizeIsUpdate()
    {
        View view = mOrmmaView.getRootView();
        if (view != null)
        {
            int i = view.getWidth();
            if (mMaxWidth == i)
            {
                return false;
            }
        }
        return true;
    }

    public void setMaxSize(int i, int j)
    {
        bMaxSizeSet = true;
        mMaxWidth = i;
        mMaxHeight = j;
    }

    public void setNewSizeAcoordingToRotation()
    {
        ((WindowManager)mOrmmaView.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(mOrmmaView.metrics);
        mOrmmaView.getDefaultPosition();
    }

    public void setOrientationProperties(String s)
    {
        mOrmmaView.setOrientationProperties(s);
    }

    public void show()
    {
        mOrmmaView.show();
    }

    public void startConfigurationListener()
    {
        try
        {
            if (mBroadCastReceiver == null)
            {
                mBroadCastReceiver = new OrmmaConfigurationBroadcastReceiver(this);
            }
            mContext.registerReceiver(mBroadCastReceiver, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void stopAllListeners()
    {
        stopConfigurationListener();
        mBroadCastReceiver = null;
    }

    public void stopConfigurationListener()
    {
        try
        {
            mContext.unregisterReceiver(mBroadCastReceiver);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void storePicture(String s)
    {
        mOrmmaView.storePicture(s);
    }

    public void updateJsObjectsNewSizeAndOrientation(int i)
    {
        mOrmmaView.onSizeChanged();
        onMaxSizeChanged();
        onScreenSizeChanged();
        onOrientationChanged(i);
    }

    public void useCustomClose(boolean flag)
    {
        mOrmmaView.useCustomClose(flag);
    }
}
