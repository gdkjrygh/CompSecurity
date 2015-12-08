// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, PersonMetadataImplCreator

public static class mInViewerDomain
    implements SafeParcelable, com.google.android.gms.people.identity.models.dataImpl
{

    public static final PersonMetadataImplCreator CREATOR = new PersonMetadataImplCreator();
    List mAttributions;
    List mBlockTypes;
    boolean mBlocked;
    List mCircles;
    List mContacts;
    boolean mDeleted;
    List mGroups;
    boolean mInViewerDomain;
    List mIncomingBlockTypes;
    final Set mIndicatorSet;
    String mObjectType;
    String mOwnerId;
    List mOwnerUserTypes;
    String mPlusPageType;
    pl mProfileOwnerStats;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PersonMetadataImplCreator.writeToParcel(this, parcel, i);
    }


    public pl()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    pl(Set set, int i, List list, List list1, List list2, List list3, List list4, 
            List list5, String s, String s1, List list6, String s2, pl pl, boolean flag, 
            boolean flag1, boolean flag2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAttributions = list;
        mBlockTypes = list1;
        mCircles = list2;
        mContacts = list3;
        mGroups = list4;
        mIncomingBlockTypes = list5;
        mObjectType = s;
        mOwnerId = s1;
        mOwnerUserTypes = list6;
        mPlusPageType = s2;
        mProfileOwnerStats = pl;
        mBlocked = flag;
        mDeleted = flag1;
        mInViewerDomain = flag2;
    }
}
