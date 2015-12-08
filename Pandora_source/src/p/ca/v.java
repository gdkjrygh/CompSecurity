// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.pandora.android.activity.BaseAdFragmentActivity;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.ads.c;
import com.pandora.android.ads.g;
import com.pandora.android.provider.b;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.radio.data.j;
import java.util.ArrayList;
import java.util.List;
import p.l.d;

// Referenced classes of package p.ca:
//            m, y

public class v extends m
{
    private class a extends ArrayAdapter
    {

        final v a;

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            view = super.getView(i, view, viewgroup);
            Object obj = (TextView)view.findViewById(0x7f10011b);
            viewgroup = (com.pandora.radio.data.j.a)getItem(i);
            ((TextView) (obj)).setText(viewgroup.toString());
            ((ImageView)view.findViewById(0x7f100289)).setVisibility(8);
            obj = (ImageView)view.findViewById(0x7f1000b5);
            p.l.g.b(getContext()).a(viewgroup.d()).a(0x7f0200e9).a(((ImageView) (obj)));
            return view;
        }

        public a(Context context, List list)
        {
            a = v.this;
            super(context, 0x7f0400a8, 0x7f10011b, list);
        }
    }


    protected ArrayList j;
    protected a k;
    protected com.pandora.radio.util.j l;
    private String m;
    private String n;
    private String o;

    public v()
    {
    }

    public static v a(j j1, com.pandora.radio.util.j j2)
    {
        return a(j1.a(), j1.a(), j1.b(), j1.c(), j1.d(), j2);
    }

    public static v a(String s1, String s2, String s3, String s4, ArrayList arraylist, com.pandora.radio.util.j j1)
    {
        v v1 = new v();
        v1.setArguments(b(s1, s2, s3, s4, arraylist, j1));
        return v1;
    }

    protected static Bundle b(String s1, String s2, String s3, String s4, ArrayList arraylist, com.pandora.radio.util.j j1)
    {
        Bundle bundle = new Bundle(8);
        bundle.putString("intent_genre_name", s2);
        bundle.putString("intent_genre_category_name", s1);
        bundle.putString("intent_category_gcat", s3);
        bundle.putString("intent_category_ad_url", s4);
        bundle.putSerializable("intent_stations_list", arraylist);
        bundle.putSerializable("intent_search_result_consumer", j1);
        return bundle;
    }

    protected void a(Bundle bundle)
    {
        s.a(getActivity(), getResources().getString(0x7f08015f), com/pandora/android/activity/HomeTabsActivity, 0x24000000, bundle);
    }

    public void a(ListView listview, View view, int i, long l1)
    {
        super.a(listview, view, i, l1);
        if (i >= 0)
        {
            listview = (com.pandora.radio.data.j.a)j.get(i);
            s.j();
            l.a(listview.b(), listview.c(), b.a.b(), p.cx.x.e.e, null);
            this.i.f();
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        super.a(flag, flag1);
        if (getActivity() instanceof BaseAdFragmentActivity)
        {
            KeyguardManager keyguardmanager = (KeyguardManager)getActivity().getSystemService("keyguard");
            if (flag && !keyguardmanager.inKeyguardRestrictedInputMode())
            {
                String s1 = com.pandora.android.ads.c.e(l_());
                ((BaseAdFragmentActivity)getActivity()).a(s1, true);
            }
        }
    }

    public boolean a()
    {
        return true;
    }

    public void b(Bundle bundle)
    {
    }

    public boolean c()
    {
        return false;
    }

    public CharSequence d()
    {
        return o;
    }

    protected void e()
    {
        com.pandora.android.ads.c.b().a(o, n, m);
        if (getActivity() instanceof BaseAdFragmentActivity)
        {
            ((BaseAdFragmentActivity)getActivity()).a("genre_category_load", true);
        }
    }

    public int l_()
    {
        return 3;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreate(bundle);
        return layoutinflater.inflate(0x7f04005b, viewgroup, false);
    }

    public void onResume()
    {
        super.onResume();
        if (k != null)
        {
            k = new a(getActivity(), j);
            a(k);
        }
        m_().setVisibility(0);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = getArguments();
        o = view.getString("intent_genre_category_name");
        j = (ArrayList)view.getSerializable("intent_stations_list");
        n = view.getString("intent_category_gcat");
        m = view.getString("intent_category_ad_url");
        if (j == null || j.size() == 0)
        {
            bundle = new Bundle(1);
            bundle.putSerializable("intent_page_name", p.c);
            a(bundle);
        }
        k = new a(getActivity(), j);
        a(k);
        l = (com.pandora.radio.util.j)view.getSerializable("intent_search_result_consumer");
        e();
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.Q;
    }
}
