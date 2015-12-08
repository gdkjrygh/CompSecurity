// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import java.io.EOFException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

// Referenced classes of package com.coremedia.iso:
//            BoxParser, IsoTypeReader

public abstract class AbstractBoxParser
    implements BoxParser
{

    private static Logger LOG = Logger.getLogger(com/coremedia/iso/AbstractBoxParser.getName());
    ThreadLocal header;

    public AbstractBoxParser()
    {
        header = new _cls1();
    }

    public abstract Box createBox(String s, byte abyte0[], String s1);

    public Box parseBox(DataSource datasource, Container container)
    {
        Object obj;
        int j;
        long l = datasource.position();
        ((ByteBuffer)header.get()).rewind().limit(8);
        do
        {
            int i = datasource.read((ByteBuffer)header.get());
            if (i == 8)
            {
                ((ByteBuffer)header.get()).rewind();
                l = IsoTypeReader.readUInt32((ByteBuffer)header.get());
                if (l < 8L && l > 1L)
                {
                    LOG.severe((new StringBuilder("Plausibility check failed: size < 8 (size = ")).append(l).append("). Stop parsing!").toString());
                    return null;
                }
                break;
            }
            if (i < 0)
            {
                datasource.position(l);
                throw new EOFException();
            }
        } while (true);
        String s1 = IsoTypeReader.read4cc((ByteBuffer)header.get());
        if (l == 1L)
        {
            ((ByteBuffer)header.get()).limit(16);
            datasource.read((ByteBuffer)header.get());
            ((ByteBuffer)header.get()).position(8);
            l = IsoTypeReader.readUInt64((ByteBuffer)header.get()) - 16L;
        } else
        if (l == 0L)
        {
            l = datasource.size() - datasource.position();
        } else
        {
            l -= 8L;
        }
        if (!"uuid".equals(s1))
        {
            break MISSING_BLOCK_LABEL_503;
        }
        ((ByteBuffer)header.get()).limit(((ByteBuffer)header.get()).limit() + 16);
        datasource.read((ByteBuffer)header.get());
        obj = new byte[16];
        j = ((ByteBuffer)header.get()).position() - 16;
_L3:
        if (j < ((ByteBuffer)header.get()).position()) goto _L2; else goto _L1
_L1:
        l -= 16L;
_L4:
        String s;
        if (container instanceof Box)
        {
            s = ((Box)container).getType();
        } else
        {
            s = "";
        }
        obj = createBox(s1, ((byte []) (obj)), s);
        ((Box) (obj)).setParent(container);
        ((ByteBuffer)header.get()).rewind();
        ((Box) (obj)).parse(datasource, (ByteBuffer)header.get(), l, this);
        return ((Box) (obj));
_L2:
        obj[j - (((ByteBuffer)header.get()).position() - 16)] = ((ByteBuffer)header.get()).get(j);
        j++;
          goto _L3
        obj = null;
          goto _L4
    }


    private class _cls1 extends ThreadLocal
    {

        final AbstractBoxParser this$0;

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected ByteBuffer initialValue()
        {
            return ByteBuffer.allocate(32);
        }

        _cls1()
        {
            this$0 = AbstractBoxParser.this;
            super();
        }
    }

}
