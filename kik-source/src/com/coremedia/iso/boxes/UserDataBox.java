// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class UserDataBox extends AbstractContainerBox
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

    public void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser)
    {
        super.parse(datasource, bytebuffer, l, boxparser);
    }
}
