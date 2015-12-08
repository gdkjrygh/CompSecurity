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
//            AppContentSection, AppContentSectionEntityCreator, AppContentAction, AppContentActionEntity, 
//            AppContentCard, AppContentCardEntity, AppContentAnnotation, AppContentAnnotationEntity

public final class AppContentSectionEntity
    implements SafeParcelable, AppContentSection
{

    public static final AppContentSectionEntityCreator CREATOR = new AppContentSectionEntityCreator();
    private final ArrayList mActions;
    private final ArrayList mAnnotations;
    final String mCardType;
    private final ArrayList mCards;
    final String mContentDescription;
    private final Bundle mExtras;
    final String mId;
    final String mSubtitle;
    final String mTitle;
    final String mType;
    final int mVersionCode;

    AppContentSectionEntity(int i, ArrayList arraylist, ArrayList arraylist1, String s, Bundle bundle, String s1, String s2, 
            String s3, String s4, String s5, ArrayList arraylist2)
    {
        mVersionCode = i;
        mActions = arraylist;
        mAnnotations = arraylist2;
        mCards = arraylist1;
        mCardType = s5;
        mContentDescription = s;
        mExtras = bundle;
        mId = s4;
        mSubtitle = s1;
        mTitle = s2;
        mType = s3;
    }

    public AppContentSectionEntity(AppContentSection appcontentsection)
    {
        mVersionCode = 5;
        mCardType = appcontentsection.getCardType();
        mContentDescription = appcontentsection.getContentDescription();
        mExtras = appcontentsection.getExtras();
        mId = appcontentsection.getId();
        mSubtitle = appcontentsection.getSubtitle();
        mTitle = appcontentsection.getTitle();
        mType = appcontentsection.getType();
        List list = appcontentsection.getActions();
        int l = list.size();
        mActions = new ArrayList(l);
        for (int i = 0; i < l; i++)
        {
            mActions.add((AppContentActionEntity)((AppContentAction)list.get(i)).freeze());
        }

        list = appcontentsection.getCards();
        l = list.size();
        mCards = new ArrayList(l);
        for (int j = 0; j < l; j++)
        {
            mCards.add((AppContentCardEntity)((AppContentCard)list.get(j)).freeze());
        }

        appcontentsection = appcontentsection.getAnnotations();
        l = appcontentsection.size();
        mAnnotations = new ArrayList(l);
        for (int k = 0; k < l; k++)
        {
            mAnnotations.add((AppContentAnnotationEntity)((AppContentAnnotation)appcontentsection.get(k)).freeze());
        }

    }

    static boolean equals(AppContentSection appcontentsection, Object obj)
    {
        if (obj instanceof AppContentSection)
        {
            if (appcontentsection == obj)
            {
                return true;
            }
            obj = (AppContentSection)obj;
            if (Objects.equal(((AppContentSection) (obj)).getActions(), appcontentsection.getActions()) && Objects.equal(((AppContentSection) (obj)).getAnnotations(), appcontentsection.getAnnotations()) && Objects.equal(((AppContentSection) (obj)).getCards(), appcontentsection.getCards()) && Objects.equal(((AppContentSection) (obj)).getCardType(), appcontentsection.getCardType()) && Objects.equal(((AppContentSection) (obj)).getContentDescription(), appcontentsection.getContentDescription()) && Objects.equal(((AppContentSection) (obj)).getExtras(), appcontentsection.getExtras()) && Objects.equal(((AppContentSection) (obj)).getId(), appcontentsection.getId()) && Objects.equal(((AppContentSection) (obj)).getSubtitle(), appcontentsection.getSubtitle()) && Objects.equal(((AppContentSection) (obj)).getTitle(), appcontentsection.getTitle()) && Objects.equal(((AppContentSection) (obj)).getType(), appcontentsection.getType()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(AppContentSection appcontentsection)
    {
        return Arrays.hashCode(new Object[] {
            appcontentsection.getActions(), appcontentsection.getAnnotations(), appcontentsection.getCards(), appcontentsection.getCardType(), appcontentsection.getContentDescription(), appcontentsection.getExtras(), appcontentsection.getId(), appcontentsection.getSubtitle(), appcontentsection.getTitle(), appcontentsection.getType()
        });
    }

    static String toString(AppContentSection appcontentsection)
    {
        return Objects.toStringHelper(appcontentsection).add("Actions", appcontentsection.getActions()).add("Annotations", appcontentsection.getAnnotations()).add("Cards", appcontentsection.getCards()).add("CardType", appcontentsection.getCardType()).add("ContentDescription", appcontentsection.getContentDescription()).add("Extras", appcontentsection.getExtras()).add("Id", appcontentsection.getId()).add("Subtitle", appcontentsection.getSubtitle()).add("Title", appcontentsection.getTitle()).add("Type", appcontentsection.getType()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((AppContentSection) (this)), obj);
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

    public final String getCardType()
    {
        return mCardType;
    }

    public final List getCards()
    {
        return new ArrayList(mCards);
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

    public final String getSubtitle()
    {
        return mSubtitle;
    }

    public final String getTitle()
    {
        return mTitle;
    }

    public final String getType()
    {
        return mType;
    }

    public final int hashCode()
    {
        return hashCode(((AppContentSection) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((AppContentSection) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AppContentSectionEntityCreator.writeToParcel$75c0ae2f(this, parcel);
    }

}
