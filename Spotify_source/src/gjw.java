// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Map;

public final class gjw extends gjs
{

    private final Flags c;

    public gjw(Context context, Flags flags)
    {
        super(context);
        c = flags;
    }

    public final void a()
    {
        Object obj = super.b;
        if (((Map) (obj)).containsKey("togglePlay"))
        {
            dmz.a(fos);
            fos.c(a);
            return;
        }
        if (((Map) (obj)).containsKey("next"))
        {
            dmz.a(fos);
            fos.b(a);
            return;
        }
        if (((Map) (obj)).containsKey("previous"))
        {
            dmz.a(fos);
            fos.a(a);
            return;
        } else
        {
            obj = gfs.a(new SpotifyLink((String)((Map) (obj)).get("uri")));
            dmz.a(fos);
            fos.a(a, ViewUri.bF, FeatureIdentifier.X, FeatureIdentifier.X, ((android.net.Uri) (obj)), c);
            return;
        }
    }
}
