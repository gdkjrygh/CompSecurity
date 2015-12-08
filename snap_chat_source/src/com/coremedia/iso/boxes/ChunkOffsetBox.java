// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import ft;
import fx;

public abstract class ChunkOffsetBox extends ft
{

    private static final akp.a ajc$tjp_0;

    public ChunkOffsetBox(String s)
    {
        super(s);
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("ChunkOffsetBox.java", com/coremedia/iso/boxes/ChunkOffsetBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"), 17);
    }

    public abstract long[] getChunkOffsets();

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder(String.valueOf(getClass().getSimpleName()))).append("[entryCount=").append(getChunkOffsets().length).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
