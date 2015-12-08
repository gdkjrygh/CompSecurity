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
import com.facebook.drawee.view.SimpleDraweeView;
import java.text.NumberFormat;
import java.util.Locale;

// Referenced classes of package com.appboy.ui.widget:
//            c, StarRatingView, i

public class h extends com.appboy.ui.widget.c
{

    private static final String o = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/h.getName()
    });
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final StarRatingView i;
    private ImageView j;
    private SimpleDraweeView k;
    private final Button l;
    private com.appboy.ui.a.d m;
    private final float n;

    public h(Context context)
    {
        this(context, (byte)0);
    }

    private h(Context context, byte byte0)
    {
        super(context);
        n = 1.0F;
        e = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_cross_promotion_small_card_title);
        f = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_cross_promotion_small_card_subtitle);
        g = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_cross_promotion_small_card_review_count);
        h = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_cross_promotion_small_card_recommendation_tab);
        i = (StarRatingView)findViewById(com.appboy.ui.n.c.com_appboy_cross_promotion_small_card_star_rating);
        l = (Button)findViewById(com.appboy.ui.n.c.com_appboy_cross_promotion_small_card_price);
        if (super.d)
        {
            k = (SimpleDraweeView)a(com.appboy.ui.n.c.com_appboy_cross_promotion_small_card_drawee_stub);
            return;
        } else
        {
            j = (ImageView)a(com.appboy.ui.n.c.com_appboy_cross_promotion_small_card_imageview_stub);
            return;
        }
    }

    static com.appboy.ui.a.d a(h h1)
    {
        return h1.m;
    }

    static String b()
    {
        return o;
    }

    protected final int a()
    {
        return com.appboy.ui.n.d.com_appboy_cross_promotion_small_card;
    }

    public final void a(com.appboy.d.a.c c1)
    {
        d d2 = (d)c1;
        e.setText(d2.a);
        Button button;
        if (d2.b == null || d2.b.toUpperCase(Locale.getDefault()).equals("NULL"))
        {
            f.setVisibility(8);
        } else
        {
            f.setText(d2.b.toUpperCase(Locale.getDefault()));
        }
        h.setText(d2.c.toUpperCase(Locale.getDefault()));
        if (d2.e <= 0.0D)
        {
            g.setVisibility(8);
            i.setVisibility(8);
        } else
        {
            g.setText(String.format("(%s)", new Object[] {
                NumberFormat.getInstance().format(d2.f)
            }));
            i.a((float)d2.e);
        }
        if (!com.appboy.ui.d.d.a(d2.t))
        {
            button = l;
            c1 = d2.t;
        } else
        {
            button = l;
            double d1 = d2.p;
            if (d1 == 0.0D)
            {
                c1 = a.getString(com.appboy.ui.n.e.com_appboy_recommendation_free);
            } else
            {
                c1 = NumberFormat.getCurrencyInstance(Locale.US).format(d1);
            }
        }
        button.setText(c1);
        m = new c(d2.q, d2.s, d2.r);
        l.setOnClickListener(new i(this, d2));
        if (super.d)
        {
            a(k, d2.d, 1.0F, true);
            return;
        } else
        {
            a(j, d2.d);
            return;
        }
    }

}
