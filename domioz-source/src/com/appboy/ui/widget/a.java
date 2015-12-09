// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.appboy.d.a.c;
import com.appboy.ui.a.d;
import com.appboy.ui.r;
import com.appboy.ui.s;
import com.appboy.ui.t;

// Referenced classes of package com.appboy.ui.widget:
//            c, b

public class a extends com.appboy.ui.widget.c
{

    private static final String f = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/a.getName()
    });
    private final ImageView d;
    private d e;
    private float g;

    public a(Context context)
    {
        this(context, (byte)0);
    }

    private a(Context context, byte byte0)
    {
        super(context);
        g = 6F;
        d = (ImageView)findViewById(s.b);
        a(getResources().getDrawable(r.a));
    }

    static d a(a a1)
    {
        return a1.e;
    }

    static String b()
    {
        return f;
    }

    protected final int a()
    {
        return t.a;
    }

    public final void a(c c1)
    {
        c1 = (com.appboy.d.a.a)c1;
        boolean flag = false;
        if (c1.d() != 0.0F)
        {
            g = c1.d();
            flag = true;
        }
        a(d, c1.b(), g, flag);
        e = com.appboy.ui.a.a.a(getContext(), c1.c());
        setOnClickListener(new b(this, c1));
    }

}
