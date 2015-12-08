// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemView

public static class _cls9
{

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300d2, viewgroup, false);
        viewgroup.setTag(new TrackItemView(viewgroup));
        return viewgroup;
    }

    public _cls9()
    {
    }
}
