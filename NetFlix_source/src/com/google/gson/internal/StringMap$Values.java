// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal:
//            StringMap

private final class <init> extends AbstractCollection
{

    final StringMap this$0;

    public void clear()
    {
        StringMap.this.clear();
    }

    public boolean contains(Object obj)
    {
        return containsValue(obj);
    }

    public Iterator iterator()
    {
        return new StringMap.LinkedHashIterator() {

            final StringMap.Values this$1;

            public final Object next()
            {
                return nextEntry().value;
            }

            
            {
                this$1 = StringMap.Values.this;
                super(this$0, null);
            }
        };
    }

    public int size()
    {
        return StringMap.access$500(StringMap.this);
    }

    private this._cls0()
    {
        this$0 = StringMap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
