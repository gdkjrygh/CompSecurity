// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

// Referenced classes of package com.google.gson:
//            FieldNamingStrategy

public abstract class FieldNamingPolicy extends Enum
    implements FieldNamingStrategy
{

    public static final FieldNamingPolicy IDENTITY;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;
    private static final FieldNamingPolicy a[];

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
        char c;
        for (c = s.charAt(0); i < s.length() - 1 && !Character.isLetter(c); c = s.charAt(i))
        {
            stringbuilder.append(c);
            i++;
        }

        String s1;
        if (i == s.length())
        {
            s1 = stringbuilder.toString();
        } else
        {
            s1 = s;
            if (!Character.isUpperCase(c))
            {
                c = Character.toUpperCase(c);
                i++;
                if (i < s.length())
                {
                    s = (new StringBuilder()).append(c).append(s.substring(i)).toString();
                } else
                {
                    s = String.valueOf(c);
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
            char c = s.charAt(i);
            if (Character.isUpperCase(c) && stringbuilder.length() != 0)
            {
                stringbuilder.append(s1);
            }
            stringbuilder.append(c);
        }

        return stringbuilder.toString();
    }

    public static FieldNamingPolicy valueOf(String s)
    {
        return (FieldNamingPolicy)Enum.valueOf(com/google/gson/FieldNamingPolicy, s);
    }

    public static FieldNamingPolicy[] values()
    {
        return (FieldNamingPolicy[])a.clone();
    }

    static 
    {
        IDENTITY = new FieldNamingPolicy("IDENTITY") {

            public final String translateName(Field field)
            {
                return field.getName();
            }

        };
        UPPER_CAMEL_CASE = new FieldNamingPolicy("UPPER_CAMEL_CASE") {

            public final String translateName(Field field)
            {
                return FieldNamingPolicy.a(field.getName());
            }

        };
        UPPER_CAMEL_CASE_WITH_SPACES = new FieldNamingPolicy("UPPER_CAMEL_CASE_WITH_SPACES") {

            public final String translateName(Field field)
            {
                return FieldNamingPolicy.a(FieldNamingPolicy.a(field.getName(), " "));
            }

        };
        LOWER_CASE_WITH_UNDERSCORES = new FieldNamingPolicy("LOWER_CASE_WITH_UNDERSCORES") {

            public final String translateName(Field field)
            {
                return FieldNamingPolicy.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }

        };
        LOWER_CASE_WITH_DASHES = new FieldNamingPolicy("LOWER_CASE_WITH_DASHES") {

            public final String translateName(Field field)
            {
                return FieldNamingPolicy.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }

        };
        a = (new FieldNamingPolicy[] {
            IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES
        });
    }
}
