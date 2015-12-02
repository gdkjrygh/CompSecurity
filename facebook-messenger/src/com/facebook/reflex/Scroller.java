// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


// Referenced classes of package com.facebook.reflex:
//            Widget, af, ai, ag, 
//            aj, ah

public class Scroller extends Widget
    implements af
{

    private Widget b;
    private ah c;
    private float d;
    private float e;

    public Scroller()
    {
        this(ai.Vertical, ag.Inertial);
    }

    public Scroller(ai ai1, ag ag1)
    {
        boolean flag1 = true;
        super();
        d = 0.0F;
        e = 0.0F;
        boolean flag;
        if (ai1 == ai.Horizontal)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ag1 != ag.Paginated)
        {
            flag1 = false;
        }
        a(initialize(flag, flag1));
    }

    private native void nativeSetChild(Widget widget);

    private native void nativeSetMaxFlingVelocity(float f);

    private native void nativeSetScrollPosition(float f);

    private native void nativeSetScrollableRegion(float f, float f1);

    private native void registerForScroll(boolean flag);

    public void a()
    {
        super.a();
        b.a();
    }

    public void a(float f)
    {
        nativeSetMaxFlingVelocity(f);
    }

    public void a(float f, float f1)
    {
        if (d != f || e != f1)
        {
            d = f;
            e = f1;
            nativeSetScrollableRegion(f, f1);
        }
    }

    public void a(Widget widget)
    {
        Widget widget1 = b;
        if (i() && widget != null)
        {
            widget.a();
        }
        b = widget;
        nativeSetChild(b);
        if (i() && widget1 != null)
        {
            widget1.b();
        }
    }

    public void a(ah ah1)
    {
        boolean flag1 = true;
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ah1 == null)
        {
            flag1 = false;
        }
        c = ah1;
        if (flag1 != flag)
        {
            registerForScroll(flag1);
        }
    }

    public void b()
    {
        super.b();
        b.b();
    }

    public float c()
    {
        return d;
    }

    public float d()
    {
        return e;
    }

    protected void didScroll(int i, float f, float f1)
    {
        if (c != null)
        {
            c.a(aj.convertFromOrdinal(i), f, f1);
        }
    }

    protected native int initialize(boolean flag, boolean flag1);
}
