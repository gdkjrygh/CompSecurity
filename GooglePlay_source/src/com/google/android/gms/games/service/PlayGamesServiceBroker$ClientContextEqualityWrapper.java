// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesServiceBroker

private static final class mClientContext
{

    private final ClientContext mClientContext;

    public final boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof mClientContext))
        {
            return false;
        }
        Object obj1 = (mClientContext)obj;
        obj = mClientContext;
        obj1 = ((mClientContext) (obj1)).mClientContext;
        if (!((ClientContext) (obj1)).equals(obj))
        {
            return false;
        }
        if (!(new HashSet(((ClientContext) (obj)).mGrantedScopes)).equals(new HashSet(((ClientContext) (obj1)).mGrantedScopes)))
        {
            return false;
        }
        if (!(new HashSet(((ClientContext) (obj)).mVisibleActions)).equals(new HashSet(((ClientContext) (obj1)).mVisibleActions)))
        {
            return false;
        }
        Object obj2 = ((ClientContext) (obj)).mExtras.keySet();
        if (!((Set) (obj2)).equals(((ClientContext) (obj1)).mExtras.keySet()))
        {
            return false;
        }
        for (obj2 = ((Set) (obj2)).iterator(); ((Iterator) (obj2)).hasNext();)
        {
            String s = (String)((Iterator) (obj2)).next();
            if (!Objects.equal(((ClientContext) (obj)).mExtras.get(s), ((ClientContext) (obj1)).mExtras.get(s)))
            {
                return false;
            }
        }

        return true;
    }

    public final int hashCode()
    {
        return mClientContext.hashCode();
    }

    (ClientContext clientcontext)
    {
        Preconditions.checkNotNull(clientcontext);
        mClientContext = clientcontext;
    }
}
