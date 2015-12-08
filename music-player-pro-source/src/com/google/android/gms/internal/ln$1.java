// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;
import com.google.android.gms.drive.metadata.internal.j;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.internal:
//            ln

static final class .internal.j extends j
{

    protected Object c(DataHolder dataholder, int i, int l)
    {
        return k(dataholder, i, l);
    }

    protected a k(DataHolder dataholder, int i, int l)
    {
        throw new IllegalStateException("Thumbnail field is write only");
    }

    taHolder(String s, Collection collection, Collection collection1, int i)
    {
        super(s, collection, collection1, i);
    }
}
