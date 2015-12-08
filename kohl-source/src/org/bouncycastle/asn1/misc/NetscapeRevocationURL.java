// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.misc;

import org.bouncycastle.asn1.DERIA5String;

public class NetscapeRevocationURL extends DERIA5String
{

    public NetscapeRevocationURL(DERIA5String deria5string)
    {
        super(deria5string.getString());
    }

    public String toString()
    {
        return (new StringBuilder()).append("NetscapeRevocationURL: ").append(getString()).toString();
    }
}
