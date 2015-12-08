// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.matcher;

import com.google.inject.internal.util.$Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.inject.matcher:
//            AbstractMatcher, Matchers

private static class packageName extends AbstractMatcher
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final String packageName;
    private final transient Package targetPackage;

    public boolean equals(Object obj)
    {
        return (obj instanceof packageName) && ((packageName)obj).targetPackage.equals(targetPackage);
    }

    public int hashCode()
    {
        return targetPackage.hashCode() * 37;
    }

    public boolean matches(Class class1)
    {
        return class1.getPackage().equals(targetPackage);
    }

    public volatile boolean matches(Object obj)
    {
        return matches((Class)obj);
    }

    public Object readResolve()
    {
        return Matchers.inPackage(Package.getPackage(packageName));
    }

    public String toString()
    {
        return (new StringBuilder()).append("inPackage(").append(targetPackage.getName()).append(")").toString();
    }

    public s(Package package1)
    {
        targetPackage = (Package)$Preconditions.checkNotNull(package1, "package");
        packageName = package1.getName();
    }
}
