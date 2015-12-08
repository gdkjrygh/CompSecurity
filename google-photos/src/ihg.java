// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ihg extends nzc
{

    private final String a;

    public ihg(Context context, int i, String s)
    {
        super(context, new nyg(context, i), "deletecollection", new pat(), new pau());
        a = s;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pat)qlw;
        qlw.a = new qdj();
        ((pat) (qlw)).a.a = new qbx();
        ((pat) (qlw)).a.a.a = a;
    }
}
