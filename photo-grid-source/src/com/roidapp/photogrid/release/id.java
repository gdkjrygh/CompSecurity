// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, mm, ic, lc, 
//            ih

public final class id
{

    private float A;
    private Matrix B;
    private boolean C;
    private boolean D;
    protected Bitmap a;
    protected RectF b;
    protected boolean c;
    protected float d;
    protected float e;
    protected HashSet f;
    protected int g;
    protected PointF h;
    protected PointF i;
    protected boolean j;
    private int k;
    private int l;
    private float m;
    private float n;
    private int o;
    private int p;
    private PhotoGridActivity q;
    private boolean r;
    private mm s;
    private int t;
    private int u;
    private int v;
    private int w;
    private float x;
    private float y;
    private float z;

    protected id(Activity activity, int i1)
    {
        int j1;
        int k1;
        b = new RectF();
        f = new HashSet();
        j = false;
        o = -1;
        p = -2;
        A = 12F;
        B = new Matrix();
        D = false;
        k1 = 0x7f0203a4;
        j1 = k1;
        i1;
        JVM INSTR tableswitch 0 3: default 104
    //                   0 108
    //                   1 197
    //                   2 108
    //                   3 197;
           goto _L1 _L2 _L3 _L2 _L3
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        j1 = k1;
_L5:
        BitmapDrawable bitmapdrawable = (BitmapDrawable)activity.getResources().getDrawable(j1);
        if (bitmapdrawable != null)
        {
            try
            {
                a = bitmapdrawable.getBitmap();
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if (a != null && !a.isRecycled())
        {
            k = a.getWidth();
            l = a.getHeight();
        }
        g = i1;
        q = (PhotoGridActivity)activity;
        s = q.b;
        return;
_L3:
        j1 = 0x7f0203a3;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean a(float f1, float f2, float f3)
    {
        if (f.size() == 0)
        {
            HashMap hashmap = new HashMap();
            for (Iterator iterator = s.y.iterator(); iterator.hasNext();)
            {
                lc lc1 = ((ic)iterator.next()).b;
                Iterator iterator2 = lc1.c.iterator();
                int i1 = 0;
                while (iterator2.hasNext()) 
                {
                    PointF pointf1 = (PointF)iterator2.next();
                    if (Math.abs(pointf1.y - (pointf1.x * f1 + f2)) < 0.5F)
                    {
                        i1++;
                        if (i1 == 2)
                        {
                            f.add(lc1);
                        }
                        if (hashmap.containsKey(Float.valueOf(pointf1.y)))
                        {
                            int k1 = ((Integer)hashmap.get(Float.valueOf(pointf1.y))).intValue();
                            hashmap.put(Float.valueOf(pointf1.y), Integer.valueOf(k1 + 1));
                        } else
                        {
                            hashmap.put(Float.valueOf(pointf1.y), Integer.valueOf(1));
                        }
                    }
                }
            }

            Object obj = new HashSet();
            Object obj1 = new HashSet();
            ((HashSet) (obj1)).add(h);
            ((HashSet) (obj1)).add(i);
            int l1 = f.size();
            int j1;
            int i2;
            do
            {
                i2 = ((HashSet) (obj)).size();
                Iterator iterator3 = f.iterator();
                do
                {
                    if (!iterator3.hasNext())
                    {
                        break;
                    }
                    Object obj2 = (lc)iterator3.next();
                    Iterator iterator6 = ((lc) (obj2)).c.iterator();
                    boolean flag = false;
label0:
                    do
                    {
                        if (!iterator6.hasNext())
                        {
                            break;
                        }
                        PointF pointf4 = (PointF)iterator6.next();
                        if (flag)
                        {
                            continue;
                        }
                        Iterator iterator9 = ((HashSet) (obj1)).iterator();
                        PointF pointf6;
                        do
                        {
                            if (!iterator9.hasNext())
                            {
                                continue label0;
                            }
                            pointf6 = (PointF)iterator9.next();
                        } while (Math.abs(pointf4.x - pointf6.x) >= 0.5F || Math.abs(pointf4.y - pointf6.y) >= 0.5F);
                        ((HashSet) (obj)).add(obj2);
                        flag = true;
                    } while (true);
                    if (flag)
                    {
                        obj2 = ((lc) (obj2)).c.iterator();
                        while (((Iterator) (obj2)).hasNext()) 
                        {
                            ((HashSet) (obj1)).add((PointF)((Iterator) (obj2)).next());
                        }
                    }
                } while (true);
                j1 = ((HashSet) (obj)).size();
                f.removeAll(((java.util.Collection) (obj)));
            } while (j1 != l1 && i2 != j1);
            f = ((HashSet) (obj));
            Iterator iterator4 = hashmap.keySet().iterator();
            if (h.y > i.y)
            {
                obj = i;
                obj1 = h;
            } else
            {
                obj1 = i;
                obj = h;
            }
            while (iterator4.hasNext()) 
            {
                float f4 = ((Float)iterator4.next()).floatValue();
                if (((Integer)hashmap.get(Float.valueOf(f4))).intValue() == 4)
                {
                    Iterator iterator5 = hashmap.keySet().iterator();
                    while (iterator5.hasNext()) 
                    {
                        float f5 = ((Float)iterator5.next()).floatValue();
                        if (f4 <= ((PointF) (obj)).y && f5 < f4)
                        {
                            Iterator iterator7 = f.iterator();
                            HashSet hashset = new HashSet();
label1:
                            do
                            {
                                if (!iterator7.hasNext())
                                {
                                    break;
                                }
                                lc lc3 = (lc)iterator7.next();
                                Iterator iterator10 = lc3.c.iterator();
                                do
                                {
                                    if (!iterator10.hasNext())
                                    {
                                        continue label1;
                                    }
                                } while (((PointF)iterator10.next()).y != f5);
                                hashset.add(lc3);
                            } while (true);
                            f.removeAll(hashset);
                        }
                        if (f4 >= ((PointF) (obj1)).y && f5 > f4)
                        {
                            Iterator iterator8 = f.iterator();
                            HashSet hashset1 = new HashSet();
label2:
                            do
                            {
                                if (!iterator8.hasNext())
                                {
                                    break;
                                }
                                lc lc4 = (lc)iterator8.next();
                                Iterator iterator11 = lc4.c.iterator();
                                do
                                {
                                    if (!iterator11.hasNext())
                                    {
                                        continue label2;
                                    }
                                } while (((PointF)iterator11.next()).y != f5);
                                hashset1.add(lc4);
                            } while (true);
                            f.removeAll(hashset1);
                        }
                    }
                }
            }
        }
        for (Iterator iterator1 = f.iterator(); iterator1.hasNext();)
        {
            lc lc2 = (lc)iterator1.next();
            ArrayList arraylist = lc2.b();
            PointF pointf = (PointF)arraylist.get(0);
            PointF pointf2 = (PointF)arraylist.get(1);
            PointF pointf3 = (PointF)arraylist.get(2);
            PointF pointf5 = (PointF)arraylist.get(3);
            if (Math.abs(pointf.y - (pointf.x * f1 + f2)) < 0.5F && a(pointf, pointf2, f1, f3))
            {
                return true;
            }
            if (Math.abs(pointf2.y - (pointf2.x * f1 + f2)) < 0.5F && a(pointf2, pointf, f1, f3))
            {
                return true;
            }
            if (Math.abs(pointf3.y - (pointf3.x * f1 + f2)) < 0.5F && a(pointf3, pointf5, f1, f3))
            {
                return true;
            }
            if (Math.abs(pointf5.y - (pointf5.x * f1 + f2)) < 0.5F && a(pointf5, pointf3, f1, f3))
            {
                return true;
            }
            lc2.d = arraylist;
        }

        c();
        return false;
    }

    private boolean a(PointF pointf, PointF pointf1, float f1)
    {
        float f2 = pointf1.x - pointf.x;
        float f3 = pointf1.y - pointf.y;
        float f4 = f3 / f2;
        float f5 = pointf.y;
        float f6 = pointf.x;
        pointf.x = f1;
        if (f2 != 0.0F && f3 != 0.0F)
        {
            pointf.y = pointf.x * f4 + (f5 - f6 * f4);
        }
        if (f2 > 0.0F)
        {
            f1 = pointf1.x - pointf.x;
        } else
        {
            f1 = pointf.x - pointf1.x;
        }
        return f1 < A;
    }

    private boolean a(PointF pointf, PointF pointf1, float f1, float f2)
    {
        float f3 = pointf1.x - pointf.x;
        float f4 = pointf1.y - pointf.y;
        if (f3 == 0.0F)
        {
            pointf.y = pointf.x * f1 + f2;
        } else
        if (f4 == 0.0F)
        {
            pointf.x = (pointf.y - f2) / f1;
        } else
        {
            f4 /= f3;
            f4 = (pointf.y - pointf.x * f4 - f2) / (f1 - f4);
            pointf.x = f4;
            pointf.y = f1 * f4 + f2;
        }
        if (f3 > 0.0F)
        {
            f1 = pointf1.x - pointf.x;
        } else
        {
            f1 = pointf.x - pointf1.x;
        }
        return f1 < A;
    }

    private boolean b(float f1, float f2, float f3)
    {
        if (f.size() == 0)
        {
            HashMap hashmap = new HashMap();
            for (Iterator iterator = s.y.iterator(); iterator.hasNext();)
            {
                lc lc1 = ((ic)iterator.next()).b;
                Iterator iterator2 = lc1.c.iterator();
                int i1 = 0;
                while (iterator2.hasNext()) 
                {
                    PointF pointf1 = (PointF)iterator2.next();
                    if (Math.abs(pointf1.y - (pointf1.x * f1 + f2)) < 0.5F)
                    {
                        i1++;
                        if (i1 == 2)
                        {
                            f.add(lc1);
                        }
                        if (hashmap.containsKey(Float.valueOf(pointf1.y)))
                        {
                            int k1 = ((Integer)hashmap.get(Float.valueOf(pointf1.y))).intValue();
                            hashmap.put(Float.valueOf(pointf1.y), Integer.valueOf(k1 + 1));
                        } else
                        {
                            hashmap.put(Float.valueOf(pointf1.y), Integer.valueOf(1));
                        }
                    }
                }
            }

            Object obj = new HashSet();
            Object obj1 = new HashSet();
            ((HashSet) (obj1)).add(h);
            ((HashSet) (obj1)).add(i);
            int l1 = f.size();
            int j1;
            int i2;
            do
            {
                i2 = ((HashSet) (obj)).size();
                Iterator iterator3 = f.iterator();
                do
                {
                    if (!iterator3.hasNext())
                    {
                        break;
                    }
                    Object obj2 = (lc)iterator3.next();
                    Iterator iterator6 = ((lc) (obj2)).c.iterator();
                    boolean flag = false;
label0:
                    do
                    {
                        if (!iterator6.hasNext())
                        {
                            break;
                        }
                        PointF pointf4 = (PointF)iterator6.next();
                        if (flag)
                        {
                            continue;
                        }
                        Iterator iterator9 = ((HashSet) (obj1)).iterator();
                        PointF pointf6;
                        do
                        {
                            if (!iterator9.hasNext())
                            {
                                continue label0;
                            }
                            pointf6 = (PointF)iterator9.next();
                        } while (Math.abs(pointf4.x - pointf6.x) >= 0.5F || Math.abs(pointf4.y - pointf6.y) >= 0.5F);
                        ((HashSet) (obj)).add(obj2);
                        flag = true;
                    } while (true);
                    if (flag)
                    {
                        obj2 = ((lc) (obj2)).c.iterator();
                        while (((Iterator) (obj2)).hasNext()) 
                        {
                            ((HashSet) (obj1)).add((PointF)((Iterator) (obj2)).next());
                        }
                    }
                } while (true);
                j1 = ((HashSet) (obj)).size();
                f.removeAll(((java.util.Collection) (obj)));
            } while (j1 != l1 && i2 != j1);
            f = ((HashSet) (obj));
            Iterator iterator4 = hashmap.keySet().iterator();
            if (h.y > i.y)
            {
                obj = i;
                obj1 = h;
            } else
            {
                obj1 = i;
                obj = h;
            }
            while (iterator4.hasNext()) 
            {
                float f4 = ((Float)iterator4.next()).floatValue();
                if (((Integer)hashmap.get(Float.valueOf(f4))).intValue() == 4)
                {
                    Iterator iterator5 = hashmap.keySet().iterator();
                    while (iterator5.hasNext()) 
                    {
                        float f5 = ((Float)iterator5.next()).floatValue();
                        if (f4 <= ((PointF) (obj)).y && f5 < f4)
                        {
                            Iterator iterator7 = f.iterator();
                            HashSet hashset = new HashSet();
label1:
                            do
                            {
                                if (!iterator7.hasNext())
                                {
                                    break;
                                }
                                lc lc3 = (lc)iterator7.next();
                                Iterator iterator10 = lc3.c.iterator();
                                do
                                {
                                    if (!iterator10.hasNext())
                                    {
                                        continue label1;
                                    }
                                } while (((PointF)iterator10.next()).y != f5);
                                hashset.add(lc3);
                            } while (true);
                            f.removeAll(hashset);
                        }
                        if (f4 >= ((PointF) (obj1)).y && f5 > f4)
                        {
                            Iterator iterator8 = f.iterator();
                            HashSet hashset1 = new HashSet();
label2:
                            do
                            {
                                if (!iterator8.hasNext())
                                {
                                    break;
                                }
                                lc lc4 = (lc)iterator8.next();
                                Iterator iterator11 = lc4.c.iterator();
                                do
                                {
                                    if (!iterator11.hasNext())
                                    {
                                        continue label2;
                                    }
                                } while (((PointF)iterator11.next()).y != f5);
                                hashset1.add(lc4);
                            } while (true);
                            f.removeAll(hashset1);
                        }
                    }
                }
            }
        }
        for (Iterator iterator1 = f.iterator(); iterator1.hasNext();)
        {
            lc lc2 = (lc)iterator1.next();
            ArrayList arraylist = lc2.b();
            PointF pointf = (PointF)arraylist.get(0);
            PointF pointf2 = (PointF)arraylist.get(1);
            PointF pointf3 = (PointF)arraylist.get(2);
            PointF pointf5 = (PointF)arraylist.get(3);
            if (Math.abs(pointf.y - (pointf.x * f1 + f2)) < 0.5F && b(pointf, pointf5, f1, f3))
            {
                return true;
            }
            if (Math.abs(pointf2.y - (pointf2.x * f1 + f2)) < 0.5F && b(pointf2, pointf3, f1, f3))
            {
                return true;
            }
            if (Math.abs(pointf3.y - (pointf3.x * f1 + f2)) < 0.5F && b(pointf3, pointf2, f1, f3))
            {
                return true;
            }
            if (Math.abs(pointf5.y - (pointf5.x * f1 + f2)) < 0.5F && b(pointf5, pointf, f1, f3))
            {
                return true;
            }
            lc2.d = arraylist;
        }

        c();
        return false;
    }

    private boolean b(PointF pointf, PointF pointf1, float f1)
    {
        float f2 = pointf1.x - pointf.x;
        float f3 = pointf1.y - pointf.y;
        float f4 = f3 / f2;
        float f5 = pointf.y;
        float f6 = pointf.x;
        pointf.y = f1;
        if (f2 != 0.0F && f3 != 0.0F)
        {
            pointf.x = (pointf.y - (f5 - f6 * f4)) / f4;
        }
        if (f3 > 0.0F)
        {
            f1 = pointf1.y - pointf.y;
        } else
        {
            f1 = pointf.y - pointf1.y;
        }
        return f1 < A;
    }

    private boolean b(PointF pointf, PointF pointf1, float f1, float f2)
    {
        float f4 = pointf1.x - pointf.x;
        float f3 = pointf1.y - pointf.y;
        if (f4 == 0.0F)
        {
            pointf.y = pointf.x * f1 + f2;
        } else
        if (f3 == 0.0F)
        {
            pointf.x = (pointf.y - f2) / f1;
        } else
        {
            f4 = f3 / f4;
            f4 = (pointf.y - pointf.x * f4 - f2) / (f1 - f4);
            pointf.x = f4;
            pointf.y = f1 * f4 + f2;
        }
        if (f3 > 0.0F)
        {
            f1 = pointf1.y - pointf.y;
        } else
        {
            f1 = pointf.y - pointf1.y;
        }
        return f1 < A;
    }

    private void c()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            lc lc1 = (lc)iterator.next();
            lc1.c = lc1.d;
            lc1.d = null;
        }

        p = o;
        for (Iterator iterator1 = f.iterator(); iterator1.hasNext();)
        {
            lc lc2 = (lc)iterator1.next();
            lc2.b.clear();
            Iterator iterator2 = lc2.c.iterator();
            float f1 = 100F;
            float f7 = 0.0F;
            float f2 = 100F;
            float f3;
            float f5;
            for (f5 = 0.0F; iterator2.hasNext(); f5 = f3)
            {
                PointF pointf = (PointF)iterator2.next();
                f3 = f5;
                if (pointf.x > f5)
                {
                    f3 = pointf.x;
                }
                f5 = f2;
                if (pointf.x < f2)
                {
                    f5 = pointf.x;
                }
                f2 = f7;
                if (pointf.y > f7)
                {
                    f2 = pointf.y;
                }
                if (pointf.y < f1)
                {
                    f1 = pointf.y;
                }
                f7 = f2;
                f2 = f5;
            }

            lc2.l = f5 - f2;
            lc2.m = f7 - f1;
            lc2.j = f2;
            lc2.k = f1;
            if (lc2.f)
            {
                Iterator iterator3 = lc2.c.iterator();
                float f4 = 0.0F;
                float f6 = 0.0F;
                while (iterator3.hasNext()) 
                {
                    PointF pointf1 = (PointF)iterator3.next();
                    float f8 = pointf1.x - f2;
                    float f9 = pointf1.y - f1;
                    f6 += f8;
                    lc2.b.add(new PointF(f8, f9));
                    f4 += f9;
                }
                int i1 = lc2.c.size();
                lc2.e = new PointF(f6 / (float)i1, f4 / (float)i1);
            } else
            {
                PointF pointf2;
                for (Iterator iterator4 = lc2.c.iterator(); iterator4.hasNext(); lc2.b.add(new PointF(pointf2.x - f2, pointf2.y - f1)))
                {
                    pointf2 = (PointF)iterator4.next();
                }

                lc2.e = new PointF(lc2.l / 2.0F, lc2.m / 2.0F);
            }
        }

        if (!D)
        {
            D = true;
            ih.C().o(true);
        }
        p = o;
        s.c(1);
    }

    private boolean c(float f1, float f2)
    {
        if (f.size() == 0)
        {
            HashMap hashmap = new HashMap();
            for (Iterator iterator1 = s.y.iterator(); iterator1.hasNext();)
            {
                lc lc2 = ((ic)iterator1.next()).b;
                Iterator iterator4 = lc2.c.iterator();
                while (iterator4.hasNext()) 
                {
                    PointF pointf1 = (PointF)iterator4.next();
                    if (Math.abs(pointf1.x - f1) < 0.5F)
                    {
                        f.add(lc2);
                        if (hashmap.containsKey(Float.valueOf(pointf1.y)))
                        {
                            int i1 = ((Integer)hashmap.get(Float.valueOf(pointf1.y))).intValue();
                            hashmap.put(Float.valueOf(pointf1.y), Integer.valueOf(i1 + 1));
                        } else
                        {
                            hashmap.put(Float.valueOf(pointf1.y), Integer.valueOf(1));
                        }
                    }
                }
            }

            HashSet hashset = new HashSet();
            HashSet hashset1 = new HashSet();
            hashset1.add(h);
            hashset1.add(i);
            int k1 = f.size();
            int j1;
            int l1;
            do
            {
                l1 = hashset.size();
                Iterator iterator5 = f.iterator();
                do
                {
                    if (!iterator5.hasNext())
                    {
                        break;
                    }
                    Object obj = (lc)iterator5.next();
                    Iterator iterator8 = ((lc) (obj)).c.iterator();
                    boolean flag = false;
label0:
                    do
                    {
                        if (!iterator8.hasNext())
                        {
                            break;
                        }
                        PointF pointf4 = (PointF)iterator8.next();
                        if (flag)
                        {
                            continue;
                        }
                        Iterator iterator11 = hashset1.iterator();
                        PointF pointf6;
                        do
                        {
                            if (!iterator11.hasNext())
                            {
                                continue label0;
                            }
                            pointf6 = (PointF)iterator11.next();
                        } while (Math.abs(pointf4.x - pointf6.x) >= 0.5F || Math.abs(pointf4.y - pointf6.y) >= 0.5F);
                        hashset.add(obj);
                        flag = true;
                    } while (true);
                    if (flag)
                    {
                        obj = ((lc) (obj)).c.iterator();
                        while (((Iterator) (obj)).hasNext()) 
                        {
                            hashset1.add((PointF)((Iterator) (obj)).next());
                        }
                    }
                } while (true);
                j1 = hashset.size();
                f.removeAll(hashset);
            } while (j1 != k1 && l1 != j1);
            f = hashset;
            for (Iterator iterator2 = hashmap.keySet().iterator(); iterator2.hasNext();)
            {
                float f3 = ((Float)iterator2.next()).floatValue();
                if (((Integer)hashmap.get(Float.valueOf(f3))).intValue() == 4)
                {
                    Iterator iterator3 = hashmap.keySet().iterator();
                    while (iterator3.hasNext()) 
                    {
                        float f4 = ((Float)iterator3.next()).floatValue();
                        if (f3 <= h.y && f4 < f3)
                        {
                            Iterator iterator6 = f.iterator();
                            HashSet hashset2 = new HashSet();
label1:
                            do
                            {
                                if (!iterator6.hasNext())
                                {
                                    break;
                                }
                                lc lc3 = (lc)iterator6.next();
                                if (lc3.f)
                                {
                                    continue;
                                }
                                Iterator iterator9 = lc3.c.iterator();
                                do
                                {
                                    if (!iterator9.hasNext())
                                    {
                                        continue label1;
                                    }
                                } while (Math.abs(((PointF)iterator9.next()).y - f4) >= 0.5F);
                                hashset2.add(lc3);
                            } while (true);
                            f.removeAll(hashset2);
                        }
                        if (f3 >= i.y && f4 > f3)
                        {
                            Iterator iterator7 = f.iterator();
                            HashSet hashset3 = new HashSet();
label2:
                            do
                            {
                                if (!iterator7.hasNext())
                                {
                                    break;
                                }
                                lc lc4 = (lc)iterator7.next();
                                if (lc4.f)
                                {
                                    continue;
                                }
                                Iterator iterator10 = lc4.c.iterator();
                                do
                                {
                                    if (!iterator10.hasNext())
                                    {
                                        continue label2;
                                    }
                                } while (Math.abs(((PointF)iterator10.next()).y - f4) >= 0.5F);
                                hashset3.add(lc4);
                            } while (true);
                            f.removeAll(hashset3);
                        }
                    }
                }
            }

        }
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            lc lc1 = (lc)iterator.next();
            ArrayList arraylist = lc1.b();
            PointF pointf = (PointF)arraylist.get(0);
            PointF pointf2 = (PointF)arraylist.get(1);
            PointF pointf3 = (PointF)arraylist.get(2);
            PointF pointf5 = (PointF)arraylist.get(3);
            if (Math.abs(pointf.x - f1) < 0.5F && a(pointf, pointf2, f2))
            {
                return true;
            }
            if (Math.abs(pointf2.x - f1) < 0.5F && a(pointf2, pointf, f2))
            {
                return true;
            }
            if (Math.abs(pointf3.x - f1) < 0.5F && a(pointf3, pointf5, f2))
            {
                return true;
            }
            if (Math.abs(pointf5.x - f1) < 0.5F && a(pointf5, pointf3, f2))
            {
                return true;
            }
            lc1.d = arraylist;
        }

        c();
        return false;
    }

    private boolean d(float f1, float f2)
    {
        if (f.size() == 0)
        {
            HashMap hashmap = new HashMap();
            for (Iterator iterator1 = s.y.iterator(); iterator1.hasNext();)
            {
                lc lc2 = ((ic)iterator1.next()).b;
                Iterator iterator4 = lc2.c.iterator();
                while (iterator4.hasNext()) 
                {
                    PointF pointf1 = (PointF)iterator4.next();
                    if (Math.abs(pointf1.y - f1) < 0.5F)
                    {
                        f.add(lc2);
                        if (hashmap.containsKey(Float.valueOf(pointf1.x)))
                        {
                            int i1 = ((Integer)hashmap.get(Float.valueOf(pointf1.x))).intValue();
                            hashmap.put(Float.valueOf(pointf1.x), Integer.valueOf(i1 + 1));
                        } else
                        {
                            hashmap.put(Float.valueOf(pointf1.x), Integer.valueOf(1));
                        }
                    }
                }
            }

            HashSet hashset = new HashSet();
            HashSet hashset1 = new HashSet();
            hashset1.add(h);
            hashset1.add(i);
            int k1 = f.size();
            int j1;
            int l1;
            do
            {
                l1 = hashset.size();
                Iterator iterator5 = f.iterator();
                do
                {
                    if (!iterator5.hasNext())
                    {
                        break;
                    }
                    Object obj = (lc)iterator5.next();
                    Iterator iterator8 = ((lc) (obj)).c.iterator();
                    boolean flag = false;
label0:
                    do
                    {
                        if (!iterator8.hasNext())
                        {
                            break;
                        }
                        PointF pointf4 = (PointF)iterator8.next();
                        if (flag)
                        {
                            continue;
                        }
                        Iterator iterator11 = hashset1.iterator();
                        PointF pointf6;
                        do
                        {
                            if (!iterator11.hasNext())
                            {
                                continue label0;
                            }
                            pointf6 = (PointF)iterator11.next();
                        } while (Math.abs(pointf4.x - pointf6.x) >= 0.5F || Math.abs(pointf4.y - pointf6.y) >= 0.5F);
                        hashset.add(obj);
                        flag = true;
                    } while (true);
                    if (flag)
                    {
                        obj = ((lc) (obj)).c.iterator();
                        while (((Iterator) (obj)).hasNext()) 
                        {
                            hashset1.add((PointF)((Iterator) (obj)).next());
                        }
                    }
                } while (true);
                j1 = hashset.size();
                f.removeAll(hashset);
            } while (j1 != k1 && l1 != j1);
            f = hashset;
            for (Iterator iterator2 = hashmap.keySet().iterator(); iterator2.hasNext();)
            {
                float f3 = ((Float)iterator2.next()).floatValue();
                if (((Integer)hashmap.get(Float.valueOf(f3))).intValue() == 4)
                {
                    Iterator iterator3 = hashmap.keySet().iterator();
                    while (iterator3.hasNext()) 
                    {
                        float f4 = ((Float)iterator3.next()).floatValue();
                        if (f3 <= h.x && f4 < f3)
                        {
                            Iterator iterator6 = f.iterator();
                            HashSet hashset2 = new HashSet();
label1:
                            do
                            {
                                if (!iterator6.hasNext())
                                {
                                    break;
                                }
                                lc lc3 = (lc)iterator6.next();
                                if (lc3.f)
                                {
                                    continue;
                                }
                                Iterator iterator9 = lc3.c.iterator();
                                do
                                {
                                    if (!iterator9.hasNext())
                                    {
                                        continue label1;
                                    }
                                } while (Math.abs(((PointF)iterator9.next()).x - f4) >= 0.5F);
                                hashset2.add(lc3);
                            } while (true);
                            f.removeAll(hashset2);
                        }
                        if (f3 >= i.x && f4 > f3)
                        {
                            Iterator iterator7 = f.iterator();
                            HashSet hashset3 = new HashSet();
label2:
                            do
                            {
                                if (!iterator7.hasNext())
                                {
                                    break;
                                }
                                lc lc4 = (lc)iterator7.next();
                                if (lc4.f)
                                {
                                    continue;
                                }
                                Iterator iterator10 = lc4.c.iterator();
                                do
                                {
                                    if (!iterator10.hasNext())
                                    {
                                        continue label2;
                                    }
                                } while (Math.abs(((PointF)iterator10.next()).x - f4) >= 0.5F);
                                hashset3.add(lc4);
                            } while (true);
                            f.removeAll(hashset3);
                        }
                    }
                }
            }

        }
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            lc lc1 = (lc)iterator.next();
            ArrayList arraylist = lc1.b();
            PointF pointf = (PointF)arraylist.get(0);
            PointF pointf2 = (PointF)arraylist.get(1);
            PointF pointf3 = (PointF)arraylist.get(2);
            PointF pointf5 = (PointF)arraylist.get(3);
            if (Math.abs(pointf.y - f1) < 0.5F && b(pointf, pointf5, f2))
            {
                return true;
            }
            if (Math.abs(pointf2.y - f1) < 0.5F && b(pointf2, pointf3, f2))
            {
                return true;
            }
            if (Math.abs(pointf3.y - f1) < 0.5F && b(pointf3, pointf2, f2))
            {
                return true;
            }
            if (Math.abs(pointf5.y - f1) < 0.5F && b(pointf5, pointf, f2))
            {
                return true;
            }
            lc1.d = arraylist;
        }

        c();
        return false;
    }

    protected final void a()
    {
        if (a != null && !a.isRecycled())
        {
            a.recycle();
        }
        a = null;
    }

    protected final void a(float f1)
    {
        C = true;
        B.reset();
        B.postScale(f1, f1, d + (float)k / 2.0F, e + (float)l / 2.0F);
    }

    protected final void a(float f1, float f2)
    {
        x = f1;
        y = f2;
    }

    protected final void a(float f1, float f2, boolean flag)
    {
        d = f1 - (float)k / 2.0F;
        e = f2 - (float)l / 2.0F;
        z = ih.C().R();
        A = 12F + z;
        if (flag)
        {
            f.clear();
            o = -1;
            p = -2;
        }
    }

    protected final void a(int i1, int j1, int k1, int l1)
    {
        t = i1;
        u = j1;
        v = k1;
        w = l1;
    }

    protected final void a(Canvas canvas)
    {
label0:
        {
            if (a != null && !a.isRecycled())
            {
                if (!C)
                {
                    break label0;
                }
                C = false;
                canvas.save();
                canvas.concat(B);
                canvas.drawBitmap(a, d, e, null);
                canvas.restore();
                b.set(d, e, d + (float)k, e + (float)l);
            }
            return;
        }
        canvas.drawBitmap(a, d, e, null);
        b.set(d, e, d + (float)k, e + (float)l);
    }

    protected final void a(PointF pointf, PointF pointf1)
    {
        h = pointf;
        i = pointf1;
    }

    protected final void b()
    {
        f.clear();
    }

    protected final boolean b(float f1, float f2)
    {
        this;
        JVM INSTR monitorenter ;
        r = false;
        g;
        JVM INSTR tableswitch 0 3: default 832
    //                   0 111
    //                   1 144
    //                   2 144
    //                   3 111;
           goto _L1 _L2 _L3 _L3 _L2
_L1:
        float f3;
        float f4;
        f3 = (f1 * 100F) / (float)t;
        f4 = (f2 * 100F) / (float)u;
        g;
        JVM INSTR tableswitch 0 3: default 835
    //                   0 177
    //                   1 346
    //                   2 507
    //                   3 669;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        boolean flag = j;
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        f1 = f1 - x - (float)v - 2.0F;
        f2 = f2 - y - (float)w - 2.0F;
          goto _L1
_L3:
        f1 = (x + f1) - (float)v - 2.0F;
        f2 = (y + f2) - (float)w - 2.0F;
          goto _L1
_L5:
        if (f2 >= e) goto _L10; else goto _L9
_L9:
        o = 0;
_L13:
        m = i.x - h.x;
        n = i.y - h.y;
        if (m == 0.0F || n == 0.0F) goto _L12; else goto _L11
_L11:
        f3 = n / m;
        j = b(f3, h.y - h.x * f3, (f2 * 100F) / (float)u - ((f1 * 100F) / (float)t) * f3);
          goto _L4
        Exception exception;
        exception;
        throw exception;
_L10:
        o = 1;
          goto _L13
_L12:
        j = d(h.y, f4);
          goto _L4
_L6:
        if (f1 >= d) goto _L15; else goto _L14
_L14:
        o = 2;
_L18:
        m = i.x - h.x;
        n = i.y - h.y;
        if (m == 0.0F || n == 0.0F) goto _L17; else goto _L16
_L16:
        f3 = n / m;
        j = a(f3, h.y - h.x * f3, (f2 * 100F) / (float)u - ((f1 * 100F) / (float)t) * f3);
          goto _L4
_L15:
        o = 3;
          goto _L18
_L17:
        j = c(h.x, f3);
          goto _L4
_L7:
        if (f2 >= e) goto _L20; else goto _L19
_L19:
        o = 4;
_L23:
        m = i.x - h.x;
        n = i.y - h.y;
        if (m == 0.0F || n == 0.0F) goto _L22; else goto _L21
_L21:
        f3 = n / m;
        j = b(f3, h.y - h.x * f3, (f2 * 100F) / (float)u - ((f1 * 100F) / (float)t) * f3);
          goto _L4
_L20:
        o = 5;
          goto _L23
_L22:
        j = d(h.y, f4);
          goto _L4
_L8:
        if (f1 >= d) goto _L25; else goto _L24
_L24:
        o = 6;
_L28:
        m = i.x - h.x;
        n = i.y - h.y;
        if (m == 0.0F || n == 0.0F) goto _L27; else goto _L26
_L26:
        f3 = n / m;
        j = a(f3, h.y - h.x * f3, (f2 * 100F) / (float)u - ((f1 * 100F) / (float)t) * f3);
          goto _L4
_L25:
        o = 7;
          goto _L28
_L27:
        j = c(h.x, f3);
          goto _L4
    }
}
