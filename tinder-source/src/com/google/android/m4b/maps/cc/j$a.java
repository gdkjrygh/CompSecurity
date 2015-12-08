// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.bm;
import com.google.android.m4b.maps.bo.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            j

public static final class b
{

    ArrayList a;
    final String b[];
    private final ac c;

    public final void a(com.google.android.m4b.maps.bo. )
    {
         1 = null;
        do
        {
            if (!.hasNext())
            {
                break;
            }
            Object obj = .a();
            if (!(obj instanceof bm))
            {
                break;
            }
            obj = (bm)obj;
            if (1 != null && 1.a.equals(((bm) (obj)).b))
            {
                1.a(((bm) (obj)));
            } else
            {
                1 = new <init>(((bm) (obj)), b);
                a.add(1);
            }
            .next();
        } while (true);
    }

    public final j[] a()
    {
        ArrayList arraylist3 = new ArrayList();
        Iterator iterator = a.iterator();
        ArrayList arraylist = new ArrayList();
        t t3 = new <init>();
        HashSet hashset = new HashSet();
        ArrayList arraylist1 = new ArrayList();
        t t4 = new <init>();
        HashSet hashset1 = new HashSet();
        t t = null;
label0:
        do
        {
            t t5;
label1:
            {
label2:
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    t5 = (<init>)iterator.next();
                    if (t5.e != null)
                    {
                        t t1 = new <init>();
                        j.a(t5.a, t1);
                        arraylist3.add(new j(c, t1, ae.a(t5), t5.d, (byte)0));
                        continue;
                    }
                    if (t5.b() <= 1)
                    {
                        break label1;
                    }
                    t t2 = new <init>(t5);
                    HashSet hashset2;
                    ArrayList arraylist2;
                    boolean flag;
                    if (t != null && !t2.equals(t))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (j.a(t5.a, t4))
                    {
                        arraylist2 = arraylist1;
                        hashset2 = hashset1;
                        if (!flag)
                        {
                            break label2;
                        }
                    }
                    arraylist3.add(new j(c, t4, arraylist1, hashset1, (byte)0));
                    arraylist2 = new ArrayList();
                    t4.a();
                    j.a(t5.a, t4);
                    hashset2 = new HashSet();
                }
                arraylist2.add(t5);
                hashset2.addAll(t5.d);
                t = t2;
                arraylist1 = arraylist2;
                hashset1 = hashset2;
                continue;
            }
            if (!j.a(t5.a, t3))
            {
                arraylist3.add(new j(c, t3, arraylist, hashset, (byte)0));
                arraylist = new ArrayList();
                t3.a();
                j.a(t5.a, t3);
                hashset = new HashSet();
            }
            arraylist.add(t5);
            hashset.addAll(t5.d);
        } while (true);
        if (!arraylist.isEmpty())
        {
            arraylist3.add(new j(c, t3, arraylist, hashset, (byte)0));
        }
        if (!arraylist1.isEmpty())
        {
            arraylist3.add(new j(c, t4, arraylist1, hashset1, (byte)0));
        }
        if (arraylist3.isEmpty())
        {
            return null;
        } else
        {
            return (j[])arraylist3.toArray(new j[arraylist3.size()]);
        }
    }

    public (ac ac, String as[])
    {
        a = new ArrayList();
        c = ac;
        b = as;
    }
}
