// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.DERInteger;

public class SubsequentMessage extends DERInteger
{

    public static final SubsequentMessage b = new SubsequentMessage(0);
    public static final SubsequentMessage c = new SubsequentMessage(1);

    private SubsequentMessage(int i)
    {
        super(i);
    }

}
