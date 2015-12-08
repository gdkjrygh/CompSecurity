// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.prettylist.HidingHeaderListView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import com.spotify.mobile.android.spotlets.eventshub.model.EventSection;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class ers extends Fragment
    implements android.widget.AbsListView.OnScrollListener, NavigationItem, eru, fxy
{

    public static final String a;
    private Resolver Y;
    private Map Z;
    private ContentViewManager aa;
    private ftg ab;
    private LoadingView ac;
    private dja ad;
    private gcj ae;
    private Flags af;
    private EmptyView ag;
    private final android.view.View.OnClickListener ah = new android.view.View.OnClickListener() {

        private ers a;

        public final void onClick(View view)
        {
            a.b.a.O();
        }

            
            {
                a = ers.this;
                super();
            }
    };
    private Button ai;
    ert b;

    public ers()
    {
    }

    private Button P()
    {
        ai = dgp.e(k());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        int i = dft.a(8F, k().getResources());
        layoutparams.bottomMargin = i;
        layoutparams.topMargin = i;
        ai.setLayoutParams(layoutparams);
        ai.setText(k().getString(0x7f0802b7));
        ai.setOnClickListener(ah);
        return ai;
    }

    static dja a(ers ers1)
    {
        return ers1.ad;
    }

    public static ers a(Flags flags)
    {
        ers ers1 = new ers();
        fyw.a(ers1, flags);
        return ers1;
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.t;
    }

    public final void B()
    {
        super.B();
        Y.destroy();
        u().a(0x7f11007b);
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return a;
    }

    public final void J()
    {
        if (!o())
        {
            return;
        } else
        {
            aa.b(null);
            return;
        }
    }

    public final void K()
    {
        if (!o())
        {
            return;
        } else
        {
            ag.e().setVisibility(0);
            aa.d(true);
            return;
        }
    }

    public final void L()
    {
        if (!o())
        {
            return;
        } else
        {
            ag.e().setVisibility(0);
            aa.b(true);
            return;
        }
    }

    public final void M()
    {
        if (!o())
        {
            return;
        } else
        {
            ag.e().setVisibility(8);
            aa.c(true);
            return;
        }
    }

    public final void N()
    {
        if (!o())
        {
            return;
        } else
        {
            ag.e().setVisibility(8);
            aa.a(true);
            return;
        }
    }

    public final void O()
    {
        Intent intent = gms.a(k(), esa.b).a;
        k().startActivity(intent);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = new FrameLayout(k());
        viewgroup.setBackgroundColor(dgo.b(k(), 0x1010054));
        ac = LoadingView.a(layoutinflater);
        viewgroup.addView(ac);
        if (ggi.b(k()))
        {
            ad = dja.b(k()).a().a(P(), 1).a(true).a(this);
        } else
        {
            ad = dja.a(k()).a().a(P(), 1).a(true).a(this);
            ((HidingHeaderListView)ad.e().a()).a();
        }
        ((djq)ad.a()).a(a(((Context) (k())), af));
        layoutinflater = ad.e().b();
        if (layoutinflater instanceof dip)
        {
            ((dip)layoutinflater).b();
        }
        viewgroup.addView(ad.b());
        ag = new EmptyView(k());
        ag.setId(0x7f110348);
        ag.setVisibility(8);
        ag.a(P());
        viewgroup.addView(ag);
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        if (context != null)
        {
            return context.getString(0x7f0802c5);
        } else
        {
            return "";
        }
    }

    public final void a()
    {
        if (!o())
        {
            return;
        } else
        {
            aa.a(ac);
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Y = Cosmos.getResolver(k());
        bundle = new erv(Y, new Handler(k().getMainLooper()));
        erz erz1 = new erz(k());
        af = fyw.a(this);
        b = new ert(this, bundle, new ese(k()), erz1);
        ae = new gcj(k(), b);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        Z = new EnumMap(com/spotify/mobile/android/spotlets/eventshub/model/EventSection);
        ab = new ftg(k());
        bundle = EventSection.values();
        int j = bundle.length;
        int i = 0;
        while (i < j) 
        {
            view = bundle[i];
            err err1 = new err(k(), new ArrayList());
            Z.put(view, err1);
            ftg ftg1 = ab;
            int k = ((EventSection) (view)).mTitleStringId;
            int l = ((EventSection) (view)).mSectionId;
            u u1 = k();
            ctz.a(u1);
            boolean flag;
            if (view != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertion.c(flag, "EventSection was null in EventsHub when trying to create a footer");
            if (view != EventSection.b)
            {
                view = null;
            } else
            {
                view = dgp.a(u1, null);
                dgo.b(u1, view, 0x7f0101d8);
                view.setGravity(17);
                view.setEllipsize(android.text.TextUtils.TruncateAt.END);
                view.setText(u1.getString(0x7f0802bd));
                int i1 = u1.getResources().getDimensionPixelOffset(0x7f0c00dc);
                view.setPadding(i1, i1, i1, i1);
            }
            ftg1.a(err1, k, l, view);
            i++;
        }
        ab.a();
        view = ad.e().a();
        view.setAdapter(ab);
        aa = (new gaa(k(), ag, ad.b())).a(SpotifyIcon.aq, 0x7f0802b6, 0x7f0802b5).b(SpotifyIcon.aq, 0x7f0802b9, 0x7f0802b8).b(0x7f0802bc, 0x7f0802bb).a(0x7f0802ad, 0x7f0802ba).a();
        view.setOnScrollListener(this);
        view.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            private ers a;

            public final void onItemClick(AdapterView adapterview, View view1, int j1, long l1)
            {
                adapterview = ((AdapterView) (ers.a(a).e().a().getAdapter().getItem(j1)));
                if (adapterview instanceof ConcertResult)
                {
                    adapterview = (ConcertResult)adapterview;
                    Object obj = a.b;
                    view1 = a.k();
                    obj = ((ert) (obj)).b;
                    Assertion.a(adapterview);
                    ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dF);
                    ese.a(clientevent, adapterview.getConcert());
                    ese.a(clientevent, adapterview.getSourceType(), j1);
                    ((ese) (obj)).a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.Y, clientevent);
                    view1.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(adapterview.getClickThruUrl())));
                }
            }

            
            {
                a = ers.this;
                super();
            }
        });
    }

    public final void a(String s)
    {
        if (!o())
        {
            return;
        } else
        {
            Picasso picasso = ((gft)dmz.a(gft)).a();
            ImageView imageview = ad.d();
            imageview.clearColorFilter();
            picasso.a(s).a(imageview, null);
            return;
        }
    }

    public final void a(List list, EventSection eventsection)
    {
        if (!o())
        {
            return;
        } else
        {
            Assertion.a(list);
            Assertion.a(eventsection);
            err err1 = (err)Z.get(eventsection);
            Assertion.a(err1);
            err1.clear();
            err1.addAll(list);
            ab.d(eventsection.mSectionId);
            return;
        }
    }

    public final void b(String s)
    {
        if (!o())
        {
            return;
        }
        StringBuilder stringbuilder = (new StringBuilder()).append(a(k(), af));
        if (!TextUtils.isEmpty(s))
        {
            stringbuilder.append('\n').append(s);
        }
        ((djq)ad.a()).a(stringbuilder);
    }

    public final void c()
    {
        super.c();
        u().a(0x7f11007b, null, ae);
        Y.connect();
    }

    public final void d()
    {
        super.d();
        Y.disconnect();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        for (i = 0; i < j; i++)
        {
            if (ab.isEmpty())
            {
                continue;
            }
            abslistview = ((AbsListView) (ad.e().a().getAdapter().getItem(i)));
            if (!(abslistview instanceof ConcertResult))
            {
                continue;
            }
            Object obj = b;
            abslistview = (ConcertResult)abslistview;
            obj = ((ert) (obj)).b;
            Assertion.a(abslistview);
            if (((ese) (obj)).a.add(abslistview))
            {
                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.dF);
                ese.a(clientevent, abslistview.getConcert());
                ese.a(clientevent, abslistview.getSourceType(), i);
                ((ese) (obj)).a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.Y, clientevent);
            }
        }

    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.t;
    }

    static 
    {
        a = ViewUri.Q.toString();
    }
}
