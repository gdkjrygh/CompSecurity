// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture;


// Referenced classes of package com.microsoft.dl.video.capture:
//            CapturerConfiguration

public static class a
{

    private final boolean a;

    public final boolean isMandatory()
    {
        return a;
    }

    public final String toString()
    {
        if (a)
        {
            return "mandatory";
        } else
        {
            return "optional";
        }
    }

    public (boolean flag)
    {
        a = flag;
    }
}
