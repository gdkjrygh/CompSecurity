// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Date;
import java.util.HashSet;

public final class aex
{

    private static int a(int i)
    {
        switch (i)
        {
        default:
            return jo.a;

        case 2: // '\002'
            return jo.c;

        case 1: // '\001'
            return jo.b;
        }
    }

    public static jp a(AdSizeParcel adsizeparcel)
    {
        int i = 0;
        jp ajp[] = new jp[6];
        ajp[0] = jp.a;
        ajp[1] = jp.b;
        ajp[2] = jp.c;
        ajp[3] = jp.d;
        ajp[4] = jp.e;
        ajp[5] = jp.f;
        for (; i < 6; i++)
        {
            if (ajp[i].a() == adsizeparcel.f && ajp[i].b() == adsizeparcel.c)
            {
                return ajp[i];
            }
        }

        return new jp(pe.a(adsizeparcel.f, adsizeparcel.c, adsizeparcel.b));
    }

    public static jt a(AdRequestParcel adrequestparcel)
    {
        HashSet hashset;
        if (adrequestparcel.e != null)
        {
            hashset = new HashSet(adrequestparcel.e);
        } else
        {
            hashset = null;
        }
        return new jt(new Date(adrequestparcel.b), a(adrequestparcel.d), hashset, adrequestparcel.f, adrequestparcel.k);
    }
}
