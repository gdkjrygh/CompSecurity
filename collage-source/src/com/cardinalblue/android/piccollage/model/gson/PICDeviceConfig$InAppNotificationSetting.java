// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable, PICDeviceConfig

public static class 
    implements IGsonable
{

    public long delayMs;
    public boolean enable;

    public String toString()
    {
        return (new StringBuilder()).append("delay_ms = ").append(delayMs).append(", enable = ").append(enable).toString();
    }

    public ()
    {
    }
}
