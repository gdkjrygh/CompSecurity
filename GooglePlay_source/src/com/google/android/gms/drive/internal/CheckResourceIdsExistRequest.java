// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CheckResourceIdsExistRequestCreator

public class CheckResourceIdsExistRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CheckResourceIdsExistRequestCreator();
    final List mResourceIds;
    final int mVersionCode;

    CheckResourceIdsExistRequest(int i, List list)
    {
        mVersionCode = i;
        mResourceIds = list;
    }

    public CheckResourceIdsExistRequest(Set set)
    {
        this(1, ((List) (new ArrayList(set))));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CheckResourceIdsExistRequestCreator.writeToParcel$dfa5ba3(this, parcel);
    }

}
