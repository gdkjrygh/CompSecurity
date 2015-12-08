// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import java.util.concurrent.Callable;

public class MarkChangedUserTasksCompletedTask
    implements Callable
{

    private final SharedPreferences globalPrefs;

    MarkChangedUserTasksCompletedTask(SharedPreferences sharedpreferences)
    {
        globalPrefs = sharedpreferences;
    }

    private Void call()
    {
        SharedPreference.CHANGED_USER.put(globalPrefs, Boolean.valueOf(false));
        return null;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }
}
