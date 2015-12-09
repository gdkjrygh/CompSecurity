// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.spi;

import java.io.Serializable;

public final class ThrowableInformation
    implements Serializable
{

    private transient Throwable throwable;

    public ThrowableInformation(Throwable throwable1)
    {
        throwable = throwable1;
    }
}
