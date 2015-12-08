// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.CustomFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bolts.j;
import com.android.volley.r;
import com.androidquery.a;
import com.androidquery.callback.BitmapAjaxCallback;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import com.cardinalblue.android.piccollage.controller.a.f;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.i;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.view.fragments.e;
import com.cardinalblue.android.piccollage.view.fragments.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseShareActivity, EchoesListActivity, HomeActivity, PicProfileActivity

public class PublicCollageActivity extends BaseShareActivity
    implements android.support.v4.view.ViewPager.OnPageChangeListener, com.cardinalblue.android.piccollage.controller.a.f.a
{
    public static class a extends com.cardinalblue.android.piccollage.controller.a.a
    {

        private a a;

        protected transient Boolean a(String as[])
        {
            try
            {
                com.cardinalblue.android.piccollage.controller.network.f.m(as[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                return Boolean.valueOf(false);
            }
            return Boolean.valueOf(true);
        }

        public void a(a a1)
        {
            a = a1;
        }

        protected void a(Boolean boolean1)
        {
label0:
            {
                super.onPostExecute(boolean1);
                if (a != null)
                {
                    if (!boolean1.booleanValue())
                    {
                        break label0;
                    }
                    a.a();
                }
                return;
            }
            a.b();
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((String[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((Boolean)obj);
        }

        protected void onPreExecute()
        {
            a("");
        }

        protected a(Context context)
        {
            super(context);
        }
    }

    public static interface a.a
    {

        public abstract void a();

        public abstract void b();
    }

    public static class b extends CustomFragmentStatePagerAdapter
    {

        private final ArrayList a = new ArrayList();
        private final Context b;
        private final d.a c;
        private final uk.co.senab.photoview.PhotoViewAttacher.b d;

        public WebPhoto a(int i1)
        {
            if (i1 < a.size())
            {
                return ((d)a.get(i1)).a;
            } else
            {
                return null;
            }
        }

        public WebPhoto a(String s1)
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext();)
            {
                d d1 = (d)iterator.next();
                if (d1.equals(s1))
                {
                    return d1.a;
                }
            }

            return null;
        }

        public void a()
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((d)iterator.next()).a()) { }
        }

        public void a(WebPhoto webphoto)
        {
            a.add(new d(webphoto, b, c));
        }

        public void a(String s1, String s2, String s3)
        {
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                d d1 = (d)iterator.next();
                if (d1.equals(s1))
                {
                    d1.a(s2, s3);
                }
            } while (true);
        }

        public void b(int i1)
            throws IllegalStateException
        {
            d d1 = (d)a.remove(i1);
            if (d1 != null)
            {
                d1.a();
            }
            notifyDataSetChanged();
        }

        public void b(String s1)
        {
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                d d1 = (d)iterator.next();
                if (d1.equals(s1))
                {
                    d1.b();
                }
            } while (true);
        }

        public boolean b(WebPhoto webphoto)
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext();)
            {
                WebPhoto webphoto1 = ((d)iterator.next()).a;
                if (webphoto1.equals(webphoto))
                {
                    webphoto1.setLikeNum(webphoto.getLikeNum());
                    webphoto1.setIsLiked(webphoto.isLiked());
                    webphoto1.setEchoesNum(webphoto.getEchoesNum());
                    webphoto1.updateUser(webphoto.getUser());
                    return true;
                }
            }

            return false;
        }

        public int getCount()
        {
            return a.size();
        }

        public Fragment getItem(int i1)
        {
            WebPhoto webphoto = ((d)a.get(i1)).a;
            k k1 = com.cardinalblue.android.piccollage.view.fragments.k.a(webphoto, i1);
            k1.a(d);
            if (PublicCollageActivity.m((PublicCollageActivity)b).containsKey(webphoto.getId()))
            {
                bolts.j.a(new Callable(this, k1) {

                    final k a;
                    final b b;

                    public Object call()
                        throws Exception
                    {
                        a.a(0x7f07013b);
                        return null;
                    }

            
            {
                b = b1;
                a = k1;
                super();
            }
                }, j.b);
            }
            return k1;
        }

        public int getItemPosition(Object obj)
        {
            return -2;
        }

        public String getItemTag(int i1)
        {
            return ((d)a.get(i1)).a.getId();
        }

        public b(FragmentManager fragmentmanager, Context context, List list, d.a a1, uk.co.senab.photoview.PhotoViewAttacher.b b1)
        {
            super(fragmentmanager);
            b = context;
            c = a1;
            d = b1;
            fragmentmanager = list.iterator();
            do
            {
                if (!fragmentmanager.hasNext())
                {
                    break;
                }
                context = (WebPhoto)fragmentmanager.next();
                if (!context.isAd())
                {
                    a.add(new d(context, b, c));
                }
            } while (true);
        }
    }

    public static class c extends com.cardinalblue.android.piccollage.controller.a.a
    {

        private a a;

        protected transient Boolean a(String as[])
        {
            try
            {
                com.cardinalblue.android.piccollage.controller.network.f.n(as[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                return Boolean.valueOf(false);
            }
            return Boolean.valueOf(true);
        }

        public void a(a a1)
        {
            a = a1;
        }

        protected void a(Boolean boolean1)
        {
label0:
            {
                super.onPostExecute(boolean1);
                if (a != null)
                {
                    if (!boolean1.booleanValue())
                    {
                        break label0;
                    }
                    a.a();
                }
                return;
            }
            a.b();
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((String[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((Boolean)obj);
        }

        protected void onPreExecute()
        {
            a(c.getString(0x7f070246));
        }

        protected c(Context context)
        {
            super(context);
        }
    }

    public static interface c.a
    {

        public abstract void a();

        public abstract void b();
    }

    static class d
    {

        public final WebPhoto a;
        private final Context b;
        private a c;
        private final String d;

        static Context a(d d1)
        {
            return d1.b;
        }

        static void a(d d1, String s1)
        {
            d1.b(s1);
        }

        private void a(String s1)
        {
            c(s1);
            b(s1);
        }

        static void b(d d1, String s1)
        {
            d1.a(s1);
        }

        private void b(String s1)
        {
            if (c != null)
            {
                c.a(s1);
            }
        }

        private boolean c(String s1)
        {
            if (equals(s1))
            {
                a.toggleIsLiked();
                return true;
            } else
            {
                return false;
            }
        }

        public void a()
        {
            com.cardinalblue.android.piccollage.lib.i.a(b).a(d);
            c = null;
        }

        public void a(String s1, String s2)
        {
            if (c != null)
            {
                c.a(a, s1, s2);
            }
        }

        public void b()
        {
            if (!com.cardinalblue.android.b.k.b(b))
            {
                com.cardinalblue.android.b.k.a(b, 0x7f07021d, 0);
                return;
            }
            a.toggleIsLiked();
            if (c != null)
            {
                c.a(a.getId());
            }
            com.cardinalblue.android.piccollage.lib.i.a(b).a(d);
            String s1 = a.getId();
            com.cardinalblue.android.piccollage.controller.network.f.a(b, s1, a.isLiked(), d, new com.android.volley.m.b(this) {

                final d a;

                public volatile void a(Object obj)
                {
                    a((String)obj);
                }

                public void a(String s1)
                {
                    try
                    {
                        s1 = com.cardinalblue.android.piccollage.controller.network.f.b(s1);
                        if (a.a.equals(s1))
                        {
                            a.a.setLikeNum(s1.getLikeNum());
                            a.a.setIsLiked(s1.isLiked());
                            com.cardinalblue.android.piccollage.activities.d.a(a, a.a.getId());
                        }
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s1)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(s1);
                    }
                }

            
            {
                a = d1;
                super();
            }
            }, new com.android.volley.m.a(this, s1) {

                final String a;
                final d b;

                public void a(r r1)
                {
                    com.cardinalblue.android.b.k.a(com.cardinalblue.android.piccollage.activities.d.a(b), 0x7f0701f8, 0);
                    com.cardinalblue.android.piccollage.activities.d.b(b, a);
                    com.cardinalblue.android.piccollage.a.f.a(r1);
                }

            
            {
                b = d1;
                a = s1;
                super();
            }
            });
        }

        public boolean equals(Object obj)
        {
            return a.getId().equals(obj);
        }

        d(WebPhoto webphoto, Context context, a a1)
        {
            a = webphoto;
            b = context;
            c = a1;
            d = webphoto.getId();
        }
    }

    public static interface d.a
    {

        public abstract void a(WebPhoto webphoto, String s1, String s2);

        public abstract void a(String s1);
    }


    private String A;
    private final android.view.MenuItem.OnMenuItemClickListener B = new android.view.MenuItem.OnMenuItemClickListener() {

        final PublicCollageActivity a;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            menuitem = com.cardinalblue.android.piccollage.view.fragments.e.a(null, a.getString(0x7f0700fe), a.getString(0x104000a), new android.content.DialogInterface.OnClickListener(this) {

                final _cls2 a;

                public void onClick(DialogInterface dialoginterface, int i1)
                {
                    dialoginterface = null;
                    String s1 = a.a.r();
                    dialoginterface = s1;
_L2:
                    if (dialoginterface == null)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException("Cannot get collage to delete"));
                        return;
                    } else
                    {
                        com.cardinalblue.android.piccollage.a.b.j("delete");
                        com.cardinalblue.android.piccollage.a.b.t();
                        a.a a1 = new a.a(this) {

                            final _cls1 a;

                            public void a()
                            {
                                int j1 = PublicCollageActivity.g(a.a.a).getCurrentItem();
                                com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(a.a.a).b(j1);
                                PublicCollageActivity.h(a.a.a).deletePhoto(j1);
                                int i1 = j1;
                                if (j1 > com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(a.a.a).getCount())
                                {
                                    i1 = com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(a.a.a).getCount();
                                }
                                if (com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(a.a.a).getCount() == 0)
                                {
                                    a.a.a.finish();
                                    return;
                                }
                                try
                                {
                                    PublicCollageActivity.g(a.a.a).setCurrentItem(i1);
                                    com.cardinalblue.android.piccollage.activities.PublicCollageActivity.a(a.a.a, com.cardinalblue.android.piccollage.activities.PublicCollageActivity.i(a.a.a));
                                    return;
                                }
                                catch (IllegalStateException illegalstateexception)
                                {
                                    com.cardinalblue.android.piccollage.a.f.a(illegalstateexception);
                                }
                                return;
                            }

                            public void b()
                            {
                                com.cardinalblue.android.b.k.a(a.a.a, 0x7f0700df, 0);
                            }

            
            {
                a = _pcls1;
                super();
            }
                        };
                        a a2 = new a(a.a);
                        a2.a(a1);
                        a2.a(new String[] {
                            dialoginterface
                        });
                        return;
                    }
                    IllegalStateException illegalstateexception;
                    illegalstateexception;
                    if (true) goto _L2; else goto _L1
_L1:
                }

            
            {
                a = _pcls2;
                super();
            }
            }, a.getString(0x1040000), null);
            com.cardinalblue.android.b.k.a(a, menuitem, "confirm_collage_deletion");
            return true;
        }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
    };
    private final android.view.MenuItem.OnMenuItemClickListener C = new android.view.MenuItem.OnMenuItemClickListener() {

        final PublicCollageActivity a;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            menuitem = com.cardinalblue.android.piccollage.view.fragments.e.a(null, a.getString(0x7f0700ff), a.getString(0x104000a), new android.content.DialogInterface.OnClickListener(this) {

                final _cls3 a;

                public void onClick(DialogInterface dialoginterface, int i1)
                {
                    dialoginterface = null;
                    String s1 = a.a.r();
                    dialoginterface = s1;
_L2:
                    if (dialoginterface == null)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException("Cannot get collage to flag"));
                        return;
                    } else
                    {
                        com.cardinalblue.android.piccollage.a.b.j("flag");
                        com.cardinalblue.android.piccollage.a.b.i("success");
                        c.a a1 = new c.a(this) {

                            final _cls1 a;

                            public void a()
                            {
                                com.cardinalblue.android.b.k.a(a.a.a, 0x7f070245, 0);
                            }

                            public void b()
                            {
                            }

            
            {
                a = _pcls1;
                super();
            }
                        };
                        c c1 = new c(a.a);
                        c1.a(a1);
                        c1.a(new String[] {
                            dialoginterface
                        });
                        return;
                    }
                    IllegalStateException illegalstateexception;
                    illegalstateexception;
                    if (true) goto _L2; else goto _L1
_L1:
                }

            
            {
                a = _pcls3;
                super();
            }
            }, a.getString(0x1040000), null);
            com.cardinalblue.android.b.k.a(a, menuitem, "confirm_collage_report");
            return true;
        }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener D = new android.view.View.OnClickListener() {

        final PublicCollageActivity a;

        public void onClick(View view)
        {
            WebPhoto webphoto = null;
            PicAuth picauth = PicAuth.h();
            WebPhoto webphoto1;
            try
            {
                view = a.r();
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                view = null;
                continue; /* Loop/switch isn't completed */
            }
            webphoto1 = com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(a).a(view);
            webphoto = webphoto1;
_L2:
            if (view == null || webphoto == null)
            {
                com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException("Cannot get collage to like"));
                return;
            }
            if (!webphoto.isLiked())
            {
                com.cardinalblue.android.piccollage.a.f.a(a, webphoto.getId());
                com.cardinalblue.android.piccollage.a.b.a(com.cardinalblue.android.piccollage.activities.PublicCollageActivity.j(a), "0");
            } else
            {
                com.cardinalblue.android.piccollage.a.b.g(com.cardinalblue.android.piccollage.activities.PublicCollageActivity.j(a));
            }
            if (picauth.b())
            {
                com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(a).b(view);
                return;
            } else
            {
                view = new Intent(a, com/cardinalblue/android/piccollage/auth/PicLoginActivity);
                view.putExtra("from", "like");
                a.startActivityForResult(view, 0);
                return;
            }
            IllegalStateException illegalstateexception;
            illegalstateexception;
            if (true) goto _L2; else goto _L1
_L1:
        }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener E = new android.view.View.OnClickListener() {

        final PublicCollageActivity a;

        public void onClick(View view)
        {
            WebPhoto webphoto = null;
            WebPhoto webphoto1;
            try
            {
                view = a.r();
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                view = null;
                continue; /* Loop/switch isn't completed */
            }
            webphoto1 = com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(a).a(view);
            webphoto = webphoto1;
_L2:
            if (view == null || webphoto == null)
            {
                com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException("Cannot get collage to echo"));
                return;
            } else
            {
                com.cardinalblue.android.piccollage.activities.PublicCollageActivity.a(a, view, com.cardinalblue.android.piccollage.activities.PublicCollageActivity.j(a));
                return;
            }
            IllegalStateException illegalstateexception;
            illegalstateexception;
            if (true) goto _L2; else goto _L1
_L1:
        }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
    };
    private AtomicBoolean F;
    private Map i;
    private b j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private ImageButton q;
    private ImageButton r;
    private MenuItem s;
    private f t;
    private LinearLayout u;
    private ViewPager v;
    private com.cardinalblue.android.piccollage.controller.FeedAccessorFactory.FeedAccessor w;
    private MenuItem x;
    private MenuItem y;
    private CBCollagesResponse z;

    public PublicCollageActivity()
    {
        i = new HashMap();
        F = new AtomicBoolean(false);
    }

    private void A()
    {
        l.setMaxLines(100);
    }

    private void B()
    {
        l.setMaxLines(1);
    }

    private void C()
    {
        WebPhoto webphoto;
label0:
        {
            if (x != null)
            {
                webphoto = D();
                if (webphoto != null)
                {
                    break label0;
                }
                x.setVisible(false);
            }
            return;
        }
        boolean flag = webphoto.getUser().isMe();
        boolean flag1 = PicAuth.h().b();
        x.setVisible(true);
        if (flag1 && flag)
        {
            x.setTitle(0x7f070122);
            x.setOnMenuItemClickListener(B);
            return;
        } else
        {
            x.setTitle(0x7f070244);
            x.setOnMenuItemClickListener(C);
            return;
        }
    }

    private WebPhoto D()
    {
        if (j == null || v == null)
        {
            return null;
        } else
        {
            return j.a(v.getCurrentItem());
        }
    }

    private k E()
    {
        String s1 = j.getItemTag(v.getCurrentItem());
        return (k)getSupportFragmentManager().findFragmentByTag(s1);
    }

    private void F()
    {
        WebPhoto webphoto = D();
        if (webphoto != null)
        {
            int i1 = webphoto.getLikeNum();
            m.setText(Integer.toString(i1));
            n.setText(getResources().getQuantityString(0x7f080007, i1));
            ImageButton imagebutton = q;
            if (webphoto.isLiked())
            {
                i1 = 0x7f020137;
            } else
            {
                i1 = 0x7f020136;
            }
            imagebutton.setImageResource(i1);
        }
    }

    private void G()
    {
        WebPhoto webphoto = D();
        if (webphoto != null)
        {
            int i1 = webphoto.getEchoesNum();
            o.setText(Integer.toString(i1));
            p.setText(getResources().getQuantityString(0x7f080009, i1));
        }
    }

    private void H()
    {
        if (D() == null)
        {
            return;
        }
        if (t != null && t.getStatus() == android.os.AsyncTask.Status.RUNNING)
        {
            t.cancel(true);
            t.a(null, false);
        }
        t = new f();
        t.a(this, true);
        t.a(new String[] {
            D().getId(), PicAuth.h().d()
        });
        C();
    }

    private void I()
    {
        String s1;
        for (s1 = z.getNextPageUrl(); TextUtils.isEmpty(s1) || w == null || F.get();)
        {
            return;
        }

        try
        {
            c(s1);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            com.cardinalblue.android.piccollage.a.f.a(illegalargumentexception);
        }
    }

    private void J()
    {
        WebPhoto webphoto = D();
        if (webphoto != null)
        {
            Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/EchoesListActivity);
            intent.putExtra("extra_webphoto", webphoto);
            intent.putExtra("start_from", A);
            startActivity(intent);
        }
    }

    private Bitmap a(k k1)
    {
        return k1.b();
    }

    static TextView a(PublicCollageActivity publiccollageactivity)
    {
        return publiccollageactivity.l;
    }

    static void a(PublicCollageActivity publiccollageactivity, WebPhoto webphoto)
    {
        publiccollageactivity.c(webphoto);
    }

    static void a(PublicCollageActivity publiccollageactivity, String s1, String s2)
    {
        publiccollageactivity.a(s1, s2);
    }

    private void a(String s1, String s2)
    {
        ProgressDialog progressdialog = new ProgressDialog(this);
        progressdialog.setMessage(getString(0x7f0701fa));
        progressdialog.setCancelable(false);
        progressdialog.setCanceledOnTouchOutside(false);
        com.cardinalblue.android.b.k.b(this, progressdialog);
        s2 = new com.android.volley.m.b(progressdialog, s1, s2) {

            final ProgressDialog a;
            final String b;
            final String c;
            final PublicCollageActivity d;

            public volatile void a(Object obj)
            {
                a((String)obj);
            }

            public void a(String s3)
            {
                com.cardinalblue.android.b.k.a(d, a);
                if (TextUtils.isEmpty(s3))
                {
                    com.cardinalblue.android.b.k.a(d, 0x7f0700f8, 0);
                    return;
                } else
                {
                    com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(d).a(b, c, s3);
                    return;
                }
            }

            
            {
                d = PublicCollageActivity.this;
                a = progressdialog;
                b = s1;
                c = s2;
                super();
            }
        };
        com.android.volley.m.a a1 = new com.android.volley.m.a(progressdialog) {

            final ProgressDialog a;
            final PublicCollageActivity b;

            public void a(r r1)
            {
                com.cardinalblue.android.b.k.a(b, a);
                try
                {
                    com.cardinalblue.android.piccollage.controller.network.f.a(r1);
                }
                // Misplaced declaration of an exception variable
                catch (r r1)
                {
                    com.cardinalblue.android.piccollage.a.f.a(r1);
                }
                com.cardinalblue.android.b.k.a(b, 0x7f0700f8, 0);
            }

            
            {
                b = PublicCollageActivity.this;
                a = progressdialog;
                super();
            }
        };
        try
        {
            com.cardinalblue.android.piccollage.controller.network.f.c(this, s1, s2, a1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
        com.cardinalblue.android.b.k.a(this, progressdialog);
        com.cardinalblue.android.b.k.a(this, 0x7f0700f8, 0);
    }

    private boolean a(String s1)
    {
        WebPhoto webphoto = D();
        return webphoto != null && webphoto.getId().equals(s1);
    }

    static void b(PublicCollageActivity publiccollageactivity)
    {
        publiccollageactivity.A();
    }

    private void b(String s1)
    {
        if (s != null)
        {
            s.setVisible(true);
            ImageView imageview = (ImageView)MenuItemCompat.getActionView(s).findViewById(0x7f1000be);
            (new com.androidquery.a(imageview)).a(s1, false, true, imageview.getWidth(), 0x7f020224);
        }
    }

    static void c(PublicCollageActivity publiccollageactivity)
    {
        publiccollageactivity.B();
    }

    private void c(WebPhoto webphoto)
    {
        String s1;
        if (webphoto == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        s1 = webphoto.getCaption();
        TextView textview = l;
        Object obj;
        if (TextUtils.isEmpty(s1))
        {
            obj = "";
        } else
        {
            obj = s1;
        }
        textview.setText(((CharSequence) (obj)));
        obj = l;
        byte byte0;
        if (TextUtils.isEmpty(s1))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        try
        {
            ((TextView) (obj)).setVisibility(byte0);
        }
        catch (StringIndexOutOfBoundsException stringindexoutofboundsexception)
        {
            l.setVisibility(8);
        }
        F();
        G();
        obj = webphoto.getUser();
        if (obj != null && ((PicUser) (obj)).isValid())
        {
            s1 = webphoto.getUser().getDisplayName();
            if (k != null)
            {
                TextView textview1 = k;
                obj = s1;
                if (TextUtils.isEmpty(s1))
                {
                    obj = "";
                }
                textview1.setText(((CharSequence) (obj)));
            }
            b(webphoto.getUser().getProfileImageUrl());
        } else
        if (s != null)
        {
            s.setVisible(false);
            return;
        }
    }

    private void c(String s1)
    {
        bolts.j.a(new Callable(s1) {

            final String a;
            final PublicCollageActivity b;

            public CBCollagesResponse a()
                throws Exception
            {
                com.cardinalblue.android.piccollage.activities.PublicCollageActivity.k(b).set(true);
                if (TextUtils.isEmpty(a))
                {
                    return PublicCollageActivity.l(b).a();
                } else
                {
                    return com.cardinalblue.android.piccollage.controller.network.f.i(a);
                }
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = PublicCollageActivity.this;
                a = s1;
                super();
            }
        }).a(new bolts.i() {

            final PublicCollageActivity a;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.activities.PublicCollageActivity.k(a).set(false);
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
                a = PublicCollageActivity.this;
                super();
            }
        }, j.b);
    }

    private void c(boolean flag)
    {
        boolean flag1 = false;
        if (x != null)
        {
            x.setVisible(flag);
        }
        if (y != null)
        {
            y.setVisible(flag);
        }
        int i1;
        if (s != null)
        {
            Object obj = D();
            if (obj != null && !((WebPhoto) (obj)).getUser().isValid())
            {
                s.setVisible(false);
            } else
            {
                s.setVisible(flag);
            }
        }
        obj = l;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((TextView) (obj)).setVisibility(i1);
        obj = m;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((TextView) (obj)).setVisibility(i1);
        obj = n;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((TextView) (obj)).setVisibility(i1);
        obj = q;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((ImageButton) (obj)).setVisibility(i1);
        obj = o;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((TextView) (obj)).setVisibility(i1);
        obj = p;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((TextView) (obj)).setVisibility(i1);
        obj = r;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((ImageButton) (obj)).setVisibility(i1);
        obj = f;
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 4;
        }
        ((ImageButton) (obj)).setVisibility(i1);
    }

    static void d(PublicCollageActivity publiccollageactivity)
    {
        publiccollageactivity.J();
    }

    static void e(PublicCollageActivity publiccollageactivity)
    {
        publiccollageactivity.F();
    }

    static b f(PublicCollageActivity publiccollageactivity)
    {
        return publiccollageactivity.j;
    }

    static ViewPager g(PublicCollageActivity publiccollageactivity)
    {
        return publiccollageactivity.v;
    }

    static CBCollagesResponse h(PublicCollageActivity publiccollageactivity)
    {
        return publiccollageactivity.z;
    }

    static WebPhoto i(PublicCollageActivity publiccollageactivity)
    {
        return publiccollageactivity.D();
    }

    static String j(PublicCollageActivity publiccollageactivity)
    {
        return publiccollageactivity.A;
    }

    static AtomicBoolean k(PublicCollageActivity publiccollageactivity)
    {
        return publiccollageactivity.F;
    }

    static com.cardinalblue.android.piccollage.controller.FeedAccessorFactory.FeedAccessor l(PublicCollageActivity publiccollageactivity)
    {
        return publiccollageactivity.w;
    }

    static Map m(PublicCollageActivity publiccollageactivity)
    {
        return publiccollageactivity.i;
    }

    private void y()
    {
        try
        {
            if (android.os.Build.VERSION.SDK_INT < 17)
            {
                Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/AndroidEmoji.ttf");
                l.setTypeface(typeface);
            }
            return;
        }
        catch (Exception exception)
        {
            com.cardinalblue.android.piccollage.a.f.a(exception);
        }
    }

    private void z()
    {
        Intent intent = new Intent();
        intent.putExtra("web_photos_data", z);
        setResult(-1, intent);
    }

    protected net.a.a.c.a a(ArrayList arraylist)
    {
        return new net.a.a.c.a(arraylist) {

            final ArrayList a;
            final PublicCollageActivity b;

            public void a(net.a.a.c c1, int i1, int j1, ImageView imageview, TextView textview)
            {
                com.cardinalblue.android.piccollage.a.b.h(com.cardinalblue.android.piccollage.a.f.a(j1, null));
                j1;
                JVM INSTR tableswitch 1 12: default 72
            //                           1 92
            //                           2 72
            //                           3 110
            //                           4 116
            //                           5 128
            //                           6 86
            //                           7 72
            //                           8 104
            //                           9 72
            //                           10 72
            //                           11 122
            //                           12 98;
                   goto _L1 _L2 _L1 _L3 _L4 _L5 _L6 _L1 _L7 _L1 _L1 _L8 _L9
_L1:
                b.a(j1, a, i1);
                return;
_L6:
                com.cardinalblue.android.piccollage.a.b.p();
                continue; /* Loop/switch isn't completed */
_L2:
                com.cardinalblue.android.piccollage.a.b.o();
                continue; /* Loop/switch isn't completed */
_L9:
                com.cardinalblue.android.piccollage.a.b.q();
                continue; /* Loop/switch isn't completed */
_L7:
                com.cardinalblue.android.piccollage.a.b.r();
                continue; /* Loop/switch isn't completed */
_L3:
                com.cardinalblue.android.piccollage.a.b.m();
                continue; /* Loop/switch isn't completed */
_L4:
                com.cardinalblue.android.piccollage.a.b.n();
                continue; /* Loop/switch isn't completed */
_L8:
                com.cardinalblue.android.piccollage.a.b.l();
                continue; /* Loop/switch isn't completed */
_L5:
                com.cardinalblue.android.piccollage.a.b.s();
                if (true) goto _L1; else goto _L10
_L10:
            }

            
            {
                b = PublicCollageActivity.this;
                a = arraylist;
                super();
            }
        };
    }

    public void a(CBCollagesResponse cbcollagesresponse, Exception exception)
    {
        if (exception != null)
        {
            com.cardinalblue.android.b.k.a(this, 0x7f0700f8, 1);
        } else
        if (cbcollagesresponse != null)
        {
            WebPhoto webphoto;
            for (exception = cbcollagesresponse.getPhotos().iterator(); exception.hasNext(); j.a(webphoto))
            {
                webphoto = (WebPhoto)exception.next();
            }

            z.addMoreCollage(cbcollagesresponse);
            j.notifyDataSetChanged();
            return;
        }
    }

    public void a(WebPhoto webphoto)
    {
        j.a(webphoto);
        j.notifyDataSetChanged();
    }

    public void a(Exception exception)
    {
        if (exception instanceof com.cardinalblue.android.piccollage.controller.network.f.b)
        {
            i.put(j.getItemTag(v.getCurrentItem()), "");
            exception = E();
            if (exception != null)
            {
                exception.a(0x7f07013b);
            }
            c(false);
            return;
        } else
        {
            com.cardinalblue.android.b.k.a(this, 0x7f0700f8, 1);
            return;
        }
    }

    public void b(WebPhoto webphoto)
    {
        j.b(webphoto);
        if (a(webphoto.getId()))
        {
            c(webphoto);
        }
    }

    protected boolean f()
    {
        return false;
    }

    public void finish()
    {
        z();
        super.finish();
    }

    protected void k()
    {
        if (h())
        {
            super.k();
            return;
        } else
        {
            J();
            return;
        }
    }

    protected void o()
    {
        super.o();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 != -1) goto _L2; else goto _L1
_L1:
        intent = r();
        i1;
        JVM INSTR tableswitch 0 3: default 74
    //                   0 48
    //                   1 74
    //                   2 74
    //                   3 69;
           goto _L2 _L3 _L2 _L2 _L4
_L3:
        try
        {
            com.cardinalblue.android.piccollage.a.b.ag("now");
            j.b(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            com.cardinalblue.android.piccollage.a.f.a(intent);
        }
        return;
_L4:
        J();
        return;
_L2:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(0x7f03003a);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        a(new AbsDrawerActivity.a() {

            final PublicCollageActivity a;

            public void a(View view)
            {
            }

            public void b(View view)
            {
                com.cardinalblue.android.piccollage.a.b.ax("Collage View Page");
            }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
        });
        setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        int i1;
        if (bundle != null)
        {
            i1 = bundle.getInt("position");
            z = (CBCollagesResponse)bundle.getParcelable("web_photos_data");
            w = (com.cardinalblue.android.piccollage.controller.FeedAccessorFactory.FeedAccessor)bundle.getParcelable("feed_accessor");
            A = bundle.getString("extra_start_from");
        } else
        {
            i1 = intent.getIntExtra("position", 0);
            bundle = intent.getAction();
            if ("piccollage.intent.action.VIEW_COLLAGE".equals(bundle) && intent.hasExtra("web_photo_data"))
            {
                z = CBCollagesResponse.newInstance((WebPhoto)intent.getParcelableExtra("web_photo_data"));
            } else
            if ("piccollage.intent.action.VIEW_MULTIPLE_COLLAGES".equals(bundle) && intent.hasExtra("web_photos_data"))
            {
                z = (CBCollagesResponse)intent.getParcelableExtra("web_photos_data");
            }
            w = (com.cardinalblue.android.piccollage.controller.FeedAccessorFactory.FeedAccessor)intent.getParcelableExtra("feed_accessor");
            A = intent.getStringExtra("extra_start_from");
        }
        u = (LinearLayout)findViewById(0x7f1000e8);
        l = (TextView)findViewById(0x7f1000e9);
        l.getBackground().setDither(true);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            l.setOnClickListener(new android.view.View.OnClickListener() {

                final PublicCollageActivity a;

                public void onClick(View view)
                {
                    if (com.cardinalblue.android.piccollage.activities.PublicCollageActivity.a(a).getMaxLines() == 1)
                    {
                        com.cardinalblue.android.piccollage.activities.PublicCollageActivity.b(a);
                        return;
                    } else
                    {
                        PublicCollageActivity.c(a);
                        return;
                    }
                }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
            });
        }
        m = (TextView)findViewById(0x7f1000ee);
        n = (TextView)findViewById(0x7f1000ef);
        o = (TextView)findViewById(0x7f1000f0);
        p = (TextView)findViewById(0x7f1000f1);
        findViewById(0x7f1000ea).setOnClickListener(new android.view.View.OnClickListener() {

            final PublicCollageActivity a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.activities.PublicCollageActivity.d(a);
            }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
        });
        q = (ImageButton)findViewById(0x7f1000eb);
        q.setOnClickListener(D);
        f = (ImageButton)findViewById(0x7f1000ed);
        f.setOnClickListener(new android.view.View.OnClickListener() {

            final PublicCollageActivity a;

            public void onClick(View view)
            {
                a.showShareQuickAction(view);
            }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
        });
        r = (ImageButton)findViewById(0x7f1000ec);
        r.setOnClickListener(E);
        v = (ViewPager)findViewById(0x7f1000e7);
        v.setOffscreenPageLimit(0);
        v.setOnPageChangeListener(this);
        bundle = new d.a() {

            final PublicCollageActivity a;

            public void a(WebPhoto webphoto, String s1, String s2)
            {
                com.cardinalblue.android.piccollage.a.b.al(s1);
                webphoto = Collage.a(a, webphoto.getId(), s1, s2);
                a.startActivityForResult(webphoto, 3);
            }

            public void a(String s1)
            {
                if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
                return;
_L2:
                String s2 = null;
                String s3 = a.r();
                s2 = s3;
_L4:
                if (s2 == null)
                {
                    com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException((new StringBuilder()).append("Cannot get current collage to update view when callback from like ").append(s1).toString()));
                    return;
                }
                if (s1.equals(s2))
                {
                    com.cardinalblue.android.piccollage.activities.PublicCollageActivity.e(a);
                    return;
                }
                if (true) goto _L1; else goto _L3
_L3:
                IllegalStateException illegalstateexception;
                illegalstateexception;
                  goto _L4
            }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
        };
        if (z != null)
        {
            j = new b(getSupportFragmentManager(), this, z.getPhotos(), bundle, new uk.co.senab.photoview.PhotoViewAttacher.b() {

                final PublicCollageActivity a;

                public void a(View view, float f1, float f2)
                {
                    a.x();
                }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
            });
            v.setAdapter(j);
            v.setCurrentItem(i1);
            y();
            if (!com.cardinalblue.android.b.k.b(this))
            {
                com.cardinalblue.android.b.k.a(this, 0x7f07021d, 1);
                finish();
                return;
            } else
            {
                H();
                c(D());
                return;
            }
        } else
        {
            com.cardinalblue.android.b.k.a(this, 0x7f0700f8, 0);
            finish();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11001a, menu);
        s = menu.findItem(0x7f1002fa);
        MenuItemCompat.getActionView(s).setOnClickListener(new android.view.View.OnClickListener(menu) {

            final Menu a;
            final PublicCollageActivity b;

            public void onClick(View view)
            {
                a.performIdentifierAction(0x7f1002fa, 0);
            }

            
            {
                b = PublicCollageActivity.this;
                a = menu;
                super();
            }
        });
        k = (TextView)MenuItemCompat.getActionView(s).findViewById(0x7f1000bd);
        x = menu.findItem(0x7f1002fb);
        C();
        c(D());
        c(true);
        WebPhoto webphoto = D();
        if (webphoto != null)
        {
            y = menu.findItem(0x7f1002fc);
            MenuItem menuitem = y;
            boolean flag;
            if (!TextUtils.isEmpty(webphoto.getEchoProgenitor()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menuitem.setVisible(flag);
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (j != null)
        {
            j.a();
        }
        BitmapAjaxCallback.g();
        System.gc();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        case 2131755771: 
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131755772: 
            com.cardinalblue.android.piccollage.a.b.u();
            menuitem = D();
            if (menuitem != null)
            {
                com.cardinalblue.android.b.k.a(this, new Callable(menuitem) {

                    final WebPhoto a;
                    final PublicCollageActivity b;

                    public WebPhoto a()
                        throws Exception
                    {
                        return com.cardinalblue.android.piccollage.controller.network.f.j(a.getEchoProgenitor());
                    }

                    public Object call()
                        throws Exception
                    {
                        return a();
                    }

            
            {
                b = PublicCollageActivity.this;
                a = webphoto;
                super();
            }
                }, "").c(new bolts.i() {

                    final PublicCollageActivity a;

                    public Void a(j j1)
                        throws Exception
                    {
                        Intent intent = new Intent(a, com/cardinalblue/android/piccollage/activities/PublicCollageActivity);
                        intent.setAction("piccollage.intent.action.VIEW_COLLAGE");
                        intent.putExtra("web_photo_data", (Parcelable)j1.e());
                        a.startActivity(intent);
                        return null;
                    }

                    public Object then(j j1)
                        throws Exception
                    {
                        return a(j1);
                    }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
                }).a(new bolts.i() {

                    final PublicCollageActivity a;

                    public Void a(j j1)
                        throws Exception
                    {
                        if (j1.d() || j1.c())
                        {
                            com.cardinalblue.android.b.k.a(a, 0x7f07013b, 0);
                        }
                        return null;
                    }

                    public Object then(j j1)
                        throws Exception
                    {
                        return a(j1);
                    }

            
            {
                a = PublicCollageActivity.this;
                super();
            }
                });
            }
            return true;

        case 2131755770: 
            menuitem = D();
            break;
        }
        if (menuitem != null)
        {
            PicUser picuser = menuitem.getUser();
            if (picuser == null)
            {
                return true;
            }
            if (picuser.isMe())
            {
                menuitem = "self";
            } else
            {
                menuitem = "other";
            }
            com.cardinalblue.android.piccollage.a.b.k(menuitem);
            if (PicAuth.h().b())
            {
                menuitem = "true";
            } else
            {
                menuitem = "false";
            }
            com.cardinalblue.android.piccollage.a.b.l(menuitem);
            if (picuser.equals(PicAuth.h().i()))
            {
                menuitem = new Intent(this, com/cardinalblue/android/piccollage/activities/HomeActivity);
                menuitem.setAction("piccollage.intent.action.VIEW_PROFILE");
            } else
            {
                menuitem = new Intent(this, com/cardinalblue/android/piccollage/activities/PicProfileActivity);
            }
            menuitem.putExtra("user", picuser);
            startActivity(menuitem);
        }
        return true;
    }

    public void onPageScrollStateChanged(int i1)
    {
    }

    public void onPageScrolled(int i1, float f1, int j1)
    {
    }

    public void onPageSelected(int i1)
    {
        com.cardinalblue.android.piccollage.a.b.k();
        c(j.a(i1));
        if (i1 >= j.getCount() / 2)
        {
            I();
        }
        invalidateOptionsMenu();
        c(true);
        H();
        B();
        com.cardinalblue.android.piccollage.controller.d.a().c(new i(i1));
    }

    protected void onPause()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new i(-1));
        super.onPause();
        com.cardinalblue.android.piccollage.controller.d.a(this);
    }

    protected void onResume()
    {
        super.onResume();
        com.cardinalblue.android.piccollage.controller.d.b(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (v != null)
        {
            bundle.putInt("position", v.getCurrentItem());
        }
        bundle.putParcelable("web_photos_data", z);
        bundle.putParcelable("feed_accessor", w);
        bundle.putString("extra_start_from", A);
    }

    protected void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.a.b.aX();
    }

    public i produceShowPagePosition()
    {
        return new i(v.getCurrentItem());
    }

    public String r()
    {
        WebPhoto webphoto = D();
        if (webphoto == null)
        {
            throw new IllegalStateException("Collage not found");
        } else
        {
            return webphoto.getId();
        }
    }

    public String s()
    {
        WebPhoto webphoto = D();
        if (webphoto != null)
        {
            return webphoto.getCaption();
        } else
        {
            return null;
        }
    }

    public String t()
    {
        WebPhoto webphoto = D();
        if (webphoto != null)
        {
            return webphoto.getUrl();
        } else
        {
            return null;
        }
    }

    public Bitmap u()
        throws IOException
    {
        Bitmap bitmap = null;
        Object obj = null;
        k k1 = E();
        if (k1 != null)
        {
            obj = k1.a();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                bitmap = com.cardinalblue.android.piccollage.lib.a.e.a(((String) (obj))).a(0);
            }
            obj = bitmap;
            if (bitmap == null)
            {
                return a(k1);
            }
        }
        return ((Bitmap) (obj));
    }

    public ViewPager v()
    {
        return v;
    }

    public void w()
    {
        finish();
    }

    public void x()
    {
        if (!getSupportActionBar().isShowing())
        {
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, u.getHeight(), 0.0F);
            translateanimation.setInterpolator(new DecelerateInterpolator());
            translateanimation.setDuration(200L);
            u.startAnimation(translateanimation);
            u.setVisibility(0);
            getSupportActionBar().show();
            com.cardinalblue.android.b.k.b(getWindow().getDecorView());
            return;
        } else
        {
            TranslateAnimation translateanimation1 = new TranslateAnimation(0.0F, 0.0F, 0.0F, u.getHeight());
            translateanimation1.setInterpolator(new AccelerateInterpolator());
            translateanimation1.setDuration(200L);
            u.startAnimation(translateanimation1);
            u.setVisibility(8);
            getSupportActionBar().hide();
            com.cardinalblue.android.b.k.a(getWindow().getDecorView());
            return;
        }
    }
}
