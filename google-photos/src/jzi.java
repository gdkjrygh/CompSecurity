// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

final class jzi extends kaa
{

    private jzf a;
    private ConnectionResult b;

    jzi(jzh jzh, kae kae, jzf jzf1, ConnectionResult connectionresult)
    {
        a = jzf1;
        b = connectionresult;
        super(kae);
    }

    public final void a()
    {
        jzf jzf1;
        ConnectionResult connectionresult;
label0:
        {
            jzf1 = a;
            connectionresult = b;
            if (jzf1.b(2))
            {
                if (!connectionresult.b())
                {
                    break label0;
                }
                jzf1.h();
            }
            return;
        }
        if (jzf1.a(connectionresult))
        {
            jzf1.i();
            jzf1.h();
            return;
        } else
        {
            jzf1.b(connectionresult);
            return;
        }
    }
}
