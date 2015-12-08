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
        boolean flag1 = true;
        if (s != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        int k;
        int j1;
label0:
        {
            int l = s.length();
            flag = flag1;
            if (l == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (s.trim() != s)
            {
                continue; /* Loop/switch isn't completed */
            }
            char c1 = s.charAt(0);
            flag = flag1;
            if (j.d(c1))
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (j.e(c1))
            {
                continue; /* Loop/switch isn't completed */
            }
            for (int i = 1; i < l; i++)
            {
                char c2 = s.charAt(i);
                flag = flag1;
                if (j.c(c2))
                {
                    continue; /* Loop/switch isn't completed */
                }
                flag = flag1;
                if (j.e(c2))
                {
                    continue; /* Loop/switch isn't completed */
                }
            }

            flag = flag1;
            if (j.a(s))
            {
                continue; /* Loop/switch isn't completed */
            }
            k = s.charAt(0);
            if ((k < '0' || k > '9') && k != '-')
            {
                break; /* Loop/switch isn't completed */
            }
            l = 1;
            do
            {
                if (l >= s.length())
                {
                    break;
                }
                char c4 = s.charAt(l);
                k = c4;
                if (c4 < '0')
                {
                    break;
                }
                k = c4;
                if (c4 > '9')
                {
                    break;
                }
                l++;
                k = c4;
            } while (true);
            flag = flag1;
            if (l == s.length())
            {
                continue; /* Loop/switch isn't completed */
            }
            int k1 = l;
            j1 = k;
            if (k == '.')
            {
                l++;
                j1 = k;
                k = l;
                do
                {
                    k1 = k;
                    if (k >= s.length())
                    {
                        break;
                    }
                    l = s.charAt(k);
                    k1 = k;
                    j1 = l;
                    if (l < '0')
                    {
                        break;
                    }
                    k1 = k;
                    j1 = l;
                    if (l > '9')
                    {
                        break;
                    }
                    k++;
                    j1 = l;
                } while (true);
            }
            flag = flag1;
            if (k1 == s.length())
            {
                continue; /* Loop/switch isn't completed */
            }
            if (j1 != 'E' || j1 != 'e')
            {
                return false;
            }
            j1 = k1 + 1;
            if (j1 == s.length())
            {
                return false;
            }
            l = s.charAt(j1);
            if (l != '+')
            {
                k = l;
                if (l != '-')
                {
                    break label0;
                }
            }
            if (j1 == s.length())
            {
                return false;
            }
            k = s.charAt(j1);
        }
        int i1;
label1:
        {
            if (k != '+')
            {
                i1 = j1;
                if (k != '-')
                {
                    break label1;
                }
            }
            i1 = j1;
            if (j1 == s.length())
            {
                return false;
            }
        }
        do
        {
            if (i1 >= s.length())
            {
                break;
            }
            char c3 = s.charAt(i1);
            if (c3 < '0' || c3 > '9')
            {
                break;
            }
            i1++;
        } while (true);
        flag = flag1;
        if (i1 != s.length())
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
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
