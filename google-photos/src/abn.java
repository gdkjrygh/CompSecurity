// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class abn
{

    public int a;
    public int b;
    Object c;
    public int d;

    abn(int i, int j, int k, Object obj)
    {
        a = i;
        b = j;
        d = k;
        c = obj;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (abn)obj;
        if (a != ((abn) (obj)).a)
        {
            return false;
        }
        if (a == 3 && Math.abs(d - b) == 1 && d == ((abn) (obj)).b && b == ((abn) (obj)).d) goto _L1; else goto _L3
_L3:
        if (d != ((abn) (obj)).d)
        {
            return false;
        }
        if (b != ((abn) (obj)).b)
        {
            return false;
        }
        if (c == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (c.equals(((abn) (obj)).c)) goto _L1; else goto _L4
_L4:
        return false;
        if (((abn) (obj)).c == null) goto _L1; else goto _L5
_L5:
        return false;
    }

    public final int hashCode()
    {
        return (a * 31 + b) * 31 + d;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(Integer.toHexString(System.identityHashCode(this))).append("[");
        a;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 109
    //                   1 115
    //                   2 121
    //                   3 127;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s = "??";
_L7:
        return stringbuilder.append(s).append(",s:").append(b).append("c:").append(d).append(",p:").append(c).append("]").toString();
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
