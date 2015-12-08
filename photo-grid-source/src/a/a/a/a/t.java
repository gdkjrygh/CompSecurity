// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import a.a.a.a.a.b.j;
import a.a.a.a.a.b.l;
import a.a.a.a.a.b.r;
import a.a.a.a.a.b.x;
import a.a.a.a.a.e.b;
import a.a.a.a.a.e.m;
import a.a.a.a.a.g.aa;
import a.a.a.a.a.g.d;
import a.a.a.a.a.g.e;
import a.a.a.a.a.g.h;
import a.a.a.a.a.g.n;
import a.a.a.a.a.g.q;
import a.a.a.a.a.g.v;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package a.a.a.a:
//            p, r, f, s

final class t extends p
{

    private final m a = new b();
    private PackageManager b;
    private String c;
    private PackageInfo d;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private final Future o;
    private final Collection p;

    public t(Future future, Collection collection)
    {
        o = future;
        p = collection;
    }

    private d a(n n1, Collection collection)
    {
        Object obj = super.g;
        new j();
        String s1 = a.a.a.a.a.b.j.a(((Context) (obj)));
        obj = a.a.a.a.a.b.l.a(new String[] {
            a.a.a.a.a.b.l.l(((Context) (obj)))
        });
        int i = r.a(l).a();
        return new d(s1, super.i.c(), k, j, ((String) (obj)), m, i, n, "0", n1, collection);
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
            p p1 = (p)collection.next();
            if (!map.containsKey(p1.b()))
            {
                map.put(p1.b(), new a.a.a.a.r(p1.b(), p1.a(), "binary"));
            }
        } while (true);
        return map;
    }

    private Boolean e()
    {
        Object obj1;
        Object obj2;
        boolean flag;
        boolean flag1;
        flag1 = false;
        obj1 = a.a.a.a.a.b.l.j(super.g);
        obj2 = f();
        flag = flag1;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        if (o == null) goto _L4; else goto _L3
_L3:
        Object obj = (Map)o.get();
_L9:
        Map map = a(((Map) (obj)), p);
        obj = ((v) (obj2)).a;
        obj2 = map.values();
        boolean flag2 = true;
        if (!"new".equals(((e) (obj)).b)) goto _L6; else goto _L5
_L5:
        obj1 = a(a.a.a.a.a.g.n.a(super.g, ((String) (obj1))), ((Collection) (obj2)));
        if (!(new h(this, g(), ((e) (obj)).c, a)).a(((d) (obj1)))) goto _L8; else goto _L7
_L7:
        flag = q.a().d();
_L2:
        return Boolean.valueOf(flag);
_L4:
        obj = new HashMap();
          goto _L9
_L8:
        a.a.a.a.f.d().b("Fabric", "Failed to create app with Crashlytics service.", null);
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
                flag = q.a().d();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a.a.a.f.d().b("Fabric", "Error performing auto configuration.", ((Throwable) (obj)));
            flag = flag1;
        }
          goto _L2
        flag = flag2;
        if (!((e) (obj)).e) goto _L2; else goto _L10
_L10:
        a.a.a.a.f.d();
        obj1 = a(a.a.a.a.a.g.n.a(super.g, ((String) (obj1))), ((Collection) (obj2)));
        (new aa(this, g(), ((e) (obj)).c, a)).a(((d) (obj1)));
        flag = flag2;
          goto _L2
    }

    private v f()
    {
        v v1;
        try
        {
            q.a().a(this, i, a, j, k, g()).c();
            v1 = q.a().b();
        }
        catch (Exception exception)
        {
            a.a.a.a.f.d().b("Fabric", "Error dealing with settings", exception);
            return null;
        }
        return v1;
    }

    private String g()
    {
        return a.a.a.a.a.b.l.c(super.g, "com.crashlytics.ApiEndpoint");
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
        return e();
    }

    protected final boolean e_()
    {
        l = super.i.h();
        b = super.g.getPackageManager();
        c = super.g.getPackageName();
        d = b.getPackageInfo(c, 0);
        j = Integer.toString(d.versionCode);
        if (d.versionName != null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        String s1 = "0.0";
_L1:
        try
        {
            k = s1;
            m = b.getApplicationLabel(super.g.getApplicationInfo()).toString();
            n = Integer.toString(super.g.getApplicationInfo().targetSdkVersion);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            a.a.a.a.f.d().b("Fabric", "Failed init", namenotfoundexception);
            return false;
        }
        return true;
        s1 = d.versionName;
          goto _L1
    }
}
