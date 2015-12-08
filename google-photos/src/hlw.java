// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hlw extends mtf
{

    private final int a;
    private final String b;
    private final String c;

    public hlw(int i, String s, String s1)
    {
        super("UpdateCollectionTitle");
        a = i;
        b = s;
        c = s1;
    }

    protected final mue a(Context context)
    {
        context = (erz)olm.a(context, erz);
        context.a(a, b, new ese(context, c), "UpdateCollectionTitle");
        return new mue(true);
    }
}
