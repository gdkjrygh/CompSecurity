// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager;
import com.spotify.mobile.android.spotlets.findfriends.model.FindFriendsModel;
import com.spotify.mobile.android.spotlets.findfriends.model.ResultModel;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Iterator;
import java.util.List;

public class esh extends al
    implements fxy, gck
{

    private gfl Y;
    private Flags Z;
    private FindFriendsViewManager aa;
    private gcj ab;
    private FindFriendsModel ac;
    private FindFriendsModel ad;
    private Parcelable ae;
    private boolean af;
    private long ag;
    private boolean ah;
    private boolean ai;
    private esg aj;
    private final JsonCallbackReceiver ak = new JsonCallbackReceiver(new Handler(), com/spotify/mobile/android/spotlets/findfriends/model/FindFriendsModel) {

        private esh a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            esh.b(a).a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.a, com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.State.c);
            throwable = esh.K();
            errorcause = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.V, com.spotify.mobile.android.util.ClientEvent.SubEvent.co);
            fop fop1 = ((esl) (throwable)).a;
            fop.a(((esl) (throwable)).b, ViewUri.p, errorcause);
        }

        protected final void onResolved(Response response, Object obj)
        {
            response = (FindFriendsModel)obj;
            esh.a(a, response);
            esh.b(a).a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.a, response);
            esh.b(a).a(response, a.J());
            response = esh.K();
            long l = esh.f(a);
            long l1 = SystemClock.elapsedRealtime();
            obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.P, com.spotify.mobile.android.util.ClientEvent.SubEvent.cn);
            ((ClientEvent) (obj)).a("time", String.valueOf(l - l1));
            ((ClientEvent) (obj)).a("size", String.valueOf(((esl) (response)).c));
            fop fop1 = ((esl) (response)).a;
            fop.a(((esl) (response)).b, ViewUri.p, ((ClientEvent) (obj)));
        }

            
            {
                a = esh.this;
                super(handler, class1);
            }
    };
    private final JsonCallbackReceiver al = new JsonCallbackReceiver(new Handler(), com/spotify/mobile/android/spotlets/findfriends/model/FindFriendsModel) {

        private esh a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            esh.b(a).a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.b, com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.State.c);
        }

        protected final void onResolved(Response response, Object obj)
        {
            response = (FindFriendsModel)obj;
            esh.b(a, response);
            esh.b(a).a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.b, response);
        }

            
            {
                a = esh.this;
                super(handler, class1);
            }
    };
    private gfm am;
    private esf b;

    public esh()
    {
    }

    static esl K()
    {
        return M();
    }

    private void L()
    {
        Object obj = ac.getResults().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ResultModel resultmodel = (ResultModel)((Iterator) (obj)).next();
            if (!resultmodel.isFollowing())
            {
                resultmodel.toggleFollowing();
                ((FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager)).a(resultmodel.getUri(), true);
            }
        } while (true);
        obj = (esl)dmz.a(esh, esl);
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.cj);
        clientevent.a("n_friends", String.valueOf(((esl) (obj)).c));
        clientevent.a("n_friends_not_followed", String.valueOf(((esl) (obj)).d));
        fop fop1 = ((esl) (obj)).a;
        fop.a(((esl) (obj)).b, ViewUri.p, clientevent);
    }

    private static esl M()
    {
        return (esl)dmz.a(esh, esl);
    }

    static FindFriendsModel a(esh esh1, FindFriendsModel findfriendsmodel)
    {
        esh1.ac = findfriendsmodel;
        return findfriendsmodel;
    }

    static esg a(esh esh1, esg esg)
    {
        esh1.aj = esg;
        return esg;
    }

    public static esh a(Flags flags)
    {
        ctz.a(flags);
        esh esh1 = new esh();
        fyw.a(esh1, flags);
        return esh1;
    }

    static boolean a(esh esh1)
    {
        return esh1.ai;
    }

    static boolean a(esh esh1, boolean flag)
    {
        esh1.ai = flag;
        return flag;
    }

    static FindFriendsViewManager b(esh esh1)
    {
        return esh1.aa;
    }

    static FindFriendsModel b(esh esh1, FindFriendsModel findfriendsmodel)
    {
        esh1.ad = findfriendsmodel;
        return findfriendsmodel;
    }

    static FindFriendsModel c(esh esh1)
    {
        return esh1.ac;
    }

    static esg d(esh esh1)
    {
        return esh1.aj;
    }

    static void e(esh esh1)
    {
        esh1.L();
    }

    static long f(esh esh1)
    {
        return esh1.ag;
    }

    public final void B()
    {
        super.B();
        Object obj = b;
        if (((esf) (obj)).a != null)
        {
            ((esf) (obj)).a.destroy();
        }
        obj = M();
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.cq);
        clientevent.a("number_friends_followed", String.valueOf(((esl) (obj)).g));
        clientevent.a("number_friends_unfollowed", String.valueOf(((esl) (obj)).h));
        clientevent.a("friends_size", String.valueOf(((esl) (obj)).c));
        clientevent.a("number_featured_followed", String.valueOf(((esl) (obj)).i));
        clientevent.a("number_featured_unfollowed", String.valueOf(((esl) (obj)).j));
        clientevent.a("featured_size", String.valueOf(((esl) (obj)).e));
        fop fop1 = ((esl) (obj)).a;
        fop.a(((esl) (obj)).b, ViewUri.p, clientevent);
    }

    public final Fragment F()
    {
        return this;
    }

    final void H()
    {
        if (ah)
        {
            if (ad != null)
            {
                com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType tabtype;
                FindFriendsViewManager findfriendsviewmanager;
                if (ac == null)
                {
                    aa.a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.a, com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.State.f);
                } else
                {
                    aa.a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.a, ac);
                }
                aa.a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.b, ad);
                aa.a(ac, J());
                findfriendsviewmanager = aa;
                if (af)
                {
                    tabtype = com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.a;
                } else
                {
                    tabtype = com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.b;
                }
                if (findfriendsviewmanager.b != tabtype)
                {
                    findfriendsviewmanager.c.check(tabtype.mResId);
                }
                if (ae != null)
                {
                    return;
                }
            } else
            {
                ag = SystemClock.elapsedRealtime();
                if (ai)
                {
                    aa.a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.a, com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.State.a);
                    esf esf1 = b;
                    JsonCallbackReceiver jsoncallbackreceiver = ak;
                    esf1.c().resolve(esf.a(), jsoncallbackreceiver);
                }
                aa.a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.b, com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.State.a);
                esf esf2 = b;
                JsonCallbackReceiver jsoncallbackreceiver1 = al;
                esf2.c().resolve(esf.b(), jsoncallbackreceiver1);
                return;
            }
        }
    }

    public final String I()
    {
        return "spotify:findfriends";
    }

    protected final android.view.View.OnClickListener J()
    {
        return new android.view.View.OnClickListener() {

            private esh a;

            public final void onClick(View view)
            {
                int i = esh.c(a).getResults().size();
                if (i > 25)
                {
                    esh.a(a, esg.c(i));
                    esh.d(a).a(a, 0);
                    view = esh.d(a);
                    aa aa1 = a.m();
                    esh.d(a);
                    view.a(aa1, "spotify:findfriends:confirm");
                    return;
                } else
                {
                    esh.e(a);
                    return;
                }
            }

            
            {
                a = esh.this;
                super();
            }
        };
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030070, viewgroup, false);
        aa = new FindFriendsViewManager(layoutinflater, Z);
        viewgroup = M();
        bundle = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.ce);
        bundle.a("referrer", ViewUri.p.toString());
        fop fop1 = ((esl) (viewgroup)).a;
        fop.a(((esl) (viewgroup)).b, ViewUri.p, bundle);
        return layoutinflater;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getResources().getString(0x7f0802dc);
    }

    public final void a(int i, int j, Intent intent)
    {
        if (j == 1)
        {
            L();
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Y = new gfl(k());
        ab = new gcj(k(), this);
        Z = fyw.a(this);
        b = new esf(k());
        am = new gfm() {

            private esh a;

            public final void a(gfl gfl1)
            {
                if (a.o())
                {
                    esh.a(a, gfl1.c);
                    if (!esh.a(a))
                    {
                        esh.b(a).a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.a, com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.State.f);
                    }
                    a.H();
                }
            }

            
            {
                a = esh.this;
                super();
            }
        };
    }

    public final void c()
    {
        super.c();
        esf esf1 = b;
        if (esf1.a != null)
        {
            esf1.a.connect();
        }
        u().a(0x7f11007c, null, ab);
        Y.a();
        Y.a(am);
    }

    public final void d()
    {
        super.d();
        esf esf1 = b;
        if (esf1.a != null)
        {
            esf1.a.disconnect();
        }
        u().a(0x7f11007c);
        Y.b(am);
        Y.e.b();
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        z_().setDescendantFocusability(0x40000);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ac = (FindFriendsModel)bundle.getParcelable("friends_model");
            ad = (FindFriendsModel)bundle.getParcelable("featured_model");
            ae = bundle.getParcelable("list_position");
            af = bundle.getBoolean("tab_isfriends_state");
        }
    }

    public final void d(boolean flag)
    {
        ah = flag;
        if (!flag)
        {
            ae = z_().onSaveInstanceState();
            af = aa.a();
            aa.a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.a, com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.State.d);
            aa.a(com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.TabType.b, com.spotify.mobile.android.spotlets.findfriends.FindFriendsViewManager.State.d);
        }
        H();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("friends_model", ac);
        bundle.putParcelable("featured_model", ad);
        bundle.putParcelable("list_position", z_().onSaveInstanceState());
        bundle.putString("filter_text", aa.a.a.getText().toString());
        bundle.putBoolean("tab_isfriends_state", aa.a());
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.al;
    }
}
