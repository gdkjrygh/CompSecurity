// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cv;
import cx;
import fx;
import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso.boxes:
//            AbstractMediaHeaderBox

public class SoundMediaHeaderBox extends AbstractMediaHeaderBox
{

    public static final String TYPE = "smhd";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private float balance;

    public SoundMediaHeaderBox()
    {
        super("smhd");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("SoundMediaHeaderBox.java", com/coremedia/iso/boxes/SoundMediaHeaderBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "float"), 36);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "java.lang.String"), 58);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        balance = cv.i(bytebuffer);
        cv.c(bytebuffer);
    }

    public float getBalance()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return balance;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.c(bytebuffer, balance);
        cx.b(bytebuffer, 0);
    }

    protected long getContentSize()
    {
        return 8L;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("SoundMediaHeaderBox[balance=")).append(getBalance()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
