// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.artist;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.n;
import android.support.v4.content.f;
import android.support.v4.content.j;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ListView;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.Switch;
import com.pandora.android.util.p;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.provider.StationProvider;
import com.pandora.radio.provider.h;
import p.cm.i;

// Referenced classes of package com.pandora.android.artist:
//            d, b, f

public class c extends p.cb.c
    implements android.support.v4.app.n.a
{

    private View a;
    private Switch b;
    private ListView c;
    private d d;
    private n e;
    private String f;
    private android.widget.CompoundButton.OnCheckedChangeListener g;

    public c()
    {
        g = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final c a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                ag ag1 = b.a.b().k();
                ai ai1 = ag1.t();
                ai ai2 = new ai(ai1);
                if (flag)
                {
                    compoundbutton = com.pandora.radio.data.ai.a.c;
                } else
                {
                    compoundbutton = com.pandora.radio.data.ai.a.d;
                }
                ai2.a(compoundbutton);
                if (!ai1.a(ai2))
                {
                    (new i(ai1, ai2)).a_(new Object[0]);
                    if (!flag)
                    {
                        if (ag1.E() && !ag1.F())
                        {
                            com.pandora.android.activity.a.b(a.getActivity());
                            ag1.g(true);
                        }
                        b.a.b().d().b(ac.c);
                    }
                }
                com.pandora.android.artist.c.a(a).a(flag);
            }

            
            {
                a = c.this;
                super();
            }
        };
    }

    static d a(c c1)
    {
        return c1.d;
    }

    private void e()
    {
        if (d == null)
        {
            d = new d(getActivity(), null, com.pandora.android.artist.b.b());
            c.setAdapter(d);
        }
    }

    private View f()
    {
        return a.findViewById(0x7f1000d7);
    }

    private void g()
    {
        ai ai1 = b.a.b().k().t();
        Object obj = d.getCursor();
        if (obj != null)
        {
            static class _cls2
            {

                static final int a[];

                static 
                {
                    a = new int[com.pandora.radio.data.ai.a.values().length];
                    try
                    {
                        a[com.pandora.radio.data.ai.a.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[com.pandora.radio.data.ai.a.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.pandora.radio.data.ai.a.d.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.pandora.radio.data.ai.a.a.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.pandora.android.artist._cls2.a[ai1.v().ordinal()])
            {
            default:
                throw new IllegalStateException("Artist Message switch should not be available, when feature is DISABLED");

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                obj = ((com.pandora.android.artist.f)obj).a();
                break;
            }
            if (obj != null && ((SparseArray) (obj)).size() > 0)
            {
                (new i(ai1, ((SparseArray) (obj)))).a_(new Object[0]);
                ((com.pandora.android.artist.f)d.getCursor()).b();
                return;
            }
        }
    }

    public void a(android.support.v4.content.i k, Cursor cursor)
    {
        e();
        if (cursor == null)
        {
            d.changeCursor(null);
            return;
        } else
        {
            k = new com.pandora.android.artist.f(cursor);
            d.changeCursor(k);
            return;
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            e.b(24, null, this);
        }
    }

    public boolean c()
    {
        b.a.C().a((new PandoraIntent("show_page")).putExtra("intent_page_name", p.w).putExtra("intent_show_force_screen", true));
        return true;
    }

    public CharSequence d()
    {
        return getString(0x7f0800a6);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        e();
        e = getLoaderManager();
        e.a(24, null, this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        f = h.b;
    }

    public android.support.v4.content.i onCreateLoader(int k, Bundle bundle)
    {
        return new f(b.a.h(), StationProvider.f, h.l, h.j, null, f);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = layoutinflater.inflate(0x7f040026, viewgroup, false);
        c = (ListView)a.findViewById(0x7f1000d6);
        c.setEmptyView(f());
        b = (Switch)a.findViewById(0x7f1000d5);
        b.setChecked(com.pandora.android.artist.b.b());
        b.setOnCheckedChangeListener(g);
        return a;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        e.a(24);
    }

    public void onLoadFinished(android.support.v4.content.i k, Object obj)
    {
        a(k, (Cursor)obj);
    }

    public void onLoaderReset(android.support.v4.content.i k)
    {
        d.changeCursor(null);
    }

    public void onPause()
    {
        super.onPause();
        g();
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.K;
    }
}
