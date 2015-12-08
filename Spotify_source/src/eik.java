// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.artist.adapters.releases.ReleasesAdapterWithViewAll;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class eik
{

    public final Context a;
    public final eix b;
    public final String c;

    public eik(Context context, String s, ejn ejn, Flags flags)
    {
        a = context;
        c = s;
        b = new eix(context, ejn, flags);
    }

    public final eiw a(com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseList releaselist)
    {
        eix eix1 = b;
        Object obj = c;
        eiv eiv1 = new eiv(eix1.a, ((String) (obj)), releaselist.releases, eix1.b, eix1.c);
        obj = eiv1;
        if (!releaselist.hasAllReleases())
        {
            obj = new ReleasesAdapterWithViewAll(eix1.a, releaselist.releaseType, eiv1, eix1.b);
        }
        return ((eiw) (obj));
    }
}
