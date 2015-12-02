// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.nineoldandroids.a.k;
import com.qihoo.security.adv.AdvDataManager;
import com.qihoo.security.adv.d;
import com.qihoo.security.app.BaseSimpleActivity;
import com.qihoo.security.floatview.ui.FloatViewWndmillView;
import com.qihoo.security.gamebooster.draglist.DragLayerListView;
import com.qihoo.security.gamebooster.draglist.DragListAdapter;
import com.qihoo.security.locale.widget.AppLabelLocaleTextView;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.result.AdvData;
import com.qihoo.security.widget.ImageView.FlashRemoteImageView;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import com.qihoo.utils.notice.a;
import com.qihoo.utils.notice.c;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.share.SharedPref;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.security.gamebooster:
//            h, LocalGamePkg, g, b, 
//            GameRecommendListActivity, AddGamesActivity

public class GameBoosterActivity extends BaseSimpleActivity
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AbsListView.OnScrollListener, DragListAdapter, com.qihoo.security.gamebooster.h
{
    public static class a extends d
    {

        public void a(n n1)
        {
            super.a(n1);
        }

        public a()
        {
            a = 9;
        }
    }

    public static class b extends d
    {

        public b()
        {
            a = 10;
        }
    }

    private class c extends BaseAdapter
    {

        final GameBoosterActivity a;

        private n a(View view)
        {
            n n1 = new n();
            n1.a = view;
            com.qihoo.security.gamebooster.n.b(n1, view.findViewById(0x7f0b0109));
            com.qihoo.security.gamebooster.n.a(n1, (FlashRemoteImageView)com.qihoo.security.gamebooster.n.a(n1).findViewById(0x7f0b0049));
            com.qihoo.security.gamebooster.n.a(n1, (AppLabelLocaleTextView)com.qihoo.security.gamebooster.n.a(n1).findViewById(0x7f0b0136));
            com.qihoo.security.gamebooster.n.c(n1, com.qihoo.security.gamebooster.n.a(n1).findViewById(0x7f0b0084));
            com.qihoo.security.gamebooster.n.d(n1, view.findViewById(0x7f0b010a));
            com.qihoo.security.gamebooster.n.b(n1, (FlashRemoteImageView)com.qihoo.security.gamebooster.n.b(n1).findViewById(0x7f0b0049));
            com.qihoo.security.gamebooster.n.b(n1, (AppLabelLocaleTextView)com.qihoo.security.gamebooster.n.b(n1).findViewById(0x7f0b0136));
            n.e(n1, com.qihoo.security.gamebooster.n.b(n1).findViewById(0x7f0b0084));
            com.qihoo.security.gamebooster.n.f(n1, view.findViewById(0x7f0b010b));
            com.qihoo.security.gamebooster.n.c(n1, (FlashRemoteImageView)com.qihoo.security.gamebooster.n.c(n1).findViewById(0x7f0b0049));
            com.qihoo.security.gamebooster.n.c(n1, (AppLabelLocaleTextView)com.qihoo.security.gamebooster.n.c(n1).findViewById(0x7f0b0136));
            n.g(n1, com.qihoo.security.gamebooster.n.c(n1).findViewById(0x7f0b0084));
            n.h(n1, view.findViewById(0x7f0b010c));
            com.qihoo.security.gamebooster.n.d(n1, (FlashRemoteImageView)com.qihoo.security.gamebooster.n.d(n1).findViewById(0x7f0b0049));
            com.qihoo.security.gamebooster.n.d(n1, (AppLabelLocaleTextView)com.qihoo.security.gamebooster.n.d(n1).findViewById(0x7f0b0136));
            com.qihoo.security.gamebooster.n.i(n1, com.qihoo.security.gamebooster.n.d(n1).findViewById(0x7f0b0084));
            com.qihoo.security.gamebooster.n.a(n1).setOnLongClickListener(a);
            com.qihoo.security.gamebooster.n.b(n1).setOnLongClickListener(a);
            com.qihoo.security.gamebooster.n.c(n1).setOnLongClickListener(a);
            com.qihoo.security.gamebooster.n.d(n1).setOnLongClickListener(a);
            com.qihoo.security.gamebooster.n.a(n1).setOnClickListener(a);
            com.qihoo.security.gamebooster.n.b(n1).setOnClickListener(a);
            com.qihoo.security.gamebooster.n.c(n1).setOnClickListener(a);
            com.qihoo.security.gamebooster.n.d(n1).setOnClickListener(a);
            return n1;
        }

        private void a(int i1, View view)
        {
            a(i1).a((n)view.getTag());
        }

        public d a(int i1)
        {
            return (d)com.qihoo.security.gamebooster.GameBoosterActivity.d(a).get(i1);
        }

        public int getCount()
        {
            return com.qihoo.security.gamebooster.GameBoosterActivity.d(a).size();
        }

        public Object getItem(int i1)
        {
            return a(i1);
        }

        public long getItemId(int i1)
        {
            return (long)i1;
        }

        public int getItemViewType(int i1)
        {
            return a(i1).a();
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            viewgroup = null;
            if (view != null) goto _L2; else goto _L1
_L1:
            getItemViewType(i1);
            JVM INSTR tableswitch 0 10: default 68
        //                       0 83
        //                       1 83
        //                       2 83
        //                       3 106
        //                       4 357
        //                       5 129
        //                       6 257
        //                       7 392
        //                       8 409
        //                       9 426
        //                       10 443;
               goto _L3 _L4 _L4 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
            view = null;
_L14:
            view.setTag(viewgroup);
_L2:
            a(i1, view);
            return view;
_L4:
            view = com.qihoo.security.gamebooster.GameBoosterActivity.c(a).inflate(0x7f03004b, null);
            viewgroup = a(view);
            continue; /* Loop/switch isn't completed */
_L5:
            view = com.qihoo.security.gamebooster.GameBoosterActivity.c(a).inflate(0x7f03004c, null);
            viewgroup = a(view);
            continue; /* Loop/switch isn't completed */
_L7:
            view = com.qihoo.security.gamebooster.GameBoosterActivity.c(a).inflate(0x7f03005c, null);
            viewgroup = new n();
            com.qihoo.security.gamebooster.n.a(viewgroup, (RemoteImageView)view.findViewById(0x7f0b0141));
            com.qihoo.security.gamebooster.n.a(viewgroup, (TextView)view.findViewById(0x7f0b0142));
            com.qihoo.security.gamebooster.n.b(viewgroup, (TextView)view.findViewById(0x7f0b0075));
            com.qihoo.security.gamebooster.n.a(viewgroup, (RatingBar)view.findViewById(0x7f0b00ad));
            com.qihoo.security.gamebooster.n.c(viewgroup, (TextView)view.findViewById(0x7f0b0143));
            com.qihoo.security.gamebooster.n.a(viewgroup, view.findViewById(0x7f0b0084));
            viewgroup.a = view.findViewById(0x7f0b0140);
            ((n) (viewgroup)).a.setOnClickListener(a);
            continue; /* Loop/switch isn't completed */
_L8:
            view = com.qihoo.security.gamebooster.GameBoosterActivity.c(a).inflate(0x7f03005d, null);
            viewgroup = new n();
            com.qihoo.security.gamebooster.n.a(viewgroup, (RemoteImageView)view.findViewById(0x7f0b0141));
            com.qihoo.security.gamebooster.n.a(viewgroup, (TextView)view.findViewById(0x7f0b0142));
            com.qihoo.security.gamebooster.n.b(viewgroup, (TextView)view.findViewById(0x7f0b0075));
            com.qihoo.security.gamebooster.n.a(viewgroup, view.findViewById(0x7f0b0084));
            viewgroup.a = view.findViewById(0x7f0b0140);
            ((n) (viewgroup)).a.setOnClickListener(a);
            continue; /* Loop/switch isn't completed */
_L6:
            view = com.qihoo.security.gamebooster.GameBoosterActivity.c(a).inflate(0x7f030061, null);
            viewgroup = new n();
            com.qihoo.security.gamebooster.n.b(viewgroup, (TextView)view);
            continue; /* Loop/switch isn't completed */
_L9:
            view = com.qihoo.security.gamebooster.GameBoosterActivity.c(a).inflate(0x7f03005e, null);
            continue; /* Loop/switch isn't completed */
_L10:
            view = com.qihoo.security.gamebooster.GameBoosterActivity.c(a).inflate(0x7f030060, null);
            continue; /* Loop/switch isn't completed */
_L11:
            view = com.qihoo.security.gamebooster.GameBoosterActivity.c(a).inflate(0x7f03005f, null);
            continue; /* Loop/switch isn't completed */
_L12:
            view = new View(a);
            view.setMinimumHeight(1);
            if (true) goto _L14; else goto _L13
_L13:
        }

        public int getViewTypeCount()
        {
            return 12;
        }

        private c()
        {
            a = GameBoosterActivity.this;
            super();
        }

    }

    public static class d
    {

        int a;
        public n b;

        public int a()
        {
            return a;
        }

        public int a(String s1)
        {
            return -1;
        }

        public void a(n n1)
        {
            b = n1;
        }

        public List b()
        {
            return null;
        }

        public d()
        {
            a = -1;
        }
    }

    public static class e extends d
    {

        public Object c;
        public Object d;
        public Object e;
        public Object f;
        private final GameBoosterActivity g;

        private void c()
        {
            if (c instanceof AdvData)
            {
                com.qihoo.security.gamebooster.GameBoosterActivity.a(g, (AdvData)c, com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderAllLikeData);
            }
            if (d instanceof AdvData)
            {
                com.qihoo.security.gamebooster.GameBoosterActivity.a(g, (AdvData)d, com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderAllLikeData);
            }
            if (e instanceof AdvData)
            {
                com.qihoo.security.gamebooster.GameBoosterActivity.a(g, (AdvData)e, com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderAllLikeData);
            }
            if (f instanceof AdvData)
            {
                com.qihoo.security.gamebooster.GameBoosterActivity.a(g, (AdvData)f, com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderAllLikeData);
            }
        }

        public int a(String s1)
        {
            if (c instanceof LocalGamePkg)
            {
                LocalGamePkg localgamepkg = (LocalGamePkg)c;
                if (c != null && s1.equals(localgamepkg.getPkgName()))
                {
                    return 0;
                }
            }
            return super.a(s1);
        }

        public void a(n n1)
        {
            super.a(n1);
            com.qihoo.security.gamebooster.n.b(n1).setVisibility(8);
            com.qihoo.security.gamebooster.n.c(n1).setVisibility(8);
            com.qihoo.security.gamebooster.n.d(n1).setVisibility(8);
            com.qihoo.security.gamebooster.n.a(n1).setVisibility(0);
            com.qihoo.security.gamebooster.n.a(n1).setTag(c);
            com.qihoo.security.gamebooster.GameBoosterActivity.a(n.e(n1), c);
            com.qihoo.security.gamebooster.GameBoosterActivity.a(com.qihoo.security.gamebooster.n.f(n1), c);
            a(c, n.g(n1));
            c();
            if (c instanceof LocalGamePkg)
            {
                n1.a.setBackgroundColor(0);
                return;
            } else
            {
                n1.a.setBackgroundColor(Color.rgb(250, 250, 250));
                return;
            }
        }

        protected void a(Object obj, View view)
        {
            if (obj instanceof AdvData)
            {
                obj = (AdvData)obj;
                if (((AdvData) (obj)).type == 0 && ((AdvData) (obj)).nativeAd != null)
                {
                    ((AdvData) (obj)).nativeAd.a(view);
                    com.qihoo.security.gamebooster.GameBoosterActivity.a(g, ((AdvData) (obj)).nativeAd, view);
                }
            }
        }

        public List b()
        {
            ArrayList arraylist = new ArrayList();
            if (c instanceof AdvData)
            {
                arraylist.add((AdvData)c);
            }
            if (d instanceof AdvData)
            {
                arraylist.add((AdvData)d);
            }
            if (e instanceof AdvData)
            {
                arraylist.add((AdvData)e);
            }
            if (f instanceof AdvData)
            {
                arraylist.add((AdvData)f);
            }
            return arraylist;
        }

        public e(GameBoosterActivity gameboosteractivity)
        {
            g = gameboosteractivity;
            a = 0;
        }
    }

    public static class f extends e
    {

        public int a(String s1)
        {
            if (d instanceof LocalGamePkg)
            {
                LocalGamePkg localgamepkg = (LocalGamePkg)d;
                if (d != null && s1.equals(localgamepkg.getPkgName()))
                {
                    return 1;
                }
            }
            return super.a(s1);
        }

        public void a(n n1)
        {
            super.a(n1);
            com.qihoo.security.gamebooster.n.b(n1).setVisibility(0);
            com.qihoo.security.gamebooster.n.b(n1).setTag(d);
            com.qihoo.security.gamebooster.GameBoosterActivity.a(n.h(n1), d);
            com.qihoo.security.gamebooster.GameBoosterActivity.a(com.qihoo.security.gamebooster.n.i(n1), d);
            a(d, n.j(n1));
        }

        public f(GameBoosterActivity gameboosteractivity)
        {
            super(gameboosteractivity);
            a = 1;
        }
    }

    public static class g extends f
    {

        public int a(String s1)
        {
            if (e instanceof LocalGamePkg)
            {
                LocalGamePkg localgamepkg = (LocalGamePkg)e;
                if (e != null && s1.equals(localgamepkg.getPkgName()))
                {
                    return 2;
                }
            }
            return super.a(s1);
        }

        public void a(n n1)
        {
            super.a(n1);
            com.qihoo.security.gamebooster.n.c(n1).setVisibility(0);
            com.qihoo.security.gamebooster.n.c(n1).setTag(e);
            com.qihoo.security.gamebooster.GameBoosterActivity.a(com.qihoo.security.gamebooster.n.k(n1), e);
            com.qihoo.security.gamebooster.GameBoosterActivity.a(n.l(n1), e);
            a(e, n.m(n1));
        }

        public g(GameBoosterActivity gameboosteractivity)
        {
            super(gameboosteractivity);
            a = 2;
        }
    }

    public static class h extends g
    {

        public int a(String s1)
        {
            if (f instanceof LocalGamePkg)
            {
                LocalGamePkg localgamepkg = (LocalGamePkg)f;
                if (f != null && s1.equals(localgamepkg.getPkgName()))
                {
                    return 3;
                }
            }
            return super.a(s1);
        }

        public void a(n n1)
        {
            super.a(n1);
            com.qihoo.security.gamebooster.n.d(n1).setVisibility(0);
            com.qihoo.security.gamebooster.n.d(n1).setTag(f);
            com.qihoo.security.gamebooster.GameBoosterActivity.a(n.n(n1), f);
            com.qihoo.security.gamebooster.GameBoosterActivity.a(n.o(n1), f);
            a(f, n.p(n1));
        }

        public h(GameBoosterActivity gameboosteractivity)
        {
            super(gameboosteractivity);
            a = 3;
        }
    }

    private static class i extends d
    {

        public i()
        {
            a = 7;
        }
    }

    static class j extends k
    {

        AdvData c;
        private final String f;

        public void a(n n1)
        {
            super.a(n1);
            if (n1 != null)
            {
                String s1 = c.btnName;
                float f1 = c.starLevel;
                if (com.qihoo.security.gamebooster.n.r(n1) != null)
                {
                    com.qihoo.security.gamebooster.n.r(n1).setText(s1);
                }
                if (com.qihoo.security.gamebooster.n.s(n1) != null)
                {
                    if (f1 != 0.0F)
                    {
                        com.qihoo.security.gamebooster.n.s(n1).setRating(f1);
                        return;
                    } else
                    {
                        com.qihoo.security.gamebooster.n.s(n1).setRating(5F);
                        return;
                    }
                }
            }
        }

        protected String c()
        {
            return f;
        }

        public j(AdvData advdata, String s1, GameBoosterActivity gameboosteractivity)
        {
            super(advdata, gameboosteractivity);
            a = 5;
            f = s1;
            c = advdata;
        }
    }

    static class k extends d
    {

        AdvData d;
        GameBoosterActivity e;

        public void a(n n1)
        {
            super.a(n1);
            if (n1 == null)
            {
                return;
            }
            String s1 = d.title;
            String s2 = d.icon;
            String s3 = c();
            if (n.t(n1) != null)
            {
                n.t(n1).setText(s3);
            }
            if (com.qihoo.security.gamebooster.n.q(n1) != null)
            {
                com.qihoo.security.gamebooster.n.q(n1).setText(s1);
            }
            if (n.u(n1) != null && s2 != null)
            {
                n.u(n1).a(s2, 0x7f02015d);
            }
            if (d.type == 0 && n.v(n1) != null && d.nativeAd != null)
            {
                d.nativeAd.a(n.v(n1));
                com.qihoo.security.gamebooster.GameBoosterActivity.a(e, d.nativeAd, n.v(n1));
            }
            n1.a.setTag(d);
            com.qihoo.security.gamebooster.GameBoosterActivity.a(e, d, com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderHotAdvData);
        }

        public List b()
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(d);
            return arraylist;
        }

        protected String c()
        {
            if (d == null)
            {
                return "";
            } else
            {
                return d.btnDesc;
            }
        }

        public k(AdvData advdata, GameBoosterActivity gameboosteractivity)
        {
            a = 6;
            e = gameboosteractivity;
            d = advdata;
        }
    }

    public static class l extends d
    {

        private final String c;

        public void a(n n1)
        {
            super.a(n1);
            if (n1 != null && com.qihoo.security.gamebooster.n.q(n1) != null)
            {
                com.qihoo.security.gamebooster.n.q(n1).setText(c);
            }
        }

        public l(String s1)
        {
            a = 4;
            c = s1;
        }
    }

    public static class m extends d
    {

        public void a(n n1)
        {
            super.a(n1);
        }

        public m()
        {
            a = 8;
        }
    }

    private static class n
    {

        public View a;
        private View b;
        private AppLabelLocaleTextView c;
        private FlashRemoteImageView d;
        private View e;
        private View f;
        private AppLabelLocaleTextView g;
        private FlashRemoteImageView h;
        private View i;
        private View j;
        private AppLabelLocaleTextView k;
        private FlashRemoteImageView l;
        private View m;
        private View n;
        private AppLabelLocaleTextView o;
        private FlashRemoteImageView p;
        private View q;
        private RemoteImageView r;
        private TextView s;
        private TextView t;
        private RatingBar u;
        private TextView v;
        private View w;

        static View a(n n1)
        {
            return n1.b;
        }

        static View a(n n1, View view)
        {
            n1.w = view;
            return view;
        }

        static RatingBar a(n n1, RatingBar ratingbar)
        {
            n1.u = ratingbar;
            return ratingbar;
        }

        static TextView a(n n1, TextView textview)
        {
            n1.t = textview;
            return textview;
        }

        static AppLabelLocaleTextView a(n n1, AppLabelLocaleTextView applabellocaletextview)
        {
            n1.c = applabellocaletextview;
            return applabellocaletextview;
        }

        static FlashRemoteImageView a(n n1, FlashRemoteImageView flashremoteimageview)
        {
            n1.d = flashremoteimageview;
            return flashremoteimageview;
        }

        static RemoteImageView a(n n1, RemoteImageView remoteimageview)
        {
            n1.r = remoteimageview;
            return remoteimageview;
        }

        static View b(n n1)
        {
            return n1.f;
        }

        static View b(n n1, View view)
        {
            n1.b = view;
            return view;
        }

        static TextView b(n n1, TextView textview)
        {
            n1.s = textview;
            return textview;
        }

        static AppLabelLocaleTextView b(n n1, AppLabelLocaleTextView applabellocaletextview)
        {
            n1.g = applabellocaletextview;
            return applabellocaletextview;
        }

        static FlashRemoteImageView b(n n1, FlashRemoteImageView flashremoteimageview)
        {
            n1.h = flashremoteimageview;
            return flashremoteimageview;
        }

        static View c(n n1)
        {
            return n1.j;
        }

        static View c(n n1, View view)
        {
            n1.e = view;
            return view;
        }

        static TextView c(n n1, TextView textview)
        {
            n1.v = textview;
            return textview;
        }

        static AppLabelLocaleTextView c(n n1, AppLabelLocaleTextView applabellocaletextview)
        {
            n1.k = applabellocaletextview;
            return applabellocaletextview;
        }

        static FlashRemoteImageView c(n n1, FlashRemoteImageView flashremoteimageview)
        {
            n1.l = flashremoteimageview;
            return flashremoteimageview;
        }

        static View d(n n1)
        {
            return n1.n;
        }

        static View d(n n1, View view)
        {
            n1.f = view;
            return view;
        }

        static AppLabelLocaleTextView d(n n1, AppLabelLocaleTextView applabellocaletextview)
        {
            n1.o = applabellocaletextview;
            return applabellocaletextview;
        }

        static FlashRemoteImageView d(n n1, FlashRemoteImageView flashremoteimageview)
        {
            n1.p = flashremoteimageview;
            return flashremoteimageview;
        }

        static View e(n n1, View view)
        {
            n1.i = view;
            return view;
        }

        static AppLabelLocaleTextView e(n n1)
        {
            return n1.c;
        }

        static View f(n n1, View view)
        {
            n1.j = view;
            return view;
        }

        static FlashRemoteImageView f(n n1)
        {
            return n1.d;
        }

        static View g(n n1)
        {
            return n1.e;
        }

        static View g(n n1, View view)
        {
            n1.m = view;
            return view;
        }

        static View h(n n1, View view)
        {
            n1.n = view;
            return view;
        }

        static AppLabelLocaleTextView h(n n1)
        {
            return n1.g;
        }

        static View i(n n1, View view)
        {
            n1.q = view;
            return view;
        }

        static FlashRemoteImageView i(n n1)
        {
            return n1.h;
        }

        static View j(n n1)
        {
            return n1.i;
        }

        static AppLabelLocaleTextView k(n n1)
        {
            return n1.k;
        }

        static FlashRemoteImageView l(n n1)
        {
            return n1.l;
        }

        static View m(n n1)
        {
            return n1.m;
        }

        static AppLabelLocaleTextView n(n n1)
        {
            return n1.o;
        }

        static FlashRemoteImageView o(n n1)
        {
            return n1.p;
        }

        static View p(n n1)
        {
            return n1.q;
        }

        static TextView q(n n1)
        {
            return n1.s;
        }

        static TextView r(n n1)
        {
            return n1.v;
        }

        static RatingBar s(n n1)
        {
            return n1.u;
        }

        static TextView t(n n1)
        {
            return n1.t;
        }

        static RemoteImageView u(n n1)
        {
            return n1.r;
        }

        static View v(n n1)
        {
            return n1.w;
        }

        private n()
        {
        }

    }


    private View A;
    private int B;
    private final BroadcastReceiver C = new BroadcastReceiver() {

        final GameBoosterActivity a;

        public void onReceive(Context context, Intent intent)
        {
            com.qihoo.security.gamebooster.b.a().a(a);
        }

            
            {
                a = GameBoosterActivity.this;
                super();
            }
    };
    private LocaleTextView D;
    List a;
    private com.qihoo.security.gamebooster.g b;
    private LayoutInflater c;
    private DragLayerListView d;
    private Handler e;
    private FloatViewWndmillView f;
    private View g;
    private View h;
    private final List i = new ArrayList();
    private c j;
    private PackageManager k;
    private int l;
    private int m;
    private String n;
    private final Map o = new HashMap();
    private final Map p = new HashMap();
    private final Map q = new HashMap();
    private final AtomicBoolean r = new AtomicBoolean(true);
    private View s;
    private boolean t;
    private List u;
    private List v;
    private List w;
    private List x;
    private final List y = new ArrayList();
    private com.qihoo.security.adv.a.a z;

    public GameBoosterActivity()
    {
        c = null;
        l = -1;
        m = -1;
        t = false;
    }

    static int a(GameBoosterActivity gameboosteractivity, int i1)
    {
        gameboosteractivity.l = i1;
        return i1;
    }

    static View a(GameBoosterActivity gameboosteractivity)
    {
        return gameboosteractivity.g;
    }

    static String a(GameBoosterActivity gameboosteractivity, String s1)
    {
        gameboosteractivity.n = s1;
        return s1;
    }

    private void a(Intent intent)
    {
        com.qihoo.utils.notice.a.a().b(4099);
        if (intent != null)
        {
            com.qihoo.utils.notice.c.a(this, intent);
        }
    }

    private void a(View view, AdvData advdata)
    {
        if (advdata.nativeAd != null) goto _L2; else goto _L1
_L1:
        if (!com.qihoo360.mobilesafe.b.s.b(this)) goto _L4; else goto _L3
_L3:
        com.qihoo.security.ui.result.a.a().a(advdata);
_L6:
        return;
_L4:
        com.qihoo360.mobilesafe.b.q.a().a(0x7f0c00c4);
        return;
_L2:
        view = view.findViewById(0x7f0b0084);
        if ((View)o.get(advdata.nativeAd) != view)
        {
            a(advdata.nativeAd, view);
        }
        if (view != null)
        {
            view.performClick();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(NativeAd nativead, View view)
    {
        o.put(nativead, view);
    }

    static void a(GameBoosterActivity gameboosteractivity, NativeAd nativead, View view)
    {
        gameboosteractivity.a(nativead, view);
    }

    static void a(GameBoosterActivity gameboosteractivity, AdvData advdata, com.qihoo.security.adv.AdvDataManager.AdvType advtype)
    {
        gameboosteractivity.a(advdata, advtype);
    }

    static void a(GameBoosterActivity gameboosteractivity, String s1, String s2)
    {
        gameboosteractivity.a(s1, s2);
    }

    static void a(AppLabelLocaleTextView applabellocaletextview, Object obj)
    {
        b(applabellocaletextview, obj);
    }

    private void a(AdvData advdata, com.qihoo.security.adv.AdvDataManager.AdvType advtype)
    {
        if (advdata == null)
        {
            return;
        }
        String s1;
        if (advdata.type == 0)
        {
            s1 = advdata.title;
        } else
        {
            s1 = advdata.adid;
        }
        if (advtype == com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderAllLikeData)
        {
            advtype = p;
        } else
        {
            advtype = q;
        }
        advtype.put(s1, advdata);
    }

    private void a(FlashRemoteImageView flashremoteimageview)
    {
        int i1 = getResources().getDimensionPixelOffset(0x7f09004e);
        flashremoteimageview.setShadowWidth(i1);
        flashremoteimageview.setShadowHeight(i1);
        flashremoteimageview.setShadowColor(getResources().getColor(0x7f080056));
        flashremoteimageview.setBlurWidth(getResources().getDimensionPixelOffset(0x7f09004f));
        flashremoteimageview.a(100L);
    }

    static void a(RemoteImageView remoteimageview, Object obj)
    {
        b(remoteimageview, obj);
    }

    private void a(String s1)
    {
        if (!SharedPref.b(getApplicationContext(), "game_booster_show_toast", true) || com.qihoo360.mobilesafe.b.i.a())
        {
            return;
        } else
        {
            com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a().a(new com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a() {

                final GameBoosterActivity a;

                public void a(String s2, String s3)
                {
                    s2 = com.qihoo.security.locale.d.a().a(0x7f0c0084, new Object[] {
                        s2, com.qihoo.security.gamebooster.b.h()
                    });
                    com.qihoo.security.gamebooster.GameBoosterActivity.a(a, s2, s3);
                }

            
            {
                a = GameBoosterActivity.this;
                super();
            }
            }, "game-booster", s1, "");
            return;
        }
    }

    private void a(String s1, long l1)
    {
        s1 = new Runnable(s1) {

            final String a;
            final GameBoosterActivity b;

            public void run()
            {
                if (!TextUtils.isEmpty(a) && GameBoosterActivity.e(b) != null)
                {
                    int j1 = com.qihoo.security.gamebooster.GameBoosterActivity.f(b).getCount();
                    int i1 = 0;
                    while (i1 < j1) 
                    {
                        d d1 = com.qihoo.security.gamebooster.GameBoosterActivity.f(b).a(i1);
                        com.qihoo.security.gamebooster.GameBoosterActivity.a(b, d1.a(a));
                        if (GameBoosterActivity.g(b) >= 0)
                        {
                            GameBoosterActivity.e(b).a(i1);
                            com.qihoo.security.gamebooster.GameBoosterActivity.b(b, i1);
                            com.qihoo.security.gamebooster.GameBoosterActivity.a(b, a);
                            return;
                        }
                        i1++;
                    }
                }
            }

            
            {
                b = GameBoosterActivity.this;
                a = s1;
                super();
            }
        };
        e.postDelayed(s1, l1);
    }

    private void a(String s1, String s2)
    {
        e.postDelayed(new Runnable(s1, s2) {

            final String a;
            final String b;
            final GameBoosterActivity c;

            public void run()
            {
                com.qihoo360.mobilesafe.b.q.a().a(Html.fromHtml(a));
                com.qihoo.security.support.b.a(11112, b, null);
            }

            
            {
                c = GameBoosterActivity.this;
                a = s1;
                b = s2;
                super();
            }
        }, 2000L);
    }

    private void a(List list, List list1, String s1)
    {
        int i1 = 0;
        if (list != null && list.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        int j1;
        int k1;
        if (!TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            list1.add(new i());
            list1.add(new l(s1));
            list1.add(new m());
        }
        k1 = list.size() / 4;
        j1 = list.size();
        for (; i1 < k1; i1++)
        {
            s1 = new h(this);
            int l1 = i1 * 4;
            s1.c = list.get(l1);
            s1.d = list.get(l1 + 1);
            s1.e = list.get(l1 + 2);
            s1.f = list.get(l1 + 3);
            list1.add(s1);
        }

        i1 = k1 * 4;
        j1 % 4;
        JVM INSTR tableswitch 0 3: default 232
    //                   0 232
    //                   1 252
    //                   2 284
    //                   3 330;
           goto _L3 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_330;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L8:
        if (flag)
        {
            list1.add(new a());
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
        s1 = new e(this);
        s1.c = list.get(i1);
        list1.add(s1);
          goto _L8
_L5:
        s1 = new f(this);
        s1.c = list.get(i1);
        s1.d = list.get(i1 + 1);
        list1.add(s1);
          goto _L8
        s1 = new g(this);
        s1.c = list.get(i1);
        s1.d = list.get(i1 + 1);
        s1.e = list.get(i1 + 2);
        list1.add(s1);
          goto _L8
    }

    static int b(GameBoosterActivity gameboosteractivity, int i1)
    {
        gameboosteractivity.m = i1;
        return i1;
    }

    static void b(GameBoosterActivity gameboosteractivity)
    {
        gameboosteractivity.g();
    }

    private static void b(AppLabelLocaleTextView applabellocaletextview, Object obj)
    {
        if (!(obj instanceof LocalGamePkg)) goto _L2; else goto _L1
_L1:
        obj = (LocalGamePkg)obj;
        if (((LocalGamePkg) (obj)).getState() != LocalGamePkg.State.Add) goto _L4; else goto _L3
_L3:
        applabellocaletextview.setLocalText(0x7f0c0083);
_L6:
        return;
_L4:
        applabellocaletextview.setPackageName(((LocalGamePkg) (obj)).getPkgName());
        return;
_L2:
        if (obj instanceof AdvData)
        {
            applabellocaletextview.setText(((AdvData)obj).title);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void b(RemoteImageView remoteimageview, Object obj)
    {
        if (!(obj instanceof LocalGamePkg)) goto _L2; else goto _L1
_L1:
        obj = (LocalGamePkg)obj;
        if (obj != LocalGamePkg.ADD) goto _L4; else goto _L3
_L3:
        remoteimageview.setImageResourceInListView(0x7f020085);
_L6:
        return;
_L4:
        remoteimageview.b(((LocalGamePkg) (obj)).getPkgName(), 0x7f020044);
        return;
_L2:
        if (obj instanceof AdvData)
        {
            remoteimageview.a(((AdvData)obj).icon, 0x7f020044);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static LayoutInflater c(GameBoosterActivity gameboosteractivity)
    {
        return gameboosteractivity.c;
    }

    static List d(GameBoosterActivity gameboosteractivity)
    {
        return gameboosteractivity.i;
    }

    static DragLayerListView e(GameBoosterActivity gameboosteractivity)
    {
        return gameboosteractivity.d;
    }

    private void e()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.qihoo.security.gamebooster.LocalGamePackageUpdate");
        registerReceiver(C, intentfilter);
    }

    static c f(GameBoosterActivity gameboosteractivity)
    {
        return gameboosteractivity.j;
    }

    private void f()
    {
        if (b == null || b.c() == null || b.c().size() == 0)
        {
            D.setLocalText(0x7f0c0087);
            return;
        } else
        {
            D.setLocalText(0x7f0c0086);
            return;
        }
    }

    static int g(GameBoosterActivity gameboosteractivity)
    {
        return gameboosteractivity.l;
    }

    private void g()
    {
        findViewById(0x7f0b013a).setOnClickListener(this);
    }

    static View h(GameBoosterActivity gameboosteractivity)
    {
        return gameboosteractivity.h;
    }

    private void h()
    {
        b();
        e.postDelayed(new Runnable() {

            final GameBoosterActivity a;

            public void run()
            {
                a.c();
            }

            
            {
                a = GameBoosterActivity.this;
                super();
            }
        }, 2500L);
        Object obj1 = findViewById(0x7f0b004a);
        Object obj = findViewById(0x7f0b013b);
        Object obj2 = (LocaleTextView)findViewById(0x7f0b013c);
        D = (LocaleTextView)findViewById(0x7f0b013d);
        ((LocaleTextView) (obj2)).setLocalText(String.format(getResources().getString(0x7f0c0085), new Object[] {
            com.qihoo.security.gamebooster.b.h()
        }));
        com.nineoldandroids.b.a.a(((View) (obj1)), 0.0F);
        com.nineoldandroids.b.a.a(((View) (obj)), 0.0F);
        int i1 = com.qihoo360.mobilesafe.b.r.a(this, 16F);
        obj2 = new com.nineoldandroids.a.c();
        com.nineoldandroids.a.k k1 = com.nineoldandroids.a.k.a(obj1, "alpha", new float[] {
            0.0F, 1.0F
        });
        k1.c(200L);
        com.nineoldandroids.a.k k2 = com.nineoldandroids.a.k.a(obj1, "translationX", new float[] {
            200F, 0.0F
        });
        k2.c(200L);
        ((com.nineoldandroids.a.c) (obj2)).a(k1).a(k2);
        ((com.nineoldandroids.a.c) (obj2)).a(800L);
        ((com.nineoldandroids.a.c) (obj2)).a();
        obj2 = new com.nineoldandroids.a.c();
        k1 = com.nineoldandroids.a.k.a(obj1, "alpha", new float[] {
            1.0F, 0.0F
        });
        k1.c(200L);
        obj1 = com.nineoldandroids.a.k.a(obj1, "translationY", new float[] {
            0.0F, (float)(-i1)
        });
        ((com.nineoldandroids.a.k) (obj1)).c(200L);
        ((com.nineoldandroids.a.c) (obj2)).a(k1).a(((com.nineoldandroids.a.a) (obj1)));
        ((com.nineoldandroids.a.c) (obj2)).a(3800L);
        ((com.nineoldandroids.a.c) (obj2)).a();
        obj1 = new com.nineoldandroids.a.c();
        obj2 = com.nineoldandroids.a.k.a(obj, "alpha", new float[] {
            0.0F, 1.0F
        });
        ((com.nineoldandroids.a.k) (obj2)).c(200L);
        obj = com.nineoldandroids.a.k.a(obj, "translationY", new float[] {
            (float)i1, 0.0F
        });
        ((com.nineoldandroids.a.k) (obj)).c(200L);
        ((com.nineoldandroids.a.c) (obj1)).a(((com.nineoldandroids.a.a) (obj2))).a(((com.nineoldandroids.a.a) (obj)));
        ((com.nineoldandroids.a.c) (obj1)).a(4100L);
        ((com.nineoldandroids.a.c) (obj1)).a();
    }

    private void i()
    {
        boolean flag1 = true;
        d d1;
        List list;
        ArrayList arraylist;
        Iterator iterator;
        ArrayList arraylist1;
        boolean flag;
        if (B > 0 && B < j.getCount())
        {
            d1 = j.a(B);
        } else
        {
            d1 = null;
        }
        if (d1 != null)
        {
            list = d1.b();
        } else
        {
            list = null;
        }
        if ((d1 instanceof e) && list != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iterator = p.entrySet().iterator();
        arraylist = new ArrayList();
        for (; iterator.hasNext(); arraylist.add(((java.util.Map.Entry)iterator.next()).getValue())) { }
        if (arraylist.size() > 0)
        {
            if (flag)
            {
                arraylist.removeAll(list);
            }
            com.qihoo.security.adv.a.c.a(com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderAllLikeData, arraylist);
        }
        p.clear();
        iterator = q.entrySet().iterator();
        arraylist1 = new ArrayList();
        for (; iterator.hasNext(); arraylist1.add(((java.util.Map.Entry)iterator.next()).getValue())) { }
        if ((d1 instanceof k) && list != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (arraylist1.size() > 0)
        {
            if (flag)
            {
                arraylist1.removeAll(list);
            }
            com.qihoo.security.adv.a.c.a(com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderHotAdvData, arraylist1);
        }
        q.clear();
        arraylist.addAll(arraylist1);
        if (arraylist.size() > 0)
        {
            AdvDataManager.a().a(com.qihoo.security.adv.AdvDataManager.AdvReportType.Show, arraylist);
            arraylist.clear();
            arraylist1.clear();
        }
        if (list != null)
        {
            Log.d("GameBoosterActivity", "\u65E0\u6392\u9664\u4E0A\u62A5");
            list.clear();
        }
    }

    private List j()
    {
        Object obj;
        if (b != null)
        {
            Object obj1 = b.c();
            if (obj1 == null || ((List) (obj1)).size() == 0)
            {
                return null;
            }
            obj = obj1;
            if (((List) (obj1)).size() >= 10)
            {
                obj = ((List) (obj1)).subList(0, 10);
            }
            obj1 = new ArrayList();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((List) (obj1)).add(((LocalGamePkg)((Iterator) (obj)).next()).getPkgName())) { }
            obj = obj1;
        } else
        {
            obj = null;
        }
        return ((List) (obj));
    }

    public void a()
    {
        l l1;
        ArrayList arraylist1;
        String s2;
        Iterator iterator;
        i.clear();
        f();
        if (b != null && b.c() != null)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.addAll(b.c());
            arraylist.add(LocalGamePkg.ADD);
            a(((List) (arraylist)), i, ((String) (null)));
        }
        String s1 = getString(0x7f0c00a3);
        a(y, i, s1);
        l1 = new l(getString(0x7f0c00a6));
        arraylist1 = new ArrayList();
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        s2 = getString(0x7f0c0093);
        iterator = a.iterator();
_L2:
        Object obj;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_253;
            }
            obj = (AdvData)iterator.next();
        } while (obj == null);
        switch (((AdvData) (obj)).tp)
        {
        case 12: // '\f'
        case 13: // '\r'
        default:
            obj = new k(((AdvData) (obj)), this);
            break;

        case 11: // '\013'
            break; /* Loop/switch isn't completed */

        case 14: // '\016'
            break MISSING_BLOCK_LABEL_240;
        }
_L3:
        arraylist1.add(obj);
        if (true) goto _L2; else goto _L1
_L1:
        obj = new j(((AdvData) (obj)), s2, this);
          goto _L3
        obj = new k(((AdvData) (obj)), this);
          goto _L3
        if (arraylist1.size() > 0)
        {
            i.add(l1);
            i.addAll(arraylist1);
        }
        i.add(new b());
        if (d.getListView().getAdapter() == null)
        {
            d.getListView().setAdapter(j);
        }
        d.getListView().setOnScrollListener(this);
        j.notifyDataSetChanged();
        return;
    }

    public void a(LocalGamePkg localgamepkg)
    {
        b.c().remove(localgamepkg);
        b.a().add(localgamepkg);
        a();
        com.qihoo.security.gamebooster.b.a().a(b);
    }

    public void a(com.qihoo.security.gamebooster.draglist.DragListAdapter.DragState dragstate, View view)
    {
_L2:
        return;
        if (view == null || !(view.getTag() instanceof LocalGamePkg)) goto _L2; else goto _L1
_L1:
        view = (LocalGamePkg)view.getTag();
        static class _cls8
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.qihoo.security.adv.AdvDataManager.AdvType.values().length];
                try
                {
                    b[com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderAllLikeData.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderHotAdvData.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[com.qihoo.security.gamebooster.draglist.DragListAdapter.DragState.values().length];
                try
                {
                    a[com.qihoo.security.gamebooster.draglist.DragListAdapter.DragState.StartDrag.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.qihoo.security.gamebooster.draglist.DragListAdapter.DragState.Delete.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.qihoo.security.gamebooster.draglist.DragListAdapter.DragState.UnInstall.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.qihoo.security.gamebooster._cls8.a[dragstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            break;

        case 2: // '\002'
            a(((LocalGamePkg) (view)));
            com.qihoo.security.support.b.a(11107, view.getPkgName(), "0");
            return;

        case 3: // '\003'
            dragstate = new Intent("android.intent.action.DELETE", Uri.parse((new StringBuilder()).append("package:").append(view.getPkgName()).toString()));
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L2; else goto _L3
_L3:
        try
        {
            startActivity(dragstate);
        }
        // Misplaced declaration of an exception variable
        catch (com.qihoo.security.gamebooster.draglist.DragListAdapter.DragState dragstate) { }
        com.qihoo.security.support.b.a(11108, view.getPkgName(), "0");
        return;
    }

    public void a(com.qihoo.security.gamebooster.g g1, Object obj)
    {
        obj = new ArrayList();
        if (g1 == null)
        {
            if (!r.compareAndSet(true, false));
        } else
        {
            List list = g1.c();
            b = g1;
            a();
            if (r.compareAndSet(true, false) && list != null)
            {
                g1 = list.iterator();
                do
                {
                    if (!g1.hasNext())
                    {
                        break;
                    }
                    Object obj1 = (LocalGamePkg)g1.next();
                    if (obj1 != null)
                    {
                        obj1 = ((LocalGamePkg) (obj1)).getPkgName();
                        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                        {
                            ((List) (obj)).add(obj1);
                        }
                    }
                } while (true);
            }
            if (t)
            {
                g1 = j();
                if (g1 != null && g1.size() != 0)
                {
                    obj = Long.valueOf(SharedPref.b(this, "last_show_game_boost_folder_time", 0L));
                    if (((Long) (obj)).longValue() == 0L)
                    {
                        com.qihoo.security.support.b.b(11104);
                    } else
                    if (System.currentTimeMillis() - ((Long) (obj)).longValue() >= 0x240c8400L)
                    {
                        com.qihoo.security.support.b.a(11104, String.valueOf(g1.size()), g1.toString());
                    } else
                    {
                        com.qihoo.security.support.b.b(11104);
                    }
                    SharedPref.a(this, "last_show_game_boost_folder_time", System.currentTimeMillis());
                } else
                {
                    com.qihoo.security.support.b.b(11104);
                }
                t = false;
                return;
            }
        }
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((com.qihoo.security.gamebooster.g)obj, obj1);
    }

    public void b()
    {
        g.setVisibility(0);
        ScaleAnimation scaleanimation = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
        scaleanimation.setDuration(300L);
        scaleanimation.setInterpolator(new OvershootInterpolator());
        g.startAnimation(scaleanimation);
        f.a();
    }

    public void c()
    {
        f.a(new com.qihoo.security.floatview.ui.FloatViewWndmillView.a() {

            final GameBoosterActivity a;

            public void a()
            {
                Animation animation = AnimationUtils.loadAnimation(a, 0x7f04000a);
                com.qihoo.security.gamebooster.GameBoosterActivity.a(a).startAnimation(animation);
                animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(this) {

                    final _cls2 a;

                    public void onAnimationEnd(Animation animation)
                    {
                        com.qihoo.security.gamebooster.GameBoosterActivity.a(a.a).setVisibility(8);
                        com.qihoo.security.gamebooster.GameBoosterActivity.b(a.a);
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
            }

            
            {
                a = GameBoosterActivity.this;
                super();
            }
        });
    }

    public void d()
    {
        com.qihoo.security.support.b.b(11126);
        int i1 = h.getPaddingLeft();
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, -h.getPaddingTop());
        translateanimation.setDuration(100L);
        translateanimation.setFillAfter(true);
        translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener(i1) {

            final int a;
            final GameBoosterActivity b;

            public void onAnimationEnd(Animation animation)
            {
                GameBoosterActivity.h(b).clearAnimation();
                GameBoosterActivity.h(b).setPadding(a, 0, a, 0);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                b = GameBoosterActivity.this;
                a = i1;
                super();
            }
        });
        h.startAnimation(translateanimation);
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(0x10a0000, 0x10a0001);
    }

    public void onClick(View view)
    {
        if (!com.qihoo360.mobilesafe.b.f.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        switch (view.getId())
        {
        default:
            return;

        case 2131427640: 
            break;

        case 2131427593: 
        case 2131427594: 
        case 2131427595: 
        case 2131427596: 
            obj = view.getTag();
            if (!(obj instanceof LocalGamePkg))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (LocalGamePkg)obj;
            if (obj == LocalGamePkg.ADD)
            {
                ArrayList arraylist;
                Object obj2;
                if (com.qihoo360.common.e.b.a(this) && !AdvDataManager.a().c())
                {
                    obj = new Intent(this, com/qihoo/security/gamebooster/GameRecommendListActivity);
                } else
                {
                    obj = new Intent(this, com/qihoo/security/gamebooster/AddGamesActivity);
                }
                view = (Activity)view.getContext();
                obj2 = b.c();
                if (obj2 == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                arraylist = new ArrayList();
                for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); arraylist.add(((LocalGamePkg)((Iterator) (obj2)).next()).getPkgName())) { }
                ((Intent) (obj)).putStringArrayListExtra("packages", arraylist);
                ((Intent) (obj)).addFlags(0x10000000);
                view.startActivity(((Intent) (obj)));
                overridePendingTransition(0x7f040006, 0x7f040008);
                com.qihoo.security.support.b.a(11109, "0", null);
                return;
            } else
            {
                view = k.getLaunchIntentForPackage(((LocalGamePkg) (obj)).getPkgName());
                if (view != null)
                {
                    view.addFlags(0x10200000);
                    startActivity(view);
                    com.qihoo.security.support.b.a(11106, ((LocalGamePkg) (obj)).getPkgName(), "0");
                    a(((LocalGamePkg) (obj)).getPkgName());
                    return;
                }
                continue; /* Loop/switch isn't completed */
            }

        case 2131427639: 
            finish();
            return;

        case 2131427642: 
            com.qihoo.security.support.b.b(11105);
            com.qihoo360.mobilesafe.b.q.a().a(0x7f0c002f);
            return;

        case 2131427648: 
            Object obj1 = view.getTag();
            if (obj1 instanceof AdvData)
            {
                obj1 = (AdvData)obj1;
                a(view, ((AdvData) (obj1)));
                com.qihoo.security.adv.a.c.a(com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderHotAdvData, ((AdvData) (obj1)).type);
                view = new ArrayList();
                view.add(obj1);
                AdvDataManager.a().a(com.qihoo.security.adv.AdvDataManager.AdvReportType.Click, view);
                return;
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
        if (!(obj instanceof AdvData)) goto _L1; else goto _L3
_L3:
        obj = (AdvData)obj;
        a(view, ((AdvData) (obj)));
        com.qihoo.security.adv.a.c.a(com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderAllLikeData, ((AdvData) (obj)).type);
        view = new ArrayList();
        view.add(obj);
        AdvDataManager.a().a(com.qihoo.security.adv.AdvDataManager.AdvReportType.Click, view);
        return;
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = new c();
        t = true;
        overridePendingTransition(0x10a0000, 0x10a0001);
        k = getPackageManager();
        Intent intent = getIntent();
        a(intent);
        e();
        bundle = intent.getStringExtra("pkg_name");
        e = new Handler();
        if (!TextUtils.isEmpty(bundle))
        {
            intent.removeExtra("pkg_name");
            if (!com.qihoo.security.gamebooster.b.a().f())
            {
                intent = new Intent("com.qihoo.security.lite.gamebooster.CreateGameShortActivity");
                intent.setFlags(0x50040000);
                intent.putExtra("pkg_name", bundle);
                startActivity(intent);
                finish();
                return;
            }
            a(bundle, 1500L);
        }
        if (intent.getIntExtra("from", -1) == -1)
        {
            SharedPref.a(this, "Game_booster_last_open", System.currentTimeMillis());
        }
        requestWindowFeature(1);
        setContentView(0x7f03005b);
        d = (DragLayerListView)findViewById(0x7f0b000e);
        d.setAdapter(this);
        h = findViewById(0x7f0b0138);
        h.setOnClickListener(this);
        s = findViewById(0x7f0b0137);
        s.setOnClickListener(this);
        c = LayoutInflater.from(this);
        g = findViewById(0x7f0b013e);
        f = (FloatViewWndmillView)findViewById(0x7f0b013f);
        A = findViewById(0x7f0b009c);
        h();
        com.qihoo.security.gamebooster.b.a().a(this);
        EventBus.getDefault().register(this);
        z = com.qihoo.security.adv.a.a.a();
        if (AdvDataManager.a().c())
        {
            A.setVisibility(8);
            return;
        } else
        {
            z.a(com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderAllLikeData);
            z.a(com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderHotAdvData);
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(C);
        for (Iterator iterator = o.entrySet().iterator(); iterator.hasNext(); ((NativeAd)((java.util.Map.Entry)iterator.next()).getKey()).n()) { }
        o.clear();
        EventBus.getDefault().unregister(this);
        i();
    }

    public void onEventMainThread(com.qihoo.security.f.a a1)
    {
        List list = a1.b;
        A.setVisibility(8);
        if (list == null)
        {
            return;
        }
        switch (com.qihoo.security.gamebooster._cls8.b[a1.a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            u = list;
            w = z.d(a1.a);
            a1 = com.qihoo.security.ui.result.f.a(a1.a, w, true);
            y.clear();
            y.addAll(a1);
            a();
            return;

        case 2: // '\002'
            v = list;
            break;
        }
        x = z.d(a1.a);
        a = com.qihoo.security.ui.result.f.a(a1.a, x, true);
        a();
    }

    public void onEventMainThread(com.qihoo.security.f.b b1)
    {
        com.qihoo.security.gamebooster._cls8.b[b1.a.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 174;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        int i1 = z.a(u, b1.b);
        if (w != null && i1 >= 0)
        {
            com.qihoo.security.adv.d d1 = (com.qihoo.security.adv.d)u.get(i1);
            if (z.a(d1, w))
            {
                d1.a(0);
                if (w.size() > i1)
                {
                    w.add(i1, d1);
                } else
                {
                    w.add(d1);
                }
                b1 = com.qihoo.security.ui.result.f.a(b1.a, w, false);
                if (b1 != null)
                {
                    y.clear();
                    y.addAll(b1);
                    a();
                    return;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        int j1 = z.a(v, b1.b);
        if (x != null && j1 >= 0)
        {
            com.qihoo.security.adv.d d2 = (com.qihoo.security.adv.d)v.get(j1);
            if (z.a(d2, x))
            {
                d2.a(0);
                if (x.size() > j1)
                {
                    x.add(j1, d2);
                } else
                {
                    x.add(d2);
                }
                a = com.qihoo.security.ui.result.f.a(b1.a, x, false);
                a();
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean onLongClick(View view)
    {
        for (Object obj = view.getTag(); !(obj instanceof LocalGamePkg) || obj == null || obj == LocalGamePkg.ADD;)
        {
            return false;
        }

        d.a(view);
        return true;
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(intent);
        String s1 = intent.getStringExtra("pkg_name");
        if (!TextUtils.isEmpty(s1))
        {
            intent.removeExtra("pkg_name");
            a(s1, 0L);
        }
        if (intent.getIntExtra("from", -1) == -1)
        {
            SharedPref.a(this, "Game_booster_last_open", System.currentTimeMillis());
        }
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        B = Math.max(abslistview.getLastVisiblePosition(), B);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (i1 != 0 || l < 0 && m < 0) goto _L2; else goto _L1
_L1:
        d d1 = j.a(m);
        if (d1 == null || d1.b == null) goto _L2; else goto _L3
_L3:
        abslistview = null;
        l;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 114
    //                   1 125
    //                   2 136
    //                   3 147;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        if (abslistview != null && !TextUtils.isEmpty(n))
        {
            abslistview.setFlashPkg(n);
            a(abslistview);
        }
        l = -1;
        m = -1;
_L2:
        return;
_L5:
        abslistview = com.qihoo.security.gamebooster.n.f(d1.b);
        continue; /* Loop/switch isn't completed */
_L6:
        abslistview = com.qihoo.security.gamebooster.n.i(d1.b);
        continue; /* Loop/switch isn't completed */
_L7:
        abslistview = n.l(d1.b);
        continue; /* Loop/switch isn't completed */
_L8:
        abslistview = n.o(d1.b);
        if (true) goto _L4; else goto _L9
_L9:
    }
}
