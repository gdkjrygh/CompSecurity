// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzr;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacesStatusCodes, Place

public class PlaceBuffer extends AbstractDataBuffer
    implements Result
{

    private final Context b;
    private final Status c;
    private final String d;

    public PlaceBuffer(DataHolder dataholder, Context context)
    {
        super(dataholder);
        b = context;
        c = PlacesStatusCodes.c(dataholder.e());
        if (dataholder != null && dataholder.f() != null)
        {
            d = dataholder.f().getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
            return;
        } else
        {
            d = null;
            return;
        }
    }

    public Status a()
    {
        return c;
    }

    public Object a(int i)
    {
        return b(i);
    }

    public Place b(int i)
    {
        return new zzr(a, i, b);
    }
}
