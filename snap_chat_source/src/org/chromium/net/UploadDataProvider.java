// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;

// Referenced classes of package org.chromium.net:
//            UploadDataSink

public abstract class UploadDataProvider
{

    public UploadDataProvider()
    {
    }

    public abstract long a();

    public abstract void a(UploadDataSink uploaddatasink);

    public abstract void a(UploadDataSink uploaddatasink, ByteBuffer bytebuffer);
}
