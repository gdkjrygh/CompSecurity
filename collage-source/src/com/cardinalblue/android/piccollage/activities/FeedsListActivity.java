// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import com.cardinalblue.android.b.i;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.view.fragments.o;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseFragmentActivity

public class FeedsListActivity extends BaseFragmentActivity
{
    private static final class a extends Enum
    {

        public static final a a;
        private static final a d[];
        private final String b;
        private final int c;

        public static a a(String s)
        {
            if (!TextUtils.isEmpty(s))
            {
                a aa[] = values();
                int l = aa.length;
                for (int j = 0; j < l; j++)
                {
                    a a1 = aa[j];
                    if (s.equalsIgnoreCase(a1.a()))
                    {
                        return a1;
                    }
                }

            }
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot find feed name for ").append(s).toString());
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/activities/FeedsListActivity$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        public String a()
        {
            return b;
        }

        public String a(Context context)
        {
            return context.getString(c);
        }

        static 
        {
            a = new a("CONTESTS", 0, "contests", 0x7f0701ae);
            d = (new a[] {
                a
            });
        }

        private a(String s, int j, String s1, int l)
        {
            super(s, j);
            b = s1;
            c = l;
        }
    }


    public FeedsListActivity()
    {
    }

    public void onBackPressed()
    {
        setResult(-1);
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300b8);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        bundle = getIntent();
        if (bundle == null || !bundle.hasExtra("extra_feed_name"))
        {
            k.a(this, 0x7f0700f8, 0);
            f.a(new IllegalArgumentException("this activity should bring the parameter of `extra_feed_name`"));
            finish();
            return;
        }
        bundle = bundle.getStringExtra("extra_feed_name");
        try
        {
            setTitle(a.a(bundle).a(this));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            f.a(illegalargumentexception);
            setTitle(i.a(bundle));
        }
        getSupportFragmentManager().beginTransaction().replace(0x7f1001d4, o.a(bundle, -1, null)).commit();
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
