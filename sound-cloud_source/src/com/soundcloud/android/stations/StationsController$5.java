// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.model.Urn;
import rx.b.f;

final class llectionPlayState
    implements f
{

    public final Boolean call(llectionPlayState llectionplaystate)
    {
        boolean flag;
        if (llectionPlayState.access._mth100(llectionplaystate).isStation() && llectionPlayState.access._mth300(llectionplaystate).PlayerPlaying())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final volatile Object call(Object obj)
    {
        return call((llectionPlayState)obj);
    }

    llectionPlayState()
    {
    }
}
