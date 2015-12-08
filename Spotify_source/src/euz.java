// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.common.collect.Maps;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSession;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.spotlets.momentsstart.MomentsStartFragment;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext;
import com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Map;

public final class euz
{

    public boolean a;
    boolean b;
    final Context c;
    public final Player d;
    final evb e;
    final MomentPlayerSnapshotCache f;
    final dwh g;
    Flags h;
    private Handler i;

    public euz(Context context, Player player, evb evb1, MomentPlayerSnapshotCache momentplayersnapshotcache, dwh dwh1, Flags flags)
    {
        i = new Handler(new android.os.Handler.Callback() {

            private euz a;

            public final boolean handleMessage(Message message)
            {
                Object obj;
                switch (message.what)
                {
                default:
                    Assertion.a((new StringBuilder("Unexpected message ")).append(message.what).toString());
                    return true;

                case 1: // '\001'
                    obj = message.getData();
                    break;
                }
                message = (MomentContext)((Bundle) (obj)).getParcelable("key_current");
                MomentContext momentcontext = (MomentContext)((Bundle) (obj)).getParcelable("key_next");
                MomentContext momentcontext1 = (MomentContext)((Bundle) (obj)).getParcelable("key_previous");
                obj = a;
                if (((euz) (obj)).b)
                {
                    ((euz) (obj)).a(message, momentcontext1, momentcontext, 500L);
                    return true;
                }
                obj.b = true;
                PlayerState playerstate = ((euz) (obj)).d.getLastPlayerState();
                if (playerstate != null && TextUtils.equals(((MomentContext) (message)).uri, playerstate.entityUri()))
                {
                    if (playerstate.isPaused())
                    {
                        ((euz) (obj)).d.resume();
                    }
                    obj.b = false;
                    return true;
                } else
                {
                    message = ((_cls2) (obj)). new eva(message, momentcontext1, momentcontext) {

                        final MomentContext a;
                        final euz b;
                        private MomentContext c;
                        private MomentContext d;

                        public final void a()
                        {
                            Object obj = b.f.get(a.uri);
                            com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder builder = euz.a(((com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache.Entry) (obj)));
                            builder.suppressions(new String[] {
                                "mft"
                            });
                            builder.playerOptionsOverride(false, true, false);
                            dmz.a(com/spotify/mobile/android/spotlets/momentsstart/MomentsStartFragment, com/spotify/mobile/android/spotlets/momentsstart/model/MomentContext, a);
                            boolean flag;
                            if (b.a && b.a())
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            if (!euz.a(b, ((com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache.Entry) (obj))))
                            {
                                if (SpotifyLink.a(a.uri, new com.spotify.mobile.android.util.SpotifyLink.LinkType[] {
                        com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ, com.spotify.mobile.android.util.SpotifyLink.LinkType.P
                    }))
                                {
                                    if (flag)
                                    {
                                        b.a(a, builder, true);
                                    } else
                                    {
                                        Player player = b.d;
                                        PlayerContext playercontext = euz.a(a);
                                        com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions = builder.build();
                                        if (b.a())
                                        {
                                            obj = null;
                                        } else
                                        {
                                            obj = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback(this) {

                                                final _cls2 a;

                                                public final void onPlayForbidden(List list)
                                                {
                                                }

                                                public final void onPlaySuccess()
                                                {
                                                    a.b.d.fetchState(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver(this) {

                                                        private _cls1 a;

                                                        public final void onPlayerStateReceived(PlayerState playerstate)
                                                        {
                                                            euz euz1;
                                                            String s;
                                                            boolean flag2;
                                                            flag2 = true;
                                                            euz1 = a.a.b;
                                                            s = a.a.a.uri;
                                                            if (TextUtils.equals(playerstate.entityUri(), s)) goto _L2; else goto _L1
_L1:
                                                            boolean flag1;
                                                            boolean flag;
                                                            if (euz1.g.c() && !((ConnectManager)euz1.g.f()).i() && ((ConnectManager)euz1.g.f()).d() != null && ((ConnectManager)euz1.g.f()).d().l == com.spotify.mobile.android.service.ConnectDevice.DeviceType.d)
                                                            {
                                                                flag = true;
                                                            } else
                                                            {
                                                                flag = false;
                                                            }
                                                            flag1 = flag2;
                                                            if (TextUtils.equals(ezr.a(playerstate, "media.type"), "video")) goto _L4; else goto _L3
_L3:
                                                            if (flag) goto _L2; else goto _L5
_L5:
                                                            flag1 = flag2;
_L4:
                                                            if (flag1)
                                                            {
                                                                playerstate = new dfj(a.a.b.c, 0x7f0b017f);
                                                                playerstate.a(0x7f080279);
                                                                playerstate.b(0x7f080277);
                                                                playerstate.a(0x7f080278, new android.content.DialogInterface.OnClickListener() {

                                                                    public final void onClick(DialogInterface dialoginterface, int j)
                                                                    {
                                                                        dialoginterface.dismiss();
                                                                    }

                                                                });
                                                                playerstate.b().show();
                                                            }
                                                            return;
_L2:
                                                            flag1 = false;
                                                            if (true) goto _L4; else goto _L6
_L6:
                                                        }

            
            {
                a = _pcls1;
                super();
            }
                                                    });
                                                }

            
            {
                a = _pcls2;
                super();
            }
                                            };
                                        }
                                        player.play(playercontext, playoptions, ((com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback) (obj)));
                                    }
                                } else
                                {
                                    obj = euz.a(((com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache.Entry) (obj)));
                                    boolean flag1;
                                    if (!gex.a(b.h))
                                    {
                                        flag1 = true;
                                    } else
                                    {
                                        flag1 = false;
                                    }
                                    ((com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder) (obj)).playerOptionsOverride(flag1, true, false);
                                    b.d.playWithViewUri(euz.a(a), ((com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder) (obj)).build(), ViewUri.j.toString());
                                }
                            }
                            b.b = false;
                            if (flag)
                            {
                                b.a(c, builder, false);
                                b.a(d, builder, false);
                            }
                        }

            
            {
                b = euz.this;
                a = momentcontext;
                c = momentcontext1;
                d = momentcontext2;
                super();
            }
                    };
                    ((euz) (obj)).d.fetchState(((_cls5) (obj)). new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver(message) {

                        final eva a;
                        final euz b;

                        public final void onPlayerStateReceived(PlayerState playerstate)
                        {
                            PlayerTrack playertrack = playerstate.track();
                            if (b.g.c() && !((ConnectManager)b.g.f()).i())
                            {
                                if (playertrack != null)
                                {
                                    b.f.put(playerstate.entityUri(), playerstate.track(), playerstate.index(), playerstate.currentPlaybackPosition(), null);
                                }
                                a.a();
                                return;
                            } else
                            {
                                b.d.save(new com.spotify.mobile.android.cosmos.player.v2.Player.SaveCallback(this, playertrack, playerstate) {

                                    private PlayerTrack a;
                                    private PlayerState b;
                                    private _cls5 c;

                                    public final void onSaveFailed()
                                    {
                                        Logger.c("Failed to save snapshot: %s", new Object[] {
                                            b.entityUri()
                                        });
                                        c.a.a();
                                    }

                                    public final void onSnapshotReceived(String s)
                                    {
                                        if (a != null)
                                        {
                                            c.b.f.put(b.entityUri(), a, b.index(), b.currentPlaybackPosition(), s);
                                            if (SpotifyLink.a(a.uri(), new com.spotify.mobile.android.util.SpotifyLink.LinkType[] {
                                    com.spotify.mobile.android.util.SpotifyLink.LinkType.P
                                }))
                                            {
                                                s = fbn.a(a, c.b.h, b.currentPlaybackPosition());
                                                if (!Uri.EMPTY.equals(s))
                                                {
                                                    ((gft)dmz.a(gft)).a().a(s).e();
                                                }
                                            }
                                        }
                                        c.a.a();
                                    }

            
            {
                c = _pcls5;
                a = playertrack;
                b = playerstate;
                super();
            }
                                });
                                return;
                            }
                        }

            
            {
                b = euz.this;
                a = eva1;
                super();
            }
                    });
                    return true;
                }
            }

            
            {
                a = euz.this;
                super();
            }
        });
        c = (Context)ctz.a(context);
        d = (Player)ctz.a(player);
        e = (evb)ctz.a(evb1);
        f = (MomentPlayerSnapshotCache)ctz.a(momentplayersnapshotcache);
        g = (dwh)ctz.a(dwh1);
        h = (Flags)ctz.a(flags);
    }

    protected static com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder a(com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache.Entry entry)
    {
        com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder builder = new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder();
        if (entry != null)
        {
            builder.seekTo(entry.timestamp);
            builder.skipToIndex(entry.index);
        }
        return builder;
    }

    public static PlayerContext a(MomentContext momentcontext)
    {
        java.util.HashMap hashmap = Maps.b();
        hashmap.put("context_description", momentcontext.name);
        hashmap.put("image_url", momentcontext.imageUri);
        hashmap.put("context_long_description", momentcontext.description);
        String s;
        if (momentcontext.contextUrl != null)
        {
            s = momentcontext.contextUrl;
        } else
        if (!momentcontext.uri.matches("spotify:user:[^:]+:(playlist:|starred).*"))
        {
            s = (new StringBuilder("hm://track-resolver/v2?uri=")).append(Uri.encode(momentcontext.uri)).toString();
        } else
        {
            s = momentcontext.uri;
        }
        return PlayerContext.create(momentcontext.uri, s, hashmap);
    }

    static boolean a(euz euz1, com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache.Entry entry)
    {
        if (entry != null && entry.snapshot != null && euz1.a())
        {
            euz1.d.restore(entry.snapshot, euz1. new com.spotify.mobile.android.cosmos.player.v2.Player.RestoreCallback() {

                private euz a;

                public final void onRestoreFailed()
                {
                    Logger.c("Failed to restore the snapshot", new Object[0]);
                }

                public final void onRestoreSuccess()
                {
                    a.d.resume();
                }

            
            {
                a = euz.this;
                super();
            }
            });
            return true;
        } else
        {
            return false;
        }
    }

    public final void a(MomentContext momentcontext, com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder builder, boolean flag)
    {
        if (momentcontext != null && SpotifyLink.a(momentcontext.uri, new com.spotify.mobile.android.util.SpotifyLink.LinkType[] {
    com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ, com.spotify.mobile.android.util.SpotifyLink.LinkType.P
}))
        {
            PlayerSession playersession = (PlayerSession)e.get(momentcontext.uri);
            if (playersession != null)
            {
                if (flag)
                {
                    playersession.play();
                    return;
                }
            } else
            {
                d.preparePlay(a(momentcontext), builder.build(), new com.spotify.mobile.android.cosmos.player.v2.Player.PreparePlayCallback(momentcontext, flag) {

                    private MomentContext a;
                    private boolean b;
                    private euz c;

                    public final void onPreparePlayFailed()
                    {
                        Logger.c("Failed to prepare play", new Object[0]);
                    }

                    public final void onPreparePlaySuccess(PlayerSession playersession1)
                    {
                        c.e.put(a.uri, playersession1);
                        if (b)
                        {
                            playersession1.play();
                        }
                    }

            
            {
                c = euz.this;
                a = momentcontext;
                b = flag;
                super();
            }
                });
                return;
            }
        }
    }

    public final void a(MomentContext momentcontext, MomentContext momentcontext1, MomentContext momentcontext2, long l)
    {
        ctz.a(momentcontext);
        i.removeMessages(1);
        Message message = i.obtainMessage(1);
        Bundle bundle = message.getData();
        bundle.putParcelable("key_current", momentcontext);
        bundle.putParcelable("key_previous", momentcontext1);
        bundle.putParcelable("key_next", momentcontext2);
        i.sendMessageDelayed(message, l);
    }

    protected final boolean a()
    {
        return g.c() && ((ConnectManager)g.f()).i();
    }

    public final PlayerState b()
    {
        return d.getLastPlayerState();
    }

    public final void c()
    {
        i.removeMessages(1);
    }
}
