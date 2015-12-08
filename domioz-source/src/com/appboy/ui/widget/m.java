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
import com.appboy.ui.r;
import com.appboy.ui.s;
import com.appboy.ui.t;

// Referenced classes of package com.appboy.ui.widget:
//            c, n

public class m extends com.appboy.ui.widget.c
{

    private static final String h = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/m.getName()
    });
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private d g;

    public m(Context context)
    {
        this(context, (byte)0);
    }

    private m(Context context, byte byte0)
    {
        super(context);
        d = (TextView)findViewById(s.aa);
        e = (TextView)findViewById(s.Y);
        f = (TextView)findViewById(s.Z);
        a(getResources().getDrawable(r.a));
    }

    static d a(m m1)
    {
        return m1.g;
    }

    static String b()
    {
        return h;
    }

    protected final int a()
    {
        return t.n;
    }

    public final void a(c c1)
    {
        c1 = (f)c1;
        d.setText(c1.c());
        e.setText(c1.b());
        a(f, c1.e());
        g = com.appboy.ui.a.a.a(getContext(), c1.d());
        setOnClickListener(new n(this, c1));
    }

}
