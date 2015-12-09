// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentAnnotation, AppContentAnnotationEntity, AppContentUtils

public final class AppContentAnnotationRef extends MultiDataBufferRef
    implements AppContentAnnotation
{

    AppContentAnnotationRef(ArrayList arraylist, int i)
    {
        super(arraylist, 2, i);
    }

    private AppContentAnnotation freeze()
    {
        return new AppContentAnnotationEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return AppContentAnnotationEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final String getDescription()
    {
        return getString("annotation_description");
    }

    public final String getId()
    {
        return getString("annotation_id");
    }

    public final String getImageDefaultId()
    {
        return getString("annotation_image_default_id");
    }

    public final int getImageHeight()
    {
        return getInteger("annotation_image_height");
    }

    public final Uri getImageUri()
    {
        return parseUri("annotation_image_uri");
    }

    public final int getImageWidth()
    {
        return getInteger("annotation_image_width");
    }

    public final String getLayoutSlot()
    {
        return getString("annotation_layout_slot");
    }

    public final Bundle getModifiers()
    {
        return AppContentUtils.getDataTuples(mDataHolder, mDataHolderCollection, "annotation_modifiers", mDataRow);
    }

    public final String getTitle()
    {
        return getString("annotation_title");
    }

    public final int hashCode()
    {
        return AppContentAnnotationEntity.hashCode(this);
    }

    public final String toString()
    {
        return AppContentAnnotationEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentAnnotationEntity)freeze()).writeToParcel(parcel, i);
    }
}
