// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import a.a.a.a.a.a.b;
import a.a.a.a.a.b.ah;
import a.a.a.a.a.b.s;
import a.a.a.a.a.b.x;
import a.a.a.a.a.b.y;
import a.a.a.a.a.f.d;
import a.a.a.a.a.g.q;
import a.a.a.a.a.g.v;
import a.a.a.a.f;
import a.a.a.a.p;
import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

// Referenced classes of package com.b.a.b:
//            j, f, l, b, 
//            k

public final class e extends p
    implements s
{

    private final b a = new b();
    private final j b = new j();
    private l c;

    public e()
    {
    }

    private static com.b.a.b.f a(Context context)
    {
        Object obj = null;
        context = context.getAssets().open("crashlytics-build.properties");
        if (context == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj = new Properties();
        ((Properties) (obj)).load(context);
        obj1 = new com.b.a.b.f(((Properties) (obj)).getProperty("version_code"), ((Properties) (obj)).getProperty("version_name"), ((Properties) (obj)).getProperty("build_id"), ((Properties) (obj)).getProperty("package_name"));
        f.d();
        (new StringBuilder()).append(((com.b.a.b.f) (obj1)).d).append(" build properties: ").append(((com.b.a.b.f) (obj1)).b).append(" (").append(((com.b.a.b.f) (obj1)).a).append(") - ").append(((com.b.a.b.f) (obj1)).c);
        obj = obj1;
_L9:
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
                f.d().b("Beta", "Error closing Beta build properties asset", context);
                return ((com.b.a.b.f) (obj));
            }
            obj1 = obj;
        }
_L4:
        return ((com.b.a.b.f) (obj1));
        obj1;
        context = null;
_L7:
        f.d().b("Beta", "Error reading Beta build properties", ((Throwable) (obj1)));
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
            f.d().b("Beta", "Error closing Beta build properties asset", ((Throwable) (obj)));
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
                f.d().b("Beta", "Error closing Beta build properties asset", context);
            }
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj1;
        context = ((Context) (obj));
        obj = obj1;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        Object obj2 = null;
        obj = context;
        context = obj2;
          goto _L7
        Exception exception;
        exception;
        obj = context;
        context = ((Context) (obj1));
        obj1 = exception;
          goto _L7
_L2:
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private String a(Context context, String s1)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            if (s1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = "io.crash.air".equals(s1);
        }
        if (flag)
        {
            f.d();
            try
            {
                context = (String)a.a(context, b);
                flag = "".equals(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                f.d().b("Beta", "Failed to load the Beta device token", context);
                return null;
            }
            if (flag)
            {
                context = null;
            }
            return context;
        } else
        {
            f.d();
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

    protected final Object d()
    {
        boolean flag1 = false;
        f.d();
        Context context = v();
        x x1 = u();
        if (TextUtils.isEmpty(a(context, x1.h())))
        {
            f.d();
            return Boolean.valueOf(false);
        }
        f.d();
        Object obj = q.a().b();
        com.b.a.b.f f1;
        boolean flag;
        if (obj != null)
        {
            obj = ((v) (obj)).f;
        } else
        {
            obj = null;
        }
        f1 = a(context);
        flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(((a.a.a.a.a.g.f) (obj)).a))
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
            c.a(context, this, x1, ((a.a.a.a.a.g.f) (obj)), f1, new d(this), new ah(), new a.a.a.a.a.e.b(f.d()));
        }
        return Boolean.valueOf(true);
    }

    public final Map e()
    {
        String s1 = u().h();
        s1 = a(v(), s1);
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s1))
        {
            hashmap.put(y.c, s1);
        }
        return hashmap;
    }

    protected final boolean e_()
    {
        v().getApplicationContext();
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            obj = new com.b.a.b.b(w().b(), w().c());
        } else
        {
            obj = new k();
        }
        c = ((l) (obj));
        return true;
    }
}
