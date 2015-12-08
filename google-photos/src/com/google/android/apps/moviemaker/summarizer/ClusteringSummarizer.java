// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.summarizer;

import android.util.Log;
import android.util.Pair;
import b;
import cnq;
import cnt;
import cod;
import cwm;
import cxd;
import cxj;
import cxk;
import cxm;
import cxn;
import cxp;
import cxq;
import cxy;
import cyb;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ClusteringSummarizer
    implements cxp
{

    private static final String a = com/google/android/apps/moviemaker/summarizer/ClusteringSummarizer.getSimpleName();
    private final cwm b;
    private final cxd c;
    private final Set d;
    private final float e;
    private cxm f;

    public ClusteringSummarizer(cwm cwm1, cxd cxd1, float f1, Set set)
    {
        b = (cwm)b.a(cwm1, "qualityModel", null);
        c = (cxd)b.a(cxd1, "similarityMetric", null);
        boolean flag;
        if (cxy.a(set) == cnt.c || f1 == 1.401298E-45F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "the minQuality should only be used for photos");
        d = set;
        e = f1;
    }

    private static List a(List list, float af[], float af1[][], cxk cxk1, long l)
    {
        List list1 = cxk1.a();
        list = cxy.a(cxy.c(list), list1);
        b.a(list1.size(), "owners.size()", list.size(), "ownerClips.size()");
        int j2 = list1.size();
        float af2[] = new float[j2];
        float af3[][] = (float[][])Array.newInstance(Float.TYPE, new int[] {
            j2, j2
        });
        for (int i = 0; i < af2.length; i++)
        {
            af2[i] = af[((Integer)list1.get(i)).intValue()];
        }

        for (int j = 0; j < af2.length; j++)
        {
            for (int i2 = 0; i2 < j; i2++)
            {
                af3[j][i2] = af1[((Integer)list1.get(j)).intValue()][((Integer)list1.get(i2)).intValue()];
                af3[i2][j] = af3[j][i2];
            }

        }

        af = new int[j2];
        for (int k = 0; k < j2; k++)
        {
            af[k] = cxk1.a(((Integer)list1.get(k)).intValue()).size();
        }

        for (int i1 = 0; i1 < af2.length; i1++)
        {
            af2[i1] = (((float)(1.0D / (1.0D + Math.pow(2D, 1 - af[i1]))) + 2.0F) / 3F) * af2[i1];
        }

        af = new ArrayList();
        af1 = new boolean[list.size()];
        for (int j1 = 0; j1 < list.size(); j1++)
        {
            af1[j1] = 1;
        }

        long l2 = 0L;
        for (int k1 = 0; k1 < list.size(); k1++)
        {
            if ((float)l2 >= (float)l * 1.1F && af2[k1] < 0.1F)
            {
                af1[k1] = 0;
                af.add(Integer.valueOf(k1));
            }
            l2 += ((cnq)list.get(k1)).f.a();
        }

        af.addAll(a(af3, af2, 0.4F, cxn.a, ((boolean []) (af1))));
        af1 = new ArrayList(af.size());
        for (int l1 = af.size() - 1; l1 >= 0; l1--)
        {
            af1.add(list.get(((Integer)af.get(l1)).intValue()));
        }

        return af1;
    }

    private List a(float af[], cyb cyb1, long l)
    {
        Object obj = Collections.emptyList();
        int i = 0;
        float f1 = 0.6F;
        while (i < 25 && ((List) (obj)).size() < cyb1.a.size() && cxy.b(((List) (obj))) < l) 
        {
            List list1 = cyb1.a(4, 0);
            if (list1.size() == 1)
            {
                obj = cxy.c(list1);
            } else
            {
                Object obj1 = new cxk(getClusterMemberships(af, f.a, f1));
                List list = cyb1.a(6, 0);
                float af1[][] = f.a;
                obj = obj1;
                if (!list.isEmpty())
                {
                    obj = new ArrayList();
                    for (Iterator iterator = list.iterator(); iterator.hasNext(); ((List) (obj)).add(Integer.valueOf(list1.indexOf((cxj)iterator.next())))) { }
                    obj = ((cxk) (obj1)).a(((List) (obj)), af1);
                }
                obj = a(list1, af, f.a, ((cxk) (obj)), l);
                obj1 = cxy.c(list1);
                list = cxy.c(list);
                obj = a(af, ((List) (obj1)), ((List) (obj)));
                obj1 = new LinkedHashSet(list);
                ((Set) (obj1)).addAll(((java.util.Collection) (obj)));
                obj = new ArrayList(((java.util.Collection) (obj1)));
            }
            f1 /= 1.2F;
            i++;
        }
        if (i == 25)
        {
            Log.e(a, (new StringBuilder(82)).append("Clustering reached maximum ").append(i).append(" iterations without meeting target duration.").toString());
        }
        return ((List) (obj));
    }

    private List a(float af[], List list, List list1)
    {
        ArrayList arraylist = new ArrayList(list1.size());
        list1 = list1.iterator();
        do
        {
            if (!list1.hasNext())
            {
                break;
            }
            cnq cnq1 = (cnq)list1.next();
            if (af[list.indexOf(cnq1)] >= e)
            {
                arraylist.add(cnq1);
            }
        } while (true);
        return arraylist;
    }

    private static List a(float af[][], float af1[], float f1, cxn cxn1, boolean aflag[])
    {
        b.a(af, "distMatrix", null);
        b.a(af1, "qualityVec", null);
        b.a(aflag, "selected", null);
        ArrayList arraylist = new ArrayList();
        do
        {
            int j = -1;
            f1 = 3.402823E+38F;
            for (int i = 0; i < aflag.length;)
            {
                int k = j;
                float f2 = f1;
                if (aflag[i])
                {
                    float f3 = cxn1.a(i, af[i], aflag) + 0.4F * af1[i];
                    k = j;
                    f2 = f1;
                    if (f3 < f1)
                    {
                        k = i;
                        f2 = f3;
                    }
                }
                i++;
                j = k;
                f1 = f2;
            }

            if (j != -1)
            {
                aflag[j] = false;
                arraylist.add(Integer.valueOf(j));
            } else
            {
                return arraylist;
            }
        } while (true);
    }

    private static native int[] getClusterMemberships(float af[], float af1[][], float f1);

    public final List a(cxq cxq1)
    {
        Object obj1 = cxy.a(cxy.a(cxq1, d), b, cxq1, d);
        List list = cxy.c(((cyb) (obj1)).a(10, 0));
        long l = cxq1.c - cxy.b(list);
        if (l <= 0L)
        {
            return list;
        }
        Object obj = ((cyb) (obj1)).a(4, 0);
        if (cxy.a(((List) (obj))) <= l)
        {
            if (cxy.a(d) == cnt.c)
            {
                cwm cwm1 = b;
                float f1 = e;
                b.a(obj1, "clipMetrics", null);
                obj = new ArrayList();
                ((cyb) (obj1)).a(6, ((List) (obj)));
                obj1 = ((cyb) (obj1)).a(4, 2).iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    cxj cxj1 = (cxj)((Iterator) (obj1)).next();
                    if (cwm1.a(cxj1.b) >= f1)
                    {
                        ((List) (obj)).add(cxj1.a);
                    }
                } while (true);
            } else
            {
                b.a(obj1, "summarizerClipMetrics", null);
                obj = new ArrayList();
                ((cyb) (obj1)).a(4, ((List) (obj)));
                cxy.a(((cyb) (obj1)).a(8, 2), ((List) (obj)));
            }
        } else
        {
            obj = cxy.a(((List) (obj)), f, b, c);
            f = (cxm)((Pair) (obj)).second;
            obj = a((float[])((Pair) (obj)).first, ((cyb) (obj1)), l);
        }
        list.addAll(((java.util.Collection) (obj)));
        return cxy.a(list, cxq1.c);
    }

    public final long b(cxq cxq1)
    {
        Object obj = cxy.a(cxy.a(cxq1, d), b, cxq1, d);
        if (d.contains(Integer.valueOf(5)))
        {
            cxq1 = ((cyb) (obj)).a(10, 0);
            cwm cwm1 = b;
            float f1 = e;
            ArrayList arraylist = new ArrayList();
            obj = ((cyb) (obj)).a(4, 0).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                cxj cxj1 = (cxj)((Iterator) (obj)).next();
                if (cwm1.a(cxj1.b) >= f1)
                {
                    arraylist.add(cxj1);
                }
            } while (true);
            return cxy.a(cxq1) + cxy.a(arraylist);
        } else
        {
            return cxy.a(((cyb) (obj)).a(12));
        }
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}
