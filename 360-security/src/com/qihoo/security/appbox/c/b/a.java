// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.c.b;

import android.content.Context;
import android.os.Environment;
import com.android.volley.Request;
import com.android.volley.e;
import com.android.volley.toolbox.c;
import com.android.volley.toolbox.f;
import com.qihoo.security.SecurityApplication;
import java.io.File;

public class a
{

    private static e a;
    private static c b;

    public static e a()
    {
        return a;
    }

    public static File a(Context context, String s)
    {
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            if (android.os.Build.VERSION.SDK_INT < 8)
            {
                return context.getExternalCacheDir();
            } else
            {
                context = (new StringBuilder()).append("/360/security/").append(s).append(File.separator).toString();
                return new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append(context).toString());
            }
        } else
        {
            return context.getCacheDir();
        }
    }

    public static File a(String s)
    {
        return b.c(s);
    }

    public static void a(Request request, Object obj)
    {
        if (obj != null)
        {
            request.a(obj);
        }
        a.a(request);
    }

    public static void a(Object obj)
    {
        a.a(obj);
    }

    private static e b()
    {
        e e1 = new e(c(), new com.qihoo.security.appbox.c.a(new f()));
        e1.a();
        return e1;
    }

    public static boolean b(String s)
    {
        s = a(s);
        if (s == null)
        {
            return false;
        } else
        {
            return s.exists();
        }
    }

    private static com.android.volley.a c()
    {
        return new c(a(SecurityApplication.a(), "cache"), 0xa00000);
    }

    static 
    {
        a = b();
        b = (c)a.d();
    }
}
