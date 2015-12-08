// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hp.mss.hpprint.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.CheckBox;

// Referenced classes of package com.hp.mss.hpprint.util:
//            a

public class e
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d();
    }


    public e()
    {
    }

    public static void a(Activity activity)
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/collection/promotion_3000abc_print_services"));
        intent.addFlags(0x10000000);
        activity.startActivity(intent);
        com.hp.mss.hpprint.util.a.a(activity, a.a.c);
    }

    public static void a(Activity activity, a a1)
    {
        Object obj = activity.getString(com.hp.mss.hpprint.R.string.hp_print_helper_header);
        String s = activity.getString(com.hp.mss.hpprint.R.string.install_print_plugin_msg);
        if (!PreferenceManager.getDefaultSharedPreferences(activity.getApplicationContext()).getBoolean("com.hp.mss.hpprint.ShowPluginHelper", true))
        {
            if (a1 != null)
            {
                a1.a();
            }
            return;
        } else
        {
            View view = View.inflate(new ContextThemeWrapper(activity, com.hp.mss.hpprint.R.style.printPluginHelperDialogCheckBox), com.hp.mss.hpprint.R.layout.checkbox, null);
            CheckBox checkbox = (CheckBox)view.findViewById(com.hp.mss.hpprint.R.id.checkbox);
            checkbox.setText("Do not show again.");
            obj = (new android.app.AlertDialog.Builder(new ContextThemeWrapper(activity, com.hp.mss.hpprint.R.style.printPluginHelperDialog))).setMessage(s).setTitle(((CharSequence) (obj))).setView(view).setCancelable(true).setOnCancelListener(new _cls2(a1)).setPositiveButton("Get a Print Service", null).setNeutralButton("I have one", new _cls1(checkbox, activity, a1)).create();
            ((AlertDialog) (obj)).setOnShowListener(new _cls3(((AlertDialog) (obj)), checkbox, activity, a1));
            ((AlertDialog) (obj)).show();
            com.hp.mss.hpprint.util.a.a(activity, a.a.b);
            return;
        }
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}

}
