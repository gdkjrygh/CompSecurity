// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.Iterator;

final class eyb
    implements Iterator
{

    private int a;
    private eya b;

    eyb(eya eya1)
    {
        b = eya1;
        super();
        a = eya.a(b).size();
    }

    public final boolean hasNext()
    {
        return a > 0;
    }

    public final Object next()
    {
        a = a - 1;
        return Integer.valueOf(a);
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("This does not support removal");
    }
}
