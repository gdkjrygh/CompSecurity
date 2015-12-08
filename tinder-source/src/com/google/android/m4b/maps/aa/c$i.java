// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Comparator;
import java.util.SortedSet;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c

public final class <init> extends <init>
    implements SortedSet
{

    private c e;

    public final Comparator comparator()
    {
        return ((SortedSet)super.b).comparator();
    }

    public final Object first()
    {
        a();
        return ((SortedSet)super.b).first();
    }

    public final SortedSet headSet(Object obj)
    {
        a();
        c c1 = e;
        Object obj1 = super.a;
        SortedSet sortedset = ((SortedSet)super.b).headSet(obj);
        if (super.c == null)
        {
            obj = this;
        } else
        {
            obj = super.c;
        }
        return new <init>(c1, obj1, sortedset, ((<init>) (obj)));
    }

    public final Object last()
    {
        a();
        return ((SortedSet)super.b).last();
    }

    public final SortedSet subSet(Object obj, Object obj1)
    {
        a();
        c c1 = e;
        Object obj2 = super.a;
        obj1 = ((SortedSet)super.b).subSet(obj, obj1);
        if (super.c == null)
        {
            obj = this;
        } else
        {
            obj = super.c;
        }
        return new <init>(c1, obj2, ((SortedSet) (obj1)), ((<init>) (obj)));
    }

    public final SortedSet tailSet(Object obj)
    {
        a();
        c c1 = e;
        Object obj1 = super.a;
        SortedSet sortedset = ((SortedSet)super.b).tailSet(obj);
        if (super.c == null)
        {
            obj = this;
        } else
        {
            obj = super.c;
        }
        return new <init>(c1, obj1, sortedset, ((<init>) (obj)));
    }

    (c c1, Object obj, SortedSet sortedset,  )
    {
        e = c1;
        super(c1, obj, sortedset, );
    }
}
