// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.authoring.Sample;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            SMPTETTTrackImpl

class val.file
    implements Sample
{

    final SMPTETTTrackImpl this$0;
    private final File val$file;

    public ByteBuffer asByteBuffer()
    {
        ByteBuffer bytebuffer;
        try
        {
            bytebuffer = ByteBuffer.wrap(SMPTETTTrackImpl.access$0(SMPTETTTrackImpl.this, new FileInputStream(val$file)));
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return bytebuffer;
    }

    public long getSize()
    {
        return val$file.length();
    }

    public void writeTo(WritableByteChannel writablebytechannel)
    {
        Channels.newOutputStream(writablebytechannel).write(SMPTETTTrackImpl.access$0(SMPTETTTrackImpl.this, new FileInputStream(val$file)));
    }

    ()
    {
        this$0 = final_smptetttrackimpl;
        val$file = File.this;
        super();
    }
}
