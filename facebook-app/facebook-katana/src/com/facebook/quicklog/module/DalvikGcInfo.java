// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.quicklog.module;

import com.facebook.dalvikgc.DalvikGcInstrumentation;
import com.facebook.quicklog.GCInfo;

public class DalvikGcInfo
    implements GCInfo
{

    private final DalvikGcInstrumentation a;

    public DalvikGcInfo(DalvikGcInstrumentation dalvikgcinstrumentation)
    {
        a = dalvikgcinstrumentation;
    }

    public final long a()
    {
        return a.a();
    }
}
