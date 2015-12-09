// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

public final class NotificationCompatBase
{
    public static abstract class Action
    {

        public abstract Bundle getExtras();

        public abstract RemoteInputCompatBase.RemoteInput[] getRemoteInputs();
    }

    public static interface Action.Factory
    {
    }

}
