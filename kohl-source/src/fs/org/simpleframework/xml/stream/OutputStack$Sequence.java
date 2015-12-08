// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.util.Iterator;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            OutputStack, OutputNode

private class cursor
    implements Iterator
{

    private int cursor;
    final OutputStack this$0;

    public boolean hasNext()
    {
        return cursor > 0;
    }

    public OutputNode next()
    {
        if (hasNext())
        {
            OutputStack outputstack = OutputStack.this;
            int i = cursor - 1;
            cursor = i;
            return (OutputNode)outputstack.get(i);
        } else
        {
            return null;
        }
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        purge(cursor);
    }

    public ()
    {
        this$0 = OutputStack.this;
        super();
        cursor = size();
    }
}
