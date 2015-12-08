// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.d.a.c;
import com.appboy.d.a.e;
import com.appboy.ui.a.a;
import com.appboy.ui.a.d;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.widget:
//            c, l

public class k extends com.appboy.ui.widget.c
{

    private static final String l = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/k.getName()
    });
    private ImageView e;
    private SimpleDraweeView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private d j;
    private final float k;

    public k(Context context)
    {
        this(context, (byte)0);
    }

    private k(Context context, byte byte0)
    {
        super(context);
        k = 1.0F;
        h = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_short_news_card_description);
        g = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_short_news_card_title);
        i = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_short_news_card_domain);
        if (super.d)
        {
            f = (SimpleDraweeView)a(com.appboy.ui.n.c.com_appboy_short_news_card_drawee_stub);
        } else
        {
            e = (ImageView)a(com.appboy.ui.n.c.com_appboy_short_news_card_imageview_stub);
        }
        a(getResources().getDrawable(com.appboy.ui.n.b.com_appboy_card_background));
    }

    static d a(k k1)
    {
        return k1.j;
    }

    static String b()
    {
        return l;
    }

    protected final int a()
    {
        return com.appboy.ui.n.d.com_appboy_short_news_card;
    }

    public final void a(c c1)
    {
        c1 = (e)c1;
        h.setText(((e) (c1)).a);
        a(g, ((e) (c1)).c);
        a(i, ((e) (c1)).e);
        j = com.appboy.ui.a.a.a(getContext(), ((e) (c1)).d);
        setOnClickListener(new l(this, c1));
        if (super.d)
        {
            a(f, ((e) (c1)).b, 1.0F, true);
            return;
        } else
        {
            a(e, ((e) (c1)).b);
            return;
        }
    }

}
