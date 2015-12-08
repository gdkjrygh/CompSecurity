// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ViewSwitcher;
import com.android.volley.r;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.network.c;
import com.cardinalblue.android.piccollage.model.gson.FbFriendRequest;
import com.cardinalblue.android.piccollage.view.a.h;
import com.cardinalblue.android.piccollage.view.a.s;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseListActivity, FbAlbumListActivity

public class FbFriendListActivity extends BaseListActivity
    implements android.content.DialogInterface.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private s a;
    private ListView b;
    private String c;

    public FbFriendListActivity()
    {
    }

    static String a(FbFriendListActivity fbfriendlistactivity)
    {
        return fbfriendlistactivity.c;
    }

    private void a()
    {
        ViewSwitcher viewswitcher = (ViewSwitcher)findViewById(0x7f1000c1);
        if (!(viewswitcher.getCurrentView() instanceof ListView))
        {
            viewswitcher.showNext();
        }
    }

    static void a(FbFriendListActivity fbfriendlistactivity, FbFriendRequest fbfriendrequest)
    {
        fbfriendlistactivity.a(fbfriendrequest);
    }

    static void a(FbFriendListActivity fbfriendlistactivity, Throwable throwable)
    {
        fbfriendlistactivity.a(throwable);
    }

    private void a(FbFriendRequest fbfriendrequest)
    {
        a.b();
        ((h)a.c()).a(fbfriendrequest.getFrineds());
        a.notifyDataSetChanged();
        c = fbfriendrequest.getNextUrl();
        fbfriendrequest = a;
        boolean flag;
        if (!TextUtils.isEmpty(c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fbfriendrequest.a(flag);
        a();
    }

    private void a(Throwable throwable)
    {
        a.b();
        k.b(this, (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f070220)).setMessage(getString(0x7f0700f8)).setCancelable(false).setPositiveButton(getString(0x7f0702c6), this).create());
        f.a(throwable);
    }

    static s b(FbFriendListActivity fbfriendlistactivity)
    {
        return fbfriendlistactivity.a;
    }

    private void b()
    {
        ViewSwitcher viewswitcher = (ViewSwitcher)findViewById(0x7f1000c1);
        if (viewswitcher.getCurrentView() instanceof ListView)
        {
            viewswitcher.showNext();
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        i;
        JVM INSTR tableswitch 101 101: default 28
    //                   101 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j == -1 && intent.hasExtra("extra_fb_photos"))
        {
            setResult(-1, intent);
            finish();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onBackPressed()
    {
        setResult(0);
        super.onBackPressed();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002a);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        b = (ListView)findViewById(0x102000a);
        a = new s(this, new h(this));
        a.b(new com.cardinalblue.android.piccollage.view.a.s.a() {

            final FbFriendListActivity a;

            public void a()
            {
                com.cardinalblue.android.piccollage.controller.network.f.a(FbFriendListActivity.a(a), new com.android.volley.m.b(this) {

                    final _cls1 a;

                    public volatile void a(Object obj)
                    {
                        a((String)obj);
                    }

                    public void a(String s1)
                    {
                        try
                        {
                            s1 = (FbFriendRequest)k.b(s1, com/cardinalblue/android/piccollage/model/gson/FbFriendRequest);
                            FbFriendListActivity.a(a.a, s1);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s1)
                        {
                            FbFriendListActivity.a(a.a, s1);
                        }
                    }

            
            {
                a = _pcls1;
                super();
            }
                }, new com.android.volley.m.a(this) {

                    final _cls1 a;

                    public void a(r r)
                    {
                        FbFriendListActivity.a(a.a, r);
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            
            {
                a = FbFriendListActivity.this;
                super();
            }
        });
        b.setAdapter(a);
        b.setOnItemClickListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (!k.b(this))
        {
            k.a(this, 0x7f07021d, 1);
            finish();
            return;
        } else
        {
            b();
            com.cardinalblue.android.piccollage.controller.network.c.a(getApplicationContext(), new com.cardinalblue.android.piccollage.controller.network.c.a() {

                final FbFriendListActivity a;

                public void a(FbFriendRequest fbfriendrequest)
                {
                    ((h)FbFriendListActivity.b(a).c()).a();
                    FbFriendListActivity.a(a, fbfriendrequest);
                }

                public void a(Throwable throwable)
                {
                    FbFriendListActivity.a(a, throwable);
                }

            
            {
                a = FbFriendListActivity.this;
                super();
            }
            });
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11000d, menu);
        menu = (SearchView)MenuItemCompat.getActionView(menu.findItem(0x7f1002eb));
        if (menu != null)
        {
            k.a(menu);
            menu.setQueryHint(getString(0x7f070254));
            menu.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {

                final FbFriendListActivity a;

                public boolean onQueryTextChange(String s1)
                {
                    if (FbFriendListActivity.b(a) != null)
                    {
                        ((h)FbFriendListActivity.b(a).c()).a(s1);
                    }
                    return false;
                }

                public boolean onQueryTextSubmit(String s1)
                {
                    return false;
                }

            
            {
                a = FbFriendListActivity.this;
                super();
            }
            });
        }
        return true;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new Intent(this, com/cardinalblue/android/piccollage/activities/FbAlbumListActivity);
        int j = getIntent().getExtras().getInt("max_choices");
        adapterview.putExtra("extra_fb_friend", ((h)a.c()).a(i));
        adapterview.putExtra("max_choices", j);
        startActivityForResult(adapterview, 101);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }
}
