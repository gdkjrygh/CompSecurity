// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.service.RadioActionsService;

public final class gos extends goo
{

    private boolean aa;
    private final android.view.View.OnClickListener ag = new android.view.View.OnClickListener() {

        private gos a;

        public final void onClick(View view)
        {
            if (gos.a(a))
            {
                a.k().startService(RadioActionsService.b(a.k(), ((goo) (a)).a, a.v_(), com.spotify.mobile.android.util.viewuri.ViewUri.SubView.g));
            } else
            if (gos.b(a) != null)
            {
                a.k().startService(RadioActionsService.a(a.k(), (RadioStationModel)gos.c(a), a.v_(), com.spotify.mobile.android.util.viewuri.ViewUri.SubView.g));
                return;
            }
        }

            
            {
                a = gos.this;
                super();
            }
    };

    public gos()
    {
    }

    static boolean a(gos gos1)
    {
        return gos1.aa;
    }

    static Parcelable b(gos gos1)
    {
        return ((AbstractContentFragment) (gos1)).ae;
    }

    static Parcelable c(gos gos1)
    {
        return ((AbstractContentFragment) (gos1)).ae;
    }

    protected final int H()
    {
        return 0x7f080529;
    }

    public final String I()
    {
        return "station";
    }

    protected final Button J()
    {
        ToggleButton togglebutton = (ToggleButton)LayoutInflater.from(k()).inflate(0x7f0300c8, null);
        togglebutton.setTextOn(b(0x7f08030d));
        togglebutton.setTextOff(b(0x7f08030c));
        togglebutton.setText(b(0x7f08030c));
        togglebutton.setOnClickListener(ag);
        return togglebutton;
    }

    protected final RadioStationModel a(RadioStationModel radiostationmodel)
    {
        return new RadioStationModel(radiostationmodel.uri, radiostationmodel.title, radiostationmodel.titleUri, radiostationmodel.imageUri, radiostationmodel.subtitle, radiostationmodel.subtitleUri, radiostationmodel.seeds, radiostationmodel.relatedArtists, radiostationmodel.tracks, radiostationmodel.nextPageUrl, aa);
    }

    protected final volatile void a(Parcelable parcelable, View view)
    {
        a((RadioStationModel)parcelable, view);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        view = new SpotifyLink(gpl.d(super.a));
        view = gpl.a(k(), view);
        ((djr)super.Y.a()).b(view);
    }

    protected final void a(RadioStationModel radiostationmodel, View view)
    {
        aa = radiostationmodel.explicitSave;
        super.a(radiostationmodel, view);
        radiostationmodel = (ToggleButton)super.Z;
        radiostationmodel.setChecked(aa);
        radiostationmodel.setVisibility(0);
    }

    protected final void a(RadioStationsModel radiostationsmodel)
    {
        aa = false;
        String s = super.a;
        radiostationsmodel = radiostationsmodel.savedStations;
        int j = radiostationsmodel.length;
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (!((RadioStationModel) (radiostationsmodel[i])).uri.equals(s))
                    {
                        break label0;
                    }
                    aa = true;
                }
                radiostationsmodel = (ToggleButton)super.Z;
                radiostationsmodel.setChecked(aa);
                radiostationsmodel.setVisibility(0);
                radiostationsmodel = (RadioStationModel)super.ae;
                if (radiostationsmodel != null)
                {
                    super.ae = a(((RadioStationModel) (radiostationsmodel)));
                }
                return;
            }
            i++;
        } while (true);
    }
}
