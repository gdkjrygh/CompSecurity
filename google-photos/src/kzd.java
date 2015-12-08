// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.CastDevice;

final class kzd extends kzg
{

    private String h;
    private kzb i;

    kzd(kzb kzb1, jyn jyn, String s)
    {
        i = kzb1;
        h = s;
        super(kzb1, jyn);
    }

    protected final void a(jyl jyl)
    {
        jyl = (kzj)jyl;
        kzh kzh1 = new kzh(this, jyl);
        Object obj = kzb.b(i);
        String s = h;
        kzj.a.a("startRemoteDisplay", new Object[0]);
        obj = new kzk(jyl, ((kzr) (obj)));
        ((kzo)jyl.o()).a(kzh1, ((kzr) (obj)), ((kzj) (jyl)).b.b, s);
    }
}
