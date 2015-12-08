// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable

private class <init> extends llection
{

    final StandardTable this$0;

    public Iterator iterator()
    {
        return new Iterator() {

            final StandardTable.Values this$1;
            final Iterator val$cellIterator;

            public boolean hasNext()
            {
                return cellIterator.hasNext();
            }

            public Object next()
            {
                return ((Table.Cell)cellIterator.next()).getValue();
            }

            public void remove()
            {
                cellIterator.remove();
            }

            
            {
                this$1 = StandardTable.Values.this;
                cellIterator = iterator1;
                super();
            }
        };
    }

    public int size()
    {
        return StandardTable.this.size();
    }

    private _cls1.val.cellIterator()
    {
        this$0 = StandardTable.this;
        super(StandardTable.this, null);
    }

    llection(llection llection)
    {
        this();
    }
}
