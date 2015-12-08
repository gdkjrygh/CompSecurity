// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox;
import org.b.b.a.a;
import org.b.b.b.b;

public class PiffSampleEncryptionBox extends AbstractSampleEncryptionBox
{

    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;

    public PiffSampleEncryptionBox()
    {
        super("uuid");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("PiffSampleEncryptionBox.java", com/googlecode/mp4parser/boxes/piff/PiffSampleEncryptionBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getAlgorithmId", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "", "", "", "int"), 46);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setAlgorithmId", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "int", "algorithmId", "", "void"), 50);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getIvSize", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "", "", "", "int"), 54);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setIvSize", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "int", "ivSize", "", "void"), 58);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getKid", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "", "", "", "[B"), 62);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setKid", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "[B", "kid", "", "void"), 66);
    }

    public int getAlgorithmId()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return algorithmId;
    }

    public int getIvSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return ivSize;
    }

    public byte[] getKid()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return kid;
    }

    public byte[] getUserType()
    {
        return (new byte[] {
            -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 
            108, 66, 124, 100, -115, -12
        });
    }

    public boolean isOverrideTrackEncryptionBoxParameters()
    {
        return (getFlags() & 1) > 0;
    }

    public void setAlgorithmId(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        algorithmId = i;
    }

    public void setIvSize(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        ivSize = i;
    }

    public void setKid(byte abyte0[])
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(a1);
        kid = abyte0;
    }

    public void setOverrideTrackEncryptionBoxParameters(boolean flag)
    {
        if (flag)
        {
            setFlags(getFlags() | 1);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffffe);
            return;
        }
    }

    static 
    {
        ajc$preClinit();
    }
}
