// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.mediamonitor;

import android.content.Context;
import android.content.Intent;
import ez;
import nks;
import olm;

public final class MediaMonitor extends ez
{

    public MediaMonitor()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        ((nks)olm.a(context, nks)).a(intent);
    }
}
