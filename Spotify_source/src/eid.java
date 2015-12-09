// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.PorcelainAdapter;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class eid extends eia
{

    private final dpx Y = new dpx() {

        private eid b;

        public final void a(PorcelainNavigationLink porcelainnavigationlink, int i, int j)
        {
            porcelainnavigationlink = gms.a(b.k(), porcelainnavigationlink.getUri()).a(porcelainnavigationlink.getTargetTitle()).a;
            b.a(porcelainnavigationlink);
        }

        public final void a(drz drz, int i)
        {
        }

            
            {
                b = eid.this;
                super();
            }
    };
    private RecyclerView a;
    private PorcelainAdapter b;

    public eid()
    {
    }

    protected final View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = PorcelainAdapter.e();
        layoutinflater.c = Y;
        b = layoutinflater.a(k());
        a = new RecyclerView(k());
        a.setId(0x7f110398);
        a.a(new dos(k()));
        a.a(b);
        return a;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f08034a);
    }

    protected final void b(ArtistModel artistmodel)
    {
        cuq cuq1 = ImmutableList.h();
        cuq1.b(cuv.a(artistmodel.relatedArtists, new ctv() {

            public final Object a(Object obj)
            {
                com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistInfo artistinfo = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistInfo)obj;
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
                obj1.a = com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.a;
                obj1.b = artistinfo.name;
                dpd1 = (dpd)dpd1.a(((dpk) (obj1)));
                obj1 = dpa.a(PorcelainIcon.a);
                obj1.b = (com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape)ctz.a(com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape.b);
                obj1.a = ((String) (obj));
                return ((dpd)dpd1.a(((dpi) (obj1)))).a((new dpn()).a(artistinfo.name)).b();
            }

        }));
        b.a(dpa.a("items", cuq1.a()));
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.P;
    }
}
