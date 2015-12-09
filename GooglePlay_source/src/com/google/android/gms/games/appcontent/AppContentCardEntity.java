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
//            AppContentCard, AppContentCardEntityCreator, AppContentAction, AppContentActionEntity, 
//            AppContentAnnotation, AppContentAnnotationEntity, AppContentCondition, AppContentConditionEntity

public final class AppContentCardEntity
    implements SafeParcelable, AppContentCard
{

    public static final AppContentCardEntityCreator CREATOR = new AppContentCardEntityCreator();
    private final ArrayList mActions;
    private final ArrayList mAnnotations;
    private final ArrayList mConditions;
    final String mContentDescription;
    final int mCurrentProgress;
    final String mDescription;
    private final Bundle mExtras;
    final String mId;
    final String mSubtitle;
    final String mTitle;
    final int mTotalProgress;
    final String mType;
    final int mVersionCode;

    AppContentCardEntity(int i, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2, String s, int j, String s1, 
            Bundle bundle, String s2, String s3, int k, String s4, String s5)
    {
        mVersionCode = i;
        mActions = arraylist;
        mAnnotations = arraylist1;
        mConditions = arraylist2;
        mContentDescription = s;
        mCurrentProgress = j;
        mDescription = s1;
        mExtras = bundle;
        mId = s5;
        mSubtitle = s2;
        mTitle = s3;
        mTotalProgress = k;
        mType = s4;
    }

    public AppContentCardEntity(AppContentCard appcontentcard)
    {
        mVersionCode = 4;
        mContentDescription = appcontentcard.getContentDescription();
        mCurrentProgress = appcontentcard.getCurrentProgress();
        mDescription = appcontentcard.getDescription();
        mExtras = appcontentcard.getExtras();
        mId = appcontentcard.getId();
        mTitle = appcontentcard.getTitle();
        mSubtitle = appcontentcard.getSubtitle();
        mTotalProgress = appcontentcard.getTotalProgress();
        mType = appcontentcard.getType();
        List list = appcontentcard.getActions();
        int l = list.size();
        mActions = new ArrayList(l);
        for (int i = 0; i < l; i++)
        {
            mActions.add((AppContentActionEntity)((AppContentAction)list.get(i)).freeze());
        }

        list = appcontentcard.getAnnotations();
        l = list.size();
        mAnnotations = new ArrayList(l);
        for (int j = 0; j < l; j++)
        {
            mAnnotations.add((AppContentAnnotationEntity)((AppContentAnnotation)list.get(j)).freeze());
        }

        appcontentcard = appcontentcard.getConditions();
        l = appcontentcard.size();
        mConditions = new ArrayList(l);
        for (int k = 0; k < l; k++)
        {
            mConditions.add((AppContentConditionEntity)((AppContentCondition)appcontentcard.get(k)).freeze());
        }

    }

    static boolean equals(AppContentCard appcontentcard, Object obj)
    {
        if (obj instanceof AppContentCard)
        {
            if (appcontentcard == obj)
            {
                return true;
            }
            obj = (AppContentCard)obj;
            if (Objects.equal(((AppContentCard) (obj)).getActions(), appcontentcard.getActions()) && Objects.equal(((AppContentCard) (obj)).getAnnotations(), appcontentcard.getAnnotations()) && Objects.equal(((AppContentCard) (obj)).getConditions(), appcontentcard.getConditions()) && Objects.equal(((AppContentCard) (obj)).getContentDescription(), appcontentcard.getContentDescription()) && Objects.equal(Integer.valueOf(((AppContentCard) (obj)).getCurrentProgress()), Integer.valueOf(appcontentcard.getCurrentProgress())) && Objects.equal(((AppContentCard) (obj)).getDescription(), appcontentcard.getDescription()) && Objects.equal(((AppContentCard) (obj)).getExtras(), appcontentcard.getExtras()) && Objects.equal(((AppContentCard) (obj)).getId(), appcontentcard.getId()) && Objects.equal(((AppContentCard) (obj)).getSubtitle(), appcontentcard.getSubtitle()) && Objects.equal(((AppContentCard) (obj)).getTitle(), appcontentcard.getTitle()) && Objects.equal(Integer.valueOf(((AppContentCard) (obj)).getTotalProgress()), Integer.valueOf(appcontentcard.getTotalProgress())) && Objects.equal(((AppContentCard) (obj)).getType(), appcontentcard.getType()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(AppContentCard appcontentcard)
    {
        return Arrays.hashCode(new Object[] {
            appcontentcard.getActions(), appcontentcard.getAnnotations(), appcontentcard.getConditions(), appcontentcard.getContentDescription(), Integer.valueOf(appcontentcard.getCurrentProgress()), appcontentcard.getDescription(), appcontentcard.getExtras(), appcontentcard.getId(), appcontentcard.getSubtitle(), appcontentcard.getTitle(), 
            Integer.valueOf(appcontentcard.getTotalProgress()), appcontentcard.getType()
        });
    }

    static String toString(AppContentCard appcontentcard)
    {
        return Objects.toStringHelper(appcontentcard).add("Actions", appcontentcard.getActions()).add("Annotations", appcontentcard.getAnnotations()).add("Conditions", appcontentcard.getConditions()).add("ContentDescription", appcontentcard.getContentDescription()).add("CurrentSteps", Integer.valueOf(appcontentcard.getCurrentProgress())).add("Description", appcontentcard.getDescription()).add("Extras", appcontentcard.getExtras()).add("Id", appcontentcard.getId()).add("Subtitle", appcontentcard.getSubtitle()).add("Title", appcontentcard.getTitle()).add("TotalSteps", Integer.valueOf(appcontentcard.getTotalProgress())).add("Type", appcontentcard.getType()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((AppContentCard) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final List getActions()
    {
        return new ArrayList(mActions);
    }

    public final List getAnnotations()
    {
        return new ArrayList(mAnnotations);
    }

    public final List getConditions()
    {
        return new ArrayList(mConditions);
    }

    public final String getContentDescription()
    {
        return mContentDescription;
    }

    public final int getCurrentProgress()
    {
        return mCurrentProgress;
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final Bundle getExtras()
    {
        return mExtras;
    }

    public final String getId()
    {
        return mId;
    }

    public final String getSubtitle()
    {
        return mSubtitle;
    }

    public final String getTitle()
    {
        return mTitle;
    }

    public final int getTotalProgress()
    {
        return mTotalProgress;
    }

    public final String getType()
    {
        return mType;
    }

    public final int hashCode()
    {
        return hashCode(((AppContentCard) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((AppContentCard) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AppContentCardEntityCreator.writeToParcel$2971ee70(this, parcel);
    }

}
