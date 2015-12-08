// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ViewSwitcher;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.ChangePageEvent;
import com.cardinalblue.android.piccollage.events.n;
import com.cardinalblue.android.piccollage.view.a.b;
import com.cardinalblue.android.piccollage.view.a.k;
import com.cardinalblue.android.piccollage.view.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class r extends Fragment
{
    private class a
        implements android.support.v4.app.LoaderManager.LoaderCallbacks
    {

        final r a;

        public void a()
        {
            if (a.getLoaderManager().getLoader(1) == null)
            {
                a.getLoaderManager().initLoader(1, null, this);
            }
        }

        public void a(int i)
        {
            com.cardinalblue.android.piccollage.model.a a1 = (com.cardinalblue.android.piccollage.model.a)((b)a.b.getAdapter()).getItem(i);
            Bundle bundle = new Bundle();
            bundle.putString("extra_album_id", a1.a());
            r.a(a);
            a.getLoaderManager().restartLoader(2, bundle, this);
        }

        public void a(Loader loader, Cursor cursor)
        {
            android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
            if (fragmentactivity != null && !fragmentactivity.isFinishing()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            switch (loader.getId())
            {
            default:
                return;

            case 1: // '\001'
                loader = com.cardinalblue.android.piccollage.a.d.a(cursor);
                if (loader != null && loader.size() > 0)
                {
                    a.b.setEnabled(true);
                    a.b.setSelection(0);
                    cursor = (b)a.b.getAdapter();
                    if (cursor != null)
                    {
                        cursor.a(new ArrayList(loader));
                        a.a.setDisplayedChild(0);
                        a(a.b.getSelectedItemPosition());
                        return;
                    }
                } else
                {
                    com.cardinalblue.android.b.k.a(fragmentactivity, 0x7f07013a, 0);
                    a.b.setEnabled(false);
                    a.b.setAdapter(null);
                    a.c.setAdapter(null);
                    a.a.setDisplayedChild(1);
                    return;
                }
                break;

            case 2: // '\002'
                loader = com.cardinalblue.android.piccollage.a.d.b(cursor);
                continue; /* Loop/switch isn't completed */
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (loader == null || loader.size() <= 0) goto _L1; else goto _L4
_L4:
            r.a(a, loader);
            return;
        }

        public void b()
        {
            LoaderManager loadermanager = a.getLoaderManager();
            if (loadermanager.getLoader(1) != null)
            {
                loadermanager.destroyLoader(1);
            }
            if (loadermanager.getLoader(2) != null)
            {
                loadermanager.destroyLoader(2);
            }
        }

        public Loader onCreateLoader(int i, Bundle bundle)
        {
            i;
            JVM INSTR tableswitch 1 2: default 24
        //                       1 26
        //                       2 37;
               goto _L1 _L2 _L3
_L1:
            return null;
_L2:
            return com.cardinalblue.android.piccollage.a.d.c(a.getActivity());
_L3:
            if (bundle.containsKey("extra_album_id"))
            {
                bundle = bundle.getString("extra_album_id");
                if (!TextUtils.isEmpty(bundle))
                {
                    return com.cardinalblue.android.piccollage.a.d.b(a.getActivity(), bundle);
                }
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public void onLoadFinished(Loader loader, Object obj)
        {
            a(loader, (Cursor)obj);
        }

        public void onLoaderReset(Loader loader)
        {
        }

        private a()
        {
            a = r.this;
            super();
        }

    }


    protected ViewSwitcher a;
    protected Spinner b;
    protected RecyclerView c;
    protected a d;
    protected List e;
    protected int f;

    public r()
    {
        d = new a();
        e = new ArrayList();
    }

    private void a()
    {
        k k1 = (k)c.getAdapter();
        if (k1 != null)
        {
            k1.a(e);
        }
    }

    static void a(r r1)
    {
        r1.a();
    }

    static void a(r r1, Collection collection)
    {
        r1.a(collection);
    }

    private void a(Collection collection)
    {
        e.clear();
        e.addAll(collection);
        ((k)c.getAdapter()).a(e);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = getArguments();
        layoutinflater = layoutinflater.inflate(0x7f0300b3, viewgroup, false);
        f = bundle.getInt("max_choices", 30);
        a = (ViewSwitcher)layoutinflater.findViewById(0x7f1001bd);
        b = (Spinner)layoutinflater.findViewById(0x7f1001be);
        b.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final r a;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (com.cardinalblue.android.piccollage.model.a)a.b.getAdapter().getItem(i);
                view = new Bundle();
                view.putString("extra_album_id", adapterview.a());
                a.getLoaderManager().restartLoader(2, view, a.d);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = r.this;
                super();
            }
        });
        b.setAdapter(new b(getActivity(), new ArrayList()));
        c = (RecyclerView)layoutinflater.findViewById(0x7f1001bf);
        c.setHasFixedSize(true);
        c.setAdapter(new k(getContext(), f));
        c.setLayoutManager(new GridLayoutManager(getContext(), getResources().getInteger(0x7f090025)));
        c.addItemDecoration(new j(getResources().getDimensionPixelSize(0x7f0b009e)));
        layoutinflater.findViewById(0x7f1001c0).findViewById(0x7f1001ae).setOnClickListener(new android.view.View.OnClickListener() {

            final r a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.controller.d.a().c(new n());
            }

            
            {
                a = r.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onPageSelected(ChangePageEvent changepageevent)
    {
        if (changepageevent != null && changepageevent.a == 0)
        {
            a();
        }
    }

    public void onPause()
    {
        super.onPause();
        try
        {
            com.cardinalblue.android.piccollage.controller.d.a().b(this);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            com.cardinalblue.android.piccollage.a.f.a(illegalargumentexception);
        }
    }

    public void onResume()
    {
        super.onResume();
        try
        {
            com.cardinalblue.android.piccollage.controller.d.a().a(this);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            com.cardinalblue.android.piccollage.a.f.a(illegalargumentexception);
        }
        d.a();
    }

    public void onStart()
    {
        super.onStart();
        k k1 = (k)c.getAdapter();
        if (k1 != null)
        {
            k1.a();
        }
    }

    public void onStop()
    {
        super.onStop();
        d.b();
        k k1 = (k)c.getAdapter();
        if (k1 != null)
        {
            k1.b();
        }
    }
}
