// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import okio.BufferedSink;
import okio.BufferedSource;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            FrameReader, FrameWriter

public interface Variant
{

    public abstract FrameReader newReader(BufferedSource bufferedsource, boolean flag);

    public abstract FrameWriter newWriter(BufferedSink bufferedsink, boolean flag);
}
