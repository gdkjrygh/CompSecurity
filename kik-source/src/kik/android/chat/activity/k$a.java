// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;


// Referenced classes of package kik.android.chat.activity:
//            k

public static final class c
{

    private String a;
    private String b;
    private String c;

    static String a(c c1)
    {
        return c1.c;
    }

    static String a(c c1, String s)
    {
        c1.b = s;
        return s;
    }

    static String b(b b1)
    {
        return b1.a;
    }

    static String c(a a1)
    {
        return a1.b;
    }

    public final boolean equals(Object obj)
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
        obj = (b)obj;
        if (a == null)
        {
            if (((a) (obj)).a != null)
            {
                return false;
            }
        } else
        if (!a.equals(((a) (obj)).a))
        {
            return false;
        }
        if (b == null)
        {
            if (((b) (obj)).b != null)
            {
                return false;
            }
        } else
        if (!b.equals(((b) (obj)).b))
        {
            return false;
        }
        if (c != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((c) (obj)).c == null) goto _L1; else goto _L3
_L3:
        return false;
        if (c.equals(((c) (obj)).c)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.hashCode();
        }
        if (c != null)
        {
            l = c.hashCode();
        }
        return (j + (i + 37) * 37) * 37 + l;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append("/").append(b).toString();
    }

    public (Class class1, String s, String s1)
    {
        a = class1.getCanonicalName();
        b = s;
        c = s1;
    }
}
