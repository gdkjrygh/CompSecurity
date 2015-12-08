// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.threegpp26245;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import java.nio.ByteBuffer;

// Referenced classes of package com.googlecode.mp4parser.boxes.threegpp26245:
//            FontTableBox

public static class fontname
{

    int fontId;
    String fontname;

    public void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt16(bytebuffer, fontId);
        IsoTypeWriter.writeUInt8(bytebuffer, fontname.length());
        bytebuffer.put(Utf8.convert(fontname));
    }

    public int getSize()
    {
        return Utf8.utf8StringLengthInBytes(fontname) + 3;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        fontId = IsoTypeReader.readUInt16(bytebuffer);
        fontname = IsoTypeReader.readString(bytebuffer, IsoTypeReader.readUInt8(bytebuffer));
    }

    public String toString()
    {
        return (new StringBuilder("FontRecord{fontId=")).append(fontId).append(", fontname='").append(fontname).append('\'').append('}').toString();
    }

    public ()
    {
    }

    public (int i, String s)
    {
        fontId = i;
        fontname = s;
    }
}
