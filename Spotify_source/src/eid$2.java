// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;

final class 
    implements ctv
{

    public final Object a(Object obj)
    {
        com.spotify.mobile.android.spotlets.artist.model.Model.ArtistInfo artistinfo = (com.spotify.mobile.android.spotlets.artist.model.Model.ArtistInfo)obj;
        dpd dpd1;
        Object obj1;
        if (artistinfo.getDefaultPortraitUri() != null)
        {
            obj = artistinfo.getDefaultPortraitUri().toString();
        } else
        {
            obj = null;
        }
        dpd1 = (dpd)(new dpd()).a();
        obj1 = dpa.a(artistinfo.uri);
        obj1.a = com.spotify.mobile.android.porcelain.subitem.ainNavigationLink.Type.a;
        obj1.b = artistinfo.name;
        dpd1 = (dpd)dpd1.a(((dpk) (obj1)));
        obj1 = dpa.a(PorcelainIcon.a);
        obj1.b = (com.spotify.mobile.android.porcelain.subitem.ainImage.Shape)ctz.a(com.spotify.mobile.android.porcelain.subitem.ainImage.Shape.b);
        obj1.a = ((String) (obj));
        return ((dpd)dpd1.a(((dpi) (obj1)))).a((new dpn()).a(artistinfo.name)).b();
    }

    ()
    {
    }
}
