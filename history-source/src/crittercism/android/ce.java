// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.OutputStream;
import org.json.JSONArray;

// Referenced classes of package crittercism.android:
//            bo, ed, cf, dx

public final class ce extends bo
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(crittercism/android/ce$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("NORMAL", 0);
            b = new a("URGENT", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public static final ce a;
    private String b;
    private String c;
    private String d;
    private a e;

    public ce(String s, a a1)
    {
        this(s, ed.a.a(), a1);
    }

    private ce(String s, String s1, a a1)
    {
        d = cf.a.a();
        String s2 = s;
        if (s.length() > 140)
        {
            s2 = s.substring(0, 140);
        }
        b = s2;
        c = s1;
        e = a1;
    }

    public final void a(OutputStream outputstream)
    {
        Object obj = new JSONArray();
        ((JSONArray) (obj)).put(b);
        ((JSONArray) (obj)).put(c);
        obj = ((JSONArray) (obj)).toString();
        (new StringBuilder("BREADCRUMB WRITING ")).append(((String) (obj)));
        dx.b();
        outputstream.write(((String) (obj)).getBytes());
    }

    public final String e()
    {
        return d;
    }

    static 
    {
        a = new ce("session_start", a.a);
    }
}
