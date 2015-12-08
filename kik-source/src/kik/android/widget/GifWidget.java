// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.kik.android.a;
import com.kik.cache.ad;
import com.kik.h.b;
import com.kik.l.ab;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import kik.a.e.g;
import kik.android.chat.fragment.KikFragmentBase;
import kik.android.gifs.a.c;
import kik.android.gifs.a.f;
import kik.android.gifs.view.AspectRatioGifView;

// Referenced classes of package kik.android.widget:
//            bo, bs, bn, GifWidgetFragment, 
//            GifSearchFragment

public class GifWidget extends KikFragmentBase
    implements com.kik.h.b
{
    protected static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;
        public static final int f;
        public static final int g;
        private static final int h[];

        public static int[] a()
        {
            return (int[])h.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = 5;
            f = 6;
            g = 7;
            h = (new int[] {
                a, b, c, d, e, f, g
            });
        }
    }

    protected static interface b
        extends android.view.View.OnClickListener
    {

        public abstract void a(f f1, int l, String s);
    }


    protected LinearLayout _buttonBar;
    protected FrameLayout _featuredButton;
    protected ImageView _featuredButtonImage;
    protected FrameLayout _gifFrame;
    protected ImageView _gifUseButton;
    protected LinearLayout _gifsCantLoad;
    protected AspectRatioGifView _previewImage;
    protected FrameLayout _previewView;
    protected ImageView _rechooseButton;
    protected FrameLayout _searchButton;
    protected ImageView _searchButtonImage;
    protected FrameLayout _selectionView;
    protected FrameLayout _trendingButton;
    protected ImageView _trendingButtonImage;
    protected ab a;
    protected com.kik.android.a b;
    protected ad c;
    private Context d;
    private g e;
    private kik.android.chat.fragment.KikChatFragment.d f;
    private kik.android.gifs.a.b g;
    private SharedPreferences h;
    private EnumMap i;
    private bn j;
    private b k;

    public GifWidget()
    {
        k = new bo(this);
    }

    static g a(GifWidget gifwidget)
    {
        return gifwidget.e;
    }

    private void a()
    {
        boolean flag1 = true;
        if (f != null && d != null && b != null)
        {
            com.kik.android.a.f f1 = b.b("GIF Tray Opened");
            boolean flag;
            if (!f.c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = f1.a("Is Maximized", flag);
            if (d.getResources().getConfiguration().orientation == 2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            f1.a("Is Landscape", flag).b();
        }
    }

    static void a(GifWidget gifwidget, String s, int l, String s1)
    {
        boolean flag1 = true;
        if (gifwidget.f != null && gifwidget.d != null && s != null && gifwidget.b != null)
        {
            com.kik.android.a.f f1 = gifwidget.b.b("GIF Sent");
            boolean flag;
            if (!gifwidget.f.c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = f1.a("Is Maximized", flag);
            if (gifwidget.d.getResources().getConfiguration().orientation == 2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            f1.a("Is Landscape", flag).a("Search Query", s).a("Index", l).a("ID", s1).b();
        }
        if (gifwidget.g != null)
        {
            gifwidget.g.a(s1, s, l);
        }
    }

    static void a(GifWidget gifwidget, boolean flag)
    {
        if (flag)
        {
            gifwidget.b(new bs(gifwidget));
            return;
        } else
        {
            gifwidget._gifsCantLoad.setVisibility(4);
            return;
        }
    }

    private void a(bn bn1)
    {
        j = bn1;
        if (bn1 != null && f != null)
        {
            f.a(bn1);
        }
    }

    protected final void a(String s, String s1)
    {
        Toast.makeText(d, s1, 1).show();
    }

    public final void a(g g1)
    {
        e = g1;
        a();
    }

    public final void a(kik.android.chat.fragment.KikChatFragment.d d1)
    {
        f = d1;
        if (i == null)
        {
            return;
        }
        d1 = (GifWidgetFragment)i.get(kik.android.widget.bn.c);
        if (d1 != null)
        {
            d1.a(f);
        }
        a(j);
    }

    public final void a(kik.android.chat.fragment.KikChatFragment.e e1)
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (e1.equals(kik.android.chat.fragment.KikChatFragment.e.d))
        {
            for (e1 = i.values().iterator(); e1.hasNext(); ((GifWidgetFragment)e1.next()).d()) { }
            W();
            return;
        }
        if (!e1.equals(kik.android.chat.fragment.KikChatFragment.e.e))
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = i.values().iterator();
        while (e1.hasNext()) 
        {
            ((GifWidgetFragment)e1.next()).c();
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (e1.equals(kik.android.chat.fragment.KikChatFragment.e.a))
        {
            e1 = i.values().iterator();
            while (e1.hasNext()) 
            {
                ((GifWidgetFragment)e1.next()).b();
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = getActivity();
        V().a(this);
        g = kik.android.gifs.a.c.a(d.getApplicationContext());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(0x7f03004e, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        h = d.getSharedPreferences("kik.gifs", 0);
        i = new EnumMap(kik/android/widget/bn);
        viewgroup = kik.android.widget.bn.c;
        a(viewgroup);
        bundle = getChildFragmentManager().beginTransaction();
        Object obj = (GifWidgetFragment)i.get(viewgroup);
        if (obj == null)
        {
            static final class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[bn.values().length];
                    try
                    {
                        a[kik.android.widget.bn.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror) { }
                }
            }

            obj = kik.android.widget._cls1.a;
            viewgroup.ordinal();
            obj = new GifSearchFragment();
            ((GifWidgetFragment) (obj)).a(k);
            ((GifWidgetFragment) (obj)).a(f);
            i.put(viewgroup, obj);
            bundle.replace(0x7f0e011e, ((android.support.v4.app.Fragment) (obj))).commit();
        } else
        {
            bundle.show(((android.support.v4.app.Fragment) (obj))).commit();
        }
        a();
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (g != null)
        {
            g.b();
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        _previewImage.b();
        _previewImage.f();
        i.clear();
        i = null;
    }
}
