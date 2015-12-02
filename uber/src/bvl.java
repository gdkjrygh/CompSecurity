// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public final class bvl
{

    public LinearLayout a;
    public RelativeLayout b;
    public final Button c;
    private final TableLayout d;
    private ImageView e;
    private TextView f;
    private TextView g;

    public bvl(Context context)
    {
        a = new LinearLayout(context);
        a.setLayoutParams(bum.a());
        a.setOrientation(1);
        bum.a(a);
        d = new TableLayout(context);
        d.setColumnShrinkable(0, false);
        d.setColumnStretchable(0, false);
        d.setColumnStretchable(1, false);
        d.setColumnShrinkable(1, false);
        TableRow tablerow = new TableRow(context);
        d.addView(tablerow);
        a.addView(d);
        b = new RelativeLayout(context);
        tablerow.addView(b);
        bum.a(b, 19, 1.0F);
        bum.b(b, null, null, "10dip", null);
        g = new TextView(context);
        bum.c(g, 0);
        g.setId(2301);
        b.addView(g);
        bum.b(g, "6dip", null, null, null);
        f = new TextView(context);
        bum.b(f, 0);
        f.setId(2302);
        android.widget.RelativeLayout.LayoutParams layoutparams = bum.a(3, 2301);
        b.addView(f, layoutparams);
        bum.b(f, "6dip", null, null, null);
        e = bum.a(context, "iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAATZJREFUeNrsmMENgkAQRVnPUoAWQB0WoAVoAViA3tW7FEADUIDebUAaoAELwDv+TcaEkFUOsDhj5ieTTdgQ5jHLZ3aDQKVSqVSqAVTX9Q4RSUw8RKSIO+KGmI/5fNMzeZvsGdF88yVia4ypxgCY9Lx/ipi1rkUExb8CVIXFh4SvqMKRPQBBrDAcHFMJIHL2AG8XwrB2TJ0AcWEPQBB2ySwdUxtAlBIAQgxpy5WsKnKmkjVAAyJzuJMXezU+ykp/ZFuJsA0BgA17gAZE5ttevQF02GsOiIQ9AEHEGGJf9uodoMNe7UddsAcgiMyHvU4C4dIl9NcfsWgbFf0jE91KiG7mxLfTojc0oreUojf1oo9VvthlgeS3Y7QpfZu5J+LhsMu9mG7w14e7Q4LIPF5XqVQqlWi9BBgAacm2vqgEoPIAAAAASUVORK5CYII=", "go to selection");
        e.setId(2307);
        e.setColorFilter(bul.g);
        layoutparams = bum.a(context, "20dip", "20dip", 15);
        layoutparams.addRule(1, 2302);
        layoutparams.addRule(1, 2301);
        b.addView(e, layoutparams);
        c = new Button(context);
        c.setId(2305);
        bum.a(c, 21);
        c.setTextSize(18F);
        tablerow.addView(c);
        bum.b(c, null, null, "6dip", null);
        bum.a(c, 21, 1.0F);
        bum.a(a);
        a.setVisibility(0);
    }

    public final void a(String s)
    {
        f.setText(s);
        bum.a(f, -2, -1);
        f.setEllipsize(android.text.TextUtils.TruncateAt.START);
    }

    public final void a(boolean flag)
    {
        b.setClickable(flag);
        ImageView imageview = e;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
    }

    public final void b(String s)
    {
        g.setText(s);
    }
}
