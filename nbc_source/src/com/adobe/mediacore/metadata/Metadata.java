// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.metadata;

import java.util.Set;

public interface Metadata
{

    public abstract boolean containsKey(String s);

    public abstract byte[] getByteArray(String s);

    public abstract String getValue(String s);

    public abstract boolean isEmpty();

    public abstract Set keySet();

    public abstract void setByteArray(String s, byte abyte0[]);

    public abstract void setValue(String s, String s1);

    public abstract byte[] toByteArray();
}
