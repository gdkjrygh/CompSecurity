// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture.impl;


// Referenced classes of package com.skype.android.video.capture.impl:
//            Capturer

private static final class _cls9 extends Enum
{

    private static final STOPPED $VALUES[];
    public static final STOPPED STARTED;
    public static final STOPPED STOPPED;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/skype/android/video/capture/impl/Capturer$State, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        STARTED = new <init>("STARTED", 0);
        STOPPED = new <init>("STOPPED", 1);
        $VALUES = (new .VALUES[] {
            STARTED, STOPPED
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
