// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import bolts.i;
import bolts.j;
import com.android.volley.r;
import com.androidquery.util.a;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.PhotoProtoActivity;
import com.cardinalblue.android.piccollage.controller.FeedAccessorFactory;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.ServerCollage;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.CollageRoot;
import com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.model.gson.WebPromotionData;
import com.cardinalblue.android.piccollage.view.a.y;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public class af extends Fragment
    implements com.cardinalblue.android.piccollage.view.a.y.b
{

    protected y a;
    protected ViewSwitcher b;
    protected ProgressBar c;
    protected View d;
    protected ImageView e;
    protected TextView f;
    protected Button g;
    protected SuperRecyclerView h;
    private String i;
    private AtomicBoolean j;

    public af()
    {
        i = "";
        j = new AtomicBoolean(false);
    }

    static String a(af af1, String s)
    {
        af1.i = s;
        return s;
    }

    private void a()
    {
        if (!k.b(getActivity()))
        {
            d();
            return;
        } else
        {
            f();
            return;
        }
    }

    static void a(af af1)
    {
        af1.d();
    }

    static void a(af af1, String s, i.a a1)
    {
        af1.a(s, a1);
    }

    private void a(String s, i.a a1)
    {
        if (!k.b(getActivity()))
        {
            k.a(getActivity(), 0x7f07021d, 1);
            d();
        } else
        if (!j.get())
        {
            bolts.j.a(new Callable(s) {

                final String a;
                final af b;

                public CBCollagesResponse a()
                    throws Exception
                {
                    com.cardinalblue.android.piccollage.view.fragments.af.f(b).set(true);
                    com.cardinalblue.android.piccollage.controller.FeedAccessorFactory.FeedAccessor feedaccessor = FeedAccessorFactory.a(4, null);
                    if (TextUtils.isEmpty(a))
                    {
                        return feedaccessor.a();
                    } else
                    {
                        return feedaccessor.a(a);
                    }
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                b = af.this;
                a = s;
                super();
            }
            }).a(new i(a1) {

                final i.a a;
                final af b;

                public Void a(j j1)
                    throws Exception
                {
                    com.cardinalblue.android.piccollage.view.fragments.af.f(b).set(false);
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
                b = af.this;
                a = a1;
                super();
            }
            }, j.b);
            return;
        }
    }

    static boolean a(af af1, Exception exception)
    {
        return af1.a(exception);
    }

    private boolean a(Exception exception)
    {
        if (exception instanceof com.cardinalblue.android.piccollage.controller.network.f.g)
        {
            return true;
        }
        if (exception instanceof com.cardinalblue.android.piccollage.auth.PicAuth.a)
        {
            com.cardinalblue.android.piccollage.a.f.a(exception);
            k.a(getActivity(), 0x7f0700f8, 0);
            return true;
        } else
        {
            return false;
        }
    }

    static String b(af af1)
    {
        return af1.i;
    }

    private void b()
    {
        if (a != null)
        {
            a();
        }
        e();
        c.setVisibility(0);
        d.setVisibility(8);
        c();
    }

    private void b(WebPhoto webphoto)
    {
        String s = webphoto.getId();
        ProgressDialog progressdialog = new ProgressDialog(getActivity());
        progressdialog.setMessage(getString(0x7f0701fa));
        progressdialog.setCancelable(false);
        progressdialog.setCanceledOnTouchOutside(false);
        k.b(getActivity(), progressdialog);
        com.cardinalblue.android.piccollage.a.b.e(webphoto.getId());
        com.cardinalblue.android.piccollage.a.b.aM("template");
        com.android.volley.m.b b1 = new com.android.volley.m.b(progressdialog) {

            final ProgressDialog a;
            final af b;

            public volatile void a(Object obj)
            {
                a((String)obj);
            }

            public void a(String s1)
            {
                k.a(b.getActivity(), a);
                if (TextUtils.isEmpty(s1))
                {
                    break MISSING_BLOCK_LABEL_93;
                }
                s1 = (CollageRoot)CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.V5).a(s1, com/cardinalblue/android/piccollage/model/gson/CollageRoot);
_L1:
                if (s1 == null)
                {
                    break MISSING_BLOCK_LABEL_104;
                }
                try
                {
                    Intent intent = new Intent(b.getActivity(), com/cardinalblue/android/piccollage/activities/PhotoProtoActivity);
                    intent.setAction("com.cardinalblue.piccollage.action.template");
                    intent.putExtra("extra_collage", ServerCollage.a(s1));
                    b.startActivityForResult(intent, 200);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.cardinalblue.android.piccollage.a.f.a(s1);
                }
                break MISSING_BLOCK_LABEL_103;
                s1;
                com.cardinalblue.android.piccollage.a.f.a(s1);
                s1 = null;
                  goto _L1
                return;
                k.a(b.getActivity(), 0x7f0700f8, 0);
                return;
            }

            
            {
                b = af.this;
                a = progressdialog;
                super();
            }
        };
        com.android.volley.m.a a1 = new com.android.volley.m.a(progressdialog) {

            final ProgressDialog a;
            final af b;

            public void a(r r)
            {
                k.a(b.getActivity(), a);
                k.a(b.getActivity(), 0x7f0700f8, 0);
            }

            
            {
                b = af.this;
                a = progressdialog;
                super();
            }
        };
        try
        {
            com.cardinalblue.android.piccollage.controller.network.f.a(getActivity(), s, b1, a1, webphoto.isSquare());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebPhoto webphoto)
        {
            webphoto.printStackTrace();
        }
        k.a(getActivity(), progressdialog);
        k.a(getActivity(), 0x7f0700f8, 0);
    }

    private void c()
    {
        a("", new i.a() {

            final af a;

            public void a(CBCollagesResponse cbcollagesresponse, Exception exception)
            {
                a.h.a();
                if (exception != null)
                {
                    if (!com.cardinalblue.android.piccollage.view.fragments.af.a(a, exception))
                    {
                        com.cardinalblue.android.piccollage.view.fragments.af.a(a);
                        k.a(a.getActivity(), 0x7f0700f8, 1);
                    }
                } else
                if (cbcollagesresponse != null)
                {
                    com.cardinalblue.android.piccollage.view.fragments.af.a(a, cbcollagesresponse.getListRevision());
                    a.a.b(cbcollagesresponse);
                    a.h.setCanLoadMore(a.a.b());
                    af.c(a);
                    return;
                }
            }

            
            {
                a = af.this;
                super();
            }
        });
        g();
    }

    static void c(af af1)
    {
        af1.a();
    }

    private void d()
    {
        e();
        d.setVisibility(0);
        c.setVisibility(8);
    }

    static void d(af af1)
    {
        af1.c();
    }

    private void e()
    {
        boolean flag;
        if (b.getCurrentView().getId() == 0x7f1001b7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            b.showNext();
        }
    }

    static void e(af af1)
    {
        af1.b();
    }

    static AtomicBoolean f(af af1)
    {
        return af1.j;
    }

    private void f()
    {
        boolean flag;
        if (b.getCurrentView().getId() == 0x7f100212)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            b.showNext();
        }
    }

    private void g()
    {
        com.cardinalblue.android.piccollage.controller.network.f.b(getActivity(), "http://cdn.pic-collage.com/photobox/greeting_card_template.json").c(new i() {

            final af a;

            public PhotoboxTemplateList a(j j1)
                throws Exception
            {
                return (PhotoboxTemplateList)k.b(new String(k.a(new FileInputStream((File)j1.e()))), com/cardinalblue/android/piccollage/model/gson/PhotoboxTemplateList);
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = af.this;
                super();
            }
        }).a(new i() {

            final af a;

            public Void a(j j1)
                throws Exception
            {
                if (j1.c() || j1.d())
                {
                    com.cardinalblue.android.piccollage.a.f.a(j1.f());
                    k.a(a.getActivity(), 0x7f07013c, 0);
                    return null;
                } else
                {
                    a.a.a((PhotoboxTemplateList)j1.e());
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = af.this;
                super();
            }
        }, j.b);
    }

    public void a(com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList.PhotoboxTemplate photoboxtemplate)
    {
        com.cardinalblue.android.piccollage.a.b.o(photoboxtemplate.getCategoryName(), photoboxtemplate.getName());
        startActivityForResult(Collage.b(photoboxtemplate).b(getActivity()), 200);
    }

    public void a(WebPhoto webphoto)
    {
        if (!k.b(getActivity()))
        {
            k.a(getActivity(), 0x7f07021d, 1);
            return;
        } else
        {
            b(webphoto);
            return;
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

    public void onActivityResult(int l, int i1, Intent intent)
    {
        l;
        JVM INSTR tableswitch 200 200: default 20
    //                   200 28;
           goto _L1 _L2
_L1:
        super.onActivityResult(l, i1, intent);
_L4:
        return;
_L2:
        if (i1 == -1)
        {
            getActivity().setResult(-1);
            getActivity().finish();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = new y(getActivity(), this);
        setHasOptionsMenu(true);
        layoutinflater = layoutinflater.inflate(0x7f0300d0, viewgroup, false);
        h = (SuperRecyclerView)layoutinflater.findViewById(0x7f1001d6);
        viewgroup = new StaggeredGridLayoutManager(getResources().getInteger(0x7f09001f), 1);
        h.a(new com.cardinalblue.android.piccollage.view.j(getResources().getDimensionPixelSize(0x7f0b0067)));
        h.setLayoutManager(viewgroup);
        c = (ProgressBar)layoutinflater.findViewById(0x7f100213);
        b = (ViewSwitcher)layoutinflater.findViewById(0x7f1001b6);
        h.a(new com.malinskiy.superrecyclerview.a() {

            final af a;

            public void a(int l, int i1, int j1)
            {
                com.cardinalblue.android.piccollage.view.fragments.af.a(a, a.a.a(), new i.a(this) {

                    final _cls1 a;

                    public void a(CBCollagesResponse cbcollagesresponse, Exception exception)
                    {
                        boolean flag1 = true;
                        a.a.h.a();
                        if (exception != null)
                        {
                            if (!com.cardinalblue.android.piccollage.view.fragments.af.a(a.a, exception))
                            {
                                com.cardinalblue.android.piccollage.view.fragments.af.a(a.a);
                                k.a(a.a.getActivity(), 0x7f0700f8, 1);
                            }
                        } else
                        if (cbcollagesresponse != null)
                        {
                            boolean flag2 = cbcollagesresponse.getListRevision().equals(com.cardinalblue.android.piccollage.view.fragments.af.b(a.a));
                            boolean flag;
                            if (a.a.a.getItemCount() == 0)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            com.cardinalblue.android.piccollage.view.fragments.af.a(a.a, cbcollagesresponse.getListRevision());
                            if (flag2 && !flag)
                            {
                                a.a.a.a(cbcollagesresponse);
                                cbcollagesresponse = a.a.h;
                                if (TextUtils.isEmpty(a.a.a.a()))
                                {
                                    flag1 = false;
                                }
                                cbcollagesresponse.setCanLoadMore(flag1);
                                af.c(a.a);
                                return;
                            }
                        }
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            
            {
                a = af.this;
                super();
            }
        }, 1);
        h.a(0x1060015, 0x1060019, 0x1060013, 0x1060017);
        h.setRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {

            final af a;

            public void onRefresh()
            {
                af.d(a);
            }

            
            {
                a = af.this;
                super();
            }
        });
        h.setOnEmptyViewChanged(new com.malinskiy.superrecyclerview.SuperRecyclerView.b() {

            final af a;

            public void a()
            {
                View view = a.h.getEmptyView();
                if (view != null)
                {
                    if ((view = view.findViewById(0x7f1001ae)) != null)
                    {
                        view.setOnClickListener(new android.view.View.OnClickListener(this) {

                            final _cls5 a;

                            public void onClick(View view)
                            {
                                af.e(a.a);
                            }

            
            {
                a = _pcls5;
                super();
            }
                        });
                        return;
                    }
                }
            }

            
            {
                a = af.this;
                super();
            }
        });
        d = layoutinflater.findViewById(0x7f100202);
        e = (ImageView)d.findViewById(0x7f1001ac);
        f = (TextView)d.findViewById(0x7f1001ad);
        g = (Button)d.findViewById(0x7f1001ae);
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final af a;

            public void onClick(View view)
            {
                af.e(a);
            }

            
            {
                a = af.this;
                super();
            }
        });
        e.setImageResource(0x7f020229);
        f.setText(0x7f0700f8);
        g.setText(0x7f070249);
        h.setAdapter(a);
        h.setEmptyInflateId(0x7f0300a8);
        b();
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        h.setOnScrollListener(null);
        h = null;
        a = null;
        com.androidquery.util.a.b(getActivity().getApplicationContext());
    }
}
