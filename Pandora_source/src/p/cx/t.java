// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package p.cx:
//            q, n

public interface t
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/cx/t$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("Yes", 0);
            b = new a("No", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract String a(String s)
        throws q, n;

    public abstract String a(String s, String s1, String s2)
        throws n, q, UnsupportedEncodingException;

    public abstract String a(String s, String s1, String s2, String s3)
        throws n, q, UnsupportedEncodingException;

    public abstract String a(String s, String s1, a a1)
        throws UnsupportedEncodingException, q, n;

    public abstract String a(String s, HashMap hashmap, int i)
        throws UnsupportedEncodingException;

    public abstract String a(String s, List list, a a1)
        throws UnsupportedEncodingException, q, n;

    public abstract String a(String s, Map map)
        throws q, n;

    public abstract String a(String s, a a1)
        throws q, n;

    public abstract void a();

    public abstract String b(String s)
        throws n, q;
}
