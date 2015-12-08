// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import gap;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            DownloadHeaderView

final class a
    implements android.widget.kedChangeListener
{

    private DownloadHeaderView a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (DownloadHeaderView.a(a) != null)
        {
            DownloadHeaderView.a(a).a(DownloadHeaderView.b(a).isChecked());
        }
    }

    (DownloadHeaderView downloadheaderview)
    {
        a = downloadheaderview;
        super();
    }
}
