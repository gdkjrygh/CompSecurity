// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import bolts.j;
import com.androidquery.util.a;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.PublicCollageActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.model.gson.WebPromotionData;
import com.cardinalblue.android.piccollage.view.a.d;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            s

public abstract class i extends Fragment
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, com.cardinalblue.android.piccollage.view.a.d.a
{
    public static interface a
    {

        public abstract void a(CBCollagesResponse cbcollagesresponse, Exception exception);
    }

    public static interface b
    {

        public abstract void a(int i1, String s1);
    }


    private String a;
    protected d b;
    protected b c;
    protected WeakReference d;
    protected ViewSwitcher e;
    protected ProgressBar f;
    protected View g;
    protected ImageView h;
    protected TextView i;
    protected Button j;
    protected SuperRecyclerView k;
    private AtomicBoolean l;

    public i()
    {
        a = "";
        l = new AtomicBoolean(false);
    }

    static String a(i i1)
    {
        return i1.a;
    }

    static String a(i i1, String s1)
    {
        i1.a = s1;
        return s1;
    }

    static void a(i i1, String s1, a a1)
    {
        i1.a(s1, a1);
    }

    private void a(String s1, a a1)
    {
        if (!com.cardinalblue.android.b.k.b(getActivity()))
        {
            com.cardinalblue.android.b.k.a(getActivity(), 0x7f07021d, 1);
            d();
        } else
        if (!l.get())
        {
            b(s1, a1);
            return;
        }
    }

    private static boolean a(Date date)
    {
        while (date == null || (new Date()).getTime() - date.getTime() <= 0x493e0L) 
        {
            return false;
        }
        return true;
    }

    static AtomicBoolean b(i i1)
    {
        return i1.l;
    }

    private final void b(WebPromotionData webpromotiondata)
    {
        b.a(webpromotiondata);
        b.notifyDataSetChanged();
    }

    private void b(String s1, a a1)
    {
        bolts.j.a(new Callable(s1) {

            final String a;
            final i b;

            public CBCollagesResponse a()
                throws Exception
            {
                com.cardinalblue.android.piccollage.view.fragments.i.b(b).set(true);
                if (TextUtils.isEmpty(a))
                {
                    return b.e().a();
                } else
                {
                    return b.e().a(a);
                }
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = i.this;
                a = s1;
                super();
            }
        }).a(new bolts.i(a1) {

            final a a;
            final i b;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.view.fragments.i.b(b).set(false);
                if (j1.c())
                {
                    return null;
                }
                if (j1.d())
                {
                    a.a(null, j1.f());
                    return null;
                } else
                {
                    a.a((CBCollagesResponse)j1.e(), null);
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = i.this;
                a = a1;
                super();
            }
        }, j.b);
    }

    private void k()
    {
        boolean flag;
        if (e.getCurrentView().getId() == 0x7f1001b7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            e.showNext();
        }
    }

    private void l()
    {
        boolean flag;
        if (e.getCurrentView().getId() == 0x7f100212)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            e.showNext();
        }
    }

    protected abstract View a(LayoutInflater layoutinflater, ViewGroup viewgroup);

    protected abstract d a(CBCollagesResponse cbcollagesresponse);

    protected void a()
    {
        if (!com.cardinalblue.android.b.k.b(getActivity()))
        {
            d();
            return;
        } else
        {
            l();
            return;
        }
    }

    protected void a(View view)
    {
    }

    public void a(View view, int i1)
    {
        int j1 = 0;
        String s1;
        if (PicAuth.h().b())
        {
            s1 = "yes";
        } else
        {
            s1 = "no";
        }
        com.cardinalblue.android.piccollage.a.b.f(s1);
        if (!com.cardinalblue.android.b.k.b(getActivity()))
        {
            com.cardinalblue.android.b.k.a(getActivity(), 0x7f07021d, 1);
        } else
        {
            Intent intent = new Intent(getActivity().getApplicationContext(), com/cardinalblue/android/piccollage/activities/PublicCollageActivity);
            intent.setAction("piccollage.intent.action.VIEW_MULTIPLE_COLLAGES");
            Object obj = b.b().getPhotos();
            for (int k1 = 0; k1 < i1; k1++)
            {
                if (((WebPhoto)((List) (obj)).get(k1)).isAd())
                {
                    j1++;
                }
            }

            intent.putExtra("position", i1 - j1);
            intent.putExtra("web_photos_data", b.b());
            intent.putExtra("feed_accessor", e());
            intent.putExtra("extra_start_from", j());
            obj = new Rect();
            view.getDrawingRect(((Rect) (obj)));
            view = ActivityOptionsCompat.makeScaleUpAnimation(view, ((Rect) (obj)).left, ((Rect) (obj)).top, ((Rect) (obj)).width(), ((Rect) (obj)).height());
            if (d != null)
            {
                s s2 = (s)d.get();
                if (s2 != null)
                {
                    s2.a(this, intent, 100, view.toBundle());
                    return;
                }
            } else
            {
                ActivityCompat.startActivityForResult(getActivity(), intent, 100, view.toBundle());
                return;
            }
        }
    }

    public void a(WebPromotionData webpromotiondata)
    {
        com.cardinalblue.android.piccollage.a.b.at(webpromotiondata.getPromotionId());
        if (!TextUtils.isEmpty(webpromotiondata.getClickEvent()))
        {
            com.cardinalblue.android.piccollage.a.f.a(webpromotiondata.getClickEvent());
        }
        webpromotiondata = webpromotiondata.getClickUrl();
        if (TextUtils.isEmpty(webpromotiondata))
        {
            return;
        } else
        {
            webpromotiondata = PICAppRoutesService.d(webpromotiondata.trim());
            webpromotiondata.putExtra("extra_start_from", "banner");
            getActivity().startService(webpromotiondata);
            return;
        }
    }

    public void a(s s1)
    {
        d = new WeakReference(s1);
    }

    public void a(boolean flag)
    {
        if (flag && b != null)
        {
            Date date = b.d();
            if (date != null && !a(date))
            {
                a();
                return;
            }
        }
        c();
        b();
    }

    protected abstract boolean a(Exception exception);

    public com.cardinalblue.android.piccollage.amazon.HomeHeroWidgetManager.UpdateHeroWidgetEvent b(CBCollagesResponse cbcollagesresponse)
    {
        return null;
    }

    protected void b()
    {
        a("", new a() {

            final i a;

            public void a(CBCollagesResponse cbcollagesresponse, Exception exception)
            {
                a.k.a();
                if (exception != null)
                {
                    if (!a.a(exception))
                    {
                        a.d();
                        com.cardinalblue.android.b.k.a(a.getActivity(), 0x7f0700f8, 1);
                    }
                } else
                if (cbcollagesresponse != null)
                {
                    com.cardinalblue.android.piccollage.view.fragments.i.a(a, cbcollagesresponse.getListRevision());
                    a.b.a(cbcollagesresponse);
                    a.k.setCanLoadMore(a.b.g());
                    a.c(cbcollagesresponse);
                    a.b.notifyDataSetChanged();
                    a.a();
                    cbcollagesresponse = a.b(cbcollagesresponse);
                    if (cbcollagesresponse != null)
                    {
                        com.cardinalblue.android.piccollage.controller.d.a().c(cbcollagesresponse);
                        return;
                    }
                }
            }

            
            {
                a = i.this;
                super();
            }
        });
    }

    public void c()
    {
        k();
        f.setVisibility(0);
        g.setVisibility(8);
    }

    protected void c(CBCollagesResponse cbcollagesresponse)
    {
        if (cbcollagesresponse.getPromotion() != null)
        {
            b(cbcollagesresponse.getPromotion());
        }
    }

    public void d()
    {
        k();
        g.setVisibility(0);
        f.setVisibility(8);
    }

    protected abstract com.cardinalblue.android.piccollage.controller.FeedAccessorFactory.FeedAccessor e();

    protected abstract void f();

    protected abstract void g();

    protected abstract void h();

    protected abstract int i();

    protected abstract String j();

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 100 100: default 20
    //                   100 28;
           goto _L1 _L2
_L1:
        super.onActivityResult(i1, j1, intent);
_L4:
        return;
_L2:
        if (intent != null && j1 == -1)
        {
            intent = (CBCollagesResponse)intent.getParcelableExtra("web_photos_data");
            b.c(intent);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        c = (b)activity;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (bundle != null && bundle.containsKey("current_data"))
        {
            bundle = (CBCollagesResponse)bundle.getParcelable("current_data");
        } else
        {
            bundle = new CBCollagesResponse();
        }
        b = a(bundle);
        b.a(this);
        b.a(j());
        layoutinflater = a(layoutinflater, viewgroup);
        f = (ProgressBar)layoutinflater.findViewById(0x7f100213);
        e = (ViewSwitcher)layoutinflater.findViewById(0x7f1001b6);
        if (k == null)
        {
            k = (SuperRecyclerView)layoutinflater.findViewById(0x7f1001d6);
            viewgroup = new GridLayoutManager(getActivity(), getResources().getInteger(0x7f09001f));
            viewgroup.setSpanSizeLookup(new android.support.v7.widget.GridLayoutManager.SpanSizeLookup(viewgroup) {

                final GridLayoutManager a;
                final i b;

                public int getSpanSize(int i1)
                {
                    if (b.b.a(i1))
                    {
                        return a.getSpanCount();
                    } else
                    {
                        return 1;
                    }
                }

            
            {
                b = i.this;
                a = gridlayoutmanager;
                super();
            }
            });
            k.getRecyclerView().setHasFixedSize(true);
            k.a(new com.cardinalblue.android.piccollage.view.j(getResources().getDimensionPixelSize(0x7f0b0062)));
            k.setLayoutManager(viewgroup);
        }
        k.a(new com.malinskiy.superrecyclerview.a() {

            final i a;

            public void a(int i1, int j1, int k1)
            {
                com.cardinalblue.android.piccollage.view.fragments.i.a(a, a.b.c(), new a(this) {

                    final _cls2 a;

                    public void a(CBCollagesResponse cbcollagesresponse, Exception exception)
                    {
                        boolean flag = true;
                        a.a.k.a();
                        if (exception != null)
                        {
                            if (!a.a.a(exception))
                            {
                                a.a.d();
                                com.cardinalblue.android.b.k.a(a.a.getActivity(), 0x7f0700f8, 1);
                            }
                        } else
                        if (cbcollagesresponse != null)
                        {
                            boolean flag1 = cbcollagesresponse.getListRevision().equals(com.cardinalblue.android.piccollage.view.fragments.i.a(a.a));
                            if (a.a.b.getItemCount() != 0)
                            {
                                flag = false;
                            }
                            com.cardinalblue.android.piccollage.view.fragments.i.a(a.a, cbcollagesresponse.getListRevision());
                            if (flag1 && !flag)
                            {
                                a.a.b.b(cbcollagesresponse);
                                a.a.k.setCanLoadMore(a.a.b.g());
                                a.a.b.notifyDataSetChanged();
                                a.a.c(cbcollagesresponse);
                                a.a.a();
                                return;
                            }
                        }
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
            }

            
            {
                a = i.this;
                super();
            }
        }, 1);
        k.a(0x1060015, 0x1060019, 0x1060013, 0x1060017);
        k.setRefreshListener(this);
        k.setOnEmptyViewChanged(new com.malinskiy.superrecyclerview.SuperRecyclerView.b() {

            final i a;

            public void a()
            {
                View view = a.k.getEmptyView();
                View view1;
                if (view != null)
                {
                    if ((view1 = view.findViewById(0x7f1001ae)) != null)
                    {
                        view1.setOnClickListener(new android.view.View.OnClickListener(this) {

                            final _cls3 a;

                            public void onClick(View view)
                            {
                                a.a.h();
                            }

            
            {
                a = _pcls3;
                super();
            }
                        });
                        a.a(view);
                        return;
                    }
                }
            }

            
            {
                a = i.this;
                super();
            }
        });
        g = layoutinflater.findViewById(0x7f100202);
        h = (ImageView)g.findViewById(0x7f1001ac);
        i = (TextView)g.findViewById(0x7f1001ad);
        j = (Button)g.findViewById(0x7f1001ae);
        j.setOnClickListener(new android.view.View.OnClickListener() {

            final i a;

            public void onClick(View view)
            {
                a.g();
            }

            
            {
                a = i.this;
                super();
            }
        });
        f();
        k.setAdapter(b);
        k.setEmptyInflateId(i());
        c(b.b());
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        k.setOnScrollListener(null);
        k = null;
        b = null;
        com.androidquery.util.a.b(getActivity().getApplicationContext());
    }

    public void onDetach()
    {
        super.onDetach();
        c = null;
    }

    public com.cardinalblue.android.piccollage.amazon.HomeHeroWidgetManager.UpdateHeroWidgetEvent onProduceEvent()
    {
        if (b.b() != null)
        {
            return b(b.b());
        } else
        {
            return null;
        }
    }

    public void onRefresh()
    {
        b();
    }
}
