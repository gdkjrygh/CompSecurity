// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.view.View;
import com.pandora.android.util.s;

public class bd
    implements android.support.v4.view.ViewPager.f
{
    private static class a
    {

        public View a;
        public View b;

        private a()
        {
        }

    }


    private float a;

    public bd()
    {
    }

    private float a(float f)
    {
        if (a == 0.0F)
        {
            a = 1.111111F;
        }
        if (f < 0.0F)
        {
            return a * f + 1.0F;
        } else
        {
            return a * -f + 1.0F;
        }
    }

    public void a(View view, float f)
    {
        a a2 = (a)view.getTag();
        a a1 = a2;
        if (a2 == null)
        {
            a1 = new a();
            a1.a = view.findViewById(0x7f1002de);
            a1.b = view.findViewById(0x7f1002dd);
        }
        f = a(f);
        if (a1.a != null && a1.b != null)
        {
            s.a(a1.a, f);
            s.a(a1.b, f);
        }
    }
}
