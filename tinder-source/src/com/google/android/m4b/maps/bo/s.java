// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ao.b;
import java.io.DataInput;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            am

public final class s
{

    private static s e = new s(0, 1.0F, new int[0], 0);
    public final int a;
    public final float b;
    public final int c[];
    public final int d;

    public s(int i, float f, int ai[], int j)
    {
        a = i;
        b = f;
        c = ai;
        d = j;
    }

    public static s a()
    {
        return e;
    }

    public static s a(DataInput datainput)
    {
        int k = datainput.readInt();
        float f = (float)datainput.readUnsignedByte() / 8F;
        int l = am.a(datainput);
        int ai[] = new int[l];
        for (int i = 0; i < l; i++)
        {
            ai[i] = datainput.readShort();
        }

        if (b.b)
        {
            ai = new int[0];
        }
        l = ai.length;
        int j = 0;
        do
        {
label0:
            {
                int ai1[] = ai;
                if (j < l)
                {
                    if (ai[j] != 0)
                    {
                        break label0;
                    }
                    ai1 = new int[0];
                }
                return new s(k, f, ai1, datainput.readUnsignedByte());
            }
            j++;
        } while (true);
    }

    public final int b()
    {
        return c.length * 4 + 24;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (s)obj;
            if (a != ((s) (obj)).a)
            {
                return false;
            }
            if (!Arrays.equals(c, ((s) (obj)).c))
            {
                return false;
            }
            if (d != ((s) (obj)).d)
            {
                return false;
            }
            if (Float.floatToIntBits(b) != Float.floatToIntBits(((s) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (((a + 31) * 31 + Arrays.hashCode(c)) * 31 + d) * 31 + Float.floatToIntBits(b);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Stroke{color=").append(Integer.toHexString(a)).append(", width=").append(b).append(", dashes=").append(Arrays.toString(c)).append(", endCaps=");
        if ((d & 1) != 0)
        {
            stringbuilder.append("S");
        }
        if ((d & 2) != 0)
        {
            stringbuilder.append("E");
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
