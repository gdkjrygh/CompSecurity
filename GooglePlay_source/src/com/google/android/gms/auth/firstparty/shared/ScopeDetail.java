// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            ScopeDetailCreator, FACLData

public class ScopeDetail
    implements SafeParcelable
{

    public static final ScopeDetailCreator CREATOR = new ScopeDetailCreator();
    String description;
    String detail;
    public FACLData friendPickerData;
    String iconBase64;
    String paclPickerDataBase64;
    String service;
    final int version;
    List warnings;

    ScopeDetail(int i, String s, String s1, String s2, String s3, String s4, List list, 
            FACLData facldata)
    {
        version = i;
        description = s;
        detail = s1;
        iconBase64 = s2;
        paclPickerDataBase64 = s3;
        service = s4;
        warnings = list;
        friendPickerData = facldata;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ScopeDetailCreator.writeToParcel(this, parcel, i);
    }

}
