// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class l extends Metadata
{

    private final MetadataBundle Or;

    public l(MetadataBundle metadatabundle)
    {
        Or = metadatabundle;
    }

    protected Object a(MetadataField metadatafield)
    {
        return Or.a(metadatafield);
    }

    public Object freeze()
    {
        return hR();
    }

    public Metadata hR()
    {
        return new l(MetadataBundle.a(Or));
    }

    public boolean isDataValid()
    {
        return Or != null;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Metadata [mImpl=").append(Or).append("]").toString();
    }
}
