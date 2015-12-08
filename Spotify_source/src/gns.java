// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import com.devsmart.android.ui.HorizontalListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.CardView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import com.spotify.music.spotlets.discover.model.DiscoverGroupModel;
import com.spotify.music.spotlets.discover.model.DiscoverReasonModel;
import com.spotify.music.spotlets.discover.model.GroupsHolder;
import java.util.Locale;

public final class gns extends AbstractContentFragment
    implements NavigationItem
{

    private Flags Y;
    private gnt Z;
    private ftg a;
    private Bundle aa;
    private String b;

    public gns()
    {
    }

    public static gns a(String s, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        s = new gns();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    private static boolean a(GroupsHolder groupsholder)
    {
        return groupsholder == null || groupsholder.a == null || groupsholder.a.length == 0;
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.e;
    }

    public final void B()
    {
        super.B();
        Z.b.destroy();
    }

    public final String I()
    {
        return "discover";
    }

    public final String a(Context context, Flags flags)
    {
        if (!TextUtils.isEmpty(b))
        {
            return b;
        } else
        {
            return context.getString(0x7f080288);
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        b = g().getString("title");
        Y = fyw.a(this);
        Z = new gnt(k());
    }

    protected final void a(Parcelable parcelable, View view)
    {
        parcelable = (GroupsHolder)parcelable;
        int k = ((GroupsHolder) (parcelable)).a.length;
        for (int i = 0; i < k; i++)
        {
            view = ((GroupsHolder) (parcelable)).a[i].discoverReasonModel.title;
            com.spotify.music.spotlets.discover.model.DiscoverStoryModel adiscoverstorymodel[] = ((GroupsHolder) (parcelable)).a[i].stories;
            gnr gnr1 = new gnr(k(), adiscoverstorymodel, i, view);
            int i1 = ((gcz)dmz.a(gcz)).b();
            int j1 = dft.b(64F, l());
            i1 = CardView.a(i1, 3, l().getDimensionPixelSize(0x7f0c00cf), j1, l().getDimensionPixelOffset(0x7f0c00d0));
            HorizontalListView horizontallistview = new HorizontalListView(k(), null);
            horizontallistview.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i1));
            horizontallistview.a(gnr1);
            a.a(new fta(horizontallistview), view, i);
        }

        ((ListView)super.ad).setAdapter(a);
        if (aa != null && aa.containsKey("horizontal_positions"))
        {
            aa.setClassLoader(k().getClassLoader());
            parcelable = (int[])ctz.a(aa.getIntArray("horizontal_positions"));
            for (int j = 0; j < parcelable.length; j++)
            {
                int l = a.e(j);
                ((HorizontalListView)a.getView(l + 1, null, null)).a(parcelable[j]);
                ((ListView)super.ad).onRestoreInstanceState((Parcelable)ctz.a(aa.getParcelable("global_list_view_state")));
            }

            aa = null;
        }
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        String s;
        Button button;
        if (((Boolean)Y.a(fys.N)).booleanValue())
        {
            view = b(0x7f080284);
        } else
        {
            view = b(0x7f080283);
        }
        if (((Boolean)Y.a(fys.N)).booleanValue())
        {
            s = "spotify:hub:music";
        } else
        {
            s = "spotify:app:browse";
        }
        button = dgp.b(k(), null);
        button.setText(view);
        super.ac.a(button);
        button.setOnClickListener(new android.view.View.OnClickListener(s) {

            private String a;
            private gns b;

            public final void onClick(View view1)
            {
                b.k().startActivity(gms.a(b.k(), a).a);
            }

            
            {
                b = gns.this;
                a = s;
                super();
            }
        });
        a = new ftg(k());
        a.e = new ftr(k()) {

            public final void a(int i, SectionHeaderView sectionheaderview, String s1, String s2)
            {
                super.a(i, sectionheaderview, s1, s2);
                sectionheaderview.b(false);
            }

        };
        aa = bundle;
    }

    protected final void a(EmptyView emptyview, com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate)
    {
        if (contentstate == com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.d)
        {
            emptyview.e().setVisibility(0);
            return;
        } else
        {
            emptyview.e().setVisibility(4);
            return;
        }
    }

    protected final void a(gaa gaa1)
    {
        gaa1.a(0x7f0802ad, 0x7f080281).b(SpotifyIcon.al, 0x7f080285, 0x7f080282).b(0x7f080287, 0x7f080286);
    }

    protected final void a(gnn gnn)
    {
        gnt gnt1 = Z;
        gnn = new gnu(gnn) {

            private gnn a;

            public final void a()
            {
                a.a();
            }

            public final void a(Object obj)
            {
                obj = (DiscoverGroupModel[])obj;
                a.a(new GroupsHolder(((DiscoverGroupModel []) (obj))));
            }

            
            {
                a = gnn1;
                super();
            }
        };
        gnn = new gnt._cls1(gnt1, gnt1.a, [Lcom/spotify/music/spotlets/discover/model/DiscoverGroupModel;, gnn);
        gnt1.e = String.format(Locale.US, "hm://bartender2/v1/stories?language=%s", new Object[] {
            ghq.a(Locale.getDefault())
        });
        gnt1.d = new ggh();
        gnt1.b.resolve(RequestBuilder.get(gnt1.e).build(), gnn);
    }

    protected final boolean b(Parcelable parcelable)
    {
        return a((GroupsHolder)parcelable);
    }

    public final void c()
    {
        super.c();
        Z.b.connect();
    }

    protected final View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return (ListView)layoutinflater.inflate(0x7f030080, viewgroup, false);
    }

    public final void d()
    {
        super.d();
        Z.b.disconnect();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (!a((GroupsHolder)super.ae))
        {
            int ai[] = new int[((GroupsHolder)super.ae).a.length];
            for (int i = 0; i < ai.length; i++)
            {
                int j = a.e(i);
                ai[i] = ((HorizontalListView)a.getView(j + 1, null, null)).b;
            }

            bundle.putIntArray("horizontal_positions", ai);
        }
        bundle.putParcelable("global_list_view_state", ((ListView)super.ad).onSaveInstanceState());
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.V;
    }

    public final Verified v_()
    {
        return ViewUri.n;
    }
}
