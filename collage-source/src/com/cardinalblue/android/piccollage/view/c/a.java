// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.auth.a.b;

public abstract class a
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    protected final b a;
    protected final com.androidquery.a b;
    protected final int c;
    protected final Fragment d;
    private final android.widget.CompoundButton.OnCheckedChangeListener e = new android.widget.CompoundButton.OnCheckedChangeListener() {

        final a a;

        public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            if (flag)
            {
                com.cardinalblue.android.piccollage.a.b.d(a.a.c(), "login");
                a.a.a(a.d, a.c, "account");
                a.b();
                return;
            } else
            {
                com.cardinalblue.android.piccollage.a.b.d(a.a.c(), "logout");
                a.a.a();
                a.d();
                a.a();
                return;
            }
        }

            
            {
                a = a.this;
                super();
            }
    };

    public a(Fragment fragment, b b1, com.androidquery.a a1, int i)
    {
        d = fragment;
        a = b1;
        b = a1;
        c = i;
        k.j().registerOnSharedPreferenceChangeListener(this);
    }

    protected abstract void a();

    public void a(int i)
    {
        if (c == i)
        {
            d();
            k.i(k.a());
        }
    }

    protected void a(boolean flag, String s)
    {
        ToggleButton togglebutton = (ToggleButton)((com.androidquery.a)b.a(0x7f1000b6)).b();
        if (s != null)
        {
            togglebutton.setText(s);
        }
        togglebutton.setOnCheckedChangeListener(null);
        togglebutton.setChecked(flag);
        togglebutton.setOnCheckedChangeListener(e);
    }

    protected abstract void b();

    public void c()
    {
        k.j().unregisterOnSharedPreferenceChangeListener(this);
    }

    public void d()
    {
        if (b == null || !b.f())
        {
            return;
        }
        Object obj = k.a();
        boolean flag = a.a(((Context) (obj)));
        if (flag)
        {
            SharedPreferences sharedpreferences = k.j();
            String s = e();
            if (s != null)
            {
                obj = sharedpreferences.getString(s, null);
            } else
            {
                obj = ((Context) (obj)).getString(0x7f07011a);
            }
        } else
        {
            obj = ((Context) (obj)).getString(0x7f070117);
        }
        a(flag, ((String) (obj)));
    }

    protected abstract String e();
}
