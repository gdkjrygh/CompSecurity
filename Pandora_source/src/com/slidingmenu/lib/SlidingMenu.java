// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.slidingmenu.lib;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.slidingmenu.lib:
//            CustomViewBehind, CustomViewAbove

public class SlidingMenu extends RelativeLayout
{
    public static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i)
            {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };
        private final int a;

        public int a()
        {
            return a;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
        }


        public SavedState(Parcelable parcelable, int i)
        {
            super(parcelable);
            a = i;
        }
    }

    public static interface a
    {

        public abstract void a(Canvas canvas, float f1);
    }

    public static interface b
    {

        public abstract void a();
    }

    public static interface c
    {

        public abstract void a();
    }

    public static interface d
    {

        public abstract void a();
    }

    public static interface e
    {

        public abstract void a();
    }


    private boolean a;
    private CustomViewAbove b;
    private CustomViewBehind c;
    private d d;
    private b e;
    private int f;
    private Handler g;
    private boolean h;

    public SlidingMenu(Activity activity, int i)
    {
        this(((Context) (activity)), ((AttributeSet) (null)));
        a(activity, i);
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
        a = false;
        g = new Handler();
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        c = new CustomViewBehind(context);
        addView(c, layoutparams);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        b = new CustomViewAbove(context);
        addView(b, layoutparams);
        b.setCustomViewBehind(c);
        c.setCustomViewAbove(b);
        b.setOnPageChangeListener(new CustomViewAbove.a() {

            final SlidingMenu a;

            public void a(int k)
            {
                if ((k == 0 || k == 2) && SlidingMenu.a(a) != null)
                {
                    SlidingMenu.a(a).a();
                } else
                if (k == 1 && SlidingMenu.b(a) != null)
                {
                    SlidingMenu.b(a).a();
                    return;
                }
            }

            public void a(int k, float f1, int l)
            {
            }

            
            {
                a = SlidingMenu.this;
                super();
            }
        });
        attributeset = context.obtainStyledAttributes(attributeset, R.styleable.SlidingMenu);
        setMode(attributeset.getInt(R.styleable.SlidingMenu_mode, 0));
        i = attributeset.getResourceId(R.styleable.SlidingMenu_viewAbove, -1);
        int j;
        if (i != -1)
        {
            setContent(i);
        } else
        {
            setContent(new FrameLayout(context));
        }
        i = attributeset.getResourceId(R.styleable.SlidingMenu_viewBehind, -1);
        if (i != -1)
        {
            setMenu(i);
        } else
        {
            setMenu(new FrameLayout(context));
        }
        setTouchModeAbove(attributeset.getInt(R.styleable.SlidingMenu_touchModeAbove, 0));
        setTouchModeBehind(attributeset.getInt(R.styleable.SlidingMenu_touchModeBehind, 0));
        i = (int)attributeset.getDimension(R.styleable.SlidingMenu_behindOffset, -1F);
        j = (int)attributeset.getDimension(R.styleable.SlidingMenu_behindWidth, -1F);
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
        setBehindScrollScale(attributeset.getFloat(R.styleable.SlidingMenu_behindScrollScale, 0.33F));
        i = attributeset.getResourceId(R.styleable.SlidingMenu_shadowDrawable, -1);
        if (i != -1)
        {
            setShadowDrawable(i);
        }
        setShadowWidth((int)attributeset.getDimension(R.styleable.SlidingMenu_shadowWidth, 0.0F));
        setFadeEnabled(attributeset.getBoolean(R.styleable.SlidingMenu_fadeEnabled, true));
        setFadeDegree(attributeset.getFloat(R.styleable.SlidingMenu_fadeDegree, 0.33F));
        setSelectorEnabled(attributeset.getBoolean(R.styleable.SlidingMenu_selectorEnabled, false));
        i = attributeset.getResourceId(R.styleable.SlidingMenu_selectorDrawable, -1);
        if (i != -1)
        {
            setSelectorDrawable(i);
        }
        attributeset.recycle();
    }

    static d a(SlidingMenu slidingmenu)
    {
        return slidingmenu.d;
    }

    static b b(SlidingMenu slidingmenu)
    {
        return slidingmenu.e;
    }

    public void a()
    {
        c(true);
    }

    public void a(float f1)
    {
        byte byte0 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 11 && !h)
        {
            boolean flag;
            if (f1 > 0.0F && f1 < 1.0F)
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
                g.post(new Runnable(byte0) {

                    final int a;
                    final SlidingMenu b;

                    public void run()
                    {
                        StringBuilder stringbuilder = (new StringBuilder()).append("changing layerType. hardware? ");
                        boolean flag1;
                        if (a == 2)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        Log.v("SlidingMenu", stringbuilder.append(flag1).toString());
                        b.getContent().setLayerType(a, null);
                        b.getMenu().setLayerType(a, null);
                        if (b.getSecondaryMenu() != null)
                        {
                            b.getSecondaryMenu().setLayerType(a, null);
                        }
                    }

            
            {
                b = SlidingMenu.this;
                a = i;
                super();
            }
                });
                return;
            }
        }
    }

    public void a(Activity activity, int i)
    {
        a(activity, i, false);
    }

    public void a(Activity activity, int i, boolean flag)
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
        a = false;
        activity = (ViewGroup)activity.getWindow().getDecorView();
        ViewGroup viewgroup = (ViewGroup)activity.getChildAt(0);
        viewgroup.setBackgroundResource(j);
        activity.removeView(viewgroup);
        activity.addView(this);
        setContent(viewgroup);
        return;
_L3:
        a = flag;
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

    public void a(boolean flag)
    {
        b.a(0, flag);
    }

    public void b(boolean flag)
    {
        b.a(2, flag);
    }

    public boolean b()
    {
        return b.getCurrentItem() == 0 || b.getCurrentItem() == 2;
    }

    public void c(boolean flag)
    {
        b.a(1, flag);
    }

    public boolean c()
    {
        return b.getCurrentItem() == 2;
    }

    public void d(boolean flag)
    {
        if (b())
        {
            c(flag);
            return;
        } else
        {
            a(flag);
            return;
        }
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        int i = rect.left;
        int j = rect.right;
        int k = rect.top;
        int l = rect.bottom;
        if (!a)
        {
            Log.v("SlidingMenu", "setting padding!");
            setPadding(i, k, j, l);
        }
        return true;
    }

    public int getBehindOffset()
    {
        return ((android.widget.RelativeLayout.LayoutParams)c.getLayoutParams()).rightMargin;
    }

    public float getBehindScrollScale()
    {
        return c.getScrollScale();
    }

    public View getContent()
    {
        return b.getContent();
    }

    public View getMenu()
    {
        return c.getContent();
    }

    public int getMode()
    {
        return c.getMode();
    }

    public View getSecondaryMenu()
    {
        return c.getSecondaryContent();
    }

    public int getTouchModeAbove()
    {
        return b.getTouchMode();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        setBehindWidth(f);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        b.setCurrentItem(parcelable.a());
    }

    protected Parcelable onSaveInstanceState()
    {
        return new SavedState(super.onSaveInstanceState(), b.getCurrentItem());
    }

    public void setAboveOffset(int i)
    {
        b.setAboveOffset(i);
    }

    public void setAboveOffsetRes(int i)
    {
        setAboveOffset((int)getContext().getResources().getDimension(i));
    }

    public void setBehindCanvasTransformer(a a1)
    {
        c.setCanvasTransformer(a1);
    }

    public void setBehindOffset(int i)
    {
        c.setWidthOffset(i);
    }

    public void setBehindOffsetRes(int i)
    {
        setBehindOffset((int)getContext().getResources().getDimension(i));
    }

    public void setBehindScrollScale(float f1)
    {
        if (f1 < 0.0F && f1 > 1.0F)
        {
            throw new IllegalStateException("ScrollScale must be between 0 and 1");
        } else
        {
            c.setScrollScale(f1);
            return;
        }
    }

    public void setBehindWidth(int i)
    {
        f = i;
        setBehindOffset(getMeasuredWidth() - f);
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
        b.setContent(view);
        a();
    }

    public void setFadeDegree(float f1)
    {
        c.setFadeDegree(f1);
    }

    public void setFadeEnabled(boolean flag)
    {
        c.setFadeEnabled(flag);
    }

    public void setIgnoreManageLayers(boolean flag)
    {
        h = flag;
    }

    public void setIgnoreQuickReturn(boolean flag)
    {
        if (b != null)
        {
            b.setIgnoreQuickReturn(flag);
        }
    }

    public void setMenu(int i)
    {
        setMenu(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public void setMenu(View view)
    {
        c.setContent(view);
    }

    public void setMode(int i)
    {
        if (i != 0 && i != 1 && i != 2)
        {
            throw new IllegalStateException("SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT");
        } else
        {
            c.setMode(i);
            return;
        }
    }

    public void setOnCloseListener(b b1)
    {
        e = b1;
    }

    public void setOnClosedListener(c c1)
    {
        b.setOnClosedListener(c1);
    }

    public void setOnOpenListener(d d1)
    {
        d = d1;
    }

    public void setOnOpenedListener(e e1)
    {
        b.setOnOpenedListener(e1);
    }

    public void setSecondaryMenu(int i)
    {
        setSecondaryMenu(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public void setSecondaryMenu(View view)
    {
        c.setSecondaryContent(view);
    }

    public void setSecondaryShadowDrawable(int i)
    {
        setSecondaryShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public void setSecondaryShadowDrawable(Drawable drawable)
    {
        c.setSecondaryShadowDrawable(drawable);
    }

    public void setSelectedView(View view)
    {
        c.setSelectedView(view);
    }

    public void setSelectorBitmap(Bitmap bitmap)
    {
        c.setSelectorBitmap(bitmap);
    }

    public void setSelectorDrawable(int i)
    {
        c.setSelectorBitmap(BitmapFactory.decodeResource(getResources(), i));
    }

    public void setSelectorEnabled(boolean flag)
    {
        c.setSelectorEnabled(true);
    }

    public void setShadowDrawable(int i)
    {
        setShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public void setShadowDrawable(Drawable drawable)
    {
        c.setShadowDrawable(drawable);
    }

    public void setShadowWidth(int i)
    {
        c.setShadowWidth(i);
    }

    public void setShadowWidthRes(int i)
    {
        setShadowWidth((int)getResources().getDimension(i));
    }

    public void setSlidingEnabled(boolean flag)
    {
        b.setSlidingEnabled(flag);
    }

    public void setStatic(boolean flag)
    {
        if (flag)
        {
            setSlidingEnabled(false);
            b.setCustomViewBehind(null);
            b.setCurrentItem(1);
            return;
        } else
        {
            b.setCurrentItem(1);
            b.setCustomViewBehind(c);
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
            b.setTouchMode(i);
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
            c.setTouchMode(i);
            return;
        }
    }
}
