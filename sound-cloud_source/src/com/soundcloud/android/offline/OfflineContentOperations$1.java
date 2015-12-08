// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.propeller.WriteResult;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(WriteResult writeresult)
    {
        return Boolean.valueOf(writeresult.success());
    }

    public final volatile Object call(Object obj)
    {
        return call((WriteResult)obj);
    }

    ()
    {
    }
}
