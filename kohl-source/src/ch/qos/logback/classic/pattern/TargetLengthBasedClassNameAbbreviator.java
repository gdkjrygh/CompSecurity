// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;


// Referenced classes of package ch.qos.logback.classic.pattern:
//            Abbreviator

public class TargetLengthBasedClassNameAbbreviator
    implements Abbreviator
{

    final int targetLength;

    public TargetLengthBasedClassNameAbbreviator(int i)
    {
        targetLength = i;
    }

    static int computeDotIndexes(String s, int ai[])
    {
        int j = 0;
        int i = 0;
        do
        {
            j = s.indexOf('.', j);
            if (j != -1 && i < 16)
            {
                ai[i] = j;
                i++;
                j++;
            } else
            {
                return i;
            }
        } while (true);
    }

    public String abbreviate(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(targetLength);
        if (s == null)
        {
            throw new IllegalArgumentException("Class name may not be null");
        }
        if (s.length() >= targetLength)
        {
            int ai[] = new int[16];
            int ai1[] = new int[17];
            int j = computeDotIndexes(s, ai);
            if (j != 0)
            {
                computeLengthArray(s, ai, ai1, j);
                int i = 0;
                while (i <= j) 
                {
                    if (i == 0)
                    {
                        stringbuilder.append(s.substring(0, ai1[i] - 1));
                    } else
                    {
                        stringbuilder.append(s.substring(ai[i - 1], ai[i - 1] + ai1[i]));
                    }
                    i++;
                }
                return stringbuilder.toString();
            }
        }
        return s;
    }

    void computeLengthArray(String s, int ai[], int ai1[], int i)
    {
        int j = s.length();
        int l = targetLength;
        int i1 = 0;
        l = j - l;
        while (i1 < i) 
        {
            int k = -1;
            if (i1 > 0)
            {
                k = ai[i1 - 1];
            }
            int j1 = ai[i1] - k - 1;
            if (j1 >= 1);
            if (l > 0)
            {
                if (j1 < 1)
                {
                    k = j1;
                } else
                {
                    k = 1;
                }
            } else
            {
                k = j1;
            }
            ai1[i1] = k + 1;
            i1++;
            l -= j1 - k;
        }
        ai1[i] = s.length() - ai[i - 1];
    }
}
