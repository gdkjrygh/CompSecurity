// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ad.a;
import com.google.android.m4b.maps.bs.e;
import java.io.DataInput;
import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ah, am, ac, bg, 
//            aa

static final class b
    implements com.google.android.m4b.maps.be.b
{

    private final ah a;
    private final e b;

    public final aa a(ac ac1, byte abyte0[], int i, long l, long l1)
    {
        abyte0 = new a(abyte0);
        abyte0.skipBytes(i);
        ah ah1 = a;
        e e = b;
        i = abyte0.readInt();
        if (i != 0x44524154)
        {
            throw new IOException((new StringBuilder(32)).append("TILE_MAGIC expected: ").append(i).toString());
        }
        i = com.google.android.m4b.maps.bo.am.a(abyte0);
        if (i != 7 && i != 8)
        {
            ac1 = String.valueOf("Version mismatch: 7 or 8 expected, ");
            throw new IOException((new StringBuilder(String.valueOf(ac1).length() + 17)).append(ac1).append(i).append(" found").toString());
        }
        ac ac2 = com.google.android.m4b.maps.bo.ac.a(abyte0);
        if (ac2.b != ac1.b || ac2.c != ac1.c || ac2.a != ac1.a)
        {
            ac1 = String.valueOf(ac1);
            abyte0 = String.valueOf(ac2);
            throw new IOException((new StringBuilder(String.valueOf(ac1).length() + 36 + String.valueOf(abyte0).length())).append("Expected tile coords: ").append(ac1).append(" but received ").append(abyte0).toString());
        } else
        {
            i = com.google.android.m4b.maps.bo.am.a(abyte0);
            int j = com.google.android.m4b.maps.bo.am.a(abyte0);
            int k = com.google.android.m4b.maps.bo.am.a(abyte0);
            byte abyte1[] = new byte[com.google.android.m4b.maps.bo.am.a(abyte0)];
            abyte0.readFully(abyte1);
            return new bg(ac1, i, j, k, abyte1, ah1, e);
        }
    }

    public (ah ah1, e e)
    {
        a = ah1;
        b = e;
    }
}
