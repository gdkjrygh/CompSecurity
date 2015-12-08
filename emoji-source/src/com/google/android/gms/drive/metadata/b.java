// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            a

public abstract class b extends a
{

    protected b(String s, int i)
    {
        super(s, Collections.emptySet(), Collections.emptySet(), i);
    }

    protected Object b(DataHolder dataholder, int i, int j)
    {
        return c(dataholder, i, j);
    }

    protected Collection c(DataHolder dataholder, int i, int j)
    {
        throw new UnsupportedOperationException("Cannot read collections from a dataHolder.");
    }
}
