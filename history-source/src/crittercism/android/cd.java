// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            ch, cf, ed

public final class cd extends ch
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a f[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(crittercism/android/cd$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("INTERNET_UP", 0);
            b = new a("INTERNET_DOWN", 1);
            c = new a("CONN_TYPE_GAINED", 2);
            d = new a("CONN_TYPE_LOST", 3);
            e = new a("CONN_TYPE_SWITCHED", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private String a;
    private String b;
    private a c;
    private String d;
    private String e;
    private String f;

    public cd(a a1)
    {
        a a2;
        if (a1 != a.a)
        {
            a2 = a.b;
        }
        a = cf.a.a();
        b = ed.a.a();
        c = a1;
    }

    public cd(a a1, String s)
    {
        a a2;
        if (a1 != a.c)
        {
            a2 = a.d;
        }
        a = cf.a.a();
        b = ed.a.a();
        c = a1;
        d = s;
    }

    public cd(a a1, String s, String s1)
    {
        a a2 = a.e;
        a = cf.a.a();
        b = ed.a.a();
        c = a1;
        e = s;
        f = s1;
    }

    public final JSONArray a()
    {
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("change", Integer.valueOf(c.ordinal()));
        if (c != a.c && c != a.d) goto _L2; else goto _L1
_L1:
        hashmap.put("type", d);
_L4:
        return (new JSONArray()).put(b).put(4).put(new JSONObject(hashmap));
_L2:
        if (c == a.e)
        {
            hashmap.put("oldType", e);
            hashmap.put("newType", f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String e()
    {
        return a;
    }
}
