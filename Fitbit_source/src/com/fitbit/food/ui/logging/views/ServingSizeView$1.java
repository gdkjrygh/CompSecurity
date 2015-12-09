// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.fitbit.food.ui.logging.views:
//            ServingSizeView

class a
    implements TextWatcher
{

    final ServingSizeView a;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        double d = a.b();
        ServingSizeView.a(a, d);
        if (ServingSizeView.a(a) != null)
        {
            ServingSizeView.a(a).a(a);
        }
        if (ServingSizeView.b(a))
        {
            a.a(true);
        }
    }

    (ServingSizeView servingsizeview)
    {
        a = servingsizeview;
        super();
    }
}
