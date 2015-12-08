// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.BaseMetadataField;
import com.google.android.gms.drive.metadata.CollectionMetadataField;
import java.util.ArrayList;
import java.util.Collection;

public class ParcelableCollectionMetadataField extends CollectionMetadataField
{

    public ParcelableCollectionMetadataField(String s, Collection collection, Collection collection1, int i)
    {
        super(s, collection, collection1, i);
    }

    protected volatile Object doBundleRead(Bundle bundle)
    {
        return doBundleRead(bundle);
    }

    protected Collection doBundleRead(Bundle bundle)
    {
        return bundle.getParcelableArrayList(super.mFieldName);
    }

    protected final volatile void doBundleWrite(Bundle bundle, Object obj)
    {
        obj = (Collection)obj;
        String s = super.mFieldName;
        if (obj instanceof ArrayList)
        {
            obj = (ArrayList)obj;
        } else
        {
            obj = new ArrayList(((Collection) (obj)));
        }
        bundle.putParcelableArrayList(s, ((ArrayList) (obj)));
    }
}
