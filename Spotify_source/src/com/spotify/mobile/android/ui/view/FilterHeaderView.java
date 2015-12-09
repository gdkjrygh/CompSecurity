// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import dft;
import dfz;
import dmz;
import fop;
import gas;
import gat;
import gav;
import gcg;
import gfp;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            HideableHeadersListView

public class FilterHeaderView extends RelativeLayout
{

    public TextView a;
    public gas b;
    private ImageButton c;
    private boolean d;
    private boolean e;
    private Verified f;
    private String g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private Drawable k;
    private gat l;
    private final gav m;
    private android.view.View.OnTouchListener n = new android.view.View.OnTouchListener() {

        private FilterHeaderView a;

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() == 1)
            {
                view = FilterHeaderView.e(a).getCompoundDrawables()[2];
                if (view != null && motionevent.getX() >= (float)(FilterHeaderView.e(a).getWidth() - FilterHeaderView.e(a).getPaddingRight() - FilterHeaderView.e(a).getCompoundPaddingRight() - view.getBounds().width()))
                {
                    FilterHeaderView.e(a).setText("");
                    a.a();
                    FilterHeaderView.e(a).clearFocus();
                }
            }
            return false;
        }

            
            {
                a = FilterHeaderView.this;
                super();
            }
    };
    private final android.view.View.OnClickListener o;
    private final TextWatcher p;
    private final android.view.View.OnKeyListener q;
    private final android.view.View.OnFocusChangeListener r;

    public FilterHeaderView(Context context)
    {
        super(context);
        dmz.a(fop);
        m = new gav() {

            private FilterHeaderView a;

            public final void a(gfp gfp1)
            {
                if (FilterHeaderView.b(a) != null)
                {
                    FilterHeaderView.b(a).a(gfp1);
                }
                if (FilterHeaderView.c(a) != null)
                {
                    ClientEvent clientevent = ClientEventFactory.a(FilterHeaderView.d(a), com.spotify.mobile.android.util.ClientEvent.SubEvent.az, null, null);
                    clientevent.a("order", gfp1.a());
                    clientevent.a("reversed", String.valueOf(gfp1.b()));
                    fop.a(a.getContext(), FilterHeaderView.c(a), clientevent);
                }
                FilterHeaderView.a(a, gfp1);
            }

            
            {
                a = FilterHeaderView.this;
                super();
            }
        };
        o = new android.view.View.OnClickListener() {

            private FilterHeaderView a;

            public final void onClick(View view)
            {
                if (FilterHeaderView.c(a) != null)
                {
                    fop.a(a.getContext(), FilterHeaderView.c(a), ClientEventFactory.a(FilterHeaderView.d(a), com.spotify.mobile.android.util.ClientEvent.SubEvent.aA, null, null));
                }
                FilterHeaderView.g(a).a(FilterHeaderView.f(a));
            }

            
            {
                a = FilterHeaderView.this;
                super();
            }
        };
        p = new TextWatcher() {

            private FilterHeaderView a;

            public final void afterTextChanged(Editable editable)
            {
                if (FilterHeaderView.b(a) != null)
                {
                    FilterHeaderView.b(a).a(editable.toString());
                }
                FilterHeaderView.h(a);
                if (FilterHeaderView.b(a) != null && !a.b())
                {
                    FilterHeaderView.b(a).a();
                }
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = FilterHeaderView.this;
                super();
            }
        };
        q = new android.view.View.OnKeyListener() {

            private FilterHeaderView a;

            public final boolean onKey(View view, int i1, KeyEvent keyevent)
            {
                if (i1 == 66 || i1 == 16)
                {
                    a.a();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = FilterHeaderView.this;
                super();
            }
        };
        r = new android.view.View.OnFocusChangeListener() {

            private FilterHeaderView a;

            public final void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    FilterHeaderView.i(a);
                }
            }

            
            {
                a = FilterHeaderView.this;
                super();
            }
        };
        c();
    }

    public FilterHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        dmz.a(fop);
        m = new _cls1();
        o = new _cls3();
        p = new _cls4();
        q = new _cls5();
        r = new _cls6();
        c();
    }

    private Drawable a(SpotifyIcon spotifyicon)
    {
        spotifyicon = new dfz(getContext(), spotifyicon);
        spotifyicon.a(gcg.b(getContext(), 0x7f0f00b9));
        spotifyicon.a(dft.b(24F, getResources()));
        return spotifyicon;
    }

    public static FilterHeaderView a(LayoutInflater layoutinflater, String s, List list, gfp gfp1, gas gas1)
    {
        layoutinflater = (FilterHeaderView)layoutinflater.inflate(0x7f0300c2, null);
        layoutinflater.a(s);
        layoutinflater.a(list, gfp1);
        layoutinflater.b = gas1;
        return layoutinflater;
    }

    public static FilterHeaderView a(LayoutInflater layoutinflater, String s, List list, gfp gfp1, gas gas1, ListView listview)
    {
        layoutinflater = (FilterHeaderView)layoutinflater.inflate(0x7f0300c2, listview, false);
        layoutinflater.a(s);
        layoutinflater.a(list, gfp1);
        layoutinflater.b = gas1;
        b(listview, layoutinflater);
        if (!s.isEmpty() || !(listview instanceof HideableHeadersListView))
        {
            listview.addHeaderView(layoutinflater);
            return layoutinflater;
        } else
        {
            ((HideableHeadersListView)listview).b(layoutinflater);
            return layoutinflater;
        }
    }

    public static FilterHeaderView a(LayoutInflater layoutinflater, String s, List list, gfp gfp1, List list1, gas gas1, ListView listview)
    {
        layoutinflater = (FilterHeaderView)layoutinflater.inflate(0x7f0300c2, listview, false);
        layoutinflater.a(s);
        ((FilterHeaderView) (layoutinflater)).l.a(list1);
        layoutinflater.a(list, gfp1);
        layoutinflater.b = gas1;
        b(listview, layoutinflater);
        if (!s.isEmpty() || !(listview instanceof HideableHeadersListView))
        {
            listview.addHeaderView(layoutinflater);
            return layoutinflater;
        } else
        {
            ((HideableHeadersListView)listview).b(layoutinflater);
            return layoutinflater;
        }
    }

    public static void a(View view, FilterHeaderView filterheaderview)
    {
        view.setOnTouchListener(new android.view.View.OnTouchListener(filterheaderview.a, filterheaderview) {

            private TextView a;
            private FilterHeaderView b;

            public final boolean onTouch(View view1, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0 && a.isFocused())
                {
                    view1 = new Rect();
                    a.getGlobalVisibleRect(view1);
                    if (!view1.contains((int)motionevent.getRawX(), (int)motionevent.getRawY()))
                    {
                        b.a();
                    }
                }
                return false;
            }

            
            {
                a = textview;
                b = filterheaderview;
                super();
            }
        });
    }

    public static void a(FilterHeaderView filterheaderview)
    {
        filterheaderview.b = null;
    }

    static void a(FilterHeaderView filterheaderview, gfp gfp1)
    {
        filterheaderview.a(gfp1);
    }

    private void a(gfp gfp1)
    {
        if (gfp1 == null || !gfp1.c)
        {
            c.setImageDrawable(i);
            return;
        }
        if (gfp1.b())
        {
            c.setImageDrawable(k);
            return;
        } else
        {
            c.setImageDrawable(j);
            return;
        }
    }

    private void a(String s)
    {
        TextView textview = a;
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        textview.setText(s1);
        d = b();
    }

    private void a(List list, gfp gfp1)
    {
        l.a(list, gfp1);
        a(gfp1);
    }

    private void a(boolean flag)
    {
        if (e != flag)
        {
            e = flag;
            if (b != null)
            {
                b.a(e);
            }
        }
    }

    static gas b(FilterHeaderView filterheaderview)
    {
        return filterheaderview.b;
    }

    private static void b(View view, FilterHeaderView filterheaderview)
    {
        View view1 = null;
        for (view = view.getParent(); view1 == null && view != null && (view instanceof View); view = view.getParent())
        {
            view1 = ((View)view).findViewById(0x7f110405);
        }

        Assertion.a(view1, "View with FilterHeaderView must use list_overlay layout");
        a(view1, filterheaderview);
    }

    static Verified c(FilterHeaderView filterheaderview)
    {
        return filterheaderview.f;
    }

    private void c()
    {
        LayoutInflater layoutinflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
        l = new gat(getContext(), layoutinflater, m);
        i = a(SpotifyIcon.aQ);
        j = a(SpotifyIcon.aR);
        k = a(SpotifyIcon.aS);
        h = new dfz(getContext(), SpotifyIcon.ah);
    }

    static String d(FilterHeaderView filterheaderview)
    {
        return filterheaderview.g;
    }

    static TextView e(FilterHeaderView filterheaderview)
    {
        return filterheaderview.a;
    }

    static ImageButton f(FilterHeaderView filterheaderview)
    {
        return filterheaderview.c;
    }

    static gat g(FilterHeaderView filterheaderview)
    {
        return filterheaderview.l;
    }

    static void h(FilterHeaderView filterheaderview)
    {
        boolean flag = filterheaderview.b();
        if (flag)
        {
            filterheaderview.a.setCompoundDrawablesWithIntrinsicBounds(null, null, filterheaderview.h, null);
        } else
        {
            filterheaderview.a.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
        if (filterheaderview.f != null && filterheaderview.d != flag)
        {
            Context context = filterheaderview.getContext();
            Verified verified = filterheaderview.f;
            String s = filterheaderview.g;
            com.spotify.mobile.android.util.ClientEvent.SubEvent subevent;
            if (flag)
            {
                subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.ax;
            } else
            {
                subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.ay;
            }
            fop.a(context, verified, ClientEventFactory.a(s, subevent, null, null));
        }
        filterheaderview.d = flag;
    }

    static void i(FilterHeaderView filterheaderview)
    {
        filterheaderview.a(true);
    }

    public final void a()
    {
        a.clearFocus();
        ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(a.getWindowToken(), 0);
        a(false);
    }

    public final void a(int i1)
    {
        a.setHint(i1);
    }

    public final void a(Verified verified, String s)
    {
        f = verified;
        g = s;
    }

    public final boolean b()
    {
        return !a.getText().toString().isEmpty();
    }

    protected void onDetachedFromWindow()
    {
        l.dismiss();
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            c = (ImageButton)findViewById(0x7f1103f5);
            a = (EditText)findViewById(0x7f1103f4);
            c.setOnClickListener(o);
            a.addTextChangedListener(p);
            a.setOnKeyListener(q);
            a.setOnFocusChangeListener(r);
            d = false;
            e = false;
            a.setOnTouchListener(n);
            a(((gfp) (null)));
            return;
        }
    }
}
