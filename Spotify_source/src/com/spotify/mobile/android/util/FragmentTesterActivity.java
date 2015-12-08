// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import aa;
import ah;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.ActionBarTitle;
import dct;
import dmz;
import eda;
import edb;
import edc;
import edd;
import fog;
import fot;
import fpe;
import fuc;
import gdp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import rf;

public class FragmentTesterActivity extends rf
    implements eda, edc, fpe, fuc
{

    private edb d;
    private gdp e;
    private Fragment f;
    private fog g;

    public FragmentTesterActivity()
    {
        e = (gdp)dmz.b(gdp);
    }

    public final void P_()
    {
    }

    public final boolean Q_()
    {
        return false;
    }

    public final fog R_()
    {
        return g;
    }

    public final void a(Fragment fragment, ActionBarTitle actionbartitle)
    {
    }

    public final void a(Fragment fragment, String s)
    {
        setTitle(s);
    }

    public final void a(SessionState sessionstate)
    {
    }

    public final void a(fot fot)
    {
    }

    public final edb c()
    {
        return d;
    }

    public final Context e()
    {
        return this;
    }

    public final boolean g()
    {
        return false;
    }

    public final void h()
    {
    }

    public final boolean n()
    {
        return true;
    }

    protected void onCreate(Bundle bundle)
    {
        setTheme(0x7f0b0183);
        super.onCreate(bundle);
        dmz.a(edd);
        d = edd.a(getApplicationContext());
        Object obj = new LinearLayout(this);
        ((LinearLayout) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) (obj)).setOrientation(1);
        View view = LayoutInflater.from(this).inflate(0x7f0300cb, ((android.view.ViewGroup) (obj)), false);
        ((LinearLayout) (obj)).addView(view);
        LinearLayout linearlayout = new LinearLayout(this);
        linearlayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        linearlayout.setId(0x7f11032d);
        ((LinearLayout) (obj)).addView(linearlayout);
        setContentView(((View) (obj)));
        obj = (Toolbar)view.findViewById(0x7f110400);
        dct.a(this, ((Toolbar) (obj)));
        a(((Toolbar) (obj)));
        g = new fog(this, a_(), linearlayout);
        if (bundle != null)
        {
            g.a(bundle.getBundle("navigation_manager"));
        }
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        if (bundle != null && bundle.containsKey("android:support:fragments"))
        {
            break MISSING_BLOCK_LABEL_337;
        }
        f = e.a();
        if (f != null)
        {
            a_().a().a(0x7f11032d, f, "fragment_under_test").c();
        }
        bundle = e.b();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        Constructor constructor = android/support/v4/app/Fragment$SavedState.getDeclaredConstructor(new Class[] {
            android/os/Bundle
        });
        constructor.setAccessible(true);
        bundle = (android.support.v4.app.Fragment.SavedState)constructor.newInstance(new Object[] {
            bundle
        });
        f.a(bundle);
        return;
        bundle;
        throw new RuntimeException("This shouldn't have happened ;)", bundle);
        bundle;
        throw new RuntimeException("This shouldn't have happened ;)", bundle);
        bundle;
        throw new RuntimeException("This shouldn't have happened ;)", bundle);
        bundle;
        throw new RuntimeException("This shouldn't have happened ;)", bundle);
        f = a_().a("fragment_under_test");
        return;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        super.onSaveInstanceState(bundle1);
        bundle = ((Bundle) (bundle1.get("android:support:fragments")));
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        try
        {
            Field field = bundle.getClass().getDeclaredField("mActive");
            field.setAccessible(true);
            bundle = ((Bundle) (((Object[])field.get(bundle))[0]));
            field = bundle.getClass().getDeclaredField("mSavedFragmentState");
            field.setAccessible(true);
            bundle = (Bundle)field.get(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException(bundle);
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        new Bundle(bundle);
        if (e != null && e.c())
        {
            bundle1.remove("android:support:fragments");
        }
        bundle1.putBundle("navigation_manager", g.e());
        return;
    }
}
