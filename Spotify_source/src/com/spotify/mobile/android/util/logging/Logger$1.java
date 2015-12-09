// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.logging;


// Referenced classes of package com.spotify.mobile.android.util.logging:
//            Logger

final class  extends ThreadLocal
{

    protected final Object initialValue()
    {
        return new Exception();
    }

    ()
    {
    }
}
