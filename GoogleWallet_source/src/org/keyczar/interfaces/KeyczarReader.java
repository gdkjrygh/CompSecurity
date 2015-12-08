// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.interfaces;

import org.keyczar.exceptions.KeyczarException;

public interface KeyczarReader
{

    public abstract String getKey(int i)
        throws KeyczarException;

    public abstract String getMetadata()
        throws KeyczarException;
}
