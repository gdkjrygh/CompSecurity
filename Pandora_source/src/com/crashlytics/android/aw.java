// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
import com.crashlytics.android.internal.ap;

// Referenced classes of package com.crashlytics.android:
//            ax, d, ab, ay, 
//            az, bb

final class aw
    implements Runnable
{

    final bb a;
    final d b;
    private Activity c;
    private ab d;
    private ap e;

    aw(d d1, Activity activity, bb bb, ab ab1, ap ap1)
    {
        b = d1;
        c = activity;
        a = bb;
        d = ab1;
        e = ap1;
        super();
    }

    public final void run()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(c);
        ax ax1 = new ax(this);
        float f = c.getResources().getDisplayMetrics().density;
        int i = com.crashlytics.android.d.a(b, f, 5);
        TextView textview = new TextView(c);
        textview.setAutoLinkMask(15);
        textview.setText(d.b());
        textview.setTextAppearance(c, 0x1030044);
        textview.setPadding(i, i, i, i);
        textview.setFocusable(false);
        ScrollView scrollview = new ScrollView(c);
        scrollview.setPadding(com.crashlytics.android.d.a(b, f, 14), com.crashlytics.android.d.a(b, f, 2), com.crashlytics.android.d.a(b, f, 10), com.crashlytics.android.d.a(b, f, 12));
        scrollview.addView(textview);
        builder.setView(scrollview).setTitle(d.a()).setCancelable(false).setNeutralButton(d.c(), ax1);
        if (e.d)
        {
            ay ay1 = new ay(this);
            builder.setNegativeButton(d.e(), ay1);
        }
        if (e.f)
        {
            az az1 = new az(this);
            builder.setPositiveButton(d.d(), az1);
        }
        builder.show();
    }
}
