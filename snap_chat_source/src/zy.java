// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.squareup.otto.Bus;

public final class zy extends zp
    implements Et.a
{

    private final Bus a;
    private final zx b;
    private final View c;

    private zy(Bus bus, zx zx1, View view)
    {
        a = bus;
        b = zx1;
        c = view;
    }

    public zy(zx zx1, View view)
    {
        this(Mf.a(), zx1, view);
    }

    public final void a()
    {
        sZ sz = b.C();
        if (sz == null)
        {
            c.setOnClickListener(null);
            return;
        } else
        {
            c.setOnClickListener(new Et(sz, this));
            return;
        }
    }

    public final void c()
    {
        c.setBackgroundColor(c.getContext().getResources().getColor(0x7f0c0069));
        b.E();
        a.a(new Om(b));
    }

    public final String d()
    {
        return b.s();
    }
}
