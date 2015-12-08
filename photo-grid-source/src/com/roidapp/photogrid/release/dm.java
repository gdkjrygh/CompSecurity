// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, PhotoGridActivity

final class dm
    implements TextWatcher
{

    final TextView a;
    final AlertDialog b;
    final EditText c;
    final dk d;

    dm(dk dk1, TextView textview, AlertDialog alertdialog, EditText edittext)
    {
        d = dk1;
        a = textview;
        b = alertdialog;
        c = edittext;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        a.setText(String.valueOf(140 - c.getEditableText().length()));
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (charsequence.length() > 140 && (charsequence.length() + j) - k <= 140)
        {
            a.setTextColor(dk.b(d).getResources().getColor(0x7f0c008b));
            b.getButton(-1).setEnabled(false);
        } else
        if (charsequence.length() <= 140 && (charsequence.length() + j) - k > 140)
        {
            a.setTextColor(dk.b(d).getResources().getColor(0x7f0c00cf));
            b.getButton(-1).setEnabled(true);
            return;
        }
    }
}
