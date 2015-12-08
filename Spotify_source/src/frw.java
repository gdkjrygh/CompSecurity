// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import java.lang.ref.WeakReference;

public final class frw
    implements frs
{

    frm a;
    private frq b;
    private View c;
    private String d;
    private android.view.View.OnClickListener e;
    private fjt f;

    public frw(frq frq1)
    {
        e = new android.view.View.OnClickListener() {

            private frw a;

            public final void onClick(View view)
            {
                a.a.c();
            }

            
            {
                a = frw.this;
                super();
            }
        };
        f = new fjt() {

            private frw a;

            public final void a()
            {
                a.a.b();
            }

            
            {
                a = frw.this;
                super();
            }
        };
        b = frq1;
    }

    public final Optional a(LayoutInflater layoutinflater, ViewGroup viewgroup, frt frt)
    {
        return Optional.e();
    }

    public final void a()
    {
    }

    public final void a(View view)
    {
        c = view;
        a.a();
    }

    public final void a(edb edb1)
    {
        edb1.a(a);
    }

    public final void a(frm frm1)
    {
        a = frm1;
    }

    public final void a(String s)
    {
        d = s;
    }

    public final void a(boolean flag)
    {
        if (flag && !TextUtils.isEmpty(d) && c != null)
        {
            fjq fjq1 = new fjq(d);
            fjq1.a = e;
            fjq1.b = true;
            fjq1.a(f);
            frq frq1 = b;
            View view = c;
            Object obj = (Activity)frq1.a.get();
            if (obj != null)
            {
                dmz.a(fjm);
                obj = fjm.a(((Activity) (obj)));
                frq1.b.a(((fjn) (obj)));
                frq1.b.b(((fjn) (obj)));
                obj.a = com.spotify.mobile.android.spotlets.tinkerbell.Onboarding.Type.f;
                obj.d = fjq1;
                ((fjn) (obj)).a(view);
                return;
            }
        }
    }

    public final void b()
    {
    }

    public final void b(edb edb1)
    {
        edb1.b(a);
    }

    public final void c()
    {
        a.d();
    }
}
