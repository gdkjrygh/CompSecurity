// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.UUID;

public final class bcm
{

    public static UUID a(byte abyte0[])
    {
        abyte0 = new bec(abyte0);
        if (!a(((bec) (abyte0)), null))
        {
            return null;
        } else
        {
            abyte0.a(12);
            return new UUID(abyte0.g(), abyte0.g());
        }
    }

    public static boolean a(bec bec1, UUID uuid)
    {
        if (bec1.c >= 32) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        bec1.a(0);
        if (bec1.f() != bec1.b() + 4 || bec1.f() != bcf.H) goto _L1; else goto _L3
_L3:
        bec1.a(12);
        if (uuid != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        bec1.b(16);
_L6:
        if (bec1.f() != bec1.b()) goto _L1; else goto _L4
_L4:
        return true;
        if (bec1.g() != uuid.getMostSignificantBits()) goto _L1; else goto _L5
_L5:
        if (bec1.g() != uuid.getLeastSignificantBits())
        {
            return false;
        }
          goto _L6
    }
}
