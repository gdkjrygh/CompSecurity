// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dxn extends mtf
{

    private final duv a;
    private final dxo b;
    private final int c;

    public dxn(int i, duv duv1, dxo dxo1)
    {
        super("LocationReportingOptInTask");
        a = duv1;
        b = dxo1;
        c = i;
    }

    protected final mue a(Context context)
    {
        android.accounts.Account account;
        context = b;
        account = a.a(c);
        if (account != null) goto _L2; else goto _L1
_L1:
        context.a(c.cm);
_L6:
        boolean flag;
        context.a();
        flag = false;
_L4:
        return new mue(flag);
_L2:
        if (!context.a(account))
        {
            continue; /* Loop/switch isn't completed */
        }
        ((dxo) (context)).b.b(((dxo) (context)).a, account).a(new dxr(context));
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }
}
