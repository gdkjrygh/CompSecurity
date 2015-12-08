// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import ft;
import fx;
import java.nio.ByteBuffer;

public class CompositionShiftLeastGreatestAtom extends ft
{

    public static final String TYPE = "cslg";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private static final akp.a ajc$tjp_9;
    int compositionOffsetToDisplayOffsetShift;
    int displayEndTime;
    int displayStartTime;
    int greatestDisplayOffset;
    int leastDisplayOffset;

    public CompositionShiftLeastGreatestAtom()
    {
        super("cslg");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("CompositionShiftLeastGreatestAtom.java", com/coremedia/iso/boxes/CompositionShiftLeastGreatestAtom);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 66);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "compositionOffsetToDisplayOffsetShift", "", "void"), 70);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 74);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "leastDisplayOffset", "", "void"), 78);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 82);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "setGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "greatestDisplayOffset", "", "void"), 86);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "getDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 90);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "setDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "displayStartTime", "", "void"), 94);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "getDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 98);
        ajc$tjp_9 = akn.a("method-execution", akn.a("1", "setDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "displayEndTime", "", "void"), 102);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        compositionOffsetToDisplayOffsetShift = bytebuffer.getInt();
        leastDisplayOffset = bytebuffer.getInt();
        greatestDisplayOffset = bytebuffer.getInt();
        displayStartTime = bytebuffer.getInt();
        displayEndTime = bytebuffer.getInt();
    }

    public int getCompositionOffsetToDisplayOffsetShift()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return compositionOffsetToDisplayOffsetShift;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.putInt(compositionOffsetToDisplayOffsetShift);
        bytebuffer.putInt(leastDisplayOffset);
        bytebuffer.putInt(greatestDisplayOffset);
        bytebuffer.putInt(displayStartTime);
        bytebuffer.putInt(displayEndTime);
    }

    protected long getContentSize()
    {
        return 24L;
    }

    public int getDisplayEndTime()
    {
        akp akp = akN.a(ajc$tjp_8, this);
        fx.a();
        fx.a(akp);
        return displayEndTime;
    }

    public int getDisplayStartTime()
    {
        akp akp = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(akp);
        return displayStartTime;
    }

    public int getGreatestDisplayOffset()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return greatestDisplayOffset;
    }

    public int getLeastDisplayOffset()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return leastDisplayOffset;
    }

    public void setCompositionOffsetToDisplayOffsetShift(int i)
    {
        akp akp = akN.a(ajc$tjp_1, this, akL.a(i));
        fx.a();
        fx.a(akp);
        compositionOffsetToDisplayOffsetShift = i;
    }

    public void setDisplayEndTime(int i)
    {
        akp akp = akN.a(ajc$tjp_9, this, akL.a(i));
        fx.a();
        fx.a(akp);
        displayEndTime = i;
    }

    public void setDisplayStartTime(int i)
    {
        akp akp = akN.a(ajc$tjp_7, this, akL.a(i));
        fx.a();
        fx.a(akp);
        displayStartTime = i;
    }

    public void setGreatestDisplayOffset(int i)
    {
        akp akp = akN.a(ajc$tjp_5, this, akL.a(i));
        fx.a();
        fx.a(akp);
        greatestDisplayOffset = i;
    }

    public void setLeastDisplayOffset(int i)
    {
        akp akp = akN.a(ajc$tjp_3, this, akL.a(i));
        fx.a();
        fx.a(akp);
        leastDisplayOffset = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
