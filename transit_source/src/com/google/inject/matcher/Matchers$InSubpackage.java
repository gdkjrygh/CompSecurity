// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.matcher;

import java.io.Serializable;

// Referenced classes of package com.google.inject.matcher:
//            AbstractMatcher, Matchers

private static class targetPackageName extends AbstractMatcher
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final String targetPackageName;

    public boolean equals(Object obj)
    {
        return (obj instanceof targetPackageName) && ((targetPackageName)obj).targetPackageName.equals(targetPackageName);
    }

    public int hashCode()
    {
        return targetPackageName.hashCode() * 37;
    }

    public boolean matches(Class class1)
    {
        class1 = class1.getPackage().getName();
        return class1.equals(targetPackageName) || class1.startsWith((new StringBuilder()).append(targetPackageName).append(".").toString());
    }

    public volatile boolean matches(Object obj)
    {
        return matches((Class)obj);
    }

    public String toString()
    {
        return (new StringBuilder()).append("inSubpackage(").append(targetPackageName).append(")").toString();
    }

    public (String s)
    {
        targetPackageName = s;
    }
}
