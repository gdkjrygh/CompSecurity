// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common.byteSources;


// Referenced classes of package org.apache.sanselan.common.byteSources:
//            ByteSourceInputStream

class a
{

    public final byte a[];
    final ByteSourceInputStream b;
    private c c;
    private boolean d;

    public final a a()
    {
        if (c != null)
        {
            return c;
        }
        if (d)
        {
            return null;
        } else
        {
            d = true;
            c = ByteSourceInputStream.a(b);
            return c;
        }
    }

    public (ByteSourceInputStream bytesourceinputstream, byte abyte0[])
    {
        b = bytesourceinputstream;
        super();
        c = null;
        d = false;
        a = abyte0;
    }
}
