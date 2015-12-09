// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.view.GalleryViewPager;
import com.spotify.mobile.android.spotlets.artist.view.PageIndicator;
import com.spotify.mobile.android.spotlets.artist.view.headers.HeaderViewGallery;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class eic extends eia
{

    private HeaderViewGallery a;
    private String b;

    public eic()
    {
    }

    protected final View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        a = new HeaderViewGallery(k());
        return a;
    }

    public final String a(Context context, Flags flags)
    {
        if (b != null)
        {
            return b;
        } else
        {
            return "";
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        b = g().getString("artist_name");
    }

    protected final void b(ArtistModel artistmodel)
    {
        if (artistmodel.gallery.b())
        {
            HeaderViewGallery headerviewgallery = a;
            Object obj = ((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistGallery)artistmodel.gallery.c()).images;
            headerviewgallery.a.a(new ein(headerviewgallery.getContext(), ((java.util.List) (obj))));
            obj = headerviewgallery.b;
            obj.a = headerviewgallery.a;
            ((PageIndicator) (obj)).a.a(((lu) (obj)));
            ((PageIndicator) (obj)).a();
        }
        if (artistmodel.info != null && !TextUtils.equals(b, artistmodel.info.name))
        {
            b = artistmodel.info.name;
            artistmodel = b;
            u u = k();
            if (u instanceof fpe)
            {
                ((fpe)u).a(this, artistmodel);
            }
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.N;
    }
}
