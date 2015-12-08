// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.functions.Function;

final class on
    implements Function
{

    public final volatile Object apply(Object obj)
    {
        return apply((Urn)obj);
    }

    public final String apply(Urn urn)
    {
        return urn.toString();
    }

    on()
    {
    }
}
