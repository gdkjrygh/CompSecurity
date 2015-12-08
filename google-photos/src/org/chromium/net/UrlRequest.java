// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

// Referenced classes of package org.chromium.net:
//            UploadDataProvider

public interface UrlRequest
{

    public abstract void a();

    public abstract void a(String s);

    public abstract void a(String s, String s1);

    public abstract void a(ByteBuffer bytebuffer);

    public abstract void a(UploadDataProvider uploaddataprovider, Executor executor);

    public abstract void a(StatusListener statuslistener);

    public abstract void b();

    public abstract void c();
}
