// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.util.Log;
import com.google.android.m4b.maps.a.a;
import com.google.android.m4b.maps.a.k;
import com.google.android.m4b.maps.a.m;
import com.google.android.m4b.maps.a.n;
import com.google.android.m4b.maps.a.r;
import com.google.android.m4b.maps.y.h;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            ab

public class aa
    implements n
{

    private static final String a = com/google/android/m4b/maps/ay/aa.getSimpleName();

    public aa()
    {
    }

    private static String a(k k1)
    {
        Object obj = k1.c();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = "<empty>";
_L6:
        Object obj1 = obj;
_L7:
        com.google.android.m4b.maps.y.h.a a1;
        int i;
        try
        {
            obj = String.valueOf(k1.a());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = "[Error retriving headers]";
        }
        a1 = h.a(k1).a("URL", k1.b).a("Headers", obj);
        i = k1.a;
        i;
        JVM INSTR tableswitch 0 1: default 72
    //                   0 175
    //                   1 181;
           goto _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_181;
_L3:
        obj = (new StringBuilder(13)).append("(").append(i).append(")").toString();
_L8:
        return a1.a("Method", obj).a("Body", obj1).a("BodyContentType", k1.b()).toString();
_L2:
        i = obj.length;
        obj = (new StringBuilder(19)).append("[").append(i).append(" bytes]").toString();
          goto _L6
        obj;
        obj1 = "[Error retrieving body]";
          goto _L7
_L4:
        obj = "GET";
          goto _L8
        obj = "POST";
          goto _L8
    }

    private static String a(m m1)
    {
        if (m1.a())
        {
            return "Response{OK}";
        } else
        {
            m1 = a(m1.c);
            return (new StringBuilder(String.valueOf(m1).length() + 16)).append("Response{Error=").append(m1).append("}").toString();
        }
    }

    private static String a(r r1)
    {
        Object obj = r1.a;
        if (obj != null)
        {
            byte abyte0[] = ((com.google.android.m4b.maps.a.h) (obj)).b;
            obj = h.a(r1).a("ResponseCode", ((com.google.android.m4b.maps.a.h) (obj)).a).a("Headers", String.valueOf(((com.google.android.m4b.maps.a.h) (obj)).c));
            if (abyte0 == null)
            {
                r1 = "<empty>";
            } else
            {
                int i = abyte0.length;
                r1 = (new StringBuilder(19)).append("[").append(i).append(" bytes]").toString();
            }
            return ((com.google.android.m4b.maps.y.h.a) (obj)).a("Data", r1).toString();
        } else
        {
            r1 = String.valueOf(r1.getMessage());
            return (new StringBuilder(String.valueOf(r1).length() + 15)).append("VolleyError(\"").append(r1).append("\")").toString();
        }
    }

    public void a(k k1, m m1)
    {
        if (com.google.android.m4b.maps.ay.ab.a(a, 3))
        {
            String s = a;
            k1 = a(k1);
            m1 = a(m1);
            Log.d(s, (new StringBuilder(String.valueOf(k1).length() + 20 + String.valueOf(m1).length())).append("REQUEST: ").append(k1).append("\nRESPONSE: ").append(m1).toString());
        }
    }

    public void a(k k1, m m1, Runnable runnable)
    {
        if (com.google.android.m4b.maps.ay.ab.a(a, 3))
        {
            runnable = a;
            k1 = a(k1);
            m1 = a(m1);
            Log.d(runnable, (new StringBuilder(String.valueOf(k1).length() + 20 + String.valueOf(m1).length())).append("REQUEST: ").append(k1).append("\nRESPONSE: ").append(m1).toString());
        }
    }

    public void a(k k1, r r1)
    {
        if (com.google.android.m4b.maps.ay.ab.a(a, 3))
        {
            String s = a;
            k1 = a(k1);
            r1 = a(r1);
            Log.d(s, (new StringBuilder(String.valueOf(k1).length() + 17 + String.valueOf(r1).length())).append("REQUEST: ").append(k1).append("\nERROR: ").append(r1).toString());
        }
    }

}
