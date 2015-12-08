// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.pandora.android.util:
//            SearchBox

class b
    implements android.widget.ditorActionListener
{

    final SearchBox a;
    private long b;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3 || i == 0)
        {
            if (System.currentTimeMillis() - b > 400L)
            {
                a.b();
            }
            b = System.currentTimeMillis();
            return true;
        } else
        {
            return false;
        }
    }

    nListener(SearchBox searchbox)
    {
        a = searchbox;
        super();
        b = System.currentTimeMillis();
    }
}
