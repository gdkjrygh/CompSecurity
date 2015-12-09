// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.broker:
//            GameEventListenerRegistry

private static final class mExternalGameId
{

    final String mAccountName;
    final String mExternalGameId;

    public final boolean equals(Object obj)
    {
        if (obj instanceof mExternalGameId)
        {
            if (Objects.equal(mAccountName, ((mAccountName) (obj = (mAccountName)obj)).mAccountName) && Objects.equal(mExternalGameId, ((mExternalGameId) (obj)).mExternalGameId))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mAccountName, mExternalGameId
        });
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).ternalGameId("Account", mAccountName).countName("GameId", mExternalGameId).ternalGameId();
    }

    public (String s, String s1)
    {
        mAccountName = s;
        mExternalGameId = s1;
    }
}
