// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.notifications;

import android.content.Context;
import android.os.Bundle;

public interface IStatusBarNotificationsService
{

    public abstract void hideMessage(Bundle bundle);

    public abstract void showMessage(Context context, Bundle bundle);
}
