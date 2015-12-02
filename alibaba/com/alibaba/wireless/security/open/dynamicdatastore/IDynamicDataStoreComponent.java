// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.dynamicdatastore;

import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

public interface IDynamicDataStoreComponent
    extends IComponent
{

    public abstract boolean getBoolean(String s)
        throws SecException;

    public abstract byte[] getByteArray(String s)
        throws SecException;

    public abstract float getFloat(String s)
        throws SecException;

    public abstract int getInt(String s)
        throws SecException;

    public abstract long getLong(String s)
        throws SecException;

    public abstract String getString(String s)
        throws SecException;

    public abstract int putBoolean(String s, boolean flag)
        throws SecException;

    public abstract int putByteArray(String s, byte abyte0[])
        throws SecException;

    public abstract int putFloat(String s, float f)
        throws SecException;

    public abstract int putInt(String s, int i)
        throws SecException;

    public abstract int putLong(String s, long l)
        throws SecException;

    public abstract int putString(String s, String s1)
        throws SecException;

    public abstract void removeBoolean(String s)
        throws SecException;

    public abstract void removeByteArray(String s)
        throws SecException;

    public abstract void removeFloat(String s)
        throws SecException;

    public abstract void removeInt(String s)
        throws SecException;

    public abstract void removeLong(String s)
        throws SecException;

    public abstract void removeString(String s)
        throws SecException;
}
