// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.jarlehansen.protobuf.javame.b;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;
import net.jarlehansen.protobuf.javame.b;
import net.jarlehansen.protobuf.javame.d;

public class a
{

    private final byte a[];
    private final OutputStream b = null;
    private final net.jarlehansen.protobuf.javame.original.a.a c;

    public a(byte abyte0[])
    {
        a = abyte0;
        c = net.jarlehansen.protobuf.javame.original.a.a.a(abyte0);
    }

    public void a(int i, double d1)
        throws IOException
    {
        c.a(i, d1);
    }

    public void a(int i, float f)
        throws IOException
    {
        c.a(i, f);
    }

    public void a(int i, int j)
        throws IOException
    {
        c.a(i, j);
    }

    public void a(int i, int j, Vector vector)
        throws IOException
    {
        if (vector != null)
        {
            switch (j)
            {
            default:
                throw new IllegalArgumentException("The data type was not found, the id used was " + j);

            case 6: // '\006'
                for (j = 0; j < vector.size(); j++)
                {
                    a(i, (b)vector.elementAt(j));
                }

                break;

            case 4: // '\004'
                for (j = 0; j < vector.size(); j++)
                {
                    a(i, ((Double)vector.elementAt(j)).doubleValue());
                }

                break;

            case 5: // '\005'
                for (j = 0; j < vector.size(); j++)
                {
                    a(i, ((Float)vector.elementAt(j)).floatValue());
                }

                break;

            case 2: // '\002'
                for (j = 0; j < vector.size(); j++)
                {
                    a(i, ((Integer)vector.elementAt(j)).intValue());
                }

                break;

            case 3: // '\003'
                for (j = 0; j < vector.size(); j++)
                {
                    a(i, ((Long)vector.elementAt(j)).longValue());
                }

                break;

            case 1: // '\001'
                for (j = 0; j < vector.size(); j++)
                {
                    a(i, (String)vector.elementAt(j));
                }

                break;

            case 7: // '\007'
                for (j = 0; j < vector.size(); j++)
                {
                    a(i, ((Boolean)vector.elementAt(j)).booleanValue());
                }

                break;

            case 8: // '\b'
                for (j = 0; j < vector.size(); j++)
                {
                    d d1 = (d)vector.elementAt(j);
                    b(i, d1.b());
                    d1.a(this);
                }

                break;
            }
        }
    }

    public void a(int i, long l)
        throws IOException
    {
        c.a(i, l);
    }

    public void a(int i, String s)
        throws IOException
    {
        c.a(i, s);
    }

    public void a(int i, b b1)
        throws IOException
    {
        c.a(i, b1);
    }

    public void a(int i, boolean flag)
        throws IOException
    {
        c.a(i, flag);
    }

    public void b(int i, int j)
        throws IOException
    {
        c.b(i, j);
    }
}
