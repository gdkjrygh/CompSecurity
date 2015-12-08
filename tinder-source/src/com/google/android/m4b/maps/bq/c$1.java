// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bs.e;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            c

final class <init> extends <init>
{

    private c f;

    protected final aa a(int i)
    {
        if (b[i] == null)
        {
            return null;
        } else
        {
            return new bg(super.c[i].a, h(), 256, 256, b[i], f.b, f.c);
        }
    }

    protected final byte[] b(int i)
    {
        if (b[i] == null)
        {
            return null;
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(b[i].length + 32);
        byte abyte0[];
        try
        {
            ac ac1 = super.c[i].a;
            int j = h();
            byte abyte1[] = b[i];
            DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
            dataoutputstream.writeInt(0x44524154);
            am.a(dataoutputstream, 8);
            am.a(dataoutputstream, ac1.a);
            am.a(dataoutputstream, ac1.b);
            am.a(dataoutputstream, ac1.c);
            am.a(dataoutputstream, j);
            am.a(dataoutputstream, 256);
            am.a(dataoutputstream, 256);
            am.a(dataoutputstream, abyte1.length);
            dataoutputstream.write(abyte1);
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return abyte0;
    }

    (c c1, e e)
    {
        f = c1;
        super(c1, e);
    }
}
