// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentCard, AppContentCardEntity, AppContentUtils

public final class AppContentCardRef extends MultiDataBufferRef
    implements AppContentCard
{

    AppContentCardRef(ArrayList arraylist, int i)
    {
        super(arraylist, 0, i);
    }

    private AppContentCard freeze()
    {
        return new AppContentCardEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return AppContentCardEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final List getActions()
    {
        return AppContentUtils.getActions(mDataHolder, mDataHolderCollection, "card_actions", mDataRow);
    }

    public final List getAnnotations()
    {
        return AppContentUtils.getAnnotations(mDataHolder, mDataHolderCollection, "card_annotations", mDataRow);
    }

    public final List getConditions()
    {
        return AppContentUtils.getConditions(mDataHolder, mDataHolderCollection, "card_conditions", mDataRow);
    }

    public final String getContentDescription()
    {
        return getString("card_content_description");
    }

    public final int getCurrentProgress()
    {
        return getInteger("card_current_steps");
    }

    public final String getDescription()
    {
        return getString("card_description");
    }

    public final Bundle getExtras()
    {
        return AppContentUtils.getDataTuples(mDataHolder, mDataHolderCollection, "card_data", mDataRow);
    }

    public final String getId()
    {
        return getString("card_id");
    }

    public final String getSubtitle()
    {
        return getString("card_subtitle");
    }

    public final String getTitle()
    {
        return getString("card_title");
    }

    public final int getTotalProgress()
    {
        return getInteger("card_total_steps");
    }

    public final String getType()
    {
        return getString("card_type");
    }

    public final int hashCode()
    {
        return AppContentCardEntity.hashCode(this);
    }

    public final String toString()
    {
        return AppContentCardEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentCardEntity)freeze()).writeToParcel(parcel, i);
    }
}
