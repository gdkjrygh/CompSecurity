// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.kik.cache.SoftwareContactImageView;
import com.kik.cache.ad;
import com.kik.e.a;
import com.kik.m.d;
import kik.a.e.l;
import kik.android.chat.KikApplication;
import kik.android.util.cp;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase

public abstract class BaseChatInfoFragment extends KikIqFragmentBase
{

    protected LayoutInflater a;
    protected View b;
    protected cp c;
    protected SoftwareContactImageView d;
    protected LinearLayout e;
    protected ListView f;
    protected ViewGroup g;
    protected ViewGroup h;
    protected TextView i;
    protected TextView j;
    protected TextView k;
    protected View l;
    protected View m;
    protected l n;
    protected com.kik.android.a o;
    protected ad p;

    public BaseChatInfoFragment()
    {
    }

    protected final int K()
    {
        return 0x7f090016;
    }

    protected abstract android.view.View.OnClickListener a();

    protected final View a(String s, Drawable drawable, android.view.View.OnClickListener onclicklistener)
    {
        View view = a.inflate(0x7f030023, null, false);
        TextView textview = (TextView)view.findViewById(0x7f0e00c4);
        ((ImageView)view.findViewById(0x7f0e00c3)).setImageDrawable(drawable);
        textview.setText(s);
        view.findViewById(0x7f0e00c2).setOnClickListener(onclicklistener);
        return view;
    }

    protected abstract void b();

    protected abstract void b(boolean flag);

    protected abstract void c();

    protected final void c(View view)
    {
        e.addView(view);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        b(true);
    }

    public void onCreate(Bundle bundle)
    {
        a a1 = V();
        if (a1 != null)
        {
            a1.a(this);
        }
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = layoutinflater;
        b = layoutinflater.inflate(0x7f030006, viewgroup, false);
        d = (SoftwareContactImageView)b.findViewById(0x7f0e0030);
        e = (LinearLayout)b.findViewById(0x7f0e000b);
        f = (ListView)b.findViewById(0x7f0e0034);
        g = (ViewGroup)b.findViewById(0x7f0e002d);
        h = (ViewGroup)b.findViewById(0x7f0e002c);
        i = (TextView)b.findViewById(0x7f0e0032);
        j = (TextView)b.findViewById(0x7f0e0033);
        k = (TextView)b.findViewById(0x7f0e0079);
        l = b.findViewById(0x7f0e000c);
        m = b.findViewById(0x7f0e0036);
        ButterKnife.inject(this, b);
        c = new cp(getActivity());
        h.removeView(g);
        h.removeView(l);
        g.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -1));
        l.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, KikApplication.a(8)));
        f.addHeaderView(g);
        f.addHeaderView(l);
        m.setOnClickListener(a());
        cv.b(new View[] {
            m
        });
        com.kik.m.d.a(m, "AUTOMATION_CHAT_INFO_OPTIONS");
        registerForContextMenu(f);
        b();
        c();
        return b;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
