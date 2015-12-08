// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.jcp.fragments:
//            JCPCreateAccountFragment

class au
    implements TextWatcher
{

    final JCPCreateAccountFragment a;
    final JCPCreateAccountFragment..ViewInjector b;

    au(JCPCreateAccountFragment..ViewInjector viewinjector, JCPCreateAccountFragment jcpcreateaccountfragment)
    {
        b = viewinjector;
        a = jcpcreateaccountfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.onPasswordTextChanged();
    }
}
