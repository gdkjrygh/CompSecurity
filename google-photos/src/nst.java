// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class nst extends nzc
{

    private static final String a = ntn.a("UnregisterDeviceOp");
    private Context b;
    private final String c;

    nst(Context context, nyg nyg, String s)
    {
        super(context, nyg, "gnsunregisterdevice", new pbx(), new pby());
        b = context;
        c = s;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pbx)qlw;
        ozl ozl1 = new ozl();
        Object obj = new ozk();
        obj.a = c;
        ozl1.a = ((ozk) (obj));
        obj = new qqr();
        obj.a = ((nqz)olm.a(b, nqz)).a();
        obj.b = ozl1;
        qlw.a = ((qqr) (obj));
        ntn.a(a, ((qqr) (obj)).toString());
    }

}
