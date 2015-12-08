// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package android.support.v7.widget:
//            SearchView

final class a
    implements TextWatcher
{

    final SearchView a;

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        SearchView.a(a, charsequence);
    }

    (SearchView searchview)
    {
        a = searchview;
        super();
    }
}
