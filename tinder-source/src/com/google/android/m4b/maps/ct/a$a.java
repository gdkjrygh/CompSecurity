// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            a, m, e, h, 
//            d

public static abstract class 
    implements 
{

    private  a(byte abyte0[], int i)
    {
        try
        {
            abyte0 = e.a(abyte0, i);
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

    public final a a(d d1, h h1)
    {
        return b(d1, h1);
    }

    public final b a(byte abyte0[])
    {
        return a(abyte0, abyte0.length);
    }

    public a b(e e1, h h1)
    {
        return a(e1, h1);
    }

    public Object clone()
    {
        return a();
    }

    public ()
    {
    }
}
