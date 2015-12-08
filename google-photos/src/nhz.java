// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public final class nhz extends omn
{

    private nga ad;

    public nhz()
    {
    }

    public static void a(ay ay1)
    {
        ay1 = (al)ay1.a("login.progress");
        if (ay1 == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ay1.a(false);
        return;
        ay1;
    }

    public static void a(ay ay1, String s, boolean flag)
    {
        if (b(ay1))
        {
            throw new IllegalStateException("Progress dialog is already showing");
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("message", s);
            bundle.putBoolean("cancelable", flag);
            s = new nhz();
            s.f(bundle);
            s.a(ay1, "login.progress");
            return;
        }
    }

    public static boolean b(ay ay1)
    {
        return ay1.a("login.progress") != null;
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = new ProgressDialog(new ContextThemeWrapper(O_(), c.fM));
        bundle.setMessage(super.q.getString("message"));
        bundle.setProgressStyle(0);
        bundle.setCancelable(super.q.getBoolean("cancelable"));
        return bundle;
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (nga)ag.a(nga);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        ad.b();
    }
}
