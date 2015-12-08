// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import cv;
import cx;
import fx;
import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso.boxes:
//            AbstractMediaHeaderBox

public class VideoMediaHeaderBox extends AbstractMediaHeaderBox
{

    public static final String TYPE = "vmhd";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
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
        akN akn = new akN("VideoMediaHeaderBox.java", com/coremedia/iso/boxes/VideoMediaHeaderBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "int"), 39);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "[I"), 43);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 71);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 75);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"), 79);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        graphicsmode = cv.c(bytebuffer);
        opcolor = new int[3];
        int i = 0;
        do
        {
            if (i >= 3)
            {
                return;
            }
            opcolor[i] = cv.c(bytebuffer);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, graphicsmode);
        int ai[] = opcolor;
        int j = ai.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            cx.b(bytebuffer, ai[i]);
            i++;
        } while (true);
    }

    protected long getContentSize()
    {
        return 12L;
    }

    public int getGraphicsmode()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return graphicsmode;
    }

    public int[] getOpcolor()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return opcolor;
    }

    public void setGraphicsmode(int i)
    {
        akp akp = akN.a(ajc$tjp_4, this, akL.a(i));
        fx.a();
        fx.a(akp);
        graphicsmode = i;
    }

    public void setOpcolor(int ai[])
    {
        akp akp = akN.a(ajc$tjp_3, this, ai);
        fx.a();
        fx.a(akp);
        opcolor = ai;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("VideoMediaHeaderBox[graphicsmode=")).append(getGraphicsmode()).append(";opcolor0=").append(getOpcolor()[0]).append(";opcolor1=").append(getOpcolor()[1]).append(";opcolor2=").append(getOpcolor()[2]).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
