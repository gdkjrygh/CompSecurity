// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.fitbit.util.format.e;
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
            if (!TextUtils.isEmpty(editable))
            {
                ActivityLogFormFragment.a(a, Integer.valueOf((int)Math.rint(e.a(String.valueOf(editable)))));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Editable editable)
        {
            ActivityLogFormFragment.a(a, null);
        }
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
