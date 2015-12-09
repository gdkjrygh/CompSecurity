// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.savedstate.LoadSavedState;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, ez, i

public class bq extends e
{

    private static final String a = "SyncChallengeAndChallengeTypeLists";
    private static final long b = 30000L;

    public bq(bs bs1, boolean flag)
    {
        super(bs1, flag);
        bs1.c().a(Long.valueOf(30000L), c());
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        i.a().b();
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.f, com.fitbit.savedstate.LoadSavedState.Status.b);
        return;
        a1;
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.f, com.fitbit.savedstate.LoadSavedState.Status.c, com.fitbit.savedstate.LoadSavedState.Status.a);
        throw a1;
    }

    public String c()
    {
        return "SyncChallengeAndChallengeTypeLists";
    }
}
