// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, NotesImplCreator

public static class mValue
    implements SafeParcelable, com.google.android.gms.people.identity.models.otesImpl
{

    public static final NotesImplCreator CREATOR = new NotesImplCreator();
    final Set mIndicatorSet;
    pl mMetadata;
    String mValue;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        NotesImplCreator.writeToParcel(this, parcel, i);
    }


    public pl()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    pl(Set set, int i, pl pl, String s)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = pl;
        mValue = s;
    }
}
