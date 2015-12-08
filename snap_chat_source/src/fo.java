// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public abstract class fo
{

    public volatile int a;

    public fo()
    {
        a = -1;
    }

    public static final fo a(fo fo1, byte abyte0[], int i)
    {
        try
        {
            abyte0 = new fk(abyte0, i);
            fo1.a(((fk) (abyte0)));
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (fo fo1)
        {
            throw fo1;
        }
        // Misplaced declaration of an exception variable
        catch (fo fo1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return fo1;
    }

    public abstract fo a(fk fk1);

    public volatile Object clone()
    {
        return (fo)super.clone();
    }

    public String toString()
    {
        return fp.a(this);
    }
}
