// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import bolts.j;
import com.android.volley.c;
import com.android.volley.g;
import com.android.volley.r;
import com.android.volley.toolbox.m;
import com.bumptech.glide.d;
import com.bumptech.glide.request.e;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.lib.i;
import com.cardinalblue.android.piccollage.model.gdata.AlbumFeed;
import com.cardinalblue.android.piccollage.model.gdata.PhotoEntry;
import com.cardinalblue.android.piccollage.model.l;
import com.cardinalblue.android.piccollage.view.CheckableImageView;
import com.google.android.gms.auth.b;
import com.google.android.gms.common.a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseFragmentActivity

public class GooglePlusPhotoListActivity extends BaseFragmentActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{
    private static class a extends ArrayAdapter
    {

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            String s;
            if (view == null)
            {
                view = (CheckableImageView)LayoutInflater.from(getContext()).inflate(0x7f0300d9, viewgroup, false);
            } else
            {
                view = (CheckableImageView)view;
            }
            view.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            viewgroup = (PhotoEntry)getItem(i1);
            s = viewgroup.a();
            com.bumptech.glide.g.b(getContext()).a(s).a(0x7f02021e).a(com.bumptech.glide.load.engine.b.a).a(new e(this, view) {

                final CheckableImageView a;
                final a b;

                public boolean a(com.bumptech.glide.load.resource.a.b b1, String s, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
                {
                    a.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                    return false;
                }

                public volatile boolean a(Exception exception, Object obj, com.bumptech.glide.request.b.j j1, boolean flag)
                {
                    return a(exception, (String)obj, j1, flag);
                }

                public boolean a(Exception exception, String s, com.bumptech.glide.request.b.j j1, boolean flag)
                {
                    return false;
                }

                public volatile boolean a(Object obj, Object obj1, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
                {
                    return a((com.bumptech.glide.load.resource.a.b)obj, (String)obj1, j1, flag, flag1);
                }

            
            {
                b = a1;
                a = checkableimageview;
                super();
            }
            }).a(view);
            view.setChecked(viewgroup.c());
            return view;
        }

        public a(Context context)
        {
            super(context, 0x7f0300d9);
        }
    }


    private ViewSwitcher a;
    private int b;
    private String c;
    private View d;
    private TextView e;
    private a f;
    private MenuItem g;

    public GooglePlusPhotoListActivity()
    {
        b = 30;
    }

    static a a(GooglePlusPhotoListActivity googleplusphotolistactivity)
    {
        return googleplusphotolistactivity.f;
    }

    static l a(GooglePlusPhotoListActivity googleplusphotolistactivity, String s, String s1)
    {
        return googleplusphotolistactivity.a(s, s1);
    }

    private l a(String s, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("No access token for Google");
        }
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Empty album for photos");
        }
        Object obj = Uri.parse((new StringBuilder()).append("https://picasaweb.google.com/data/feed/api/user/default/albumid/").append(s).toString()).buildUpon().appendQueryParameter("alt", "json").appendQueryParameter("max-results", "512").appendQueryParameter("fields", "entry(gphoto:videostatus,media:group(media:content/@url,media:thumbnail/@url))").appendQueryParameter("thumbsize", "160c").appendQueryParameter("access_token", s1).build();
        s = m.a();
        obj = new com.cardinalblue.android.piccollage.model.gdata.AlbumFeed.b(0, ((Uri) (obj)).toString(), null, s, s);
        ((com.cardinalblue.android.piccollage.model.gdata.AlbumFeed.b) (obj)).a(new c(10000, 0, 1.0F));
        try
        {
            s = (AlbumFeed)i.a(this).a(s, ((com.android.volley.toolbox.k) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            g g1 = ((r)s.getCause()).a;
            if (g1 == null)
            {
                return new l("", s);
            }
            int i1 = g1.a;
            if (i1 == 401 || i1 == 403)
            {
                try
                {
                    com.google.android.gms.auth.b.a(this, s1);
                    startActivityForResult(com.google.android.gms.common.a.a(null, null, new String[] {
                        "com.google"
                    }, false, null, null, null, null), 100);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.cardinalblue.android.piccollage.a.f.a(s1);
                    finish();
                }
                return new l("", s);
            } else
            {
                return new l("", s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new l("", s);
        }
        if (s == null)
        {
            return new l("", new Exception("No photos"));
        } else
        {
            return new l(s, null);
        }
    }

    private void a()
    {
        j.a(new Callable() {

            final GooglePlusPhotoListActivity a;

            public String a()
                throws Exception
            {
                return com.google.android.gms.auth.b.a(a, com.cardinalblue.android.piccollage.activities.GooglePlusPhotoListActivity.c(a), "oauth2:https://picasaweb.google.com/data/");
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = GooglePlusPhotoListActivity.this;
                super();
            }
        }).a(new bolts.i() {

            final GooglePlusPhotoListActivity a;

            public l a(j j1)
                throws Exception
            {
                if (j1.d() || j1.c())
                {
                    if (j1.f() instanceof com.google.android.gms.auth.d)
                    {
                        Intent intent = ((com.google.android.gms.auth.d)j1.f()).a();
                        try
                        {
                            a.startActivityForResult(intent, 100);
                        }
                        catch (ActivityNotFoundException activitynotfoundexception)
                        {
                            k.a(a, 0x7f0700f8, 0);
                        }
                    }
                    throw j1.f();
                }
                j1 = com.cardinalblue.android.piccollage.activities.GooglePlusPhotoListActivity.a(a, a.getIntent().getStringExtra("extra_album_id"), (String)j1.e());
                if (j1 == null)
                {
                    throw new IllegalStateException("No result from Google Plus");
                }
                if (((l) (j1)).b != null)
                {
                    throw ((l) (j1)).b;
                } else
                {
                    return j1;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = GooglePlusPhotoListActivity.this;
                super();
            }
        }).a(new bolts.i() {

            final GooglePlusPhotoListActivity a;

            public Object then(j j1)
                throws Exception
            {
                if (j1.d() || j1.c())
                {
                    com.cardinalblue.android.piccollage.a.f.a(j1.f());
                    a.finish();
                } else
                {
                    j1 = (AlbumFeed)((l)j1.e()).a;
                    com.cardinalblue.android.piccollage.activities.GooglePlusPhotoListActivity.a(a).clear();
                    com.cardinalblue.android.piccollage.activities.GooglePlusPhotoListActivity.a(a).addAll(j1.a());
                    com.cardinalblue.android.piccollage.activities.GooglePlusPhotoListActivity.b(a).setDisplayedChild(1);
                }
                return null;
            }

            
            {
                a = GooglePlusPhotoListActivity.this;
                super();
            }
        }, k.a);
    }

    static ViewSwitcher b(GooglePlusPhotoListActivity googleplusphotolistactivity)
    {
        return googleplusphotolistactivity.a;
    }

    private ArrayList b()
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < f.getCount(); i1++)
        {
            PhotoEntry photoentry = (PhotoEntry)f.getItem(i1);
            if (photoentry.c())
            {
                arraylist.add(photoentry);
            }
        }

        return arraylist;
    }

    private int c()
    {
        int i1 = 0;
        int j1;
        int k1;
        for (j1 = 0; i1 < f.getCount(); j1 = k1)
        {
            k1 = j1;
            if (((PhotoEntry)f.getItem(i1)).c())
            {
                k1 = j1 + 1;
            }
            i1++;
        }

        return j1;
    }

    static String c(GooglePlusPhotoListActivity googleplusphotolistactivity)
    {
        return googleplusphotolistactivity.c;
    }

    private void d()
    {
        boolean flag = false;
        int j1 = c();
        if (e != null)
        {
            Object obj = e;
            int i1;
            if (j1 > 0)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((TextView) (obj)).setVisibility(i1);
            e.setText(Integer.toString(j1));
        }
        if (d != null)
        {
            obj = d;
            if (j1 > 0)
            {
                flag = true;
            }
            ((View) (obj)).setEnabled(flag);
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        switch (i1)
        {
        default:
            super.onActivityResult(i1, j1, intent);
            return;

        case 100: // 'd'
            break;
        }
        if (j1 != -1)
        {
            k.a(this, "Authentication error", 0);
            finish();
            return;
        }
        intent = intent.getStringExtra("authAccount");
        if (TextUtils.isEmpty(intent))
        {
            k.a(this, "Authentication error : username is invalid", 0);
            finish();
            return;
        } else
        {
            k.j().edit().putString("pref_google_account_name", intent).apply();
            c = intent;
            com.cardinalblue.android.piccollage.a.b.bb();
            a();
            return;
        }
    }

    public void onClick(View view)
    {
        if (view == null)
        {
            return;
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131755199: 
            onOptionsItemSelected(g);
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030037);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        b = getIntent().getIntExtra("max_choices", 30);
        c = getIntent().getStringExtra("extra_google_account");
        a = (ViewSwitcher)findViewById(0x7f1000c1);
        f = new a(this);
        bundle = (GridView)findViewById(0x7f1000d7);
        bundle.setOnItemClickListener(this);
        bundle.setAdapter(f);
        if (!k.b(this))
        {
            k.a(this, 0x7f07021d, 1);
            finish();
            return;
        }
        if (TextUtils.isEmpty(c))
        {
            finish();
            return;
        } else
        {
            a();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11000e, menu);
        g = menu.findItem(0x7f1002ea);
        menu = MenuItemCompat.getActionView(g);
        d = menu.findViewById(0x7f1000bf);
        d.setOnClickListener(this);
        e = (TextView)menu.findViewById(0x7f1000c0);
        d();
        return true;
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (adapterview == null || view == null)
        {
            return;
        }
        adapterview = (CheckableImageView)view;
        int j1;
        boolean flag;
        if (!adapterview.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = -1;
        }
        if (flag && j1 + c() >= b)
        {
            view = String.format(adapterview.getContext().getString(0x7f0702a4), new Object[] {
                Integer.valueOf(30)
            });
            k.a(adapterview.getContext(), view, 0);
            return;
        } else
        {
            adapterview.setChecked(flag);
            ((PhotoEntry)f.getItem(i1)).a(adapterview.a());
            d();
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 32
    //                   16908332: 38
    //                   2131755754: 44;
           goto _L1 _L2 _L3
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        finish();
_L5:
        return true;
_L3:
        menuitem = new Intent();
        menuitem.putExtra("extra_google_photos", b());
        setResult(-1, menuitem);
        finish();
        if (true) goto _L5; else goto _L4
_L4:
    }
}
