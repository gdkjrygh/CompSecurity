// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.app.IntentService;
import android.content.Intent;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.d.b;
import com.microsoft.onlineid.internal.e.f;
import com.microsoft.onlineid.internal.f.a;
import com.microsoft.onlineid.internal.sso.client.BackupService;

// Referenced classes of package com.microsoft.onlineid.internal:
//            b, c, m

public class MsaService extends IntentService
{

    private b a;
    private a b;
    private f c;

    public MsaService()
    {
        super(com/microsoft/onlineid/internal/MsaService.getName());
    }

    public void onCreate()
    {
        super.onCreate();
        android.content.Context context = getApplicationContext();
        a = new b(context);
        b = new a(context);
        c = new f(context);
    }

    protected void onHandleIntent(Intent intent)
    {
        com.microsoft.onlineid.internal.b b1;
        Object obj;
        b1 = new com.microsoft.onlineid.internal.b(getApplicationContext(), intent);
        intent = intent.getAction();
        try
        {
            obj = b1.d();
            if ("com.microsoft.onlineid.internal.GET_TICKET".equals(intent))
            {
                com.microsoft.onlineid.i i = b.a(((String) (obj)), b1.g(), b1.e(), b1.f(), b1.k(), b1.l());
                b1.a((new c()).a(((String) (obj))).a(i));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d.a((new StringBuilder("ApiRequest with action ")).append(intent).append(" requires UI to complete.").toString());
            b1.a((new m(((com.microsoft.onlineid.internal.b.b) (obj)).a().a(b1.i()).a(b1.m()).a(b1))).a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.microsoft.onlineid.a.a.a().a(((Throwable) (obj)));
            d.c((new StringBuilder("ApiRequest with action ")).append(intent).append(" failed.").toString(), ((Throwable) (obj)));
            b1.a(((Exception) (obj)));
            return;
        }
        if ("com.microsoft.onlineid.internal.UPDATE_PROFILE".equals(intent))
        {
            a.a(b1.d(), b1.f());
            b1.a((new c()).a(((String) (obj))));
            return;
        }
        if ("com.microsoft.onlineid.internal.SIGN_OUT".equals(intent))
        {
            b1.a(new c());
            return;
        }
        if ("com.microsoft.onlineid.internal.SIGN_OUT_ALL_APPS".equals(intent))
        {
            c.b(((String) (obj)));
            BackupService.a(getApplicationContext());
            b1.a(new c());
            return;
        }
        throw new com.microsoft.onlineid.b.b((new StringBuilder("Unknown action: ")).append(intent).toString());
    }
}
