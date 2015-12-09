// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.content.AbstractThreadedSyncAdapter;
import android.os.Process;
import android.text.TextUtils;

public final class StatsUtils
{

    public static String getEventKey(AbstractThreadedSyncAdapter abstractthreadedsyncadapter, String s)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(String.valueOf((long)Process.myPid() << 32 | (long)System.identityHashCode(abstractthreadedsyncadapter)));
        abstractthreadedsyncadapter = s;
        if (TextUtils.isEmpty(s))
        {
            abstractthreadedsyncadapter = "";
        }
        return stringbuilder.append(abstractthreadedsyncadapter).toString();
    }
}
