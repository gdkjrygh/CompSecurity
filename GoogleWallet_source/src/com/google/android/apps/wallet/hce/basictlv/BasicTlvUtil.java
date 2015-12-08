// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.basictlv;

import com.google.common.base.Throwables;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.hce.basictlv:
//            BasicTlvException, BasicConstructedTlv, BasicPrimitiveTlv, BasicTlv

public final class BasicTlvUtil
{

    public static transient BasicConstructedTlv tlv(int i, BasicTlv abasictlv[])
    {
        try
        {
            abasictlv = BasicConstructedTlv.getInstance(i).addAll(Arrays.asList(abasictlv));
        }
        // Misplaced declaration of an exception variable
        catch (BasicTlv abasictlv[])
        {
            throw Throwables.propagate(abasictlv);
        }
        return abasictlv;
    }

    public static BasicPrimitiveTlv tlv(int i, byte byte0)
    {
        BasicPrimitiveTlv basicprimitivetlv;
        try
        {
            basicprimitivetlv = BasicPrimitiveTlv.getByteInstance(i, byte0);
        }
        catch (BasicTlvException basictlvexception)
        {
            throw Throwables.propagate(basictlvexception);
        }
        return basicprimitivetlv;
    }

    public static BasicPrimitiveTlv tlv(int i, byte abyte0[])
    {
        try
        {
            abyte0 = BasicPrimitiveTlv.getInstance(i, abyte0.length, abyte0, 0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw Throwables.propagate(abyte0);
        }
        return abyte0;
    }

    public static byte[] tlvToByteArray(BasicTlv basictlv)
    {
        try
        {
            basictlv = basictlv.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (BasicTlv basictlv)
        {
            throw Throwables.propagate(basictlv);
        }
        return basictlv;
    }
}
