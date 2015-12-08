// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.res.Resources;

// Referenced classes of package bo.app:
//            iv, in, iq, km, 
//            jc

final class ix
    implements Runnable
{

    final int a;
    final Throwable b;
    final iv c;

    ix(iv iv1, int i, Throwable throwable)
    {
        c = iv1;
        a = i;
        b = throwable;
        super();
    }

    public final void run()
    {
        in in1 = c.d;
        boolean flag;
        if (in1.f != null || in1.c != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            km km1 = c.c;
            Object obj = c.d;
            Resources resources = c.a.a;
            if (((in) (obj)).c != 0)
            {
                obj = resources.getDrawable(((in) (obj)).c);
            } else
            {
                obj = ((in) (obj)).f;
            }
            km1.a(((android.graphics.drawable.Drawable) (obj)));
        }
        c.c.d();
        new jc(a, b);
    }
}
