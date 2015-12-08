// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class ang.Object
    implements Runnable
{

    private View a;

    public final void run()
    {
        View view = a;
        ((InputMethodManager)view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }

    public (View view)
    {
        a = view;
        super();
    }
}
