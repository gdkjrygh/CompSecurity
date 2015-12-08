// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.appboy.d.a.c;
import com.appboy.d.a.f;
import com.appboy.ui.a.a;
import com.appboy.ui.a.d;

// Referenced classes of package com.appboy.ui.widget:
//            c, n

public class m extends com.appboy.ui.widget.c
{

    private static final String i = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/m.getName()
    });
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private d h;

    public m(Context context)
    {
        this(context, (byte)0);
    }

    private m(Context context, byte byte0)
    {
        super(context);
        e = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_text_announcement_card_title);
        f = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_text_announcement_card_description);
        g = (TextView)findViewById(com.appboy.ui.n.c.com_appboy_text_announcement_card_domain);
        a(getResources().getDrawable(com.appboy.ui.n.b.com_appboy_card_background));
    }

    static d a(m m1)
    {
        return m1.h;
    }

    static String b()
    {
        return i;
    }

    protected final int a()
    {
        return com.appboy.ui.n.d.com_appboy_text_announcement_card;
    }

    public final void a(c c1)
    {
        c1 = (f)c1;
        e.setText(((f) (c1)).b);
        f.setText(((f) (c1)).a);
        a(g, ((f) (c1)).d);
        h = com.appboy.ui.a.a.a(getContext(), ((f) (c1)).c);
        setOnClickListener(new n(this, c1));
    }

}
