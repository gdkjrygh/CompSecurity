// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cv;
import cx;
import fF;
import fx;
import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso.boxes:
//            ChunkOffsetBox

public class StaticChunkOffsetBox extends ChunkOffsetBox
{

    public static final String TYPE = "stco";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private long chunkOffsets[];

    public StaticChunkOffsetBox()
    {
        super("stco");
        chunkOffsets = new long[0];
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("StaticChunkOffsetBox.java", com/coremedia/iso/boxes/StaticChunkOffsetBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "", "[J"), 39);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "", "void"), 47);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int j = fF.a(cv.a(bytebuffer));
        chunkOffsets = new long[j];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            chunkOffsets[i] = cv.a(bytebuffer);
            i++;
        } while (true);
    }

    public long[] getChunkOffsets()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return chunkOffsets;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, chunkOffsets.length);
        long al[] = chunkOffsets;
        int j = al.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            cx.b(bytebuffer, al[i]);
            i++;
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)((chunkOffsets.length << 2) + 8);
    }

    public void setChunkOffsets(long al[])
    {
        akp akp = akN.a(ajc$tjp_1, this, al);
        fx.a();
        fx.a(akp);
        chunkOffsets = al;
    }

    static 
    {
        ajc$preClinit();
    }
}
