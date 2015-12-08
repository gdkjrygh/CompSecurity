// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.BaseMetadataField;
import java.util.Collection;

public abstract class ParcelableMetadataField extends BaseMetadataField
{

    public ParcelableMetadataField(String s, Collection collection, Collection collection1, int i)
    {
        super(s, collection, collection1, i);
    }

    protected final volatile Object doBundleRead(Bundle bundle)
    {
        return bundle.getParcelable(super.mFieldName);
    }

    protected final volatile void doBundleWrite(Bundle bundle, Object obj)
    {
        obj = (Parcelable)obj;
        bundle.putParcelable(super.mFieldName, ((Parcelable) (obj)));
    }
}
