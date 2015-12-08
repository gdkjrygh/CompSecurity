// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;

class SessionMetadataCollector
{

    final Context a;
    final IdManager b;
    final String c;
    final String d;

    public SessionMetadataCollector(Context context, IdManager idmanager, String s, String s1)
    {
        a = context;
        b = idmanager;
        c = s;
        d = s1;
    }
}
