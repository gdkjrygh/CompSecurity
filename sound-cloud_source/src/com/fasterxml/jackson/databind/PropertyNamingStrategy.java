// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.io.Serializable;

public abstract class PropertyNamingStrategy
    implements Serializable
{
    public static class LowerCaseWithUnderscoresStrategy extends PropertyNamingStrategyBase
    {

        public String translate(String s)
        {
            if (s != null)
            {
                int k1 = s.length();
                StringBuilder stringbuilder = new StringBuilder(k1 * 2);
                int j1 = 0;
                int j = 0;
                int i = 0;
                while (j1 < k1) 
                {
                    char c = s.charAt(j1);
                    if (j1 > 0 || c != '_')
                    {
                        int l;
                        if (Character.isUpperCase(c))
                        {
                            int k = i;
                            if (j == 0)
                            {
                                k = i;
                                if (i > 0)
                                {
                                    k = i;
                                    if (stringbuilder.charAt(i - 1) != '_')
                                    {
                                        stringbuilder.append('_');
                                        k = i + 1;
                                    }
                                }
                            }
                            c = Character.toLowerCase(c);
                            i = 1;
                            j = k;
                        } else
                        {
                            j = i;
                            i = 0;
                        }
                        stringbuilder.append(c);
                        j++;
                    } else
                    {
                        int i1 = j;
                        j = i;
                        i = i1;
                    }
                    j1++;
                    l = i;
                    i = j;
                    j = l;
                }
                if (i > 0)
                {
                    return stringbuilder.toString();
                }
            }
            return s;
        }

        public LowerCaseWithUnderscoresStrategy()
        {
        }
    }

    public static class PascalCaseStrategy extends PropertyNamingStrategyBase
    {

        public String translate(String s)
        {
            char c;
            if (s != null && s.length() != 0)
            {
                if (!Character.isUpperCase(c = s.charAt(0)))
                {
                    s = new StringBuilder(s);
                    s.setCharAt(0, Character.toUpperCase(c));
                    return s.toString();
                }
            }
            return s;
        }

        public PascalCaseStrategy()
        {
        }
    }

    public static abstract class PropertyNamingStrategyBase extends PropertyNamingStrategy
    {

        public String nameForConstructorParameter(MapperConfig mapperconfig, AnnotatedParameter annotatedparameter, String s)
        {
            return translate(s);
        }

        public String nameForField(MapperConfig mapperconfig, AnnotatedField annotatedfield, String s)
        {
            return translate(s);
        }

        public String nameForGetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
        {
            return translate(s);
        }

        public String nameForSetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
        {
            return translate(s);
        }

        public abstract String translate(String s);

        public PropertyNamingStrategyBase()
        {
        }
    }


    public static final PropertyNamingStrategy CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES = new LowerCaseWithUnderscoresStrategy();
    public static final PropertyNamingStrategy PASCAL_CASE_TO_CAMEL_CASE = new PascalCaseStrategy();

    public PropertyNamingStrategy()
    {
    }

    public String nameForConstructorParameter(MapperConfig mapperconfig, AnnotatedParameter annotatedparameter, String s)
    {
        return s;
    }

    public String nameForField(MapperConfig mapperconfig, AnnotatedField annotatedfield, String s)
    {
        return s;
    }

    public String nameForGetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
    {
        return s;
    }

    public String nameForSetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
    {
        return s;
    }

}
