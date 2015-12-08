// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, PhotoGridActivity

final class ed
    implements android.view.View.OnClickListener
{

    final CheckBox a;
    final EditText b;
    final dk c;

    ed(dk dk1, CheckBox checkbox, EditText edittext)
    {
        c = dk1;
        a = checkbox;
        b = edittext;
        super();
    }

    public final void onClick(View view)
    {
        if (a.isChecked())
        {
            b.setEnabled(true);
            view = b.getText().toString();
            if (view != null && view.contains("Directed by ") && view.length() > 12)
            {
                b.setSelection(12, view.length());
            }
            ((InputMethodManager)dk.b(c).getSystemService("input_method")).showSoftInput(b, 0);
            return;
        } else
        {
            b.setSelection(0);
            b.setEnabled(false);
            ((InputMethodManager)dk.b(c).getSystemService("input_method")).hideSoftInputFromWindow(b.getWindowToken(), 0);
            return;
        }
    }
}
