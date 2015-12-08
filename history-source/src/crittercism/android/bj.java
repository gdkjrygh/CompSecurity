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

public final class bj extends ch
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(crittercism/android/bj$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("ACTIVATED", 0);
            b = new a("DEACTIVATED", 1);
            c = (new a[] {
                a, b
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

    public bj(a a1, String s)
    {
        a = cf.a.a();
        b = ed.a.a();
        c = a1;
        d = s;
    }

    public final JSONArray a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", Integer.valueOf(c.ordinal()));
        hashmap.put("viewName", d);
        return (new JSONArray()).put(b).put(5).put(new JSONObject(hashmap));
    }

    public final String e()
    {
        return a;
    }
}
