// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.i;
import c.j;
import com.squareup.okhttp.Protocol;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FrameReader, FrameWriter

public interface Variant
{

    public abstract Protocol getProtocol();

    public abstract FrameReader newReader(j j, boolean flag);

    public abstract FrameWriter newWriter(i i, boolean flag);
}
