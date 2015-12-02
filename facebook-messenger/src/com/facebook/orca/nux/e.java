// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.nux:
//            f

public abstract class e extends f
{

    boolean a;
    boolean b;
    final int c;

    public e(Context context)
    {
        super(context);
        c = 250;
        c();
    }

    public e(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 250;
        c();
    }

    public e(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        c = 250;
        c();
    }

    private void b()
    {
        setVisibility(0);
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(250L);
        alphaanimation.setFillAfter(true);
        alphaanimation.setFillEnabled(true);
        alphaanimation.setInterpolator(new LinearInterpolator());
        startAnimation(alphaanimation);
    }

    private void j()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(250L);
        alphaanimation.setInterpolator(new LinearInterpolator());
        alphaanimation.setAnimationListener(new com.facebook.orca.nux.f(this));
        startAnimation(alphaanimation);
    }

    protected abstract void a();

    protected void c()
    {
        a = false;
        setVisibility(8);
        setClickable(true);
    }

    protected void d()
    {
        if (b)
        {
            return;
        } else
        {
            a();
            b = true;
            return;
        }
    }

    protected boolean e()
    {
        return b;
    }

    void f()
    {
        d();
        if (!a)
        {
            clearAnimation();
            a = true;
            setVisibility(0);
        }
    }

    void g()
    {
        if (a)
        {
            clearAnimation();
            a = false;
            setVisibility(8);
        }
    }

    void h()
    {
        d();
        if (!a)
        {
            a = true;
            b();
        }
    }

    void i()
    {
        if (a)
        {
            a = false;
            j();
        }
    }
}
