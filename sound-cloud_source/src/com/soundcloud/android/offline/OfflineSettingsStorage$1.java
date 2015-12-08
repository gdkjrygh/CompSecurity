// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import rx.b.f;

final class 
    implements f
{

    public final Boolean call(String s)
    {
        return Boolean.valueOf("offline_wifi_only".equals(s));
    }

    public final volatile Object call(Object obj)
    {
        return call((String)obj);
    }

    ()
    {
    }
}
