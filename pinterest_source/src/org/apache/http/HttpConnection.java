// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;

import java.io.Closeable;

// Referenced classes of package org.apache.http:
//            HttpConnectionMetrics

public interface HttpConnection
    extends Closeable
{

    public abstract void close();

    public abstract HttpConnectionMetrics getMetrics();

    public abstract int getSocketTimeout();

    public abstract boolean isOpen();

    public abstract boolean isStale();

    public abstract void setSocketTimeout(int i);

    public abstract void shutdown();
}
