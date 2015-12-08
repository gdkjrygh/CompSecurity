// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.appboy.d.a.c;
import com.appboy.ui.a.d;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.widget:
//            c, b

public class a extends com.appboy.ui.widget.c
{

    private static final String h = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/a.getName()
    });
    private ImageView e;
    private d f;
    private SimpleDraweeView g;
    private float i;

    public a(Context context)
    {
        this(context, (byte)0);
    }

    private a(Context context, byte byte0)
    {
        super(context);
        i = 6F;
        if (super.d)
        {
            g = (SimpleDraweeView)a(com.appboy.ui.n.c.com_appboy_banner_image_card_drawee_stub);
        } else
        {
            e = (ImageView)a(com.appboy.ui.n.c.com_appboy_banner_image_card_imageview_stub);
            e.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            e.setAdjustViewBounds(true);
        }
        a(getResources().getDrawable(com.appboy.ui.n.b.com_appboy_card_background));
    }

    static d a(a a1)
    {
        return a1.f;
    }

    static String b()
    {
        return h;
    }

    protected final int a()
    {
        return com.appboy.ui.n.d.com_appboy_banner_image_card;
    }

    public final void a(c c1)
    {
        c1 = (com.appboy.d.a.a)c1;
        boolean flag = false;
        if (((com.appboy.d.a.a) (c1)).c != 0.0F)
        {
            i = ((com.appboy.d.a.a) (c1)).c;
            flag = true;
        }
        if (super.d)
        {
            a(g, ((com.appboy.d.a.a) (c1)).a, i, flag);
        } else
        {
            a(e, ((com.appboy.d.a.a) (c1)).a, i, flag);
        }
        f = com.appboy.ui.a.a.a(getContext(), ((com.appboy.d.a.a) (c1)).b);
        setOnClickListener(new b(this, c1));
    }

}
