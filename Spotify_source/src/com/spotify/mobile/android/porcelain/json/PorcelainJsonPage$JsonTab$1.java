// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.porcelain.json:
//            PorcelainJsonSpace

final class 
    implements android.os.on.PorcelainJsonPage.JsonTab._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        String s = parcel.readString();
        return new nit>((PorcelainJsonSpace)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/PorcelainJsonSpace.getClassLoader()), s, parcel.readString(), parcel.readString());
    }

    public final volatile Object[] newArray(int i)
    {
        return new nit>[i];
    }

    ()
    {
    }
}
