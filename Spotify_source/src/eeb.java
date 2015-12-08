// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.ads.FeaturedAction;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

public final class eeb extends FeaturedAction
{

    public eeb(Ad ad)
    {
        a = ad;
    }

    public final Button a(Context context, ViewGroup viewgroup)
    {
        context = gad.a(context, viewgroup, SpotifyIcon.as, a.getButtonText());
        context.setOnClickListener(super.c);
        viewgroup = (android.widget.LinearLayout.LayoutParams)context.getLayoutParams();
        viewgroup.gravity = 17;
        context.setLayoutParams(viewgroup);
        return context;
    }

    public final String a(Context context)
    {
        return a.getButtonText();
    }

    public final boolean d()
    {
        return true;
    }

    public final String h()
    {
        return a.getFeaturedActionUri();
    }

    public final com.spotify.mobile.android.spotlets.ads.FeaturedAction.Type i()
    {
        return com.spotify.mobile.android.spotlets.ads.FeaturedAction.Type.b;
    }
}
