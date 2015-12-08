// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class baf
{

    private Class a;
    private Class b;
    private Class c;

    public baf()
    {
    }

    public baf(Class class1, Class class2)
    {
        a(class1, class2, null);
    }

    public baf(Class class1, Class class2, Class class3)
    {
        a(class1, class2, class3);
    }

    public final void a(Class class1, Class class2, Class class3)
    {
        a = class1;
        b = class2;
        c = class3;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (baf)obj;
            if (!a.equals(((baf) (obj)).a))
            {
                return false;
            }
            if (!b.equals(((baf) (obj)).b))
            {
                return false;
            }
            if (c == null && ((baf) (obj)).c != null)
            {
                return false;
            }
            if (c != null && !c.equals(((baf) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = a.hashCode();
        int k = b.hashCode();
        int i;
        if (c != null)
        {
            i = c.hashCode();
        } else
        {
            i = 0;
        }
        return i + (j * 31 + k) * 31;
    }

    public final String toString()
    {
        String s = String.valueOf("MultiClassKey{first=");
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 10 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", second=").append(s2).append("}").toString();
    }
}
