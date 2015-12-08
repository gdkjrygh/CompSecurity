// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import org.b.b.b.b;

public abstract class ChunkOffsetBox extends AbstractFullBox
{

    private static final org.b.a.a.a ajc$tjp_0;

    public ChunkOffsetBox(String s)
    {
        super(s);
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("ChunkOffsetBox.java", com/coremedia/iso/boxes/ChunkOffsetBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"), 17);
    }

    public abstract long[] getChunkOffsets();

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder(String.valueOf(getClass().getSimpleName()))).append("[entryCount=").append(getChunkOffsets().length).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
