// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.charts.model.ChartsBlock;

public final class ang.Object
    implements hfb
{

    private emh a;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        a.a.H();
    }

    public final void onNext(Object obj)
    {
        obj = (ChartsBlock)obj;
        a.a.a(((ChartsBlock) (obj)));
    }

    public (emh emh1)
    {
        a = emh1;
        super();
    }
}
