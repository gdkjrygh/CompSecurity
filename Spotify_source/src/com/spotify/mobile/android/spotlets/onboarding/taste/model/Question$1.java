// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.onboarding.taste.model;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.spotlets.onboarding.taste.model:
//            Question

final class 
    implements android.os.Creator
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new Question(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Question[i];
    }

    ()
    {
    }
}
