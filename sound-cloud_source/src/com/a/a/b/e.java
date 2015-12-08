// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import b.a.a.a.a.a.b;
import b.a.a.a.a.b.o;
import b.a.a.a.a.b.t;
import b.a.a.a.a.b.z;
import b.a.a.a.a.g.f;
import b.a.a.a.a.g.q;
import b.a.a.a.d;
import b.a.a.a.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

// Referenced classes of package com.a.a.b:
//            j, f, l, b, 
//            k

public final class e extends l
    implements o
{

    private final b a = new b();
    private final j b = new j();
    private com.a.a.b.l c;

    public e()
    {
    }

    private static com.a.a.b.f a(Context context)
    {
        Object obj = null;
        context = context.getAssets().open("crashlytics-build.properties");
        if (context == null) goto _L2; else goto _L1
_L1:
        obj = new Properties();
        ((Properties) (obj)).load(context);
        obj = new com.a.a.b.f(((Properties) (obj)).getProperty("version_code"), ((Properties) (obj)).getProperty("version_name"), ((Properties) (obj)).getProperty("build_id"), ((Properties) (obj)).getProperty("package_name"));
        b.a.a.a.d.a();
        (new StringBuilder()).append(((com.a.a.b.f) (obj)).d).append(" build properties: ").append(((com.a.a.b.f) (obj)).b).append(" (").append(((com.a.a.b.f) (obj)).a).append(") - ").append(((com.a.a.b.f) (obj)).c);
_L9:
        Object obj1;
        obj1 = obj;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                b.a.a.a.d.a();
                return ((com.a.a.b.f) (obj));
            }
            obj1 = obj;
        }
_L4:
        return ((com.a.a.b.f) (obj1));
        context;
        context = null;
_L7:
        b.a.a.a.d.a();
        obj1 = context;
        if (obj == null) goto _L4; else goto _L3
_L3:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.a.a.a.d.a();
            return context;
        }
        return context;
        obj;
        context = null;
_L6:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                b.a.a.a.d.a();
            }
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        Object obj2;
        obj2;
        context = ((Context) (obj));
        obj = obj2;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        Object obj3 = null;
        obj = context;
        context = obj3;
          goto _L7
        obj3;
        Context context1 = context;
        context = ((Context) (obj));
        obj = context1;
          goto _L7
_L2:
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private String a(Context context, String s)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            if (s == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = "io.crash.air".equals(s);
        }
        if (flag)
        {
            b.a.a.a.d.a();
            try
            {
                context = (String)a.a(context, b);
                flag = "".equals(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                b.a.a.a.d.a();
                return null;
            }
            if (flag)
            {
                context = null;
            }
            return context;
        } else
        {
            b.a.a.a.d.a();
            return null;
        }
    }

    public final String a()
    {
        return "1.1.3.61";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:beta";
    }

    public final Map c()
    {
        String s = super.p.e();
        s = a(super.n, s);
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s))
        {
            hashmap.put(b.a.a.a.a.b.t.a.c, s);
        }
        return hashmap;
    }

    protected final Object d()
    {
        boolean flag1 = false;
        b.a.a.a.d.a();
        Context context = super.n;
        t t1 = super.p;
        if (TextUtils.isEmpty(a(context, t1.e())))
        {
            b.a.a.a.d.a();
            return Boolean.valueOf(false);
        }
        b.a.a.a.d.a();
        Object obj = b.a.a.a.a.g.q.a.a().a();
        com.a.a.b.f f1;
        boolean flag;
        if (obj != null)
        {
            obj = ((b.a.a.a.a.g.t) (obj)).f;
        } else
        {
            obj = null;
        }
        f1 = a(context);
        flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(((f) (obj)).a))
            {
                flag = flag1;
                if (f1 != null)
                {
                    flag = true;
                }
            }
        }
        if (flag)
        {
            c.a(context, this, t1, ((f) (obj)), f1, new b.a.a.a.a.f.d(this), new z(), new b.a.a.a.a.e.b(b.a.a.a.d.a()));
        }
        return Boolean.valueOf(true);
    }

    protected final boolean e()
    {
        super.n.getApplicationContext();
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            obj = new com.a.a.b.b(super.l.d, super.l.c);
        } else
        {
            obj = new k();
        }
        c = ((com.a.a.b.l) (obj));
        return true;
    }
}
