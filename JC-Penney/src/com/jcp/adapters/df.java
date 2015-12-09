// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

class df extends DebouncingOnClickListener
{

    final UPSTrackAdapter.ActivityViewHolder a;
    final UPSTrackAdapter.ActivityViewHolder..ViewInjector b;

    df(UPSTrackAdapter.ActivityViewHolder..ViewInjector viewinjector, UPSTrackAdapter.ActivityViewHolder activityviewholder)
    {
        b = viewinjector;
        a = activityviewholder;
        super();
    }

    public void doClick(View view)
    {
        a.onPhoneClick();
    }
}
