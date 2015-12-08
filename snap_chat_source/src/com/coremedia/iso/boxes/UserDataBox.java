// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import cs;
import fs;
import fv;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class UserDataBox extends fs
{

    public static final String TYPE = "udta";

    public UserDataBox()
    {
        super("udta");
    }

    public void getBox(WritableByteChannel writablebytechannel)
    {
        super.getBox(writablebytechannel);
    }

    public void parse(fv fv, ByteBuffer bytebuffer, long l, cs cs)
    {
        super.parse(fv, bytebuffer, l, cs);
    }
}
