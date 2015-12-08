// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.h;

// Referenced classes of package com.google.android.gms.internal:
//            gs

static final class .internal.h extends h
{

    protected Object b(DataHolder dataholder, int j, int k)
    {
        return i(dataholder, j, k);
    }

    protected Bitmap i(DataHolder dataholder, int j, int k)
    {
        throw new IllegalStateException("Thumbnail field is write only");
    }

    taHolder(String s, int j)
    {
        super(s, j);
    }
}
