// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.roidapp.photogrid.release:
//            lc

public final class rh
{

    List a;
    List b;
    private Random c;
    private lc d;
    private int e;
    private List f;
    private float g;
    private int h;
    private int i;
    private int j;

    public rh(int k)
    {
        c = new Random();
        f = new ArrayList();
        g = 0.0F;
        j = 0;
        a = new ArrayList();
        b = new ArrayList();
        e = k;
        g = (float)(10000 / k) * 2.7F;
        i = Math.round(290F / (float)k);
    }

    private List a(int k, int l, lc lc1)
    {
        d = lc1;
        float f1;
        float f2;
        if (e <= 4)
        {
            k = c.nextInt(2);
        } else
        if (k <= 2)
        {
            if (l != 0)
            {
                if (lc1.l > lc1.m)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
            } else
            {
                c.nextInt(2);
                if (lc1.l > lc1.m)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
            }
        } else
        if (k <= 3)
        {
            c.nextInt(2);
            if (lc1.l > lc1.m)
            {
                k = 1;
            } else
            {
                k = 0;
            }
        } else
        {
            c.nextInt(2);
            if (lc1.l > lc1.m)
            {
                k = 1;
            } else
            {
                k = 0;
            }
        }
        f1 = b(l);
        f2 = b(l);
        lc1 = new ArrayList();
        switch (k)
        {
        default:
            return lc1;

        case 0: // '\0'
            lc1 = new ArrayList();
            lc lc2 = new lc();
            lc2.j = d.j;
            lc2.k = d.k;
            lc2.l = d.l;
            lc2.m = (f2 / 100F) * d.m;
            lc2.e = new PointF(0.5F * lc2.l, 0.5F * lc2.m);
            lc lc9 = new lc();
            lc9.j = d.j;
            lc9.k = d.k + lc2.m;
            lc9.l = d.l;
            lc9.m = d.m - lc2.m;
            lc9.e = new PointF(0.5F * lc9.l, 0.5F * lc9.m);
            ArrayList arraylist = new ArrayList();
            arraylist.add(new PointF(0.0F, 0.0F));
            arraylist.add(new PointF(lc2.l, 0.0F));
            arraylist.add(new PointF(lc2.l, lc2.m));
            arraylist.add(new PointF(0.0F, lc2.m));
            ArrayList arraylist2 = new ArrayList();
            arraylist2.add(new PointF(0.0F, 0.0F));
            arraylist2.add(new PointF(lc9.l, 0.0F));
            arraylist2.add(new PointF(lc9.l, lc9.m));
            arraylist2.add(new PointF(0.0F, lc9.m));
            lc2.b = arraylist;
            lc9.b = arraylist2;
            lc1.add(lc2);
            lc1.add(lc9);
            return lc1;

        case 1: // '\001'
            lc1 = new ArrayList();
            lc lc3 = new lc();
            lc3.j = d.j;
            lc3.k = d.k;
            lc3.l = (f1 / 100F) * d.l;
            lc3.m = d.m;
            lc3.e = new PointF(0.5F * lc3.l, 0.5F * lc3.m);
            lc lc10 = new lc();
            lc10.j = d.j + lc3.l;
            lc10.k = d.k;
            lc10.l = d.l - lc3.l;
            lc10.m = d.m;
            lc10.e = new PointF(0.5F * lc10.l, 0.5F * lc10.m);
            ArrayList arraylist1 = new ArrayList();
            arraylist1.add(new PointF(0.0F, 0.0F));
            arraylist1.add(new PointF(lc3.l, 0.0F));
            arraylist1.add(new PointF(lc3.l, lc3.m));
            arraylist1.add(new PointF(0.0F, lc3.m));
            ArrayList arraylist3 = new ArrayList();
            arraylist3.add(new PointF(0.0F, 0.0F));
            arraylist3.add(new PointF(lc10.l, 0.0F));
            arraylist3.add(new PointF(lc10.l, lc10.m));
            arraylist3.add(new PointF(0.0F, lc10.m));
            lc3.b = arraylist1;
            lc10.b = arraylist3;
            lc1.add(lc3);
            lc1.add(lc10);
            return lc1;

        case 2: // '\002'
            lc1 = new ArrayList();
            lc lc4 = new lc();
            lc4.j = d.j;
            lc4.k = d.k;
            lc4.l = (f1 / 100F) * d.l;
            lc4.m = d.m;
            lc4.e = new PointF(0.5F * lc4.l, 0.5F * lc4.m);
            lc lc11 = new lc();
            lc11.j = d.j + lc4.l;
            lc11.k = d.k;
            lc11.l = d.l - lc4.l;
            lc11.m = (f2 / 100F) * d.m;
            lc11.e = new PointF(0.5F * lc11.l, 0.5F * lc11.m);
            lc lc16 = new lc();
            lc16.j = lc11.j;
            lc16.k = d.k + lc11.m;
            lc16.l = lc11.l;
            lc16.m = d.m - lc11.m;
            lc16.e = new PointF(0.5F * lc16.l, 0.5F * lc16.m);
            ArrayList arraylist4 = new ArrayList();
            arraylist4.add(new PointF(0.0F, 0.0F));
            arraylist4.add(new PointF(lc4.l, 0.0F));
            arraylist4.add(new PointF(lc4.l, lc4.m));
            arraylist4.add(new PointF(0.0F, lc4.m));
            ArrayList arraylist8 = new ArrayList();
            arraylist8.add(new PointF(0.0F, 0.0F));
            arraylist8.add(new PointF(lc11.l, 0.0F));
            arraylist8.add(new PointF(lc11.l, lc11.m));
            arraylist8.add(new PointF(0.0F, lc11.m));
            ArrayList arraylist13 = new ArrayList();
            arraylist13.add(new PointF(0.0F, 0.0F));
            arraylist13.add(new PointF(lc16.l, 0.0F));
            arraylist13.add(new PointF(lc16.l, lc16.m));
            arraylist13.add(new PointF(0.0F, lc16.m));
            lc4.b = arraylist4;
            lc11.b = arraylist8;
            lc16.b = arraylist13;
            lc1.add(lc4);
            lc1.add(lc11);
            lc1.add(lc16);
            return lc1;

        case 3: // '\003'
            lc1 = new ArrayList();
            lc lc5 = new lc();
            lc5.j = d.j;
            lc5.k = d.k;
            lc5.l = (f1 / 100F) * d.l;
            lc5.m = (f2 / 100F) * d.m;
            lc5.e = new PointF(0.5F * lc5.l, 0.5F * lc5.m);
            lc lc12 = new lc();
            lc12.j = d.j + lc5.l;
            lc12.k = d.k;
            lc12.l = d.l - lc5.l;
            lc12.m = d.m;
            lc12.e = new PointF(0.5F * lc12.l, 0.5F * lc12.m);
            lc lc17 = new lc();
            lc17.j = d.j;
            lc17.k = d.k + lc5.m;
            lc17.l = lc5.l;
            lc17.m = d.m - lc5.m;
            lc17.e = new PointF(0.5F * lc17.l, 0.5F * lc17.m);
            ArrayList arraylist5 = new ArrayList();
            arraylist5.add(new PointF(0.0F, 0.0F));
            arraylist5.add(new PointF(lc5.l, 0.0F));
            arraylist5.add(new PointF(lc5.l, lc5.m));
            arraylist5.add(new PointF(0.0F, lc5.m));
            ArrayList arraylist9 = new ArrayList();
            arraylist9.add(new PointF(0.0F, 0.0F));
            arraylist9.add(new PointF(lc12.l, 0.0F));
            arraylist9.add(new PointF(lc12.l, lc12.m));
            arraylist9.add(new PointF(0.0F, lc12.m));
            ArrayList arraylist14 = new ArrayList();
            arraylist14.add(new PointF(0.0F, 0.0F));
            arraylist14.add(new PointF(lc17.l, 0.0F));
            arraylist14.add(new PointF(lc17.l, lc17.m));
            arraylist14.add(new PointF(0.0F, lc17.m));
            lc5.b = arraylist5;
            lc12.b = arraylist9;
            lc17.b = arraylist14;
            lc1.add(lc5);
            lc1.add(lc12);
            lc1.add(lc17);
            return lc1;

        case 4: // '\004'
            lc1 = new ArrayList();
            lc lc6 = new lc();
            lc6.j = d.j;
            lc6.k = d.k;
            lc6.l = (f1 / 100F) * d.l;
            lc6.m = (f2 / 100F) * d.m;
            lc6.e = new PointF(0.5F * lc6.l, 0.5F * lc6.m);
            lc lc13 = new lc();
            lc13.j = d.j + lc6.l;
            lc13.k = d.k;
            lc13.l = d.l - lc6.l;
            lc13.m = lc6.m;
            lc13.e = new PointF(0.5F * lc13.l, 0.5F * lc13.m);
            lc lc18 = new lc();
            lc18.j = d.j;
            lc18.k = d.k + lc6.m;
            lc18.l = d.l;
            lc18.m = d.m - lc13.m;
            lc18.e = new PointF(0.5F * lc18.l, 0.5F * lc18.m);
            ArrayList arraylist6 = new ArrayList();
            arraylist6.add(new PointF(0.0F, 0.0F));
            arraylist6.add(new PointF(lc6.l, 0.0F));
            arraylist6.add(new PointF(lc6.l, lc6.m));
            arraylist6.add(new PointF(0.0F, lc6.m));
            ArrayList arraylist10 = new ArrayList();
            arraylist10.add(new PointF(0.0F, 0.0F));
            arraylist10.add(new PointF(lc13.l, 0.0F));
            arraylist10.add(new PointF(lc13.l, lc13.m));
            arraylist10.add(new PointF(0.0F, lc13.m));
            ArrayList arraylist15 = new ArrayList();
            arraylist15.add(new PointF(0.0F, 0.0F));
            arraylist15.add(new PointF(lc18.l, 0.0F));
            arraylist15.add(new PointF(lc18.l, lc18.m));
            arraylist15.add(new PointF(0.0F, lc18.m));
            lc6.b = arraylist6;
            lc13.b = arraylist10;
            lc18.b = arraylist15;
            lc1.add(lc6);
            lc1.add(lc13);
            lc1.add(lc18);
            return lc1;

        case 5: // '\005'
            lc1 = new ArrayList();
            lc lc7 = new lc();
            lc7.j = d.j;
            lc7.k = d.k;
            lc7.l = d.l;
            lc7.m = (f2 / 100F) * d.m;
            lc7.e = new PointF(0.5F * lc7.l, 0.5F * lc7.m);
            lc lc14 = new lc();
            lc14.j = d.j;
            lc14.k = d.k + lc7.m;
            lc14.l = (f1 / 100F) * d.l;
            lc14.m = d.m - lc7.m;
            lc14.e = new PointF(0.5F * lc14.l, 0.5F * lc14.m);
            lc lc19 = new lc();
            lc19.j = d.j + lc14.l;
            lc19.k = lc14.k;
            lc19.l = d.l - lc14.l;
            lc19.m = lc14.m;
            lc19.e = new PointF(0.5F * lc19.l, 0.5F * lc19.m);
            ArrayList arraylist7 = new ArrayList();
            arraylist7.add(new PointF(0.0F, 0.0F));
            arraylist7.add(new PointF(lc7.l, 0.0F));
            arraylist7.add(new PointF(lc7.l, lc7.m));
            arraylist7.add(new PointF(0.0F, lc7.m));
            ArrayList arraylist11 = new ArrayList();
            arraylist11.add(new PointF(0.0F, 0.0F));
            arraylist11.add(new PointF(lc19.l, 0.0F));
            arraylist11.add(new PointF(lc19.l, lc19.m));
            arraylist11.add(new PointF(0.0F, lc19.m));
            ArrayList arraylist16 = new ArrayList();
            arraylist16.add(new PointF(0.0F, 0.0F));
            arraylist16.add(new PointF(lc14.l, 0.0F));
            arraylist16.add(new PointF(lc14.l, lc14.m));
            arraylist16.add(new PointF(0.0F, lc14.m));
            lc7.b = arraylist7;
            lc19.b = arraylist11;
            lc14.b = arraylist16;
            lc1.add(lc7);
            lc1.add(lc19);
            lc1.add(lc14);
            return lc1;

        case 6: // '\006'
            lc1 = new ArrayList();
            break;
        }
        lc lc8 = new lc();
        lc8.j = d.j;
        lc8.k = d.k;
        lc8.l = (f1 / 100F) * d.l;
        lc8.m = (f2 / 100F) * d.m;
        lc8.e = new PointF(0.5F * lc8.l, 0.5F * lc8.m);
        lc lc15 = new lc();
        lc15.j = lc8.j + lc8.l;
        lc15.k = lc8.k;
        lc15.l = d.l - lc8.l;
        lc15.m = lc8.m;
        lc15.e = new PointF(0.5F * lc15.l, 0.5F * lc15.m);
        lc lc20 = new lc();
        lc20.j = lc15.j;
        lc20.k = lc15.k + lc15.m;
        lc20.l = lc15.l;
        lc20.m = d.m - lc8.m;
        lc20.e = new PointF(0.5F * lc20.l, 0.5F * lc20.m);
        lc lc21 = new lc();
        lc21.j = lc8.j;
        lc21.k = lc20.k;
        lc21.l = lc8.l;
        lc21.m = lc20.m;
        lc21.e = new PointF(0.5F * lc21.l, 0.5F * lc21.m);
        ArrayList arraylist12 = new ArrayList();
        arraylist12.add(new PointF(0.0F, 0.0F));
        arraylist12.add(new PointF(lc8.l, 0.0F));
        arraylist12.add(new PointF(lc8.l, lc8.m));
        arraylist12.add(new PointF(0.0F, lc8.m));
        ArrayList arraylist17 = new ArrayList();
        arraylist17.add(new PointF(0.0F, 0.0F));
        arraylist17.add(new PointF(lc15.l, 0.0F));
        arraylist17.add(new PointF(lc15.l, lc15.m));
        arraylist17.add(new PointF(0.0F, lc15.m));
        ArrayList arraylist18 = new ArrayList();
        arraylist18.add(new PointF(0.0F, 0.0F));
        arraylist18.add(new PointF(lc20.l, 0.0F));
        arraylist18.add(new PointF(lc20.l, lc20.m));
        arraylist18.add(new PointF(0.0F, lc20.m));
        ArrayList arraylist19 = new ArrayList();
        arraylist19.add(new PointF(0.0F, 0.0F));
        arraylist19.add(new PointF(lc21.l, 0.0F));
        arraylist19.add(new PointF(lc21.l, lc21.m));
        arraylist19.add(new PointF(0.0F, lc21.m));
        lc8.b = arraylist12;
        lc15.b = arraylist17;
        lc20.b = arraylist18;
        lc21.b = arraylist19;
        lc1.add(lc8);
        lc1.add(lc15);
        lc1.add(lc20);
        lc1.add(lc21);
        return lc1;
    }

    private List a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        (new Random()).nextInt(7);
        JVM INSTR tableswitch 0 6: default 608
    //                   0 173
    //                   1 182
    //                   2 193
    //                   3 205
    //                   4 217
    //                   5 227
    //                   6 238;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        break MISSING_BLOCK_LABEL_608;
_L12:
        ArrayList arraylist;
        arraylist = new ArrayList();
        list = list.iterator();
_L16:
        if (!list.hasNext()) goto _L10; else goto _L9
_L9:
        lc lc1;
        List list1;
        lc1 = ((lc)list.next()).a();
        list1 = lc1.b;
        for (Iterator iterator = list1.iterator(); iterator.hasNext();)
        {
            PointF pointf = (PointF)iterator.next();
            pointf.x = pointf.x + lc1.j;
            pointf.y = pointf.y + lc1.k;
        }

          goto _L11
        list;
        throw list;
_L2:
        byte byte0;
        int k;
        byte0 = 0;
        k = 0;
          goto _L12
_L3:
        byte0 = -2;
        k = 90;
          goto _L12
_L4:
        byte0 = -4;
        k = 180;
          goto _L12
_L5:
        byte0 = -6;
        k = 270;
          goto _L12
_L6:
        byte0 = 2;
        k = -90;
          goto _L12
_L7:
        byte0 = 4;
        k = -180;
          goto _L12
_L8:
        byte0 = 6;
        k = -270;
          goto _L12
_L11:
        float af1[];
        int k1;
        k1 = list1.size();
        af1 = new float[k1 * 2];
        int l;
        int j1;
        l = 0;
        j1 = 0;
_L14:
        if (l >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        af1[j1] = ((PointF)list1.get(l)).x;
        j1++;
        af1[j1] = ((PointF)list1.get(l)).y;
        l++;
        j1++;
        if (true) goto _L14; else goto _L13
_L13:
        float af[];
        ArrayList arraylist1;
        af = (float[])af1.clone();
        Matrix matrix = new Matrix();
        matrix.postRotate(k, 50F, 50F);
        matrix.mapPoints(af, af1);
        k1 = af.length;
        arraylist1 = new ArrayList();
        float f1;
        float f2;
        PointF pointf1;
        int i1;
        if (k > 0)
        {
            i1 = k1 + byte0;
        } else
        {
            i1 = byte0 + 0;
        }
        break MISSING_BLOCK_LABEL_617;
        if (j1 >= k1)
        {
            break MISSING_BLOCK_LABEL_633;
        }
        f1 = af[j1];
        j1++;
        f2 = af[j1];
        pointf1 = new PointF(f1, f2);
        a.add(Float.valueOf(f1));
        b.add(Float.valueOf(f2));
        arraylist1.add(pointf1);
        j1++;
        break MISSING_BLOCK_LABEL_411;
_L15:
        j1++;
        for (; j1 >= i1; j1 = 0)
        {
            break MISSING_BLOCK_LABEL_577;
        }

        f1 = af[j1];
        j1++;
        f2 = af[j1];
        pointf1 = new PointF(f1, f2);
        a.add(Float.valueOf(f1));
        b.add(Float.valueOf(f2));
        arraylist1.add(pointf1);
          goto _L15
        lc1.b = arraylist1;
        a(lc1);
        arraylist.add(lc1);
          goto _L16
_L10:
        this;
        JVM INSTR monitorexit ;
        return arraylist;
        byte0 = 0;
        k = 0;
          goto _L12
        j1 = i1;
        break MISSING_BLOCK_LABEL_411;
    }

    private void a(lc lc1)
    {
        lc1.j = ((Float)Collections.min(a)).floatValue();
        lc1.k = ((Float)Collections.min(b)).floatValue();
        lc1.l = ((Float)Collections.max(a)).floatValue() - lc1.j;
        lc1.m = ((Float)Collections.max(b)).floatValue() - lc1.k;
        a.clear();
        b.clear();
        for (Iterator iterator = lc1.b.iterator(); iterator.hasNext();)
        {
            PointF pointf = (PointF)iterator.next();
            pointf.x = pointf.x - lc1.j;
            pointf.y = pointf.y - lc1.k;
        }

        lc1.e = new PointF(lc1.l * 0.5F, lc1.m * 0.5F);
    }

    private int b(int k)
    {
        if (k == 0)
        {
            if (e <= 4)
            {
                return c.nextInt(10) + 60;
            } else
            {
                return c.nextInt(30) + 37;
            }
        }
        if (k == 1)
        {
            if (e <= 4)
            {
                return c.nextInt(35) + 33;
            } else
            {
                return c.nextInt(25) + 39;
            }
        } else
        {
            return c.nextInt(25) + 37;
        }
    }

    private int c(int k)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = c.nextInt(k);
        int l = i1;
        if (i1 == h)
        {
            l = c(k);
        }
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    protected final List a(int k)
    {
_L3:
        if (k != 0) goto _L2; else goto _L1
_L1:
        f.clear();
        Object obj = new lc();
        obj.j = 0.0F;
        obj.k = 0.0F;
        obj.l = 100F;
        obj.m = 100F;
        obj = a(a(e, 0, ((lc) (obj))));
        f.addAll(((java.util.Collection) (obj)));
_L4:
        if (f.size() < e)
        {
            k++;
        } else
        {
            return f;
        }
        if (true) goto _L3; else goto _L2
_L2:
        j = 0;
        List list = f;
        lc lc1;
        do
        {
            int l = list.size();
            if (j >= l)
            {
                i = (int)((float)i * 0.7F);
                j = 0;
            }
            int i1 = c(l);
            h = i1;
            lc1 = (lc)list.get(i1);
            if (l <= 4 || lc1.l >= (float)i && lc1.m >= (float)i)
            {
                break;
            }
            j = j + 1;
        } while (true);
        f.remove(lc1);
        f.addAll(a(e - f.size(), k + 1, lc1));
          goto _L4
    }
}
