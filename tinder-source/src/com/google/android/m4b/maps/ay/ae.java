// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.util.Log;
import com.google.android.m4b.maps.d.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            c, ab, b, e, 
//            ad

public class ae
    implements com.google.android.m4b.maps.am.f.a
{

    private static final String a = com/google/android/m4b/maps/ay/ae.getSimpleName();
    private static final long b;
    private static e c = null;
    private final b d;

    public ae(Context context, String s)
    {
        this(context, s, com.google.android.m4b.maps.ay.c.c());
    }

    private ae(Context context, String s, b b1)
    {
        d = b1;
        a(context, s);
    }

    static a a(Map map)
    {
        com.google.android.m4b.maps.d.a.a aa[];
        int i;
        aa = new com.google.android.m4b.maps.d.a.a[map.size()];
        map = map.entrySet().iterator();
        i = 0;
_L2:
        java.util.Map.Entry entry;
        if (!map.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)map.next();
        aa[i] = new com.google.android.m4b.maps.d.a.a((String)entry.getKey(), (String)entry.getValue());
        i++;
        continue; /* Loop/switch isn't completed */
        com.google.android.m4b.maps.d.a.b b1;
        b1;
        if (com.google.android.m4b.maps.ay.ab.a(a, 6))
        {
            Log.e(a, "Invalid rule from Gservices: ", b1);
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (i == aa.length)
        {
            return new a(aa);
        } else
        {
            return new a((com.google.android.m4b.maps.d.a.a[])Arrays.copyOf(aa, i));
        }
    }

    private static void a(Context context, String s)
    {
        com/google/android/m4b/maps/ay/ae;
        JVM INSTR monitorenter ;
        e e1 = c;
        if (e1 == null) goto _L2; else goto _L1
_L1:
        com/google/android/m4b/maps/ay/ae;
        JVM INSTR monitorexit ;
        return;
_L2:
        c = new e(b, context, s) {

            private Context a;
            private String b;

            public final a a()
            {
                Map map = (new ad(a, b)).a();
                if (map == null)
                {
                    return null;
                } else
                {
                    return com.google.android.m4b.maps.ay.ae.a(map);
                }
            }

            
            {
                a = context;
                b = s;
                super(l);
            }
        };
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public final String a(String s)
    {
        Object obj;
        Object obj1;
        d.b();
        obj = c.b();
        obj1 = ((a) (obj)).b.matcher(s);
        if (!((Matcher) (obj1)).lookingAt()) goto _L2; else goto _L1
_L1:
        int i = 0;
_L12:
        if (i >= ((a) (obj)).a.length) goto _L2; else goto _L3
_L3:
        if (((Matcher) (obj1)).group(i + 1) == null) goto _L5; else goto _L4
_L4:
        obj = ((a) (obj)).a[i];
_L8:
        if (!((com.google.android.m4b.maps.d.a.a) (obj)).c) goto _L7; else goto _L6
_L6:
        obj1 = null;
_L10:
        return ((String) (obj1));
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = com.google.android.m4b.maps.d.a.a.d;
          goto _L8
_L7:
        obj1 = s;
        if (((com.google.android.m4b.maps.d.a.a) (obj)).b == null) goto _L10; else goto _L9
_L9:
        return (new StringBuilder()).append(((com.google.android.m4b.maps.d.a.a) (obj)).b).append(s.substring(((com.google.android.m4b.maps.d.a.a) (obj)).a.length())).toString();
        if (true) goto _L12; else goto _L11
_L11:
    }

    static 
    {
        b = TimeUnit.HOURS.toMillis(1L);
    }
}
