// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


class c
{

    int a;
    int b;
    Object c;
    int d;

    String a()
    {
        switch (a)
        {
        default:
            return "??";

        case 0: // '\0'
            return "add";

        case 1: // '\001'
            return "rm";

        case 2: // '\002'
            return "up";

        case 3: // '\003'
            return "mv";
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (a)obj;
        if (a != ((a) (obj)).a)
        {
            return false;
        }
        if (a == 3 && Math.abs(d - b) == 1 && d == ((d) (obj)).b && b == ((b) (obj)).d) goto _L1; else goto _L3
_L3:
        if (d != ((d) (obj)).d)
        {
            return false;
        }
        if (b != ((b) (obj)).b)
        {
            return false;
        }
        if (c == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (c.equals(((c) (obj)).c)) goto _L1; else goto _L4
_L4:
        return false;
        if (((c) (obj)).c == null) goto _L1; else goto _L5
_L5:
        return false;
    }

    public int hashCode()
    {
        return (a * 31 + b) * 31 + d;
    }

    public String toString()
    {
        return (new StringBuilder()).append(Integer.toHexString(System.identityHashCode(this))).append("[").append(a()).append(",s:").append(b).append("c:").append(d).append(",p:").append(c).append("]").toString();
    }

    (int i, int j, int k, Object obj)
    {
        a = i;
        b = j;
        d = k;
        c = obj;
    }
}
