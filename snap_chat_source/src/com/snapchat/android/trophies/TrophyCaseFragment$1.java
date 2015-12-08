// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.trophies;

import UJ;
import android.view.View;
import android.widget.AdapterView;
import java.util.List;

// Referenced classes of package com.snapchat.android.trophies:
//            TrophyCaseFragment

final class a
    implements android.widget.ckListener
{

    private TrophyCaseFragment a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        view.findViewById(0x7f0d0521).setVisibility(4);
        adapterview = (UJ)TrophyCaseFragment.a(a).get(i);
        TrophyCaseFragment.a(a, adapterview);
    }

    (TrophyCaseFragment trophycasefragment)
    {
        a = trophycasefragment;
        super();
    }
}
