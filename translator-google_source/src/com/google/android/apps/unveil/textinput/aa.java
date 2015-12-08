// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.j;
import com.google.android.apps.unveil.env.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            k, af, ag, ab

public final class aa
{

    Size a;
    final List b = new ArrayList();
    final List c = new ArrayList();
    boolean d;
    Set e;
    Set f;
    private k g;
    private boolean h;
    private List i;
    private final List j = new ArrayList();
    private final List k = new ArrayList();
    private final ag l = new af();
    private final int m;
    private final int n;

    public aa(Context context)
    {
        g = k.b;
        i = Collections.emptyList();
        e = new HashSet();
        f = new HashSet();
        m = p.a(40F, context);
        n = p.a(5F, context);
    }

    public final void a()
    {
        i = Collections.emptyList();
        b();
    }

    public final void a(k k1)
    {
        g = k1;
        boolean flag1 = d;
        boolean flag;
        if (!k1.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag | flag1;
        b();
    }

    public final void a(List list)
    {
        boolean flag = false;
        int i1;
        int j1;
        int k1;
        if (list == null)
        {
            i = Collections.emptyList();
        } else
        {
            i = list;
        }
        d = false;
        j1 = 0;
        k1 = 0;
        i1 = 0;
        while (j1 < i.size() - 1) 
        {
            list = ((com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word)i.get(j1)).box;
            com.google.bionics.goggles.api2.GogglesCommonProtos.BoundingBox boundingbox = ((com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word)i.get(j1 + 1)).box;
            int l1 = list.getX();
            int i2 = list.getWidth() / 2;
            int j2 = list.getY();
            int l2 = list.getHeight() / 2;
            if (l1 + i2 < boundingbox.getX() && boundingbox.getY() > list.getY() - list.getHeight() && boundingbox.getY() < list.getY() + list.getHeight())
            {
                l1 = k1 + 1;
                i2 = i1;
            } else
            {
                l1 = k1;
                i2 = i1;
                if (j2 + l2 < boundingbox.getY())
                {
                    l1 = k1;
                    i2 = i1;
                    if (boundingbox.getX() > list.getX() - list.getWidth())
                    {
                        int k2 = boundingbox.getX();
                        int i3 = list.getX();
                        l1 = k1;
                        i2 = i1;
                        if (k2 < list.getWidth() + i3)
                        {
                            i2 = i1 + 1;
                            l1 = k1;
                        }
                    }
                }
            }
            j1++;
            k1 = l1;
            i1 = i2;
        }
        if (i1 > k1)
        {
            flag = true;
        }
        h = flag;
        b();
    }

    final void b()
    {
        if (!g.e)
        {
            e.clear();
            f.clear();
        }
        j.clear();
        k.clear();
        b.clear();
        c.clear();
        l.a(i);
        if (g != k.a) goto _L2; else goto _L1
_L1:
        if (i != null)
        {
            j.addAll(i);
            com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word;
            for (Iterator iterator = i.iterator(); iterator.hasNext(); b.add(l.a(word)))
            {
                word = (com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word)iterator.next();
            }

        }
          goto _L3
_L2:
        if (g != k.b) goto _L5; else goto _L4
_L4:
        if (i != null)
        {
            k.addAll(i);
            com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word1;
            for (Iterator iterator1 = i.iterator(); iterator1.hasNext(); c.add(l.a(word1)))
            {
                word1 = (com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word)iterator1.next();
            }

        }
          goto _L3
_L5:
        if (g != null && i != null && a != null && g.f.size() != 0) goto _L6; else goto _L3
_L3:
        return;
_L6:
        float f3;
        float f5;
        Object obj = g.c.b();
        f3 = (float)((Size) (obj)).width / (float)a.width;
        f5 = (float)((Size) (obj)).height / (float)a.height;
        obj = (Point)g.f.get(0);
        Object obj1 = g.f.iterator();
        float f1;
        Point point;
        int i1;
        int i2;
        int l2;
        int j3;
        int i4;
        int l4;
        for (f1 = 0.0F; ((Iterator) (obj1)).hasNext(); f1 = (float)((((Point) (obj)).y - point.y) * (i4 - l4) + (i1 - i2) * (l2 - j3)) + f1)
        {
            point = (Point)((Iterator) (obj1)).next();
            i1 = ((Point) (obj)).x;
            i2 = point.x;
            l2 = ((Point) (obj)).x;
            j3 = point.x;
            i4 = ((Point) (obj)).y;
            l4 = point.y;
        }

        if (!d || f1 / (float)g.f.size() > (float)(n * n))
        {
            break; /* Loop/switch isn't completed */
        }
        int k3 = (int)((float)((Point)g.f.get(0)).x / f3);
        int j4 = (int)((float)((Point)g.f.get(0)).y / f5);
        obj = null;
        int j1 = 0x7fffffff;
        Iterator iterator4 = i.iterator();
        do
        {
            if (!iterator4.hasNext())
            {
                break;
            }
            obj1 = (com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word)iterator4.next();
            com.google.bionics.goggles.api2.GogglesCommonProtos.BoundingBox boundingbox = ((com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word) (obj1)).box;
            int j2;
            int i3;
            if (k3 <= boundingbox.getX())
            {
                j2 = boundingbox.getX();
            } else
            {
                j2 = Math.min(k3, boundingbox.getX() + boundingbox.getWidth());
            }
            if (j4 <= boundingbox.getY())
            {
                i3 = boundingbox.getY();
            } else
            {
                i3 = boundingbox.getY();
                i3 = Math.min(j4, boundingbox.getHeight() + i3);
            }
            j2 -= k3;
            i3 -= j4;
            j2 = j2 * j2 + i3 * i3;
            if (j2 < j1 && j2 < m * m)
            {
                obj = obj1;
                j1 = j2;
            }
        } while (true);
        obj1 = i.iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word3 = (com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word)((Iterator) (obj1)).next();
            Iterator iterator5;
            boolean flag;
            if (obj == word3 || e.contains(word3))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            iterator5 = f.iterator();
label0:
            do
            {
                if (!iterator5.hasNext())
                {
                    break;
                }
                Iterator iterator7 = ((ab)iterator5.next()).a.iterator();
                do
                {
                    if (!iterator7.hasNext())
                    {
                        continue label0;
                    }
                } while (word3 != (com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word)iterator7.next());
                flag = true;
            } while (true);
            if (flag)
            {
                j.add(word3);
                b.add(l.a(word3));
                e.add(word3);
            } else
            {
                k.add(word3);
                c.add(l.a(word3));
            }
        }
        if (true) goto _L3; else goto _L7
_L7:
        Iterator iterator2;
        ArrayList arraylist;
        int l1;
        int k2;
        arraylist = new ArrayList();
        iterator2 = i.iterator();
        k2 = 0x7fffffff;
        l1 = 0x7fffffff;
_L14:
        com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word2;
        int i5;
        if (!iterator2.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        word2 = (com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word)iterator2.next();
        i5 = (int)((float)(word2.box.getX() + word2.box.getWidth() / 2) * f3);
        int k4 = (int)((float)(word2.box.getX() + word2.box.getWidth()) * f3);
        int l3 = (int)((float)(word2.box.getY() + word2.box.getHeight()) * f5);
        int j5 = (int)((float)(word2.box.getY() + word2.box.getHeight() / 2) * f5);
        k k1 = g;
        Size size = k1.c.b();
        boolean flag1;
        if (i5 > 0 && i5 < size.width && j5 > 0 && j5 < size.height && Color.alpha(k1.c.c().getPixel(i5, j5)) > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1) goto _L9; else goto _L8
_L8:
        j.add(word2);
        b.add(l.a(word2));
        if (!h || j5 >= k2) goto _L11; else goto _L10
_L10:
        arraylist.add(new ab());
_L12:
        ((ab)arraylist.get(arraylist.size() - 1)).a(word2, i5, j5, g.f);
        l1 = k4;
        k2 = l3;
        continue; /* Loop/switch isn't completed */
_L11:
        if (!h && i5 < l1)
        {
            arraylist.add(new ab());
        }
        if (true) goto _L12; else goto _L9
_L9:
        k.add(word2);
        c.add(l.a(word2));
        if (true) goto _L14; else goto _L13
_L13:
        if (d && g.d)
        {
            float f2 = 3.402823E+38F;
            ab ab1 = null;
            Iterator iterator6 = arraylist.iterator();
            do
            {
                if (!iterator6.hasNext())
                {
                    break;
                }
                ab ab2 = (ab)iterator6.next();
                float f4 = ab2.b / (float)ab2.a.size();
                if (f4 < f2)
                {
                    f2 = f4;
                    ab1 = ab2;
                }
            } while (true);
            if (ab1 != null)
            {
                f.add(ab1);
            }
            Iterator iterator3 = arraylist.iterator();
            while (iterator3.hasNext()) 
            {
                Object obj2 = (ab)iterator3.next();
                if (ab1 != obj2 && !f.contains(obj2))
                {
                    f.remove(obj2);
                    obj2 = ((ab) (obj2)).a.iterator();
                    while (((Iterator) (obj2)).hasNext()) 
                    {
                        com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word4 = (com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word)((Iterator) (obj2)).next();
                        if (!g.e || !e.contains(word4))
                        {
                            j.remove(word4);
                            b.remove(l.a(word4));
                            k.add(word4);
                            c.add(l.a(word4));
                        }
                    }
                }
            }
        }
        if (true) goto _L3; else goto _L15
_L15:
    }

    public final String c()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = j.iterator(); iterator.hasNext(); stringbuilder.append(String.valueOf(((com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word)iterator.next()).getText()).concat(" "))) { }
        if (stringbuilder.length() > 0)
        {
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        }
        return stringbuilder.toString();
    }
}
