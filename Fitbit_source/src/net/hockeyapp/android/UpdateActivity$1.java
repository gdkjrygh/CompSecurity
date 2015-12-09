// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.widget.TextView;
import net.hockeyapp.android.b.a;
import net.hockeyapp.android.c.d;
import net.hockeyapp.android.c.e;

// Referenced classes of package net.hockeyapp.android:
//            UpdateActivity

class c extends a
{

    final TextView a;
    final String b;
    final String c;
    final UpdateActivity d;

    public void a(d d1)
    {
        if (d1 instanceof e)
        {
            long l = ((e)d1).c();
            d1 = (new StringBuilder()).append(String.format("%.2f", new Object[] {
                Float.valueOf((float)l / 1048576F)
            })).append(" MB").toString();
            a.setText((new StringBuilder()).append(b).append("\n").append(c).append(" - ").append(d1).toString());
        }
    }

    (UpdateActivity updateactivity, TextView textview, String s, String s1)
    {
        d = updateactivity;
        a = textview;
        b = s;
        c = s1;
        super();
    }
}
