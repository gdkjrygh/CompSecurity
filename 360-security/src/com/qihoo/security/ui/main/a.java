// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import com.nineoldandroids.a.b;
import com.nineoldandroids.a.c;
import com.nineoldandroids.a.k;

public class a
{

    private static long a;

    public static long a(long l, View aview[], View aview1[], b b1)
    {
        if (!a()) goto _L2; else goto _L1
_L1:
        long l1;
        (new Handler()).postDelayed(new Runnable(aview, aview1, b1) {

            final View a[];
            final View b[];
            final b c;

            public void run()
            {
                Log.e("AnimUtils", "double click running...");
                a.a(0L, a, b, c);
            }

            
            {
                a = aview;
                b = aview1;
                c = b1;
                super();
            }
        }, 100L);
        l1 = 0L;
_L11:
        return l1;
_L2:
        View view;
        int i;
        boolean flag;
        if (aview1 != null && aview1.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        i = aview1.length - 1;
_L7:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        view = aview1[i];
        if (view == null || view.getVisibility() == 0) goto _L6; else goto _L5
_L6:
        i--;
          goto _L7
_L4:
        if (aview == null)
        {
            break MISSING_BLOCK_LABEL_443;
        }
        i = aview.length - 1;
_L9:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_443;
        }
        obj = aview[i];
        if (obj == null || ((View) (obj)).getVisibility() != 0) goto _L8; else goto _L5
_L8:
        i--;
          goto _L9
_L5:
        if (aview != null)
        {
            Object obj = new AccelerateInterpolator();
            int i1 = 0;
            while (i1 < aview.length) 
            {
                View view2 = aview[i1];
                if (view2 != null)
                {
                    view2.clearAnimation();
                    if (view2.getVisibility() == 0)
                    {
                        k k2 = k.a(view2, "alpha", new float[] {
                            1.0F, 0.0F
                        });
                        k2.c(300L);
                        k2.a(((android.view.animation.Interpolator) (obj)));
                        boolean flag1;
                        if (!flag && i1 == i)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        k2.a(new b(view2, b1, flag1) {

                            final View a;
                            final b b;
                            final boolean c;

                            public void b(com.nineoldandroids.a.a a1)
                            {
                                a.setVisibility(4);
                                if (b != null && c)
                                {
                                    b.b(a1);
                                }
                            }

            
            {
                a = view;
                b = b1;
                c = flag;
                super();
            }
                        });
                        k2.a();
                    }
                }
                i1++;
            }
        }
        l1 = l;
        if (aview1 == null) goto _L11; else goto _L10
_L10:
        int j;
        aview = new DecelerateInterpolator();
        j = 0;
_L13:
        l1 = l;
        if (j >= aview1.length) goto _L11; else goto _L12
_L12:
        View view1 = aview1[j];
        if (view1 != null)
        {
            view1.clearAnimation();
            if (view1.getVisibility() == 0)
            {
                com.nineoldandroids.b.a.a(view1, 1.0F);
            } else
            {
                k k1 = k.a(view1, "alpha", new float[] {
                    0.0F, 1.0F
                });
                k1.c(300L);
                l += 150L;
                k1.a(l);
                k1.a(aview);
                boolean flag2;
                if (j == i)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                k1.a(new b(view1, b1, flag2) {

                    final View a;
                    final b b;
                    final boolean c;

                    public void a(com.nineoldandroids.a.a a1)
                    {
                        a.setVisibility(0);
                    }

                    public void b(com.nineoldandroids.a.a a1)
                    {
                        if (b != null && c)
                        {
                            b.b(a1);
                        }
                    }

            
            {
                a = view;
                b = b1;
                c = flag;
                super();
            }
                });
                k1.a();
            }
        }
        j++;
          goto _L13
          goto _L11
        i = -1;
          goto _L5
        i = -1;
          goto _L5
    }

    public static long a(View aview[], View aview1[])
    {
        return a(0L, aview, aview1, null);
    }

    public static void a(long l, View view, b b1)
    {
        view = k.a(view, "alpha", new float[] {
            1.0F, 0.0F
        });
        if (l <= 0L)
        {
            l = 400L;
        }
        view.c(l);
        if (b1 != null)
        {
            view.a(b1);
        }
        view.a();
    }

    public static void a(long l, View view, com.qihoo.security.opti.trashclear.ui.mainpage.a a1)
    {
        ScaleAnimation scaleanimation = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F);
        if (l <= 0L)
        {
            l = 400L;
        }
        scaleanimation.setDuration(l);
        scaleanimation.setFillAfter(true);
        if (a1 != null)
        {
            scaleanimation.setAnimationListener(a1);
        }
        view.startAnimation(scaleanimation);
    }

    public static void a(View view, long l, b b1)
    {
        k k1 = k.a(view, "scaleX", new float[] {
            0.0F, 1.0F
        });
        view = k.a(view, "scaleY", new float[] {
            0.0F, 1.0F
        });
        c c1 = new c();
        if (l <= 0L)
        {
            l = 400L;
        }
        c1.c(l);
        if (b1 != null)
        {
            c1.a(b1);
        }
        c1.a(new com.nineoldandroids.a.a[] {
            k1, view
        });
        c1.a();
    }

    public static void a(View view, com.nineoldandroids.a.a a1, float f, float f1, long l)
    {
        view.clearAnimation();
        view = k.a(view, "alpha", new float[] {
            f, f1
        });
        view.c(l);
        if (a1 != null)
        {
            view.a(a1);
        }
        view.a();
    }

    public static boolean a()
    {
        com/qihoo/security/ui/main/a;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = System.currentTimeMillis();
        l1 = a;
        l1 = l - l1;
        if (l1 <= 0L || l1 >= 500L) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        com/qihoo/security/ui/main/a;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        a = l;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static void b(long l, View view, b b1)
    {
        view = k.a(view, "alpha", new float[] {
            0.0F, 1.0F
        });
        if (l <= 0L)
        {
            l = 400L;
        }
        view.c(l);
        if (b1 != null)
        {
            view.a(b1);
        }
        view.a();
    }
}
