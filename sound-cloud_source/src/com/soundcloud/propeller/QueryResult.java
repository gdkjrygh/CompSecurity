// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.propeller:
//            CursorReader, ResultMapper, ScalarMapper

public class QueryResult
    implements Iterable
{

    private final CursorReader cursorReader;

    public QueryResult(CursorReader cursorreader)
    {
        cursorReader = cursorreader;
    }

    public Object first(ResultMapper resultmapper)
    {
        if (isEmpty())
        {
            throw new IllegalStateException("Attempting to read first element from empty query result");
        }
        cursorReader.advanceCursor();
        resultmapper = ((ResultMapper) (resultmapper.map(cursorReader)));
        cursorReader.closeCursor();
        return resultmapper;
        resultmapper;
        cursorReader.closeCursor();
        throw resultmapper;
    }

    public Object first(Class class1)
    {
        return first(((ResultMapper) (new ScalarMapper(class1))));
    }

    public Object firstOrDefault(ResultMapper resultmapper, Object obj)
    {
        if (isEmpty())
        {
            return obj;
        } else
        {
            return first(resultmapper);
        }
    }

    public Object firstOrDefault(Class class1, Object obj)
    {
        if (isEmpty())
        {
            return obj;
        } else
        {
            return first(class1);
        }
    }

    public int getResultCount()
    {
        return cursorReader.getRowCount();
    }

    public boolean isEmpty()
    {
        return cursorReader.getRowCount() == 0;
    }

    public Iterator iterator()
    {
        return new _cls1();
    }

    public void release()
    {
        cursorReader.closeCursor();
    }

    public List toList(ResultMapper resultmapper)
    {
        ArrayList arraylist = new ArrayList(cursorReader.getRowCount());
        for (Iterator iterator1 = iterator(); iterator1.hasNext(); arraylist.add(resultmapper.map((CursorReader)iterator1.next()))) { }
        return arraylist;
    }


    private class _cls1
        implements Iterator
    {

        final QueryResult this$0;

        public boolean hasNext()
        {
            boolean flag = cursorReader.hasNext();
            if (!flag)
            {
                cursorReader.closeCursor();
            }
            return flag;
        }

        public CursorReader next()
        {
            cursorReader.advanceCursor();
            return cursorReader;
        }

        public volatile Object next()
        {
            return next();
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        _cls1()
        {
            this$0 = QueryResult.this;
            super();
        }
    }

}
