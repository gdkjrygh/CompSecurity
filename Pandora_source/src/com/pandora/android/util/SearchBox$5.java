// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.view.View;
import android.widget.AutoCompleteTextView;

// Referenced classes of package com.pandora.android.util:
//            SearchBox, s

class a
    implements android.view.ChangeListener
{

    final SearchBox a;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            a.a.setCursorVisible(true);
            a.c();
            return;
        } else
        {
            a.a.setCursorVisible(false);
            s.a(a.getContext(), a.a);
            return;
        }
    }

    er(SearchBox searchbox)
    {
        a = searchbox;
        super();
    }
}
