// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


final class c
{

    int a;
    int b;
    int c;

    c(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (c)obj;
            if (a != ((c) (obj)).a)
            {
                return false;
            }
            if (a != 3 || Math.abs(c - b) != 1 || c != ((c) (obj)).b || b != ((c) (obj)).c)
            {
                if (c != ((c) (obj)).c)
                {
                    return false;
                }
                if (b != ((c) (obj)).b)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (a * 31 + b) * 31 + c;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("[");
        a;
        JVM INSTR tableswitch 0 3: default 44
    //                   0 85
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s = "??";
_L7:
        return stringbuilder.append(s).append(",s:").append(b).append("c:").append(c).append("]").toString();
_L2:
        s = "add";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "rm";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "up";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "mv";
        if (true) goto _L7; else goto _L6
_L6:
    }
}
