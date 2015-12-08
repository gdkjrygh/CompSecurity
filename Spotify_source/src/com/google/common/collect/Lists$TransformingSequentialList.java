// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctv;
import ctz;
import cvg;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

class function extends AbstractSequentialList
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final List fromList;
    final ctv function;

    public void clear()
    {
        fromList.clear();
    }

    public ListIterator listIterator(int i)
    {
        return new cvg(fromList.listIterator(i)) {

            private Lists.TransformingSequentialList b;

            final Object a(Object obj)
            {
                return b.function.a(obj);
            }

            
            {
                b = Lists.TransformingSequentialList.this;
                super(listiterator);
            }
        };
    }

    public int size()
    {
        return fromList.size();
    }

    _cls1.b(List list, ctv ctv1)
    {
        fromList = (List)ctz.a(list);
        function = (ctv)ctz.a(ctv1);
    }
}
