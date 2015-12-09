// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;

public class e extends DialogFragment
{

    private android.content.DialogInterface.OnClickListener a;
    private android.content.DialogInterface.OnClickListener b;
    private android.content.DialogInterface.OnDismissListener c;

    public e()
    {
    }

    public static e a(String s, String s1, String s2, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        return a(s, s1, s2, onclicklistener, null, null);
    }

    public static e a(String s, String s1, String s2, android.content.DialogInterface.OnClickListener onclicklistener, String s3, android.content.DialogInterface.OnClickListener onclicklistener1)
    {
        return a(s, s1, s2, onclicklistener, s3, onclicklistener1, null);
    }

    public static e a(String s, String s1, String s2, android.content.DialogInterface.OnClickListener onclicklistener, String s3, android.content.DialogInterface.OnClickListener onclicklistener1, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        e e1 = new e();
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putString("message", s1);
        bundle.putString("positive_button_title", s2);
        bundle.putString("negative_button_title", s3);
        e1.setArguments(bundle);
        e1.a(onclicklistener, onclicklistener1, ondismisslistener);
        return e1;
    }

    void a(android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        a = onclicklistener;
        b = onclicklistener1;
        c = ondismisslistener;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        Object obj = getArguments();
        bundle = ((Bundle) (obj)).getString("title");
        String s = ((Bundle) (obj)).getString("message");
        Object obj1 = ((Bundle) (obj)).getString("positive_button_title");
        obj1 = (new android.app.AlertDialog.Builder(getActivity())).setPositiveButton(((CharSequence) (obj1)), a).setCancelable(false);
        obj = ((Bundle) (obj)).getString("negative_button_title");
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            ((android.app.AlertDialog.Builder) (obj1)).setNegativeButton(((CharSequence) (obj)), b);
        }
        obj = ((android.app.AlertDialog.Builder) (obj1)).create();
        if (!TextUtils.isEmpty(bundle))
        {
            ((AlertDialog) (obj)).setTitle(bundle);
        }
        if (!TextUtils.isEmpty(s))
        {
            ((AlertDialog) (obj)).setMessage(s);
        }
        return ((Dialog) (obj));
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (c != null)
        {
            c.onDismiss(dialoginterface);
        }
    }
}
