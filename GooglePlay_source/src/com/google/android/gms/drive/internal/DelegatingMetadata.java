// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class DelegatingMetadata extends Metadata
{

    private final MetadataBundle mImpl;

    public DelegatingMetadata(MetadataBundle metadatabundle)
    {
        mImpl = metadatabundle;
    }

    public final volatile Object freeze()
    {
        return new DelegatingMetadata(MetadataBundle.copyOf(mImpl));
    }

    public final Object get(MetadataField metadatafield)
    {
        return mImpl.get(metadatafield);
    }

    public final boolean isDataValid()
    {
        return mImpl != null;
    }

    public final String toString()
    {
        return (new StringBuilder("Metadata [mImpl=")).append(mImpl).append("]").toString();
    }
}
