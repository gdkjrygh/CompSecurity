// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.text.Editable;
import android.text.TextWatcher;
import gas;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            FilterHeaderView

final class a
    implements TextWatcher
{

    private FilterHeaderView a;

    public final void afterTextChanged(Editable editable)
    {
        if (FilterHeaderView.b(a) != null)
        {
            FilterHeaderView.b(a).a(editable.toString());
        }
        FilterHeaderView.h(a);
        if (FilterHeaderView.b(a) != null && !a.b())
        {
            FilterHeaderView.b(a).a();
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (FilterHeaderView filterheaderview)
    {
        a = filterheaderview;
        super();
    }
}
