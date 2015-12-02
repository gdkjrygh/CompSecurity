// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.facebook.contacts.picker:
//            as

class av
    implements TextWatcher
{

    final as a;

    av(as as1)
    {
        a = as1;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        as.a(a);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
