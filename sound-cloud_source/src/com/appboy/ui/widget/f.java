// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.d.a.b;
import com.appboy.d.a.c;
import com.appboy.ui.a.a;
import com.appboy.ui.a.d;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.widget:
//            c, g

public class f extends com.appboy.ui.widget.c
{

    private static final String k = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/f.getName()
    });
    private ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private SimpleDraweeView i;
    private d j;
    private float l;

    public f(Context context)
    {
        this(context, (byte)0);
    }

    private f(Context context, byte byte0)
    {
        super(context);
        l = 1.333333F;
        if (super.d)
        {
            i = (SimpleDraweeView)a(com.appboy.ui.n.c.com_appboy_captioned_image_card_drawee_stub);
        } else
        {
            e = (ImageView)a(com.appboy.ui.n.c.com_appboy_captioned_image_card_imageview_stub);
            e.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            e.setAdjustViewBounds(true);
        }
        f = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_captioned_image_title);
        g = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_captioned_image_description);
        h = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_captioned_image_card_domain);
        a(getResources().getDrawable(com.appboy.ui.n.b.com_appboy_card_background));
    }

    static d a(f f1)
    {
        return f1.j;
    }

    static String b()
    {
        return k;
    }

    protected final int a()
    {
        return com.appboy.ui.n.d.com_appboy_captioned_image_card;
    }

    public final void a(c c1)
    {
        c1 = (b)c1;
        f.setText(((b) (c1)).b);
        g.setText(((b) (c1)).c);
        a(h, ((b) (c1)).e);
        j = com.appboy.ui.a.a.a(getContext(), ((b) (c1)).d);
        boolean flag = false;
        if (((b) (c1)).f != 0.0F)
        {
            l = ((b) (c1)).f;
            flag = true;
        }
        setOnClickListener(new g(this, c1));
        if (super.d)
        {
            a(i, ((b) (c1)).a, l, flag);
            return;
        } else
        {
            a(e, ((b) (c1)).a, l, flag);
            return;
        }
    }

}
