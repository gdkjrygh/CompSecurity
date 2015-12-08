// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.Map;
import java.util.Set;

public final class gjl
    implements exy
{

    SparseArray a;

    public gjl(SparseArray sparsearray)
    {
        a = sparsearray;
    }

    public final Map a(Set set)
    {
        SparseArray sparsearray = a;
        gjm gjm1 = new gjm(this);
        return (new eyd(new eya(sparsearray), gjm1)).a(set);
    }
}
