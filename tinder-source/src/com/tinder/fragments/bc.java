// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.a.d;
import com.facebook.a.e;
import com.facebook.a.f;
import com.facebook.a.i;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.model.User;
import com.tinder.utils.a;
import com.tinder.utils.ad;

public final class bc extends h
{

    protected i a;
    com.tinder.e.f b;
    private ImageButton c;
    private ImageView d;
    private boolean e;
    private View f;
    private View g;
    private int h;
    private int i;
    private User j;

    public bc()
    {
    }

    private int a()
    {
        return (ad.a(c).y + h / 2) - i / 2;
    }

    static com.tinder.e.f a(bc bc1)
    {
        return bc1.b;
    }

    static ImageView b(bc bc1)
    {
        return bc1.d;
    }

    private e b()
    {
        return a.a().c(200D).a(com.facebook.a.f.a(42D, 7D));
    }

    static View c(bc bc1)
    {
        return bc1.g;
    }

    static boolean d(bc bc1)
    {
        bc1.e = false;
        return false;
    }

    static View e(bc bc1)
    {
        return bc1.f;
    }

    public final void dismiss()
    {
        if (e)
        {
            return;
        } else
        {
            e = true;
            int k = a();
            e e1 = b().a(1.0D).b(0.0D);
            e1.b = true;
            f.setVisibility(0);
            e1.a(new d(k) {

                final int a;
                final bc b;

                public final void onSpringAtRest(e e2)
                {
                    com.tinder.fragments.bc.d(b);
                    com.tinder.fragments.bc.e(b).setVisibility(8);
                    b.getDialog().dismiss();
                }

                public final void onSpringUpdate(e e2)
                {
                    ad.a(bc.b(b), (float)Math.min(1.0D, e2.d.a));
                    ad.c(bc.c(b), (float)e2.d.a);
                    bc.c(b).setTranslationY((1.0F - (float)e2.d.a) * (float)a);
                }

            
            {
                b = bc.this;
                a = k;
                super();
            }
            });
            return;
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        ManagerApp.h().a(this);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = (User)getArguments().getParcelable("user");
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.getWindow().requestFeature(1);
        return bundle;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030086, viewgroup, false);
    }

    public final void onStart()
    {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null)
        {
            dialog.getWindow().setLayout(-1, -1);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        f = view;
        d = (ImageView)view.findViewById(0x7f0e0125);
        g = view.findViewById(0x7f0e0128);
        c = (ImageButton)view.findViewById(0x7f0e01c5);
        bundle = view.findViewById(0x7f0e0204);
        if (bundle != null)
        {
            bundle.setBackgroundResource(0);
        }
        c.setVisibility(0);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            final bc a;

            public final void onClick(View view1)
            {
                a.dismiss();
            }

            
            {
                a = bc.this;
                super();
            }
        });
        h = c.getHeight();
        i = ad.b(getActivity());
        view.findViewById(0x7f0e016a).setOnClickListener(new android.view.View.OnClickListener() {

            final bc a;

            public final void onClick(View view1)
            {
                if (com.tinder.fragments.bc.a(a) != null)
                {
                    com.tinder.fragments.bc.a(a).a();
                }
                a.dismiss();
            }

            
            {
                a = bc.this;
                super();
            }
        });
        view.findViewById(0x7f0e016b).setOnClickListener(new android.view.View.OnClickListener() {

            final bc a;

            public final void onClick(View view1)
            {
                if (com.tinder.fragments.bc.a(a) != null)
                {
                    com.tinder.fragments.bc.a(a).b();
                }
                a.getDialog().dismiss();
            }

            
            {
                a = bc.this;
                super();
            }
        });
        if (j != null)
        {
            bundle = String.format(getResources().getString(0x7f0601ea), new Object[] {
                j.getName()
            });
            String s = String.format(getResources().getString(0x7f0601e7), new Object[] {
                j.getName()
            });
            ((TextView)view.findViewById(0x7f0e016c)).setText(bundle);
            ((TextView)view.findViewById(0x7f0e016e)).setText(s);
        }
        com.tinder.utils.a.a(c, 0.7F, 200L, 200L);
        a = com.facebook.a.i.b();
        int k = a();
        b().a(0.0D).b(1.0D).a(new d(k) {

            final int a;
            final bc b;

            public final void onSpringActivate(e e1)
            {
                com.tinder.fragments.bc.e(b).setVisibility(0);
            }

            public final void onSpringAtRest(e e1)
            {
                com.tinder.fragments.bc.d(b);
            }

            public final void onSpringUpdate(e e1)
            {
                ad.a(bc.b(b), (float)Math.min(1.0D, e1.d.a));
                ad.c(bc.c(b), (float)e1.d.a);
                bc.c(b).setTranslationY(-(1.0F - (float)e1.d.a) * (float)a);
            }

            
            {
                b = bc.this;
                a = k;
                super();
            }
        });
    }
}
