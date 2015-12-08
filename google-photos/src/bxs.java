// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class bxs extends bsr
{

    private bxr a;

    bxs(bxr bxr1, String s)
    {
        a = bxr1;
        super(s);
    }

    public final mtf a(String s)
    {
        if (bxr.a(a).c.g != -1L)
        {
            return null;
        } else
        {
            return new bxo(s, bxr.c(a).c(bxr.b(a)));
        }
    }

    public final boolean a(String s, mue mue1)
    {
        s = bxr.d(a);
        long l = mue1.a().getLong("maximum_duration");
        ((bww) (s)).c.g = l;
        s.a(new bxg[] {
            bxg.k
        });
        return true;
    }
}
