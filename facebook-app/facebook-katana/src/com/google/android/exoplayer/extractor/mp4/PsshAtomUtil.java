// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//            Atom

public final class PsshAtomUtil
{

    private PsshAtomUtil()
    {
    }

    public static UUID a(byte abyte0[])
    {
        abyte0 = new ParsableByteArray(abyte0);
        if (!a(((ParsableByteArray) (abyte0)), null))
        {
            return null;
        } else
        {
            abyte0.b(12);
            return new UUID(abyte0.k(), abyte0.k());
        }
    }

    private static boolean a(ParsableByteArray parsablebytearray, UUID uuid)
    {
        if (parsablebytearray.c() >= 32) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        parsablebytearray.b(0);
        if (parsablebytearray.j() != parsablebytearray.b() + 4 || parsablebytearray.j() != Atom.I) goto _L1; else goto _L3
_L3:
        parsablebytearray.b(12);
        if (uuid != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        parsablebytearray.c(16);
_L6:
        if (parsablebytearray.j() != parsablebytearray.b()) goto _L1; else goto _L4
_L4:
        return true;
        if (parsablebytearray.k() != uuid.getMostSignificantBits()) goto _L1; else goto _L5
_L5:
        if (parsablebytearray.k() != uuid.getLeastSignificantBits())
        {
            return false;
        }
          goto _L6
    }
}
