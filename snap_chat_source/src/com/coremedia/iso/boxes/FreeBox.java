// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import cs;
import cx;
import fF;
import fv;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            Box, Container

public class FreeBox
    implements Box
{

    static final boolean $assertionsDisabled;
    public static final String TYPE = "free";
    ByteBuffer data;
    private long offset;
    private Container parent;
    List replacers;

    public FreeBox()
    {
        replacers = new LinkedList();
        data = ByteBuffer.wrap(new byte[0]);
    }

    public FreeBox(int i)
    {
        replacers = new LinkedList();
        data = ByteBuffer.allocate(i);
    }

    public void addAndReplace(Box box)
    {
        data.position(fF.a(box.getSize()));
        data = data.slice();
        replacers.add(box);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FreeBox)obj;
            if (getData() == null ? ((FreeBox) (obj)).getData() != null : !getData().equals(((FreeBox) (obj)).getData()))
            {
                return false;
            }
        }
        return true;
    }

    public void getBox(WritableByteChannel writablebytechannel)
    {
        Object obj = replacers.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                obj = ByteBuffer.allocate(8);
                cx.b(((ByteBuffer) (obj)), data.limit() + 8);
                ((ByteBuffer) (obj)).put("free".getBytes());
                ((ByteBuffer) (obj)).rewind();
                writablebytechannel.write(((ByteBuffer) (obj)));
                ((ByteBuffer) (obj)).rewind();
                data.rewind();
                writablebytechannel.write(data);
                data.rewind();
                return;
            }
            ((Box)((Iterator) (obj)).next()).getBox(writablebytechannel);
        } while (true);
    }

    public ByteBuffer getData()
    {
        if (data != null)
        {
            return (ByteBuffer)data.duplicate().rewind();
        } else
        {
            return null;
        }
    }

    public long getOffset()
    {
        return offset;
    }

    public Container getParent()
    {
        return parent;
    }

    public long getSize()
    {
        Iterator iterator = replacers.iterator();
        long l = 8L;
        do
        {
            if (!iterator.hasNext())
            {
                return (long)data.limit() + l;
            }
            l = ((Box)iterator.next()).getSize() + l;
        } while (true);
    }

    public String getType()
    {
        return "free";
    }

    public int hashCode()
    {
        if (data != null)
        {
            return data.hashCode();
        } else
        {
            return 0;
        }
    }

    public void parse(fv fv1, ByteBuffer bytebuffer, long l, cs cs)
    {
        offset = fv1.position() - (long)bytebuffer.remaining();
        if (l > 0x100000L)
        {
            data = fv1.map(fv1.position(), l);
            fv1.position(fv1.position() + l);
            return;
        }
        if (!$assertionsDisabled && l >= 0x7fffffffL)
        {
            throw new AssertionError();
        } else
        {
            data = ByteBuffer.allocate(fF.a(l));
            fv1.read(data);
            return;
        }
    }

    public void setData(ByteBuffer bytebuffer)
    {
        data = bytebuffer;
    }

    public void setParent(Container container)
    {
        parent = container;
    }

    static 
    {
        boolean flag;
        if (!com/coremedia/iso/boxes/FreeBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
