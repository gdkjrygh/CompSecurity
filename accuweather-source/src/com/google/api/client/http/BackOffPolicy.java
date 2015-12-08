// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import java.io.IOException;

public interface BackOffPolicy
{

    public static final long STOP = -1L;

    public abstract long getNextBackOffMillis()
        throws IOException;

    public abstract boolean isBackOffRequired(int i);

    public abstract void reset();
}
