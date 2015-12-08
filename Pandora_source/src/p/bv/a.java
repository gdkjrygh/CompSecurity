// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bv;

import android.view.View;

// Referenced classes of package p.bv:
//            b

public class a
{

    public static void a(View view)
    {
        a(view, 500L);
    }

    public static void a(View view, long l)
    {
        if (view == null)
        {
            return;
        } else
        {
            view.startAnimation(p.bv.b.b(l, view));
            return;
        }
    }

    public static void b(View view)
    {
        b(view, 500L);
    }

    public static void b(View view, long l)
    {
        if (view == null)
        {
            return;
        } else
        {
            view.startAnimation(p.bv.b.a(l, view));
            return;
        }
    }
}
