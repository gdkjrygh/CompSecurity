// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            MetadataField

public abstract class BaseMetadataField
    implements MetadataField
{

    private final Set mDataHolderBundleKeys;
    public final Set mDataHolderFieldNames;
    public final String mFieldName;
    private final int mVersionAdded;

    public BaseMetadataField(String s, int i)
    {
        mFieldName = (String)Preconditions.checkNotNull(s, "fieldName");
        mDataHolderFieldNames = Collections.singleton(s);
        mDataHolderBundleKeys = Collections.emptySet();
        mVersionAdded = i;
    }

    public BaseMetadataField(String s, Collection collection, Collection collection1, int i)
    {
        mFieldName = (String)Preconditions.checkNotNull(s, "fieldName");
        mDataHolderFieldNames = Collections.unmodifiableSet(new HashSet(collection));
        mDataHolderBundleKeys = Collections.unmodifiableSet(new HashSet(collection1));
        mVersionAdded = i;
    }

    public boolean canReadFromDataHolder(DataHolder dataholder, int i, int j)
    {
        for (Iterator iterator = mDataHolderFieldNames.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if (!dataholder.hasColumn(s) || dataholder.hasNull(s, i, j))
            {
                return false;
            }
        }

        return true;
    }

    public final void copyToBundle(DataHolder dataholder, MetadataBundle metadatabundle, int i, int j)
    {
        Preconditions.checkNotNull(dataholder, "dataHolder");
        Preconditions.checkNotNull(metadatabundle, "bundle");
        if (canReadFromDataHolder(dataholder, i, j))
        {
            metadatabundle.put(this, doDataHolderRead(dataholder, i, j));
        }
    }

    public abstract Object doBundleRead(Bundle bundle);

    public abstract void doBundleWrite(Bundle bundle, Object obj);

    public abstract Object doDataHolderRead(DataHolder dataholder, int i, int j);

    public final Object getFromBundle(Bundle bundle)
    {
        Preconditions.checkNotNull(bundle, "bundle");
        if (bundle.get(mFieldName) != null)
        {
            return doBundleRead(bundle);
        } else
        {
            return null;
        }
    }

    public final Object getFromDataHolder(DataHolder dataholder, int i, int j)
    {
        if (canReadFromDataHolder(dataholder, i, j))
        {
            return doDataHolderRead(dataholder, i, j);
        } else
        {
            return null;
        }
    }

    public final String getName()
    {
        return mFieldName;
    }

    public final void putInBundle(Object obj, Bundle bundle)
    {
        Preconditions.checkNotNull(bundle, "bundle");
        if (obj == null)
        {
            bundle.putString(mFieldName, null);
            return;
        } else
        {
            doBundleWrite(bundle, obj);
            return;
        }
    }

    public String toString()
    {
        return mFieldName;
    }
}
