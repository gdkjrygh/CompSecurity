// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.BaseMetadataField;
import com.google.android.gms.drive.metadata.CollectionMetadataField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;

public final class StringCollectionMetadataField extends CollectionMetadataField
{

    public StringCollectionMetadataField(String s)
    {
        super(s, Collections.singleton(s), Collections.emptySet(), 0x419ce0);
    }

    protected final volatile Object doBundleRead(Bundle bundle)
    {
        return bundle.getStringArrayList(super.mFieldName);
    }

    protected final volatile void doBundleWrite(Bundle bundle, Object obj)
    {
        obj = (Collection)obj;
        bundle.putStringArrayList(super.mFieldName, new ArrayList(((Collection) (obj))));
    }

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        return doDataHolderRead(dataholder, i, j);
    }

    protected final Collection doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        Object obj;
        try
        {
            obj = dataholder.getString(super.mFieldName, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (DataHolder dataholder)
        {
            throw new IllegalStateException("DataHolder supplied invalid JSON", dataholder);
        }
        if (obj == null)
        {
            return null;
        }
        dataholder = new ArrayList();
        obj = new JSONArray(((String) (obj)));
        i = 0;
_L2:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        dataholder.add(((JSONArray) (obj)).getString(i));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        dataholder = Collections.unmodifiableCollection(dataholder);
        return dataholder;
    }
}
