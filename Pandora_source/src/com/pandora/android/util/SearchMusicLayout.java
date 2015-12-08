// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.os.AsyncTask;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.pandora.android.activity.l;
import com.pandora.android.provider.b;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.data.v;
import com.pandora.radio.util.j;
import java.util.Hashtable;
import java.util.UUID;
import p.cw.c;
import p.cx.x;

// Referenced classes of package com.pandora.android.util:
//            s, u, SearchBox

public class SearchMusicLayout extends LinearLayout
{
    public static interface a
    {

        public abstract void a(int i1);

        public abstract void e();

        public abstract void f();

        public abstract void k_();
    }


    public UUID a;
    public SearchBox.a b = new SearchBox.a() {

        final SearchMusicLayout a;

        public void a(String s1)
        {
            if (com.pandora.android.util.s.a(s1))
            {
                return;
            }
            p.cw.a a1 = b.a.b().n();
            u u1 = com.pandora.android.util.SearchMusicLayout.b(a);
            boolean flag;
            if (!com.pandora.android.util.SearchMusicLayout.c(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a1.a(s1, u1, true, flag, p.cx.x.e.c);
            if (SearchMusicLayout.d(a) != null)
            {
                SearchMusicLayout.d(a).k_();
            }
            SearchMusicLayout.e(a);
        }

            
            {
                a = SearchMusicLayout.this;
                super();
            }
    };
    protected TextWatcher c = new TextWatcher() {

        final SearchMusicLayout a;

        public void afterTextChanged(Editable editable)
        {
            editable = com.pandora.android.util.s.a(editable);
            if (SearchMusicLayout.g(a) == null)
            {
                SearchMusicLayout.a(a, SearchMusicLayout.a(a, editable));
                return;
            } else
            {
                com.pandora.android.util.SearchMusicLayout.b(a, editable);
                return;
            }
        }

        public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
        {
            SearchMusicLayout searchmusiclayout = a;
            boolean flag;
            if (charsequence.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            SearchMusicLayout.a(searchmusiclayout, flag);
            SearchMusicLayout.f(a).a();
        }

            
            {
                a = SearchMusicLayout.this;
                super();
            }
    };
    private View d;
    private SearchBox e;
    private l f;
    private ListView g;
    private j h;
    private a i;
    private boolean j;
    private Hashtable k;
    private AsyncTask l;
    private String m;
    private u n;
    private boolean o;
    private boolean p;
    private SearchDescriptor q;
    private SearchBox.b r;
    private Context s;
    private SearchBox.b t = new SearchBox.b() {

        final SearchMusicLayout a;

        public void a()
        {
            SearchMusicLayout.a(a, null);
            if (SearchMusicLayout.a(a) != null)
            {
                SearchMusicLayout.a(a).a();
            }
        }

            
            {
                a = SearchMusicLayout.this;
                super();
            }
    };
    private android.widget.AdapterView.OnItemClickListener u = new android.widget.AdapterView.OnItemClickListener() {

        final SearchMusicLayout a;

        public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
        {
            if (i1 >= 0)
            {
                if (SearchMusicLayout.d(a) != null)
                {
                    SearchMusicLayout.d(a).k_();
                }
                view = (v)SearchMusicLayout.h(a).getItem(i1);
                if (SearchMusicLayout.i(a))
                {
                    adapterview = p.cx.x.e.c;
                } else
                {
                    adapterview = p.cx.x.e.d;
                }
                SearchMusicLayout.k(a).a(view.b(), view.c(), b.a.b(), adapterview, com.pandora.android.util.SearchMusicLayout.j(a));
                if (com.pandora.android.util.s.u())
                {
                    adapterview = new p.bz.i.a();
                    adapterview.a(com.pandora.android.view.HeaderLayout.d.a).d(true).b(true).c(false);
                    adapterview = adapterview.a();
                    b.a.e().a(adapterview);
                } else
                {
                    com.pandora.android.util.SearchMusicLayout.l(a).a();
                    com.pandora.android.util.SearchMusicLayout.l(a).d();
                }
                if (SearchMusicLayout.d(a) != null)
                {
                    SearchMusicLayout.d(a).a(i1);
                }
            }
        }

            
            {
                a = SearchMusicLayout.this;
                super();
            }
    };

    public SearchMusicLayout(Context context)
    {
        super(context);
        j = false;
        s = context;
        d();
    }

    public SearchMusicLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = false;
        s = context;
        d();
    }

    static AsyncTask a(SearchMusicLayout searchmusiclayout, AsyncTask asynctask)
    {
        searchmusiclayout.l = asynctask;
        return asynctask;
    }

    static AsyncTask a(SearchMusicLayout searchmusiclayout, String s1)
    {
        return searchmusiclayout.a(s1);
    }

    private AsyncTask a(String s1)
    {
        if (p && s1.length() == 0)
        {
            p = false;
        }
        o = false;
        if (com.pandora.android.util.s.a(s1))
        {
            return null;
        } else
        {
            return (new AsyncTask(s1) {

                final String a;
                final SearchMusicLayout b;

                protected void a(v av[])
                {
                    if (!isCancelled())
                    {
                        SearchMusicLayout.a(b, av);
                    }
                }

                protected transient v[] a(Object aobj[])
                {
                    if (isCancelled())
                    {
                        break MISSING_BLOCK_LABEL_64;
                    }
                    String s2;
                    aobj = b.a.b().e();
                    s2 = a;
                    boolean flag;
                    if (!com.pandora.android.util.SearchMusicLayout.c(b))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    aobj = ((x) (aobj)).a(s2, flag, SearchMusicLayout.m(b));
                    return ((v []) (aobj));
                    aobj;
                    p.df.a.b("SearchMusicLayout", "Autocomplete error", ((Throwable) (aobj)));
                    return null;
                }

                protected Object doInBackground(Object aobj[])
                {
                    return a(aobj);
                }

                protected void onPostExecute(Object obj)
                {
                    a((v[])obj);
                }

            
            {
                b = SearchMusicLayout.this;
                a = s1;
                super();
            }
            }).execute(new Object[0]);
        }
    }

    static SearchBox.b a(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.r;
    }

    static SearchDescriptor a(SearchMusicLayout searchmusiclayout, SearchDescriptor searchdescriptor)
    {
        searchmusiclayout.q = searchdescriptor;
        return searchdescriptor;
    }

    static void a(SearchMusicLayout searchmusiclayout, boolean flag)
    {
        searchmusiclayout.a(flag);
    }

    static void a(SearchMusicLayout searchmusiclayout, v av[])
    {
        searchmusiclayout.a(av);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            g.setAdapter(f);
            g.setOnItemClickListener(u);
            g.setVisibility(0);
            setVisibility(0);
            if (i != null)
            {
                i.e();
            }
        } else
        {
            g.setVisibility(8);
            setVisibility(8);
            if (i != null)
            {
                i.f();
                return;
            }
        }
    }

    private void a(v av[])
    {
        f.a(av);
        if (m != null)
        {
            l = a(m);
            m = null;
            return;
        } else
        {
            l = null;
            return;
        }
    }

    static u b(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.n;
    }

    static String b(SearchMusicLayout searchmusiclayout, String s1)
    {
        searchmusiclayout.m = s1;
        return s1;
    }

    static boolean c(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.j;
    }

    static a d(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.i;
    }

    private void d()
    {
        d = LayoutInflater.from(getContext()).inflate(0x7f04008b, this, false);
        addView(d, 0);
        k = new Hashtable();
        a = UUID.randomUUID();
        n = new u(a);
        g = (ListView)d.findViewById(0x7f100235);
        g.setOverScrollMode(2);
        f = new l(s);
    }

    private void e()
    {
        if (com.pandora.android.util.s.u())
        {
            Object obj = new p.bz.i.a();
            ((p.bz.i.a) (obj)).a(com.pandora.android.view.HeaderLayout.d.a).d(true).c(false);
            obj = ((p.bz.i.a) (obj)).a();
            b.a.e().a(obj);
        } else
        if (e != null)
        {
            e.d();
            return;
        }
    }

    static void e(SearchMusicLayout searchmusiclayout)
    {
        searchmusiclayout.e();
    }

    static SearchBox.b f(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.t;
    }

    static AsyncTask g(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.l;
    }

    static l h(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.f;
    }

    static boolean i(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.o;
    }

    static SearchDescriptor j(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.q;
    }

    static j k(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.h;
    }

    static SearchBox l(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.e;
    }

    static Hashtable m(SearchMusicLayout searchmusiclayout)
    {
        return searchmusiclayout.k;
    }

    public void a()
    {
        if (l != null)
        {
            l.cancel(true);
            l = null;
        }
        m = null;
    }

    public void a(SearchBox searchbox, int i1, boolean flag)
    {
        e = searchbox;
        e.a(i1, b);
        e.a(c);
        e.setSearchTextChangedListener(t);
        e.e();
        j = flag;
    }

    public boolean a(MusicSearchData musicsearchdata)
    {
        if (l != null)
        {
            l.cancel(true);
            l = null;
        }
        q = musicsearchdata.e();
        boolean flag = f.a(musicsearchdata);
        if (flag)
        {
            o = true;
            p = true;
            a(true);
        }
        return flag;
    }

    public void b()
    {
        if (e != null)
        {
            e.b(c);
            e.setSearchListener(null);
            e.setSearchTextChangedListener(null);
        }
    }

    public boolean c()
    {
        return o;
    }

    public TextWatcher getMusicSearchTextWatcher()
    {
        return c;
    }

    public SearchBox.a getSearchListener()
    {
        return b;
    }

    public void setSearchResultConsumer(j j1)
    {
        h = j1;
    }

    public void setSearchResultsShownListener(a a1)
    {
        i = a1;
    }

    public void setSearchTextChangedListener(SearchBox.b b1)
    {
        r = b1;
    }
}
