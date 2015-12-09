// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gxa
{

    public Object a[];
    public int b;

    public gxa(gwz gwz1, Object obj)
    {
        a = new Object[2];
        a[0] = gwz1;
        a[1] = obj;
        b = 1;
    }

    public final gwz a(int i)
    {
        if (i < 0 || i >= b)
        {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        } else
        {
            return (gwz)a[i];
        }
    }

    public final Object b(int i)
    {
        if (i < 0 || i >= b)
        {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        } else
        {
            return a[b + i];
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof gxa) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (b == ((gxa) (obj = (gxa)obj)).b)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= b * 2)
                    {
                        break label1;
                    }
                    if (!a[i].equals(((gxa) (obj)).a[i]))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final int hashCode()
    {
        int i = 0;
        int j = 0;
        for (; i < b * 2; i++)
        {
            j = j * 37 + a[i].hashCode();
        }

        return j;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{");
        String s = "";
        for (int i = 0; i < b;)
        {
            stringbuilder.append(s);
            stringbuilder.append(((gwz)a[i]).e);
            stringbuilder.append("=");
            stringbuilder.append(a[b + i]);
            i++;
            s = ", ";
        }

        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
