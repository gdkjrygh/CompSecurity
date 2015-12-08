// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.digby;

import com.digby.localpoint.sdk.core.ILPID;

public class LPCustomID
    implements ILPID
{

    private String sid;

    public LPCustomID(String s)
    {
        sid = s;
    }

    public String getValue()
    {
        return sid;
    }
}
