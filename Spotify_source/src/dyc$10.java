// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

final class ng.Object
    implements android.view.ClickListener
{

    private dyc a;

    public final void onClick(View view)
    {
        ((InputMethodManager)a.k().getSystemService("input_method")).hideSoftInputFromWindow(dyc.c(a).getWindowToken(), 0);
        dyc.D(a);
    }

    iew(dyc dyc1)
    {
        a = dyc1;
        super();
    }
}
