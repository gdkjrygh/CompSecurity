// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.utils.ErrorUtils;
import rx.b.b;

final class 
    implements b
{

    public final volatile void call(Object obj)
    {
        call((Throwable)obj);
    }

    public final void call(Throwable throwable)
    {
        ErrorUtils.handleThrowable(throwable, getClass());
    }

    ()
    {
    }
}
