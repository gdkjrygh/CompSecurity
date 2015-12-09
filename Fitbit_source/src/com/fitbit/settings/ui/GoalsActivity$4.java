// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.fitbit.util.format.e;
import java.text.ParseException;

// Referenced classes of package com.fitbit.settings.ui:
//            GoalsActivity

class a
    implements TextWatcher
{

    final GoalsActivity a;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        try
        {
            a.k = e.a(charsequence.toString().trim());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            a.k = 0.0D;
        }
        GoalsActivity.c(a);
    }

    (GoalsActivity goalsactivity)
    {
        a = goalsactivity;
        super();
    }
}
