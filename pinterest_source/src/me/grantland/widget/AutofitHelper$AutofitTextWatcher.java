// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.widget;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package me.grantland.widget:
//            AutofitHelper

class <init>
    implements TextWatcher
{

    final AutofitHelper a;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        AutofitHelper.a(a);
    }

    private (AutofitHelper autofithelper)
    {
        a = autofithelper;
        super();
    }

    a(AutofitHelper autofithelper, byte byte0)
    {
        this(autofithelper);
    }
}
