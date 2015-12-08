// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

// Referenced classes of package com.paypal.android.sdk:
//            dy, dz

public final class fa
{

    public TableLayout a;
    public TableLayout b;
    public TextView c;
    public TextView d;
    private int e;
    private boolean f;

    public fa(Context context, String s)
    {
        f = false;
        b = new TableLayout(context);
        b.setColumnShrinkable(0, false);
        b.setColumnStretchable(0, false);
        b.setColumnStretchable(1, false);
        b.setColumnShrinkable(1, false);
        TableRow tablerow = new TableRow(context);
        b.addView(tablerow);
        d = new TextView(context);
        d.setTextColor(dy.i);
        d.setText("Item");
        d.setSingleLine(true);
        d.setGravity(83);
        d.setTextSize(18F);
        d.setTextColor(dy.i);
        d.setTypeface(dy.q);
        tablerow.addView(d);
        dz.a(d, 16, 1.0F);
        e = dz.a("10dip", context);
        dz.b(d, null, null, "10dip", null);
        c = new TextView(context);
        c.setTextSize(18F);
        c.setTypeface(dy.r);
        c.setText(s);
        c.setSingleLine(true);
        c.setGravity(85);
        c.setTextColor(dy.j);
        tablerow.addView(c);
        dz.a(c, 5, 1.0F);
        a = b;
    }

    public final void a()
    {
        Object obj = c;
        TextView textview = d;
        float f1 = ((TextView) (obj)).getPaint().measureText(((TextView) (obj)).getText().toString());
        int i = b.getWidth() - (int)f1 - e;
        obj = TextUtils.ellipsize(textview.getText(), textview.getPaint(), i, android.text.TextUtils.TruncateAt.END);
        textview.setWidth(i);
        textview.setText(((CharSequence) (obj)));
    }
}
