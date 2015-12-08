// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.CheckBox;
import android.widget.EditText;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, ng

final class ef
    implements android.content.DialogInterface.OnClickListener
{

    final CheckBox a;
    final EditText b;
    final dk c;

    ef(dk dk1, CheckBox checkbox, EditText edittext)
    {
        c = dk1;
        a = checkbox;
        b = edittext;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(dk.b(c)).edit();
        if (a.isChecked() && !TextUtils.isEmpty(b.getText()))
        {
            dk.f(c).a(b.getText().toString());
            editor.putString("sign_text", b.getText().toString());
        } else
        {
            dk.f(c).r();
        }
        editor.putBoolean("show_sign", a.isChecked());
        editor.apply();
        dialoginterface.dismiss();
    }
}
