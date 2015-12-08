// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Spdy3, Http20Draft04, FrameReader, FrameWriter

interface Variant
{

    public static final Variant HTTP_20_DRAFT_04 = new Http20Draft04();
    public static final Variant SPDY3 = new Spdy3();

    public abstract FrameReader newReader(InputStream inputstream, boolean flag);

    public abstract FrameWriter newWriter(OutputStream outputstream, boolean flag);

}
