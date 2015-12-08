// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import cs;
import fv;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            AudioSampleEntry

class val.owmaSpecifics
    implements Box
{

    final AudioSampleEntry this$0;
    private final ByteBuffer val$owmaSpecifics;
    private final long val$remaining;

    public void getBox(WritableByteChannel writablebytechannel)
    {
        val$owmaSpecifics.rewind();
        writablebytechannel.write(val$owmaSpecifics);
    }

    public long getOffset()
    {
        return 0L;
    }

    public Container getParent()
    {
        return AudioSampleEntry.this;
    }

    public long getSize()
    {
        return val$remaining;
    }

    public String getType()
    {
        return "----";
    }

    public void parse(fv fv, ByteBuffer bytebuffer, long l, cs cs)
    {
        throw new RuntimeException("NotImplemented");
    }

    public void setParent(Container container)
    {
        if (!AudioSampleEntry.$assertionsDisabled && container != AudioSampleEntry.this)
        {
            throw new AssertionError("you cannot diswown this special box");
        } else
        {
            return;
        }
    }

    ()
    {
        this$0 = final_audiosampleentry;
        val$remaining = l;
        val$owmaSpecifics = ByteBuffer.this;
        super();
    }
}
