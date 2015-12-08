// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
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
import java.lang.reflect.Method;

// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib:
//            CustomViewBehind, CustomViewAbove, i, h, 
//            j, n, l

public class SlidingMenu extends RelativeLayout
{

    private static final String a = com/jeremyfeinstein/slidingmenu/lib/SlidingMenu.getSimpleName();
    private boolean b;
    private CustomViewAbove c;
    private CustomViewBehind d;
    private n e;
    private n f;
    private l g;

    public SlidingMenu(Activity activity, int l)
    {
        this(((Context) (activity)), ((AttributeSet) (null)));
        a(activity, l);
    }

    public SlidingMenu(Context context)
    {
        this(context, ((AttributeSet) (null)));
    }

    public SlidingMenu(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingMenu(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        b = false;
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        d = new CustomViewBehind(context);
        addView(d, layoutparams);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        c = new CustomViewAbove(context);
        addView(c, layoutparams);
        c.a(d);
        d.a(c);
        c.a(new i(this));
        attributeset = context.obtainStyledAttributes(attributeset, h.a);
        l = attributeset.getInt(h.g, 0);
        if (l != 0 && l != 1 && l != 2)
        {
            throw new IllegalStateException("SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT");
        }
        d.b(l);
        l = attributeset.getResourceId(h.n, -1);
        if (l != -1)
        {
            b(LayoutInflater.from(getContext()).inflate(l, null));
        } else
        {
            b(new FrameLayout(context));
        }
        l = attributeset.getResourceId(h.o, -1);
        if (l != -1)
        {
            a(LayoutInflater.from(getContext()).inflate(l, null));
        } else
        {
            a(new FrameLayout(context));
        }
        a(attributeset.getInt(h.l, 0));
        l = attributeset.getInt(h.m, 0);
        if (l != 1 && l != 0 && l != 2)
        {
            throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
        }
        d.e(l);
        l = (int)attributeset.getDimension(h.b, -1F);
        int i1 = (int)attributeset.getDimension(h.d, -1F);
        if (l != -1 && i1 != -1)
        {
            throw new IllegalStateException("Cannot set both behindOffset and behindWidth for a SlidingMenu");
        }
        float f1;
        if (l != -1)
        {
            b(l);
        } else
        if (i1 != -1)
        {
            context = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
            try
            {
                Point point = new Point();
                android/view/Display.getMethod("getSize", new Class[] {
                    android/graphics/Point
                }).invoke(context, new Object[] {
                    point
                });
                l = point.x;
            }
            catch (Exception exception)
            {
                l = context.getWidth();
            }
            b(l - i1);
        } else
        {
            b(0);
        }
        f1 = attributeset.getFloat(h.c, 0.33F);
        if (f1 < 0.0F && f1 > 1.0F)
        {
            throw new IllegalStateException("ScrollScale must be between 0 and 1");
        }
        d.a(f1);
        l = attributeset.getResourceId(h.j, -1);
        if (l != -1)
        {
            context = getContext().getResources().getDrawable(l);
            d.a(context);
        }
        c((int)attributeset.getDimension(h.k, 0.0F));
        boolean flag = attributeset.getBoolean(h.f, true);
        d.b(flag);
        a(attributeset.getFloat(h.e, 0.33F));
        attributeset.getBoolean(h.i, false);
        d.d();
        l = attributeset.getResourceId(h.h, -1);
        if (l != -1)
        {
            d.a(BitmapFactory.decodeResource(getResources(), l));
        }
        attributeset.recycle();
    }

    static n a(SlidingMenu slidingmenu)
    {
        return slidingmenu.e;
    }

    static l b(SlidingMenu slidingmenu)
    {
        return slidingmenu.g;
    }

    private void b(int l)
    {
        d.a(l);
    }

    private void b(View view)
    {
        c.a(view);
        b(true);
    }

    static n c(SlidingMenu slidingmenu)
    {
        return slidingmenu.f;
    }

    private void c(int l)
    {
        d.c(l);
    }

    static String k()
    {
        return a;
    }

    public final View a()
    {
        return c.b();
    }

    public final void a(float f1)
    {
        d.b(f1);
    }

    public final void a(int l)
    {
        if (l != 1 && l != 0 && l != 2)
        {
            throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
        } else
        {
            c.b(l);
            return;
        }
    }

    public final void a(Activity activity, int l)
    {
        int i1;
        if (l != 0 && l != 1)
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
        i1 = typedarray.getResourceId(0, 0);
        typedarray.recycle();
        l;
        JVM INSTR tableswitch 0 1: default 92
    //                   0 93
    //                   1 140;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        b = false;
        activity = (ViewGroup)activity.getWindow().getDecorView();
        ViewGroup viewgroup = (ViewGroup)activity.getChildAt(0);
        viewgroup.setBackgroundResource(i1);
        activity.removeView(viewgroup);
        activity.addView(this);
        b(viewgroup);
        return;
_L3:
        b = false;
        activity = (ViewGroup)activity.findViewById(0x1020002);
        View view = activity.getChildAt(0);
        activity.removeView(view);
        activity.addView(this);
        b(view);
        if (view.getBackground() == null)
        {
            view.setBackgroundResource(i1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(View view)
    {
        d.a(view);
    }

    public final void a(boolean flag)
    {
        c.a(0, flag);
    }

    public final View b()
    {
        return d.b();
    }

    public final void b(float f1)
    {
        byte byte0 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 11)
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
            if (byte0 != c.b().getLayerType())
            {
                getHandler().post(new j(this, byte0));
                return;
            }
        }
    }

    public final void b(boolean flag)
    {
        c.a(1, flag);
    }

    public final View c()
    {
        return d.c();
    }

    public final void d()
    {
        c.a(2, false);
    }

    public final void e()
    {
        b(true);
    }

    public final void f()
    {
        if (g())
        {
            b(true);
            return;
        } else
        {
            a(true);
            return;
        }
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        int l = rect.left;
        int i1 = rect.right;
        int j1 = rect.top;
        int k1 = rect.bottom;
        if (!b)
        {
            Log.v(a, "setting padding!");
            setPadding(l, j1, i1, k1);
        }
        return true;
    }

    public final boolean g()
    {
        return c.a() == 0 || c.a() == 2;
    }

    public final boolean h()
    {
        return c.a() == 2;
    }

    public final void i()
    {
        b((int)getContext().getResources().getDimension(0x7f070008));
    }

    public final void j()
    {
        c((int)getResources().getDimension(0x7f070009));
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        c.a(parcelable.a());
    }

    protected Parcelable onSaveInstanceState()
    {
        return new SavedState(super.onSaveInstanceState(), c.a());
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new p();
        private final int a;

        public final int a()
        {
            return a;
        }

        public void writeToParcel(Parcel parcel, int l)
        {
            super.writeToParcel(parcel, l);
            parcel.writeInt(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        public SavedState(Parcelable parcelable, int l)
        {
            super(parcelable);
            a = l;
        }
    }

}
