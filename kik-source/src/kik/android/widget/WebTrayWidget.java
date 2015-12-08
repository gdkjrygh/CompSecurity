// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import com.kik.android.a;
import com.kik.cache.av;
import com.kik.h.b;
import java.util.List;
import kik.a.e.g;
import kik.android.b.ac;
import kik.android.chat.fragment.KikFragmentBase;
import kik.android.util.ad;

// Referenced classes of package kik.android.widget:
//            WindowAttachReporter, eo, ep, SquareNetworkedImageView

public class WebTrayWidget extends KikFragmentBase
    implements b
{
    private final class a extends BaseAdapter
    {

        final WebTrayWidget a;
        private final List b;
        private android.widget.AdapterView.OnItemClickListener c;

        public final android.widget.AdapterView.OnItemClickListener a()
        {
            return c;
        }

        public final int getCount()
        {
            return b.size();
        }

        public final Object getItem(int l)
        {
            return b.get(l);
        }

        public final long getItemId(int l)
        {
            return 0L;
        }

        public final int getItemViewType(int l)
        {
            return 0;
        }

        public final View getView(int l, View view, ViewGroup viewgroup)
        {
            kik.android.b.ac.a a2 = (kik.android.b.ac.a)getItem(l);
            a a1;
            if (view == null)
            {
                view = kik.android.widget.WebTrayWidget.b(a).inflate(0x7f030022, viewgroup, false);
                a1 = new a(this, (byte)0);
                a1.a = (SquareNetworkedImageView)view.findViewById(0x7f0e00c0);
                a1.b = (TextView)view.findViewById(0x7f0e00c1);
                view.setTag(a1);
            } else
            {
                a1 = (a)view.getTag();
            }
            if (a2 == null)
            {
                return new View(viewgroup.getContext());
            }
            viewgroup = av.a(a2.c(), a1.a.getMeasuredWidth(), a1.a.getMeasuredHeight());
            a1.a.a(viewgroup, a.a);
            a1.b.setText(a2.a());
            if (a2.a() != null)
            {
                view.setContentDescription((new StringBuilder("AUTOMATION_WEB_TRAY_CARD_")).append(a2.a().replace(" ", "_").toUpperCase()).toString());
            }
            return view;
        }

        public final int getViewTypeCount()
        {
            return 1;
        }

        a(List list)
        {
            a = WebTrayWidget.this;
            super();
            c = new ep(this);
            b = list;
        }
    }

    private final class a.a
    {

        SquareNetworkedImageView a;
        TextView b;
        final a c;

        private a.a(a a1)
        {
            c = a1;
            super();
        }

        a.a(a a1, byte byte0)
        {
            this(a1);
        }
    }


    protected com.kik.cache.ad a;
    protected com.kik.android.a b;
    private View c;
    private WindowAttachReporter d;
    private View e;
    private Message f;
    private ad g;
    private LayoutInflater h;
    private View i;
    private g j;
    private boolean k;

    public WebTrayWidget()
    {
        k = false;
    }

    static void a(WebTrayWidget webtraywidget, String s, int l)
    {
        if (s != null)
        {
            Bundle bundle = new Bundle();
            bundle.putString("launch_card", s);
            bundle.putBoolean("popup", false);
            bundle.putInt("KikChatFragment.CardIndex", l);
            webtraywidget.f.setData(bundle);
            webtraywidget.g.sendMessage(webtraywidget.f);
            webtraywidget.f = webtraywidget.g.obtainMessage();
        }
    }

    static boolean a(WebTrayWidget webtraywidget)
    {
        return webtraywidget.k;
    }

    static LayoutInflater b(WebTrayWidget webtraywidget)
    {
        return webtraywidget.h;
    }

    protected final void a(String s, String s1)
    {
    }

    public final void a(g g1)
    {
        j = g1;
        if (b != null)
        {
            b.b("Web Tray Opened").a("Is Maximized", k).b();
        }
    }

    public final void a(kik.android.chat.fragment.KikChatFragment.e e1)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[kik.android.chat.fragment.KikChatFragment.e.values().length];
                try
                {
                    a[kik.android.chat.fragment.KikChatFragment.e.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[kik.android.chat.fragment.KikChatFragment.e.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (kik.android.widget._cls1.a[e1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            k = true;
            return;

        case 2: // '\002'
            k = false;
            break;
        }
    }

    public final void a(ad ad1)
    {
        g = ad1;
        f = ad1.obtainMessage();
        f.setTarget(ad1);
    }

    public final void c(View view)
    {
        i = view;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        V().a(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        h = layoutinflater;
        c = layoutinflater.inflate(0x7f03003a, viewgroup, false);
        F();
        layoutinflater = h.inflate(0x7f030019, viewgroup, false);
        viewgroup = (GridView)layoutinflater.findViewById(0x7f0e0099);
        bundle = new a(ac.a());
        viewgroup.setAdapter(bundle);
        viewgroup.setOnItemClickListener(bundle.a());
        viewgroup.setSelector(new StateListDrawable());
        e = layoutinflater;
        d = (WindowAttachReporter)c.findViewById(0x7f0e009a);
        d.addView(e);
        layoutinflater = new Rect();
        d.getWindowVisibleDisplayFrame(layoutinflater);
        d.a(new eo(this));
        return c;
    }

    public void onDestroy()
    {
        if (i != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = i.getLayoutParams();
            layoutparams.height = 0;
            i.setLayoutParams(layoutparams);
            i.requestLayout();
        }
        super.onDestroy();
    }
}
