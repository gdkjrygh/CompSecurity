// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.spotlets.user:
//            InvitationCodeModel

final class 
    implements android.os.ts.user.InvitationCodeModel._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new InvitationCodeModel(parcel, null);
    }

    public final volatile Object[] newArray(int i)
    {
        return new InvitationCodeModel[i];
    }

    ()
    {
    }
}
