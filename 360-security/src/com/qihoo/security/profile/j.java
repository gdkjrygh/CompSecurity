// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.app.d;
import com.qihoo.security.service.SecurityService;

// Referenced classes of package com.qihoo.security.profile:
//            e, d

public class j
    implements com.qihoo.security.app.d.a
{

    private static j a = new j(SecurityApplication.a());
    private final String b;
    private com.qihoo.security.profile.d c;
    private e d;
    private Context e;

    private j(Context context)
    {
label0:
        {
            super();
            c = new d.a() {

                final j a;

                public String a()
                    throws RemoteException
                {
                    return j.a(a);
                }

            
            {
                a = j.this;
                super();
            }
            };
            e = context.getApplicationContext();
            String s = SecurityApplication.c().replace(e.getPackageName(), "");
            if (s != null)
            {
                context = s;
                if (s.length() != 0)
                {
                    break label0;
                }
            }
            context = "main";
        }
        b = context;
        context = new Intent("com.qihoo.security.service.PROFILE");
        context.setClass(e, com/qihoo/security/service/SecurityService);
        d = (e)com.qihoo.security.app.d.a(e).a(com/qihoo/security/profile/e, context, false, this);
    }

    public static j a()
    {
        return a;
    }

    static String a(j j1)
    {
        return j1.b;
    }

    public IInterface a(IBinder ibinder)
    {
        return b(ibinder);
    }

    public void a(int i, int k, String s)
    {
        try
        {
            d.a(c, i, k, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public e b(IBinder ibinder)
    {
        ibinder = com.qihoo.security.profile.e.a.a(ibinder);
        try
        {
            ibinder.a(c, b);
        }
        catch (Exception exception)
        {
            return ibinder;
        }
        return ibinder;
    }

}
