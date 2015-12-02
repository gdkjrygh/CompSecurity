// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;

public abstract class bju extends Enum
    implements bjv
{

    public static final bju a;
    public static final bju b;
    public static final bju c;
    public static final bju d;
    public static final bju e;
    private static final bju f[];

    private bju(String s, int i)
    {
        super(s, i);
    }

    bju(String s, int i, byte byte0)
    {
        this(s, i);
    }

    private static String a(char c1, String s, int i)
    {
        if (i < s.length())
        {
            return (new StringBuilder()).append(c1).append(s.substring(i)).toString();
        } else
        {
            return String.valueOf(c1);
        }
    }

    static String a(String s)
    {
        return b(s);
    }

    static String a(String s, String s1)
    {
        return b(s, s1);
    }

    private static String b(String s)
    {
        int i = 0;
        StringBuilder stringbuilder = new StringBuilder();
        char c1;
        for (c1 = s.charAt(0); i < s.length() - 1 && !Character.isLetter(c1); c1 = s.charAt(i))
        {
            stringbuilder.append(c1);
            i++;
        }

        String s1;
        if (i == s.length())
        {
            s1 = stringbuilder.toString();
        } else
        {
            s1 = s;
            if (!Character.isUpperCase(c1))
            {
                return stringbuilder.append(a(Character.toUpperCase(c1), s, i + 1)).toString();
            }
        }
        return s1;
    }

    private static String b(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            char c1 = s.charAt(i);
            if (Character.isUpperCase(c1) && stringbuilder.length() != 0)
            {
                stringbuilder.append(s1);
            }
            stringbuilder.append(c1);
        }

        return stringbuilder.toString();
    }

    public static bju valueOf(String s)
    {
        return (bju)Enum.valueOf(bju, s);
    }

    public static bju[] values()
    {
        return (bju[])f.clone();
    }

    static 
    {
        a = new bju("IDENTITY") {

            public final String a(Field field)
            {
                return field.getName();
            }

        };
        b = new bju("UPPER_CAMEL_CASE") {

            public final String a(Field field)
            {
                return bju.a(field.getName());
            }

        };
        c = new bju("UPPER_CAMEL_CASE_WITH_SPACES") {

            public final String a(Field field)
            {
                return bju.a(bju.a(field.getName(), " "));
            }

        };
        d = new bju("LOWER_CASE_WITH_UNDERSCORES") {

            public final String a(Field field)
            {
                return bju.a(field.getName(), "_").toLowerCase();
            }

        };
        e = new bju("LOWER_CASE_WITH_DASHES") {

            public final String a(Field field)
            {
                return bju.a(field.getName(), "-").toLowerCase();
            }

        };
        f = (new bju[] {
            a, b, c, d, e
        });
    }
}
