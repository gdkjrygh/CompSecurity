// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.internal;


// Referenced classes of package com.htc.lib2.opensense.internal:
//            SystemWrapper

public static class _cls9
{

    public static float getHDKBaseVersion()
    {
        return ((Float)SystemWrapper.invokePublicStaticMethod("android.os.Build", "getHDKBaseVersion", Float.valueOf(0.0F), null, null)).floatValue();
    }

    public _cls9()
    {
    }
}
