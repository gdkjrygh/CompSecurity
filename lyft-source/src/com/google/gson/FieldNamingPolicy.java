// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import java.lang.reflect.Field;

// Referenced classes of package com.google.gson:
//            FieldNamingStrategy

public abstract class FieldNamingPolicy extends Enum
    implements FieldNamingStrategy
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
        char c1;
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder();
        i = 0;
        c1 = s.charAt(0);
_L8:
        if (i < s.length() - 1 && !Character.isLetter(c1)) goto _L2; else goto _L1
_L1:
        if (i != s.length()) goto _L4; else goto _L3
_L3:
        String s1 = stringbuilder.toString();
_L6:
        return s1;
_L2:
        stringbuilder.append(c1);
        i++;
        c1 = s.charAt(i);
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = s;
        if (Character.isUpperCase(c1)) goto _L6; else goto _L5
_L5:
        return stringbuilder.append(a(Character.toUpperCase(c1), s, i + 1)).toString();
        if (true) goto _L8; else goto _L7
_L7:
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
        a = new FieldNamingPolicy("IDENTITY", 0) {

            public String a(Field field)
            {
                return field.getName();
            }

        };
        b = new FieldNamingPolicy("UPPER_CAMEL_CASE", 1) {

            public String a(Field field)
            {
                return FieldNamingPolicy.a(field.getName());
            }

        };
        c = new FieldNamingPolicy("UPPER_CAMEL_CASE_WITH_SPACES", 2) {

            public String a(Field field)
            {
                return FieldNamingPolicy.a(FieldNamingPolicy.a(field.getName(), " "));
            }

        };
        d = new FieldNamingPolicy("LOWER_CASE_WITH_UNDERSCORES", 3) {

            public String a(Field field)
            {
                return FieldNamingPolicy.a(field.getName(), "_").toLowerCase();
            }

        };
        e = new FieldNamingPolicy("LOWER_CASE_WITH_DASHES", 4) {

            public String a(Field field)
            {
                return FieldNamingPolicy.a(field.getName(), "-").toLowerCase();
            }

        };
        f = (new FieldNamingPolicy[] {
            a, b, c, d, e
        });
    }
}
