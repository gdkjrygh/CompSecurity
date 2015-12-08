// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.e.f;
import com.microsoft.onlineid.internal.sso.client.a.h;
import com.microsoft.onlineid.internal.sso.e;
import com.microsoft.onlineid.sts.n;
import java.util.List;

// Referenced classes of package com.microsoft.onlineid.internal.sso.client:
//            e, c

public class BackupService extends IntentService
{

    private Context a;
    private n b;
    private f c;
    private c d;
    private com.microsoft.onlineid.internal.sso.client.e e;

    public BackupService()
    {
        super(com/microsoft/onlineid/internal/sso/client/BackupService.getName());
    }

    private void a()
    {
        List list = e.a();
        if (a.getPackageName().equals(((e)list.get(0)).a()))
        {
            list.get(0);
            Bundle bundle = b();
            if (bundle != null && !bundle.isEmpty())
            {
                int j = Math.min(list.size() - 1, b.a(com.microsoft.onlineid.sts.n.c.d));
                int i = 1;
                do
                {
                    if (i > j)
                    {
                        break;
                    }
                    e e1 = (e)list.get(i);
                    try
                    {
                        (new h(a, bundle)).a(e1);
                    }
                    catch (Exception exception)
                    {
                        com.microsoft.onlineid.internal.c.d.c("Store backup failed.", exception);
                        com.microsoft.onlineid.a.a.a().a(exception);
                    }
                    i++;
                } while (true);
                c.g();
            }
        }
    }

    public static void a(Context context)
    {
        context.startService((new Intent(context, com/microsoft/onlineid/internal/sso/client/BackupService)).setAction("com.microsoft.onlineid.internal.sso.client.PUSH_BACKUP"));
    }

    private Bundle b()
    {
        Bundle bundle;
        try
        {
            bundle = (Bundle)d.a(new com.microsoft.onlineid.internal.sso.client.a.f(a));
        }
        catch (Exception exception)
        {
            com.microsoft.onlineid.internal.c.d.c("Retrieve backup failed.", exception);
            com.microsoft.onlineid.a.a.a().a(exception);
            return null;
        }
        return bundle;
    }

    public static void b(Context context)
    {
        context.startService((new Intent(context, com/microsoft/onlineid/internal/sso/client/BackupService)).setAction("com.microsoft.onlineid.internal.sso.client.PUSH_BACKUP_IF_NEEDED"));
    }

    public void onCreate()
    {
        super.onCreate();
        a = getApplicationContext();
        b = new n(a);
        c = new f(a);
        d = new c(a);
        e = new com.microsoft.onlineid.internal.sso.client.e(a);
    }

    protected void onHandleIntent(Intent intent)
    {
        intent = intent.getAction();
        if (intent.equals("com.microsoft.onlineid.internal.sso.client.PUSH_BACKUP"))
        {
            a();
        } else
        if (intent.equals("com.microsoft.onlineid.internal.sso.client.PUSH_BACKUP_IF_NEEDED"))
        {
            if ((System.currentTimeMillis() - c.h()) / 1000L >= (long)b.a(com.microsoft.onlineid.sts.n.c.e))
            {
                a();
                return;
            }
        } else
        {
            intent = new com.microsoft.onlineid.b.b((new StringBuilder("Unknown action: ")).append(intent).toString());
            com.microsoft.onlineid.a.a.a().a(intent);
            com.microsoft.onlineid.internal.c.d.c("Backup failed.", intent);
            return;
        }
    }
}
