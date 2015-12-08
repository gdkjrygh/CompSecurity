// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import android.util.Log;
import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.am;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ba.a;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.y.j;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.az:
//            c, a

public final class e
    implements c
{

    private final com.google.android.m4b.maps.aa.g b;
    private final Set c;

    public e()
    {
        b = am.f();
        c = al.f();
    }

    private e(Collection collection, ar ar1)
    {
        com.google.android.m4b.maps.aa.am.a a1 = am.g();
        HashSet hashset = new HashSet();
        Iterator iterator = collection.iterator();
        int i = 0;
        int k = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (com.google.android.m4b.maps.az.a)iterator.next();
            Object obj1 = ar.a(((com.google.android.m4b.maps.az.a) (obj)).a());
            double d = (double)((ar) (obj1)).a.f() / g.a(((ar) (obj1)).b.b());
            double d1 = (double)((ar) (obj1)).d() / g.a(((ar) (obj1)).b.b());
            if (d >= 7000D || d1 >= 7000D)
            {
                if (ab.a("BuildingBounds", 4))
                {
                    obj = String.valueOf(((com.google.android.m4b.maps.az.a) (obj)).a);
                    Log.i("BuildingBounds", (new StringBuilder(String.valueOf(obj).length() + 120)).append("Ignoring building with overly large width/height (").append(d).append("m width, ").append(d1).append("m height, id=").append(((String) (obj))).toString());
                }
                i++;
            } else
            {
                hashset.addAll(((com.google.android.m4b.maps.az.a) (obj)).c);
                ((com.google.android.m4b.maps.az.a) (obj)).c.clear();
                if (ar1 == null || ar1.b(((com.google.android.m4b.maps.az.a) (obj)).a()))
                {
                    ac ac1;
                    for (obj1 = ac.a(((ar) (obj1))).iterator(); ((Iterator) (obj1)).hasNext(); a1.a.a(j.a(ac1), j.a(obj)))
                    {
                        ac1 = (ac)((Iterator) (obj1)).next();
                    }

                    k++;
                }
            }
        } while (true);
        c = al.a(hashset);
        b = am.a(a1.a);
        if (ab.a("BuildingBounds", 3))
        {
            int l = collection.size();
            int i1 = b.a();
            Log.d("BuildingBounds", (new StringBuilder(82)).append(l).append(" buildings, ").append(k).append(" loaded, ").append(i).append(" skipped, ").append(i1).append(" tiles.").toString());
        }
    }

    public static e a(Reader reader, ar ar1)
    {
        BufferedReader bufferedreader = new BufferedReader(reader);
        LinkedList linkedlist = new LinkedList();
        reader = bufferedreader.readLine();
        while (reader != null) 
        {
            reader = reader.trim();
            if (reader.length() == 0)
            {
                reader = null;
            } else
            {
                String as[] = reader.split("\\s+");
                if (as.length < 3)
                {
                    if (ab.a("INDOOR", 3))
                    {
                        reader = String.valueOf(reader);
                        if (reader.length() != 0)
                        {
                            reader = "Failed to parse line: ".concat(reader);
                        } else
                        {
                            reader = new String("Failed to parse line: ");
                        }
                        Log.d("INDOOR", reader);
                    }
                    reader = null;
                } else
                {
                    com.google.android.m4b.maps.ak.a.c c1 = com.google.android.m4b.maps.ak.a.c.b(as[0]);
                    Object obj1 = com.google.android.m4b.maps.ba.a.a(as[1]);
                    Object obj = com.google.android.m4b.maps.ba.a.a(as[2]);
                    if (c1 == null || obj1 == null || obj == null)
                    {
                        if (ab.a("INDOOR", 3))
                        {
                            reader = String.valueOf(reader);
                            if (reader.length() != 0)
                            {
                                reader = "Failed to parse line: ".concat(reader);
                            } else
                            {
                                reader = new String("Failed to parse line: ");
                            }
                            Log.d("INDOOR", reader);
                        }
                        reader = null;
                    } else
                    {
                        byte byte0;
                        if (as.length > 3)
                        {
                            reader = com.google.android.m4b.maps.az.a.a(as[3]);
                            String as1[];
                            if (reader != null)
                            {
                                byte0 = 4;
                            } else
                            {
                                byte0 = 3;
                            }
                        } else
                        {
                            byte0 = 3;
                            reader = null;
                        }
                        obj1 = g.b(((a) (obj1)).a, ((a) (obj1)).b);
                        obj = g.b(((a) (obj)).a, ((a) (obj)).b);
                        as1 = new String[as.length - byte0];
                        System.arraycopy(as, byte0, as1, 0, as1.length);
                        reader = new com.google.android.m4b.maps.az.a(c1, m.a(((g) (obj1)), ((g) (obj))), reader, as1);
                    }
                }
            }
            if (reader != null)
            {
                linkedlist.add(reader);
            }
            reader = bufferedreader.readLine();
        }
        return new e(linkedlist, ar1);
    }

    public final Collection a(ac ac1)
    {
        ac1 = ac1.a();
        int i = ac1.a;
        if (i < 15)
        {
            return al.f();
        }
        if (i == 15)
        {
            return b.b(ac1);
        } else
        {
            ac ac2 = ac1.a(15);
            return com.google.android.m4b.maps.az.a.a(b.b(ac2), ac1.d());
        }
    }

    public final void a(c.a a1)
    {
    }

    public final boolean a(com.google.android.m4b.maps.ak.a a1)
    {
        return c.contains(a1);
    }

    public final void b(c.a a1)
    {
    }
}
