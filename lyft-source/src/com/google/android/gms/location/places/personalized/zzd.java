// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.PlacesStatusCodes;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceUserData

public final class zzd extends com.google.android.gms.common.data.zzd
    implements Result
{

    private final Status b;

    public zzd(DataHolder dataholder)
    {
        this(dataholder, PlacesStatusCodes.c(dataholder.e()));
    }

    private zzd(DataHolder dataholder, Status status)
    {
        super(dataholder, PlaceUserData.CREATOR);
        boolean flag;
        if (dataholder == null || dataholder.e() == status.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.b(flag);
        b = status;
    }

    public Status a()
    {
        return b;
    }
}
