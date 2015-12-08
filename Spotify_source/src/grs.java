// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import okio.ByteString;

public abstract class grs
{

    public grs()
    {
    }

    public static grs a(grn grn, byte abyte0[])
    {
        int i = abyte0.length;
        if (abyte0 == null)
        {
            throw new NullPointerException("content == null");
        } else
        {
            gsp.a(abyte0.length, i);
            return new grs(grn, i, abyte0) {

                private grn a;
                private int b;
                private byte c[];

                public final grn a()
                {
                    return a;
                }

                public final void a(hci hci1)
                {
                    hci1.a(c, b);
                }

                public final long b()
                {
                    return (long)b;
                }

            
            {
                a = grn;
                b = i;
                c = abyte0;
                super();
            }
            };
        }
    }

    public abstract grn a();

    public abstract void a(hci hci);

    public long b()
    {
        return -1L;
    }

    // Unreferenced inner class grs$1

/* anonymous class */
    final class _cls1 extends grs
    {

        private grn a;
        private ByteString b;

        public final grn a()
        {
            return a;
        }

        public final void a(hci hci1)
        {
            hci1.b(b);
        }

        public final long b()
        {
            return (long)b.f();
        }

            
            {
                a = grn;
                b = bytestring;
                super();
            }
    }

}
