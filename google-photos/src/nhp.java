// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class nhp extends mtf
{

    private final nhr a;

    nhp(String s, nhr nhr1)
    {
        super(s);
        a = nhr1;
    }

    protected final mue a(Context context)
    {
        try
        {
            context = nhk.a(a.b(nhr.b()));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return context;
    }
}
