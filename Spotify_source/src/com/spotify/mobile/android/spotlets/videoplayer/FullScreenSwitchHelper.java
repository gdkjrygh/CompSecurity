// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.spotlets.FeatureIdentifier;
import flm;
import flo;
import gen;
import ggi;

public class FullScreenSwitchHelper
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new FullScreenSwitchHelper(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new FullScreenSwitchHelper[i];
        }

    };
    public boolean a;
    private boolean b;
    private PlayerState c;

    private FullScreenSwitchHelper()
    {
    }

    protected FullScreenSwitchHelper(Parcel parcel)
    {
        a = gen.a(parcel);
        b = gen.a(parcel);
        c = (PlayerState)parcel.readParcelable(getClass().getClassLoader());
    }

    public static FullScreenSwitchHelper a(Bundle bundle)
    {
        if (bundle == null || !bundle.containsKey("FullScreenSwitchHelper"))
        {
            return new FullScreenSwitchHelper();
        } else
        {
            return (FullScreenSwitchHelper)bundle.getParcelable("FullScreenSwitchHelper");
        }
    }

    public final void a(Context context, FeatureIdentifier featureidentifier)
    {
        if (b)
        {
            flm flm1 = new flm() {

                public final flo a(flo flo1)
                {
                    return flo1.a();
                }

            };
            if (b)
            {
                context = flm1.a(flo.a(context));
                context.c = c;
                context.a(featureidentifier);
                return;
            }
        }
    }

    public final void a(Bundle bundle, Activity activity, PlayerState playerstate)
    {
        c = playerstate;
        boolean flag;
        if (ggi.b(activity) && activity.isChangingConfigurations() && a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        bundle.putParcelable("FullScreenSwitchHelper", this);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, a);
        gen.a(parcel, b);
        parcel.writeParcelable(c, i);
    }

}
