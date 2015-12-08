// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.ClientInfo;

public final class fro
    implements frp
{

    public fro()
    {
    }

    public final boolean a(Offer offer)
    {
        if (offer != null && offer.isTrial() && offer.getDuration() == 7 && offer.getDurationType() == com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType.DAY)
        {
            return true;
        } else
        {
            return ((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a();
        }
    }
}
