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
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.places.internal.zzm;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacesStatusCodes, PlaceLikelihood

public class PlaceLikelihoodBuffer extends AbstractDataBuffer
    implements Result
{

    private final String b;
    private final Context c;
    private final int d;
    private final Status e;

    public PlaceLikelihoodBuffer(DataHolder dataholder, int i, Context context)
    {
        super(dataholder);
        c = context;
        e = PlacesStatusCodes.c(dataholder.e());
        d = zza.a(i);
        if (dataholder != null && dataholder.f() != null)
        {
            b = dataholder.f().getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
            return;
        } else
        {
            b = null;
            return;
        }
    }

    public Status a()
    {
        return e;
    }

    public Object a(int i)
    {
        return b(i);
    }

    public PlaceLikelihood b(int i)
    {
        return new zzm(a, i, c);
    }

    public String toString()
    {
        return zzt.a(this).a("status", a()).a("attributions", b).toString();
    }

    private class zza
    {

        static int a(int i)
        {
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("invalid source: ").append(i).toString());

            case 100: // 'd'
            case 101: // 'e'
            case 102: // 'f'
            case 103: // 'g'
            case 104: // 'h'
            case 105: // 'i'
                return i;
            }
        }
    }

}
