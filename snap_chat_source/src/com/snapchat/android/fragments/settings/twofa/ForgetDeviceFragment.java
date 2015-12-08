// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.twofa;

import CU;
import Dj;
import Eh;
import Ei;
import FZ;
import Mf;
import Y;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ao;
import ap;
import com.snapchat.android.content.SnapchatProvider;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;
import ul;
import yF;

public class ForgetDeviceFragment extends SnapchatFragment
    implements Y.a, yF.a
{

    protected TextView a;
    protected ProgressBar b;
    private TextView c;
    private ListView d;
    private View e;
    private View f;
    private yF g;
    private final Set h;
    private final Ei i;
    private Eh j = new Eh() {

        private ForgetDeviceFragment a;

        public final void a(CU cu)
        {
            int k = Ei.a(cu);
            if (ForgetDeviceFragment.a(a).contains(Integer.valueOf(k)))
            {
                ForgetDeviceFragment.a(a).remove(Integer.valueOf(k));
                if (cu instanceof Dj)
                {
                    ForgetDeviceFragment.a(a, ((Dj)cu).b);
                }
            }
        }

            
            {
                a = ForgetDeviceFragment.this;
                super();
            }
    };

    public ForgetDeviceFragment()
    {
        this(Ei.a());
    }

    private ForgetDeviceFragment(Ei ei)
    {
        h = new HashSet();
        i = ei;
    }

    static Set a(ForgetDeviceFragment forgetdevicefragment)
    {
        return forgetdevicefragment.h;
    }

    static void a(ForgetDeviceFragment forgetdevicefragment, Dj.a a1)
    {
        forgetdevicefragment.b.setVisibility(8);
        if (a1.a)
        {
            if (Ss.a.TWOFAFORGETDEVICE == a1.b)
            {
                (forgetdevicefragment. new FZ(forgetdevicefragment.getActivity(), forgetdevicefragment.getString(0x7f0802f4)) {

                    private ForgetDeviceFragment a;

                    protected final void a()
                    {
                        dismiss();
                        a.getActivity().onBackPressed();
                    }

            
            {
                a = ForgetDeviceFragment.this;
                super(context, s);
            }
                }).show();
            }
        } else
        {
            Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, a1.c));
        }
        forgetdevicefragment.h();
    }

    static Ei b(ForgetDeviceFragment forgetdevicefragment)
    {
        return forgetdevicefragment.i;
    }

    private void h()
    {
        switch (g.getCount())
        {
        default:
            c.setText(0x7f0802f2);
            return;

        case 0: // '\0'
            c.setText(0x7f0802f3);
            a.setVisibility(8);
            return;

        case 1: // '\001'
            c.setText(0x7f0802ee);
            break;
        }
    }

    public final void a(String s)
    {
        h.add(Integer.valueOf(i.a(getActivity(), Ss.a.TWOFAFORGETONEDEVICE, s, null)));
    }

    public ap onCreateLoader(int k, Bundle bundle)
    {
        switch (k)
        {
        default:
            return null;

        case 1300: 
            return new ao(getActivity(), SnapchatProvider.d, ul.b, null);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040103, viewgroup, false);
        d(0x7f0d0539).setOnClickListener(new android.view.View.OnClickListener() {

            private ForgetDeviceFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = ForgetDeviceFragment.this;
                super();
            }
        });
        e = layoutinflater.inflate(0x7f040105, null);
        f = layoutinflater.inflate(0x7f040104, null);
        a = (TextView)f.findViewById(0x7f0d053d);
        b = (ProgressBar)f.findViewById(0x7f0d053e);
        c = (TextView)e.findViewById(0x7f0d053f);
        a.setOnClickListener(new android.view.View.OnClickListener() {

            private ForgetDeviceFragment a;

            public final void onClick(View view)
            {
                ForgetDeviceFragment.a(a).add(Integer.valueOf(ForgetDeviceFragment.b(a).a(a.getActivity(), Ss.a.TWOFAFORGETDEVICE, null, null)));
                a.a.setClickable(false);
                a.a.setText("");
                a.b.setVisibility(0);
            }

            
            {
                a = ForgetDeviceFragment.this;
                super();
            }
        });
        d = (ListView)d(0x7f0d053c);
        g = new yF(getActivity(), this);
        d.addHeaderView(e);
        d.addFooterView(f);
        d.setAdapter(g);
        getActivity().b().a(1300, this);
        return mFragmentLayout;
    }

    public void onLoadFinished(ap ap1, Object obj)
    {
        obj = (Cursor)obj;
        switch (ap1.getId())
        {
        default:
            return;

        case 1300: 
            break;
        }
        if (obj != null)
        {
            g.swapCursor(((Cursor) (obj)));
        }
        h();
    }

    public void onLoaderReset(ap ap1)
    {
    }

    public void onPause()
    {
        super.onPause();
        i.b(1012, j);
        h.clear();
    }

    public void onResume()
    {
        super.onResume();
        i.a(1012, j);
    }
}
