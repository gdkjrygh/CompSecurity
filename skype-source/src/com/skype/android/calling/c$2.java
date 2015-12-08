// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;


// Referenced classes of package com.skype.android.calling:
//            c, CameraFacing

static final class IVESTATUS
{

    static final int a[];
    static final int b[];
    static final int c[];

    static 
    {
        c = new int[CameraFacing.values().length];
        try
        {
            c[CameraFacing.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            c[CameraFacing.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        b = new int[com.skype.ersation.LOCAL_LIVESTATUS.values().length];
        try
        {
            b[com.skype.ersation.LOCAL_LIVESTATUS.IM_LIVE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[com.skype.ersation.LOCAL_LIVESTATUS.NONE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[com.skype.o.STATUS.values().length];
        try
        {
            a[com.skype.o.STATUS.STARTING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.skype.o.STATUS.RUNNING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.skype.o.STATUS.PAUSED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
