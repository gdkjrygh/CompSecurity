// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
import b.a.a.a.a.g.o;

// Referenced classes of package com.a.a.c:
//            o, g, ap, p, 
//            q

final class n
    implements Runnable
{

    final Activity a;
    final g.a b;
    final ap c;
    final o d;
    final g e;

    n(g g1, Activity activity, g.a a1, ap ap1, o o1)
    {
        e = g1;
        a = activity;
        b = a1;
        c = ap1;
        d = o1;
        super();
    }

    public final void run()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        com.a.a.c.o o1 = new com.a.a.c.o(this);
        float f = a.getResources().getDisplayMetrics().density;
        int i = g.a(f, 5);
        TextView textview = new TextView(a);
        textview.setAutoLinkMask(15);
        textview.setText(c.b());
        textview.setTextAppearance(a, 0x1030044);
        textview.setPadding(i, i, i, i);
        textview.setFocusable(false);
        ScrollView scrollview = new ScrollView(a);
        scrollview.setPadding(g.a(f, 14), g.a(f, 2), g.a(f, 10), g.a(f, 12));
        scrollview.addView(textview);
        builder.setView(scrollview).setTitle(c.a()).setCancelable(false).setNeutralButton(c.c(), o1);
        if (d.d)
        {
            p p1 = new p(this);
            builder.setNegativeButton(c.e(), p1);
        }
        if (d.f)
        {
            q q1 = new q(this);
            builder.setPositiveButton(c.d(), q1);
        }
        builder.show();
    }
}
