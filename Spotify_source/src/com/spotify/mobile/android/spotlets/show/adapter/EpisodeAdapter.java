// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.offline.service.OfflineService;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.spotlets.show.service.PlayedStateService;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.squareup.picasso.Picasso;
import dff;
import dgo;
import dhu;
import dhv;
import dib;
import die;
import dmz;
import dto;
import fio;
import fit;
import fiy;
import fiz;
import fjb;
import fop;
import fuj;
import fve;
import fvh;
import fvi;
import fvj;
import fvk;
import fvl;
import fvn;
import fvq;
import fvr;
import fvs;
import fxh;
import gae;
import gcg;
import gdb;
import gft;
import gwb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class EpisodeAdapter extends BaseAdapter
{

    private static final int c = Type.values().length;
    private static HashMap d;
    protected final Context a;
    public int b;
    private final Verified e;
    private final Flags f;
    private List g;
    private SparseArray h;
    private fop i;
    private Picasso j;
    private fiz k;
    private String l;
    private String m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private fuj x;

    public EpisodeAdapter(Context context, Verified verified, Flags flags, boolean flag)
    {
        g = new ArrayList();
        h = new SparseArray();
        i = (fop)dmz.a(fop);
        j = ((gft)dmz.a(gft)).a();
        x = new fuj() {

            private EpisodeAdapter a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                boolean flag2 = true;
                obj = (fio)obj;
                fvq fvq1 = fve.a(a.a).e(((fio) (obj)).b(), ((fio) (obj)).a());
                boolean flag1;
                if (((fio) (obj)).s() == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                obj = fvq1.a(flag1).a(EpisodeAdapter.a(a)).b(true).c(EpisodeAdapter.e(a));
                if (!EpisodeAdapter.d(a))
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                ((fvj) (obj)).d(flag1).e(fiy.d(EpisodeAdapter.c(a))).f(fiy.d(EpisodeAdapter.c(a))).a(EpisodeAdapter.c(a)).a(spotifycontextmenu);
            }

            
            {
                a = EpisodeAdapter.this;
                super();
            }
        };
        a = context;
        e = verified;
        f = flags;
        o = flag;
        r = a.getResources().getDimensionPixelSize(0x7f0c00d9);
        s = a.getResources().getDimensionPixelSize(0x7f0c00da);
        t = a.getResources().getDimensionPixelSize(0x7f0c00db);
        u = a.getResources().getDimensionPixelSize(0x7f0c0156);
        v = a.getResources().getDimensionPixelOffset(0x7f0c0158);
        w = a.getResources().getDimensionPixelOffset(0x7f0c0157);
        k = new fiz(context);
    }

    private Drawable a(fio fio1)
    {
        if (fio1.j()) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Integer integer;
        integer = fio1.l();
        if (!o || !b(fio1) && (!TextUtils.isEmpty(l) || !fio1.b().equals(m)))
        {
            continue; /* Loop/switch isn't completed */
        }
        fio1 = gcg.a(a, 0x7f020190);
_L4:
        fio1.setBounds(0, 0, r, r);
        return fio1;
        if (!fio1.h() || integer != null) goto _L1; else goto _L3
_L3:
        fio1 = gcg.a(a, 0x7f02018f);
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    static Verified a(EpisodeAdapter episodeadapter)
    {
        return episodeadapter.e;
    }

    static fop b(EpisodeAdapter episodeadapter)
    {
        return episodeadapter.i;
    }

    private boolean b(fio fio1)
    {
        return !TextUtils.isEmpty(l) && TextUtils.equals(l, fio1.b());
    }

    static Flags c(EpisodeAdapter episodeadapter)
    {
        return episodeadapter.f;
    }

    static boolean d(EpisodeAdapter episodeadapter)
    {
        return episodeadapter.o;
    }

    static boolean e(EpisodeAdapter episodeadapter)
    {
        return episodeadapter.p;
    }

    public final fio a(int i1)
    {
        return (fio)g.get(i1);
    }

    public final void a(String s1)
    {
        if (!TextUtils.equals(m, s1))
        {
            m = s1;
            notifyDataSetChanged();
        }
    }

    public final void a(String s1, boolean flag)
    {
        if (flag == n && TextUtils.equals(s1, l))
        {
            return;
        } else
        {
            l = s1;
            n = flag;
            notifyDataSetChanged();
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (p != flag)
        {
            p = flag;
            notifyDataSetChanged();
        }
    }

    public final void a(fio afio[])
    {
        if (afio == null)
        {
            g = new ArrayList();
            notifyDataSetInvalidated();
            return;
        }
        b = 0;
        int k2 = afio.length;
        int k1 = 0;
        int j1 = 0;
        int i1 = 0;
        while (k1 < k2) 
        {
            if (!afio[k1].isHeader())
            {
                SparseArray sparsearray = h;
                int l1 = j1 + 1;
                int j2 = i1 + 1;
                sparsearray.put(j1, Integer.valueOf(i1));
                i1 = j2;
                j1 = l1;
            } else
            {
                SparseArray sparsearray1 = h;
                int i2 = j1 + 1;
                sparsearray1.put(j1, Integer.valueOf(-1));
                b = b + 1;
                j1 = i2;
            }
            k1++;
        }
        g = new ArrayList(Arrays.asList(afio));
        notifyDataSetChanged();
    }

    public final void b(boolean flag)
    {
        if (q != flag)
        {
            q = flag;
            notifyDataSetChanged();
        }
    }

    public final int getCount()
    {
        return g.size();
    }

    public final Object getItem(int i1)
    {
        return a(i1);
    }

    public final long getItemId(int i1)
    {
        return (long)((Integer)h.get(i1)).intValue();
    }

    public final int getItemViewType(int i1)
    {
        if (((fio)g.get(i1)).isHeader())
        {
            return Type.b.ordinal();
        }
        if (((fio)g.get(i1)).s() == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c)
        {
            return Type.c.ordinal();
        } else
        {
            return Type.a.ordinal();
        }
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        Object obj;
        Object obj1;
        obj1 = Type.values()[getItemViewType(i1)];
        obj = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        if (obj1 != Type.a) goto _L4; else goto _L3
_L3:
        view = dhv.e(a, viewgroup);
        viewgroup = ((dib)view.u()).a();
        viewgroup.setSingleLine(false);
        viewgroup.setMaxLines(2);
        view = view.v();
_L6:
        obj = a(i1);
        if (obj1 == Type.b)
        {
            obj1 = (SectionHeaderView)view;
            ((SectionHeaderView) (obj1)).a();
            viewgroup = (Integer)d.get(((fio) (obj)).getHeader());
            view = viewgroup;
            if (viewgroup == null)
            {
                view = Integer.valueOf(0x7f08029a);
            }
            ((SectionHeaderView) (obj1)).a(a.getString(view.intValue()));
            return ((View) (obj1));
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (obj1 == Type.b)
        {
            view = new SectionHeaderView(a);
            continue; /* Loop/switch isn't completed */
        }
        view = dhv.g(a, viewgroup);
        viewgroup = ((die)view.u()).a();
        viewgroup.setSingleLine(false);
        viewgroup.setMaxLines(2);
        obj = view.v();
        ((die)view.u()).d().setVisibility(0);
        viewgroup = new TextView(a);
        dgo.a(a, viewgroup);
        viewgroup.setPadding(u, u, u, u);
        ((die)view.u()).a(viewgroup);
        ((die)view.u()).e();
_L2:
        view = ((View) (obj));
        if (true) goto _L6; else goto _L5
_L5:
        if (obj1 == Type.c)
        {
            view = dhu.b(view);
            boolean flag = b(((fio) (obj)));
            view.b(obj);
            view.b(((fio) (obj)).i());
            view.c(flag);
            viewgroup = (die)view.u();
            obj1 = viewgroup.d();
            Object obj2 = ((fio) (obj)).l();
            if (obj2 == null || ((Integer) (obj2)).intValue() == 0)
            {
                i1 = ((fio) (obj)).k();
            } else
            {
                i1 = ((Integer) (obj2)).intValue();
            }
            ((TextView)viewgroup.c()).setText(fiz.a(i1));
            j.a(obj1);
            obj2 = fit.a(((fio) (obj)).c(), ((fio) (obj)).d(), ((fio) (obj)).o(), com.spotify.mobile.android.spotlets.show.model.Covers.Size.a);
            j.a(dto.a(((String) (obj2)))).a(dff.m(a)).b(v, w).b().a(((ImageView) (obj1)), null);
            viewgroup.c(k.a(((fio) (obj))).b(flag).a(o).a().b());
            viewgroup.b().setCompoundDrawablesWithIntrinsicBounds(a(((fio) (obj))), null, null, null);
            viewgroup.a(((fio) (obj)).a());
            view.e(true);
            if (q)
            {
                viewgroup = gae.a(a, SpotifyIcon.ai);
                viewgroup.setOnClickListener(new android.view.View.OnClickListener(((fio) (obj))) {

                    private fio a;
                    private EpisodeAdapter b;

                    public final void onClick(View view1)
                    {
                        PlayedStateService.a(b.a, a.b());
                        EpisodeAdapter.b(b);
                        fop.a(b.a, EpisodeAdapter.a(b), new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dr));
                    }

            
            {
                b = EpisodeAdapter.this;
                a = fio1;
                super();
            }
                });
                view.a(viewgroup);
                view.c(null);
            } else
            {
                view.a(gae.a(a, x, obj));
                view.c(new fxh(x, obj));
            }
            return view.v();
        }
        obj1 = dhu.b(view);
        ImageView imageview = ((dib)((dhu) (obj1)).u()).d();
        view = imageview.getLayoutParams();
        boolean flag1;
        if (q)
        {
            i1 = t;
        } else
        {
            i1 = s;
        }
        view.width = i1;
        view.height = ((android.view.ViewGroup.LayoutParams) (view)).width;
        imageview.setLayoutParams(view);
        flag1 = b(((fio) (obj)));
        ((dhu) (obj1)).b(obj);
        ((dhu) (obj1)).b(((fio) (obj)).i());
        ((dhu) (obj1)).c(flag1);
        if (p)
        {
            boolean flag2 = com.spotify.mobile.android.provider.Metadata.OfflineSync.a(((fio) (obj)).p());
            if (((fio) (obj)).j() || !flag2)
            {
                view = dgo.c(a, 0x7f0101c7);
                viewgroup = dgo.c(a, 0x7f0101c8);
                Context context = a;
                SpotifyIcon spotifyicon = SpotifyIcon.q;
                if (!flag2)
                {
                    view = viewgroup;
                }
                view = gae.a(context, spotifyicon, view);
                view.setOnClickListener(new android.view.View.OnClickListener(((fio) (obj)), flag2) {

                    private fio a;
                    private boolean b;
                    private EpisodeAdapter c;

                    public final void onClick(View view1)
                    {
                        OfflineService.a(c.a, a.b(), b);
                        EpisodeAdapter.b(c);
                        fop.a(c.a, EpisodeAdapter.a(c), new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dq));
                        if (b)
                        {
                            CollectionService.a(c.a, a.o().b(), EpisodeAdapter.a(c).toString(), EpisodeAdapter.c(c), com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.a);
                            dmz.a(fop);
                            fop.a(c.a, EpisodeAdapter.a(c), ClientEventFactory.a("edit-mode", com.spotify.mobile.android.util.ClientEvent.SubEvent.bH, null, null));
                        }
                    }

            
            {
                c = EpisodeAdapter.this;
                a = fio1;
                b = flag;
                super();
            }
                });
                ((dhu) (obj1)).a(view);
            } else
            {
                ((dhu) (obj1)).a(null);
            }
            ((dhu) (obj1)).c(null);
        }
        viewgroup = (dib)((dhu) (obj1)).u();
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        imageview.setOnClickListener(null);
        if (q)
        {
            view = gae.b(a, SpotifyIcon.ai);
            imageview.setOnClickListener(new android.view.View.OnClickListener(((fio) (obj))) {

                private fio a;
                private EpisodeAdapter b;

                public final void onClick(View view1)
                {
                    PlayedStateService.a(b.a, a.b());
                    EpisodeAdapter.b(b);
                    fop.a(b.a, EpisodeAdapter.a(b), new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dr));
                }

            
            {
                b = EpisodeAdapter.this;
                a = fio1;
                super();
            }
            });
        } else
        {
            view = a(((fio) (obj)));
        }
        imageview.setImageDrawable(view);
        view = k.a(((fio) (obj))).b(flag1).a(o).b();
        if (o)
        {
            viewgroup.c(view);
        } else
        {
            viewgroup.b(view);
        }
        gdb.a(a, viewgroup.b(), ((fio) (obj)).p(), -1);
        viewgroup.a(((fio) (obj)).a());
        ((dhu) (obj1)).e(true);
        if (!p && !q)
        {
            ((dhu) (obj1)).a(gae.a(a, x, obj));
            ((dhu) (obj1)).c(new fxh(x, obj));
        }
        return ((dhu) (obj1)).v();
    }

    public final int getViewTypeCount()
    {
        return c;
    }

    public final boolean isEnabled(int i1)
    {
        return !((fio)g.get(i1)).isHeader();
    }

    static 
    {
        HashMap hashmap = new HashMap();
        d = hashmap;
        hashmap.put("today", Integer.valueOf(0x7f08029b));
        d.put("yesterday", Integer.valueOf(0x7f08029d));
        d.put("twoDaysAgo", Integer.valueOf(0x7f08029c));
    }

    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        private static final Type d[];

        public static Type valueOf(String s1)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/show/adapter/EpisodeAdapter$Type, s1);
        }

        public static Type[] values()
        {
            return (Type[])d.clone();
        }

        static 
        {
            a = new Type("AUDIO", 0);
            b = new Type("HEADER", 1);
            c = new Type("VIDEO", 2);
            d = (new Type[] {
                a, b, c
            });
        }

        private Type(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
