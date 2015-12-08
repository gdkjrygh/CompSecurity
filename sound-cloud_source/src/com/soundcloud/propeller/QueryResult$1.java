// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;

import java.util.Iterator;

// Referenced classes of package com.soundcloud.propeller:
//            QueryResult, CursorReader

class this._cls0
    implements Iterator
{

    final QueryResult this$0;

    public boolean hasNext()
    {
        boolean flag = QueryResult.access$000(QueryResult.this).hasNext();
        if (!flag)
        {
            QueryResult.access$000(QueryResult.this).closeCursor();
        }
        return flag;
    }

    public CursorReader next()
    {
        QueryResult.access$000(QueryResult.this).advanceCursor();
        return QueryResult.access$000(QueryResult.this);
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    ()
    {
        this$0 = QueryResult.this;
        super();
    }
}
