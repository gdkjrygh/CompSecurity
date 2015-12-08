// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.autoupdate;

import android.app.Activity;

public interface AutoUpdateClient
{

    public abstract void checkForUpdate();

    public abstract void startUpdate(Activity activity);
}
