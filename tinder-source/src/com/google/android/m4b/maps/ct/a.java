// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            q, d, f, p, 
//            m, e, h

public abstract class com.google.android.m4b.maps.ct.a
    implements q
{
    public static abstract class a
        implements q.a
    {

        private a a(byte abyte0[], int i)
        {
            try
            {
                abyte0 = com.google.android.m4b.maps.ct.e.a(abyte0, i);
                a(((e) (abyte0)), h.a());
                abyte0.a(0);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", abyte0);
            }
            return this;
        }

        private a b(d d1, h h1)
        {
            try
            {
                d1 = d1.d();
                a(d1, h1);
                d1.a(0);
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                throw d1;
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", d1);
            }
            return this;
        }

        public abstract a a();

        public abstract a a(e e1, h h1);

        public final q.a a(d d1, h h1)
        {
            return b(d1, h1);
        }

        public final q.a a(byte abyte0[])
        {
            return a(abyte0, abyte0.length);
        }

        public q.a b(e e1, h h1)
        {
            return a(e1, h1);
        }

        public Object clone()
        {
            return a();
        }

        public a()
        {
        }
    }


    private int a;

    public com.google.android.m4b.maps.ct.a()
    {
        a = 0;
    }

    public final d e()
    {
        Object obj;
        try
        {
            obj = d.a(a());
            a(((d.b) (obj)).a);
            ((d.b) (obj)).a.h();
            obj = new p(((d.b) (obj)).b);
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", ioexception);
        }
        return ((d) (obj));
    }

    public final byte[] f()
    {
        byte abyte0[];
        try
        {
            abyte0 = new byte[a()];
            f f1 = com.google.android.m4b.maps.ct.f.a(abyte0);
            a(f1);
            f1.h();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ioexception);
        }
        return abyte0;
    }
}
