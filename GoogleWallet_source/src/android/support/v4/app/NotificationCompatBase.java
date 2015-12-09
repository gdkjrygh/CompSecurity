// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

final class NotificationCompatBase
{
    public static abstract class Action
    {

        protected abstract PendingIntent getActionIntent();

        protected abstract Bundle getExtras();

        protected abstract int getIcon();

        protected abstract RemoteInputCompatBase.RemoteInput[] getRemoteInputs();

        protected abstract CharSequence getTitle();

        public Action()
        {
        }
    }

    public static class Action.Factory
    {

        Action.Factory()
        {
        }
    }

}
