// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.a.a;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class com.qihoo.security.a.a.a
{
    public static interface a
    {

        public abstract void a();
    }


    private final BlockingQueue a = new LinkedBlockingQueue();
    private final int b;
    private final int c;
    private long d;
    private final int e;
    private final int f;
    private boolean g;
    private final Handler h = new Handler() {

        final com.qihoo.security.a.a.a a;

        public void handleMessage(Message message)
        {
            com.qihoo.security.a.a.a.a(a);
            JVM INSTR tableswitch 1 3: default 32
        //                       1 76
        //                       2 93
        //                       3 122;
               goto _L1 _L2 _L3 _L4
_L1:
            if (!com.qihoo.security.a.a.a.b(a).isEmpty())
            {
                com.qihoo.security.a.a.a.c(a).sendMessageDelayed(com.qihoo.security.a.a.a.c(a).obtainMessage(), com.qihoo.security.a.a.a.d(a));
            }
            return;
_L2:
            com.qihoo.security.a.a.a.a(a, com.qihoo.security.a.a.a.b(a));
            continue; /* Loop/switch isn't completed */
_L3:
            com.qihoo.security.a.a.a.a(a, com.qihoo.security.a.a.a.b(a), com.qihoo.security.a.a.a.b(a).size());
            continue; /* Loop/switch isn't completed */
_L4:
            com.qihoo.security.a.a.a.b(a, com.qihoo.security.a.a.a.b(a), com.qihoo.security.a.a.a.b(a).size());
            if (true) goto _L1; else goto _L5
_L5:
        }

            
            {
                a = com.qihoo.security.a.a.a.this;
                super();
            }
    };
    private a i;

    public com.qihoo.security.a.a.a(int j, int k, long l, int i1, int j1)
    {
        d = 0L;
        g = false;
        c = k;
        b = j;
        d = l;
        f = j1;
        e = i1;
        g = true;
    }

    static int a(com.qihoo.security.a.a.a a1)
    {
        return a1.b;
    }

    static void a(com.qihoo.security.a.a.a a1, BlockingQueue blockingqueue)
    {
        a1.a(blockingqueue);
    }

    static void a(com.qihoo.security.a.a.a a1, BlockingQueue blockingqueue, int j)
    {
        a1.b(blockingqueue, j);
    }

    private void a(BlockingQueue blockingqueue)
    {
        View view = (View)blockingqueue.poll();
        if (view == null)
        {
            return;
        } else
        {
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, view.getX() - 30F, f);
            translateanimation.setDuration(750L);
            translateanimation.setInterpolator(new AccelerateInterpolator());
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener(view, blockingqueue) {

                final View a;
                final BlockingQueue b;
                final com.qihoo.security.a.a.a c;

                public void onAnimationEnd(Animation animation)
                {
                    a.setVisibility(4);
                    if (com.qihoo.security.a.a.a.e(c) != 1) goto _L2; else goto _L1
_L1:
                    if (b.isEmpty()) goto _L4; else goto _L3
_L3:
                    com.qihoo.security.a.a.a.a(c, b);
_L6:
                    return;
_L4:
                    if (com.qihoo.security.a.a.a.f(c) != null && com.qihoo.security.a.a.a.g(c))
                    {
                        com.qihoo.security.a.a.a.a(c, false);
                        com.qihoo.security.a.a.a.f(c).a();
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L2:
                    if (b.isEmpty() && com.qihoo.security.a.a.a.f(c) != null && com.qihoo.security.a.a.a.g(c))
                    {
                        com.qihoo.security.a.a.a.a(c, false);
                        com.qihoo.security.a.a.a.f(c).a();
                        return;
                    }
                    if (true) goto _L6; else goto _L5
_L5:
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                c = com.qihoo.security.a.a.a.this;
                a = view;
                b = blockingqueue;
                super();
            }
            });
            view.startAnimation(translateanimation);
            return;
        }
    }

    private void a(BlockingQueue blockingqueue, int j)
    {
        View view = (View)blockingqueue.poll();
        if (view == null)
        {
            return;
        } else
        {
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, 0.0F);
            translateanimation.setDuration(460L);
            translateanimation.setInterpolator(new AccelerateInterpolator(1.5F));
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener(view, blockingqueue, j) {

                final View a;
                final BlockingQueue b;
                final int c;
                final com.qihoo.security.a.a.a d;

                public void onAnimationEnd(Animation animation)
                {
                    a.setVisibility(4);
                    if (com.qihoo.security.a.a.a.e(d) != 1) goto _L2; else goto _L1
_L1:
                    if (b.isEmpty()) goto _L4; else goto _L3
_L3:
                    com.qihoo.security.a.a.a.b(d, b, c);
_L6:
                    return;
_L4:
                    if (com.qihoo.security.a.a.a.f(d) != null && com.qihoo.security.a.a.a.g(d))
                    {
                        com.qihoo.security.a.a.a.a(d, false);
                        com.qihoo.security.a.a.a.f(d).a();
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L2:
                    if (c == 1 && com.qihoo.security.a.a.a.f(d) != null && com.qihoo.security.a.a.a.g(d))
                    {
                        com.qihoo.security.a.a.a.a(d, false);
                        com.qihoo.security.a.a.a.f(d).a();
                        return;
                    }
                    if (true) goto _L6; else goto _L5
_L5:
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                d = com.qihoo.security.a.a.a.this;
                a = view;
                b = blockingqueue;
                c = j;
                super();
            }
            });
            view.startAnimation(translateanimation);
            return;
        }
    }

    static boolean a(com.qihoo.security.a.a.a a1, boolean flag)
    {
        a1.g = flag;
        return flag;
    }

    static BlockingQueue b(com.qihoo.security.a.a.a a1)
    {
        return a1.a;
    }

    static void b(com.qihoo.security.a.a.a a1, BlockingQueue blockingqueue, int j)
    {
        a1.a(blockingqueue, j);
    }

    private void b(BlockingQueue blockingqueue, int j)
    {
        View view = (View)blockingqueue.poll();
        if (view == null)
        {
            return;
        } else
        {
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, 0.0F);
            translateanimation.setDuration(400L);
            translateanimation.setInterpolator(new AccelerateInterpolator());
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener(view, blockingqueue, j) {

                final View a;
                final BlockingQueue b;
                final int c;
                final com.qihoo.security.a.a.a d;

                public void onAnimationEnd(Animation animation)
                {
                    a.setVisibility(0);
                    if (com.qihoo.security.a.a.a.e(d) != 1) goto _L2; else goto _L1
_L1:
                    if (b.isEmpty()) goto _L4; else goto _L3
_L3:
                    com.qihoo.security.a.a.a.a(d, b, c);
_L6:
                    return;
_L4:
                    if (com.qihoo.security.a.a.a.f(d) != null && com.qihoo.security.a.a.a.g(d))
                    {
                        com.qihoo.security.a.a.a.a(d, false);
                        com.qihoo.security.a.a.a.f(d).a();
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L2:
                    if (c == 1 && com.qihoo.security.a.a.a.f(d) != null && com.qihoo.security.a.a.a.g(d))
                    {
                        com.qihoo.security.a.a.a.a(d, false);
                        com.qihoo.security.a.a.a.f(d).a();
                        return;
                    }
                    if (true) goto _L6; else goto _L5
_L5:
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                d = com.qihoo.security.a.a.a.this;
                a = view;
                b = blockingqueue;
                c = j;
                super();
            }
            });
            view.startAnimation(translateanimation);
            return;
        }
    }

    static Handler c(com.qihoo.security.a.a.a a1)
    {
        return a1.h;
    }

    private void c()
    {
        switch (b)
        {
        default:
            return;

        case 1: // '\001'
            a(a);
            return;

        case 2: // '\002'
            b(a, a.size());
            return;

        case 3: // '\003'
            a(a, a.size());
            break;
        }
    }

    static long d(com.qihoo.security.a.a.a a1)
    {
        return a1.d;
    }

    private void d()
    {
        b;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 33
    //                   2 56
    //                   3 88;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        while (!a.isEmpty()) 
        {
            a(a);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        while (!a.isEmpty()) 
        {
            b(a, a.size());
        }
        if (true) goto _L1; else goto _L4
_L4:
        while (!a.isEmpty()) 
        {
            a(a, a.size());
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static int e(com.qihoo.security.a.a.a a1)
    {
        return a1.c;
    }

    private void e()
    {
        h.sendMessageDelayed(h.obtainMessage(), d);
    }

    static a f(com.qihoo.security.a.a.a a1)
    {
        return a1.i;
    }

    static boolean g(com.qihoo.security.a.a.a a1)
    {
        return a1.g;
    }

    public int a()
    {
        if (a.isEmpty())
        {
            return 0;
        } else
        {
            return a.size();
        }
    }

    public void a(View view)
    {
        a.add(view);
    }

    public void a(a a1)
    {
        i = a1;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public void b()
    {
        if (a.isEmpty())
        {
            return;
        }
        switch (c)
        {
        default:
            return;

        case 1: // '\001'
            c();
            return;

        case 2: // '\002'
            d();
            return;

        case 3: // '\003'
            e();
            break;
        }
    }
}
