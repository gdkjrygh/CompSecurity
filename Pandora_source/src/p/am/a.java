// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.am;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

// Referenced classes of package p.am:
//            d, g, b, e, 
//            c

public class p.am.a
    implements d
{
    private static class a
        implements f.a
    {

        private final int a;

        public Animation a()
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setDuration(a);
            return alphaanimation;
        }

        a(int i)
        {
            a = i;
        }
    }


    private final g a;
    private final int b;
    private b c;
    private b d;

    public p.am.a()
    {
        this(300);
    }

    public p.am.a(int i)
    {
        this(new g(new a(i)), i);
    }

    p.am.a(g g1, int i)
    {
        a = g1;
        b = i;
    }

    private c a()
    {
        if (c == null)
        {
            c = new b(a.a(false, true), b);
        }
        return c;
    }

    private c b()
    {
        if (d == null)
        {
            d = new b(a.a(false, false), b);
        }
        return d;
    }

    public c a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            return e.b();
        }
        if (flag1)
        {
            return a();
        } else
        {
            return b();
        }
    }
}
