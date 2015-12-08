// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

final class gyl extends gyh
{

    private final hba a = new hav();
    private PackageManager b;
    private String c;
    private PackageInfo d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String n;
    private final Future o;
    private final Collection p;

    public gyl(Future future, Collection collection)
    {
        o = future;
        p = collection;
    }

    private hbi a(hbs hbs1, Collection collection)
    {
        Object obj = super.k;
        new gyx();
        String s = gyx.a(((Context) (obj)));
        obj = CommonUtils.a(new String[] {
            CommonUtils.k(((Context) (obj)))
        });
        int i = DeliveryMechanism.a(g).id;
        return new hbi(s, super.m.d, f, e, ((String) (obj)), h, i, n, "0", hbs1, collection);
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
            gyh gyh1 = (gyh)collection.next();
            if (!map.containsKey(gyh1.b()))
            {
                map.put(gyh1.b(), new gyj(gyh1.b(), gyh1.a(), "binary"));
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
        obj1 = CommonUtils.i(super.k);
        obj2 = f();
        flag = flag1;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        if (o == null) goto _L4; else goto _L3
_L3:
        Object obj = (Map)o.get();
_L9:
        Map map = a(((Map) (obj)), p);
        obj = ((hbz) (obj2)).a;
        obj2 = map.values();
        boolean flag2 = true;
        if (!"new".equals(((hbj) (obj)).a)) goto _L6; else goto _L5
_L5:
        obj1 = a(hbs.a(super.k, ((String) (obj1))), ((Collection) (obj2)));
        if (!(new hbm(this, g(), ((hbj) (obj)).b, a)).a(((hbi) (obj1)))) goto _L8; else goto _L7
_L7:
        flag = hbw.a().c();
_L2:
        return Boolean.valueOf(flag);
_L4:
        obj = new HashMap();
          goto _L9
_L8:
        gya.a().c("Fabric", "Failed to create app with Crashlytics service.", null);
        flag = false;
          goto _L2
_L6:
        try
        {
label0:
            {
                if (!"configured".equals(((hbj) (obj)).a))
                {
                    break label0;
                }
                flag = hbw.a().c();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gya.a().c("Fabric", "Error performing auto configuration.", ((Throwable) (obj)));
            flag = flag1;
        }
          goto _L2
        flag = flag2;
        if (!((hbj) (obj)).d) goto _L2; else goto _L10
_L10:
        gya.a().a("Fabric", "Server says an update is required - forcing a full App update.");
        obj1 = a(hbs.a(super.k, ((String) (obj1))), ((Collection) (obj2)));
        (new hcd(this, g(), ((hbj) (obj)).b, a)).a(((hbi) (obj1)));
        flag = flag2;
          goto _L2
    }

    private hbz f()
    {
        hbz hbz1;
        try
        {
            hbw.a().a(this, m, a, e, f, g()).b();
            hbz1 = hbw.a().a();
        }
        catch (Exception exception)
        {
            gya.a().c("Fabric", "Error dealing with settings", exception);
            return null;
        }
        return hbz1;
    }

    private String g()
    {
        return CommonUtils.d(super.k, "com.crashlytics.ApiEndpoint");
    }

    public final String a()
    {
        return "1.3.6.79";
    }

    public final String b()
    {
        return "io.fabric.sdk.android:fabric";
    }

    protected final boolean c_()
    {
        g = super.m.e();
        b = super.k.getPackageManager();
        c = super.k.getPackageName();
        d = b.getPackageInfo(c, 0);
        e = Integer.toString(d.versionCode);
        if (d.versionName != null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        String s = "0.0";
_L1:
        try
        {
            f = s;
            h = b.getApplicationLabel(super.k.getApplicationInfo()).toString();
            n = Integer.toString(super.k.getApplicationInfo().targetSdkVersion);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            gya.a().c("Fabric", "Failed init", namenotfoundexception);
            return false;
        }
        return true;
        s = d.versionName;
          goto _L1
    }

    protected final Object e()
    {
        return d();
    }
}
