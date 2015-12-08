// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import org.bouncycastle.asn1.ocsp.ResponderID;

public class RespID
{

    ResponderID a;

    public boolean equals(Object obj)
    {
        if (!(obj instanceof RespID))
        {
            return false;
        } else
        {
            obj = (RespID)obj;
            return a.equals(((RespID) (obj)).a);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
