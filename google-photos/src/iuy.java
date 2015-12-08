// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class iuy extends al
{

    public iuy()
    {
    }

    public static iuy a(String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("message", s);
        bundle.putString("sub_message", s1);
        s = new iuy();
        s.f(bundle);
        return s;
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.q.getString("message");
        String s = super.q.getString("sub_message");
        ProgressDialog progressdialog = new ProgressDialog(O_());
        if (s == null)
        {
            progressdialog.setMessage(bundle);
        } else
        {
            progressdialog.setTitle(bundle);
            progressdialog.setMessage(s);
        }
        progressdialog.setProgressStyle(0);
        return progressdialog;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        dialoginterface = super.r;
        if (dialoginterface instanceof iuv)
        {
            ((iuv)dialoginterface).a_(super.q);
        }
    }
}
