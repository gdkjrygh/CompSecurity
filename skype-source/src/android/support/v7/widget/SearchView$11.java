// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.f;
import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            SearchView

final class a
    implements android.view.ener
{

    final SearchView a;

    public final boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (SearchView.o(a) != null)
        {
            if (SearchView.m(a).isPopupShowing() && SearchView.m(a).getListSelection() != -1)
            {
                return SearchView.a(a, i, keyevent);
            }
            if (!rchAutoComplete.a(SearchView.m(a)) && f.b(keyevent) && keyevent.getAction() == 1 && i == 66)
            {
                view.cancelLongPress();
                SearchView.a(a, SearchView.m(a).getText().toString());
                return true;
            }
        }
        return false;
    }

    rchAutoComplete(SearchView searchview)
    {
        a = searchview;
        super();
    }
}
