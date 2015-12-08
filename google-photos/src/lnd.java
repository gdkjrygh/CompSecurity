// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class lnd extends kbo
{

    private static volatile Bundle d;
    private static volatile Bundle e;
    private String a;
    private String b;
    private final HashMap c = new HashMap();

    public lnd(Context context, Looper looper, jyq jyq, jys jys, String s, kax kax1)
    {
        super(context.getApplicationContext(), looper, 5, kax1, jyq, jys);
        a = s;
        b = kax1.e;
    }

    static Status a(int i, String s, Bundle bundle)
    {
        if (bundle == null)
        {
            s = null;
        } else
        {
            s = (PendingIntent)bundle.getParcelable("pendingIntent");
        }
        return new Status(i, null, s);
    }

    private void a(Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        if (bundle != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        lmt.a(bundle.getBoolean("use_contactables_api", true));
        lnc.a.a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
        d = bundle.getBundle("config.email_type_map");
        e = bundle.getBundle("config.phone_type_map");
        if (true) goto _L1; else goto _L3
_L3:
        bundle;
        throw bundle;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return lmz.a(ibinder);
    }

    public final kcg a(jzc jzc, String s, String s1, int i)
    {
        jzc = new lne(jzc);
        try
        {
            s = ((lmy)super.o()).c(jzc, s, s1, 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            jzc.a(8, null, null, null);
            return null;
        }
        return s;
    }

    public final void a()
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        if (j())
        {
            Object obj = c.values().iterator();
            if (((Iterator) (obj)).hasNext())
            {
                obj = (lng)((Iterator) (obj)).next();
                throw new NullPointerException();
            }
        }
        break MISSING_BLOCK_LABEL_59;
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        c.clear();
        hashmap;
        JVM INSTR monitorexit ;
        super.a();
        return;
    }

    protected final void a(int i, IBinder ibinder, Bundle bundle, int j)
    {
        if (i == 0 && bundle != null)
        {
            a(bundle.getBundle("post_init_configuration"));
        }
        if (bundle == null)
        {
            bundle = null;
        } else
        {
            bundle = bundle.getBundle("post_init_resolution");
        }
        super.a(i, ibinder, bundle, j);
    }

    protected final String c()
    {
        return "com.google.android.gms.people.service.START";
    }

    protected final String d()
    {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    protected final Bundle e()
    {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", a);
        bundle.putString("real_client_package_name", b);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }
}
