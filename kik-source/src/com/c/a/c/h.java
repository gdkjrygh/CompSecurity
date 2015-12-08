// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.c;


// Referenced classes of package com.c.a.c:
//            g, n

public final class h
{
    private static final class a extends Enum
        implements g
    {

        public static final a a;
        private static final a b[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/c/a/c/h$a, s);
        }

        public static a[] values()
        {
            return (a[])b.clone();
        }

        public final void a(Object obj, n n1)
        {
            n1.b((CharSequence)obj);
        }

        public final String toString()
        {
            return "Funnels.unencodedCharsFunnel()";
        }

        static 
        {
            a = new a("INSTANCE");
            b = (new a[] {
                a
            });
        }

        private a(String s)
        {
            super(s, 0);
        }
    }


    public static g a()
    {
        return a.a;
    }
}
