// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

// Referenced classes of package com.pandora.android.util:
//            SearchBox, s, x

class a
    implements TextWatcher
{

    final SearchBox a;

    public void afterTextChanged(Editable editable)
    {
        if (SearchBox.b(a) != null && !SearchBox.b(a).equals(s.a(editable)))
        {
            SearchBox.a(a, null);
            SearchBox.b(a, null);
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        boolean flag = true;
        if (charsequence.length() > 0 && !s.u())
        {
            a.b.setVisibility(0);
        }
        if (SearchBox.a(a) != null && charsequence.length() == 1)
        {
            x x1 = SearchBox.a(a);
            if (charsequence.charAt(0) != '@')
            {
                flag = false;
            }
            x1.a(flag, a.a);
        }
    }

    (SearchBox searchbox)
    {
        a = searchbox;
        super();
    }
}
