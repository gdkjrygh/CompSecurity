// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.basictlv;


// Referenced classes of package com.google.android.apps.wallet.hce.basictlv:
//            BasicTlvException

public final class BasicTlvInvalidLengthException extends BasicTlvException
{

    public BasicTlvInvalidLengthException(int i)
    {
        this(Integer.toHexString(i));
    }

    public BasicTlvInvalidLengthException(int i, int j)
    {
        this((new StringBuilder(39)).append("expected=").append(i).append(" actual=").append(j).toString());
    }

    private BasicTlvInvalidLengthException(String s)
    {
        super(s);
    }
}
