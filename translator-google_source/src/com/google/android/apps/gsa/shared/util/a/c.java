// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.a;


public final class c
{

    public static String a(Class class1, String s, String s1)
    {
        Object obj;
        String s2;
        Object obj1;
        s2 = s;
        obj = s1;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        obj1 = class1;
_L3:
        s = ((Class) (obj1)).getEnclosingClass();
        if (s != null) goto _L2; else goto _L1
_L1:
        s = ((Class) (obj1)).getSimpleName();
        s2 = s;
        obj = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        s2 = s;
        obj = s1;
        if (class1 == obj1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        s1 = class1.getSimpleName();
        s2 = s;
        obj = s1;
        if (!s1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_149;
        }
        obj = class1.getName();
        class1 = ((String) (obj)).substring(((String) (obj)).lastIndexOf('$'));
        obj = class1;
        class1 = s;
_L4:
        if (obj == null)
        {
            return class1;
        } else
        {
            return (new StringBuilder(String.valueOf(class1).length() + 2 + String.valueOf(obj).length())).append(class1).append("[").append(((String) (obj))).append("]").toString();
        }
_L2:
        obj1 = s;
          goto _L3
        class1;
        class1 = s;
          goto _L4
        class1 = s2;
          goto _L4
    }
}
