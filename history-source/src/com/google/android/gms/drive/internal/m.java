// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class m extends Metadata
{

    private final MetadataBundle PD;

    public m(MetadataBundle metadatabundle)
    {
        PD = metadatabundle;
    }

    protected Object a(MetadataField metadatafield)
    {
        return PD.a(metadatafield);
    }

    public Object freeze()
    {
        return iy();
    }

    public boolean isDataValid()
    {
        return PD != null;
    }

    public Metadata iy()
    {
        return new m(MetadataBundle.a(PD));
    }

    public String toString()
    {
        return (new StringBuilder()).append("Metadata [mImpl=").append(PD).append("]").toString();
    }
}
