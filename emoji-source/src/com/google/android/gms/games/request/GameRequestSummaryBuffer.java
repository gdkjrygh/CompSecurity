// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import com.google.android.gms.common.data.DataBuffer;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequestSummaryRef, GameRequestSummary

public final class GameRequestSummaryBuffer extends DataBuffer
{

    public GameRequestSummary cB(int i)
    {
        return new GameRequestSummaryRef(DG, i);
    }

    public Object get(int i)
    {
        return cB(i);
    }
}
