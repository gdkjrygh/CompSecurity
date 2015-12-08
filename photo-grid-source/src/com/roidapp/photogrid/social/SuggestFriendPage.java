// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.social;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;
import com.roidapp.baselib.c.an;

// Referenced classes of package com.roidapp.photogrid.social:
//            d

public class SuggestFriendPage extends FragmentActivity
    implements android.view.View.OnClickListener
{

    private TextView a;
    private TextView b;
    private TextView c;
    private View d;
    private int e;
    private boolean f;
    private FragmentManager g;

    public SuggestFriendPage()
    {
    }

    private void a()
    {
        if (e == 0)
        {
            if (f)
            {
                a(((View) (a)), 8);
                a(d, 8);
                a(((View) (c)), 0);
                c.setTextColor(getResources().getColor(0x7f0c0020));
                c.setText(0x7f070360);
            } else
            {
                a(((View) (a)), 0);
                a(d, 0);
                a(((View) (c)), 8);
            }
            a(((View) (b)), 0);
            b.setText(0x7f07035b);
        } else
        if (e == 1)
        {
            a(((View) (a)), 0);
            a(d, 0);
            a(((View) (b)), 0);
            a(((View) (c)), 0);
            b.setText(0x7f070374);
            c.setTextColor(getResources().getColor(0x7f0c0020));
            c.setText(0x7f07035f);
            return;
        }
    }

    public static void a(Activity activity, boolean flag, int i)
    {
        Intent intent = new Intent(activity, com/roidapp/photogrid/social/SuggestFriendPage);
        intent.putExtra("page_type", 0);
        intent.putExtra("is_first_login", flag);
        activity.startActivityForResult(intent, i);
    }

    private void a(Fragment fragment, String s)
    {
        if (g == null)
        {
            g = getSupportFragmentManager();
        }
        FragmentTransaction fragmenttransaction = g.beginTransaction();
        fragmenttransaction.replace(0x7f0d00e6, fragment, s);
        fragmenttransaction.commit();
    }

    private static void a(View view, int i)
    {
        if (view.getVisibility() != i)
        {
            view.setVisibility(i);
        }
    }

    private void b()
    {
        setResult(-1);
        finish();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 13271 && j != -1 && intent != null && intent.getExtras() != null && intent.getExtras().getBoolean("is_error", false))
        {
            an.a(this, 0x7f070112);
        }
    }

    public void onBackPressed()
    {
        if (e == 1)
        {
            a(com.roidapp.photogrid.social.d.a(0), "pg_fb_friend");
            e = 0;
            a();
            return;
        } else
        {
            b();
            return;
        }
    }

    public void onClick(View view)
    {
        if (view.getId() != 0x7f0d0028) goto _L2; else goto _L1
_L1:
        if (e != 1 || !f) goto _L4; else goto _L3
_L3:
        a(com.roidapp.photogrid.social.d.a(0), "pg_fb_friend");
        e = 0;
        a();
_L6:
        return;
_L4:
        b();
        return;
_L2:
        if (view.getId() == 0x7f0d00e5)
        {
            if (e == 0 && f)
            {
                a(com.roidapp.photogrid.social.d.a(1), "pg_suggest");
                e = 1;
                a();
                return;
            } else
            {
                b();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030029);
        bundle = getIntent();
        e = bundle.getIntExtra("page_type", -1);
        f = bundle.getBooleanExtra("is_first_login", false);
        if (e == 0)
        {
            a(com.roidapp.photogrid.social.d.a(0), "pg_fb_friend");
        } else
        if (e == 1)
        {
            a(com.roidapp.photogrid.social.d.a(1), "pg_suggest");
        } else
        {
            finish();
            return;
        }
        a = (TextView)findViewById(0x7f0d0028);
        d = findViewById(0x7f0d00e3);
        b = (TextView)findViewById(0x7f0d00e4);
        c = (TextView)findViewById(0x7f0d00e5);
        a.setOnClickListener(this);
        c.setOnClickListener(this);
        a();
    }

    protected void onResume()
    {
        super.onResume();
    }
}
