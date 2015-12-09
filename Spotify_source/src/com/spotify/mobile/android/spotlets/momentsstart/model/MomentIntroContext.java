// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.model;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart.model:
//            MomentContext

public class MomentIntroContext extends MomentContext
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new MomentIntroContext(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new MomentIntroContext[i];
        }

    };
    private static final String INTRO = "INTRO";

    public MomentIntroContext()
    {
        super(null, "INTRO", "INTRO", null, "INTRO", null, "INTRO");
    }

    protected MomentIntroContext(Parcel parcel)
    {
        super(parcel);
    }

}
