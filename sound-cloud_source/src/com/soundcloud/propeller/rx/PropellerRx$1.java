// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.rx;

import com.soundcloud.propeller.QueryResult;
import rx.b.a;

final class val.queryResult
    implements a
{

    final QueryResult val$queryResult;

    public final void call()
    {
        val$queryResult.release();
    }

    ()
    {
        val$queryResult = queryresult;
        super();
    }
}
