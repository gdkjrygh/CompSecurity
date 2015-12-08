// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import com.spotify.music.spotlets.radio.model.ClusterRadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;

public final class gop extends goo
{

    private final fxo aa = new fxo() {

        private gop a;

        public final void a(fxp fxp1)
        {
            fxp1 = (RadioStationModel)fxp1.f;
            a.a(((RadioStationModel) (fxp1)).uri, ((RadioStationModel) (fxp1)).title);
            gop.a(a);
            gop.b(a);
        }

            
            {
                a = gop.this;
                super();
            }
    };
    private final fuj ag = new fuj() {

        private gop a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            int j = 0;
            obj = (RadioStationsModel)obj;
            spotifycontextmenu.a();
            spotifycontextmenu.a(a.b(0x7f08018a));
            String s = a.b(0x7f080189);
            spotifycontextmenu.a.c = s;
            obj = ((RadioStationsModel) (obj)).clusterStations;
            int k = obj.length;
            for (int i = 0; j < k; i++)
            {
                Object obj1 = obj[j];
                fxp fxp1 = spotifycontextmenu.a(i, ((RadioStationModel) (obj1)).title);
                fxp1.d = gop.c(a);
                fxp1.f = obj1;
                j++;
            }

        }

            
            {
                a = gop.this;
                super();
            }
    };
    private RadioStationsModel ah;
    private boolean ai;

    public gop()
    {
    }

    static void a(gop gop1)
    {
        gop1.ae = null;
    }

    static void b(gop gop1)
    {
        gop1.P();
    }

    static fxo c(gop gop1)
    {
        return gop1.aa;
    }

    static fuj d(gop gop1)
    {
        return gop1.ag;
    }

    protected final int H()
    {
        return 0x7f080188;
    }

    public final String I()
    {
        return "cluster-station";
    }

    protected final Button J()
    {
        Button button = (Button)LayoutInflater.from(k()).inflate(0x7f0300c7, null);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            private gop a;

            public final void onClick(View view)
            {
                gop gop1 = a;
                fuj fuj = gop.d(a);
                view = (RadioStationsModel)view.getTag();
                fud.a(gop1.k(), fuj, view);
            }

            
            {
                a = gop.this;
                super();
            }
        });
        return button;
    }

    protected final void a(RadioStationsModel radiostationsmodel)
    {
        int i;
        ah = radiostationsmodel;
        super.Z.setTag(radiostationsmodel);
        Object obj = super.Z;
        ClusterRadioStationModel aclusterradiostationmodel[];
        int j;
        if (radiostationsmodel.clusterStations.length > 0)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((Button) (obj)).setVisibility(i);
        if (radiostationsmodel.clusterStations.length <= 0) goto _L2; else goto _L1
_L1:
        if (ViewUri.X.b(super.a)) goto _L4; else goto _L3
_L3:
        obj = super.a;
        aclusterradiostationmodel = radiostationsmodel.clusterStations;
        j = aclusterradiostationmodel.length;
        i = 0;
_L9:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (!aclusterradiostationmodel[i].uri.equals(obj)) goto _L6; else goto _L5
_L5:
        i = 0;
_L10:
        if (i == 0) goto _L7; else goto _L4
_L4:
        a(radiostationsmodel.clusterStations[0].uri, "");
_L7:
        if (!ai) goto _L8; else goto _L2
_L2:
        ai = false;
        P();
_L8:
        return;
_L6:
        i++;
          goto _L9
        i = 1;
          goto _L10
    }

    protected final void a(gnn gnn)
    {
        if (ah == null)
        {
            ai = true;
            return;
        } else
        {
            ai = false;
            super.a(gnn);
            return;
        }
    }
}
