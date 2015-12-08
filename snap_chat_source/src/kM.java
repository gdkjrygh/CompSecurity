// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class kM
{
    public static final class a
    {

        final kO mAdListener;
        final kK mAdPlacement;

        public a(kK kk, kO ko)
        {
            mAdPlacement = kk;
            mAdListener = ko;
        }
    }


    final Map mAdUnitIdToOutstandingRequestFlag = ep.a();
    final Map mAdUnitIdToQueuedRequests = ep.a();

    public kM()
    {
    }
}
