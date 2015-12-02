// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;


// Referenced classes of package a:
//            b

public abstract class d
{

    private b a;
    private b b;

    public d(b b1, b b2)
    {
        a = b1;
        b = b2;
    }

    public b a()
    {
        return a;
    }

    public b b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (d)obj;
        if (a == null)
        {
            if (((d) (obj)).a != null)
            {
                return false;
            }
        } else
        if (!a.equals(((d) (obj)).a))
        {
            return false;
        }
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((d) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((d) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return (i + 31) * 31 + j;
    }
}
