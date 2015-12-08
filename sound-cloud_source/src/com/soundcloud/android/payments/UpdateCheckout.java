// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.android.payments.googleplay.Payload;
import com.soundcloud.java.objects.MoreObjects;

final class UpdateCheckout
{

    private static final String REASON_OK = "ok";
    private static final String STATUS_FAILURE = "failure";
    private static final String STATUS_SUCCESS = "success";
    public final String payload;
    public final String reason;
    public final String signature;
    public final String state;

    private UpdateCheckout(String s, String s1, String s2, String s3)
    {
        state = s;
        reason = s1;
        payload = s2;
        signature = s3;
    }

    public static UpdateCheckout fromFailure(String s)
    {
        return new UpdateCheckout("failure", s, null, null);
    }

    public static UpdateCheckout fromSuccess(Payload payload1)
    {
        return new UpdateCheckout("success", "ok", payload1.data, payload1.signature);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UpdateCheckout)obj;
            if (!MoreObjects.equal(state, ((UpdateCheckout) (obj)).state) || !MoreObjects.equal(reason, ((UpdateCheckout) (obj)).reason) || !MoreObjects.equal(payload, ((UpdateCheckout) (obj)).payload) || !MoreObjects.equal(signature, ((UpdateCheckout) (obj)).signature))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            state, reason, payload, signature
        });
    }
}
