// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            nj, iw, nh, nn

public final class ix extends nj
{

    public String a;
    public iw b[];

    public ix()
    {
        a = "";
        b = iw.b();
        o = null;
        p = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (!a.equals(""))
        {
            i = j + nh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    iw iw1 = b[j];
                    int k = i;
                    if (iw1 != null)
                    {
                        k = i + nh.b(2, iw1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public final void a(nh nh1)
    {
        if (!a.equals(""))
        {
            nh1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                iw iw1 = b[i];
                if (iw1 != null)
                {
                    nh1.a(2, iw1);
                }
            }

        }
        super.a(nh1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof ix))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (ix)obj;
        if (a != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((ix) (obj)).a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (nn.a(b, ((ix) (obj)).b))
        {
            return a(((nj) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!a.equals(((ix) (obj)).a))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final int hashCode()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return ((i + 527) * 31 + nn.a(b)) * 31 + c();
    }
}
