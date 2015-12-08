// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.text.Editable;
import android.text.TextWatcher;
import java.text.ParseException;

// Referenced classes of package com.fitbit.activity.ui.activitylog:
//            ActivityLogFormFragment

class a
    implements TextWatcher
{

    final ActivityLogFormFragment a;

    public void afterTextChanged(Editable editable)
    {
        if (ActivityLogFormFragment.a(a))
        {
            return;
        }
        try
        {
            ActivityLogFormFragment.a(a, ActivityLogFormFragment.b(a));
        }
        // Misplaced declaration of an exception variable
        catch (Editable editable)
        {
            ActivityLogFormFragment.a(a, null);
        }
        ActivityLogFormFragment.c(a);
        a.K_();
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (ActivityLogFormFragment activitylogformfragment)
    {
        a = activitylogformfragment;
        super();
    }
}
