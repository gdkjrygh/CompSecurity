// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.LazyList;
import com.googlecode.mp4parser.util.Logger;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.googlecode.mp4parser:
//            DataSource

public class BasicContainer
    implements Container, Closeable, Iterator
{

    private static final Box EOF = new _cls1("eof ");
    private static Logger LOG = Logger.getLogger(com/googlecode/mp4parser/BasicContainer);
    protected BoxParser boxParser;
    private List boxes;
    protected DataSource dataSource;
    long endPosition;
    Box lookahead;
    long parsePosition;
    long startPosition;

    public BasicContainer()
    {
        lookahead = null;
        parsePosition = 0L;
        startPosition = 0L;
        endPosition = 0L;
        boxes = new ArrayList();
    }

    public void addBox(Box box)
    {
        if (box != null)
        {
            boxes = new ArrayList(getBoxes());
            box.setParent(this);
            boxes.add(box);
        }
    }

    public void close()
    {
        dataSource.close();
    }

    public List getBoxes()
    {
        if (dataSource != null && lookahead != EOF)
        {
            return new LazyList(boxes, this);
        } else
        {
            return boxes;
        }
    }

    public List getBoxes(Class class1)
    {
        Object obj;
        Object obj1;
        List list;
        int i;
        obj1 = null;
        list = getBoxes();
        i = 0;
        obj = null;
_L2:
        Object obj2;
        Box box;
        if (i >= list.size())
        {
            if (obj != null)
            {
                return ((List) (obj));
            }
            break MISSING_BLOCK_LABEL_127;
        }
        box = (Box)list.get(i);
        obj2 = obj;
        if (!class1.isInstance(box))
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (obj1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        obj = box;
_L3:
        i++;
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj2 = obj;
        if (obj == null)
        {
            obj2 = new ArrayList(2);
            ((List) (obj2)).add(obj1);
        }
        ((List) (obj2)).add(box);
        obj = obj1;
        obj1 = obj2;
          goto _L3
        if (obj1 != null)
        {
            return Collections.singletonList(obj1);
        } else
        {
            return Collections.emptyList();
        }
    }

    public List getBoxes(Class class1, boolean flag)
    {
        ArrayList arraylist = new ArrayList(2);
        List list = getBoxes();
        int i = 0;
        do
        {
            if (i >= list.size())
            {
                return arraylist;
            }
            Box box = (Box)list.get(i);
            if (class1.isInstance(box))
            {
                arraylist.add(box);
            }
            if (flag && (box instanceof Container))
            {
                arraylist.addAll(((Container)box).getBoxes(class1, flag));
            }
            i++;
        } while (true);
    }

    public ByteBuffer getByteBuffer(long l, long l1)
    {
        if (dataSource != null)
        {
            ByteBuffer bytebuffer1;
            synchronized (dataSource)
            {
                bytebuffer1 = dataSource.map(startPosition + l, l1);
            }
            return bytebuffer1;
        }
        break MISSING_BLOCK_LABEL_48;
        exception;
        datasource;
        JVM INSTR monitorexit ;
        throw exception;
        ByteBuffer bytebuffer = ByteBuffer.allocate(CastUtils.l2i(l1));
        long l3 = l + l1;
        Iterator iterator = boxes.iterator();
        l1 = 0L;
        do
        {
            if (!iterator.hasNext())
            {
                return (ByteBuffer)bytebuffer.rewind();
            }
            Box box = (Box)iterator.next();
            long l2 = box.getSize() + l1;
            if (l2 > l && l1 < l3)
            {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                WritableByteChannel writablebytechannel = Channels.newChannel(bytearrayoutputstream);
                box.getBox(writablebytechannel);
                writablebytechannel.close();
                if (l1 >= l && l2 <= l3)
                {
                    bytebuffer.put(bytearrayoutputstream.toByteArray());
                    l1 = l2;
                    continue;
                }
                if (l1 < l && l2 > l3)
                {
                    int i = CastUtils.l2i(box.getSize() - (l - l1) - (l2 - l3));
                    bytebuffer.put(bytearrayoutputstream.toByteArray(), CastUtils.l2i(l - l1), i);
                    l1 = l2;
                    continue;
                }
                if (l1 < l && l2 <= l3)
                {
                    int j = CastUtils.l2i(box.getSize() - (l - l1));
                    bytebuffer.put(bytearrayoutputstream.toByteArray(), CastUtils.l2i(l - l1), j);
                    l1 = l2;
                    continue;
                }
                if (l1 >= l && l2 > l3)
                {
                    int k = CastUtils.l2i(box.getSize() - (l2 - l3));
                    bytebuffer.put(bytearrayoutputstream.toByteArray(), 0, k);
                }
            }
            l1 = l2;
        } while (true);
    }

    protected long getContainerSize()
    {
        long l = 0L;
        int i = 0;
        do
        {
            if (i >= getBoxes().size())
            {
                return l;
            }
            l += ((Box)boxes.get(i)).getSize();
            i++;
        } while (true);
    }

    public boolean hasNext()
    {
        if (lookahead == EOF)
        {
            return false;
        }
        if (lookahead != null)
        {
            return true;
        }
        try
        {
            lookahead = next();
        }
        catch (NoSuchElementException nosuchelementexception)
        {
            lookahead = EOF;
            return false;
        }
        return true;
    }

    public void initContainer(DataSource datasource, long l, BoxParser boxparser)
    {
        dataSource = datasource;
        long l1 = datasource.position();
        startPosition = l1;
        parsePosition = l1;
        datasource.position(datasource.position() + l);
        endPosition = datasource.position();
        boxParser = boxparser;
    }

    public Box next()
    {
        if (lookahead != null && lookahead != EOF)
        {
            Box box = lookahead;
            lookahead = null;
            return box;
        }
        if (dataSource == null || parsePosition >= endPosition)
        {
            lookahead = EOF;
            throw new NoSuchElementException();
        }
        Box box1;
        synchronized (dataSource)
        {
            dataSource.position(parsePosition);
            box1 = boxParser.parseBox(dataSource, this);
            parsePosition = dataSource.position();
        }
        return box1;
        exception;
        datasource;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (EOFException eofexception)
        {
            throw new NoSuchElementException();
        }
        catch (IOException ioexception)
        {
            throw new NoSuchElementException();
        }
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    public void setBoxes(List list)
    {
        boxes = new ArrayList(list);
        lookahead = EOF;
        dataSource = null;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append("[");
        int i = 0;
        do
        {
            if (i >= boxes.size())
            {
                stringbuilder.append("]");
                return stringbuilder.toString();
            }
            if (i > 0)
            {
                stringbuilder.append(";");
            }
            stringbuilder.append(((Box)boxes.get(i)).toString());
            i++;
        } while (true);
    }

    public final void writeContainer(WritableByteChannel writablebytechannel)
    {
        Iterator iterator = getBoxes().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((Box)iterator.next()).getBox(writablebytechannel);
        } while (true);
    }


    private class _cls1 extends AbstractBox
    {

        protected void _parseDetails(ByteBuffer bytebuffer)
        {
        }

        protected void getContent(ByteBuffer bytebuffer)
        {
        }

        protected long getContentSize()
        {
            return 0L;
        }

        _cls1(String s)
        {
            super(s);
        }
    }

}
