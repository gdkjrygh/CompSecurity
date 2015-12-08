// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

final class iqj
    implements TextWatcher
{

    private boolean a;
    private iqf b;

    iqj(iqf iqf1, boolean flag)
    {
        b = iqf1;
        a = flag;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (!a)
        {
            Button button = iqf.b(b).getButton(-1);
            boolean flag;
            if (charsequence.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            button.setEnabled(flag);
        }
    }
}
