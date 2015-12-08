// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.d.a.d;
import com.appboy.ui.a.c;
import com.appboy.ui.d.b;
import com.appboy.ui.s;
import com.appboy.ui.t;
import com.appboy.ui.u;
import java.text.NumberFormat;
import java.util.Locale;

// Referenced classes of package com.appboy.ui.widget:
//            c, StarRatingView, i

public class h extends com.appboy.ui.widget.c
{

    private static final String m = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/h.getName()
    });
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final StarRatingView h;
    private final ImageView i;
    private final Button j;
    private com.appboy.ui.a.d k;
    private final float l;

    public h(Context context)
    {
        this(context, (byte)0);
    }

    private h(Context context, byte byte0)
    {
        super(context);
        l = 1.0F;
        d = (TextView)findViewById(s.m);
        e = (TextView)findViewById(s.l);
        f = (TextView)findViewById(s.j);
        g = (TextView)findViewById(s.i);
        h = (StarRatingView)findViewById(s.k);
        i = (ImageView)findViewById(s.g);
        j = (Button)findViewById(s.h);
    }

    static com.appboy.ui.a.d a(h h1)
    {
        return h1.k;
    }

    static String b()
    {
        return m;
    }

    protected final int a()
    {
        return t.c;
    }

    public final void a(com.appboy.d.a.c c1)
    {
        d d2 = (d)c1;
        d.setText(d2.b());
        Button button;
        if (d2.c() == null || d2.c().toUpperCase(Locale.getDefault()).equals("NULL"))
        {
            e.setVisibility(8);
        } else
        {
            e.setText(d2.c().toUpperCase(Locale.getDefault()));
        }
        g.setText(d2.d().toUpperCase(Locale.getDefault()));
        if (d2.f() <= 0.0D)
        {
            f.setVisibility(8);
            h.setVisibility(8);
        } else
        {
            f.setText(String.format("(%s)", new Object[] {
                NumberFormat.getInstance().format(d2.g())
            }));
            h.a((float)d2.f());
        }
        if (!com.appboy.ui.d.b.a(d2.s()))
        {
            button = j;
            c1 = d2.s();
        } else
        {
            button = j;
            double d1 = d2.o();
            if (d1 == 0.0D)
            {
                c1 = a.getString(u.d);
            } else
            {
                c1 = NumberFormat.getCurrencyInstance(Locale.US).format(d1);
            }
        }
        button.setText(c1);
        k = new c(d2.p(), d2.r(), d2.q());
        j.setOnClickListener(new i(this, d2));
        a(i, d2.e());
    }

}
