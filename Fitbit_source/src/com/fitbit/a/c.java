// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.a;

import android.content.Intent;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.an;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.a;
import com.fitbit.serverinteraction.b;
import com.fitbit.util.ar;
import com.fitbit.util.z;

public class c
{

    public static final String a = "com.fitbit.controllers.ServerGatewayController.ACTION_CREDENTIALS_EXPIRED";
    public static final String b = "com.fitbit.controllers.ServerGatewayController.ACTION_SERVER_ERROR";

    public c()
    {
    }

    public static void a()
    {
        ServerGateway servergateway = ServerGateway.a();
        servergateway.a(new com.fitbit.serverinteraction.ServerGateway.a() {

            public void a(ServerGateway servergateway1)
            {
                if (ar.c(FitBitApplication.a()) && an.a().g())
                {
                    z.a(new Intent("com.fitbit.controllers.ServerGatewayController.ACTION_CREDENTIALS_EXPIRED"));
                }
            }

        });
        a a1 = (a)(new b()).b();
        if (a1 != null && a1.a != null && a1.b != null)
        {
            servergateway.a(a1.a, a1.b);
        }
    }
}
