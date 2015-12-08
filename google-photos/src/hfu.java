// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class hfu extends al
{

    private int ad;

    public hfu()
    {
        ad = 0;
    }

    public static hfu a(String s, String s1, boolean flag)
    {
        s = new Bundle();
        if (false)
        {
            s.putString("title", null);
        }
        s.putString("message", s1);
        s.putBoolean("cancelable_outside", false);
        s1 = new hfu();
        s1.f(s);
        s1.b(false);
        return s1;
    }

    public final void a(ay ay, String s)
    {
        try
        {
            super.a(ay, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ay ay)
        {
            return;
        }
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.q;
        ProgressDialog progressdialog = new ProgressDialog(O_());
        if (bundle.containsKey("title"))
        {
            progressdialog.setTitle(bundle.getString("title"));
        }
        progressdialog.setMessage(bundle.getString("message"));
        progressdialog.setCancelable(super.b);
        progressdialog.setCanceledOnTouchOutside(bundle.getBoolean("cancelable_outside"));
        progressdialog.setProgressStyle(0);
        return progressdialog;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
    }
}
