// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountNameCheckResponseCreator

public class AccountNameCheckResponse
    implements SafeParcelable
{

    public static final AccountNameCheckResponseCreator CREATOR = new AccountNameCheckResponseCreator();
    CaptchaChallenge captcha;
    String detail;
    String statusWireCode;
    List suggestions;
    final int version;

    AccountNameCheckResponse(int i, String s, List list, String s1, CaptchaChallenge captchachallenge)
    {
        version = i;
        statusWireCode = s;
        suggestions = list;
        detail = s1;
        captcha = captchachallenge;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountNameCheckResponseCreator.writeToParcel(this, parcel, i);
    }

}
