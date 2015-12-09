// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.wear;

import com.spotify.mobile.android.util.Assertion;
import cql;
import cqp;
import dmz;
import gmg;
import gml;

public class WearableCommunicationService extends cqp
{

    public WearableCommunicationService()
    {
    }

    public final void a(cql cql1)
    {
        boolean flag;
        super.a(cql1);
        cql1.c();
        cql1.a();
        gml gml1 = (gml)dmz.a(gml);
        Assertion.a(cql1);
        String s = cql1.a();
        byte abyte0[] = cql1.b();
        String s1 = cql1.c();
        if ("/wear/connect".equals(s))
        {
            gml1.a.a(s1);
        } else
        if ("/wear/disconnect".equals(s))
        {
            gml1.a.b(s1);
        } else
        {
label0:
            {
                if (!"/wear/message".equals(s))
                {
                    break label0;
                }
                gml1.a.a(s1, abyte0);
            }
        }
        flag = true;
_L2:
        Assertion.c(flag, String.format("Message was not routed: %s", new Object[] {
            cql1.a()
        }));
        return;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
