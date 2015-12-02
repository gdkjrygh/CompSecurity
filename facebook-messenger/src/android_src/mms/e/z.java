// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;

import android_src.mms.b;

// Referenced classes of package android_src.mms.e:
//            g, e, q, j

public class z extends g
{

    public z()
    {
        try
        {
            a(128);
            b(18);
            a("application/vnd.wap.multipart.related".getBytes());
            a(new e("insert-address-token".getBytes()));
            c(c());
            return;
        }
        catch (b b1)
        {
            com.facebook.debug.log.b.d("SendReq", "Unexpected InvalidHeaderValueException.", b1);
            throw new RuntimeException(b1);
        }
    }

    z(q q1, j j)
    {
        super(q1, j);
    }

    private byte[] c()
    {
        return (new StringBuilder()).append("T").append(Long.toHexString(System.currentTimeMillis())).toString().getBytes();
    }

    public void a(byte abyte0[])
    {
        a.a(abyte0, 132);
    }

    public void a(e ae[])
    {
        a.a(ae, 151);
    }

    public void b(long l)
    {
        a.a(l, 136);
    }

    public void b(byte abyte0[])
    {
        a.a(abyte0, 138);
    }

    public byte[] b()
    {
        return a.b(152);
    }

    public void c(byte abyte0[])
    {
        a.a(abyte0, 152);
    }

    public void d(int i)
    {
        a.a(i, 134);
    }

    public void e(int i)
    {
        a.a(i, 144);
    }
}
