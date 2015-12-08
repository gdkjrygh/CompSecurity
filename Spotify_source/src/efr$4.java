// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.spotlets.album.model.Album;

final class ang.Object
    implements android.view.nClickListener
{

    private efr a;

    public final void onClick(View view)
    {
        if (efr.o(a) != null)
        {
            view = gms.a(a.k(), efr.o(a).getFirstArtistUri()).a(efr.o(a).getFirstArtistName()).a;
            a.a(view);
        }
    }

    (efr efr1)
    {
        a = efr1;
        super();
    }
}
