// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            MaterialProgressDrawable

class a
    implements android.view.animation.
{

    final ng a;
    final MaterialProgressDrawable b;

    public void onAnimationEnd(Animation animation)
    {
    }

    public void onAnimationRepeat(Animation animation)
    {
        a.l();
        a.b();
        a.b(a.i());
        if (b.a)
        {
            b.a = false;
            animation.setDuration(1332L);
            a.a(false);
            return;
        } else
        {
            MaterialProgressDrawable.a(b, (MaterialProgressDrawable.a(b) + 1.0F) % 5F);
            return;
        }
    }

    public void onAnimationStart(Animation animation)
    {
        MaterialProgressDrawable.a(b, 0.0F);
    }

    ng(MaterialProgressDrawable materialprogressdrawable, ng ng)
    {
        b = materialprogressdrawable;
        a = ng;
        super();
    }
}
