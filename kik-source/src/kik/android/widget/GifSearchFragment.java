// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.kik.g.p;
import com.kik.g.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kik.a.e.f;
import kik.android.gifs.a.a;
import kik.android.gifs.a.b;
import kik.android.util.cv;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package kik.android.widget:
//            GifWidgetFragment, as, RobotoEditText, bj, 
//            au, bk, bb, bc, 
//            AutoResizeRecyclerGridView, ba, bd, be, 
//            bf, bg, bh, bi, 
//            bm

public class GifSearchFragment extends GifWidgetFragment
{
    private static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        private static final int e[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = (new int[] {
                a, b, c, d
            });
        }
    }

    public final class b
    {

        final GifSearchFragment a;

        public final void a(String s1, String s2)
        {
            GifSearchFragment.c(a, false);
            a._searchEditText.setText(s2);
            if (a._searchEditText.isFocused())
            {
                a._searchEditText.setSelection(s1.length());
            }
            kik.android.widget.GifSearchFragment.a(a, s1).a(new bm(this, s1));
            if (GifSearchFragment.h(a).getBoolean("GIF_HINT_BAR_KEY", true))
            {
                int l = GifSearchFragment.h(a).getInt("GIF_EMOJI_TAPPED_KEY", 0) + 1;
                s1 = GifSearchFragment.h(a).edit();
                s1.putInt("GIF_EMOJI_TAPPED_KEY", l);
                if (l >= 3)
                {
                    GifSearchFragment.j(a);
                    s1.putBoolean("GIF_HINT_BAR_KEY", false);
                }
                s1.apply();
            }
        }

        public b()
        {
            a = GifSearchFragment.this;
            super();
        }
    }


    protected AutoResizeRecyclerGridView _emojiGridView;
    protected ImageView _gifAttributionBar;
    protected LinearLayout _gifsCantLoad;
    protected FrameLayout _gifsHintBar;
    protected ImageView _gifsHintBarClose;
    protected RelativeLayout _noSearchResults;
    protected TextView _noSearchResultsText;
    protected RecyclerView _resultGridView;
    protected RelativeLayout _searchBar;
    protected ImageView _searchCancel;
    protected RobotoEditText _searchEditText;
    protected ProgressBar _searchResultsLoading;
    private SharedPreferences d;
    private boolean e;
    private p f;
    private String g;
    private boolean h;
    private int i;
    private int j;

    public GifSearchFragment()
    {
        e = true;
        h = false;
    }

    static int a(GifSearchFragment gifsearchfragment, int l)
    {
        gifsearchfragment.j = l;
        return l;
    }

    static p a(GifSearchFragment gifsearchfragment, String s1)
    {
        return gifsearchfragment.b(s1);
    }

    static String a(List list)
    {
        return b(list);
    }

    private static List a(String s1)
    {
        ArrayList arraylist = new ArrayList();
        s1 = new JSONArray(s1);
        int l = 0;
_L2:
        if (l >= s1.length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = s1.getJSONObject(l);
        arraylist.add(new kik.android.gifs.a.a(jsonobject.getString("key"), jsonobject.getString("value")));
        l++;
        if (true) goto _L2; else goto _L1
        s1;
        s1.printStackTrace();
_L1:
        return arraylist;
    }

    private void a(List list, as as1)
    {
        if (list != null && as1 != null && as1.e() != null)
        {
            List list1 = as1.e();
            for (list = list.iterator(); list.hasNext(); list1.add((kik.android.gifs.a.a)list.next())) { }
            as1.d();
        }
        a(GifWidget.a.c);
    }

    static void a(GifSearchFragment gifsearchfragment)
    {
        gifsearchfragment.W();
    }

    static void a(GifSearchFragment gifsearchfragment, String s1, int l)
    {
        boolean flag1 = true;
        if (gifsearchfragment._resultGridView.getVisibility() == 0 && !gifsearchfragment._searchEditText.getText().toString().equals(gifsearchfragment.g))
        {
            gifsearchfragment.g = s1;
            if (gifsearchfragment.f() != null && gifsearchfragment.g() != null && gifsearchfragment.e() != null)
            {
                com.kik.android.a.f f1 = gifsearchfragment.e().b("GIF End Search");
                boolean flag;
                if (!gifsearchfragment.f().c())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                f1 = f1.a("Is Maximized", flag);
                if (gifsearchfragment.g().getResources().getConfiguration().orientation == 2)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                f1.a("Is Landscape", flag).a("Search Query", s1).a("Result Count", l).b();
                return;
            }
        }
    }

    static void a(GifSearchFragment gifsearchfragment, List list, as as1)
    {
        gifsearchfragment.a(list, as1);
    }

    static void a(GifSearchFragment gifsearchfragment, boolean flag)
    {
        gifsearchfragment.d(flag);
    }

    private void a(as as1)
    {
        a(GifWidget.a.e);
        boolean flag;
        if (Math.abs(d.getLong("TIMER_CACHE", 0L) - System.currentTimeMillis()) > 0x5265c00L)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            List list = j();
            if (list != null)
            {
                a(list, as1);
                return;
            }
        }
        h().a(Locale.getDefault()).a(new bj(this, as1));
    }

    static int b(GifSearchFragment gifsearchfragment, int l)
    {
        gifsearchfragment.i = l;
        return l;
    }

    private p b(String s1)
    {
        k();
        p p1 = new p();
        a(GifWidget.a.e);
        f = s.a(a(s1, (au)_resultGridView.a()), 5000L);
        f.a(new bk(this, s1, p1));
        return p1;
    }

    private static String b(List list)
    {
        if (list == null)
        {
            return "";
        }
        JSONArray jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext();)
        {
            kik.android.gifs.a.a a1 = (kik.android.gifs.a.a)list.next();
            try
            {
                JSONObject jsonobject = new JSONObject();
                jsonobject.put("key", a1.a());
                jsonobject.put("value", a1.b());
                jsonarray.put(jsonobject);
            }
            catch (JSONException jsonexception) { }
        }

        return jsonarray.toString();
    }

    static void b(GifSearchFragment gifsearchfragment)
    {
        gifsearchfragment.W();
    }

    static void b(GifSearchFragment gifsearchfragment, String s1)
    {
        boolean flag1 = true;
        if (gifsearchfragment.f() != null && gifsearchfragment.g() != null && gifsearchfragment.e() != null)
        {
            com.kik.android.a.f f1 = gifsearchfragment.e().b("GIF Begin Search");
            boolean flag;
            if (!gifsearchfragment.f().c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = f1.a("Is Maximized", flag);
            if (gifsearchfragment.g().getResources().getConfiguration().orientation == 2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            f1.a("Is Landscape", flag).a("Search Query", s1).b();
        }
    }

    static void b(GifSearchFragment gifsearchfragment, String s1, int l)
    {
        boolean flag1 = true;
        if (gifsearchfragment.f() != null && gifsearchfragment.g() != null && gifsearchfragment.e() != null)
        {
            com.kik.android.a.f f1 = gifsearchfragment.e().b("GIF Emoji Search");
            boolean flag;
            if (!gifsearchfragment.f().c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = f1.a("Is Maximized", flag);
            if (gifsearchfragment.g().getResources().getConfiguration().orientation == 2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            f1.a("Is Landscape", flag).a("Search Query", s1).a("Result Count", l).b();
        }
    }

    static void b(GifSearchFragment gifsearchfragment, boolean flag)
    {
        gifsearchfragment.c(flag);
    }

    private void b(boolean flag)
    {
        if (!flag)
        {
            _gifsHintBar.setVisibility(8);
        } else
        if (d.getBoolean("GIF_HINT_BAR_KEY", true))
        {
            _gifsHintBar.setVisibility(0);
            return;
        }
    }

    static void c(GifSearchFragment gifsearchfragment)
    {
        gifsearchfragment.W();
    }

    private void c(boolean flag)
    {
        if (j == kik.android.widget.a.a && flag || j == kik.android.widget.a.b && !flag)
        {
            return;
        }
        bb bb1 = new bb(this, flag);
        _gifAttributionBar.animate().cancel();
        if (flag && _resultGridView.getVisibility() == 0)
        {
            _gifAttributionBar.setVisibility(0);
            _gifAttributionBar.animate().setDuration(125L).translationY(0.0F).setListener(bb1);
            return;
        } else
        {
            _gifAttributionBar.animate().setDuration(125L).translationY(_gifAttributionBar.getHeight()).setListener(bb1);
            return;
        }
    }

    static boolean c(GifSearchFragment gifsearchfragment, boolean flag)
    {
        gifsearchfragment.e = flag;
        return flag;
    }

    static void d(GifSearchFragment gifsearchfragment)
    {
        gifsearchfragment.W();
    }

    private void d(boolean flag)
    {
        if (i == kik.android.widget.a.a && flag || i == kik.android.widget.a.b && !flag)
        {
            return;
        }
        bc bc1 = new bc(this, flag);
        _searchBar.animate().cancel();
        if (flag)
        {
            _searchBar.animate().setDuration(200L).translationY(0.0F).setListener(bc1);
            return;
        } else
        {
            _searchBar.animate().setDuration(200L).translationY(-_searchBar.getHeight()).setListener(bc1);
            return;
        }
    }

    static void e(GifSearchFragment gifsearchfragment)
    {
        gifsearchfragment.k();
    }

    static boolean f(GifSearchFragment gifsearchfragment)
    {
        return gifsearchfragment.e;
    }

    static void g(GifSearchFragment gifsearchfragment)
    {
        gifsearchfragment.W();
    }

    static SharedPreferences h(GifSearchFragment gifsearchfragment)
    {
        return gifsearchfragment.d;
    }

    static List i(GifSearchFragment gifsearchfragment)
    {
        return gifsearchfragment.j();
    }

    private List j()
    {
        String s1 = d.getString("EMOJI_CACHE", "");
        if (!s1.equals(""))
        {
            return a(s1);
        } else
        {
            return null;
        }
    }

    static void j(GifSearchFragment gifsearchfragment)
    {
        gifsearchfragment.b(false);
    }

    private void k()
    {
        if (f != null)
        {
            f.e();
        }
        h().a("GIF_RESULT_KEY");
    }

    protected final void a()
    {
        String s1 = _searchEditText.getText().toString();
        if (i() == GifWidget.a.g && s1.equals(""))
        {
            a((as)_emojiGridView.a());
        } else
        if (i() == GifWidget.a.g)
        {
            b(s1);
            return;
        }
    }

    protected final void a(int l)
    {
        boolean flag1;
        flag1 = true;
        super.a(l);
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[kik.android.widget.GifWidget.a.a().length];
                try
                {
                    a[GifWidget.a.d - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[GifWidget.a.e - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[kik.android.widget.GifWidget.a.f - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[GifWidget.a.c - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[GifWidget.a.g - 1] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        kik.android.widget._cls1.a[l - 1];
        JVM INSTR tableswitch 1 5: default 48
    //                   1 49
    //                   2 138
    //                   3 205
    //                   4 277
    //                   5 356;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        cv.e(new View[] {
            _emojiGridView, _searchResultsLoading, _noSearchResults, _gifsCantLoad
        });
        a(_resultGridView);
        b(false);
        cv.b(new View[] {
            _resultGridView
        });
        if (f() != null && !f().c())
        {
            c(true);
        }
        h = false;
        return;
_L3:
        cv.e(new View[] {
            _emojiGridView, _resultGridView, _noSearchResults, _gifsCantLoad, _gifAttributionBar
        });
        d(true);
        b(false);
        cv.b(new View[] {
            _searchResultsLoading
        });
        return;
_L4:
        cv.e(new View[] {
            _emojiGridView, _resultGridView, _searchResultsLoading, _gifsCantLoad, _gifAttributionBar
        });
        d(true);
        b(false);
        cv.b(new View[] {
            _noSearchResults
        });
        h = false;
        return;
_L5:
        cv.e(new View[] {
            _resultGridView, _searchResultsLoading, _noSearchResults, _gifsCantLoad, _gifAttributionBar
        });
        a(((RecyclerView) (_emojiGridView)));
        d(true);
        cv.b(new View[] {
            _emojiGridView
        });
        b(true);
        h = false;
        return;
_L6:
        cv.e(new View[] {
            _resultGridView, _searchResultsLoading, _noSearchResults, _emojiGridView, _gifAttributionBar
        });
        d(true);
        b(false);
        cv.b(new View[] {
            _gifsCantLoad
        });
        String s1 = _searchEditText.getText().toString();
        if (f() != null && g() != null && !h && e() != null)
        {
            h = true;
            com.kik.android.a.f f1 = e().b("GIF Search Failed");
            boolean flag;
            if (!f().c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = f1.a("Is Maximized", flag);
            if (g().getResources().getConfiguration().orientation == 2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            f1.a("Is Landscape", flag).a("Search Query", s1).a("Network Is Connected", a.k()).b();
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    protected final void a(kik.android.gifs.a.f f1, int l, String s1)
    {
        boolean flag1 = true;
        s1 = _searchEditText.getText().toString();
        _searchEditText.clearFocus();
        String s2 = f1.a();
        if (f() != null && g() != null && b != null)
        {
            com.kik.android.a.f f2 = e().b("GIF Previewed");
            boolean flag;
            if (!f().c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f2 = f2.a("Is Maximized", flag);
            if (g().getResources().getConfiguration().orientation == 2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            f2.a("Is Landscape", flag).a("Search Query", s1).a("Index", l).a("ID", s2).b();
        }
        super.a(f1, l, s1);
    }

    protected final void b()
    {
        _searchEditText.setText("");
    }

    protected final void c()
    {
        d(true);
        c(true);
    }

    public void cancelSearchText()
    {
        _searchEditText.setText("");
    }

    protected final void d()
    {
        c(false);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        byte byte0;
        if (configuration.orientation == 2)
        {
            byte0 = 3;
        } else
        {
            byte0 = 2;
        }
        configuration = _resultGridView.b();
        if (configuration instanceof StaggeredGridLayoutManager)
        {
            ((StaggeredGridLayoutManager)configuration).a(byte0);
        }
        d(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(0x7f03004c, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        d = g().getSharedPreferences("kik.gifs", 0);
        viewgroup = new ArrayList();
        int l = getResources().getDimensionPixelSize(0x7f0d0017);
        int i1 = getResources().getDimensionPixelSize(0x7f0d000c);
        bundle = new Space(g());
        Object obj = new Space(g());
        bundle.setMinimumHeight(l);
        ((Space) (obj)).setMinimumHeight(i1);
        if (g().getResources().getConfiguration().orientation == 1)
        {
            l = 2;
        } else
        {
            l = 3;
        }
        bundle = new au(viewgroup, g(), c, b, this);
        obj = new StaggeredGridLayoutManager(l);
        _resultGridView.a(((android.support.v7.widget.RecyclerView.i) (obj)));
        _resultGridView.a(bundle);
        _resultGridView.a(new ba(this));
        _resultGridView.a(new bd(this, viewgroup, ((StaggeredGridLayoutManager) (obj))));
        bundle = new as(new ArrayList(), g(), new b());
        _emojiGridView.a(bundle);
        _emojiGridView.a(new be(this));
        a(bundle);
        _searchEditText.addTextChangedListener(new bf(this));
        _searchEditText.setOnEditorActionListener(new bg(this, viewgroup));
        _searchEditText.setOnFocusChangeListener(new bh(this));
        _searchEditText.setOnClickListener(new bi(this));
        return layoutinflater;
    }

    public void onHiddenChanged(boolean flag)
    {
        super.onHiddenChanged(flag);
        if (!flag && i() == GifWidget.a.g)
        {
            a((as)_emojiGridView.a());
        }
    }

    public void onHintCloseClicked()
    {
        b(false);
        d.edit().putBoolean("GIF_HINT_BAR_KEY", false).apply();
    }

    public void onNoResultsClicked()
    {
        W();
    }

    public void onResultsErrorClicked()
    {
        W();
    }

    public final boolean v()
    {
        if (f() != null && !f().c())
        {
            f().b();
            return true;
        } else
        {
            return super.v();
        }
    }
}
