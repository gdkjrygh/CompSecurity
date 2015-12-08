// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import java.io.Serializable;

public abstract class VersionedSerializable
    implements Serializable
{

    private final int instanceVersion = getLatestVersion();

    public VersionedSerializable()
    {
    }

    public int getInstanceVersion()
    {
        return instanceVersion;
    }

    public abstract int getLatestVersion();

    public boolean isStale()
    {
        return instanceVersion < getLatestVersion();
    }
}
