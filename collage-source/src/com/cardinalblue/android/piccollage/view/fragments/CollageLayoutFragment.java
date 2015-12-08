// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.ViewSwitcher;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.IabBackgroundActivity;
import com.cardinalblue.android.piccollage.activities.WebSearchActivity;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.model.PurchasableStickerBundle;
import com.cardinalblue.android.piccollage.model.d;
import com.cardinalblue.android.piccollage.model.f;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeData;
import com.cardinalblue.android.piccollage.model.gson.IBackground;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.model.memento.BaseMemento;
import com.cardinalblue.android.piccollage.model.memento.IMemento;
import com.cardinalblue.android.piccollage.view.a.c;
import com.cardinalblue.android.piccollage.view.a.j;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.h;
import com.cardinalblue.android.piccollage.view.i;
import com.cardinalblue.android.piccollage.view.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public class CollageLayoutFragment extends Fragment
    implements android.view.View.OnClickListener, android.widget.SeekBar.OnSeekBarChangeListener
{
    public static class a
        implements Serializable
    {

        public String a;
        public float b;
        public long c[];
        public float d[];
        public float e[];
        public float f[];
        public float g[];
        public int h[];
        public float i[];
        private int j;

        public int a()
        {
            return j;
        }

        public a(int i1)
        {
            j = i1;
            c = new long[i1];
            d = new float[i1];
            e = new float[i1];
            f = new float[i1];
            g = new float[i1];
            i = new float[i1];
            h = new int[i1];
        }
    }

    public static interface b
    {

        public abstract void a(float f1);

        public abstract void a(d d1, boolean flag);

        public abstract void a(IBackground ibackground);

        public abstract void a(IMemento imemento);

        public abstract void a(g g1);

        public abstract void b(int i1);

        public abstract void b(int i1, boolean flag);

        public abstract void e();

        public abstract com.cardinalblue.android.piccollage.view.PhotoProtoView.b f();
    }


    private a a;
    private d b;
    private j c;
    private SeekBar d;
    private int e;
    private b f;
    private ViewSwitcher g;
    private c h;
    private String i;
    private ImageView j;
    private boolean k;
    private View l;
    private BaseMemento m;
    private boolean n;
    private int o;
    private d p;

    public CollageLayoutFragment()
    {
        n = false;
        p = null;
    }

    static SeekBar a(CollageLayoutFragment collagelayoutfragment)
    {
        return collagelayoutfragment.d;
    }

    static d a(CollageLayoutFragment collagelayoutfragment, d d1)
    {
        collagelayoutfragment.p = d1;
        return d1;
    }

    static String a(CollageLayoutFragment collagelayoutfragment, String s)
    {
        collagelayoutfragment.i = s;
        return s;
    }

    private void a(d d1)
    {
        if (d1.b().size() != 0)
        {
            c(0);
            return;
        } else
        {
            c(8);
            return;
        }
    }

    private void a(com.cardinalblue.android.piccollage.view.PhotoProtoView.b b1)
    {
        int i1;
        int j1;
        i1 = getResources().getDimensionPixelSize(0x7f0b0126);
        j1 = getResources().getDimensionPixelSize(0x7f0b0125);
        static class _cls7
        {

            static final int a[];

            static 
            {
                a = new int[com.cardinalblue.android.piccollage.view.PhotoProtoView.b.values().length];
                try
                {
                    a[com.cardinalblue.android.piccollage.view.PhotoProtoView.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.view.PhotoProtoView.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.cardinalblue.android.piccollage.view.fragments._cls7.a[b1.ordinal()];
        JVM INSTR tableswitch 1 2: default 52
    //                   1 60
    //                   2 86;
           goto _L1 _L2 _L3
_L1:
        c.notifyDataSetChanged();
        return;
_L2:
        k = false;
        j.setImageResource(0x7f020122);
        c.a(i1, j1);
        continue; /* Loop/switch isn't completed */
_L3:
        k = true;
        j.setImageResource(0x7f020121);
        c.a(i1, i1);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!com.cardinalblue.android.b.k.j().getBoolean("pref_is_display_background_hint", false))
        {
            flag = flag1;
            if (l != null)
            {
                flag = flag1;
                if (o == 501)
                {
                    flag = flag1;
                    if (getActivity() != null)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    static boolean a(CollageLayoutFragment collagelayoutfragment, boolean flag)
    {
        collagelayoutfragment.n = flag;
        return flag;
    }

    static b b(CollageLayoutFragment collagelayoutfragment)
    {
        return collagelayoutfragment.f;
    }

    private ArrayList b(int i1)
    {
        com.cardinalblue.android.piccollage.model.f.h ah[] = com.cardinalblue.android.piccollage.model.f.h.values();
        int k1 = ah.length;
        ArrayList arraylist = new ArrayList(k1);
        for (int j1 = 0; j1 < k1; j1++)
        {
            f f1 = com.cardinalblue.android.piccollage.model.f.a(ah[j1]);
            ArrayList arraylist1 = new ArrayList();
            f1.a(i1, arraylist1);
            arraylist.add(new d(arraylist1, j1, f1.c()));
        }

        return arraylist;
    }

    private void b()
    {
        if (b.b().size() != 0)
        {
            d.setProgress((int)(a.b * 1000F));
        }
    }

    static void b(CollageLayoutFragment collagelayoutfragment, d d1)
    {
        collagelayoutfragment.a(d1);
    }

    static int c(CollageLayoutFragment collagelayoutfragment)
    {
        return collagelayoutfragment.e;
    }

    private void c(int i1)
    {
        d.setVisibility(i1);
    }

    static j d(CollageLayoutFragment collagelayoutfragment)
    {
        return collagelayoutfragment.c;
    }

    static BaseMemento e(CollageLayoutFragment collagelayoutfragment)
    {
        return collagelayoutfragment.m;
    }

    static c f(CollageLayoutFragment collagelayoutfragment)
    {
        return collagelayoutfragment.h;
    }

    static boolean g(CollageLayoutFragment collagelayoutfragment)
    {
        return collagelayoutfragment.a();
    }

    static View h(CollageLayoutFragment collagelayoutfragment)
    {
        return collagelayoutfragment.l;
    }

    public float a(int i1)
    {
        return (float)i1 / 1000F;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 400 401: default 24
    //                   400 25
    //                   401 230;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (intent != null)
        {
            m = (BaseMemento)intent.getParcelableExtra("search_memo");
            if (f != null)
            {
                f.a(m);
            }
        }
        if (j1 == -1 && intent != null && intent.hasExtra("selected_photo") && f != null)
        {
            String s = intent.getStringExtra("keyword");
            if ("android.intent.action.SEND".equals(intent.getAction()))
            {
                n = true;
                if ("video/*".equals(intent.getType()))
                {
                    CBYoutubeData cbyoutubedata = (CBYoutubeData)intent.getExtras().getParcelable("selected_photo");
                    com.cardinalblue.android.piccollage.lib.a.e.a(cbyoutubedata.getVideoThumbUrlMedium()).b(150).a(new bolts.i(cbyoutubedata, s) {

                        final CBYoutubeData a;
                        final String b;
                        final CollageLayoutFragment c;

                        public Void a(bolts.j j2)
                            throws Exception
                        {
                            Exception exception = j2.f();
                            if (exception == null)
                            {
                                j2 = com.cardinalblue.android.piccollage.view.o.c((Bitmap)j2.e());
                                j2.a(a);
                                j2.c(b);
                                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.b(c).a(j2);
                            } else
                            {
                                com.cardinalblue.android.piccollage.a.f.a(exception);
                                com.cardinalblue.android.b.k.a(c.getActivity(), 0x7f0701e0, 0);
                            }
                            return null;
                        }

                        public Object then(bolts.j j2)
                            throws Exception
                        {
                            return a(j2);
                        }

            
            {
                c = CollageLayoutFragment.this;
                a = cbyoutubedata;
                b = s;
                super();
            }
                    }, k.a);
                }
                if ("image/*".equals(intent.getType()))
                {
                    intent = (WebPhoto)intent.getExtras().getParcelable("selected_photo");
                    com.cardinalblue.android.piccollage.lib.a.e.a(intent.getThumbnailImageUrl()).b(150).a(new bolts.i(intent, s) {

                        final WebPhoto a;
                        final String b;
                        final CollageLayoutFragment c;

                        public Void a(bolts.j j2)
                            throws Exception
                        {
                            Object obj = j2.f();
                            if (obj == null)
                            {
                                obj = a.getOriginalImageUrl();
                                String s1 = a.getPageUrl();
                                j2 = com.cardinalblue.android.piccollage.view.h.a(c.getActivity(), (Bitmap)j2.e(), com.cardinalblue.android.piccollage.view.h.a.b);
                                j2.b(((String) (obj)));
                                j2.b(true);
                                j2.a(b, ((String) (obj)), s1);
                                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.b(c).a(j2);
                            } else
                            {
                                com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
                                com.cardinalblue.android.b.k.a(c.getActivity(), 0x7f0701e0, 0);
                            }
                            return null;
                        }

                        public Object then(bolts.j j2)
                            throws Exception
                        {
                            return a(j2);
                        }

            
            {
                c = CollageLayoutFragment.this;
                a = webphoto;
                b = s;
                super();
            }
                    }, k.a);
                    return;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (j1 == -1)
        {
            intent = com.cardinalblue.android.piccollage.controller.a.a();
            intent.h().a(new bolts.i(intent) {

                final com.cardinalblue.android.piccollage.controller.a a;
                final CollageLayoutFragment b;

                public Void a(bolts.j j2)
                    throws Exception
                {
                    com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.f(b).a(a.c());
                    return null;
                }

                public Object then(bolts.j j2)
                    throws Exception
                {
                    return a(j2);
                }

            
            {
                b = CollageLayoutFragment.this;
                a = a1;
                super();
            }
            }, bolts.j.b);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        f = (b)activity;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131755469: 
        case 2131755472: 
        default:
            return;

        case 2131755471: 
            if (f != null)
            {
                a(f.f());
            }
            n = true;
            return;

        case 2131755468: 
            com.cardinalblue.android.piccollage.a.b.x("Change Background");
            com.cardinalblue.android.piccollage.a.b.Y();
            g.showPrevious();
            f.b(501, n);
            f.b(502);
            o = 502;
            com.cardinalblue.android.b.k.j().edit().putBoolean("pref_is_display_background_hint", true).apply();
            n = false;
            return;

        case 2131755473: 
            com.cardinalblue.android.piccollage.a.b.x("Change Frame");
            com.cardinalblue.android.piccollage.a.b.X();
            g.showNext();
            f.b(502, n);
            f.b(501);
            o = 501;
            n = false;
            return;

        case 2131755467: 
        case 2131755470: 
        case 2131755474: 
            f.b(o, n);
            f.e();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Bundle bundle1 = getArguments();
        if (bundle != null)
        {
            i = bundle.getString("saved_background_uri", null);
            k = bundle.getBoolean("saved_is_square", false);
            m = (BaseMemento)bundle.getParcelable("saved_last_search_memo");
            n = bundle.getBoolean("saved_has_change_frame", false);
            o = bundle.getInt("component_mode", 501);
        } else
        {
            i = bundle1.getString("original_background", null);
            k = bundle1.getBoolean("is_square", false);
            m = (BaseMemento)bundle1.getParcelable("search_memo");
            o = bundle1.getInt("component_mode", 501);
        }
        a = (a)bundle1.getSerializable("frame_state");
        e = bundle1.getInt("photos_num");
        if (!TextUtils.isEmpty(a.a)) goto _L2; else goto _L1
_L1:
        bundle = com.cardinalblue.android.piccollage.model.d.a().toString();
_L3:
        b = new d(bundle);
_L4:
        c = new j(getActivity(), b(e), new com.cardinalblue.android.piccollage.view.a.j.b() {

            final CollageLayoutFragment a;

            public void a(d d1)
            {
                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a(a, d1);
                com.cardinalblue.android.piccollage.a.b.U();
                if (d1 != null)
                {
                    String s = String.valueOf(d1.c());
                    if (d1.c() < com.cardinalblue.android.piccollage.model.f.h.values().length)
                    {
                        s = com.cardinalblue.android.piccollage.model.f.h.values()[d1.c()].a();
                    }
                    com.cardinalblue.android.piccollage.a.b.L(s);
                }
                d1.a(a.a(com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a(a).getProgress()));
                if (com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.b(a) != null)
                {
                    com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.b(a).a(d1, true);
                }
                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a(a, true);
                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.b(a, d1);
                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.d(a).a(com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.c(a));
                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.d(a).notifyDataSetChanged();
            }

            
            {
                a = CollageLayoutFragment.this;
                super();
            }
        });
        h = new c(getActivity(), com.cardinalblue.android.piccollage.controller.a.a().c(), new com.cardinalblue.android.piccollage.view.a.c.c() {

            final CollageLayoutFragment a;

            public void a()
            {
                Intent intent = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/WebSearchActivity);
                intent.putExtra("search_memo", CollageLayoutFragment.e(a));
                intent.putExtra("is_search_background", true);
                a.startActivityForResult(intent, 400);
            }

            public void a(PurchasableStickerBundle purchasablestickerbundle)
            {
                com.cardinalblue.android.piccollage.a.b.aK(purchasablestickerbundle.f());
                Intent intent = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/IabBackgroundActivity);
                intent.putExtra("extra_purchasable_bundle", purchasablestickerbundle);
                a.startActivityForResult(intent, 401);
            }

            public void a(IBackground ibackground)
            {
                com.cardinalblue.android.piccollage.a.b.T();
                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a(a, true);
                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.f(a).a(ibackground);
                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.f(a).notifyDataSetChanged();
                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a(a, ibackground.getPath());
                com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.b(a).a(ibackground);
            }

            
            {
                a = CollageLayoutFragment.this;
                super();
            }
        });
        h.a(i);
        return;
_L2:
        bundle = a.a;
          goto _L3
        bundle;
        com.cardinalblue.android.piccollage.a.f.a(bundle);
          goto _L4
    }

    public Animator onCreateAnimator(int i1, boolean flag, int j1)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        Animator animator = AnimatorInflater.loadAnimator(getActivity(), 0x7f04003c);
        animator.addListener(new android.animation.Animator.AnimatorListener() {

            final CollageLayoutFragment a;

            public void onAnimationCancel(Animator animator1)
            {
            }

            public void onAnimationEnd(Animator animator1)
            {
                if (!com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.g(a))
                {
                    break MISSING_BLOCK_LABEL_73;
                }
                animator1 = new net.a.a.c(a.getActivity(), com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.h(a), false);
                animator1.a(new net.a.a.a(0, a.getString(0x7f070295), null), 0x7f030020);
                animator1.b(com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.h(a).findViewById(0x7f1001cc));
                return;
                animator1;
                com.cardinalblue.android.piccollage.a.f.a(animator1);
                return;
            }

            public void onAnimationRepeat(Animator animator1)
            {
            }

            public void onAnimationStart(Animator animator1)
            {
            }

            
            {
                a = CollageLayoutFragment.this;
                super();
            }
        });
        return animator;
        animator = AnimatorInflater.loadAnimator(getActivity(), 0x7f04003b);
        return animator;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        animator = null;
_L2:
        com.cardinalblue.android.piccollage.a.f.a(notfoundexception);
        return animator;
        notfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0300b6, viewgroup, false);
        viewgroup.setLayerType(1, null);
        g = (ViewSwitcher)viewgroup.findViewById(0x7f1001cb);
        float f1;
        if (o == 502)
        {
            f.b(502);
            g.showNext();
        } else
        {
            f.b(501);
        }
        f1 = b.e();
        if (bundle != null)
        {
            layoutinflater = bundle.getString("saved_selected_frame");
            boolean flag;
            if (!TextUtils.isEmpty(layoutinflater))
            {
                try
                {
                    if (f != null)
                    {
                        f.a(new d(layoutinflater), false);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (LayoutInflater layoutinflater)
                {
                    com.cardinalblue.android.piccollage.a.f.a(layoutinflater);
                }
            }
            f1 = bundle.getFloat("saved_border_ratio", 0.0F);
        }
        layoutinflater = (RecyclerView)viewgroup.findViewById(0x7f1001d0);
        bundle = new LinearLayoutManager(getActivity());
        bundle.setOrientation(0);
        layoutinflater.setLayoutManager(bundle);
        layoutinflater.setAdapter(c);
        layoutinflater.addItemDecoration(new i(getResources().getDimensionPixelSize(0x7f0b0141)));
        d = (SeekBar)viewgroup.findViewById(0x7f1001cd);
        a(b);
        b();
        d.setProgress((int)(f1 * 1000F));
        layoutinflater = (RecyclerView)viewgroup.findViewById(0x7f1001d3);
        layoutinflater.setAdapter(h);
        layoutinflater.addItemDecoration(new com.cardinalblue.android.piccollage.view.j(getResources().getDimensionPixelSize(0x7f0b013f)));
        bundle = new GridLayoutManager(getActivity(), 2);
        bundle.setOrientation(0);
        layoutinflater.setLayoutManager(bundle);
        viewgroup.findViewById(0x7f1001ce).setOnClickListener(this);
        viewgroup.findViewById(0x7f1001d2).setOnClickListener(this);
        g.setOnClickListener(this);
        viewgroup.findViewById(0x7f1001cc).setOnClickListener(this);
        viewgroup.findViewById(0x7f1001d1).setOnClickListener(this);
        flag = getArguments().getBoolean("change_canvas_size_enable", true);
        j = (ImageView)viewgroup.findViewById(0x7f1001cf);
        if (flag)
        {
            j.setOnClickListener(this);
        } else
        {
            j.setVisibility(8);
        }
        if (k)
        {
            layoutinflater = com.cardinalblue.android.piccollage.view.PhotoProtoView.b.b;
        } else
        {
            layoutinflater = com.cardinalblue.android.piccollage.view.PhotoProtoView.b.a;
        }
        a(layoutinflater);
        d.setOnSeekBarChangeListener(this);
        l = viewgroup;
        return l;
    }

    public void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
    {
        float f1 = a(i1);
        f.a(f1);
        n = true;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (p != null)
        {
            p.a(a(d.getProgress()));
            bundle.putString("saved_selected_frame", p.toString());
        }
        bundle.putFloat("saved_border_ratio", a(d.getProgress()));
        bundle.putString("saved_background_uri", i);
        bundle.putBoolean("saved_is_square", k);
        bundle.putParcelable("saved_last_search_memo", m);
        bundle.putBoolean("saved_has_change_frame", n);
        bundle.putInt("component_mode", o);
        super.onSaveInstanceState(bundle);
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        com.cardinalblue.android.piccollage.a.b.V();
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
    }
}
