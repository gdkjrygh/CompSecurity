// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, dm, ImmutableMultiset, ImmutableList, 
//            be, ej

final class <init> extends ImmutableSet
{

    private static final long serialVersionUID = 0L;
    final ImmutableMultiset this$0;

    public final boolean contains(Object obj)
    {
        if (obj instanceof dm)
        {
            obj = (dm)obj;
            break MISSING_BLOCK_LABEL_12;
        }
        do
        {
            return false;
        } while (((dm) (obj)).getCount() <= 0 || count(((dm) (obj)).getElement()) != ((dm) (obj)).getCount());
        return true;
    }

    final ImmutableList createAsList()
    {
        class _cls1 extends ImmutableAsList
        {

            final ImmutableMultiset.EntrySet this$1;

            ImmutableCollection delegateCollection()
            {
                return ImmutableMultiset.EntrySet.this;
            }

            public dm get(int i)
            {
                return getEntry(i);
            }

            public volatile Object get(int i)
            {
                return get(i);
            }

            _cls1()
            {
                this$1 = ImmutableMultiset.EntrySet.this;
                super();
            }
        }

        return new _cls1();
    }

    public final int hashCode()
    {
        return ImmutableMultiset.this.hashCode();
    }

    final boolean isPartialView()
    {
        return ImmutableMultiset.this.isPartialView();
    }

    public final ej iterator()
    {
        return asList().iterator();
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final int size()
    {
        return elementSet().size();
    }

    final Object writeReplace()
    {
        return new erializedForm(ImmutableMultiset.this);
    }

    private erializedForm()
    {
        this$0 = ImmutableMultiset.this;
        super();
    }

    this._cls0(be be)
    {
        this();
    }
}
