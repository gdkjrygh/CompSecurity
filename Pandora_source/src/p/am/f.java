// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.am;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package p.am:
//            c

public class f
    implements c
{
    static interface a
    {

        public abstract Animation a();
    }


    private final a a;

    f(a a1)
    {
        a = a1;
    }

    public boolean a(Object obj, c.a a1)
    {
        obj = a1.d_();
        if (obj != null)
        {
            ((View) (obj)).clearAnimation();
            ((View) (obj)).startAnimation(a.a());
        }
        return false;
    }
}
