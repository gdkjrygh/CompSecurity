// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import java.util.Locale;

public final class UrlTemplate
{

    private final String a[];
    private final int b[];
    private final String c[];
    private final int d;

    private UrlTemplate(String as[], int ai[], String as1[], int i)
    {
        a = as;
        b = ai;
        c = as1;
        d = i;
    }

    private static int a(String s, String as[], int ai[], String as1[])
    {
        as[0] = "";
        int k = 0;
        do
        {
            for (int i = 0; i < s.length();)
            {
                int l = s.indexOf("$", i);
                if (l == -1)
                {
                    as[k] = (new StringBuilder()).append(as[k]).append(s.substring(i)).toString();
                    i = s.length();
                } else
                if (l != i)
                {
                    as[k] = (new StringBuilder()).append(as[k]).append(s.substring(i, l)).toString();
                    i = l;
                } else
                if (s.startsWith("$$", i))
                {
                    as[k] = (new StringBuilder()).append(as[k]).append("$").toString();
                    i += 2;
                } else
                {
                    int i1 = s.indexOf("$", i + 1);
                    String s3 = s.substring(i + 1, i1);
                    if (s3.equals("RepresentationID"))
                    {
                        ai[k] = 1;
                    } else
                    {
                        int j = s3.indexOf("%0");
                        String s1 = "%01d";
                        String s2 = s3;
                        if (j != -1)
                        {
                            s2 = s3.substring(j);
                            s1 = s2;
                            if (!s2.endsWith("d"))
                            {
                                s1 = (new StringBuilder()).append(s2).append("d").toString();
                            }
                            s2 = s3.substring(0, j);
                        }
                        if (s2.equals("Number"))
                        {
                            ai[k] = 2;
                        } else
                        if (s2.equals("Bandwidth"))
                        {
                            ai[k] = 3;
                        } else
                        if (s2.equals("Time"))
                        {
                            ai[k] = 4;
                        } else
                        {
                            throw new IllegalArgumentException((new StringBuilder("Invalid template: ")).append(s).toString());
                        }
                        as1[k] = s1;
                    }
                    k++;
                    as[k] = "";
                    i = i1 + 1;
                }
            }

            return k;
        } while (true);
    }

    public static UrlTemplate a(String s)
    {
        String as[] = new String[5];
        int ai[] = new int[4];
        String as1[] = new String[4];
        return new UrlTemplate(as, ai, as1, a(s, as, ai, as1));
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
