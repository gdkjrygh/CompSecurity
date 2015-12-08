// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.app.PendingIntent;
import android.os.Bundle;

public interface g
{

    public abstract void onUINeeded(PendingIntent pendingintent, Bundle bundle);

    public abstract void onUserCancel(Bundle bundle);
}
