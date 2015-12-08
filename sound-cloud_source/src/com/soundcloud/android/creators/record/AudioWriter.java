// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.soundcloud.android.creators.record:
//            AudioReader, AudioConfig

public interface AudioWriter
    extends Closeable
{

    public abstract void finalizeStream()
        throws IOException;

    public abstract AudioReader getAudioReader()
        throws IOException;

    public abstract AudioConfig getConfig();

    public abstract long getDuration();

    public abstract boolean isClosed();

    public abstract boolean setNewPosition(long l)
        throws IOException;

    public abstract int write(ByteBuffer bytebuffer, int i)
        throws IOException;
}
