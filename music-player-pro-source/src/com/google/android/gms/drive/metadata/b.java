// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            a

public abstract class b extends a
{

    protected b(String s, Collection collection, Collection collection1, int i)
    {
        super(s, collection, collection1, i);
    }

    protected Object c(DataHolder dataholder, int i, int j)
    {
        return d(dataholder, i, j);
    }

    protected Collection d(DataHolder dataholder, int i, int j)
    {
        throw new UnsupportedOperationException("Cannot read collections from a dataHolder.");
    }
}
