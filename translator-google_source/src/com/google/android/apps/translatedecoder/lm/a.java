// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.lm;

import com.google.android.apps.translatedecoder.util.DecoderRuntimeException;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import com.google.android.apps.translatedecoder.util.b;
import com.google.android.apps.translatedecoder.util.c;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.lm:
//            LanguageModel

public final class a
{

    private static final Logger g = Logger.getLogger("translate");
    public final LanguageModel a;
    public int b;
    public Set c;
    public SymbolTable d;
    public HashMap e;
    public b f;
    private final c h;
    private int i[];

    public a(int j, LanguageModel languagemodel, c c1, b b1)
    {
        e = new HashMap();
        i = new int[1];
        b = j;
        a = languagemodel;
        h = c1;
        f = b1;
        if (b > a.lmOrder())
        {
            throw new DecoderRuntimeException("LanguageModelFeature's lmOrder is greater than the underlying lmModel's lmOrder");
        } else
        {
            return;
        }
    }

    public final int[] a(int ai[])
    {
        if (h == null)
        {
            return ai;
        }
        c c1 = h;
        int ai1[] = new int[ai.length];
        int k = 0;
        while (k < ai1.length) 
        {
            int j = ai[k];
            if (!c1.c)
            {
                j = c1.b.addWord(c1.a.getWord(j));
            } else
            {
                String s = c1.a.getWord(j);
                if (c1.b.hasWord(s))
                {
                    j = c1.b.getId(s);
                } else
                {
                    j = c1.d;
                }
            }
            ai1[k] = j;
            k++;
        }
        return ai1;
    }

    public final int[] a(int ai[], int ai1[])
    {
        boolean flag = false;
        ai1 = a(ai1);
        if (ai == null)
        {
            return ai1;
        }
        if (ai.length > b - 1)
        {
            throw new DecoderRuntimeException("State has too many words!");
        }
        int ai2[];
        int j;
        int k;
        if (ai.length + ai1.length >= b - 1)
        {
            j = b - 1;
        } else
        {
            j = ai.length + ai1.length;
        }
        ai2 = new int[j];
        k = ai.length - (ai2.length - ai1.length);
        for (j = 0; k < ai.length; j++)
        {
            ai2[j] = ai[k];
            k++;
        }

        int l = j;
        k = ((flag) ? 1 : 0);
        if (ai1.length - ai2.length >= 0)
        {
            k = ai1.length - ai2.length;
            l = j;
        }
        while (k < ai1.length) 
        {
            ai2[l] = ai1[k];
            k++;
            l++;
        }
        return ai2;
    }

    public final int[] a(int ai[], int ai1[], double ad[])
    {
        int l = ai1.length;
        if (ai != null)
        {
            l += ai.length;
        }
        int ai2[] = new int[l];
        boolean flag = false;
        int k = 0;
        int j = 0;
        if (ai != null)
        {
            int i1 = 0;
            do
            {
                k = j;
                if (i1 >= ai.length)
                {
                    break;
                }
                ai2[j] = ai[i1];
                i1++;
                j++;
            } while (true);
        }
        ad[0] = 0.0D;
        j = 0;
        int j1 = k;
        k = j;
        j = ((flag) ? 1 : 0);
        while (k < ai1.length) 
        {
            Integer integer = (Integer)e.get(Integer.valueOf(ai1[k]));
            ai = integer;
            if (integer == null)
            {
                Integer integer1 = Integer.valueOf(ai1[k]);
                ai = d.getWord(integer1.intValue());
                int j2 = 0;
                for (int k1 = 0; k1 < ai.length();)
                {
                    int k2 = j2;
                    if (Character.isDigit(ai.charAt(k1)))
                    {
                        k2 = j2 + 1;
                    }
                    k1++;
                    j2 = k2;
                }

                int i2;
                if (j2 > 1)
                {
                    StringBuilder stringbuilder = new StringBuilder();
                    int l1 = 0;
                    while (l1 < ai.length()) 
                    {
                        if (Character.isDigit(ai.charAt(l1)))
                        {
                            stringbuilder.append("#");
                        } else
                        {
                            stringbuilder.append(ai.charAt(l1));
                        }
                        l1++;
                    }
                    ai = stringbuilder.toString();
                } else
                {
                    ai = null;
                }
                if (ai != null)
                {
                    ai = Integer.valueOf(d.addWord(ai));
                } else
                {
                    ai = integer1;
                }
                e.put(Integer.valueOf(ai1[k]), ai);
            }
            if (j1 - j == b)
            {
                j++;
            }
            i2 = j1 + 1;
            ai2[j1] = ai.intValue();
            ad[0] = ad[0] + a.ngramCost(ai2, j, i2 - 1, i);
            if (c != null)
            {
                c.add(d.getWords(ai2));
            }
            j = i2 - i[0];
            k++;
            j1 = i2;
        }
        if (i[0] == 0)
        {
            return null;
        }
        if (i[0] == l)
        {
            return ai2;
        }
        ai = new int[i[0]];
        for (k = 0; k < ai.length; k++)
        {
            ai[k] = ai2[k + j];
        }

        return ai;
    }

}
