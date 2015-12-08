// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Timer;

// Referenced classes of package com.roidapp.photogrid.common:
//            ba, am

public final class al
{

    public static boolean a = false;
    private Activity b;
    private Handler c;
    private Timer d;
    private LinearLayout e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private boolean j;

    public al(Activity activity, Handler handler)
    {
        j = false;
        b = activity;
        c = handler;
        e = (LinearLayout)activity.findViewById(0x7f0d0198);
        e.setVisibility(0);
        f = (TextView)activity.findViewById(0x7f0d0199);
        g = (TextView)activity.findViewById(0x7f0d019a);
        h = (TextView)activity.findViewById(0x7f0d019b);
        i = (TextView)activity.findViewById(0x7f0d03a6);
    }

    static Handler a(al al1)
    {
        return al1.c;
    }

    private static float d()
    {
        return (float)Runtime.getRuntime().totalMemory() / 1024F / 1024F;
    }

    public final void a()
    {
        NumberFormat numberformat = NumberFormat.getInstance();
        numberformat.setMaximumFractionDigits(2);
        f.setText((new StringBuilder()).append(numberformat.format(d())).append("M   ").toString());
        g.setText((new StringBuilder()).append(numberformat.format(d() - (float)Runtime.getRuntime().freeMemory() / 1024F / 1024F)).append("M   ").toString());
        h.setText((new StringBuilder()).append(numberformat.format((float)Runtime.getRuntime().maxMemory() / 1024F / 1024F)).append("M   ").toString());
        if (!j && !ba.a().d)
        {
            TextView textview = i;
            StringBuilder stringbuilder = new StringBuilder();
            ba ba1 = ba.a();
            textview.setText(stringbuilder.append((float)(ba1.c - ba1.b) / 1000F).append("S").toString());
            j = true;
        }
    }

    public final void b()
    {
        d = new Timer();
        d.scheduleAtFixedRate(new am(this), 500L, 500L);
    }

    public final void c()
    {
        if (d != null)
        {
            d.cancel();
        }
    }

}
