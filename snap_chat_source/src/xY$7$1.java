// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;

final class ng.Object
    implements Runnable
{

    private float a;
    private int b;
    private b c;

    public final void run()
    {
        xY.a(c.c, a, b);
        xY.a(c.c, b);
    }

    ct(ct ct, float f, int i)
    {
        c = ct;
        a = f;
        b = i;
        super();
    }

    // Unreferenced inner class xY$7

/* anonymous class */
    final class xY._cls7
        implements android.view.View.OnClickListener
    {

        final xY a;

        public final void onClick(View view)
        {
            a.b.putBoolean("saved_state_keyboard_shown", xY.l(a));
            xY.m(a);
            float f;
            char c1;
            if (xY.l(a) || xY.n(a).getVisibility() == 0)
            {
                xY.m(a);
                f = (float)xY.o(a) - xY.p(a);
                c1 = '\u0190';
            } else
            {
                c1 = '\u012C';
                f = -xY.p(a);
            }
            xY.d(a).postDelayed(new xY._cls7._cls1(this, f, c1), 100L);
        }

            
            {
                a = xy;
                super();
            }
    }

}
