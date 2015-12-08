// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.b;

import android.content.Context;
import com.aviary.android.feather.common.utils.g;
import com.aviary.android.feather.common.utils.i;
import java.util.HashMap;

// Referenced classes of package com.aviary.android.feather.common.b:
//            a

public class b
{

    private static b b;
    private a a;

    b(Context context)
    {
        String s = context.getPackageName();
        String s1 = i.a(context);
        if (s1 == null)
        {
            throw new IllegalStateException("API-KEY is missing. Did you forget to add the <meta-data android:name='com.aviary.android.feather.v1.API_KEY' android:value='your-api-key' /> inside the <application /> tag of your AndroidManifest.xml file?");
        }
        try
        {
            a = (a)g.a("com.aviary.android.feather.library.external.tracking.TrackerFactory", "create", new Class[] {
                android/content/Context, java/lang/String, java/lang/String, java/lang/String
            }, new Object[] {
                context, s, s1, "3.4.3"
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public static b a(Context context)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/aviary/android/feather/common/b/b;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new b(context);
        }
        com/aviary/android/feather/common/b/b;
        JVM INSTR monitorexit ;
_L2:
        return b;
        context;
        com/aviary/android/feather/common/b/b;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a()
    {
        if (a != null)
        {
            a.a();
        }
    }

    public void a(String s)
    {
        a(s, ((HashMap) (null)));
    }

    public void a(String s, String s1)
    {
        if (a != null)
        {
            a.a(s, s1);
        }
    }

    public void a(String s, String s1, boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("pack", s);
        hashmap.put("from", s1);
        if (flag)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        hashmap.put("success", s);
        a("content: purchased", hashmap);
    }

    public void a(String s, HashMap hashmap)
    {
        if (a != null)
        {
            a.a(s, hashmap);
        }
    }

    public transient void a(String s, String as[])
        throws IllegalArgumentException
    {
        if (a == null)
        {
            return;
        }
        if (as != null && as.length > 0)
        {
            if (as.length % 2 != 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("attributes array must be even. Found ").append(as.length).toString());
            }
            HashMap hashmap = new HashMap();
            for (int j = 0; j < as.length; j += 2)
            {
                hashmap.put(as[j], as[j + 1]);
            }

            a(s, hashmap);
            return;
        } else
        {
            a(s, ((HashMap) (null)));
            return;
        }
    }

    public void b()
    {
        if (a != null)
        {
            a.b();
        }
    }

    public void b(String s, String s1)
    {
        a("content: restored", new String[] {
            "pack", s, "from", s1
        });
    }

    public void c()
    {
        if (a != null)
        {
            a.c();
        }
    }

    public void c(String s, String s1)
    {
        a("content: installed", new String[] {
            "pack", s, "from", s1
        });
    }

    public void d(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("pack", s);
        hashmap.put("from", s1);
        a((new StringBuilder()).append(s1).append(": purchase_initiated").toString());
    }
}
