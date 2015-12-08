// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


// Referenced classes of package com.skype.android.push:
//            PushTelemetry

public static final class A extends Enum
{

    private static final CONTEXTS $VALUES[];
    public static final CONTEXTS COMPLETE;
    public static final CONTEXTS CONTEXTS;
    public static final CONTEXTS FAILED;
    public static final CONTEXTS RECOVERABLE;
    public static final CONTEXTS REGISTER;
    public static final CONTEXTS SUPPORTED;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/skype/android/push/PushTelemetry$RegistrationCheckpoint, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        SUPPORTED = new <init>("SUPPORTED", 0);
        REGISTER = new <init>("REGISTER", 1);
        RECOVERABLE = new <init>("RECOVERABLE", 2);
        FAILED = new <init>("FAILED", 3);
        COMPLETE = new <init>("COMPLETE", 4);
        CONTEXTS = new <init>("CONTEXTS", 5);
        $VALUES = (new .VALUES[] {
            SUPPORTED, REGISTER, RECOVERABLE, FAILED, COMPLETE, CONTEXTS
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
