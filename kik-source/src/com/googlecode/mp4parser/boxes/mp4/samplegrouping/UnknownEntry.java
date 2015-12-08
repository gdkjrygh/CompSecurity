// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.Hex;
import java.nio.ByteBuffer;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.samplegrouping:
//            GroupEntry

public class UnknownEntry extends GroupEntry
{

    private ByteBuffer content;
    private String type;

    public UnknownEntry(String s)
    {
        type = s;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UnknownEntry)obj;
            if (content == null ? ((UnknownEntry) (obj)).content != null : !content.equals(((UnknownEntry) (obj)).content))
            {
                return false;
            }
        }
        return true;
    }

    public ByteBuffer get()
    {
        return content.duplicate();
    }

    public ByteBuffer getContent()
    {
        return content;
    }

    public String getType()
    {
        return type;
    }

    public int hashCode()
    {
        if (content != null)
        {
            return content.hashCode();
        } else
        {
            return 0;
        }
    }

    public void parse(ByteBuffer bytebuffer)
    {
        content = (ByteBuffer)bytebuffer.duplicate().rewind();
    }

    public void setContent(ByteBuffer bytebuffer)
    {
        content = (ByteBuffer)bytebuffer.duplicate().rewind();
    }

    public String toString()
    {
        ByteBuffer bytebuffer = content.duplicate();
        bytebuffer.rewind();
        byte abyte0[] = new byte[bytebuffer.limit()];
        bytebuffer.get(abyte0);
        return (new StringBuilder("UnknownEntry{content=")).append(Hex.encodeHex(abyte0)).append('}').toString();
    }
}
