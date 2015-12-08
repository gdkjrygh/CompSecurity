// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.iso7816;

import com.google.android.apps.wallet.hce.util.Hex;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Bytes;
import com.google.common.primitives.Shorts;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class ResponseApdu
{

    public static final ResponseApdu SW_CLA_NOT_SUPPORTED = fromStatusWord(28160);
    public static final ResponseApdu SW_CONDITIONS_NOT_SATISFIED = fromStatusWord(27013);
    public static final ResponseApdu SW_FILE_NOT_FOUND = fromStatusWord(27266);
    public static final ResponseApdu SW_INCORRECT_P1P2 = fromStatusWord(27270);
    public static final ResponseApdu SW_INS_NOT_SUPPORTED = fromStatusWord(27904);
    public static final ResponseApdu SW_UNKNOWN = fromStatusWord(28416);
    public static final ResponseApdu SW_WRONG_DATA = fromStatusWord(27264);
    public static final ResponseApdu SW_WRONG_LENGTH = fromStatusWord(26368);
    public static final ResponseApdu SW_WRONG_P1P2 = fromStatusWord(27392);
    private final long cmdTimeMillis;
    private final byte rdata[];
    private final int sw;

    private ResponseApdu(byte abyte0[], int i, long l)
    {
        rdata = abyte0;
        sw = i;
        cmdTimeMillis = l;
    }

    public static ResponseApdu fromDataAndStatusWord(byte abyte0[], int i)
    {
        boolean flag;
        if (i >> 16 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return fromResponse(Bytes.concat(new byte[][] {
            abyte0, Shorts.toByteArray((short)i)
        }));
    }

    private static ResponseApdu fromResponse(byte abyte0[])
    {
        return fromResponse(abyte0, -1L, TimeUnit.MILLISECONDS);
    }

    private static ResponseApdu fromResponse(byte abyte0[], long l, TimeUnit timeunit)
    {
        Preconditions.checkNotNull(abyte0);
        int i = abyte0.length;
        l = timeunit.toMillis(l);
        boolean flag;
        if (i >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid response APDU after %sms. Must be at least 2 bytes long: [%s]", new Object[] {
            Long.valueOf(l), Hex.encode(abyte0)
        });
        abyte0 = ByteBuffer.wrap(abyte0);
        i -= 2;
        timeunit = new byte[i];
        abyte0.get(timeunit, 0, i);
        return new ResponseApdu(timeunit, abyte0.getShort() & 0xffff, l);
    }

    public static ResponseApdu fromStatusWord(int i)
    {
        boolean flag;
        if (i >> 16 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return fromResponse(Shorts.toByteArray((short)i));
    }

    public final boolean equals(Object obj)
    {
        if (obj != null && getClass() == obj.getClass())
        {
            obj = (ResponseApdu)obj;
            if (Arrays.equals(rdata, ((ResponseApdu) (obj)).rdata) && sw == ((ResponseApdu) (obj)).sw)
            {
                return true;
            }
        }
        return false;
    }

    public final int getStatusWord()
    {
        return sw;
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Integer.valueOf(Arrays.hashCode(rdata)), Integer.valueOf(sw)
        });
    }

    public final byte[] toByteArray()
    {
        return Bytes.concat(new byte[][] {
            rdata, Shorts.toByteArray((short)sw)
        });
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Response: ");
        if (rdata != null && rdata.length > 0)
        {
            stringbuilder.append(Hex.encode(rdata)).append(", ");
        }
        stringbuilder.append(String.format("SW=%04x", new Object[] {
            Integer.valueOf(sw)
        }));
        if (cmdTimeMillis > -1L)
        {
            stringbuilder.append(String.format(", elapsed: %dms", new Object[] {
                Long.valueOf(cmdTimeMillis)
            }));
        }
        return stringbuilder.toString();
    }

}
