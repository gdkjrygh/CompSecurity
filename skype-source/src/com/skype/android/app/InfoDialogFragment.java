// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.android.SkypeDialogFragment;

public class InfoDialogFragment extends SkypeDialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    protected static final String EXTRA_NEUTRAL = "neutralButton";
    protected static final String EXTRA_POSITIVE = "positiveButton";
    protected static final String EXTRA_TEXT = "android.intent.extra.TEXT";
    protected static final String EXTRA_TITLE = "android.intent.extra.TITLE";

    public InfoDialogFragment()
    {
    }

    public static InfoDialogFragment create(String s, String s1, String s2)
    {
        return create(s, s1, s2, com/skype/android/app/InfoDialogFragment);
    }

    public static InfoDialogFragment create(String s, String s1, String s2, Class class1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("android.intent.extra.TITLE", s);
        bundle.putString("android.intent.extra.TEXT", s1);
        bundle.putString("positiveButton", s2);
        return (InfoDialogFragment)SkypeDialogFragment.create(bundle, class1);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(getArguments().getString("android.intent.extra.TITLE"));
        bundle.b(getArguments().getString("android.intent.extra.TEXT"));
        bundle.a(getArguments().getString("positiveButton"), this);
        String s = getArguments().getString("neutralButton");
        if (s != null)
        {
            bundle.c(s, this);
        }
        return bundle.c();
    }
}
