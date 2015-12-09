// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.os.Bundle;
import com.google.android.gms.maps.SupportMapFragment;

// Referenced classes of package com.fitbit.maps:
//            FitbitMapOptions, h

public class FitbitMapFragment extends SupportMapFragment
{

    public FitbitMapFragment()
    {
    }

    public static FitbitMapFragment a()
    {
        return new FitbitMapFragment();
    }

    public static FitbitMapFragment a(FitbitMapOptions fitbitmapoptions)
    {
        FitbitMapFragment fitbitmapfragment = new FitbitMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", fitbitmapoptions.a());
        fitbitmapfragment.setArguments(bundle);
        return fitbitmapfragment;
    }

    public h b()
    {
        com.google.android.gms.maps.c c = e();
        if (c == null)
        {
            return null;
        } else
        {
            return new h(c);
        }
    }
}
