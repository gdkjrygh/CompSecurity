// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.lang.ref.WeakReference;

public final class frv
    implements frs
{

    private Flags a;
    private frm b;
    private WeakReference c;

    public frv(Flags flags, Context context)
    {
        a = flags;
        c = new WeakReference(context);
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
        b.a();
    }

    public final void a(edb edb1)
    {
        edb1.a(b);
    }

    public final void a(frm frm1)
    {
        b = frm1;
    }

    public final void a(String s)
    {
    }

    public final void a(boolean flag)
    {
        Context context;
        for (context = (Context)c.get(); context == null || !flag;)
        {
            return;
        }

        dmz.a(frb);
        frb.a(a, Reason.g, null, null).a(context);
    }

    public final void b()
    {
    }

    public final void b(edb edb1)
    {
        edb1.b(b);
    }

    public final void c()
    {
        b.d();
    }
}
