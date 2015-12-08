// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cty;
import gen;
import java.util.Arrays;

public class MomentFlags
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new MomentFlags(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new MomentFlags[i];
        }

    };
    public final boolean cpi;
    public final boolean playButtonCta;
    public final boolean prefetch;

    private MomentFlags(Parcel parcel)
    {
        prefetch = gen.a(parcel);
        cpi = gen.a(parcel);
        playButtonCta = gen.a(parcel);
    }


    public MomentFlags(boolean flag, boolean flag1, boolean flag2)
    {
        prefetch = flag;
        cpi = flag1;
        playButtonCta = flag2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof MomentFlags)
            {
                if (!cty.a(Boolean.valueOf(prefetch), Boolean.valueOf(((MomentFlags) (obj = (MomentFlags)obj)).prefetch)) || !cty.a(Boolean.valueOf(cpi), Boolean.valueOf(((MomentFlags) (obj)).cpi)) || !cty.a(Boolean.valueOf(playButtonCta), Boolean.valueOf(((MomentFlags) (obj)).playButtonCta)))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Boolean.valueOf(prefetch), Boolean.valueOf(cpi), Boolean.valueOf(playButtonCta)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, prefetch);
        gen.a(parcel, cpi);
        gen.a(parcel, playButtonCta);
    }

}
