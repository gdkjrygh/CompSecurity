// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

final class ang.Object
    implements fuj
{

    private emr a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        RadioStationModel radiostationmodel;
        emr emr1;
        String s;
        SpotifyLink spotifylink;
        radiostationmodel = (RadioStationModel)obj;
        obj = new fuk(a.d, radiostationmodel.stationUri, com.spotify.mobile.android.util.viewuri.i.SubView.e, spotifycontextmenu);
        emr1 = a;
        s = radiostationmodel.uri;
        ((fuk) (obj)).a(0x7f1100b3, 0x7f08023a, SpotifyIcon.ai).d = new (((fuk) (obj)), s);
        s = gpl.d(radiostationmodel.uri);
        spotifylink = new SpotifyLink(s);
        a[spotifylink.c.ordinal()];
        JVM INSTR tableswitch 1 4: default 128
    //                   1 187
    //                   2 200
    //                   3 221
    //                   4 256;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_256;
_L6:
        obj = radiostationmodel.imageUri;
        String s1;
        if (obj == null)
        {
            obj = "";
        }
        spotifycontextmenu.b((String)obj);
        spotifycontextmenu.a.a = radiostationmodel.title;
        spotifycontextmenu.a.b = gpl.a(emr1.d, new SpotifyLink(gpl.d(radiostationmodel.uri)));
        return;
_L2:
        ((fuk) (obj)).a(s, radiostationmodel.title);
          goto _L6
_L3:
        ((fuk) (obj)).b(s, radiostationmodel.title);
        spotifycontextmenu.a.g = true;
          goto _L6
_L4:
        s1 = radiostationmodel.title;
        ((fuk) (obj)).a(0x7f11002c, 0x7f08020d, SpotifyIcon.E).d = new (((fuk) (obj)), s, s1);
          goto _L6
        if (!TextUtils.isEmpty(radiostationmodel.subtitleUri) && !TextUtils.isEmpty(radiostationmodel.subtitle))
        {
            ((fuk) (obj)).b(radiostationmodel.subtitleUri, radiostationmodel.subtitle);
        }
          goto _L6
    }

    (emr emr1)
    {
        a = emr1;
        super();
    }
}
