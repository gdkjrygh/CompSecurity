// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package com.b.a.c:
//            p, h, at, q, 
//            r, t

final class o
    implements Runnable
{

    final Activity a;
    final t b;
    final at c;
    final a.a.a.a.a.g.o d;
    final h e;

    o(h h1, Activity activity, t t, at at1, a.a.a.a.a.g.o o1)
    {
        e = h1;
        a = activity;
        b = t;
        c = at1;
        d = o1;
        super();
    }

    public final void run()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        p p1 = new p(this);
        float f = a.getResources().getDisplayMetrics().density;
        int i = h.a(f, 5);
        TextView textview = new TextView(a);
        textview.setAutoLinkMask(15);
        textview.setText(c.b());
        textview.setTextAppearance(a, 0x1030044);
        textview.setPadding(i, i, i, i);
        textview.setFocusable(false);
        ScrollView scrollview = new ScrollView(a);
        scrollview.setPadding(h.a(f, 14), h.a(f, 2), h.a(f, 10), h.a(f, 12));
        scrollview.addView(textview);
        builder.setView(scrollview).setTitle(c.a()).setCancelable(false).setNeutralButton(c.c(), p1);
        if (d.d)
        {
            q q1 = new q(this);
            builder.setNegativeButton(c.e(), q1);
        }
        if (d.f)
        {
            r r1 = new r(this);
            builder.setPositiveButton(c.d(), r1);
        }
        builder.show();
    }
}
