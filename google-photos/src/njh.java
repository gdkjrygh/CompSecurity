// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.social.login.ui.CurrentAccountBannerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class njh
    implements omb, ooi, opl, ops, opv
{

    CurrentAccountBannerView a;
    private final Activity b;
    private final int c;
    private List d;
    private boolean e;
    private FrameLayout f;
    private mmr g;

    public njh(Activity activity, opd opd1, int i)
    {
        d = new ArrayList();
        b = activity;
        c = i;
        opd1.a(this);
    }

    public final njh a(String s)
    {
        d.add(s);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = (mmr)olm1.a(mmr);
    }

    public final void a(Bundle bundle)
    {
        if (bundle == null)
        {
            bundle = d.iterator();
            while (bundle.hasNext()) 
            {
                String s = (String)bundle.next();
                boolean flag;
                if (e || b.getIntent().getBooleanExtra(s, false))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                e = flag;
            }
        } else
        {
            e = bundle.getBoolean("show_on_start");
        }
    }

    public final void b_(Bundle bundle)
    {
label0:
        {
            if (!e)
            {
                break label0;
            }
            int i = g.d();
            if (i == -1)
            {
                break label0;
            }
            e = false;
            bundle = b;
            if (f == null)
            {
                Object obj = b.findViewById(c);
                if (obj == null)
                {
                    break label0;
                }
                StringBuilder stringbuilder;
                if (obj instanceof FrameLayout)
                {
                    f = (FrameLayout)obj;
                } else
                {
                    ViewGroup viewgroup = (ViewGroup)((View) (obj)).getParent();
                    f = new FrameLayout(bundle);
                    android.view.ViewGroup.LayoutParams layoutparams = ((View) (obj)).getLayoutParams();
                    viewgroup.removeView(((View) (obj)));
                    viewgroup.addView(f, layoutparams);
                    f.addView(((View) (obj)), -1, -1);
                }
            }
            if (a == null)
            {
                a = (CurrentAccountBannerView)LayoutInflater.from(bundle).inflate(b.GD, f, false);
                a.setVisibility(8);
                f.addView(a);
            }
            bundle = a;
            obj = ((mmv)olm.a(bundle.getContext(), mmv)).a(i);
            ((CurrentAccountBannerView) (bundle)).a.setText(((mmx) (obj)).b("display_name"));
            ((CurrentAccountBannerView) (bundle)).b.setText(((mmx) (obj)).b("account_name"));
            if (c.b(bundle.getContext()))
            {
                stringbuilder = oqs.a();
                if (((mmx) (obj)).c("is_plus_page"))
                {
                    c.a(stringbuilder, new CharSequence[] {
                        ((mmx) (obj)).b("display_name")
                    });
                }
                c.a(stringbuilder, new CharSequence[] {
                    ((mmx) (obj)).b("account_name")
                });
                bundle.c = oqs.b(stringbuilder);
                if (((CurrentAccountBannerView) (bundle)).d)
                {
                    bundle.b();
                } else
                {
                    bundle.e = true;
                }
            }
            bundle = new AlphaAnimation(0.0F, 1.0F);
            bundle.setDuration(200L);
            bundle.setStartOffset(500L);
            a.setAnimation(bundle);
            a.setVisibility(0);
            b.a(new nji(this), 3000L);
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("show_on_start", e);
    }
}
