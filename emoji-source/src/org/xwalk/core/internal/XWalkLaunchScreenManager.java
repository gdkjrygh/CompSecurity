// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.ArrayList;

// Referenced classes of package org.xwalk.core.internal:
//            PageLoadListener, XWalkViewInternal

public class XWalkLaunchScreenManager
    implements org.chromium.content.browser.ContentViewRenderView.FirstRenderedFrameListener, android.content.DialogInterface.OnShowListener, android.content.DialogInterface.OnDismissListener, PageLoadListener
{
    private static final class BorderModeType extends Enum
    {

        private static final BorderModeType $VALUES[];
        public static final BorderModeType NONE;
        public static final BorderModeType REPEAT;
        public static final BorderModeType ROUND;
        public static final BorderModeType STRETCH;

        public static BorderModeType valueOf(String s)
        {
            return (BorderModeType)Enum.valueOf(org/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType, s);
        }

        public static BorderModeType[] values()
        {
            return (BorderModeType[])$VALUES.clone();
        }

        static 
        {
            REPEAT = new BorderModeType("REPEAT", 0);
            STRETCH = new BorderModeType("STRETCH", 1);
            ROUND = new BorderModeType("ROUND", 2);
            NONE = new BorderModeType("NONE", 3);
            $VALUES = (new BorderModeType[] {
                REPEAT, STRETCH, ROUND, NONE
            });
        }

        private BorderModeType(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class ReadyWhenType extends Enum
    {

        private static final ReadyWhenType $VALUES[];
        public static final ReadyWhenType COMPLETE;
        public static final ReadyWhenType CUSTOM;
        public static final ReadyWhenType FIRST_PAINT;
        public static final ReadyWhenType USER_INTERACTIVE;

        public static ReadyWhenType valueOf(String s)
        {
            return (ReadyWhenType)Enum.valueOf(org/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType, s);
        }

        public static ReadyWhenType[] values()
        {
            return (ReadyWhenType[])$VALUES.clone();
        }

        static 
        {
            FIRST_PAINT = new ReadyWhenType("FIRST_PAINT", 0);
            USER_INTERACTIVE = new ReadyWhenType("USER_INTERACTIVE", 1);
            COMPLETE = new ReadyWhenType("COMPLETE", 2);
            CUSTOM = new ReadyWhenType("CUSTOM", 3);
            $VALUES = (new ReadyWhenType[] {
                FIRST_PAINT, USER_INTERACTIVE, COMPLETE, CUSTOM
            });
        }

        private ReadyWhenType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String BORDER_MODE_REPEAT = "repeat";
    private static final String BORDER_MODE_ROUND = "round";
    private static final String BORDER_MODE_STRETCH = "stretch";
    private static String mIntentFilterStr;
    private Activity mActivity;
    private int mCurrentOrientation;
    private boolean mCustomHideLaunchScreen;
    private boolean mFirstFrameReceived;
    private Dialog mLaunchScreenDialog;
    private BroadcastReceiver mLaunchScreenReadyWhenReceiver;
    private Context mLibContext;
    private OrientationEventListener mOrientationListener;
    private boolean mPageLoadFinished;
    private ReadyWhenType mReadyWhen;
    private XWalkViewInternal mXWalkView;

    public XWalkLaunchScreenManager(Context context, XWalkViewInternal xwalkviewinternal)
    {
        mXWalkView = xwalkviewinternal;
        mLibContext = context;
        mActivity = mXWalkView.getActivity();
        mIntentFilterStr = (new StringBuilder()).append(mActivity.getPackageName()).append(".hideLaunchScreen").toString();
    }

    public static String getHideLaunchScreenFilterStr()
    {
        return mIntentFilterStr;
    }

    private RelativeLayout getLaunchScreenLayout(String s)
    {
        s = s.split(";");
        if (s.length < 1)
        {
            return parseImageBorder("");
        }
        int i = getScreenOrientation();
        mCurrentOrientation = i;
        if (s.length >= 2 && i == 2)
        {
            if (s[1].equals("empty"))
            {
                return parseImageBorder("");
            }
            if (s[1].isEmpty())
            {
                return parseImageBorder(s[0]);
            } else
            {
                return parseImageBorder(s[1]);
            }
        }
        if (s.length == 3 && i == 1)
        {
            if (s[2].equals("empty"))
            {
                return parseImageBorder("");
            }
            if (s[2].isEmpty())
            {
                return parseImageBorder(s[0]);
            } else
            {
                return parseImageBorder(s[2]);
            }
        } else
        {
            return parseImageBorder(s[0]);
        }
    }

    private int getStatusBarHeight()
    {
        int i = mActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (i > 0)
        {
            return mActivity.getResources().getDimensionPixelSize(i);
        } else
        {
            return 25;
        }
    }

    private ImageView getSubImageView(Bitmap bitmap, int i, int j, int k, int l, BorderModeType bordermodetype, int i1, 
            int j1)
    {
        if (bitmap == null)
        {
            return null;
        }
        if (k <= 0 || l <= 0)
        {
            return null;
        }
        if (!(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight())).contains(new Rect(i, j, i + k, j + l)))
        {
            return null;
        }
        Bitmap bitmap2 = Bitmap.createBitmap(bitmap, i, j, k, l);
        ImageView imageview = new ImageView(mActivity);
        Bitmap bitmap1 = bitmap2;
        bitmap = bordermodetype;
        if (bordermodetype == BorderModeType.ROUND)
        {
            l = bitmap2.getWidth();
            k = bitmap2.getHeight();
            j = l;
            i = k;
            if (i1 > 0)
            {
                j = getSuitableSize(i1, l);
            }
            if (j1 > 0)
            {
                i = getSuitableSize(j1, k);
            }
            bitmap1 = Bitmap.createScaledBitmap(bitmap2, j, i, true);
            bitmap = BorderModeType.REPEAT;
        }
        if (bitmap == BorderModeType.REPEAT)
        {
            bitmap = new BitmapDrawable(mActivity.getResources(), bitmap1);
            bitmap.setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
            imageview.setImageDrawable(bitmap);
            imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            return imageview;
        }
        if (bitmap == BorderModeType.STRETCH)
        {
            imageview.setImageBitmap(bitmap1);
            imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            return imageview;
        } else
        {
            imageview.setImageBitmap(bitmap1);
            return imageview;
        }
    }

    private int getSuitableSize(int i, int j)
    {
        int k = j;
        float f = j;
        do
        {
            int l;
label0:
            {
                l = k;
                if (j > 1)
                {
                    l = i % j;
                    if (l != 0)
                    {
                        break label0;
                    }
                    l = j;
                }
                return l;
            }
            float f1 = f;
            if ((float)l < f)
            {
                f1 = l;
                k = j;
            }
            j--;
            f = f1;
        } while (true);
    }

    private void hideLaunchScreenWhenReady()
    {
        if (mLaunchScreenDialog != null && mFirstFrameReceived) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (mReadyWhen == ReadyWhenType.FIRST_PAINT)
        {
            performHideLaunchScreen();
            return;
        }
        if (mReadyWhen == ReadyWhenType.USER_INTERACTIVE)
        {
            performHideLaunchScreen();
            return;
        }
        if (mReadyWhen != ReadyWhenType.COMPLETE)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!mPageLoadFinished) goto _L1; else goto _L3
_L3:
        performHideLaunchScreen();
        return;
        if (mReadyWhen != ReadyWhenType.CUSTOM || !mCustomHideLaunchScreen) goto _L1; else goto _L4
_L4:
        performHideLaunchScreen();
        return;
    }

    private RelativeLayout parseImageBorder(String s)
    {
        Object obj1;
        BorderModeType bordermodetype;
        Object obj2;
        ArrayList arraylist;
        int k;
        int l;
        int i1;
        int j1;
        k = 0;
        l = 0;
        j1 = 0;
        i1 = 0;
        bordermodetype = BorderModeType.STRETCH;
        obj1 = BorderModeType.STRETCH;
        String s1 = s;
        if (s.equals("empty"))
        {
            s1 = "";
        }
        s = s1.split(" ");
        obj2 = new ArrayList();
        arraylist = new ArrayList();
        int i = 0;
        while (i < s.length) 
        {
            String s2 = s[i];
            if (s2.endsWith("px"))
            {
                ((ArrayList) (obj2)).add(s2.replaceAll("px", ""));
            } else
            if (s2.equals("repeat"))
            {
                arraylist.add(BorderModeType.REPEAT);
            } else
            if (s2.equals("stretch"))
            {
                arraylist.add(BorderModeType.STRETCH);
            } else
            if (s2.equals("round"))
            {
                arraylist.add(BorderModeType.ROUND);
            }
            i++;
        }
        if (((ArrayList) (obj2)).size() != 1) goto _L2; else goto _L1
_L1:
        i1 = Integer.valueOf((String)((ArrayList) (obj2)).get(0)).intValue();
        int j;
        j = i1;
        l = i1;
        k = i1;
_L8:
        Object obj;
        s = mActivity.getResources().getDisplayMetrics();
        k = (int)TypedValue.applyDimension(1, k, s);
        l = (int)TypedValue.applyDimension(1, l, s);
        j = (int)TypedValue.applyDimension(1, j, s);
        i1 = (int)TypedValue.applyDimension(1, i1, s);
        if (arraylist.size() == 1)
        {
            obj = (BorderModeType)arraylist.get(0);
            s = ((String) (obj));
        } else
        {
            s = bordermodetype;
            obj = obj1;
            if (arraylist.size() == 2)
            {
                s = (BorderModeType)arraylist.get(0);
                obj = (BorderModeType)arraylist.get(1);
            }
        }
        j1 = mActivity.getResources().getIdentifier("launchscreen_img", "drawable", mActivity.getPackageName());
        if (j1 != 0) goto _L4; else goto _L3
_L3:
        s = null;
_L6:
        return s;
_L2:
        if (((ArrayList) (obj2)).size() != 2)
        {
            break MISSING_BLOCK_LABEL_375;
        }
        i1 = Integer.valueOf((String)((ArrayList) (obj2)).get(0)).intValue();
        k = i1;
        j = Integer.valueOf((String)((ArrayList) (obj2)).get(1)).intValue();
        l = j;
        continue; /* Loop/switch isn't completed */
        if (((ArrayList) (obj2)).size() != 3)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        j = Integer.valueOf((String)((ArrayList) (obj2)).get(1)).intValue();
        l = j;
        try
        {
            k = Integer.valueOf((String)((ArrayList) (obj2)).get(0)).intValue();
            i1 = Integer.valueOf((String)((ArrayList) (obj2)).get(2)).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            i1 = 0;
            j = 0;
            l = 0;
            k = 0;
        }
        continue; /* Loop/switch isn't completed */
        j = j1;
        if (((ArrayList) (obj2)).size() == 4)
        {
            k = Integer.valueOf((String)((ArrayList) (obj2)).get(0)).intValue();
            l = Integer.valueOf((String)((ArrayList) (obj2)).get(1)).intValue();
            j = Integer.valueOf((String)((ArrayList) (obj2)).get(2)).intValue();
            i1 = Integer.valueOf((String)((ArrayList) (obj2)).get(3)).intValue();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        Bitmap bitmap = BitmapFactory.decodeResource(mActivity.getResources(), j1);
        if (bitmap == null)
        {
            return null;
        }
        obj1 = new RelativeLayout(mActivity);
        ((RelativeLayout) (obj1)).setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        if (((ArrayList) (obj2)).size() == 0)
        {
            s = new ImageView(mActivity);
            s.setImageBitmap(bitmap);
            obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13, -1);
            ((RelativeLayout) (obj1)).addView(s, ((android.view.ViewGroup.LayoutParams) (obj)));
            return ((RelativeLayout) (obj1));
        }
        Object obj3 = mActivity.getWindowManager().getDefaultDisplay();
        obj2 = new Point();
        ((Display) (obj3)).getSize(((Point) (obj2)));
        if ((mActivity.getWindow().getAttributes().flags & 0x400) == 0)
        {
            obj2.y = ((Point) (obj2)).y - getStatusBarHeight();
        }
        obj3 = getSubImageView(bitmap, 0, 0, j, k, BorderModeType.NONE, 0, 0);
        if (obj3 != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams2.addRule(9, -1);
            layoutparams2.addRule(10, -1);
            ((RelativeLayout) (obj1)).addView(((View) (obj3)), layoutparams2);
        }
        obj3 = getSubImageView(bitmap, j, 0, bitmap.getWidth() - j - l, k, s, ((Point) (obj2)).x - j - l, 0);
        if (obj3 != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutparams3.addRule(10, -1);
            layoutparams3.addRule(14, -1);
            layoutparams3.leftMargin = j;
            layoutparams3.rightMargin = l;
            ((RelativeLayout) (obj1)).addView(((View) (obj3)), layoutparams3);
        }
        obj3 = getSubImageView(bitmap, bitmap.getWidth() - l, 0, l, k, BorderModeType.NONE, 0, 0);
        if (obj3 != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams4 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams4.addRule(11, -1);
            layoutparams4.addRule(10, -1);
            ((RelativeLayout) (obj1)).addView(((View) (obj3)), layoutparams4);
        }
        obj3 = getSubImageView(bitmap, 0, k, j, bitmap.getHeight() - k - i1, ((BorderModeType) (obj)), 0, ((Point) (obj2)).y - k - i1);
        if (obj3 != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams5 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
            layoutparams5.addRule(9, -1);
            layoutparams5.addRule(13, -1);
            layoutparams5.topMargin = k;
            layoutparams5.bottomMargin = i1;
            ((RelativeLayout) (obj1)).addView(((View) (obj3)), layoutparams5);
        }
        obj3 = getSubImageView(bitmap, j, k, bitmap.getWidth() - j - l, bitmap.getHeight() - k - i1, BorderModeType.NONE, 0, 0);
        if (obj3 != null)
        {
            ((ImageView) (obj3)).setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            android.widget.RelativeLayout.LayoutParams layoutparams6 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutparams6.leftMargin = j;
            layoutparams6.topMargin = k;
            layoutparams6.rightMargin = l;
            layoutparams6.bottomMargin = i1;
            ((RelativeLayout) (obj1)).addView(((View) (obj3)), layoutparams6);
        }
        obj = getSubImageView(bitmap, bitmap.getWidth() - l, k, l, bitmap.getHeight() - k - i1, ((BorderModeType) (obj)), 0, ((Point) (obj2)).y - k - i1);
        if (obj != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -1);
            layoutparams.addRule(13, -1);
            layoutparams.addRule(11, -1);
            layoutparams.topMargin = k;
            layoutparams.bottomMargin = i1;
            ((RelativeLayout) (obj1)).addView(((View) (obj)), layoutparams);
        }
        obj = getSubImageView(bitmap, 0, bitmap.getHeight() - i1, j, i1, BorderModeType.NONE, 0, 0);
        if (obj != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams1.addRule(9, -1);
            layoutparams1.addRule(12, -1);
            ((RelativeLayout) (obj1)).addView(((View) (obj)), layoutparams1);
        }
        s = getSubImageView(bitmap, j, bitmap.getHeight() - i1, bitmap.getWidth() - j - l, i1, s, ((Point) (obj2)).x - j - l, 0);
        if (s != null)
        {
            obj = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(14, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12, -1);
            obj.leftMargin = j;
            obj.rightMargin = l;
            ((RelativeLayout) (obj1)).addView(s, ((android.view.ViewGroup.LayoutParams) (obj)));
        }
        obj = getSubImageView(bitmap, bitmap.getWidth() - l, bitmap.getHeight() - i1, l, i1, BorderModeType.NONE, 0, 0);
        s = ((String) (obj1));
        if (obj == null) goto _L6; else goto _L5
_L5:
        s = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        s.addRule(11, -1);
        s.addRule(12, -1);
        ((RelativeLayout) (obj1)).addView(((View) (obj)), s);
        return ((RelativeLayout) (obj1));
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void performHideLaunchScreen()
    {
        mLaunchScreenDialog.dismiss();
        mLaunchScreenDialog = null;
        if (mReadyWhen == ReadyWhenType.CUSTOM)
        {
            mActivity.unregisterReceiver(mLaunchScreenReadyWhenReceiver);
        }
    }

    private void registerBroadcastReceiver()
    {
        IntentFilter intentfilter = new IntentFilter(mIntentFilterStr);
        mLaunchScreenReadyWhenReceiver = new BroadcastReceiver() {

            final XWalkLaunchScreenManager this$0;

            public void onReceive(Context context, Intent intent)
            {
                mCustomHideLaunchScreen = true;
                hideLaunchScreenWhenReady();
            }

            
            {
                this$0 = XWalkLaunchScreenManager.this;
                super();
            }
        };
        mActivity.registerReceiver(mLaunchScreenReadyWhenReceiver, intentfilter);
    }

    private void setReadyWhen(String s)
    {
        if (s.equals("first-paint"))
        {
            mReadyWhen = ReadyWhenType.FIRST_PAINT;
            return;
        }
        if (s.equals("user-interactive"))
        {
            mReadyWhen = ReadyWhenType.USER_INTERACTIVE;
            return;
        }
        if (s.equals("complete"))
        {
            mReadyWhen = ReadyWhenType.COMPLETE;
            return;
        }
        if (s.equals("custom"))
        {
            mReadyWhen = ReadyWhenType.CUSTOM;
            return;
        } else
        {
            mReadyWhen = ReadyWhenType.FIRST_PAINT;
            return;
        }
    }

    public void displayLaunchScreen(String s, final String imageBorderList)
    {
        if (mXWalkView == null)
        {
            return;
        } else
        {
            setReadyWhen(s);
            s = new Runnable() {

                final XWalkLaunchScreenManager this$0;
                final String val$imageBorderList;

                public void run()
                {
                    int i = mActivity.getResources().getIdentifier("launchscreen_bg", "drawable", mActivity.getPackageName());
                    Object obj;
                    if (i != 0)
                    {
                        if ((obj = mActivity.getResources().getDrawable(i)) != null)
                        {
                            mLaunchScreenDialog = new Dialog(mLibContext, 0x10300f0);
                            int j = mActivity.getWindow().getDecorView().getSystemUiVisibility();
                            android.view.WindowManager.LayoutParams layoutparams = mActivity.getWindow().getAttributes();
                            mLaunchScreenDialog.getWindow().getDecorView().setSystemUiVisibility(j);
                            mLaunchScreenDialog.getWindow().setAttributes(layoutparams);
                            mLaunchScreenDialog.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

                                final _cls1 this$1;

                                public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
                                {
                                    if (i == 4)
                                    {
                                        performHideLaunchScreen();
                                        mActivity.onBackPressed();
                                    }
                                    return true;
                                }

            
            {
                this$1 = _cls1.this;
                super();
            }
                            });
                            mLaunchScreenDialog.setOnShowListener(XWalkLaunchScreenManager.this);
                            mLaunchScreenDialog.setOnDismissListener(XWalkLaunchScreenManager.this);
                            mLaunchScreenDialog.getWindow().setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
                            obj = getLaunchScreenLayout(imageBorderList);
                            if (obj != null)
                            {
                                mLaunchScreenDialog.setContentView(((View) (obj)));
                            }
                            mLaunchScreenDialog.show();
                            mOrientationListener = new OrientationEventListener(mActivity, 3) {

                                final _cls1 this$1;

                                public void onOrientationChanged(int i)
                                {
                                    if (mLaunchScreenDialog != null && mLaunchScreenDialog.isShowing() && getScreenOrientation() != mCurrentOrientation)
                                    {
                                        RelativeLayout relativelayout = getLaunchScreenLayout(imageBorderList);
                                        if (relativelayout != null)
                                        {
                                            mLaunchScreenDialog.setContentView(relativelayout);
                                            return;
                                        }
                                    }
                                }

            
            {
                this$1 = _cls1.this;
                super(context, i);
            }
                            };
                            mOrientationListener.enable();
                            if (mReadyWhen == ReadyWhenType.CUSTOM)
                            {
                                registerBroadcastReceiver();
                                return;
                            }
                        }
                    }
                }

            
            {
                this$0 = XWalkLaunchScreenManager.this;
                imageBorderList = s;
                super();
            }
            };
            mActivity.runOnUiThread(s);
            return;
        }
    }

    public int getScreenOrientation()
    {
        Display display = mActivity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        return point.x >= point.y ? 2 : 1;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        mOrientationListener.disable();
        mOrientationListener = null;
    }

    public void onFirstFrameReceived()
    {
        mFirstFrameReceived = true;
        hideLaunchScreenWhenReady();
    }

    public void onPageFinished(String s)
    {
        mPageLoadFinished = true;
        hideLaunchScreenWhenReady();
    }

    public void onShow(DialogInterface dialoginterface)
    {
        mActivity.getWindow().setBackgroundDrawable(null);
        if (mFirstFrameReceived)
        {
            hideLaunchScreenWhenReady();
        }
    }





/*
    static Dialog access$102(XWalkLaunchScreenManager xwalklaunchscreenmanager, Dialog dialog)
    {
        xwalklaunchscreenmanager.mLaunchScreenDialog = dialog;
        return dialog;
    }

*/






/*
    static OrientationEventListener access$502(XWalkLaunchScreenManager xwalklaunchscreenmanager, OrientationEventListener orientationeventlistener)
    {
        xwalklaunchscreenmanager.mOrientationListener = orientationeventlistener;
        return orientationeventlistener;
    }

*/





/*
    static boolean access$902(XWalkLaunchScreenManager xwalklaunchscreenmanager, boolean flag)
    {
        xwalklaunchscreenmanager.mCustomHideLaunchScreen = flag;
        return flag;
    }

*/
}
