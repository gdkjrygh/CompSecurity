// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture.impl;


// Referenced classes of package com.skype.android.fake.capture.impl:
//            CameraConfigOptions

public static class c
{

    private final float a;
    private final float b;
    private final float c;

    public final float a()
    {
        return a;
    }

    public final float b()
    {
        return b;
    }

    public final float c()
    {
        return c;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [hOffset=").append(a).append(", vOffset=").append(b).append(", size=").append(c).append("]").toString();
    }

    public (float f, float f1, float f2)
    {
        a = f;
        b = f1;
        c = f2;
    }
}
