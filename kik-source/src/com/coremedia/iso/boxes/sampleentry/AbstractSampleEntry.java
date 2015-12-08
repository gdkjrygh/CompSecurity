// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            SampleEntry

public abstract class AbstractSampleEntry extends AbstractContainerBox
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

    public abstract void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser);

    public void setDataReferenceIndex(int i)
    {
        dataReferenceIndex = i;
    }
}
