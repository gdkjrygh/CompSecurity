// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.g;
import io.fabric.sdk.android.services.network.b;
import io.fabric.sdk.android.services.network.c;
import io.fabric.sdk.android.services.settings.d;
import io.fabric.sdk.android.services.settings.e;
import io.fabric.sdk.android.services.settings.h;
import io.fabric.sdk.android.services.settings.n;
import io.fabric.sdk.android.services.settings.q;
import io.fabric.sdk.android.services.settings.s;
import io.fabric.sdk.android.services.settings.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package io.fabric.sdk.android:
//            h, j, c, k

final class l extends io.fabric.sdk.android.h
{

    private final c a = new b();
    private PackageManager b;
    private String c;
    private PackageInfo d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private final Future j;
    private final Collection k;

    public l(Future future, Collection collection)
    {
        j = future;
        k = collection;
    }

    private d a(n n1, Collection collection)
    {
        Object obj = super.n;
        new g();
        String s1 = io.fabric.sdk.android.services.common.g.a(((Context) (obj)));
        obj = CommonUtils.a(new String[] {
            CommonUtils.k(((Context) (obj)))
        });
        int i1 = DeliveryMechanism.a(g).e;
        return new d(s1, super.p.d, f, e, ((String) (obj)), h, i1, i, "0", n1, collection);
    }

    private static Map a(Map map, Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            io.fabric.sdk.android.h h1 = (io.fabric.sdk.android.h)collection.next();
            if (!map.containsKey(h1.b()))
            {
                map.put(h1.b(), new j(h1.b(), h1.a(), "binary"));
            }
        } while (true);
        return map;
    }

    private Boolean d()
    {
        Object obj1;
        Object obj2;
        boolean flag;
        boolean flag1;
        flag1 = false;
        obj1 = CommonUtils.i(super.n);
        obj2 = f();
        flag = flag1;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        if (j == null) goto _L4; else goto _L3
_L3:
        Object obj = (Map)j.get();
_L9:
        Map map = a(((Map) (obj)), k);
        obj = ((s) (obj2)).a;
        obj2 = map.values();
        boolean flag2 = true;
        if (!"new".equals(((e) (obj)).b)) goto _L6; else goto _L5
_L5:
        obj1 = a(n.a(super.n, ((String) (obj1))), ((Collection) (obj2)));
        if (!(new h(this, g(), ((e) (obj)).c, a)).a(((d) (obj1)))) goto _L8; else goto _L7
_L7:
        flag = io.fabric.sdk.android.services.settings.q.a.a().c();
_L2:
        return Boolean.valueOf(flag);
_L4:
        obj = new HashMap();
          goto _L9
_L8:
        io.fabric.sdk.android.c.a().c("Fabric", "Failed to create app with Crashlytics service.", null);
        flag = false;
          goto _L2
_L6:
        try
        {
label0:
            {
                if (!"configured".equals(((e) (obj)).b))
                {
                    break label0;
                }
                flag = io.fabric.sdk.android.services.settings.q.a.a().c();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            io.fabric.sdk.android.c.a().c("Fabric", "Error performing auto configuration.", ((Throwable) (obj)));
            flag = flag1;
        }
          goto _L2
        flag = flag2;
        if (!((e) (obj)).e) goto _L2; else goto _L10
_L10:
        io.fabric.sdk.android.c.a().a("Fabric", "Server says an update is required - forcing a full App update.");
        obj1 = a(n.a(super.n, ((String) (obj1))), ((Collection) (obj2)));
        (new x(this, g(), ((e) (obj)).c, a)).a(((d) (obj1)));
        flag = flag2;
          goto _L2
    }

    private s f()
    {
        s s1;
        try
        {
            io.fabric.sdk.android.services.settings.q.a.a().a(this, p, a, e, f, g()).b();
            s1 = io.fabric.sdk.android.services.settings.q.a.a().a();
        }
        catch (Exception exception)
        {
            io.fabric.sdk.android.c.a().c("Fabric", "Error dealing with settings", exception);
            return null;
        }
        return s1;
    }

    private String g()
    {
        return CommonUtils.d(super.n, "com.crashlytics.ApiEndpoint");
    }

    public final String a()
    {
        return "1.3.6.79";
    }

    public final String b()
    {
        return "io.fabric.sdk.android:fabric";
    }

    protected final Object e()
    {
        return d();
    }

    protected final boolean e_()
    {
        g = super.p.e();
        b = super.n.getPackageManager();
        c = super.n.getPackageName();
        d = b.getPackageInfo(c, 0);
        e = Integer.toString(d.versionCode);
        if (d.versionName != null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        String s1 = "0.0";
_L1:
        try
        {
            f = s1;
            h = b.getApplicationLabel(super.n.getApplicationInfo()).toString();
            i = Integer.toString(super.n.getApplicationInfo().targetSdkVersion);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            io.fabric.sdk.android.c.a().c("Fabric", "Failed init", namenotfoundexception);
            return false;
        }
        return true;
        s1 = d.versionName;
          goto _L1
    }
}
