// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.app.AlertDialog;
import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.common.w.n;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;

// Referenced classes of package com.facebook.orca.threadview:
//            at, au, av, aw

public class as extends AlertDialog
{

    private final String a;
    private InputMethodManager b;
    private aw c;
    private EditText d;

    public as(Context context, String s)
    {
        super(context);
        b = (InputMethodManager)context.getSystemService("input_method");
        a = n.b(s);
        a(context);
    }

    static EditText a(as as1)
    {
        return as1.d;
    }

    private void a(Context context)
    {
        View view = LayoutInflater.from(context).inflate(k.orca_thread_name_dialog, null);
        setTitle("");
        setMessage(null);
        setView(view);
        getWindow().setSoftInputMode(4);
        d = (EditText)view.findViewById(i.thread_name_edit_text_field);
        d.setText(a);
        d.setSelection(d.getText().length());
        setButton(context.getString(o.thread_name_dialog_set_button), new at(this));
        setButton2(context.getString(o.dialog_cancel), new au(this));
        if (!n.a(a))
        {
            setButton3(context.getString(o.thread_name_dialog_remove_button), new av(this));
        }
    }

    static InputMethodManager b(as as1)
    {
        return as1.b;
    }

    static aw c(as as1)
    {
        return as1.c;
    }

    static String d(as as1)
    {
        return as1.a;
    }

    public void a(aw aw)
    {
        c = aw;
    }
}
