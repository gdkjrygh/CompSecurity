// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

// Referenced classes of package com.coremedia.iso.boxes:
//            AbstractMediaHeaderBox

public class VideoMediaHeaderBox extends AbstractMediaHeaderBox
{

    public static final String TYPE = "vmhd";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private int graphicsmode;
    private int opcolor[];

    public VideoMediaHeaderBox()
    {
        super("vmhd");
        graphicsmode = 0;
        opcolor = new int[3];
        setFlags(1);
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("VideoMediaHeaderBox.java", com/coremedia/iso/boxes/VideoMediaHeaderBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "int"), 39);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "[I"), 43);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 71);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 75);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"), 79);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        graphicsmode = IsoTypeReader.readUInt16(bytebuffer);
        opcolor = new int[3];
        int i = 0;
        do
        {
            if (i >= 3)
            {
                return;
            }
            opcolor[i] = IsoTypeReader.readUInt16(bytebuffer);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt16(bytebuffer, graphicsmode);
        int ai[] = opcolor;
        int j = ai.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            IsoTypeWriter.writeUInt16(bytebuffer, ai[i]);
            i++;
        } while (true);
    }

    protected long getContentSize()
    {
        return 12L;
    }

    public int getGraphicsmode()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return graphicsmode;
    }

    public int[] getOpcolor()
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return opcolor;
    }

    public void setGraphicsmode(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        graphicsmode = i;
    }

    public void setOpcolor(int ai[])
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, ai);
        RequiresParseDetailAspect.aspectOf().before(a1);
        opcolor = ai;
    }

    public String toString()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (new StringBuilder("VideoMediaHeaderBox[graphicsmode=")).append(getGraphicsmode()).append(";opcolor0=").append(getOpcolor()[0]).append(";opcolor1=").append(getOpcolor()[1]).append(";opcolor2=").append(getOpcolor()[2]).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
