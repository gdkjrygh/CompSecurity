// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.java.objects.MoreObjects;

final class StartCheckout
{

    public final String productId;

    public StartCheckout(String s)
    {
        productId = s;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            return MoreObjects.equal(productId, ((StartCheckout)obj).productId);
        }
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            productId
        });
    }
}
