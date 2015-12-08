// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import afS;
import agb;
import agc;
import android.widget.TextView;

// Referenced classes of package net.hockeyapp.android:
//            UpdateActivity

final class c extends afS
{

    private TextView a;
    private String b;
    private String c;

    public final void a(agb agb)
    {
        if (agb instanceof agc)
        {
            long l = ((agc)agb).d;
            agb = (new StringBuilder()).append(String.format("%.2f", new Object[] {
                Float.valueOf((float)l / 1048576F)
            })).append(" MB").toString();
            a.setText((new StringBuilder()).append(b).append("\n").append(c).append(" - ").append(agb).toString());
        }
    }

    (TextView textview, String s, String s1)
    {
        a = textview;
        b = s;
        c = s1;
        super();
    }
}
