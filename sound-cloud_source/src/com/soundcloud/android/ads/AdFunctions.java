// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.java.functions.Predicate;

public final class AdFunctions
{

    public static final Predicate HAS_AD_URN = new _cls1();

    private AdFunctions()
    {
    }


    private class _cls1
        implements Predicate
    {

        public final boolean apply(PropertySet propertyset)
        {
            return propertyset.contains(AdProperty.AD_URN);
        }

        public final volatile boolean apply(Object obj)
        {
            return apply((PropertySet)obj);
        }

        _cls1()
        {
        }
    }

}
