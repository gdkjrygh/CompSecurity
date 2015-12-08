// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.developer;

import android.content.DialogInterface;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.base.Application;

// Referenced classes of package com.pinterest.developer:
//            DeveloperHelper

final class h
    implements android.content.lickListener
{

    final EditText a;
    final EditText b;
    final EditText c;
    final CheckBox d;
    final CheckBox e;
    final CheckBox f;
    final CheckBox g;
    final Spinner h;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        String s = a.getText().toString();
        if (s.lastIndexOf("%s") != s.length() - 2)
        {
            Application.showToast("API URL must contain AND end with '%s'");
            return;
        }
        ApiHttpClient.setBaseApiUrl(s);
        s = b.getText().toString();
        if (s.lastIndexOf("%s") != s.length() - 2)
        {
            Application.showToast("Logging API URL must contain AND end with '%s'");
            return;
        }
        ApiHttpClient.setBaseLoggingApiUrl(s);
        String s1 = c.getText().toString();
        if (s1.lastIndexOf("%s") != s.length() - 2)
        {
            Application.showToast("Logging API URL V4 must contain AND end with '%s'");
            return;
        } else
        {
            ApiHttpClient.setBaseLoggingApiUrlV4(s1);
            DeveloperHelper.a(d.isChecked());
            DeveloperHelper.b(e.isChecked());
            DeveloperHelper.c(f.isChecked());
            DeveloperHelper.d(g.isChecked());
            DeveloperHelper.a(h);
            dialoginterface.dismiss();
            return;
        }
    }

    ener(EditText edittext, EditText edittext1, EditText edittext2, CheckBox checkbox, CheckBox checkbox1, CheckBox checkbox2, CheckBox checkbox3, 
            Spinner spinner)
    {
        a = edittext;
        b = edittext1;
        c = edittext2;
        d = checkbox;
        e = checkbox1;
        f = checkbox2;
        g = checkbox3;
        h = spinner;
        super();
    }
}
