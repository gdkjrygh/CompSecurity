// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.l;
import b.a.a.a.a.b.x;
import b.a.a.a.a.e.b;
import b.a.a.a.a.e.m;
import b.a.a.a.a.g.aa;
import b.a.a.a.a.g.d;
import b.a.a.a.a.g.e;
import b.a.a.a.a.g.h;
import b.a.a.a.a.g.n;
import b.a.a.a.a.g.q;
import b.a.a.a.a.g.v;
import java.util.Collection;

// Referenced classes of package b.a.a.a:
//            o, f, q

final class r extends o
{

    private final Collection a;
    private final m g = new b();
    private PackageManager h;
    private String i;
    private PackageInfo j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;

    public r(Collection collection)
    {
        a = collection;
    }

    private d a(n n1, Collection collection)
    {
        Object obj = super.d;
        new j();
        String s = b.a.a.a.a.b.j.a(((Context) (obj)));
        obj = b.a.a.a.a.b.l.a(new String[] {
            b.a.a.a.a.b.l.l(((Context) (obj)))
        });
        int i1 = b.a.a.a.a.b.r.a(m).a();
        return new d(s, super.f.c(), l, k, ((String) (obj)), n, i1, o, "0", n1, collection);
    }

    private Boolean b()
    {
        Object obj;
        Object obj1;
        Collection collection;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        obj1 = b.a.a.a.a.b.l.j(super.d);
        try
        {
            q.a().a(this, f, g, k, l, e()).c();
            obj = q.a().b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            f.c().c("Fabric", "Error dealing with settings", ((Throwable) (obj)));
            obj = null;
        }
        flag = flag1;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((v) (obj)).a;
        collection = a;
        flag2 = true;
        if (!"new".equals(((e) (obj)).b)) goto _L4; else goto _L3
_L3:
        obj1 = a(b.a.a.a.a.g.n.a(super.d, ((String) (obj1))), collection);
        if (!(new h(this, e(), ((e) (obj)).c, g)).a(((d) (obj1)))) goto _L6; else goto _L5
_L5:
        flag = q.a().d();
_L2:
        return Boolean.valueOf(flag);
_L6:
        f.c().c("Fabric", "Failed to create app with Crashlytics service.", null);
        flag = false;
        continue; /* Loop/switch isn't completed */
_L4:
        if ("configured".equals(((e) (obj)).b))
        {
            flag = q.a().d();
            continue; /* Loop/switch isn't completed */
        }
        flag = flag2;
        if (!((e) (obj)).e)
        {
            continue; /* Loop/switch isn't completed */
        }
        f.c().a("Fabric", "Server says an update is required - forcing a full App update.");
        obj1 = a(b.a.a.a.a.g.n.a(super.d, ((String) (obj1))), collection);
        (new aa(this, e(), ((e) (obj)).c, g)).a(((d) (obj1)));
        flag = flag2;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        f.c().c("Fabric", "Error performing auto configuration.", exception);
        flag = flag1;
        if (true) goto _L2; else goto _L7
_L7:
    }

    private String e()
    {
        return b.a.a.a.a.b.l.d(super.d, "com.crashlytics.ApiEndpoint");
    }

    protected final boolean a()
    {
        m = super.f.h();
        h = super.d.getPackageManager();
        i = super.d.getPackageName();
        j = h.getPackageInfo(i, 0);
        k = Integer.toString(j.versionCode);
        if (j.versionName != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        String s = "0.0";
_L1:
        try
        {
            l = s;
            n = h.getApplicationLabel(super.d.getApplicationInfo()).toString();
            o = Integer.toString(super.d.getApplicationInfo().targetSdkVersion);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            f.c().c("Fabric", "Failed init", namenotfoundexception);
            return false;
        }
        return true;
        s = j.versionName;
          goto _L1
    }

    public final String c()
    {
        return "io.fabric.sdk.android:fabric";
    }

    public final String d()
    {
        return "1.3.1.42";
    }

    protected final Object t()
    {
        return b();
    }
}
