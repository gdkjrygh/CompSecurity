// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            CaptchaSolutionCreator

public class CaptchaSolution
    implements SafeParcelable
{

    public static final CaptchaSolutionCreator CREATOR = new CaptchaSolutionCreator();
    String answer;
    String token;
    final int version;

    CaptchaSolution(int i, String s, String s1)
    {
        version = i;
        token = s;
        answer = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CaptchaSolutionCreator.writeToParcel$67bdb73d(this, parcel);
    }

}
