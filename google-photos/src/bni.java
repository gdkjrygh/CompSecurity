// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class bni extends mtf
{

    public static final String a = bni.getSimpleName();
    private final crx b;
    private final cnq c;
    private final int j;
    private final coa k;
    private final int l;
    private final int m;

    bni(crx crx1, cnq cnq, int i, coa coa, int i1, int j1)
    {
        super(a);
        b = crx1;
        c = cnq;
        j = i;
        k = coa;
        l = i1;
        m = j1;
    }

    public static bnk a(crx crx1)
    {
        return new bnj(crx1);
    }

    public final mue a(Context context)
    {
        if (b.a(j, k, l, m) == null)
        {
            return new mue(false);
        } else
        {
            context = new mue(true);
            context.a().putParcelable("clip", c);
            return context;
        }
    }

}
