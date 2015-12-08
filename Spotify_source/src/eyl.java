// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.SpotifyIconView;
import com.spotify.mobile.android.spotlets.party.json.ArtistJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.TrackJacksonModel;
import java.util.List;

public final class eyl extends eym
{

    private final fuj k;
    private final eyk l;
    private final TextView m;
    private final TextView n;
    private TrackJacksonModel o;

    public eyl(ViewGroup viewgroup, fuj fuj, eyk eyk)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300fe, viewgroup, false));
        k = fuj;
        l = eyk;
        m = (TextView)a.findViewById(0x7f11026e);
        n = (TextView)a.findViewById(0x7f1102ef);
        viewgroup = a.getContext();
        fuj = new dhr((ViewGroup)a.findViewById(0x7f110470));
        eyk = gae.a(viewgroup, SpotifyIcon.aM);
        eyk.setContentDescription(viewgroup.getString(0x7f080205));
        eyk.setOnClickListener(new android.view.View.OnClickListener(viewgroup) {

            private Context a;
            private eyl b;

            public final void onClick(View view)
            {
                fud.a(a, eyl.a(b), eyl.b(b));
            }

            
            {
                b = eyl.this;
                a = context;
                super();
            }
        });
        fuj.a(eyk);
        a.setOnClickListener(new android.view.View.OnClickListener() {

            private eyl a;

            public final void onClick(View view)
            {
                if (eyl.b(a) != null)
                {
                    eyl.c(a).a(eyl.b(a));
                }
            }

            
            {
                a = eyl.this;
                super();
            }
        });
    }

    static fuj a(eyl eyl1)
    {
        return eyl1.k;
    }

    static TrackJacksonModel b(eyl eyl1)
    {
        return eyl1.o;
    }

    static eyk c(eyl eyl1)
    {
        return eyl1.l;
    }

    public final void a(TrackJacksonModel trackjacksonmodel)
    {
        o = trackjacksonmodel;
        m.setText(trackjacksonmodel.name);
        StringBuilder stringbuilder = new StringBuilder(((ArtistJacksonModel)o.artists.get(0)).name);
        for (int i = 1; i < o.artists.size(); i++)
        {
            stringbuilder.append(", ");
            stringbuilder.append(((ArtistJacksonModel)trackjacksonmodel.artists.get(i)).name);
        }

        n.setText(stringbuilder.toString());
        int j = 0;
        while (j < trackjacksonmodel.proofedUsernames.size()) 
        {
            SpotifyIconView spotifyiconview;
            if (this.j.getChildCount() <= j)
            {
                spotifyiconview = dgp.f(a.getContext(), this.j);
                this.j.addView(spotifyiconview);
            } else
            {
                spotifyiconview = (SpotifyIconView)this.j.getChildAt(j);
            }
            spotifyiconview.a(SpotifyIcon.bt);
            spotifyiconview.a(0xffff0000 + j * 22);
            j++;
        }
        if (this.j.getChildCount() > trackjacksonmodel.proofedUsernames.size())
        {
            this.j.removeViews(trackjacksonmodel.proofedUsernames.size(), this.j.getChildCount() - trackjacksonmodel.proofedUsernames.size());
        }
    }
}
