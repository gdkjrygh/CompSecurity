// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAction, AppContentActionEntityCreator, AppContentAnnotation, AppContentAnnotationEntity, 
//            AppContentCondition, AppContentConditionEntity

public final class AppContentActionEntity
    implements SafeParcelable, AppContentAction
{

    public static final AppContentActionEntityCreator CREATOR = new AppContentActionEntityCreator();
    private final AppContentAnnotationEntity mAnnotation;
    private final ArrayList mConditions;
    final String mContentDescription;
    private final Bundle mExtras;
    final String mId;
    final String mOverflowText;
    final String mType;
    final int mVersionCode;

    AppContentActionEntity(int i, ArrayList arraylist, String s, Bundle bundle, String s1, String s2, AppContentAnnotationEntity appcontentannotationentity, 
            String s3)
    {
        mVersionCode = i;
        mAnnotation = appcontentannotationentity;
        mConditions = arraylist;
        mContentDescription = s;
        mExtras = bundle;
        mId = s2;
        mOverflowText = s3;
        mType = s1;
    }

    public AppContentActionEntity(AppContentAction appcontentaction)
    {
        mVersionCode = 5;
        mAnnotation = (AppContentAnnotationEntity)appcontentaction.getAnnotation().freeze();
        mContentDescription = appcontentaction.getContentDescription();
        mExtras = appcontentaction.getExtras();
        mId = appcontentaction.getId();
        mOverflowText = appcontentaction.getOverflowText();
        mType = appcontentaction.getType();
        appcontentaction = appcontentaction.getConditions();
        int j = appcontentaction.size();
        mConditions = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            mConditions.add((AppContentConditionEntity)((AppContentCondition)appcontentaction.get(i)).freeze());
        }

    }

    static boolean equals(AppContentAction appcontentaction, Object obj)
    {
        if (obj instanceof AppContentAction)
        {
            if (appcontentaction == obj)
            {
                return true;
            }
            obj = (AppContentAction)obj;
            if (Objects.equal(((AppContentAction) (obj)).getAnnotation(), appcontentaction.getAnnotation()) && Objects.equal(((AppContentAction) (obj)).getConditions(), appcontentaction.getConditions()) && Objects.equal(((AppContentAction) (obj)).getContentDescription(), appcontentaction.getContentDescription()) && Objects.equal(((AppContentAction) (obj)).getExtras(), appcontentaction.getExtras()) && Objects.equal(((AppContentAction) (obj)).getId(), appcontentaction.getId()) && Objects.equal(((AppContentAction) (obj)).getOverflowText(), appcontentaction.getOverflowText()) && Objects.equal(((AppContentAction) (obj)).getType(), appcontentaction.getType()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(AppContentAction appcontentaction)
    {
        return Arrays.hashCode(new Object[] {
            appcontentaction.getAnnotation(), appcontentaction.getConditions(), appcontentaction.getContentDescription(), appcontentaction.getExtras(), appcontentaction.getId(), appcontentaction.getOverflowText(), appcontentaction.getType()
        });
    }

    static String toString(AppContentAction appcontentaction)
    {
        return Objects.toStringHelper(appcontentaction).add("Annotation", appcontentaction.getAnnotation()).add("Conditions", appcontentaction.getConditions()).add("ContentDescription", appcontentaction.getContentDescription()).add("Extras", appcontentaction.getExtras()).add("Id", appcontentaction.getId()).add("OverflowText", appcontentaction.getOverflowText()).add("Type", appcontentaction.getType()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((AppContentAction) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final AppContentAnnotation getAnnotation()
    {
        return mAnnotation;
    }

    public final List getConditions()
    {
        return new ArrayList(mConditions);
    }

    public final String getContentDescription()
    {
        return mContentDescription;
    }

    public final Bundle getExtras()
    {
        return mExtras;
    }

    public final String getId()
    {
        return mId;
    }

    public final String getOverflowText()
    {
        return mOverflowText;
    }

    public final String getType()
    {
        return mType;
    }

    public final int hashCode()
    {
        return hashCode(((AppContentAction) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((AppContentAction) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AppContentActionEntityCreator.writeToParcel(this, parcel, i);
    }

}
