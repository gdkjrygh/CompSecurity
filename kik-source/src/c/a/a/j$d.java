// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c.a.a;


// Referenced classes of package c.a.a:
//            j

private static final class <init>
    implements Object
{

    public final boolean a(String s)
    {
        if (s != null)
        {
            int k = s.length();
            if (k == 0)
            {
                return true;
            }
            if (s.trim() != s)
            {
                return true;
            }
            char c1 = s.charAt(0);
            if (c1 >= '0' && c1 <= '9' || c1 == '-')
            {
                return true;
            }
            for (int i = 0; i < k; i++)
            {
                char c = s.charAt(i);
                if (j.a(c))
                {
                    return true;
                }
                if (j.d(c))
                {
                    return true;
                }
                if (j.b(c))
                {
                    return true;
                }
                if (j.e(c))
                {
                    return true;
                }
            }

            if (j.a(s))
            {
                return true;
            }
        }
        return false;
    }

    private String()
    {
    }

    String(byte byte0)
    {
        this();
    }
}
