// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import com.google.android.gms.auth.GoogleAuthException;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.broker:
//            GamesClientContext

public interface EventResolver
{

    public abstract long resolveEventInstanceWithCount(GamesClientContext gamesclientcontext, String s, long l, ArrayList arraylist);

    public abstract int sendPendingOps(GamesClientContext gamesclientcontext)
        throws GoogleAuthException;
}
