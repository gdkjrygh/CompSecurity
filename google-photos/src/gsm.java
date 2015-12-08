// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gsm extends mtf
{

    private final ekq a;

    public gsm(ekq ekq)
    {
        super("AddPendingMedia");
        a = ekq;
    }

    protected final mue a(Context context)
    {
        noz noz1 = noz.a(context, "AddPendingMedia", new String[0]);
        context = (gsj)b.a(context, gsj, a);
        try
        {
            context.a(a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (noz1.a())
            {
                b.a(a);
            }
            return new mue(0, context, null);
        }
        return new mue(true);
    }
}
