// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.Collections;
import java.util.List;

public final class cav
    implements caw
{

    public cav()
    {
    }

    public final List a(AdRequestInfoParcel adrequestinfoparcel)
    {
        if (adrequestinfoparcel.x == null)
        {
            return Collections.emptyList();
        } else
        {
            return adrequestinfoparcel.x;
        }
    }
}
