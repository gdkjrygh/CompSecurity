// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public class j
{

    private final InputStream a;
    private final ParcelFileDescriptor b;

    public j(InputStream inputstream, ParcelFileDescriptor parcelfiledescriptor)
    {
        a = inputstream;
        b = parcelfiledescriptor;
    }

    public final InputStream a()
    {
        return a;
    }

    public final ParcelFileDescriptor b()
    {
        return b;
    }
}
