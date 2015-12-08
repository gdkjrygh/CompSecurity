// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import b.a.a.a.a.b.h;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.n;
import b.a.a.a.a.b.t;
import b.a.a.a.a.e.b;
import b.a.a.a.a.e.g;
import b.a.a.a.a.g.d;
import b.a.a.a.a.g.e;
import b.a.a.a.a.g.q;
import b.a.a.a.a.g.y;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package b.a.a.a:
//            l, n, d

final class p extends l
{

    private final g a = new b();
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

    public p(Future future, Collection collection)
    {
        j = future;
        k = collection;
    }

    private d a(b.a.a.a.a.g.n n1, Collection collection)
    {
        Object obj = super.n;
        new h();
        String s = b.a.a.a.a.b.h.a(((Context) (obj)));
        obj = b.a.a.a.a.b.j.a(new String[] {
            b.a.a.a.a.b.j.m(((Context) (obj)))
        });
        int i1 = n.a(g).e;
        return new d(s, super.p.d, f, e, ((String) (obj)), h, i1, i, "0", n1, collection);
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
            l l1 = (l)collection.next();
            if (!map.containsKey(l1.b()))
            {
                map.put(l1.b(), new b.a.a.a.n(l1.b(), l1.a(), "binary"));
            }
        } while (true);
        return map;
    }

    private Boolean c()
    {
        Object obj1;
        Object obj2;
        boolean flag;
        boolean flag1;
        flag1 = false;
        obj1 = b.a.a.a.a.b.j.k(super.n);
        obj2 = f();
        flag = flag1;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        if (j == null) goto _L4; else goto _L3
_L3:
        Object obj = (Map)j.get();
_L9:
        Map map = a(((Map) (obj)), k);
        obj = ((b.a.a.a.a.g.t) (obj2)).a;
        obj2 = map.values();
        boolean flag2 = true;
        if (!"new".equals(((e) (obj)).b)) goto _L6; else goto _L5
_L5:
        obj1 = a(b.a.a.a.a.g.n.a(super.n, ((String) (obj1))), ((Collection) (obj2)));
        if (!(new b.a.a.a.a.g.h(this, g(), ((e) (obj)).c, a)).a(((d) (obj1)))) goto _L8; else goto _L7
_L7:
        flag = b.a.a.a.a.g.q.a.a().c();
_L2:
        return Boolean.valueOf(flag);
_L4:
        obj = new HashMap();
          goto _L9
_L8:
        b.a.a.a.d.a();
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
                flag = b.a.a.a.a.g.q.a.a().c();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.a.a.a.d.a();
            flag = flag1;
        }
          goto _L2
        flag = flag2;
        if (!((e) (obj)).e) goto _L2; else goto _L10
_L10:
        b.a.a.a.d.a();
        obj1 = a(b.a.a.a.a.g.n.a(super.n, ((String) (obj1))), ((Collection) (obj2)));
        (new y(this, g(), ((e) (obj)).c, a)).a(((d) (obj1)));
        flag = flag2;
          goto _L2
    }

    private b.a.a.a.a.g.t f()
    {
        b.a.a.a.a.g.t t1;
        try
        {
            b.a.a.a.a.g.q.a.a().a(this, p, a, e, f, g()).b();
            t1 = b.a.a.a.a.g.q.a.a().a();
        }
        catch (Exception exception)
        {
            b.a.a.a.d.a();
            return null;
        }
        return t1;
    }

    private String g()
    {
        return b.a.a.a.a.b.j.b(super.n, "com.crashlytics.ApiEndpoint");
    }

    public final String a()
    {
        return "1.3.6.79";
    }

    public final String b()
    {
        return "io.fabric.sdk.android:fabric";
    }

    protected final Object d()
    {
        return c();
    }

    protected final boolean e()
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
        String s = "0.0";
_L1:
        try
        {
            f = s;
            h = b.getApplicationLabel(super.n.getApplicationInfo()).toString();
            i = Integer.toString(super.n.getApplicationInfo().targetSdkVersion);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            b.a.a.a.d.a();
            return false;
        }
        return true;
        s = d.versionName;
          goto _L1
    }
}
