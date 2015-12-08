// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package android.support.v7.widget:
//            SearchView

final class a
    implements Runnable
{

    final SearchView a;

    public final void run()
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)a.getContext().getSystemService("input_method");
        if (inputmethodmanager != null)
        {
            SearchView.a.a(inputmethodmanager, a);
        }
    }

    ager(SearchView searchview)
    {
        a = searchview;
        super();
    }
}
