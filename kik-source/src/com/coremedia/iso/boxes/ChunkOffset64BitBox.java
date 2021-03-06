// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import org.b.b.b.b;

// Referenced classes of package com.coremedia.iso.boxes:
//            ChunkOffsetBox

public class ChunkOffset64BitBox extends ChunkOffsetBox
{

    public static final String TYPE = "co64";
    private static final org.b.a.a.a ajc$tjp_0;
    private long chunkOffsets[];

    public ChunkOffset64BitBox()
    {
        super("co64");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("ChunkOffset64BitBox.java", com/coremedia/iso/boxes/ChunkOffset64BitBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "", "", "", "[J"), 23);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int j = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        chunkOffsets = new long[j];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            chunkOffsets[i] = IsoTypeReader.readUInt64(bytebuffer);
            i++;
        } while (true);
    }

    public long[] getChunkOffsets()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return chunkOffsets;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, chunkOffsets.length);
        long al[] = chunkOffsets;
        int j = al.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            IsoTypeWriter.writeUInt64(bytebuffer, al[i]);
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
