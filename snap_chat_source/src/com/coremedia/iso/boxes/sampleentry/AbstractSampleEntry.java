// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import cs;
import fs;
import fv;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            SampleEntry

public abstract class AbstractSampleEntry extends fs
    implements SampleEntry
{

    protected int dataReferenceIndex;

    protected AbstractSampleEntry(String s)
    {
        super(s);
        dataReferenceIndex = 1;
    }

    public abstract void getBox(WritableByteChannel writablebytechannel);

    public int getDataReferenceIndex()
    {
        return dataReferenceIndex;
    }

    public abstract void parse(fv fv, ByteBuffer bytebuffer, long l, cs cs);

    public void setDataReferenceIndex(int i)
    {
        dataReferenceIndex = i;
    }
}
