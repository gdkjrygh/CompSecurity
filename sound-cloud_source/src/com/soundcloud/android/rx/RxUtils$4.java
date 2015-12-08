// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx;

import java.util.Collection;
import rx.b;
import rx.b.f;

final class 
    implements f
{

    public final volatile Object call(Object obj)
    {
        return call((Collection)obj);
    }

    public final b call(Collection collection)
    {
        return b.from(collection);
    }

    ()
    {
    }
}
