// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            LogEntry, Measurable

public abstract class TrackedValue extends LogEntry
{

    public TrackedValue()
    {
    }

    public abstract void a(Measurable measurable);

    public abstract String c();

    public abstract Measurable d();

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" ").append(c()).append("=").append(d());
        return stringbuilder.toString();
    }
}
