// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed;

import am;
import an;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.activityfeed.adapter.ActivityFeedStoryAdapter;
import com.spotify.mobile.android.spotlets.activityfeed.model.ActivityFeedModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.StoryModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.StreamsModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.UserModel;
import com.spotify.mobile.android.spotlets.activityfeed.util.ActivityFeedClientEventLogger;
import com.spotify.mobile.android.spotlets.findfriends.FindFriendsActivity;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import ctz;
import cu;
import da;
import dfi;
import dfj;
import dgp;
import dmz;
import dtx;
import edg;
import edk;
import edl;
import edo;
import fxh;
import fxy;
import fyw;
import fzr;
import gaa;
import gab;
import gcj;
import gck;
import gcw;
import gex;
import ggl;
import ggn;
import gin;
import gms;
import gnl;
import java.util.HashSet;
import java.util.Locale;
import ql;
import u;

public final class ActivityFeedFragment extends Fragment
    implements android.widget.AbsListView.OnScrollListener, NavigationItem, fxy, gck, ql
{

    public static final ImmutableList a = ImmutableList.a("spotify:internal:social-feed", "spotify:internal:recent-shares");
    ActivityFeedStoryAdapter Y;
    ListView Z;
    private android.widget.AdapterView.OnItemClickListener aA;
    private edk aa;
    private edo ab;
    private ContentViewManager ac;
    private SwipeRefreshLayout ad;
    private EmptyView ae;
    private LoadingView af;
    private Button ag;
    private Parcelable ah;
    private View ai;
    private dfi aj;
    private gcj ak;
    private ggl al;
    private ActivityFeedClientEventLogger am;
    private Resolver an;
    private StoryModel ao;
    private int ap;
    private Player aq;
    private StoryModel ar;
    private int as;
    private boolean at;
    private boolean au;
    private boolean av;
    private Flags aw;
    private Type ax;
    private an ay;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver az;
    protected ActivityFeedModel b;

    public ActivityFeedFragment()
    {
        ax = Type.a;
        ay = new an() {

            private String a[] = {
                "private_session"
            };
            private ActivityFeedFragment b;

            public final da a(Bundle bundle)
            {
                return new cu(b.k(), dtx.a, a, null, null);
            }

            public final void a()
            {
                ActivityFeedFragment.a(b).b = true;
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (obj != null && ((Cursor) (obj)).moveToFirst())
                {
                    ActivityFeedFragment.a(b).b = gcw.a(((Cursor) (obj)), "private_session");
                }
            }

            
            {
                b = ActivityFeedFragment.this;
                super();
            }
        };
        az = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private String a;
            private boolean b;
            private PlayerTrack c;
            private ActivityFeedFragment d;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                boolean flag;
                if (!playerstate.entityUri().equals(a) || b != playerstate.isPaused() || !PlayerTrackUtil.areUidsEqual(c, playerstate.track()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    a = playerstate.entityUri();
                    b = playerstate.isPaused();
                    c = playerstate.track();
                    ActivityFeedFragment.a(d, playerstate);
                    d.Y.notifyDataSetChanged();
                }
                if (ActivityFeedFragment.b(d, playerstate))
                {
                    ActivityFeedFragment.a(d).a(ActivityFeedFragment.b(d), new edg());
                }
            }

            
            {
                d = ActivityFeedFragment.this;
                super();
                a = "";
            }
        };
        aA = new android.widget.AdapterView.OnItemClickListener() {

            private ActivityFeedFragment a;

            public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
            {
                if (a.Y.getCount() != 0)
                {
                    ActivityFeedFragment.a(a, a.Y.a(i1));
                    ActivityFeedFragment.a(a, (int)l1);
                    adapterview = a.Y.b(i1);
                    final class _cls3
                    {

                        static final int a[];

                        static 
                        {
                            a = new int[com.spotify.mobile.android.spotlets.activityfeed.adapter.ActivityFeedStoryAdapter.ViewType.values().length];
                            try
                            {
                                a[com.spotify.mobile.android.spotlets.activityfeed.adapter.ActivityFeedStoryAdapter.ViewType.a.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror4) { }
                            try
                            {
                                a[com.spotify.mobile.android.spotlets.activityfeed.adapter.ActivityFeedStoryAdapter.ViewType.d.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror3) { }
                            try
                            {
                                a[com.spotify.mobile.android.spotlets.activityfeed.adapter.ActivityFeedStoryAdapter.ViewType.e.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror2) { }
                            try
                            {
                                a[com.spotify.mobile.android.spotlets.activityfeed.adapter.ActivityFeedStoryAdapter.ViewType.c.ordinal()] = 4;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                a[com.spotify.mobile.android.spotlets.activityfeed.adapter.ActivityFeedStoryAdapter.ViewType.b.ordinal()] = 5;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    switch (_cls3.a[adapterview.ordinal()])
                    {
                    default:
                        return;

                    case 1: // '\001'
                        a.k().startActivity(gms.a(a.k(), ActivityFeedFragment.f(a).getAuthor().getUri()).a);
                        ActivityFeedFragment.d(a).a(com.spotify.mobile.android.spotlets.activityfeed.util.ActivityFeedClientEventLogger.StoryAction.a, ActivityFeedFragment.f(a), i1);
                        return;

                    case 2: // '\002'
                        ActivityFeedFragment.a(a, ActivityFeedFragment.f(a), i1);
                        ActivityFeedFragment.d(a).a(com.spotify.mobile.android.spotlets.activityfeed.util.ActivityFeedClientEventLogger.StoryAction.b, ActivityFeedFragment.f(a), i1);
                        return;

                    case 3: // '\003'
                        break;
                    }
                    if (ActivityFeedFragment.f(a).getStreams().getCount() > 0)
                    {
                        adapterview = new Bundle();
                        adapterview.putString("spotify:internal:social-feed:reactors:story_id", ActivityFeedFragment.f(a).getId());
                        a.k().startActivity(gms.a(a.k(), "spotify:internal:social-feed:reactors").a(adapterview).a);
                        ActivityFeedFragment.d(a).a(com.spotify.mobile.android.spotlets.activityfeed.util.ActivityFeedClientEventLogger.StoryAction.c, ActivityFeedFragment.f(a), i1);
                        return;
                    }
                }
            }

            
            {
                a = ActivityFeedFragment.this;
                super();
            }
        };
    }

    private void K()
    {
        if (g() != null && Type.b == g().getParcelable("com.spotify.activity_feed.type"))
        {
            ax = (Type)g().getParcelable("com.spotify.activity_feed.type");
            ax.a(g().getString("com.spotify.activity_feed.type.profile_username"));
        }
    }

    private void L()
    {
        ai.setVisibility(8);
        ad.a();
        at = false;
    }

    static int a(ActivityFeedFragment activityfeedfragment, int i1)
    {
        activityfeedfragment.as = i1;
        return i1;
    }

    public static ActivityFeedFragment a(Flags flags)
    {
        ActivityFeedFragment activityfeedfragment = new ActivityFeedFragment();
        fyw.a(activityfeedfragment, flags);
        return activityfeedfragment;
    }

    public static ActivityFeedFragment a(String s, String s1, Flags flags)
    {
        ctz.a(s);
        ActivityFeedFragment activityfeedfragment = new ActivityFeedFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.spotify.activity_feed.type.profile_username", s);
        bundle.putString("com.spotify.activity_feed.type.current_username", s1);
        bundle.putParcelable("com.spotify.activity_feed.type", Type.b);
        activityfeedfragment.f(bundle);
        fyw.a(activityfeedfragment, flags);
        return activityfeedfragment;
    }

    static StoryModel a(ActivityFeedFragment activityfeedfragment, StoryModel storymodel)
    {
        activityfeedfragment.ar = storymodel;
        return storymodel;
    }

    static edo a(ActivityFeedFragment activityfeedfragment)
    {
        return activityfeedfragment.ab;
    }

    static void a(ActivityFeedFragment activityfeedfragment, PlayerState playerstate)
    {
        if (playerstate != null)
        {
            activityfeedfragment = activityfeedfragment.b.getStories();
            int j1 = activityfeedfragment.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                StoryModel storymodel = activityfeedfragment[i1];
                PlayerTrack playertrack = PlayerTrack.create(storymodel.getResource().getUri());
                boolean flag;
                boolean flag1;
                boolean flag2;
                if (playerstate.isPlaying() && !playerstate.isPaused())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (storymodel.hasMatchingContextUri(playerstate.entityUri()) || PlayerTrackUtil.areUidsEqual(playerstate.track(), playertrack))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag && flag1)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                storymodel.setIsPlaying(flag2);
                i1++;
            }
        }
    }

    static void a(ActivityFeedFragment activityfeedfragment, ActivityFeedModel activityfeedmodel)
    {
        activityfeedfragment.a(activityfeedmodel);
    }

    static void a(ActivityFeedFragment activityfeedfragment, StoryModel storymodel, int i1)
    {
        Object obj = storymodel.getResource();
        if (com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.valueOf(((ResourceModel) (obj)).getType()) == com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.d && activityfeedfragment.au)
        {
            if (gex.a(activityfeedfragment.aw))
            {
                Object obj1 = storymodel.getResource();
                obj = ((ResourceModel) (obj1)).getParent().getUri();
                obj1 = ((ResourceModel) (obj1)).getUri();
                obj1 = PlayerContext.create((String)a.get(activityfeedfragment.ax.mIndex), new PlayerTrack[] {
                    PlayerTrack.create(((String) (obj1)), storymodel.getAlbumUri(), storymodel.getArtistUri())
                });
                activityfeedfragment.aq.playWithViewUri(((PlayerContext) (obj1)), null, ((String) (obj)));
                activityfeedfragment.ab.a(storymodel, activityfeedfragment. new com.spotify.cosmos.android.Resolver.CallbackReceiver(new Handler()) {

                    private ActivityFeedFragment a;

                    protected final void onError(Throwable throwable)
                    {
                        a.Y.notifyDataSetChanged();
                    }

                    protected final void onResolved(Response response)
                    {
                    }

            
            {
                a = ActivityFeedFragment.this;
                super(handler);
            }
                });
                activityfeedfragment.Y.notifyDataSetChanged();
                activityfeedfragment.am.a(com.spotify.mobile.android.spotlets.activityfeed.util.ActivityFeedClientEventLogger.StoryAction.d, storymodel, i1);
                return;
            } else
            {
                activityfeedfragment.aj = (new dfj(activityfeedfragment.k(), 0x7f0b017f)).a(activityfeedfragment.a(0x7f08004c)).b(activityfeedfragment.a(0x7f080049)).a(activityfeedfragment.a(0x7f08004b), activityfeedfragment. new android.content.DialogInterface.OnClickListener(((ResourceModel) (obj))) {

                    private ResourceModel a;
                    private ActivityFeedFragment b;

                    public final void onClick(DialogInterface dialoginterface, int j1)
                    {
                        b.k().startActivity(gms.a(b.k(), a.getParent().getUri()).a);
                    }

            
            {
                b = ActivityFeedFragment.this;
                a = resourcemodel;
                super();
            }
                }).b(activityfeedfragment.a(0x7f08004a), new android.content.DialogInterface.OnClickListener() {

                    public final void onClick(DialogInterface dialoginterface, int j1)
                    {
                    }

                }).b();
                activityfeedfragment.aj.show();
                return;
            }
        } else
        {
            activityfeedfragment.ao = activityfeedfragment.ar;
            activityfeedfragment.ap = activityfeedfragment.as;
            storymodel = gms.a(activityfeedfragment.k(), ((ResourceModel) (obj)).getUri()).a;
            storymodel.putExtra("keep_current_fragment_active", true);
            activityfeedfragment.k().startActivity(storymodel);
            return;
        }
    }

    private void a(ActivityFeedModel activityfeedmodel)
    {
        Y.addAll(activityfeedmodel.getStories());
    }

    static boolean a(ActivityFeedFragment activityfeedfragment, boolean flag)
    {
        activityfeedfragment.av = flag;
        return flag;
    }

    static StoryModel b(ActivityFeedFragment activityfeedfragment)
    {
        return activityfeedfragment.ao;
    }

    static void b(ActivityFeedFragment activityfeedfragment, ActivityFeedModel activityfeedmodel)
    {
        if (activityfeedfragment.ad.b())
        {
            activityfeedfragment = activityfeedfragment.am;
            int i1 = activityfeedmodel.getStories().length;
            activityfeedmodel = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.bP);
            activityfeedmodel.a("n_shares", Integer.toString(i1));
            activityfeedfragment.a(activityfeedmodel, null, 0);
        }
    }

    static boolean b(ActivityFeedFragment activityfeedfragment, PlayerState playerstate)
    {
        return activityfeedfragment.ao != null && activityfeedfragment.ao.hasMatchingContextUri(playerstate.entityUri()) && !activityfeedfragment.ao.getStreams().getIncludeRequestingUser() && !activityfeedfragment.ab.b;
    }

    static Flags c(ActivityFeedFragment activityfeedfragment)
    {
        return activityfeedfragment.aw;
    }

    static ActivityFeedClientEventLogger d(ActivityFeedFragment activityfeedfragment)
    {
        return activityfeedfragment.am;
    }

    static Button e(ActivityFeedFragment activityfeedfragment)
    {
        return activityfeedfragment.ag;
    }

    private void e(boolean flag)
    {
        Object obj1;
label0:
        {
            long l1 = SystemClock.elapsedRealtime();
            if (flag)
            {
                aa.d();
                ao = null;
                ap = 0;
            }
            if (!at && !aa.e())
            {
                at = true;
                com.spotify.cosmos.router.Request request;
                edk edk1;
                StringBuilder stringbuilder;
                if (b.isEmpty())
                {
                    ac.a(af);
                } else
                {
                    ai.setVisibility(0);
                }
                edk1 = aa;
                obj1 = new edl(flag, l1) {

                    private boolean a;
                    private long b;
                    private ActivityFeedFragment c;

                    public final void a(ActivityFeedModel activityfeedmodel)
                    {
                        Object obj2;
                        long l2;
                        l2 = SystemClock.elapsedRealtime();
                        if (a)
                        {
                            c.J();
                        }
                        obj2 = activityfeedmodel.getStories();
                        if (obj2.length <= 0) goto _L2; else goto _L1
_L1:
                        if (c.b.getStories().length != 0) goto _L4; else goto _L3
_L3:
                        ActivityFeedClientEventLogger activityfeedclienteventlogger = ActivityFeedFragment.d(c);
                        int i1 = obj2.length;
                        int k1 = ActivityFeedFragment.g(c).d.a(edk.b, 0);
                        obj2 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.bQ);
                        ((ClientEvent) (obj2)).a("n_shares", Integer.toString(i1));
                        ((ClientEvent) (obj2)).a("n_new_shares", Integer.toString(k1));
                        activityfeedclienteventlogger.a(((ClientEvent) (obj2)), null, 0);
_L6:
                        c.b.merge(activityfeedmodel);
                        ActivityFeedFragment.a(c, ActivityFeedFragment.h(c).getLastPlayerState());
                        ActivityFeedFragment.a(c, activityfeedmodel);
                        if (ActivityFeedFragment.i(c) != null)
                        {
                            c.Z.onRestoreInstanceState(ActivityFeedFragment.i(c));
                            ActivityFeedFragment.j(c);
                        }
_L2:
                        ActivityFeedFragment.a(c, c.b.isEmpty());
                        if (!ActivityFeedFragment.k(c))
                        {
                            ActivityFeedFragment.l(c).b(null);
                        }
                        ActivityFeedFragment.l(c).d(ActivityFeedFragment.k(c));
                        ActivityFeedFragment.b(c, activityfeedmodel);
                        ActivityFeedFragment.m(c);
                        long l3 = SystemClock.elapsedRealtime();
                        ActivityFeedFragment.d(c).a(b, l2, l3);
                        return;
_L4:
                        ActivityFeedClientEventLogger activityfeedclienteventlogger1 = ActivityFeedFragment.d(c);
                        int j1 = c.b.getStories().length + obj2.length;
                        int i2 = obj2.length;
                        if (j1 != i2)
                        {
                            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.bR);
                            clientevent.a("n_shares", Integer.toString(j1));
                            clientevent.a("n_additional_shares", Integer.toString(i2));
                            activityfeedclienteventlogger1.a(clientevent, null, 0);
                        }
                        if (true) goto _L6; else goto _L5
_L5:
                    }

                    public final void a(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                    {
                        long l2 = SystemClock.elapsedRealtime();
                        if (c.b.getStories().length == 0)
                        {
                            ActivityFeedFragment.l(c).c(true);
                        }
                        ActivityFeedFragment.m(c);
                        long l3 = SystemClock.elapsedRealtime();
                        ActivityFeedFragment.d(c).a(b, l2, l3);
                    }

            
            {
                c = ActivityFeedFragment.this;
                a = flag;
                b = l1;
                super();
            }
                };
                if (edk1.e())
                {
                    break label0;
                }
                ctz.a(edk1.e);
                stringbuilder = new StringBuilder("hm://social-feed-view");
                if (edk1.c != null)
                {
                    stringbuilder.append(edk1.c);
                } else
                {
                    Object obj = edk1.e;
                    if (obj == Type.b)
                    {
                        ctz.a(((Type) (obj)).mUsername);
                        obj = String.format(((Type) (obj)).mPath, new Object[] {
                            ((Type) (obj)).mUsername
                        });
                    } else
                    {
                        obj = ((Type) (obj)).mPath;
                    }
                    stringbuilder.append(((String) (obj)));
                }
                request = RequestBuilder.get(stringbuilder.toString()).build();
                obj1 = new edk._cls2(edk1, ((edl) (obj1)));
                edk1.f().resolve(request, new edk._cls4(new Handler(), com/spotify/mobile/android/spotlets/activityfeed/model/ActivityFeedModel, ((edl) (obj1))));
            }
            return;
        }
        ((edl) (obj1)).a(new ActivityFeedModel(new StoryModel[0], null));
    }

    static StoryModel f(ActivityFeedFragment activityfeedfragment)
    {
        return activityfeedfragment.ar;
    }

    static edk g(ActivityFeedFragment activityfeedfragment)
    {
        return activityfeedfragment.aa;
    }

    static Player h(ActivityFeedFragment activityfeedfragment)
    {
        return activityfeedfragment.aq;
    }

    static Parcelable i(ActivityFeedFragment activityfeedfragment)
    {
        return activityfeedfragment.ah;
    }

    static Parcelable j(ActivityFeedFragment activityfeedfragment)
    {
        activityfeedfragment.ah = null;
        return null;
    }

    static boolean k(ActivityFeedFragment activityfeedfragment)
    {
        return activityfeedfragment.av;
    }

    static ContentViewManager l(ActivityFeedFragment activityfeedfragment)
    {
        return activityfeedfragment.ac;
    }

    static void m(ActivityFeedFragment activityfeedfragment)
    {
        activityfeedfragment.L();
    }

    public final void A()
    {
        super.A();
        al.b();
        if (aj != null && aj.isShowing())
        {
            aj.dismiss();
        }
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        if (ax == Type.a)
        {
            return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.g;
        } else
        {
            return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.a;
        }
    }

    public final void B()
    {
        super.B();
        aa.c();
        ab.a();
        an.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return (String)a.get(ax.mIndex);
    }

    protected final void J()
    {
        Y.clear();
        b = new ActivityFeedModel(new StoryModel[0], null);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aw = fyw.a(this);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f030073, viewgroup, false);
        Z = (ListView)viewgroup.findViewById(0x102000a);
        ad = (SwipeRefreshLayout)viewgroup.findViewById(0x7f110347);
        ad.a(this);
        ad.a(new int[] {
            0x7f0f0066, 0x7f0f00d9, 0x7f0f0066, 0x7f0f00d9
        });
        af = LoadingView.a(layoutinflater);
        viewgroup.addView(af);
        ae = (EmptyView)viewgroup.findViewById(0x7f110348);
        ag = dgp.b(k(), null);
        ag.setId(0x7f110022);
        ag.setText(k().getString(0x7f080052).toUpperCase(Locale.getDefault()));
        ag.setSingleLine(true);
        ag.setOnClickListener(new android.view.View.OnClickListener() {

            private ActivityFeedFragment a;

            public final void onClick(View view)
            {
                a.k().startActivity(FindFriendsActivity.a(a.k(), ActivityFeedFragment.c(a)));
                a.k().overridePendingTransition(0x7f040017, 0x7f040016);
                ActivityFeedFragment.d(a).a(new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.bO), null, 0);
            }

            
            {
                a = ActivityFeedFragment.this;
                super();
            }
        });
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        K();
        if (ax == Type.b)
        {
            return context.getString(0x7f080448);
        } else
        {
            return context.getString(0x7f08004d);
        }
    }

    public final void a()
    {
        if (av)
        {
            return;
        }
        if (!at)
        {
            aa.d();
            e(true);
            return;
        } else
        {
            ad.a();
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        am = new ActivityFeedClientEventLogger(k(), bundle);
        al = ggn.a(k(), ViewUri.q);
        ab = new edo(k());
        an = Cosmos.getResolver(k());
        Type type;
        boolean flag;
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ah = bundle.getParcelable("com.spotify.activity_feed.state.list");
            b = (ActivityFeedModel)bundle.getParcelable("com.spotify.activity_feed.state.model");
            aa = new edk(k(), bundle.getString("com.spotify.activity_feed.state.next_page_path"));
        } else
        {
            b = new ActivityFeedModel(new StoryModel[0], null);
            aa = new edk(k());
        }
        K();
        bundle = aa;
        type = ax;
        ctz.a(type);
        bundle.e = type;
        bundle = am;
        type = ax;
        ctz.a(type);
        if (((ActivityFeedClientEventLogger) (bundle)).a == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Type has been set already, this smells of code");
        bundle.a = type;
        ak = new gcj(k(), this);
        if (ax == Type.a)
        {
            a(true);
        }
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        if (au)
        {
            fzr.a(k(), menu, aw);
        }
    }

    public final void a(View view, Bundle bundle)
    {
        ai = LayoutInflater.from(k()).inflate(0x7f030071, null);
        Z.addFooterView(ai, null, false);
        Y = new ActivityFeedStoryAdapter(k(), aw);
        Y.a(au);
        Z.setAdapter(Y);
        Z.setOnScrollListener(this);
        Z.setOnItemClickListener(aA);
        a(b);
        Z.setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() {

            private ActivityFeedFragment a;

            public final boolean onItemLongClick(AdapterView adapterview, View view1, int j1, long l1)
            {
                adapterview = (fxh)view1.findViewById(0x7f110012).getTag(0x7f110041);
                if (adapterview != null)
                {
                    adapterview.a(a.k());
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = ActivityFeedFragment.this;
                super();
            }
        });
        if (ax == Type.b)
        {
            view = g().getString("com.spotify.activity_feed.type.profile_username");
            int i1;
            if (TextUtils.equals(g().getString("com.spotify.activity_feed.type.current_username"), view))
            {
                i1 = 0x7f080447;
            } else
            {
                i1 = 0x7f08044d;
            }
            ac = (new gaa(k(), ae, Z)).b(SpotifyIcon.P, 0x7f080053, i1).b(0x7f08044a, 0x7f080449).a(0x7f0802ad, 0x7f08044b).a();
        } else
        {
            view = (new gaa(k(), ae, Z)).b(SpotifyIcon.aC, 0x7f080053, 0x7f080051).b(0x7f080050, 0x7f08004f).a(0x7f0802ad, 0x7f08004e);
            view.a = new gab() {

                private ActivityFeedFragment a;

                public final void a(EmptyView emptyview, com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate)
                {
                    if (contentstate == com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.d)
                    {
                        emptyview.a(ActivityFeedFragment.e(a));
                        return;
                    } else
                    {
                        emptyview.a(null);
                        return;
                    }
                }

            
            {
                a = ActivityFeedFragment.this;
                super();
            }
            };
            ac = view.a();
        }
        ac.b = true;
        if (!b.isEmpty())
        {
            ac.b(null);
        }
    }

    public final void c()
    {
        super.c();
        aa.a();
        edo edo1 = ab;
        if (edo1.a != null)
        {
            edo1.b().connect();
        }
        an.connect();
        aq = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(an, ViewUri.q.toString(), FeatureIdentifier.ai, gnl.a(this));
        aq.registerPlayerStateObserver(az);
        u().a(0x7f110058, null, ak);
        u().a(0x7f11005b, null, ay);
    }

    public final void d()
    {
        super.d();
        aq.unregisterPlayerStateObserver(az);
        aa.b();
        edo edo1 = ab;
        if (edo1.a != null)
        {
            edo1.b().disconnect();
        }
        an.disconnect();
        u().a(0x7f110058);
        u().a(0x7f11005b);
        L();
    }

    public final void d(boolean flag)
    {
        au = flag;
        ContentViewManager contentviewmanager = ac;
        if (!au && b.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        contentviewmanager.a(flag);
        Y.a(au);
        if (o())
        {
            k().q_();
        }
        if (au && b.isEmpty())
        {
            e(true);
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("com.spotify.activity_feed.state.model", b);
        bundle.putParcelable("com.spotify.activity_feed.state.list", Z.onSaveInstanceState());
        bundle.putString("com.spotify.activity_feed.state.next_page_path", aa.c);
        ActivityFeedClientEventLogger activityfeedclienteventlogger = am;
        String as1[] = new String[activityfeedclienteventlogger.b.size()];
        activityfeedclienteventlogger.b.toArray(as1);
        bundle.putStringArray("activity_feed_logger_logged_story_impressions", as1);
    }

    public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        boolean flag = false;
        if (Y.getCount() > 0)
        {
            int l1;
            if (i1 + j1 >= k1 - 50)
            {
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            k1 = ((flag) ? 1 : 0);
            if (l1 != 0)
            {
                e(false);
                k1 = ((flag) ? 1 : 0);
            }
            for (; k1 < j1; k1++)
            {
                l1 = (i1 - 1) + k1;
                abslistview = am;
                StoryModel storymodel = Y.a(l1);
                l1 = (int)Y.getItemId(l1);
                if (storymodel != null && ((ActivityFeedClientEventLogger) (abslistview)).b.add(storymodel.getId()))
                {
                    abslistview.a(new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.bS), storymodel, l1);
                }
            }

        }
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i1)
    {
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.ai;
    }

    public final void z()
    {
        super.z();
        al.a();
        if (ap < b.getStories().length)
        {
            StoryModel storymodel = b.getStories()[ap];
            if (storymodel != null && ao != null && ao.getId().equals(storymodel.getId()))
            {
                b.replaceStory(ao, ap);
            }
        }
    }


    private class Type extends Enum
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return Type.a(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new Type[i1];
            }

        };
        public static final Type a;
        public static final Type b;
        private static final Type c[];
        public int mIndex;
        public String mPath;
        public String mUsername;

        static Type a(Parcel parcel)
        {
            String s;
            Type atype[];
            int i1;
            int j1;
            int k1;
            j1 = parcel.readInt();
            parcel.readString();
            s = parcel.readString();
            atype = values();
            k1 = atype.length;
            i1 = 0;
_L3:
            if (i1 >= k1)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel = atype[i1];
            if (((Type) (parcel)).mIndex != j1) goto _L2; else goto _L1
_L1:
            if (parcel == b)
            {
                parcel.a(s);
            }
            return parcel;
_L2:
            i1++;
              goto _L3
            Assertion.a((new StringBuilder("Incorrect index ")).append(j1).append(" for ").append(com/spotify/mobile/android/spotlets/activityfeed/ActivityFeedFragment$Type.getSimpleName()).toString());
            parcel = null;
              goto _L1
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/activityfeed/ActivityFeedFragment$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])c.clone();
        }

        public final void a(String s)
        {
            boolean flag;
            if (this == b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.a(flag, "only recent shares should be setting username!");
            mUsername = s;
        }

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeInt(mIndex);
            parcel.writeString(mPath);
            if (mUsername != null)
            {
                parcel.writeString(mUsername);
            }
        }

        static 
        {
            a = new Type("ACTIVITY", 0, 0, "/v2/android/feed");
            b = new Type("RECENT_SHARES", 1, 1, "/v2/android/timeline?user=%s");
            c = (new Type[] {
                a, b
            });
        }

        private Type(String s, int i1, int j1, String s1)
        {
            super(s, i1);
            mIndex = j1;
            mPath = s1;
        }
    }

}
