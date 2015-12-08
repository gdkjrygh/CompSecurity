// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.basictlv;


// Referenced classes of package com.google.android.apps.wallet.hce.basictlv:
//            BasicTlvException

public final class BasicTlvInvalidValueException extends BasicTlvException
{

    public BasicTlvInvalidValueException(int i, int j)
    {
        this((new StringBuilder(51)).append("expectedLength=").append(i).append(" actualLength=").append(j).toString());
    }

    private BasicTlvInvalidValueException(String s)
    {
        super(s);
    }
}
