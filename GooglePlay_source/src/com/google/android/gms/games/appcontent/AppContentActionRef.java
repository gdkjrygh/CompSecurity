// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentAction, AppContentActionEntity, AppContentUtils, 
//            AppContentAnnotation

public final class AppContentActionRef extends MultiDataBufferRef
    implements AppContentAction
{

    AppContentActionRef(ArrayList arraylist, int i)
    {
        super(arraylist, 1, i);
    }

    private AppContentAction freeze()
    {
        return new AppContentActionEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return AppContentActionEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final AppContentAnnotation getAnnotation()
    {
        ArrayList arraylist = AppContentUtils.getAnnotations(mDataHolder, mDataHolderCollection, "action_annotation", mDataRow);
        if (arraylist.size() == 1)
        {
            return (AppContentAnnotation)arraylist.get(0);
        } else
        {
            return null;
        }
    }

    public final List getConditions()
    {
        return AppContentUtils.getConditions(mDataHolder, mDataHolderCollection, "action_conditions", mDataRow);
    }

    public final String getContentDescription()
    {
        return getString("action_content_description");
    }

    public final Bundle getExtras()
    {
        return AppContentUtils.getDataTuples(mDataHolder, mDataHolderCollection, "action_data", mDataRow);
    }

    public final String getId()
    {
        return getString("action_id");
    }

    public final String getOverflowText()
    {
        return getString("overflow_text");
    }

    public final String getType()
    {
        return getString("action_type");
    }

    public final int hashCode()
    {
        return AppContentActionEntity.hashCode(this);
    }

    public final String toString()
    {
        return AppContentActionEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentActionEntity)freeze()).writeToParcel(parcel, i);
    }
}
