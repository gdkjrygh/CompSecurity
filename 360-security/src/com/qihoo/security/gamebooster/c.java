// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.adv.AdvDataManager;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.gamebooster:
//            LocalGamePkg, g, b, e, 
//            GameRecommendListActivity, AddGamesActivity

public class com.qihoo.security.gamebooster.c extends BaseAdapter
    implements android.view.View.OnClickListener
{
    public static class a
    {

        int a;

        public int a()
        {
            return a;
        }

        public void a(e e1)
        {
            com.qihoo.security.gamebooster.e.a(e1).setVisibility(8);
            com.qihoo.security.gamebooster.e.b(e1).setVisibility(8);
            e.c(e1).setVisibility(8);
        }

        public a()
        {
            a = -1;
        }
    }

    public static class b extends a
    {

        public LocalGamePkg b;

        public void a(e e1)
        {
            super.a(e1);
            com.qihoo.security.gamebooster.e.a(e1).setVisibility(0);
            e.g(e1).setTag(b);
            e.d(e1).setTag(b);
            com.qihoo.security.gamebooster.c.a(e.j(e1), b);
            com.qihoo.security.gamebooster.c.a(e.d(e1), e.g(e1), b);
        }

        public b()
        {
            a = 0;
        }
    }

    public static class c extends b
    {

        public LocalGamePkg c;

        public void a(e e1)
        {
            super.a(e1);
            com.qihoo.security.gamebooster.e.b(e1).setVisibility(0);
            com.qihoo.security.gamebooster.e.b(e1).setTag(c);
            e.h(e1).setTag(c);
            e.e(e1).setTag(c);
            com.qihoo.security.gamebooster.c.a(e.k(e1), c);
            com.qihoo.security.gamebooster.c.a(e.e(e1), e.h(e1), c);
        }

        public c()
        {
            a = 1;
        }
    }

    public static class d extends c
    {

        public LocalGamePkg d;

        public void a(e e1)
        {
            super.a(e1);
            e.c(e1).setVisibility(0);
            e.c(e1).setTag(d);
            com.qihoo.security.gamebooster.e.i(e1).setTag(d);
            com.qihoo.security.gamebooster.e.f(e1).setTag(d);
            com.qihoo.security.gamebooster.c.a(e.l(e1), d);
            com.qihoo.security.gamebooster.c.a(com.qihoo.security.gamebooster.e.f(e1), com.qihoo.security.gamebooster.e.i(e1), d);
        }

        public d()
        {
            a = 2;
        }
    }

    private static class e
    {

        private View a;
        private RemoteImageView b;
        private LocaleTextView c;
        private LinearLayout d;
        private View e;
        private RemoteImageView f;
        private LocaleTextView g;
        private LinearLayout h;
        private View i;
        private RemoteImageView j;
        private LocaleTextView k;
        private LinearLayout l;

        static View a(e e1)
        {
            return e1.a;
        }

        static View a(e e1, View view)
        {
            e1.a = view;
            return view;
        }

        static LinearLayout a(e e1, LinearLayout linearlayout)
        {
            e1.d = linearlayout;
            return linearlayout;
        }

        static LocaleTextView a(e e1, LocaleTextView localetextview)
        {
            e1.c = localetextview;
            return localetextview;
        }

        static RemoteImageView a(e e1, RemoteImageView remoteimageview)
        {
            e1.b = remoteimageview;
            return remoteimageview;
        }

        static View b(e e1)
        {
            return e1.e;
        }

        static View b(e e1, View view)
        {
            e1.e = view;
            return view;
        }

        static LinearLayout b(e e1, LinearLayout linearlayout)
        {
            e1.h = linearlayout;
            return linearlayout;
        }

        static LocaleTextView b(e e1, LocaleTextView localetextview)
        {
            e1.g = localetextview;
            return localetextview;
        }

        static RemoteImageView b(e e1, RemoteImageView remoteimageview)
        {
            e1.f = remoteimageview;
            return remoteimageview;
        }

        static View c(e e1)
        {
            return e1.i;
        }

        static View c(e e1, View view)
        {
            e1.i = view;
            return view;
        }

        static LinearLayout c(e e1, LinearLayout linearlayout)
        {
            e1.l = linearlayout;
            return linearlayout;
        }

        static LocaleTextView c(e e1, LocaleTextView localetextview)
        {
            e1.k = localetextview;
            return localetextview;
        }

        static RemoteImageView c(e e1, RemoteImageView remoteimageview)
        {
            e1.j = remoteimageview;
            return remoteimageview;
        }

        static RemoteImageView d(e e1)
        {
            return e1.b;
        }

        static RemoteImageView e(e e1)
        {
            return e1.f;
        }

        static RemoteImageView f(e e1)
        {
            return e1.j;
        }

        static LinearLayout g(e e1)
        {
            return e1.d;
        }

        static LinearLayout h(e e1)
        {
            return e1.h;
        }

        static LinearLayout i(e e1)
        {
            return e1.l;
        }

        static LocaleTextView j(e e1)
        {
            return e1.c;
        }

        static LocaleTextView k(e e1)
        {
            return e1.g;
        }

        static LocaleTextView l(e e1)
        {
            return e1.k;
        }

        private e()
        {
        }

    }


    private List a;
    private LayoutInflater b;
    private Activity c;
    private g d;
    private PopupWindow e;
    private Handler f;

    public com.qihoo.security.gamebooster.c(g g1, Activity activity)
    {
        d = g1;
        b = LayoutInflater.from(activity);
        c = activity;
        f = new Handler();
        a(g1);
    }

    private void a(int j, View view)
    {
        a(j).a((e)view.getTag());
    }

    private void a(View view, LocalGamePkg localgamepkg)
    {
        LinearLayout linearlayout = (LinearLayout)b.inflate(0x7f030058, null);
        LocaleTextView localetextview = (LocaleTextView)linearlayout.findViewById(0x7f0b0133);
        LocaleTextView localetextview1 = (LocaleTextView)linearlayout.findViewById(0x7f0b00f9);
        localetextview.setTag(localgamepkg);
        localetextview1.setTag(localgamepkg);
        localetextview.setOnClickListener(this);
        localetextview1.setOnClickListener(this);
        localgamepkg = SecurityApplication.a().getResources();
        e = new PopupWindow(linearlayout, localgamepkg.getDimensionPixelSize(0x7f090051), localgamepkg.getDimensionPixelSize(0x7f090052));
        e.setFocusable(true);
        e.setBackgroundDrawable(new BitmapDrawable());
        e.setOutsideTouchable(true);
        e.showAsDropDown(view);
    }

    public static void a(View view, RemoteImageView remoteimageview)
    {
        Context context = SecurityApplication.a();
        int j = (com.qihoo360.mobilesafe.b.a.a(context) - com.qihoo360.mobilesafe.b.a.a(context, 20F)) / 3;
        int k = com.qihoo360.mobilesafe.b.a.a(context, 4F);
        int l = com.qihoo360.mobilesafe.b.a.a(context, 2.0F);
        remoteimageview.setPadding(k, k, k, k);
        remoteimageview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(j - com.qihoo360.mobilesafe.b.a.a(context, 8F), j - com.qihoo360.mobilesafe.b.a.a(context, 8F)));
        remoteimageview = new android.widget.LinearLayout.LayoutParams(j, com.qihoo360.mobilesafe.b.a.a(context, 40F) + j);
        remoteimageview.setMargins(l, 0, l, 0);
        view.setLayoutParams(remoteimageview);
    }

    static void a(com.qihoo.security.gamebooster.c c1, String s, String s1)
    {
        c1.a(s, s1);
    }

    public static void a(LocaleTextView localetextview, LocalGamePkg localgamepkg)
    {
        if (localgamepkg.getState() == LocalGamePkg.State.Add)
        {
            localetextview.setLocalText(0x7f0c0083);
            return;
        } else
        {
            localetextview.setLocalText(i.b(SecurityApplication.a(), localgamepkg.getPkgName()));
            return;
        }
    }

    static void a(RemoteImageView remoteimageview, LinearLayout linearlayout, LocalGamePkg localgamepkg)
    {
        b(remoteimageview, linearlayout, localgamepkg);
    }

    private void a(String s)
    {
        if (!SharedPref.b(c.getApplicationContext(), "game_booster_show_toast", true) || i.a())
        {
            return;
        } else
        {
            com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a().a(new com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a() {

                final com.qihoo.security.gamebooster.c a;

                public void a(String s1, String s2)
                {
                    s1 = com.qihoo.security.locale.d.a().a(0x7f0c0084, new Object[] {
                        s1, com.qihoo.security.gamebooster.b.h()
                    });
                    com.qihoo.security.gamebooster.c.a(a, s1, s2);
                }

            
            {
                a = com.qihoo.security.gamebooster.c.this;
                super();
            }
            }, "game-booster", s, "");
            return;
        }
    }

    private void a(String s, String s1)
    {
        f.postDelayed(new Runnable(s, s1) {

            final String a;
            final String b;
            final com.qihoo.security.gamebooster.c c;

            public void run()
            {
                q.a().a(Html.fromHtml(a));
                com.qihoo.security.support.b.a(11112, b, null);
            }

            
            {
                c = com.qihoo.security.gamebooster.c.this;
                a = s;
                b = s1;
                super();
            }
        }, 2000L);
    }

    private static void b(RemoteImageView remoteimageview, LinearLayout linearlayout, LocalGamePkg localgamepkg)
    {
        if (localgamepkg == LocalGamePkg.ADD)
        {
            remoteimageview.setImageResourceInListView(0x7f020086);
            linearlayout.setVisibility(8);
            return;
        } else
        {
            remoteimageview.b(localgamepkg.getPkgName(), 0x7f020044);
            linearlayout.setVisibility(0);
            return;
        }
    }

    public a a(int j)
    {
        return (a)a.get(j);
    }

    public void a(LocalGamePkg localgamepkg)
    {
        d.c().remove(localgamepkg);
        d.a().add(localgamepkg);
        a(d);
        notifyDataSetChanged();
        if (e.isShowing())
        {
            e.dismiss();
        }
        com.qihoo.security.gamebooster.b.a().a(d);
        com.qihoo.security.support.b.a(11107, localgamepkg.getPkgName(), "1");
    }

    public void a(g g1)
    {
        d = g1;
        g1 = (new com.qihoo.security.gamebooster.e(d.c())).a();
        if (g1 == null && g1.size() == 0)
        {
            return;
        } else
        {
            a(((List) (g1)));
            return;
        }
    }

    public void a(List list)
    {
        if (list == null || list.size() == 0) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        a = new ArrayList();
        int i1 = list.size() / 3;
        l = list.size();
        for (int j = 0; j < i1; j++)
        {
            d d1 = new d();
            int j1 = j * 3;
            d1.b = (LocalGamePkg)list.get(j1);
            d1.c = (LocalGamePkg)list.get(j1 + 1);
            d1.d = (LocalGamePkg)list.get(j1 + 2);
            a.add(d1);
        }

        k = i1 * 3;
        l % 3;
        JVM INSTR tableswitch 0 2: default 164
    //                   0 164
    //                   1 165
    //                   2 199;
           goto _L2 _L2 _L3 _L4
_L2:
        return;
_L3:
        b b1 = new b();
        b1.b = (LocalGamePkg)list.get(k);
        a.add(b1);
        return;
_L4:
        c c1 = new c();
        c1.b = (LocalGamePkg)list.get(k);
        c1.c = (LocalGamePkg)list.get(k + 1);
        a.add(c1);
        return;
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int j)
    {
        return a(j);
    }

    public long getItemId(int j)
    {
        return (long)j;
    }

    public int getItemViewType(int j)
    {
        return ((a)a.get(j)).a();
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        getItemViewType(j);
        JVM INSTR tableswitch 0 3: default 40
    //                   0 380
    //                   1 380
    //                   2 380
    //                   3 397;
           goto _L3 _L4 _L4 _L4 _L5
_L3:
        viewgroup = null;
_L7:
        e e1 = new e();
        com.qihoo.security.gamebooster.e.a(e1, viewgroup.findViewById(0x7f0b0109));
        com.qihoo.security.gamebooster.e.a(e1, (RemoteImageView)com.qihoo.security.gamebooster.e.a(e1).findViewById(0x7f0b0074));
        com.qihoo.security.gamebooster.e.a(e1, (LocaleTextView)com.qihoo.security.gamebooster.e.a(e1).findViewById(0x7f0b00ac));
        com.qihoo.security.gamebooster.e.a(e1, (LinearLayout)com.qihoo.security.gamebooster.e.a(e1).findViewById(0x7f0b0132));
        com.qihoo.security.gamebooster.e.b(e1, viewgroup.findViewById(0x7f0b010a));
        com.qihoo.security.gamebooster.e.b(e1, (RemoteImageView)com.qihoo.security.gamebooster.e.b(e1).findViewById(0x7f0b0074));
        com.qihoo.security.gamebooster.e.b(e1, (LocaleTextView)com.qihoo.security.gamebooster.e.b(e1).findViewById(0x7f0b00ac));
        com.qihoo.security.gamebooster.e.b(e1, (LinearLayout)com.qihoo.security.gamebooster.e.b(e1).findViewById(0x7f0b0132));
        e.c(e1, viewgroup.findViewById(0x7f0b010b));
        e.c(e1, (RemoteImageView)e.c(e1).findViewById(0x7f0b0074));
        e.c(e1, (LocaleTextView)e.c(e1).findViewById(0x7f0b00ac));
        e.c(e1, (LinearLayout)e.c(e1).findViewById(0x7f0b0132));
        view.setTag(e1);
        a(com.qihoo.security.gamebooster.e.a(e1), e.d(e1));
        a(com.qihoo.security.gamebooster.e.b(e1), e.e(e1));
        a(e.c(e1), com.qihoo.security.gamebooster.e.f(e1));
        e.d(e1).setOnClickListener(this);
        e.e(e1).setOnClickListener(this);
        com.qihoo.security.gamebooster.e.f(e1).setOnClickListener(this);
        e.g(e1).setOnClickListener(this);
        e.h(e1).setOnClickListener(this);
        com.qihoo.security.gamebooster.e.i(e1).setOnClickListener(this);
        viewgroup = view;
_L2:
        a(j, viewgroup);
        return viewgroup;
_L4:
        view = b.inflate(0x7f030063, null);
        viewgroup = view;
        continue; /* Loop/switch isn't completed */
_L5:
        view = b.inflate(0x7f030064, null);
        viewgroup = view;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public void onClick(View view)
    {
        if (!com.qihoo360.mobilesafe.b.f.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = view.getTag();
        if (obj instanceof LocalGamePkg)
        {
            obj = (LocalGamePkg)obj;
        } else
        {
            obj = null;
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131427577: 
            continue; /* Loop/switch isn't completed */

        case 2131427444: 
            if (obj == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (obj == LocalGamePkg.ADD)
            {
                if (c != null)
                {
                    if (com.qihoo360.common.e.b.a(c) && !AdvDataManager.a().c())
                    {
                        view = new Intent(c, com/qihoo/security/gamebooster/GameRecommendListActivity);
                        view.putExtra("from_gameboost", true);
                    } else
                    {
                        view = d.c();
                        if (view == null)
                        {
                            continue; /* Loop/switch isn't completed */
                        }
                        obj = new ArrayList();
                        for (view = view.iterator(); view.hasNext(); ((ArrayList) (obj)).add(((LocalGamePkg)view.next()).getPkgName())) { }
                        view = new Intent(c, com/qihoo/security/gamebooster/AddGamesActivity);
                        view.putStringArrayListExtra("packages", ((ArrayList) (obj)));
                        view.putExtra("from_gameboost", true);
                    }
                    c.startActivity(view);
                }
                com.qihoo.security.support.b.a(11109, "1", null);
                return;
            }
            view = c.getPackageManager().getLaunchIntentForPackage(((LocalGamePkg) (obj)).getPkgName());
            if (view != null)
            {
                view.addFlags(0x10200000);
                if (c != null)
                {
                    c.startActivity(view);
                    com.qihoo.security.support.b.a(11106, ((LocalGamePkg) (obj)).getPkgName(), "1");
                    a(((LocalGamePkg) (obj)).getPkgName());
                    return;
                }
            }
            break;

        case 2131427634: 
            if (obj != null)
            {
                com.qihoo.security.support.b.b(11120);
                a(view, ((LocalGamePkg) (obj)));
                return;
            }
            break;

        case 2131427635: 
            if (obj != null)
            {
                a(((LocalGamePkg) (obj)));
                return;
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
        if (obj == null) goto _L1; else goto _L3
_L3:
        view = new Intent("android.intent.action.DELETE", Uri.parse((new StringBuilder()).append("package:").append(((LocalGamePkg) (obj)).getPkgName()).toString()));
        try
        {
            c.startActivity(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        com.qihoo.security.support.b.a(11108, ((LocalGamePkg) (obj)).getPkgName(), "1");
        if (e.isShowing())
        {
            e.dismiss();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
