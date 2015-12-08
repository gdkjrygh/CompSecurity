// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


final class bp
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/advertising/android/bp$a, s);
        }

        public static a[] values()
        {
            a aa[] = c;
            int i = aa.length;
            a aa1[] = new a[i];
            System.arraycopy(aa, 0, aa1, 0, i);
            return aa1;
        }

        static 
        {
            a = new a("Link", 0);
            b = new a("Raw", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public static String a = "android";
    private final a b;
    private final String c;
    private final String d;
    private final int e;

    private bp(String s, String s1, int i)
    {
        if (s == null)
        {
            s = "";
        }
        d = s;
        b = a.a;
        c = s1;
        e = i;
    }

    public static bp a(String s, String s1, int i)
    {
        return new bp(s, s1, i);
    }

    public final String a()
    {
        return d;
    }

    public final void a(StringBuilder stringbuilder)
    {
        stringbuilder.append("<script type=\"text/javascript\"");
        if (b == a.a)
        {
            stringbuilder.append(" src=\"");
            stringbuilder.append(c);
            stringbuilder.append("\" >");
        } else
        {
            stringbuilder.append(">");
            stringbuilder.append(c);
        }
        stringbuilder.append("</script>");
    }

    public final int b()
    {
        return e;
    }

    final String c()
    {
        return c;
    }

}
