// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.ads.FeaturedAction;
import java.util.HashSet;
import java.util.Iterator;

public final class eef
{

    com.spotify.mobile.android.ui.NavigationItem.NavigationGroup a;
    FeaturedAction b;
    PlayerState c;
    private HashSet d;
    private final fbp e;
    private IntentFilter f;
    private BroadcastReceiver g;
    private fbq h;
    private Player i;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver j;

    public eef(fbp fbp1, Player player)
    {
        f = new IntentFilter("ACTION_LATEST_NAVIGATION");
        a = com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.a;
        g = new BroadcastReceiver() {

            private eef a;

            public final void onReceive(Context context, Intent intent)
            {
                a.a = (com.spotify.mobile.android.ui.NavigationItem.NavigationGroup)intent.getSerializableExtra("navigation_group");
                eef.a(a);
            }

            
            {
                a = eef.this;
                super();
            }
        };
        b = FeaturedAction.a();
        h = new fbq() {

            private eef a;

            public final void a(FeaturedAction featuredaction)
            {
                a.b = featuredaction;
                eef.a(a);
            }

            
            {
                a = eef.this;
                super();
            }
        };
        j = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private eef a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                a.c = playerstate;
                eef.a(a);
            }

            
            {
                a = eef.this;
                super();
            }
        };
        e = fbp1;
        i = player;
        d = new HashSet();
    }

    static void a(eef eef1)
    {
        for (Iterator iterator = eef1.d.iterator(); iterator.hasNext(); eef1.c((eeg)iterator.next())) { }
    }

    private void c(eeg eeg1)
    {
        boolean flag2;
        boolean flag3;
        flag3 = true;
        boolean flag;
        if (c != null && PlayerTrackUtil.isAd(c.track()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!PlayerTrackUtil.isVideo(c.track())) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
_L6:
        eeg1.a(flag2);
        return;
_L4:
        flag2 = c.track().uri().contains(b.m());
        boolean flag1;
        boolean flag4;
        if (flag2 && !b.e())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag4 = a.equals(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.c);
        flag2 = flag3;
        if (flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (flag4)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag2 = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(eeg eeg1)
    {
        d.add(eeg1);
        if (d.size() == 1)
        {
            ((gnq)dmz.a(gnq)).a(g, f);
            e.a(h);
            i.registerPlayerStateObserver(j);
            return;
        } else
        {
            c(eeg1);
            return;
        }
    }

    public final void b(eeg eeg1)
    {
        d.remove(eeg1);
        if (d.isEmpty())
        {
            ((gnq)dmz.a(gnq)).a(g);
            e.b(h);
            i.unregisterPlayerStateObserver(j);
        }
    }
}
