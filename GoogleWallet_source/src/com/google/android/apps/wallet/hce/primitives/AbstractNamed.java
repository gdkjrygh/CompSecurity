// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;

public abstract class AbstractNamed
    implements Serializable
{

    protected final String mName;

    protected AbstractNamed(String s)
    {
        mName = (String)Preconditions.checkNotNull(s);
    }

    public final boolean equals(Object obj)
    {
        return this == obj;
    }

    public int hashCode()
    {
        return mName.hashCode();
    }

    public String toString()
    {
        return mName;
    }
}
