// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            StandardTable

private class <init> extends 
{

    final StandardTable this$0;

    public boolean contains(Object obj)
    {
        if (obj instanceof )
        {
            obj = ()obj;
            return StandardTable.access$300(StandardTable.this, ((this._cls0) (obj))._mth0(), ((this._cls0) (obj)).y(), ((y) (obj)).y());
        } else
        {
            return false;
        }
    }

    public Iterator iterator()
    {
        return new ator(StandardTable.this, null);
    }

    public boolean remove(Object obj)
    {
        if (obj instanceof this._cls0)
        {
            obj = (this._cls0)obj;
            return StandardTable.access$400(StandardTable.this, ((this._cls0) (obj))._mth0(), ((this._cls0) (obj)).y(), ((y) (obj)).y());
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return StandardTable.this.size();
    }

    private ator()
    {
        this$0 = StandardTable.this;
        super(StandardTable.this, null);
    }

    ( )
    {
        this();
    }
}
