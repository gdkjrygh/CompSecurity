// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.jeremyfeinstein.slidingmenu.lib.view.CustomViewAbove;
import com.jeremyfeinstein.slidingmenu.lib.view.CustomViewBehind;
import java.lang.reflect.Method;

public class SlidingMenu extends RelativeLayout
{
    public static interface OnClosedListener
    {

        public abstract void onClosed();
    }

    public static interface OnOpenListener
    {

        public abstract void onOpen();
    }


    public static final int LEFT = 0;
    public static final int LEFT_RIGHT = 2;
    public static final int RIGHT = 1;
    public static final int SLIDING_CONTENT = 1;
    public static final int SLIDING_WINDOW = 0;
    private static final String TAG = com/jeremyfeinstein/slidingmenu/lib/app/SlidingMenu.getSimpleName();
    public static final int TOUCHMODE_FULLSCREEN = 1;
    public static final int TOUCHMODE_MARGIN = 0;
    public static final int TOUCHMODE_NONE = 2;
    private boolean mActionbarOverlay;
    private OnCloseListener mCloseListener;
    private OnOpenListener mOpenListener;
    private OnOpenListener mSecondaryOpenListner;
    private CustomViewAbove mViewAbove;
    private CustomViewBehind mViewBehind;

    public SlidingMenu(Activity activity, int i)
    {
        this(((Context) (activity)), ((AttributeSet) (null)));
        attachToActivity(activity, i);
    }

    public SlidingMenu(Context context)
    {
        this(context, ((AttributeSet) (null)));
    }

    public SlidingMenu(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingMenu(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mActionbarOverlay = false;
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        mViewBehind = new CustomViewBehind(context);
        addView(mViewBehind, layoutparams);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        mViewAbove = new CustomViewAbove(context);
        addView(mViewAbove, layoutparams);
        mViewAbove.setCustomViewBehind(mViewBehind);
        mViewBehind.setCustomViewAbove(mViewAbove);
        mViewAbove.setOnPageChangeListener(new _cls1());
        attributeset = context.obtainStyledAttributes(attributeset, com.jeremyfeinstein.slidingmenu.lib.R.styleable.SlidingMenu);
        setMode(attributeset.getInt(0, 0));
        i = attributeset.getResourceId(1, -1);
        int j;
        if (i != -1)
        {
            setContent(i);
        } else
        {
            setContent(new FrameLayout(context));
        }
        i = attributeset.getResourceId(2, -1);
        if (i != -1)
        {
            setMenu(i);
        } else
        {
            setMenu(new FrameLayout(context));
        }
        setTouchModeAbove(attributeset.getInt(8, 0));
        setTouchModeBehind(attributeset.getInt(9, 0));
        i = (int)attributeset.getDimension(5, -1F);
        j = (int)attributeset.getDimension(6, -1F);
        if (i != -1 && j != -1)
        {
            throw new IllegalStateException("Cannot set both behindOffset and behindWidth for a SlidingMenu");
        }
        if (i != -1)
        {
            setBehindOffset(i);
        } else
        if (j != -1)
        {
            setBehindWidth(j);
        } else
        {
            setBehindOffset(0);
        }
        setBehindScrollScale(attributeset.getFloat(7, 0.33F));
        i = attributeset.getResourceId(10, -1);
        if (i != -1)
        {
            setShadowDrawable(i);
        }
        setShadowWidth((int)attributeset.getDimension(11, 0.0F));
        setFadeEnabled(attributeset.getBoolean(16, true));
        setFadeDegree(attributeset.getFloat(17, 0.33F));
        setSelectorEnabled(attributeset.getBoolean(14, false));
        i = attributeset.getResourceId(15, -1);
        if (i != -1)
        {
            setSelectorDrawable(i);
        }
        attributeset.recycle();
    }

    public void addIgnoredView(View view)
    {
        mViewAbove.addIgnoredView(view);
    }

    public void attachToActivity(Activity activity, int i)
    {
        attachToActivity(activity, i, false);
    }

    public void attachToActivity(Activity activity, int i, boolean flag)
    {
        int j;
        if (i != 0 && i != 1)
        {
            throw new IllegalArgumentException("slideStyle must be either SLIDING_WINDOW or SLIDING_CONTENT");
        }
        if (getParent() != null)
        {
            throw new IllegalStateException("This SlidingMenu appears to already be attached");
        }
        TypedArray typedarray = activity.getTheme().obtainStyledAttributes(new int[] {
            0x1010054
        });
        j = typedarray.getResourceId(0, 0);
        typedarray.recycle();
        i;
        JVM INSTR tableswitch 0 1: default 92
    //                   0 93
    //                   1 144;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        mActionbarOverlay = false;
        activity = (ViewGroup)activity.getWindow().getDecorView();
        ViewGroup viewgroup = (ViewGroup)activity.getChildAt(0);
        viewgroup.setBackgroundResource(j);
        activity.removeView(viewgroup);
        activity.addView(this);
        setContent(viewgroup);
        return;
_L3:
        mActionbarOverlay = flag;
        activity = (ViewGroup)activity.findViewById(0x1020002);
        View view = activity.getChildAt(0);
        activity.removeView(view);
        activity.addView(this);
        setContent(view);
        if (view.getBackground() == null)
        {
            view.setBackgroundResource(j);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void clearIgnoredViews()
    {
        mViewAbove.clearIgnoredViews();
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        int i = rect.left;
        int j = rect.right;
        int k = rect.top;
        int l = rect.bottom;
        if (!mActionbarOverlay)
        {
            Log.v(TAG, "setting padding!");
            setPadding(i, k, j, l);
        }
        return true;
    }

    public int getBehindOffset()
    {
        return ((android.widget.RelativeLayout.LayoutParams)mViewBehind.getLayoutParams()).rightMargin;
    }

    public float getBehindScrollScale()
    {
        return mViewBehind.getScrollScale();
    }

    public View getContent()
    {
        return mViewAbove.getContent();
    }

    public View getMenu()
    {
        return mViewBehind.getContent();
    }

    public int getMode()
    {
        return mViewBehind.getMode();
    }

    public View getSecondaryMenu()
    {
        return mViewBehind.getSecondaryContent();
    }

    public int getTouchModeAbove()
    {
        return mViewAbove.getTouchMode();
    }

    public int getTouchmodeMarginThreshold()
    {
        return mViewBehind.getMarginThreshold();
    }

    public boolean isMenuShowing()
    {
        return mViewAbove.getCurrentItem() == 0 || mViewAbove.getCurrentItem() == 2;
    }

    public boolean isSecondaryMenuShowing()
    {
        return mViewAbove.getCurrentItem() == 2;
    }

    public boolean isSlidingEnabled()
    {
        return mViewAbove.isSlidingEnabled();
    }

    public void manageLayers(float f)
    {
        byte byte0 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            boolean flag;
            if (f > 0.0F && f < 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                byte0 = 2;
            }
            if (byte0 != getContent().getLayerType())
            {
                getHandler().post(new _cls2(byte0));
                return;
            }
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
    /* block-local class not found */
    class SavedState {}

        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        mViewAbove.setCurrentItem(parcelable.getItem());
    }

    protected Parcelable onSaveInstanceState()
    {
        return new SavedState(super.onSaveInstanceState(), mViewAbove.getCurrentItem());
    }

    public void removeIgnoredView(View view)
    {
        mViewAbove.removeIgnoredView(view);
    }

    public void setAboveOffset(int i)
    {
        mViewAbove.setAboveOffset(i);
    }

    public void setAboveOffsetRes(int i)
    {
        setAboveOffset((int)getContext().getResources().getDimension(i));
    }

    public void setBehindCanvasTransformer(CanvasTransformer canvastransformer)
    {
        mViewBehind.setCanvasTransformer(canvastransformer);
    }

    public void setBehindOffset(int i)
    {
        mViewBehind.setWidthOffset(i);
    }

    public void setBehindOffsetRes(int i)
    {
        setBehindOffset((int)getContext().getResources().getDimension(i));
    }

    public void setBehindScrollScale(float f)
    {
        if (f < 0.0F && f > 1.0F)
        {
            throw new IllegalStateException("ScrollScale must be between 0 and 1");
        } else
        {
            mViewBehind.setScrollScale(f);
            return;
        }
    }

    public void setBehindWidth(int i)
    {
        Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        int j;
        try
        {
            Point point = new Point();
            android/view/Display.getMethod("getSize", new Class[] {
                android/graphics/Point
            }).invoke(display, new Object[] {
                point
            });
            j = point.x;
        }
        catch (Exception exception)
        {
            j = display.getWidth();
        }
        setBehindOffset(j - i);
    }

    public void setBehindWidthRes(int i)
    {
        setBehindWidth((int)getContext().getResources().getDimension(i));
    }

    public void setContent(int i)
    {
        setContent(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public void setContent(View view)
    {
        mViewAbove.setContent(view);
        showContent();
    }

    public void setFadeDegree(float f)
    {
        mViewBehind.setFadeDegree(f);
    }

    public void setFadeEnabled(boolean flag)
    {
        mViewBehind.setFadeEnabled(flag);
    }

    public void setMenu(int i)
    {
        setMenu(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public void setMenu(View view)
    {
        mViewBehind.setContent(view);
    }

    public void setMode(int i)
    {
        if (i != 0 && i != 1 && i != 2)
        {
            throw new IllegalStateException("SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT");
        } else
        {
            mViewBehind.setMode(i);
            return;
        }
    }

    public void setOnCloseListener(OnCloseListener oncloselistener)
    {
        mCloseListener = oncloselistener;
    }

    public void setOnClosedListener(OnClosedListener onclosedlistener)
    {
        mViewAbove.setOnClosedListener(onclosedlistener);
    }

    public void setOnOpenListener(OnOpenListener onopenlistener)
    {
        mOpenListener = onopenlistener;
    }

    public void setOnOpenedListener(OnOpenedListener onopenedlistener)
    {
        mViewAbove.setOnOpenedListener(onopenedlistener);
    }

    public void setSecondaryMenu(int i)
    {
        setSecondaryMenu(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public void setSecondaryMenu(View view)
    {
        mViewBehind.setSecondaryContent(view);
    }

    public void setSecondaryOnOpenListner(OnOpenListener onopenlistener)
    {
        mSecondaryOpenListner = onopenlistener;
    }

    public void setSecondaryShadowDrawable(int i)
    {
        setSecondaryShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public void setSecondaryShadowDrawable(Drawable drawable)
    {
        mViewBehind.setSecondaryShadowDrawable(drawable);
    }

    public void setSelectedView(View view)
    {
        mViewBehind.setSelectedView(view);
    }

    public void setSelectorBitmap(Bitmap bitmap)
    {
        mViewBehind.setSelectorBitmap(bitmap);
    }

    public void setSelectorDrawable(int i)
    {
        mViewBehind.setSelectorBitmap(BitmapFactory.decodeResource(getResources(), i));
    }

    public void setSelectorEnabled(boolean flag)
    {
        mViewBehind.setSelectorEnabled(true);
    }

    public void setShadowDrawable(int i)
    {
        setShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public void setShadowDrawable(Drawable drawable)
    {
        mViewBehind.setShadowDrawable(drawable);
    }

    public void setShadowWidth(int i)
    {
        mViewBehind.setShadowWidth(i);
    }

    public void setShadowWidthRes(int i)
    {
        setShadowWidth((int)getResources().getDimension(i));
    }

    public void setSlidingEnabled(boolean flag)
    {
        mViewAbove.setSlidingEnabled(flag);
    }

    public void setStatic(boolean flag)
    {
        if (flag)
        {
            setSlidingEnabled(false);
            mViewAbove.setCustomViewBehind(null);
            mViewAbove.setCurrentItem(1);
            return;
        } else
        {
            mViewAbove.setCurrentItem(1);
            mViewAbove.setCustomViewBehind(mViewBehind);
            setSlidingEnabled(true);
            return;
        }
    }

    public void setTouchModeAbove(int i)
    {
        if (i != 1 && i != 0 && i != 2)
        {
            throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
        } else
        {
            mViewAbove.setTouchMode(i);
            return;
        }
    }

    public void setTouchModeBehind(int i)
    {
        if (i != 1 && i != 0 && i != 2)
        {
            throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
        } else
        {
            mViewBehind.setTouchMode(i);
            return;
        }
    }

    public void setTouchmodeMarginThreshold(int i)
    {
        mViewBehind.setMarginThreshold(i);
    }

    public void showContent()
    {
        showContent(true);
    }

    public void showContent(boolean flag)
    {
        mViewAbove.setCurrentItem(1, flag);
    }

    public void showMenu()
    {
        showMenu(true);
    }

    public void showMenu(boolean flag)
    {
        mViewAbove.setCurrentItem(0, flag);
    }

    public void showSecondaryMenu()
    {
        showSecondaryMenu(true);
    }

    public void showSecondaryMenu(boolean flag)
    {
        mViewAbove.setCurrentItem(2, flag);
    }

    public void toggle()
    {
        toggle(true);
    }

    public void toggle(boolean flag)
    {
        if (isMenuShowing())
        {
            showContent(flag);
            return;
        } else
        {
            showMenu(flag);
            return;
        }
    }






    // Unreferenced inner class com/jeremyfeinstein/slidingmenu/lib/app/SlidingMenu$CanvasTransformer
    /* block-local class not found */
    class CanvasTransformer {}


    // Unreferenced inner class com/jeremyfeinstein/slidingmenu/lib/app/SlidingMenu$OnCloseListener
    /* block-local class not found */
    class OnCloseListener {}


    // Unreferenced inner class com/jeremyfeinstein/slidingmenu/lib/app/SlidingMenu$OnOpenedListener
    /* block-local class not found */
    class OnOpenedListener {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
