// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.common.datasource.CosmosError;
import com.spotify.mobile.android.spotlets.common.task.TimeoutOrError;

final class 
    implements ghl
{

    public final Object a(Object obj)
    {
        obj = (TimeoutOrError)obj;
        com.spotify.mobile.android.spotlets.common.datasource.Error.Reason reason;
        switch (a[((TimeoutOrError) (obj)).a.ordinal()])
        {
        default:
            throw new AssertionError("TimeoutOrError is broken");

        case 1: // '\001'
            return (CosmosError)((TimeoutOrError) (obj)).b.c();

        case 2: // '\002'
            reason = com.spotify.mobile.android.spotlets.common.datasource.Error.Reason.a;
            break;
        }
        return new CosmosError(new RuntimeException((new StringBuilder("Timed out after ")).append(((TimeoutOrError) (obj)).c).append(" ms").toString()));
    }

    ()
    {
    }
}
