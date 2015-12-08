// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

final class inn
    implements Runnable
{

    private inl a;

    inn(inl inl1)
    {
        a = inl1;
        super();
    }

    public final void run()
    {
        if (a.O_() != null)
        {
            ((InputMethodManager)a.O_().getSystemService("input_method")).hideSoftInputFromWindow(a.O_().getWindow().getDecorView().getWindowToken(), 0);
        }
    }
}
