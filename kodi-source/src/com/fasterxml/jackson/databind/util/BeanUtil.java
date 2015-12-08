// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

public class BeanUtil
{

    protected static boolean isCglibGetCallbacks(AnnotatedMethod annotatedmethod)
    {
        annotatedmethod = annotatedmethod.getRawType();
        if (annotatedmethod != null && annotatedmethod.isArray())
        {
            if ((annotatedmethod = annotatedmethod.getComponentType().getPackage()) != null && ((annotatedmethod = annotatedmethod.getName()).contains(".cglib") && (annotatedmethod.startsWith("net.sf.cglib") || annotatedmethod.startsWith("org.hibernate.repackage.cglib") || annotatedmethod.startsWith("org.springframework.cglib"))))
            {
                return true;
            }
        }
        return false;
    }

    protected static boolean isGroovyMetaClassGetter(AnnotatedMethod annotatedmethod)
    {
        annotatedmethod = annotatedmethod.getRawType();
        if (annotatedmethod != null && !annotatedmethod.isArray())
        {
            if ((annotatedmethod = annotatedmethod.getPackage()) != null && annotatedmethod.getName().startsWith("groovy.lang"))
            {
                return true;
            }
        }
        return false;
    }

    protected static String legacyManglePropertyName(String s, int i)
    {
        int k = s.length();
        if (k == i)
        {
            return null;
        }
        StringBuilder stringbuilder = null;
        int j = i;
        do
        {
label0:
            {
                char c1;
                if (j < k)
                {
                    char c = s.charAt(j);
                    c1 = Character.toLowerCase(c);
                    if (c != c1)
                    {
                        break label0;
                    }
                }
                StringBuilder stringbuilder1;
                if (stringbuilder == null)
                {
                    return s.substring(i);
                } else
                {
                    return stringbuilder.toString();
                }
            }
            stringbuilder1 = stringbuilder;
            if (stringbuilder == null)
            {
                stringbuilder1 = new StringBuilder(k - i);
                stringbuilder1.append(s, i, k);
            }
            stringbuilder1.setCharAt(j - i, c1);
            j++;
            stringbuilder = stringbuilder1;
        } while (true);
    }

    public static String okNameForGetter(AnnotatedMethod annotatedmethod, boolean flag)
    {
        String s2 = annotatedmethod.getName();
        String s1 = okNameForIsGetter(annotatedmethod, s2, flag);
        String s = s1;
        if (s1 == null)
        {
            s = okNameForRegularGetter(annotatedmethod, s2, flag);
        }
        return s;
    }

    public static String okNameForIsGetter(AnnotatedMethod annotatedmethod, String s, boolean flag)
    {
        if (s.startsWith("is"))
        {
            annotatedmethod = annotatedmethod.getRawType();
            if (annotatedmethod == java/lang/Boolean || annotatedmethod == Boolean.TYPE)
            {
                if (flag)
                {
                    return stdManglePropertyName(s, 2);
                } else
                {
                    return legacyManglePropertyName(s, 2);
                }
            }
        }
        return null;
    }

    public static String okNameForMutator(AnnotatedMethod annotatedmethod, String s, boolean flag)
    {
        annotatedmethod = annotatedmethod.getName();
        if (annotatedmethod.startsWith(s))
        {
            if (flag)
            {
                return stdManglePropertyName(annotatedmethod, s.length());
            } else
            {
                return legacyManglePropertyName(annotatedmethod, s.length());
            }
        } else
        {
            return null;
        }
    }

    public static String okNameForRegularGetter(AnnotatedMethod annotatedmethod, String s, boolean flag)
    {
        if (!s.startsWith("get") || ("getCallbacks".equals(s) ? isCglibGetCallbacks(annotatedmethod) : "getMetaClass".equals(s) && isGroovyMetaClassGetter(annotatedmethod)))
        {
            return null;
        }
        if (flag)
        {
            return stdManglePropertyName(s, 3);
        } else
        {
            return legacyManglePropertyName(s, 3);
        }
    }

    protected static String stdManglePropertyName(String s, int i)
    {
        int j = s.length();
        if (j == i)
        {
            return null;
        }
        char c = s.charAt(i);
        char c1 = Character.toLowerCase(c);
        if (c == c1)
        {
            return s.substring(i);
        }
        if (i + 1 < j && Character.isUpperCase(s.charAt(i + 1)))
        {
            return s.substring(i);
        } else
        {
            StringBuilder stringbuilder = new StringBuilder(j - i);
            stringbuilder.append(c1);
            stringbuilder.append(s, i + 1, j);
            return stringbuilder.toString();
        }
    }
}
