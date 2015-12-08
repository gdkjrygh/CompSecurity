// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fzq extends al
{

    private static final String Y = (new StringBuilder(".*(")).append(TextUtils.join("|", b)).append(").*").toString();
    private static final String b[] = {
        "mail", "gm$", "k9$", "outlook"
    };
    private Intent Z;
    private String aa;
    private boolean ab;
    private String ac;
    private String ad;
    private String ae;
    private ftl af;
    private List ag;
    private ggl ah;
    private fib ai;
    private an aj;

    public fzq()
    {
        ag = new ArrayList();
        aj = new an() {

            private fzq a;

            public final da a(Bundle bundle)
            {
                return new cu(a.k(), dtw.a, new String[] {
                    "connected"
                }, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst())
                {
                    boolean flag;
                    if (((Cursor) (obj)).getLong(0) != 0L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!fzq.a(a).isEmpty())
                    {
                        ((ddi)((Pair)fzq.a(a).get(0)).first).b(flag);
                    }
                    for (obj = fzq.a(a).iterator(); ((Iterator) (obj)).hasNext(); ((ddi)((Pair)((Iterator) (obj)).next()).first).a().setEnabled(flag)) { }
                }
            }

            
            {
                a = fzq.this;
                super();
            }
        };
    }

    public static fzq a(Intent intent, String s, boolean flag, String s1, String s2, String s3, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("intent", intent);
        bundle.putString("title", s);
        bundle.putBoolean("include_share_to_spotify", flag);
        bundle.putString("twitter_share_text", s1);
        bundle.putString("friend_to_friend_email_specific_share_subject", s2);
        bundle.putString("friend_to_friend_email_specific_share_text", s3);
        intent = new fzq();
        intent.f(bundle);
        fyw.a(intent, flags);
        return intent;
    }

    static List a(fzq fzq1)
    {
        return fzq1.ag;
    }

    public final void A()
    {
        super.A();
        ah.b();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ce, viewgroup, false);
        af = new ftl(k(), Z);
        a(((android.widget.ListAdapter) (af)));
        viewgroup = (ListView)layoutinflater.findViewById(0x102000a);
        if (ab)
        {
            bundle = dds.a(k(), viewgroup);
            bundle.a().setId(0x7f110116);
            bundle.a(b(0x7f0804e3));
            dfz dfz1 = new dfz(k(), SpotifyIcon.aV);
            dfz1.a(gcg.b(k(), 0x7f0f007e));
            bundle.d().setImageDrawable(dfz1);
            ag.add(new Pair(bundle, com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity.ShareType.b));
            bundle = dds.a(k(), viewgroup);
            bundle.a().setId(0x7f110117);
            bundle.a(b(0x7f08046e));
            dfz1 = new dfz(k(), SpotifyIcon.aU);
            dfz1.a(gcg.b(k(), 0x7f0f007e));
            bundle.d().setImageDrawable(dfz1);
            ag.add(new Pair(bundle, com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity.ShareType.a));
            for (bundle = ag.iterator(); bundle.hasNext(); viewgroup.addHeaderView(((ddi)((Pair)bundle.next()).first).a())) { }
        }
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Z = (Intent)g().getParcelable("intent");
        aa = g().getString("title");
        ab = g().getBoolean("include_share_to_spotify", true);
        ac = g().getString("twitter_share_text");
        ae = g().getString("friend_to_friend_email_specific_share_subject");
        ad = g().getString("friend_to_friend_email_specific_share_text");
        a(false);
        ah = ggn.a(k(), ViewUri.ba);
        ai = new fib(k());
        bundle = ai;
        String s = Z.getStringExtra("android.intent.extra.TEXT");
        bundle.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R), s, true);
        u().a(0x7f1100a5, null, aj);
    }

    public final void a(ListView listview, View view, int i, long l)
    {
        if (i < ag.size())
        {
            if (!((ddi)((Pair)ag.get(i)).first).a().isEnabled())
            {
                return;
            }
            listview = (com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity.ShareType)((Pair)ag.get(i)).second;
            a(ShareToSpotifyActivity.a(k().getApplicationContext(), listview, aa, Z));
            k().finish();
            if (com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity.ShareType.b.equals(listview))
            {
                ai.a("post_to", Z.getStringExtra("android.intent.extra.TEXT"), true);
                return;
            } else
            {
                ai.a("send_to", Z.getStringExtra("android.intent.extra.TEXT"), true);
                return;
            }
        }
        view = (ResolveInfo)af.getItem(i - ag.size());
        listview = new Intent(Z);
        view = ((ResolveInfo) (view)).activityInfo.packageName;
        listview.setPackage(view);
        String s = ae;
        String s1 = ad;
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && view != null && view.matches(Y))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            Logger.a("Overriding default share text (%s) with friend2friend specific (%s) and default subject text (%s) with friend2friend specific (%s)", new Object[] {
                listview.getStringExtra("android.intent.extra.TEXT"), ad, listview.getStringExtra("android.intent.extra.SUBJECT"), ae
            });
            listview.putExtra("android.intent.extra.SUBJECT", ae).putExtra("android.intent.extra.TEXT", ad);
        }
        if (!TextUtils.isEmpty(ac))
        {
            new ggg(k());
            if ("com.twitter.android".equals(view))
            {
                Logger.a("Overriding default share text (%s) with Twitter specific (%s)", new Object[] {
                    listview.getStringExtra("android.intent.extra.TEXT"), ac
                });
                listview.putExtra("android.intent.extra.TEXT", ac);
            }
        }
        a(((Intent) (listview)));
        k().finish();
        ai.a(view, Z.getStringExtra("android.intent.extra.TEXT"), true);
    }

    public final void z()
    {
        super.z();
        ah.a();
    }

}
