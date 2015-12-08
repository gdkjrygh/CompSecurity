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

    private static final FieldNamingPolicy $VALUES[];
    public static final FieldNamingPolicy IDENTITY;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;

    private FieldNamingPolicy(String s, int i)
    {
        super(s, i);
    }


    private static String modifyString(char c, String s, int i)
    {
        if (i < s.length())
        {
            return (new StringBuilder()).append(c).append(s.substring(i)).toString();
        } else
        {
            return String.valueOf(c);
        }
    }

    private static String separateCamelCase(String s, String s1)
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

    private static String upperCaseFirstLetter(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
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
                return stringbuilder.append(modifyString(Character.toUpperCase(c), s, i + 1)).toString();
            }
        }
        return s1;
    }

    public static FieldNamingPolicy valueOf(String s)
    {
        return (FieldNamingPolicy)Enum.valueOf(com/google/gson/FieldNamingPolicy, s);
    }

    public static FieldNamingPolicy[] values()
    {
        return (FieldNamingPolicy[])$VALUES.clone();
    }

    static 
    {
        IDENTITY = new FieldNamingPolicy("IDENTITY", 0) {

            public final String translateName(Field field)
            {
                return field.getName();
            }

        };
        UPPER_CAMEL_CASE = new FieldNamingPolicy("UPPER_CAMEL_CASE", 1) {

            public final String translateName(Field field)
            {
                return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
            }

        };
        UPPER_CAMEL_CASE_WITH_SPACES = new FieldNamingPolicy("UPPER_CAMEL_CASE_WITH_SPACES", 2) {

            public final String translateName(Field field)
            {
                return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), " "));
            }

        };
        LOWER_CASE_WITH_UNDERSCORES = new FieldNamingPolicy("LOWER_CASE_WITH_UNDERSCORES", 3) {

            public final String translateName(Field field)
            {
                return FieldNamingPolicy.separateCamelCase(field.getName(), "_").toLowerCase();
            }

        };
        LOWER_CASE_WITH_DASHES = new FieldNamingPolicy("LOWER_CASE_WITH_DASHES", 4) {

            public final String translateName(Field field)
            {
                return FieldNamingPolicy.separateCamelCase(field.getName(), "-").toLowerCase();
            }

        };
        $VALUES = (new FieldNamingPolicy[] {
            IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES
        });
    }


}
