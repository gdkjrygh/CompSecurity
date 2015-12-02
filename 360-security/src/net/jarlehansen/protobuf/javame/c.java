// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.jarlehansen.protobuf.javame;

import java.util.Vector;
import net.jarlehansen.protobuf.javame.original.a.a;

// Referenced classes of package net.jarlehansen.protobuf.javame:
//            b, d

public class c
{

    public static int a(int i, double d1)
    {
        return net.jarlehansen.protobuf.javame.original.a.a.b(i, d1);
    }

    public static int a(int i, float f)
    {
        return net.jarlehansen.protobuf.javame.original.a.a.b(i, f);
    }

    public static int a(int i, int j)
    {
        return net.jarlehansen.protobuf.javame.original.a.a.c(i, j);
    }

    public static int a(int i, int j, Vector vector)
    {
        if (vector != null)
        {
            switch (j)
            {
            default:
                throw new IllegalArgumentException("The data type was not found, the id used was " + j);

            case 6: // '\006'
                int k2 = 0;
                int k = 0;
                do
                {
                    j = k;
                    if (k2 >= vector.size())
                    {
                        break;
                    }
                    k += a(i, (b)vector.elementAt(k2));
                    k2++;
                } while (true);
                break;

            case 4: // '\004'
                int l2 = 0;
                int l = 0;
                do
                {
                    j = l;
                    if (l2 >= vector.size())
                    {
                        break;
                    }
                    l += a(i, ((Double)vector.elementAt(l2)).doubleValue());
                    l2++;
                } while (true);
                break;

            case 5: // '\005'
                int i3 = 0;
                int i1 = 0;
                do
                {
                    j = i1;
                    if (i3 >= vector.size())
                    {
                        break;
                    }
                    i1 += a(i, ((Float)vector.elementAt(i3)).floatValue());
                    i3++;
                } while (true);
                break;

            case 2: // '\002'
                int j3 = 0;
                int j1 = 0;
                do
                {
                    j = j1;
                    if (j3 >= vector.size())
                    {
                        break;
                    }
                    j1 += a(i, ((Integer)vector.elementAt(j3)).intValue());
                    j3++;
                } while (true);
                break;

            case 3: // '\003'
                int k3 = 0;
                int k1 = 0;
                do
                {
                    j = k1;
                    if (k3 >= vector.size())
                    {
                        break;
                    }
                    k1 += a(i, ((Long)vector.elementAt(k3)).longValue());
                    k3++;
                } while (true);
                break;

            case 1: // '\001'
                int l3 = 0;
                int l1 = 0;
                do
                {
                    j = l1;
                    if (l3 >= vector.size())
                    {
                        break;
                    }
                    l1 += a(i, (String)vector.elementAt(l3));
                    l3++;
                } while (true);
                break;

            case 7: // '\007'
                int i4 = 0;
                int i2 = 0;
                do
                {
                    j = i2;
                    if (i4 >= vector.size())
                    {
                        break;
                    }
                    i2 += a(i, ((Boolean)vector.elementAt(i4)).booleanValue());
                    i4++;
                } while (true);
                break;

            case 8: // '\b'
                int j4 = 0;
                int j2 = 0;
                do
                {
                    j = j2;
                    if (j4 >= vector.size())
                    {
                        break;
                    }
                    j2 += b(i, ((d)vector.elementAt(j4)).b());
                    j4++;
                } while (true);
                break;
            }
        } else
        {
            j = 0;
        }
        return j;
    }

    public static int a(int i, long l)
    {
        return net.jarlehansen.protobuf.javame.original.a.a.b(i, l);
    }

    public static int a(int i, String s)
    {
        return net.jarlehansen.protobuf.javame.original.a.a.b(i, s);
    }

    public static int a(int i, b b1)
    {
        return net.jarlehansen.protobuf.javame.original.a.a.b(i, b1);
    }

    public static int a(int i, boolean flag)
    {
        return net.jarlehansen.protobuf.javame.original.a.a.b(i, flag);
    }

    public static int b(int i, int j)
    {
        return net.jarlehansen.protobuf.javame.original.a.a.a(i) + net.jarlehansen.protobuf.javame.original.a.a.c(j) + j;
    }
}
