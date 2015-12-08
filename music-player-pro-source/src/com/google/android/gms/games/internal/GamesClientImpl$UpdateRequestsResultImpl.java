// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.request.RequestUpdateOutcomes;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class ZL extends b
    implements com.google.android.gms.games.request.
{

    private final RequestUpdateOutcomes ZL;

    public Set getRequestIds()
    {
        return ZL.getRequestIds();
    }

    public int getRequestOutcome(String s)
    {
        return ZL.getRequestOutcome(s);
    }

    (DataHolder dataholder)
    {
        super(dataholder);
        ZL = RequestUpdateOutcomes.W(dataholder);
    }
}
