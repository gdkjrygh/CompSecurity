// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.i;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.util.i:
//            a

public static class b
    implements TextWatcher
{

    private final List a;
    private boolean b;

    public boolean a()
    {
        return a.isEmpty();
    }

    public void afterTextChanged(Editable editable)
    {
        if (!b)
        {
            b = true;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((TextWatcher)iterator.next()).afterTextChanged(editable)) { }
            b = false;
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (!b)
        {
            b = true;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((TextWatcher)iterator.next()).beforeTextChanged(charsequence, i, j, k)) { }
            b = false;
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (!b)
        {
            b = true;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((TextWatcher)iterator.next()).onTextChanged(charsequence, i, j, k)) { }
            b = false;
        }
    }

    public (List list)
    {
        a = list;
        b = false;
    }
}
