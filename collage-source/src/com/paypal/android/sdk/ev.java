// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.paypal.android.sdk:
//            dz, dy, fa, ek, 
//            eo

public final class ev
{

    public ViewGroup a;
    public Button b;
    public fa c;
    public TextView d;
    public TextView e;
    public TextView f;
    public ImageView g;
    public LinearLayout h;
    public eo i;
    public LinearLayout j;
    public Button k;
    public TextView l;
    public ImageView m;
    private LinearLayout n;

    public ev(Context context)
    {
        a = dz.a(context);
        n = dz.a(a);
        LinearLayout linearlayout = dz.b(n);
        l = new TextView(context);
        l.setText("Your Order");
        dz.a(l, "0dip", "0dip", "0dip", "14dip");
        l.setTextSize(24F);
        l.setTextColor(dy.a);
        linearlayout.addView(l, new android.view.ViewGroup.LayoutParams(-2, -2));
        c = new fa(context, "$0.00");
        linearlayout.addView(c.b);
        dz.a(c.b, null, "16dip");
        j = dz.a(context, true, 42044, linearlayout);
        Object obj = new ImageView(context);
        ((ImageView) (obj)).setImageBitmap(dz.c("iVBORw0KGgoAAAANSUhEUgAAAWIAAABkCAYAAAC8cjrTAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyRpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoTWFjaW50b3NoKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyNUE0Qzc5RUM1RkYxMUUzOURBQ0E3QTY0NjU3OUI5QiIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyNUE0Qzc5RkM1RkYxMUUzOURBQ0E3QTY0NjU3OUI5QiI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjI1QTRDNzlDQzVGRjExRTM5REFDQTdBNjQ2NTc5QjlCIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOjI1QTRDNzlEQzVGRjExRTM5REFDQTdBNjQ2NTc5QjlCIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+CLnO3gAAF9tJREFUeNrsXQm4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", context));
        ((ImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        ((ImageView) (obj)).setAdjustViewBounds(true);
        ((ImageView) (obj)).setContentDescription("PayPal");
        if (ek.a)
        {
            j.addView(((android.view.View) (obj)));
            dz.b(((android.view.View) (obj)), "4dip", "2.5dip", null, null);
            dz.a(((android.view.View) (obj)), -2, "28dip");
        }
        f = new TextView(context);
        dz.a(f);
        f.setText("Pay with");
        j.addView(f);
        if (!ek.a)
        {
            j.addView(((android.view.View) (obj)));
            dz.b(((android.view.View) (obj)), "4dip", "2.5dip", null, null);
            dz.a(((android.view.View) (obj)), -2, "28dip");
        }
        obj = new LinearLayout(context);
        ((LinearLayout) (obj)).setOrientation(1);
        linearlayout.addView(((android.view.View) (obj)), new android.widget.LinearLayout.LayoutParams(-1, -2));
        dz.b(((android.view.View) (obj)), null, null, null, "16dip");
        d = new TextView(context);
        d.setTextSize(14F);
        d.setTextColor(dy.l);
        d.setGravity(17);
        ((LinearLayout) (obj)).addView(d, new android.widget.LinearLayout.LayoutParams(-1, -2));
        dz.b(d, null, "8dip", null, "4dip");
        b = new Button(context);
        ((LinearLayout) (obj)).addView(b);
        dz.a(b);
        dz.a(b, -2, "24dip");
        dz.a(b, 17, 1.0F);
        h = dz.a(context, false, 42043, linearlayout);
        m = new ImageView(context);
        m.setAdjustViewBounds(true);
        m.setContentDescription("PayPal");
        m.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        m.setImageBitmap(dz.c("iVBORw0KGgoAAAANSUhEUgAAADcAAAAsCAYAAADByiAeAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAohJREFUeNrcWYGRgjAQJMwXQAl0IFbwWMFrBS8VvHYAFagVoBVIB2IFaAV8B08H/GUm/GA+CUouBL2ZTByEwCZ3m70LcRCsrusQutDBswranhBSOTYNgC1rM1ZA82yD+6nN2Urn21xNYAF0Jmf33Ro45DhDH9+1ObN3mMe84yVXTusd7ojjTds7iIzeoZtAU7mE1/E/5p536fj/yvbFb+VmDK2sn9c27b2RcKuVOs9vdJVnVN0QBsyHrjAQQ9RNMmhn5j5tC1g8zQ0A3AK4dbNqKbJ7nJjevIeYKN3HBpSOjy2h6DjznuxLQR4xpZvbYj4MX5+CO2S9aJvGCCEL+LnGEgBv2EEsWRXqIj4HJpeA3ML9FRq5IbhioEiHCsVz6V9s/H9WlwdiDHArSfycHpicpWSM0ia4UvJRRY+xlsiJcKwrnBPBtbSnLEt594b427O9cvisgL2cr6XobMobwbWdDXAitvvUTW8E5JTbAHcWXMOQUiHnHRcb4CrBXoYhBiYSjTooOH5GfSRB4I8BnI/xAV0eoTNxaOCUWfBjdh0DOFFsZAjgMkGtZnBCCTH3pIb2BewY2gDn8bkbU/q5xpgJ5t6pK7++BNcWHdUqmUV8GsQUj72irGD1KNvNHgQY8VJOIccGz+c8ybhxR9pyVOSCsW4+11S/asOZeMCIwWvdnyvuxygzJhgrh3pYiHiYqZ3P8XXI4t6SniTJ3WAWhjHBNUripKqNKNyQFoVXmB+DFXOqWDyw/tLEGItBCv6DpUkmTouSBlyJqOrHYlHjlocXA0Y9JGvAbSWpxrPajoaAy6mKVwBIDyHjG7ZkanyqKXxtu+IacEQ3bCmgZt8gixlhZdEBzK8AAwBIvuGtI5K/kgAAAABJRU5ErkJggg==", context));
        h.addView(m, new android.view.ViewGroup.LayoutParams(-2, (int)TypedValue.applyDimension(1, 22F, context.getResources().getDisplayMetrics())));
        dz.b(m, null, null, "6dip", "1dip");
        dz.a(m, -2, "22dip");
        m.setVisibility(8);
        g = new ImageView(context);
        g.setAdjustViewBounds(true);
        g.setContentDescription("PayPal");
        g.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        g.setVisibility(8);
        h.addView(g, new android.view.ViewGroup.LayoutParams(-2, (int)TypedValue.applyDimension(1, 22F, context.getResources().getDisplayMetrics())));
        dz.b(g, null, null, "4dip", null);
        dz.b(g, "36dip", "25dip");
        e = new TextView(context);
        dz.a(e);
        e.setText("Pay with Card");
        h.addView(e, new android.view.ViewGroup.LayoutParams(-2, -2));
        k = new Button(context);
        k.setId(42042);
        dz.a(k);
        linearlayout.addView(k);
        dz.b(k, null, null, null, "16dip");
        dz.a(k, -2, -2);
        dz.a(k, 17, 1.0F);
        i = new eo(context);
        linearlayout.addView(i.a);
        dz.a(i.a, -2, -2);
        dz.a(i.a, 17, 1.0F);
    }
}
