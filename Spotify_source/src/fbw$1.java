// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.FeaturedAction;
import java.util.Map;

final class ang.Object
    implements android.view.nClickListener
{

    private fbw a;

    public final void onClick(View view)
    {
        Object obj = a;
        view = view.getContext();
        if (((fbw) (obj)).a != null && ((fbw) (obj)).a.j())
        {
            ((fbw) (obj)).a.k();
        } else
        if (((fbw) (obj)).b != null)
        {
            obj = (String)((fbw) (obj)).b.metadata().get("click_url");
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                dmz.a(edp);
                edp.b(view, Uri.parse(((String) (obj))));
                return;
            }
        }
    }

    (fbw fbw1)
    {
        a = fbw1;
        super();
    }
}
