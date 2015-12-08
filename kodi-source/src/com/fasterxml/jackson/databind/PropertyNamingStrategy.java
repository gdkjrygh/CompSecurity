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
    public static class LowerCaseStrategy extends PropertyNamingStrategyBase
    {

        public String translate(String s)
        {
            return s.toLowerCase();
        }

        public LowerCaseStrategy()
        {
        }
    }

    public static class LowerCaseWithUnderscoresStrategy extends PropertyNamingStrategyBase
    {

        public String translate(String s)
        {
            if (s != null) goto _L2; else goto _L1
_L1:
            return s;
_L2:
            int j1 = s.length();
            StringBuilder stringbuilder = new StringBuilder(j1 * 2);
            int i = 0;
            int l = 0;
            int k = 0;
            while (k < j1) 
            {
label0:
                {
                    char c = s.charAt(k);
                    int j;
                    int i1;
                    if (k <= 0)
                    {
                        i1 = i;
                        j = l;
                        if (c == '_')
                        {
                            break label0;
                        }
                    }
                    if (Character.isUpperCase(c))
                    {
                        j = i;
                        if (l == 0)
                        {
                            j = i;
                            if (i > 0)
                            {
                                j = i;
                                if (stringbuilder.charAt(i - 1) != '_')
                                {
                                    stringbuilder.append('_');
                                    j = i + 1;
                                }
                            }
                        }
                        c = Character.toLowerCase(c);
                        i = 1;
                    } else
                    {
                        boolean flag = false;
                        j = i;
                        i = ((flag) ? 1 : 0);
                    }
                    stringbuilder.append(c);
                    i1 = j + 1;
                    j = i;
                }
                k++;
                i = i1;
                l = j;
            }
            if (i > 0)
            {
                return stringbuilder.toString();
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public LowerCaseWithUnderscoresStrategy()
        {
        }
    }

    public static class PascalCaseStrategy extends PropertyNamingStrategyBase
    {

        public String translate(String s)
        {
            if (s != null && s.length() != 0)
            {
                char c = s.charAt(0);
                char c1 = Character.toUpperCase(c);
                if (c != c1)
                {
                    s = new StringBuilder(s);
                    s.setCharAt(0, c1);
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
    public static final PropertyNamingStrategy LOWER_CASE = new LowerCaseStrategy();
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
