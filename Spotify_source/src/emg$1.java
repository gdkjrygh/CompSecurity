// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.charts.model.Chart;

public final class ang.Object
    implements hfb
{

    private emg a;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        emg.a(a).J();
    }

    public final void onNext(Object obj)
    {
        obj = (Chart)obj;
        emg.a(a).a(((Chart) (obj)));
    }

    public (emg emg1)
    {
        a = emg1;
        super();
    }
}
