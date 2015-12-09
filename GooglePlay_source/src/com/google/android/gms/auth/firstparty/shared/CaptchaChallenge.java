// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            CaptchaChallengeCreator

public class CaptchaChallenge
    implements SafeParcelable
{

    public static final CaptchaChallengeCreator CREATOR = new CaptchaChallengeCreator();
    Bitmap captcha;
    String statusWireCode;
    String token;
    final int version;

    CaptchaChallenge(int i, String s, String s1, Bitmap bitmap)
    {
        version = i;
        statusWireCode = s;
        token = s1;
        captcha = bitmap;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CaptchaChallengeCreator.writeToParcel(this, parcel, i);
    }

}
