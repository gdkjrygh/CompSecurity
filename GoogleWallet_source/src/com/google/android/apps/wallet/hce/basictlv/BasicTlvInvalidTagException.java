// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.basictlv;


// Referenced classes of package com.google.android.apps.wallet.hce.basictlv:
//            BasicTlvException, BasicTlv

public final class BasicTlvInvalidTagException extends BasicTlvException
{

    public BasicTlvInvalidTagException(int i)
    {
        this(BasicTlv.getTagAsString(i));
    }

    private BasicTlvInvalidTagException(String s)
    {
        super(s);
    }
}
