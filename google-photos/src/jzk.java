// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

final class jzk extends kaa
{

    private jzf a;
    private ResolveAccountResponse b;

    jzk(jzj jzj, kae kae, jzf jzf1, ResolveAccountResponse resolveaccountresponse)
    {
        a = jzf1;
        b = resolveaccountresponse;
        super(kae);
    }

    public final void a()
    {
        jzf jzf1;
        ConnectionResult connectionresult;
label0:
        {
            jzf1 = a;
            ResolveAccountResponse resolveaccountresponse = b;
            if (jzf1.b(0))
            {
                connectionresult = resolveaccountresponse.c;
                if (!connectionresult.b())
                {
                    break label0;
                }
                jzf1.g = kaz.a(resolveaccountresponse.b);
                jzf1.f = true;
                jzf1.h = resolveaccountresponse.d;
                jzf1.i = resolveaccountresponse.e;
                jzf1.f();
            }
            return;
        }
        if (jzf1.a(connectionresult))
        {
            jzf1.i();
            jzf1.f();
            return;
        } else
        {
            jzf1.b(connectionresult);
            return;
        }
    }
}
