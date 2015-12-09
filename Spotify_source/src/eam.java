// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class eam
{

    public eam()
    {
    }

    public static List a(Optional optional, Optional optional1, PlayerState playerstate)
    {
        ArrayList arraylist = new ArrayList();
        if (playerstate == null || playerstate.track() == null)
        {
            return arraylist;
        }
        if (playerstate.isPaused())
        {
            arraylist.add(MediaAction.a);
        } else
        {
            arraylist.add(MediaAction.b);
        }
        if (Boolean.valueOf((String)playerstate.track().metadata().get("is_advertisement")).booleanValue())
        {
            return arraylist;
        }
        if (playerstate.restrictions().disallowSkippingNextReasons().isEmpty())
        {
            arraylist.add(MediaAction.c);
        }
        if (playerstate.restrictions().disallowSkippingPrevReasons().isEmpty())
        {
            arraylist.add(MediaAction.d);
        }
        if (optional.b() && gpl.f(((gpg)optional.c()).c))
        {
            arraylist.add(MediaAction.i);
            if (optional.b())
            {
                optional = (gpg)optional.c();
                if (ThumbState.b.equals(optional.a()))
                {
                    arraylist.add(MediaAction.h);
                } else
                if (ThumbState.c.equals(optional.a()))
                {
                    arraylist.add(MediaAction.j);
                } else
                {
                    arraylist.add(MediaAction.g);
                }
            } else
            {
                arraylist.add(MediaAction.g);
            }
        } else
        if (playerstate.restrictions().disallowTogglingShuffleReasons().isEmpty())
        {
            if (playerstate.options().shufflingContext())
            {
                arraylist.add(MediaAction.f);
            } else
            {
                arraylist.add(MediaAction.e);
            }
        }
        if (optional1.b() && ((eaz)optional1.c()).b)
        {
            if (((eaz)optional1.c()).a)
            {
                arraylist.add(MediaAction.m);
            } else
            {
                arraylist.add(MediaAction.l);
            }
        }
        arraylist.add(MediaAction.k);
        if (playerstate.options().repeatingContext())
        {
            if (a(playerstate))
            {
                arraylist.add(MediaAction.o);
            } else
            if (b(playerstate))
            {
                arraylist.add(MediaAction.q);
            }
        } else
        if (playerstate.options().repeatingTrack())
        {
            if (a(playerstate))
            {
                arraylist.add(MediaAction.p);
            }
        } else
        if (b(playerstate))
        {
            arraylist.add(MediaAction.n);
        }
        return arraylist;
    }

    private static boolean a(PlayerState playerstate)
    {
        return playerstate.restrictions().disallowTogglingRepeatTrackReasons().isEmpty();
    }

    private static boolean b(PlayerState playerstate)
    {
        return playerstate.restrictions().disallowTogglingRepeatContextReasons().isEmpty();
    }
}
