// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;


// Referenced classes of package com.google.a.a:
//            au, ap, ao

final class aq extends au
{

    final ap a;

    aq(ap ap1, ao ao, CharSequence charsequence)
    {
        a = ap1;
        super(ao, charsequence);
    }

    public final int a(int i)
    {
        int k;
label0:
        {
            int l = a.a.length();
label1:
            for (int i1 = b.length(); i <= i1 - l; i++)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= l)
                    {
                        break label0;
                    }
                    if (b.charAt(j + i) != a.a.charAt(j))
                    {
                        continue label1;
                    }
                    j++;
                } while (true);
            }

            k = -1;
        }
        return k;
    }

    public final int b(int i)
    {
        return a.a.length() + i;
    }
}
