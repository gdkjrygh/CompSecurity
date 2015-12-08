// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx;

import java.util.List;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(List list)
    {
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    ()
    {
    }
}
