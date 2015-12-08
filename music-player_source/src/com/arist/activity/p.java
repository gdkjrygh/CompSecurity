// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.app.Dialog;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.arist.a.a;
import com.arist.b.b;
import com.arist.model.b.c;

// Referenced classes of package com.arist.activity:
//            MainActivity

final class p
    implements android.view.View.OnClickListener
{

    final MainActivity a;
    private final Dialog b;
    private final EditText c;
    private final EditText d;
    private final EditText e;

    p(MainActivity mainactivity, Dialog dialog, EditText edittext, EditText edittext1, EditText edittext2)
    {
        a = mainactivity;
        b = dialog;
        c = edittext;
        d = edittext1;
        e = edittext2;
        super();
    }

    public final void onClick(View view)
    {
        b.dismiss();
        a.e.c(c.getText().toString());
        a.e.e(d.getText().toString());
        a.e.f(e.getText().toString());
        MainActivity.m(a).a(a.e);
        MainActivity.e(a).notifyDataSetChanged();
    }
}
