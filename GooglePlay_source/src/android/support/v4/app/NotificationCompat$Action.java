// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, RemoteInput

public static final class _cls1 extends ion
{

    public static final ion.Factory FACTORY = new NotificationCompatBase.Action.Factory() {

    };
    private final Bundle mExtras;
    private final RemoteInput mRemoteInputs[];

    public final Bundle getExtras()
    {
        return mExtras;
    }

    public final volatile teInput[] getRemoteInputs()
    {
        return mRemoteInputs;
    }

}
