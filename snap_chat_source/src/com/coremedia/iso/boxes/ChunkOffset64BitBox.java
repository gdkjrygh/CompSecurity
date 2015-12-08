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

public class ChunkOffset64BitBox extends ChunkOffsetBox
{

    public static final String TYPE = "co64";
    private static final akp.a ajc$tjp_0;
    private long chunkOffsets[];

    public ChunkOffset64BitBox()
    {
        super("co64");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("ChunkOffset64BitBox.java", com/coremedia/iso/boxes/ChunkOffset64BitBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "", "", "", "[J"), 23);
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
            chunkOffsets[i] = cv.f(bytebuffer);
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
            cx.a(bytebuffer, al[i]);
            i++;
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)(chunkOffsets.length * 8 + 8);
    }

    static 
    {
        ajc$preClinit();
    }
}
