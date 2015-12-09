// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.SearchManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.memento.IMemento;
import com.cardinalblue.android.piccollage.view.a.x;
import com.squareup.a.b;
import java.util.ArrayList;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseActivity, e, d, c

public class WebSearchActivity extends BaseActivity
    implements android.support.v4.view.MenuItemCompat.OnActionExpandListener, android.support.v4.view.ViewPager.OnPageChangeListener, e
{
    public static class a
    {

        public final boolean a;

        public a(boolean flag)
        {
            a = flag;
        }
    }


    private int a;
    private MenuItem b;
    private IMemento c;
    private String d;
    private String e;
    private View f;
    private TextView g;
    private MenuItem h;
    private SearchView i;
    private ArrayList j;
    private boolean k;

    public WebSearchActivity()
    {
        a = 30;
        e = "image/*";
        j = new ArrayList();
    }

    static MenuItem a(WebSearchActivity websearchactivity)
    {
        return websearchactivity.h;
    }

    static void a(WebSearchActivity websearchactivity, String s)
    {
        websearchactivity.b(s);
    }

    private void b(String s)
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.view.fragments.ah.c(s));
    }

    private void e()
    {
        j.clear();
        d();
    }

    private String f()
    {
        if (k)
        {
            return "key_last_search_term_web_background";
        } else
        {
            return "key_last_search_term_web_photo";
        }
    }

    private void g()
    {
        h();
        i();
        String s = f();
        Bundle bundle = c.a();
        if (bundle == null || !bundle.containsKey(s))
        {
            return;
        } else
        {
            d = bundle.getString(s, null);
            return;
        }
    }

    private void h()
    {
        if (c == null)
        {
            throw new IllegalStateException("No memo passed in");
        } else
        {
            return;
        }
    }

    private void i()
    {
        if (TextUtils.isEmpty(f()))
        {
            throw new IllegalStateException((new StringBuilder()).append("No memo tag for ").append(getClass().getSimpleName()).toString());
        } else
        {
            return;
        }
    }

    private void j()
    {
        h();
        i();
        String s = f();
        Bundle bundle = c.a();
        bundle.putString(s, d);
        c.a(bundle);
    }

    private void k()
    {
        if (g != null)
        {
            g.setVisibility(8);
            g.setText("");
        }
        if (f != null)
        {
            f.setEnabled(false);
        }
        if (h != null)
        {
            h.setVisible(false);
        }
    }

    protected void a()
    {
        if (!j.isEmpty())
        {
            Intent intent = new Intent();
            intent.putExtra("keyword", d);
            j();
            intent.putExtra("search_memo", c);
            intent.setType(e);
            if (k)
            {
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("selected_photo", (Parcelable)j.get(0));
            } else
            {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.putExtra("selected_photos", j);
            }
            setResult(-1, intent);
        }
        finish();
    }

    public void a(String s)
    {
        c();
        e();
        d = s;
        if (!TextUtils.isEmpty(d))
        {
            getSupportActionBar().setTitle(d);
        }
        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.view.fragments.ah.b(s));
    }

    public boolean a(Parcelable parcelable)
    {
        if (!j.contains(parcelable)) goto _L2; else goto _L1
_L1:
        j.remove(parcelable);
_L4:
        d();
        return true;
_L2:
        c();
        if (j.size() >= a)
        {
            com.cardinalblue.android.b.k.a(this, String.format(getString(0x7f0702a4), new Object[] {
                Integer.valueOf(30)
            }), 0);
            return false;
        }
        j.add(parcelable);
        if (k)
        {
            a();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b()
    {
        if (b != null)
        {
            MenuItemCompat.expandActionView(b);
        }
    }

    public boolean b(Parcelable parcelable)
    {
        return j.contains(parcelable);
    }

    public void c()
    {
        if (b != null)
        {
            MenuItemCompat.collapseActionView(b);
            b.collapseActionView();
            i.setIconified(true);
        }
    }

    protected void d()
    {
        boolean flag = false;
        int i1 = j.size();
        if (g != null)
        {
            Object obj = g;
            int l;
            if (i1 > 0)
            {
                l = 0;
            } else
            {
                l = 8;
            }
            ((TextView) (obj)).setVisibility(l);
            g.setText(Integer.toString(i1));
        }
        if (f != null)
        {
            obj = f;
            if (i1 > 0)
            {
                flag = true;
            }
            ((View) (obj)).setEnabled(flag);
        }
    }

    public void onBackPressed()
    {
        if (b != null && b.isActionViewExpanded())
        {
            c();
            return;
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("keyword", d);
            j();
            intent.putExtra("search_memo", c);
            setResult(0, intent);
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030042);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setTitle(getString(0x7f070230));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Object obj;
        int l;
        if (bundle != null)
        {
            c = (IMemento)bundle.getParcelable("saved_search_memo");
        } else
        {
            c = (IMemento)getIntent().getParcelableExtra("search_memo");
        }
        g();
        a = getIntent().getIntExtra("max_choices", 30);
        k = getIntent().getBooleanExtra("is_search_background", false);
        bundle = new x(this, getSupportFragmentManager());
        obj = new Bundle();
        ((Bundle) (obj)).putString("keyword", d);
        ((Bundle) (obj)).putBoolean("is_search_background", k);
        bundle.a(getString(0x7f0701e2), com/cardinalblue/android/piccollage/activities/d.getName(), ((Bundle) (obj)), "tag_search_photo");
        if (!k)
        {
            obj = new Bundle();
            ((Bundle) (obj)).putString("keyword", d);
            bundle.a(getString(0x7f0702c0), com/cardinalblue/android/piccollage/activities/c.getName(), ((Bundle) (obj)), "tag_search_video");
        }
        obj = (ViewPager)findViewById(0x7f1000d1);
        ((ViewPager) (obj)).setAdapter(bundle);
        bundle = (TabLayout)findViewById(0x7f1000d0);
        l = getResources().getColor(0x7f0f00fe);
        bundle.setTabTextColors(l, l);
        bundle.setupWithViewPager(((ViewPager) (obj)));
        ((ViewPager) (obj)).addOnPageChangeListener(new android.support.design.widget.TabLayout.TabLayoutOnPageChangeListener(bundle));
        ((ViewPager) (obj)).addOnPageChangeListener(this);
        if (k)
        {
            bundle.setVisibility(8);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f110020, menu);
        k();
        b = menu.findItem(0x7f1002eb);
        i = (SearchView)MenuItemCompat.getActionView(b);
        if (i != null)
        {
            com.cardinalblue.android.b.k.a(i);
        }
        i.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {

            final WebSearchActivity a;

            public boolean onQueryTextChange(String s)
            {
                WebSearchActivity.a(a, s);
                return true;
            }

            public boolean onQueryTextSubmit(String s)
            {
                if (TextUtils.isEmpty(s))
                {
                    return false;
                } else
                {
                    a.a(s);
                    return true;
                }
            }

            
            {
                a = WebSearchActivity.this;
                super();
            }
        });
        MenuItemCompat.setOnActionExpandListener(b, this);
        if (i != null)
        {
            b.expandActionView();
            i.setIconified(false);
            if (!TextUtils.isEmpty(d))
            {
                i.setQuery(d, false);
            }
        }
        h = menu.findItem(0x7f1002ea);
        if (h != null)
        {
            menu = MenuItemCompat.getActionView(h);
            f = menu.findViewById(0x7f1000bf);
            f.setOnClickListener(new android.view.View.OnClickListener() {

                final WebSearchActivity a;

                public void onClick(View view)
                {
                    a.onOptionsItemSelected(WebSearchActivity.a(a));
                }

            
            {
                a = WebSearchActivity.this;
                super();
            }
            });
            g = (TextView)menu.findViewById(0x7f1000c0);
            d();
        }
        if (k)
        {
            h.setVisible(false);
        }
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        ((SearchManager)getSystemService("search")).stopSearch();
    }

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        if (h != null)
        {
            h.setVisible(true);
        }
        com.cardinalblue.android.piccollage.controller.d.a().c(new a(false));
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        if (h != null)
        {
            h.setVisible(false);
        }
        b("");
        com.cardinalblue.android.piccollage.controller.d.a().c(new a(true));
        return true;
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 32
    //                   16908332: 38
    //                   2131755754: 44;
           goto _L1 _L2 _L3
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        onBackPressed();
_L5:
        return true;
_L3:
        a();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onPageScrollStateChanged(int l)
    {
    }

    public void onPageScrolled(int l, float f1, int i1)
    {
    }

    public void onPageSelected(int l)
    {
        e();
        switch (l)
        {
        default:
            e = "image/*";
            return;

        case 1: // '\001'
            e = "video/*";
            break;
        }
    }

    protected void onPause()
    {
        super.onPause();
        com.cardinalblue.android.piccollage.controller.d.a().b(this);
    }

    protected void onResume()
    {
        super.onResume();
        Intent intent = getIntent();
        if ("android.intent.action.SEARCH".equals(intent.getAction()))
        {
            d = intent.getDataString();
            if (d == null)
            {
                d = intent.getStringExtra("query");
            }
        }
        if (!TextUtils.isEmpty(d))
        {
            a(d);
        }
        com.cardinalblue.android.piccollage.controller.d.a().a(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        j();
        bundle.putParcelable("saved_search_memo", c);
    }
}
