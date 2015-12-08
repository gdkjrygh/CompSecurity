// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.b;

// Referenced classes of package com.google.android.gms.internal:
//            iq

public static class .internal.b extends b
    implements SearchableMetadataField
{

    protected Object b(DataHolder dataholder, int i, int j)
    {
        return d(dataholder, i, j);
    }

    protected Boolean d(DataHolder dataholder, int i, int j)
    {
        boolean flag;
        if (dataholder.b(getName(), i, j) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public taHolder(String s, int i)
    {
        super(s, i);
    }
}
