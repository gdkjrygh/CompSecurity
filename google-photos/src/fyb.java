// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fyb extends mtf
{

    private final int a;

    public fyb(int i)
    {
        super("AccountUpdateResponseTask");
        a = i;
    }

    protected final mue a(Context context)
    {
        context = (fyc)olm.a(context, fyc);
        if (a != -1 && context.b(a) == fyd.c)
        {
            context.a(a);
        }
        return new mue(true);
    }
}
