// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.authoring.Sample;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            SMPTETTTrackImpl

class val.pix
    implements Sample
{

    final SMPTETTTrackImpl this$0;
    private final String val$finalXml;
    private final List val$pix;

    public ByteBuffer asByteBuffer()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            writeTo(Channels.newChannel(bytearrayoutputstream));
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return ByteBuffer.wrap(bytearrayoutputstream.toByteArray());
    }

    public long getSize()
    {
        long l = Utf8.convert(val$finalXml).length;
        Iterator iterator = val$pix.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return l;
            }
            l = ((File)iterator.next()).length() + l;
        } while (true);
    }

    public void writeTo(WritableByteChannel writablebytechannel)
    {
        Iterator iterator;
        writablebytechannel.write(ByteBuffer.wrap(Utf8.convert(val$finalXml)));
        iterator = val$pix.iterator();
_L2:
        if (!iterator.hasNext())
        {
            return;
        }
        FileInputStream fileinputstream = new FileInputStream((File)iterator.next());
        byte abyte0[] = new byte[8096];
        do
        {
            int i = fileinputstream.read(abyte0);
            if (-1 == i)
            {
                continue;
            }
            writablebytechannel.write(ByteBuffer.wrap(abyte0, 0, i));
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    ()
    {
        this$0 = final_smptetttrackimpl;
        val$finalXml = s;
        val$pix = List.this;
        super();
    }
}
