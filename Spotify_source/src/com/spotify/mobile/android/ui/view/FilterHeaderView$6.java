// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.view.View;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            FilterHeaderView

final class a
    implements android.view.istener
{

    private FilterHeaderView a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            FilterHeaderView.i(a);
        }
    }

    (FilterHeaderView filterheaderview)
    {
        a = filterheaderview;
        super();
    }
}
