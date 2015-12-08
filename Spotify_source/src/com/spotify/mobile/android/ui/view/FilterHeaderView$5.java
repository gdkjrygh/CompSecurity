// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            FilterHeaderView

final class a
    implements android.view.ew.FilterHeaderView._cls5
{

    private FilterHeaderView a;

    public final boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i == 66 || i == 16)
        {
            a.a();
            return true;
        } else
        {
            return false;
        }
    }

    (FilterHeaderView filterheaderview)
    {
        a = filterheaderview;
        super();
    }
}
