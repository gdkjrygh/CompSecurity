// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.matcher;

import java.io.Serializable;

// Referenced classes of package com.google.inject.matcher:
//            AbstractMatcher, Matchers

private static class <init> extends AbstractMatcher
    implements Serializable
{

    private static final long serialVersionUID = 0L;

    public boolean matches(Object obj)
    {
        return true;
    }

    public Object readResolve()
    {
        return Matchers.any();
    }

    public String toString()
    {
        return "any()";
    }

    private er()
    {
    }

    er(er er)
    {
        this();
    }
}
