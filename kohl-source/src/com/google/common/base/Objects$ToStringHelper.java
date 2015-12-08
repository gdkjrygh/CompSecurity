// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Objects, Preconditions

public static final class <init>
{

    private final StringBuilder builder;
    private String separator;

    public <init> add(String s, Object obj)
    {
        builder.append(separator).append((String)Preconditions.checkNotNull(s)).append('=').append(obj);
        separator = ", ";
        return this;
    }

    public separator addValue(Object obj)
    {
        builder.append(separator).append(obj);
        separator = ", ";
        return this;
    }

    public String toString()
    {
        return builder.append('}').toString();
    }

    private (String s)
    {
        separator = "";
        builder = (new StringBuilder(32)).append((String)Preconditions.checkNotNull(s)).append('{');
    }

    ull(String s, ull ull)
    {
        this(s);
    }
}
