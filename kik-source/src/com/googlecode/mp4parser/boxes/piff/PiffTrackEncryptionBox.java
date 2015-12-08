// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox;
import org.b.b.b.b;

public class PiffTrackEncryptionBox extends AbstractTrackEncryptionBox
{

    private static final org.b.a.a.a ajc$tjp_0;

    public PiffTrackEncryptionBox()
    {
        super("uuid");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("PiffTrackEncryptionBox.java", com/googlecode/mp4parser/boxes/piff/PiffTrackEncryptionBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getFlags", "com.googlecode.mp4parser.boxes.piff.PiffTrackEncryptionBox", "", "", "", "int"), 29);
    }

    public int getFlags()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return 0;
    }

    public byte[] getUserType()
    {
        return (new byte[] {
            -119, 116, -37, -50, 123, -25, 76, 81, -124, -7, 
            113, 72, -7, -120, 37, 84
        });
    }

    static 
    {
        ajc$preClinit();
    }
}
