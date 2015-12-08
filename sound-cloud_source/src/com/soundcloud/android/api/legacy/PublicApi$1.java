// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;


// Referenced classes of package com.soundcloud.android.api.legacy:
//            Request

final class  extends ThreadLocal
{

    protected final Request initialValue()
    {
        return new Request();
    }

    protected final volatile Object initialValue()
    {
        return initialValue();
    }

    ()
    {
    }
}
