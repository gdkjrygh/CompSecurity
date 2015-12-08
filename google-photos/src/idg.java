// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class idg extends mvc
    implements nug
{

    private final idi l;
    private final int m;
    private final ej n = new ej(this);

    public idg(Context context, int i)
    {
        super(context);
        m = i;
        l = (idi)olm.a(context, idi);
    }

    public final void b_(Object obj)
    {
        n.onChange(false);
    }

    public final Object d()
    {
        return l.b(m);
    }

    protected final boolean q()
    {
        l.a.a(this, false);
        return super.q();
    }

    protected final boolean r()
    {
        l.a.a(this);
        return super.r();
    }
}
