// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package com.crashlytics.android:
//            x, Crashlytics, af, am, 
//            y, z, C

final class w
    implements Runnable
{

    final C a;
    final Crashlytics b;
    private Activity c;
    private af d;
    private am e;

    w(Crashlytics crashlytics, Activity activity, C c1, af af1, am am1)
    {
        b = crashlytics;
        c = activity;
        a = c1;
        d = af1;
        e = am1;
        super();
    }

    public final void run()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(c);
        x x1 = new x(this);
        float f = c.getResources().getDisplayMetrics().density;
        int i = Crashlytics.a(b, f, 5);
        TextView textview = new TextView(c);
        textview.setAutoLinkMask(15);
        textview.setText(d.b());
        textview.setTextAppearance(c, 0x1030044);
        textview.setPadding(i, i, i, i);
        textview.setFocusable(false);
        ScrollView scrollview = new ScrollView(c);
        scrollview.setPadding(Crashlytics.a(b, f, 14), Crashlytics.a(b, f, 2), Crashlytics.a(b, f, 10), Crashlytics.a(b, f, 12));
        scrollview.addView(textview);
        builder.setView(scrollview).setTitle(d.a()).setCancelable(false).setNeutralButton(d.c(), x1);
        if (e.e())
        {
            y y1 = new y(this);
            builder.setNegativeButton(d.e(), y1);
        }
        if (e.g())
        {
            z z1 = new z(this);
            builder.setPositiveButton(d.d(), z1);
        }
        builder.show();
    }
}
