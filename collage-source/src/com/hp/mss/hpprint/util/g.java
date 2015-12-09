// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hp.mss.hpprint.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;

public class g
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }


    public g()
    {
    }

    public static void a(Context context, a a1)
    {
        String s = context.getString(com.hp.mss.hpprint.R.string.snap_shots_prompt_header);
        String s1 = context.getString(com.hp.mss.hpprint.R.string.snap_shots_prompt_message);
        if (!PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).getBoolean("com.hp.mss.hpprint.ShowSnapShotsMessage", true))
        {
            if (a1 != null)
            {
                a1.a();
            }
            return;
        }
        View view = View.inflate(context, com.hp.mss.hpprint.R.layout.checkbox, null);
        CheckBox checkbox = (CheckBox)view.findViewById(com.hp.mss.hpprint.R.id.checkbox);
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            checkbox.setButtonDrawable(Resources.getSystem().getIdentifier("btn_check_holo_light", "drawable", "android"));
        }
        checkbox.setText(com.hp.mss.hpprint.R.string.snap_shots_prompt_do_not_show);
        (new android.app.AlertDialog.Builder(context)).setMessage(s1).setTitle(s).setView(view).setCancelable(true).setOnCancelListener(new _cls2(a1)).setPositiveButton(com.hp.mss.hpprint.R.string.snap_shots_prompt_ok, new _cls1(checkbox, context, a1)).create().show();
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
