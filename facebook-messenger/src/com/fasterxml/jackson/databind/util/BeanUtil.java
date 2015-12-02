// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

public class BeanUtil
{

    public BeanUtil()
    {
    }

    protected static boolean isCglibGetCallbacks(AnnotatedMethod annotatedmethod)
    {
        annotatedmethod = annotatedmethod.getRawType();
        if (annotatedmethod != null && annotatedmethod.isArray())
        {
            if ((annotatedmethod = annotatedmethod.getComponentType().getPackage()) != null && ((annotatedmethod = annotatedmethod.getName()).startsWith("net.sf.cglib") || annotatedmethod.startsWith("org.hibernate.repackage.cglib")))
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

    protected static boolean isGroovyMetaClassSetter(AnnotatedMethod annotatedmethod)
    {
        boolean flag1 = false;
        annotatedmethod = annotatedmethod.getRawParameterType(0).getPackage();
        boolean flag = flag1;
        if (annotatedmethod != null)
        {
            flag = flag1;
            if (annotatedmethod.getName().startsWith("groovy.lang"))
            {
                flag = true;
            }
        }
        return flag;
    }

    protected static String manglePropertyName(String s)
    {
        StringBuilder stringbuilder;
        int j;
        stringbuilder = null;
        j = s.length();
        if (j != 0) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        int i = 0;
_L5:
        char c1;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        char c = s.charAt(i);
        c1 = Character.toLowerCase(c);
        if (c != c1)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (stringbuilder == null) goto _L4; else goto _L3
_L3:
        return stringbuilder.toString();
        StringBuilder stringbuilder1 = stringbuilder;
        if (stringbuilder == null)
        {
            stringbuilder1 = new StringBuilder(s);
        }
        stringbuilder1.setCharAt(i, c1);
        i++;
        stringbuilder = stringbuilder1;
          goto _L5
    }

    public static String okNameForGetter(AnnotatedMethod annotatedmethod)
    {
        String s2 = annotatedmethod.getName();
        String s1 = okNameForIsGetter(annotatedmethod, s2);
        String s = s1;
        if (s1 == null)
        {
            s = okNameForRegularGetter(annotatedmethod, s2);
        }
        return s;
    }

    public static String okNameForIsGetter(AnnotatedMethod annotatedmethod, String s)
    {
label0:
        {
            if (s.startsWith("is"))
            {
                annotatedmethod = annotatedmethod.getRawType();
                if (annotatedmethod == java/lang/Boolean || annotatedmethod == Boolean.TYPE)
                {
                    break label0;
                }
            }
            return null;
        }
        return manglePropertyName(s.substring(2));
    }

    public static String okNameForMutator(AnnotatedMethod annotatedmethod, String s)
    {
        annotatedmethod = annotatedmethod.getName();
        if (annotatedmethod.startsWith(s))
        {
            return manglePropertyName(annotatedmethod.substring(s.length()));
        } else
        {
            return null;
        }
    }

    public static String okNameForRegularGetter(AnnotatedMethod annotatedmethod, String s)
    {
        if (!s.startsWith("get") || ("getCallbacks".equals(s) ? isCglibGetCallbacks(annotatedmethod) : "getMetaClass".equals(s) && isGroovyMetaClassGetter(annotatedmethod)))
        {
            return null;
        } else
        {
            return manglePropertyName(s.substring(3));
        }
    }

    public static String okNameForSetter(AnnotatedMethod annotatedmethod)
    {
        String s = okNameForMutator(annotatedmethod, "set");
        if (s == null || "metaClass".equals(s) && isGroovyMetaClassSetter(annotatedmethod))
        {
            return null;
        } else
        {
            return s;
        }
    }
}
