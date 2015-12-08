// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.ContextThemeWrapper;

public class r
{

    private static final String a = "com.fitbit.util.DialogFragments.ARG_TITLE_RES";
    private static final String b = "com.fitbit.util.DialogFragments.ARG_MESSAGE_RES";
    private static final String c = "com.fitbit.util.DialogFragments.ARG_TITLE";
    private static final String d = "com.fitbit.util.DialogFragments.ARG_MESSAGE";

    private r()
    {
    }

    public static Bundle a(int i, int j)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.fitbit.util.DialogFragments.ARG_TITLE_RES", i);
        bundle.putInt("com.fitbit.util.DialogFragments.ARG_MESSAGE_RES", j);
        return bundle;
    }

    public static Bundle a(int i, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.fitbit.util.DialogFragments.ARG_TITLE_RES", i);
        bundle.putString("com.fitbit.util.DialogFragments.ARG_MESSAGE", s);
        return bundle;
    }

    public static Bundle a(String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.fitbit.util.DialogFragments.ARG_TITLE", s);
        bundle.putString("com.fitbit.util.DialogFragments.ARG_MESSAGE", s1);
        return bundle;
    }

    public static CharSequence a(Context context, Bundle bundle)
    {
        CharSequence charsequence = null;
        if (bundle.containsKey("com.fitbit.util.DialogFragments.ARG_TITLE_RES"))
        {
            int i = bundle.getInt("com.fitbit.util.DialogFragments.ARG_TITLE_RES");
            if (i != 0)
            {
                charsequence = context.getText(i);
            }
        } else
        if (bundle.containsKey("com.fitbit.util.DialogFragments.ARG_TITLE"))
        {
            return bundle.getString("com.fitbit.util.DialogFragments.ARG_TITLE");
        }
        return charsequence;
    }

    public static CharSequence a(DialogFragment dialogfragment)
    {
        return a(((Context) (dialogfragment.getActivity())), dialogfragment.getArguments());
    }

    public static CharSequence b(Context context, Bundle bundle)
    {
        if (bundle.containsKey("com.fitbit.util.DialogFragments.ARG_MESSAGE_RES"))
        {
            return context.getText(bundle.getInt("com.fitbit.util.DialogFragments.ARG_MESSAGE_RES"));
        }
        if (bundle.containsKey("com.fitbit.util.DialogFragments.ARG_MESSAGE"))
        {
            return bundle.getString("com.fitbit.util.DialogFragments.ARG_MESSAGE");
        } else
        {
            return null;
        }
    }

    public static CharSequence b(DialogFragment dialogfragment)
    {
        return b(((Context) (dialogfragment.getActivity())), dialogfragment.getArguments());
    }

    public static android.app.AlertDialog.Builder c(DialogFragment dialogfragment)
    {
        android.app.AlertDialog.Builder builder;
        int i;
        builder = new android.app.AlertDialog.Builder(new ContextThemeWrapper(dialogfragment.getActivity(), 0x7f0c01d0));
        dialogfragment = dialogfragment.getArguments();
        i = dialogfragment.getInt("com.fitbit.util.DialogFragments.ARG_TITLE_RES", -1);
        if (i == -1) goto _L2; else goto _L1
_L1:
        builder.setTitle(i);
_L8:
        i = dialogfragment.getInt("com.fitbit.util.DialogFragments.ARG_MESSAGE_RES", -1);
        if (i == -1) goto _L4; else goto _L3
_L3:
        builder.setMessage(i);
_L6:
        return builder;
_L2:
        if (dialogfragment.containsKey("com.fitbit.util.DialogFragments.ARG_TITLE"))
        {
            builder.setTitle(dialogfragment.getString("com.fitbit.util.DialogFragments.ARG_TITLE"));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!dialogfragment.containsKey("com.fitbit.util.DialogFragments.ARG_MESSAGE")) goto _L6; else goto _L5
_L5:
        builder.setMessage(dialogfragment.getString("com.fitbit.util.DialogFragments.ARG_MESSAGE"));
        return builder;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
