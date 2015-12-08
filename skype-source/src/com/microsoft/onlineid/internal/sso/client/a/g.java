// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.b.a;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.e.f;
import com.microsoft.onlineid.internal.sso.e;
import com.microsoft.onlineid.internal.sso.service.MsaSsoService;
import com.microsoft.onlineid.sts.n;
import java.util.Locale;

public abstract class g
    implements ServiceConnection
{

    protected com.microsoft.onlineid.internal.sso.service.a a;
    protected final Context b;
    protected final Bundle c;
    protected final n d;
    protected final f e;
    protected boolean f;
    private final Object g = new Object();

    public g(Context context, Bundle bundle)
    {
        b = context;
        c = bundle;
        d = new n(context);
        e = new f(context);
        a = null;
    }

    protected static void a(Bundle bundle)
        throws a
    {
        if (com.microsoft.onlineid.internal.sso.a.g(bundle))
        {
            com.microsoft.onlineid.internal.sso.f f1 = com.microsoft.onlineid.internal.sso.f.a(bundle.getInt("com.microsoft.onlineid.error_code"));
            String s = bundle.getString("com.microsoft.onlineid.error_message");
            com.microsoft.onlineid.internal.c.d.c(String.format(Locale.US, "%s: %s, %s", new Object[] {
                "SSO error", f1.name(), s
            }));
            com.microsoft.onlineid.a.a.a().a("SDK", "SSO error", (new StringBuilder()).append(f1.name()).append(": ").append(s).toString());
            throw com.microsoft.onlineid.internal.sso.a.h(bundle);
        } else
        {
            return;
        }
    }

    private Object b(e e1)
        throws a
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        flag5 = false;
        flag6 = false;
        flag7 = false;
        flag4 = false;
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        Object obj = (new Intent("com.microsoft.msa.action.SSO_SERVICE")).setPackage(e1.a());
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        com.microsoft.onlineid.internal.c.d.a((new StringBuilder()).append(b.getPackageName()).append(" attempting to bind to: ").append(e1.a()).append(" [").append(getClass().getSimpleName()).append("]").toString());
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        if (!b.bindService(((Intent) (obj)), this, 1))
        {
            break MISSING_BLOCK_LABEL_505;
        }
        flag5 = true;
        flag6 = true;
        flag7 = true;
        flag4 = true;
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        obj = g;
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        obj;
        JVM INSTR monitorenter ;
        if (!f)
        {
            g.wait(3000L);
        }
        obj;
        JVM INSTR monitorexit ;
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_343;
        }
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        com.microsoft.onlineid.internal.c.d.a((new StringBuilder("Bound to: ")).append(e1.a()).toString());
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        obj = a();
        c();
        return obj;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        throw exception;
        e1;
        flag = flag1;
        throw e1;
        e1;
        if (flag)
        {
            c();
        }
        throw e1;
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        obj = (new StringBuilder("Timed out after 3000 milliseconds when trying to bind to: ")).append(e1.a()).append(" [").append(getClass().getSimpleName()).append("]").toString();
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        com.microsoft.onlineid.internal.c.d.b(((String) (obj)));
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        throw new com.microsoft.onlineid.internal.sso.client.d(((String) (obj)));
        SecurityException securityexception;
        securityexception;
        flag = flag2;
        com.microsoft.onlineid.internal.c.d.c((new StringBuilder("Caught a SecurityException while trying to bind to ")).append(e1.a()).append(", service may not be exported correctly. [").append(getClass().getSimpleName()).append("]").toString(), securityexception);
        flag = flag2;
        throw new com.microsoft.onlineid.internal.sso.client.d(securityexception);
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        securityexception = (new StringBuilder("Failed to bind to ")).append(e1.a()).append(" [").append(getClass().getSimpleName()).append("]").toString();
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        com.microsoft.onlineid.internal.c.d.c(securityexception);
        flag1 = flag4;
        flag = flag5;
        flag2 = flag6;
        flag3 = flag7;
        throw new com.microsoft.onlineid.internal.sso.client.d(securityexception);
        e1;
        flag = flag3;
        com.microsoft.onlineid.internal.c.d.c("SSO service request threw an unhandled exception.", e1);
        flag = flag3;
        throw new com.microsoft.onlineid.b.b(e1);
    }

    private void c()
    {
        f = false;
        a = null;
        b.unbindService(this);
    }

    protected abstract Object a()
        throws a, RemoteException;

    public final Object a(e e1)
        throws a
    {
        Object obj;
        int i;
        int j;
        j = d.a(com.microsoft.onlineid.sts.n.c.g);
        i = j;
        if (j <= 0)
        {
            String s = (new StringBuilder("Invalid MaxTriesForSsoRequestToSingleService: ")).append(j).toString();
            com.microsoft.onlineid.internal.c.d.c(s);
            com.microsoft.onlineid.a.a.a().a("SDK", "SSO fallback", s);
            i = 1;
        }
        j = 1;
        obj = null;
_L2:
        if (j > i)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = b(e1);
        return obj;
        obj;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        throw new com.microsoft.onlineid.internal.sso.client.d("Max SSO tries exceeded.", ((Throwable) (obj)));
    }

    public final Bundle b()
    {
        Bundle bundle = new Bundle();
        try
        {
            Bundle bundle1 = b.getPackageManager().getServiceInfo(new ComponentName(b, com/microsoft/onlineid/internal/sso/service/MsaSsoService.getName()), 128).metaData;
            bundle.putString("com.microsoft.onlineid.client_package_name", b.getPackageName());
            bundle.putInt("com.microsoft.onlineid.client_sso_version", bundle1.getInt("com.microsoft.msa.service.sso_version"));
            bundle.putString("com.microsoft.onlineid.client_sdk_version", bundle1.getString("com.microsoft.msa.service.sdk_version"));
            bundle.putString("com.microsoft.onlineid.client_config_version", d.b(n.b));
            bundle.putLong("com.microsoft.onlineid.client_config_last_downloaded_time", e.j());
            bundle.putBundle("com.microsoft.onlineid.client_state", c);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            com.microsoft.onlineid.internal.c.d.c("Could not find calling SSO service meta-data.", namenotfoundexception);
            return bundle;
        }
        return bundle;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        a = com.microsoft.onlineid.internal.sso.service.a.a.a(ibinder);
        synchronized (g)
        {
            f = true;
            g.notify();
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        a = null;
        f = false;
    }
}
