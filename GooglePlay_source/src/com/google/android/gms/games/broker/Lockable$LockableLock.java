// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable

public static final class  extends ReentrantLock
{

    public final String getOwnerInfo()
    {
        Thread thread = getOwner();
        if (thread != null)
        {
            return String.format("%s (tid %s)", new Object[] {
                thread.getName(), Long.valueOf(thread.getId())
            });
        } else
        {
            return "Not locked";
        }
    }

    public ()
    {
    }
}
