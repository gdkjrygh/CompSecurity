// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, bu

public final class br
{

    private int a;
    private int b;
    private int c;
    private Interpolator d;
    private boolean e;
    private int f;

    static void a(br br1, RecyclerView recyclerview)
    {
        if (br1.e)
        {
            if (br1.d != null && br1.c <= 0)
            {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            if (br1.c <= 0)
            {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            if (br1.d == null)
            {
                if (br1.c == 0x80000000)
                {
                    RecyclerView.v(recyclerview).b(br1.a, br1.b);
                } else
                {
                    RecyclerView.v(recyclerview).a(br1.a, br1.b, br1.c);
                }
            } else
            {
                RecyclerView.v(recyclerview).a(br1.a, br1.b, br1.c, br1.d);
            }
            br1.f = br1.f + 1;
            if (br1.f > 10)
            {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            br1.e = false;
            return;
        } else
        {
            br1.f = 0;
            return;
        }
    }
}
