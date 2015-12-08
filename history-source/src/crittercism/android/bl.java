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

public final class bl extends ch
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a d[];
        private String c;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(crittercism/android/bl$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        public final String a()
        {
            return c;
        }

        static 
        {
            a = new a("FOREGROUND", 0, "foregrounded");
            b = new a("BACKGROUND", 1, "backgrounded");
            d = (new a[] {
                a, b
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            c = s1;
        }
    }


    private String a;
    private String b;
    private a c;

    public bl(a a1)
    {
        a = cf.a.a();
        b = ed.a.a();
        c = a1;
    }

    public final JSONArray a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", c.a());
        return (new JSONArray()).put(b).put(3).put(new JSONObject(hashmap));
    }

    public final String e()
    {
        return a;
    }
}
