// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.Iterator;

public final class eya
    implements Iterable
{

    private SparseArray a;

    public eya(SparseArray sparsearray)
    {
        a = sparsearray;
    }

    static SparseArray a(eya eya1)
    {
        return eya1.a;
    }

    public final Iterator iterator()
    {
        return new eyb(this);
    }
}
