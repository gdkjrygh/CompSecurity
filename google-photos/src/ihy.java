// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class ihy extends mtf
{

    private final int a;
    private final String b;

    public ihy(int i, String s)
    {
        super("ReadMediaUrlById");
        a = i;
        b = s;
    }

    protected final mue a(Context context)
    {
        noz noz1 = noz.a(context, "ReadMediaUrlById", new String[0]);
        hgn hgn1 = hgn.a(context, a, b);
        ((hpz)olm.a(context, hpz)).b(a, hgn1);
        if (!hgn1.j())
        {
            return new mue(0, null, null);
        }
        if (hgn1.j() && hgn1.b.c != null && hgn1.b.c.length > 0)
        {
            context = hgn1.b.c[0];
        } else
        {
            context = null;
        }
        if (context == null || ((qgg) (context)).d == null || ((qgg) (context)).d.b == null || ((qgg) (context)).d.b.a == null || ((qgg) (context)).d.b.a.a == null)
        {
            if (noz1.a())
            {
                noy.a("error", "No/empty response");
            }
            return new mue(false);
        } else
        {
            context = nkj.a(((qgg) (context)).d.b.a.a, 0, 400);
            mue mue1 = new mue(true);
            mue1.a().putString("media_url", context);
            return mue1;
        }
    }
}
