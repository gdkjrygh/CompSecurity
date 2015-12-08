// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class bbh
{

    private final String a[];
    private final int b[];
    private final String c[];
    private final int d;

    bbh(String as[], int ai[], String as1[], int i)
    {
        a = as;
        b = ai;
        c = as1;
        d = i;
    }

    public final String a(String s, int i, int j, long l)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int k = 0;
        while (k < d) 
        {
            stringbuilder.append(a[k]);
            if (b[k] == 1)
            {
                stringbuilder.append(s);
            } else
            if (b[k] == 2)
            {
                stringbuilder.append(String.format(Locale.US, c[k], new Object[] {
                    Integer.valueOf(i)
                }));
            } else
            if (b[k] == 3)
            {
                stringbuilder.append(String.format(Locale.US, c[k], new Object[] {
                    Integer.valueOf(j)
                }));
            } else
            if (b[k] == 4)
            {
                stringbuilder.append(String.format(Locale.US, c[k], new Object[] {
                    Long.valueOf(l)
                }));
            }
            k++;
        }
        stringbuilder.append(a[d]);
        return stringbuilder.toString();
    }
}
