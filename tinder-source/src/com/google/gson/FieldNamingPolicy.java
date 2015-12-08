// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import java.lang.reflect.Field;

// Referenced classes of package com.google.gson:
//            d

public abstract class FieldNamingPolicy extends Enum
    implements d
{

    public static final FieldNamingPolicy a;
    public static final FieldNamingPolicy b;
    public static final FieldNamingPolicy c;
    public static final FieldNamingPolicy d;
    public static final FieldNamingPolicy e;
    private static final FieldNamingPolicy f[];

    private FieldNamingPolicy(String s, int i)
    {
        super(s, i);
    }

    FieldNamingPolicy(String s, int i, byte byte0)
    {
        this(s, i);
    }

    static String a(String s)
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
                c1 = Character.toUpperCase(c1);
                i++;
                if (i < s.length())
                {
                    s = (new StringBuilder()).append(c1).append(s.substring(i)).toString();
                } else
                {
                    s = String.valueOf(c1);
                }
                return stringbuilder.append(s).toString();
            }
        }
        return s1;
    }

    static String a(String s, String s1)
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

    public static FieldNamingPolicy valueOf(String s)
    {
        return (FieldNamingPolicy)Enum.valueOf(com/google/gson/FieldNamingPolicy, s);
    }

    public static FieldNamingPolicy[] values()
    {
        return (FieldNamingPolicy[])f.clone();
    }

    static 
    {
        a = new FieldNamingPolicy("IDENTITY") {

            public final String a(Field field)
            {
                return field.getName();
            }

        };
        b = new FieldNamingPolicy("UPPER_CAMEL_CASE") {

            public final String a(Field field)
            {
                return FieldNamingPolicy.a(field.getName());
            }

        };
        c = new FieldNamingPolicy("UPPER_CAMEL_CASE_WITH_SPACES") {

            public final String a(Field field)
            {
                return FieldNamingPolicy.a(FieldNamingPolicy.a(field.getName(), " "));
            }

        };
        d = new FieldNamingPolicy("LOWER_CASE_WITH_UNDERSCORES") {

            public final String a(Field field)
            {
                return FieldNamingPolicy.a(field.getName(), "_").toLowerCase();
            }

        };
        e = new FieldNamingPolicy("LOWER_CASE_WITH_DASHES") {

            public final String a(Field field)
            {
                return FieldNamingPolicy.a(field.getName(), "-").toLowerCase();
            }

        };
        f = (new FieldNamingPolicy[] {
            a, b, c, d, e
        });
    }
}
