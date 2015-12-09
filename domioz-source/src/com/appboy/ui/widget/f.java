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
import com.appboy.ui.r;
import com.appboy.ui.s;
import com.appboy.ui.t;

// Referenced classes of package com.appboy.ui.widget:
//            c, g

public class f extends com.appboy.ui.widget.c
{

    private static final String i = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/f.getName()
    });
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private d h;
    private float j;

    public f(Context context)
    {
        this(context, (byte)0);
    }

    private f(Context context, byte byte0)
    {
        super(context);
        j = 1.333333F;
        d = (ImageView)findViewById(s.d);
        e = (TextView)findViewById(s.f);
        f = (TextView)findViewById(s.e);
        g = (TextView)findViewById(s.c);
        a(getResources().getDrawable(r.a));
    }

    static d a(f f1)
    {
        return f1.h;
    }

    static String b()
    {
        return i;
    }

    protected final int a()
    {
        return t.b;
    }

    public final void a(c c1)
    {
        c1 = (b)c1;
        e.setText(c1.c());
        f.setText(c1.d());
        a(g, c1.f());
        h = com.appboy.ui.a.a.a(getContext(), c1.e());
        boolean flag = false;
        if (c1.g() != 0.0F)
        {
            j = c1.g();
            flag = true;
        }
        setOnClickListener(new g(this, c1));
        a(d, c1.b(), j, flag);
    }

}
