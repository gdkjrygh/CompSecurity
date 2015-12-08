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
    public static interface Factory
    {
    }


    public abstract PendingIntent getActionIntent();

    public abstract Bundle getExtras();

    public abstract int getIcon();

    public abstract put[] getRemoteInputs();

    public abstract CharSequence getTitle();
}
