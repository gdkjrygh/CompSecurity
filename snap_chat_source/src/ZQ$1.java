// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class init> extends aba
{

    private ZQ a;
    private ZQ b;

    public final void a()
    {
        if (a.g.b())
        {
            return;
        } else
        {
            aaM aam = new aaM(a);
            org.json.JSONObject jsonobject = a.y.a();
            aam.a.put("metadata", jsonobject);
            (new abc(aam, new aaU((new aaT(b.v.i, "/android_v2/update_user_metadata")).a()), new aaV(a.y))).run();
            return;
        }
    }

    >(ZQ zq, ZQ zq1)
    {
        b = zq;
        a = zq1;
        super();
    }
}
