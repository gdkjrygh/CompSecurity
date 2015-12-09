// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import bolts.j;
import com.android.volley.c;
import com.android.volley.g;
import com.android.volley.r;
import com.android.volley.toolbox.m;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.GooglePlusPhotoListActivity;
import com.cardinalblue.android.piccollage.lib.i;
import com.cardinalblue.android.piccollage.model.gdata.AlbumEntry;
import com.cardinalblue.android.piccollage.model.gdata.UserFeed;
import com.google.android.gms.auth.a;
import com.google.android.gms.auth.b;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class d extends Fragment
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{
    private class a extends ArrayAdapter
    {

        final d a;
        private LayoutInflater b;
        private int c;

        public View getView(int l, View view, ViewGroup viewgroup)
        {
            com.cardinalblue.android.piccollage.view.a.a a1;
            String s;
            AlbumEntry albumentry;
            String s1;
            int i1;
            if (view == null)
            {
                view = b.inflate(0x7f030046, viewgroup, false);
                a1 = new com.cardinalblue.android.piccollage.view.a.a(view);
                view.setTag(a1);
            } else
            {
                a1 = (com.cardinalblue.android.piccollage.view.a.a)view.getTag();
                if (a1 == null)
                {
                    view = b.inflate(0x7f030046, viewgroup, false);
                    a1 = new com.cardinalblue.android.piccollage.view.a.a(view);
                }
            }
            albumentry = (AlbumEntry)getItem(l);
            i1 = albumentry.c();
            if (i1 > 1)
            {
                s = (new StringBuilder()).append(i1).append(getContext().getString(0x7f07022c)).toString();
            } else
            {
                s = (new StringBuilder()).append(i1).append(getContext().getString(0x7f070224)).toString();
            }
            s1 = albumentry.d();
            if (TextUtils.isEmpty(s1))
            {
                a1.a.setImageResource(0x7f02021e);
            } else
            {
                com.androidquery.a a2 = new com.androidquery.a(view);
                if (a2.a(l, view, viewgroup, s1))
                {
                    ((com.androidquery.a)a2.b(0x7f100107)).d(0x7f02021e);
                } else
                {
                    ((com.androidquery.a)a2.b(0x7f100107)).a(s1, true, true, c, 0);
                }
            }
            a1.b.setText(albumentry.b());
            a1.c.setVisibility(0);
            a1.c.setText(s);
            return view;
        }

        public a(Context context)
        {
            a = d.this;
            super(context, 0x7f030046);
            b = LayoutInflater.from(context);
            c = context.getResources().getDimensionPixelSize(0x7f0b0137);
        }
    }


    private ListView a;
    private ViewSwitcher b;
    private View c;
    private View d;
    private String e;
    private final android.view.View.OnClickListener f = new android.view.View.OnClickListener() {

        final d a;

        public void onClick(View view)
        {
            d.e(a);
        }

            
            {
                a = d.this;
                super();
            }
    };
    private final android.view.View.OnClickListener g = new android.view.View.OnClickListener() {

        final d a;

        public void onClick(View view)
        {
            if (com.cardinalblue.android.piccollage.view.fragments.d.f(a))
            {
                d.e(a);
            }
        }

            
            {
                a = d.this;
                super();
            }
    };

    public d()
    {
    }

    static UserFeed a(d d1, String s)
        throws ExecutionException, InterruptedException
    {
        return d1.a(s);
    }

    private UserFeed a(String s)
        throws ExecutionException, InterruptedException
    {
        Object obj;
        Object obj1;
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("No access token for Google");
        }
        obj1 = Uri.parse("https://picasaweb.google.com/data/feed/api/user/default").buildUpon().appendQueryParameter("alt", "json").appendQueryParameter("access_token", s).build();
        obj = m.a();
        obj1 = new com.cardinalblue.android.piccollage.model.gdata.UserFeed.b(0, ((Uri) (obj1)).toString(), null, ((com.android.volley.m.b) (obj)), ((com.android.volley.m.a) (obj)));
        ((com.cardinalblue.android.piccollage.model.gdata.UserFeed.b) (obj1)).a(new c(10000, 0, 1.0F));
        obj = (UserFeed)i.a(getActivity()).a(((m) (obj)), ((com.android.volley.toolbox.k) (obj1)));
        return ((UserFeed) (obj));
        ExecutionException executionexception;
        executionexception;
        g g1 = ((r)executionexception.getCause()).a;
        if (g1 == null)
        {
            throw executionexception;
        }
        int l = g1.a;
        if (l != 401 && l != 403)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        com.google.android.gms.auth.b.a(getActivity(), s);
        if (a())
        {
            b();
        }
_L2:
        throw executionexception;
        s;
_L3:
        com.cardinalblue.android.piccollage.a.f.a(s);
        if (true) goto _L2; else goto _L1
_L1:
        s;
          goto _L3
    }

    static void a(d d1)
    {
        d1.d();
    }

    private boolean a()
    {
        if (!k.b(getActivity()))
        {
            k.a(getActivity(), 0x7f07021d, 0);
            return false;
        }
        if (e == null)
        {
            Intent intent = com.google.android.gms.common.a.a(null, null, new String[] {
                "com.google"
            }, false, null, null, null, null);
            try
            {
                startActivityForResult(intent, 300);
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                k.a(getActivity(), 0x7f0700f8, 0);
                return false;
            }
            return false;
        } else
        {
            return true;
        }
    }

    static ListView b(d d1)
    {
        return d1.a;
    }

    private void b()
    {
        if (e == null)
        {
            d();
            return;
        } else
        {
            e();
            j.a(new Callable() {

                final d a;

                public String a()
                    throws Exception
                {
                    return com.google.android.gms.auth.b.a(a.getActivity(), d.d(a), "oauth2:https://picasaweb.google.com/data/");
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = d.this;
                super();
            }
            }).a(new bolts.i() {

                final d a;

                public UserFeed a(j j1)
                    throws Exception
                {
                    if (j1.d() || j1.c())
                    {
                        if (j1.f() instanceof com.google.android.gms.auth.d)
                        {
                            Intent intent = ((com.google.android.gms.auth.d)j1.f()).a();
                            try
                            {
                                a.startActivityForResult(intent, 300);
                            }
                            catch (ActivityNotFoundException activitynotfoundexception)
                            {
                                k.a(a.getActivity(), 0x7f0700f8, 0);
                            }
                        }
                        throw j1.f();
                    }
                    j1 = (String)j1.e();
                    if (TextUtils.isEmpty(j1))
                    {
                        throw new IllegalStateException("No return information for Google authentication");
                    } else
                    {
                        return com.cardinalblue.android.piccollage.view.fragments.d.a(a, j1);
                    }
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                a = d.this;
                super();
            }
            }).a(new bolts.i() {

                final d a;

                public Void a(j j1)
                    throws Exception
                {
                    if (j1.d() || j1.c())
                    {
                        com.cardinalblue.android.piccollage.a.f.a(j1.f());
                        Toast.makeText(a.getActivity(), a.getString(0x7f0700f8), 0).show();
                        com.cardinalblue.android.piccollage.view.fragments.d.a(a);
                    } else
                    {
                        j1 = (UserFeed)j1.e();
                        a a1 = (a)com.cardinalblue.android.piccollage.view.fragments.d.b(a).getAdapter();
                        a1.clear();
                        a1.addAll(j1.a());
                        com.cardinalblue.android.piccollage.view.fragments.d.c(a);
                    }
                    return null;
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                a = d.this;
                super();
            }
            }, k.a);
            return;
        }
    }

    private String c()
    {
        return k.j().getString("pref_google_account_name", null);
    }

    static void c(d d1)
    {
        d1.g();
    }

    static String d(d d1)
    {
        return d1.e;
    }

    private void d()
    {
        f();
        c.setVisibility(0);
        d.setVisibility(8);
        Button button = (Button)c.findViewById(0x7f1001ae);
        ImageView imageview = (ImageView)c.findViewById(0x7f1001ac);
        if (!k.b(getActivity()))
        {
            imageview.setImageResource(0x7f020227);
            button.setText(0x7f070249);
            button.setBackgroundResource(0x7f02028e);
            button.setOnClickListener(f);
            return;
        } else
        {
            imageview.setImageResource(0x7f020223);
            button.setText(0x7f070119);
            button.setBackgroundResource(0x7f020291);
            button.setOnClickListener(g);
            return;
        }
    }

    private void e()
    {
        f();
        d.setVisibility(0);
        c.setVisibility(8);
    }

    static void e(d d1)
    {
        d1.b();
    }

    private void f()
    {
        if (b.getDisplayedChild() != 0)
        {
            b.showNext();
        }
    }

    static boolean f(d d1)
    {
        return d1.a();
    }

    private void g()
    {
        if (b.getDisplayedChild() != 1)
        {
            b.showNext();
        }
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        l;
        JVM INSTR tableswitch 300 300: default 20
    //                   300 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (i1 != -1)
        {
            k.a(getActivity(), "Authentication error", 0);
            d();
            return;
        }
        intent = intent.getStringExtra("authAccount");
        if (TextUtils.isEmpty(intent))
        {
            k.a(getActivity(), "Authentication error : username is invalid", 0);
            d();
            return;
        }
        k.j().edit().putString("pref_google_account_name", intent).apply();
        e = intent;
        com.cardinalblue.android.piccollage.a.b.bb();
        if (a())
        {
            b();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onClick(View view)
    {
        if (!k.b(getActivity()))
        {
            k.a(getActivity(), 0x7f07021d, 1);
        } else
        if (a())
        {
            b();
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(0x7f0300b2, viewgroup, false);
        b = (ViewSwitcher)layoutinflater.findViewById(0x7f1000c1);
        c = layoutinflater.findViewById(0x7f1001bb);
        d = layoutinflater.findViewById(0x7f10019b);
        ((Button)layoutinflater.findViewById(0x7f1001ae)).setOnClickListener(this);
        a = (ListView)layoutinflater.findViewById(0x102000a);
        a.setAdapter(new a(getActivity()));
        a.setOnItemClickListener(this);
        e = c();
        if (e == null)
        {
            d();
            return layoutinflater;
        } else
        {
            e();
            j.a(new Callable() {

                final d a;

                public String a()
                    throws Exception
                {
                    return com.google.android.gms.auth.b.a(a.getActivity(), d.d(a), "oauth2:https://picasaweb.google.com/data/");
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = d.this;
                super();
            }
            }).c(new bolts.i() {

                final d a;

                public UserFeed a(j j1)
                    throws Exception
                {
                    return com.cardinalblue.android.piccollage.view.fragments.d.a(a, (String)j1.e());
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                a = d.this;
                super();
            }
            }).a(new bolts.i() {

                final d a;

                public Void a(j j1)
                    throws Exception
                {
                    if (j1.d() || j1.c())
                    {
                        com.cardinalblue.android.piccollage.a.f.a(j1.f());
                        com.cardinalblue.android.piccollage.view.fragments.d.a(a);
                    } else
                    {
                        j1 = (UserFeed)j1.e();
                        a a1 = (a)com.cardinalblue.android.piccollage.view.fragments.d.b(a).getAdapter();
                        a1.clear();
                        a1.addAll(j1.a());
                        com.cardinalblue.android.piccollage.view.fragments.d.c(a);
                    }
                    return null;
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                a = d.this;
                super();
            }
            }, k.a);
            return layoutinflater;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int l, long l1)
    {
        adapterview = (AlbumEntry)a.getAdapter().getItem(l);
        view = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/GooglePlusPhotoListActivity);
        view.putExtra("extra_album_id", adapterview.a());
        view.putExtra("max_choices", getArguments().getInt("max_choices"));
        view.putExtra("extra_google_account", e);
        getActivity().startActivityForResult(view, 301);
    }
}
