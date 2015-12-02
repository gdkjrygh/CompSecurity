// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk.dynamicdatastore;

import com.taobao.wireless.security.sdk.IComponent;

public interface IDynamicDataStoreComponent
    extends IComponent
{

    public abstract boolean getBoolean(String s);

    public abstract byte[] getByteArray(String s);

    public abstract float getFloat(String s);

    public abstract int getInt(String s);

    public abstract long getLong(String s);

    public abstract String getString(String s);

    public abstract int putBoolean(String s, boolean flag);

    public abstract int putByteArray(String s, byte abyte0[]);

    public abstract int putFloat(String s, float f);

    public abstract int putInt(String s, int i);

    public abstract int putLong(String s, long l);

    public abstract int putString(String s, String s1);

    public abstract void removeBoolean(String s);

    public abstract void removeByteArray(String s);

    public abstract void removeFloat(String s);

    public abstract void removeInt(String s);

    public abstract void removeLong(String s);

    public abstract void removeString(String s);
}
