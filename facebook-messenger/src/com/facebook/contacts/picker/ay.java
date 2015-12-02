// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.facebook.contacts.picker:
//            as

class ay
    implements android.view.View.OnClickListener
{

    final as a;

    ay(as as1)
    {
        a = as1;
        super();
    }

    public void onClick(View view)
    {
        a.d();
        ((InputMethodManager)a.getContext().getSystemService("input_method")).showSoftInput(as.b(a), 1);
    }
}
