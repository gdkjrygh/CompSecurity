// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.googleplay;

import com.soundcloud.java.objects.MoreObjects;

public final class Payload
{

    public final String data;
    public final String signature;

    public Payload(String s, String s1)
    {
        data = s;
        signature = s1;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Payload)obj;
            if (!MoreObjects.equal(data, ((Payload) (obj)).data) || !MoreObjects.equal(signature, ((Payload) (obj)).signature))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            data, signature
        });
    }
}
