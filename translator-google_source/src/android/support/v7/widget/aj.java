// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//            SearchView, av

final class aj
    implements Runnable
{

    final SearchView a;

    aj(SearchView searchview)
    {
        a = searchview;
        super();
    }

    public final void run()
    {
        InputMethodManager inputmethodmanager;
        SearchView searchview;
        av av1;
        inputmethodmanager = (InputMethodManager)a.getContext().getSystemService("input_method");
        if (inputmethodmanager == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        av1 = SearchView.a;
        searchview = a;
        if (av1.c == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        av1.c.invoke(inputmethodmanager, new Object[] {
            Integer.valueOf(0), null
        });
        return;
        Exception exception;
        exception;
        inputmethodmanager.showSoftInput(searchview, 0);
        return;
    }
}
