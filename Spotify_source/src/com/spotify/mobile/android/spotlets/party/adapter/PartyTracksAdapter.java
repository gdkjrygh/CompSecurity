// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.adapter;

import aav;
import abo;
import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.party.json.TrackJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.TracksJacksonModel;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import eyj;
import eyk;
import eyl;
import eym;
import fuj;
import fve;
import fwv;
import fww;
import fwx;
import fwy;
import fwz;
import fxa;
import fxd;
import java.util.List;

public final class PartyTracksAdapter extends aav
{

    public TracksJacksonModel c;
    public String d;
    private final Context e;
    private final Verified f;
    private final eyk g;
    private final Flags h;
    private final fuj i = new fuj() {

        private PartyTracksAdapter a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (TrackJacksonModel)obj;
            fve.a(PartyTracksAdapter.c(a)).a(((TrackJacksonModel) (obj)).uri, ((TrackJacksonModel) (obj)).name).a(PartyTracksAdapter.b(a)).a(true).a(true).a(true).a(false, null).a(PartyTracksAdapter.a(a)).a(spotifycontextmenu);
        }

            
            {
                a = PartyTracksAdapter.this;
                super();
            }
    };

    public PartyTracksAdapter(Context context, Verified verified, eyk eyk, Flags flags)
    {
        e = context;
        f = verified;
        g = eyk;
        h = flags;
    }

    static Flags a(PartyTracksAdapter partytracksadapter)
    {
        return partytracksadapter.h;
    }

    static Verified b(PartyTracksAdapter partytracksadapter)
    {
        return partytracksadapter.f;
    }

    static Context c(PartyTracksAdapter partytracksadapter)
    {
        return partytracksadapter.e;
    }

    public final int a(int j)
    {
        if (j == 0)
        {
            return Type.b.ordinal();
        } else
        {
            return Type.a.ordinal();
        }
    }

    public final abo a(ViewGroup viewgroup, int j)
    {
        if (Type.values()[j] == Type.b)
        {
            return new eyj(viewgroup, d);
        } else
        {
            return new eyl(viewgroup, i, g);
        }
    }

    public final void a(abo abo, int j)
    {
        eym eym1 = (eym)abo;
        if (j == 0)
        {
            abo = null;
        } else
        {
            abo = (TrackJacksonModel)c.tracks.get(j - 1);
        }
        eym1.a(abo);
    }

    public final int b()
    {
        if (c != null)
        {
            return c.tracks.size() + 1;
        } else
        {
            return 0;
        }
    }

    static 
    {
        Type.values();
    }

    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        private static final Type c[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/party/adapter/PartyTracksAdapter$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])c.clone();
        }

        static 
        {
            a = new Type("ITEM", 0);
            b = new Type("HEADER", 1);
            c = (new Type[] {
                a, b
            });
        }

        private Type(String s, int j)
        {
            super(s, j);
        }
    }

}
