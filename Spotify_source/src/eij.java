// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.util.Releases;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class eij extends eie
{

    private ListView ab;
    private String ac;
    private FilterHeaderView ad;
    private eiw ae;
    private ftg af;
    private Flags ag;
    private android.view.View.OnClickListener ah;
    private gas ai;

    public eij()
    {
        ah = new android.view.View.OnClickListener() {

            private eij a;

            public final void onClick(View view)
            {
                view = (ejw)view.getTag();
                view = gms.a(a.k(), ((ejw) (view)).a).a;
                a.k().startActivity(view);
            }

            
            {
                a = eij.this;
                super();
            }
        };
        ai = new gas() {

            private eij a;

            public final void a()
            {
            }

            public final void a(gfp gfp)
            {
                if (eij.a(a) != null)
                {
                    eij.a(a).a(gfp);
                }
            }

            public final void a(String s)
            {
                if (eij.a(a) != null)
                {
                    eij.a(a).a(s);
                }
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = eij.this;
                super();
            }
        };
    }

    static eiw a(eij eij1)
    {
        return eij1.ae;
    }

    public final void A()
    {
        super.A();
        dmz.a(gcm);
    }

    protected final View H()
    {
        View view = LayoutInflater.from(k()).inflate(0x7f0300d3, null);
        ab = (ListView)view.findViewById(0x102000a);
        ab.setOnCreateContextMenuListener(this);
        ad = FilterHeaderView.a(LayoutInflater.from(k()), "", Releases.a, Releases.b, ai, ab);
        ad.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        ad.a(0x7f0802ef);
        a(ab);
        return view;
    }

    public final String I()
    {
        return (new StringBuilder("releases:")).append(super.a).toString();
    }

    protected final void J()
    {
        FilterHeaderView.a(ad);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ag = fyw.a(this);
        return super.a(layoutinflater, viewgroup, bundle);
    }

    public final String a(Context context, Flags flags)
    {
        if (ac == null)
        {
            return context.getString(0x7f0800c3);
        } else
        {
            return ac;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ac = g().getString("artist_name");
    }

    protected final void a(ArtistModel artistmodel)
    {
        Object obj;
        Object obj1;
        obj = (ejg)super.a;
        obj1 = new ejn(k(), ah);
        ae = (new eik(k(), artistmodel.uri, ((ejn) (obj1)), ag)).a(artistmodel.getReleases(((ejg) (obj)).c));
        af = new ftg(k());
        obj = af;
        obj1 = ae.a();
        artistmodel = (ejg)super.a;
        final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.values().length];
                try
                {
                    a[com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.a[((ejg) (artistmodel)).c.ordinal()];
        JVM INSTR tableswitch 1 4: default 140
    //                   1 178
    //                   2 191
    //                   3 204
    //                   4 217;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        artistmodel = k().getString(0x7f0800c9);
_L7:
        ((ftg) (obj)).a(((android.widget.ListAdapter) (obj1)), artistmodel, 0);
        af.d(0);
        ab.setAdapter(af);
        return;
_L2:
        artistmodel = k().getString(0x7f0800c9);
        continue; /* Loop/switch isn't completed */
_L3:
        artistmodel = k().getString(0x7f0800ce);
        continue; /* Loop/switch isn't completed */
_L4:
        artistmodel = k().getString(0x7f0800ca);
        continue; /* Loop/switch isn't completed */
_L5:
        artistmodel = k().getString(0x7f0800cb);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.Q;
    }

    public final void z()
    {
        super.z();
        if (ac != null)
        {
            ((fpe)k()).a(this, ac);
        }
    }
}
