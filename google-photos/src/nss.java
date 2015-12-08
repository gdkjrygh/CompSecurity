// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Arrays;

final class nss extends nzc
{

    private static final String a = ntn.a("RegisterDeviceOp");
    private qql b;

    nss(Context context, nyg nyg, qql qql1)
    {
        super(context, nyg, "gnsregisterdevice", new pbr(), new pbs());
        b = qql1;
    }

    static int a(qql qql1)
    {
        oyh oyh1 = qql1.b.a;
        return Arrays.hashCode(new Object[] {
            qql1.c.a.a, qql1.a, qql1.b.b, Integer.valueOf(oyh1.a), oyh1.b, oyh1.c
        });
    }

    static qql a(Context context, String s)
    {
        ozl ozl1 = new ozl();
        Object obj = new ozk();
        obj.a = s;
        ozl1.a = ((ozk) (obj));
        s = new ozj();
        s.a = (new ntk(context)).a();
        s.b = Integer.toString(b.r(context));
        obj = new qql();
        obj.a = ((nqz)olm.a(context, nqz)).a();
        obj.c = ozl1;
        obj.b = s;
        ntn.a(a, ((qql) (obj)).toString());
        return ((qql) (obj));
    }

    protected final void a(qlw qlw)
    {
        ((pbr)qlw).a = b;
    }

}
