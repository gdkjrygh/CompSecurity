// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentSection, AppContentSectionEntity, AppContentUtils, 
//            AppContentCardRef

public final class AppContentSectionRef extends MultiDataBufferRef
    implements AppContentSection
{

    private final int mNumChildren;

    AppContentSectionRef(ArrayList arraylist, int i, int j)
    {
        super(arraylist, 0, i);
        mNumChildren = j;
    }

    private AppContentSection freeze()
    {
        return new AppContentSectionEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return AppContentSectionEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final volatile List getActions()
    {
        return AppContentUtils.getActions(mDataHolder, mDataHolderCollection, "section_actions", mDataRow);
    }

    public final volatile List getAnnotations()
    {
        return AppContentUtils.getAnnotations(mDataHolder, mDataHolderCollection, "section_annotations", mDataRow);
    }

    public final String getCardType()
    {
        return getString("section_card_type");
    }

    public final volatile List getCards()
    {
        ArrayList arraylist = new ArrayList(mNumChildren);
        for (int i = 0; i < mNumChildren; i++)
        {
            arraylist.add(new AppContentCardRef(mDataHolderCollection, mDataRow + i));
        }

        return arraylist;
    }

    public final String getContentDescription()
    {
        return getString("section_content_description");
    }

    public final Bundle getExtras()
    {
        return AppContentUtils.getDataTuples(mDataHolder, mDataHolderCollection, "section_data", mDataRow);
    }

    public final String getId()
    {
        return getString("section_id");
    }

    public final String getSubtitle()
    {
        return getString("section_subtitle");
    }

    public final String getTitle()
    {
        return getString("section_title");
    }

    public final String getType()
    {
        return getString("section_type");
    }

    public final int hashCode()
    {
        return AppContentSectionEntity.hashCode(this);
    }

    public final String toString()
    {
        return AppContentSectionEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentSectionEntity)freeze()).writeToParcel(parcel, i);
    }
}
