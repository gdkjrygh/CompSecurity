// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            Joiner, Preconditions

class nit> extends Joiner
{

    final Joiner this$0;

    public Appendable appendTo(Appendable appendable, Iterable iterable)
        throws IOException
    {
        Preconditions.checkNotNull(appendable, "appendable");
        Preconditions.checkNotNull(iterable, "parts");
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Object obj = iterable.next();
            if (obj == null)
            {
                continue;
            }
            appendable.append(toString(obj));
            break;
        } while (true);
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Object obj1 = iterable.next();
            if (obj1 != null)
            {
                appendable.append(Joiner.access$100(Joiner.this));
                appendable.append(toString(obj1));
            }
        } while (true);
        return appendable;
    }

    public Joiner useForNull(String s)
    {
        Preconditions.checkNotNull(s);
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    public pJoiner withKeyValueSeparator(String s)
    {
        Preconditions.checkNotNull(s);
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }

    pJoiner(Joiner joiner1)
    {
        this$0 = Joiner.this;
        super(joiner1, null);
    }
}
