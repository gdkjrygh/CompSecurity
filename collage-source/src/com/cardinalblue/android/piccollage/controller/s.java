// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.Context;
import java.util.UUID;

public class s
{

    protected static UUID a;

    public s(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/cardinalblue/android/piccollage/controller/s;
        JVM INSTR monitorenter ;
        UUID uuid = a;
        if (uuid != null) goto _L4; else goto _L3
_L3:
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if ("9774d56d682e549c".equals(context)) goto _L6; else goto _L5
_L5:
        context = UUID.nameUUIDFromBytes(context.getBytes("utf8"));
_L7:
        a = context;
_L4:
        com/cardinalblue/android/piccollage/controller/s;
        JVM INSTR monitorexit ;
_L2:
        return;
_L6:
        context = UUID.randomUUID();
          goto _L7
        context;
        a = UUID.randomUUID();
          goto _L4
        context;
        com/cardinalblue/android/piccollage/controller/s;
        JVM INSTR monitorexit ;
        throw context;
          goto _L7
    }

    public UUID a()
    {
        return a;
    }
}
