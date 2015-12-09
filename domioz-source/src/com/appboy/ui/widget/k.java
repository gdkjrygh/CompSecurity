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
import com.appboy.ui.r;
import com.appboy.ui.s;
import com.appboy.ui.t;

// Referenced classes of package com.appboy.ui.widget:
//            c, l

public class k extends com.appboy.ui.widget.c
{

    private static final String j = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/k.getName()
    });
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private d h;
    private final float i;

    public k(Context context)
    {
        this(context, (byte)0);
    }

    private k(Context context, byte byte0)
    {
        super(context);
        i = 1.0F;
        f = (TextView)findViewById(s.U);
        d = (ImageView)findViewById(s.W);
        e = (TextView)findViewById(s.X);
        g = (TextView)findViewById(s.V);
        a(getResources().getDrawable(r.a));
    }

    static d a(k k1)
    {
        return k1.h;
    }

    static String b()
    {
        return j;
    }

    protected final int a()
    {
        return t.m;
    }

    public final void a(c c1)
    {
        c1 = (e)c1;
        f.setText(c1.b());
        a(e, c1.d());
        a(g, c1.f());
        h = com.appboy.ui.a.a.a(getContext(), c1.e());
        setOnClickListener(new l(this, c1));
        a(d, c1.c());
    }

}
