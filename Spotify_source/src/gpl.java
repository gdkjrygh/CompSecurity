// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.music.internal.provider.SpotifyProvider;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class gpl
{

    public static int a(SpotifyLink spotifylink)
    {
        spotifylink = spotifylink.c;
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.g.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.X.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.an.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aO.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[spotifylink.ordinal()])
        {
        case 3: // '\003'
        case 5: // '\005'
        default:
            return 0x7f080231;

        case 6: // '\006'
            return 0x7f080235;

        case 1: // '\001'
            return 0x7f080232;

        case 2: // '\002'
            return 0x7f080233;

        case 4: // '\004'
            return 0x7f080234;
        }
    }

    public static Uri a(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/radio/").append(s).toString());
    }

    public static RadioStationModel a(RadioStationModel radiostationmodel, boolean flag)
    {
        if (radiostationmodel.explicitSave == flag)
        {
            return radiostationmodel;
        } else
        {
            return new RadioStationModel(radiostationmodel.uri, radiostationmodel.title, radiostationmodel.titleUri, radiostationmodel.imageUri, radiostationmodel.subtitle, radiostationmodel.subtitleUri, radiostationmodel.seeds, radiostationmodel.relatedArtists, radiostationmodel.tracks, radiostationmodel.nextPageUrl, flag);
        }
    }

    public static String a(Context context, SpotifyLink spotifylink)
    {
        spotifylink = spotifylink.c;
        context = context.getResources();
        switch (_cls1.a[spotifylink.ordinal()])
        {
        default:
            return " ";

        case 1: // '\001'
            return context.getString(0x7f08043a);

        case 2: // '\002'
            return context.getString(0x7f08043b);

        case 3: // '\003'
            return context.getString(0x7f08043c);

        case 4: // '\004'
        case 5: // '\005'
            return context.getString(0x7f08043d);

        case 6: // '\006'
            return context.getString(0x7f08043e);
        }
    }

    public static String a(String s, PlayerTrack aplayertrack[])
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            int j = s.indexOf('?');
            s1 = s;
            if (j >= 0)
            {
                Object obj = new LinkedHashSet();
                int k = aplayertrack.length;
                for (int i = 0; i < k; i++)
                {
                    ((Set) (obj)).add(aplayertrack[i].uri().substring(14));
                }

                for (aplayertrack = ((Set) (obj)).iterator(); ((Set) (obj)).size() > 40 && aplayertrack.hasNext(); aplayertrack.remove())
                {
                    aplayertrack.next();
                }

                aplayertrack = s.substring(0, j);
                s = Uri.parse(s).getQueryParameter("salt");
                String s2 = TextUtils.join(",", ((Iterable) (obj)));
                obj = new ArrayList();
                if (!TextUtils.isEmpty(s))
                {
                    ((List) (obj)).add((new StringBuilder("salt=")).append(s).toString());
                }
                if (!TextUtils.isEmpty(s2))
                {
                    ((List) (obj)).add((new StringBuilder("prev_tracks=")).append(s2).toString());
                }
                s = new StringBuilder(aplayertrack);
                if (((List) (obj)).size() > 0)
                {
                    s.append('?').append(TextUtils.join("&", ((Iterable) (obj))));
                }
                return s.toString();
            }
        }
        return s1;
    }

    public static boolean a(Flags flags)
    {
        return "Enabled".equals(flags.a(fys.T));
    }

    public static int b(SpotifyLink spotifylink)
    {
        spotifylink = spotifylink.c;
        switch (_cls1.a[spotifylink.ordinal()])
        {
        case 5: // '\005'
        default:
            return 0x7f08021f;

        case 6: // '\006'
            return 0x7f080220;

        case 1: // '\001'
            return 0x7f08021b;

        case 2: // '\002'
            return 0x7f08021c;

        case 4: // '\004'
            return 0x7f08021e;

        case 3: // '\003'
            return 0x7f08021d;
        }
    }

    public static String b(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (s != null)
        {
            s1 = obj;
            if (s.startsWith("spotify:"))
            {
                s1 = (new StringBuilder("spotify:station:")).append(s.substring(8)).toString();
            }
        }
        return s1;
    }

    public static boolean b(Flags flags)
    {
        return "Enabled".equals(flags.a(fys.S));
    }

    public static String c(String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s.startsWith("spotify:station:")) goto _L4; else goto _L3
_L3:
        String s1 = (new StringBuilder("spotify:")).append(s.substring(16)).toString();
_L5:
        return s1;
_L4:
        if (s.startsWith("spotify:radio:"))
        {
            return (new StringBuilder("spotify:")).append(s.substring(14)).toString();
        }
        s1 = s;
        if (s.startsWith("spotify:")) goto _L5; else goto _L2
_L2:
        return null;
    }

    public static String d(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (s != null)
        {
            s1 = obj;
            if (s.startsWith("spotify:station:"))
            {
                s1 = (new StringBuilder("spotify:")).append(s.substring(16)).toString();
            }
        }
        return s1;
    }

    public static boolean e(String s)
    {
        return s != null && s.startsWith("spotify:radio:");
    }

    public static boolean f(String s)
    {
        return s != null && s.startsWith("spotify:station:");
    }
}
