// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.ui.fragment;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.kik.ui.fragment:
//            FragmentBase

final class d
    implements Runnable
{

    final View a;
    final boolean b;
    final FragmentBase c;

    d(FragmentBase fragmentbase, View view, boolean flag)
    {
        c = fragmentbase;
        a = view;
        b = flag;
        super();
    }

    public final void run()
    {
        a.requestFocus();
        InputMethodManager inputmethodmanager = c.v;
        View view = a;
        int i;
        if (b)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        inputmethodmanager.showSoftInput(view, i);
    }
}
