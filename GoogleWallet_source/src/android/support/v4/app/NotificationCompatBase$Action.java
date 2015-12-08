// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            NotificationCompatBase

public static abstract class Factory
{
    public static class Factory
    {

        Factory()
        {
        }
    }


    protected abstract PendingIntent getActionIntent();

    protected abstract Bundle getExtras();

    protected abstract int getIcon();

    protected abstract put[] getRemoteInputs();

    protected abstract CharSequence getTitle();

    public Factory()
    {
    }
}
