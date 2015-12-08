// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.pcmhost;


// Referenced classes of package com.skype.pcmhost:
//            jniInput, jniInput_HwOffload

public class jniCallback
{

    public jniCallback()
    {
    }

    public static native void Init();

    public native boolean IsDefaultEndpointBluetooth();

    public native boolean RoutingChangeCallback(int i, int j, int k);

    public native void Setup(jniInput jniinput, String s);

    public native void SetupHwOffload(jniInput_HwOffload jniinput_hwoffload);

    static 
    {
        Init();
    }
}
