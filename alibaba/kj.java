// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;

public class kj
    implements android.view.View.OnTouchListener
{
    public static interface a
    {

        public abstract void a(View view, Object obj);

        public abstract void a(boolean flag);

        public abstract boolean a(Object obj);
    }


    private int a;
    private int b;
    private int c;
    private long d;
    private View e;
    private a f;
    private int g;
    private float h;
    private float i;
    private boolean j;
    private int k;
    private Object l;
    private VelocityTracker m;
    private float n;

    public kj(View view, Object obj, a a1)
    {
        g = 1;
        ViewConfiguration viewconfiguration = ViewConfiguration.get(view.getContext());
        a = viewconfiguration.getScaledTouchSlop();
        b = viewconfiguration.getScaledMinimumFlingVelocity() * 16;
        c = viewconfiguration.getScaledMaximumFlingVelocity();
        d = view.getContext().getResources().getInteger(0x10e0000);
        e = view;
        l = obj;
        f = a1;
    }

    private void a()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static void a(kj kj1)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        motionevent.offsetLocation(n, 0.0F);
        if (g < 2)
        {
            g = e.getWidth();
        }
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 68
    //                   0 70
    //                   1 129
    //                   2 576
    //                   3 508;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        h = motionevent.getRawX();
        i = motionevent.getRawY();
        if (f.a(l))
        {
            f.a(true);
            m = VelocityTracker.obtain();
            m.addMovement(motionevent);
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (m != null)
        {
            f.a(false);
            float f1 = motionevent.getRawX() - h;
            m.addMovement(motionevent);
            m.computeCurrentVelocity(1000);
            float f2 = m.getXVelocity();
            float f3 = Math.abs(f2);
            float f4 = Math.abs(m.getYVelocity());
            int i1;
            if (Math.abs(f1) > (float)(g / 2) && j)
            {
                if (f1 > 0.0F)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
            } else
            if ((float)b <= f3 && f3 <= (float)c && f4 < f3 && f4 < f3 && j)
            {
                if (f2 < 0.0F)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (f1 < 0.0F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (i1 == flag)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (m.getXVelocity() > 0.0F)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                flag1 = i1;
                i1 = ((flag) ? 1 : 0);
                flag = flag1;
            } else
            {
                i1 = 0;
                flag = false;
            }
            if (flag)
            {
                view = e.animate();
                if (i1 != 0)
                {
                    f1 = g;
                } else
                {
                    f1 = -g;
                }
                view.translationX(f1).alpha(0.0F).setDuration(d).setListener(new AnimatorListenerAdapter() {

                    final kj a;

                    public void onAnimationEnd(Animator animator)
                    {
                        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
                    }

            
            {
                a = kj.this;
                super();
            }
                });
            } else
            if (j)
            {
                e.animate().translationX(0.0F).alpha(1.0F).setDuration(d).setListener(null);
            }
            if (m != null)
            {
                m.recycle();
                m = null;
            }
            n = 0.0F;
            h = 0.0F;
            i = 0.0F;
            j = false;
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (m != null)
        {
            e.animate().translationX(0.0F).alpha(1.0F).setDuration(d).setListener(null);
            m.recycle();
            m = null;
            n = 0.0F;
            h = 0.0F;
            i = 0.0F;
            j = false;
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (m != null)
        {
            m.addMovement(motionevent);
            f1 = motionevent.getRawX() - h;
            f2 = motionevent.getRawY();
            f3 = i;
            if (Math.abs(f1) > (float)a && Math.abs(f2 - f3) < Math.abs(f1) / 2.0F)
            {
                j = true;
                if (f1 > 0.0F)
                {
                    i1 = a;
                } else
                {
                    i1 = -a;
                }
                k = i1;
                if (e.getParent() != null)
                {
                    e.getParent().requestDisallowInterceptTouchEvent(true);
                }
                view = MotionEvent.obtain(motionevent);
                view.setAction(motionevent.getActionIndex() << 8 | 3);
                e.onTouchEvent(view);
                view.recycle();
            }
            if (j)
            {
                n = f1;
                e.setTranslationX(f1 - (float)k);
                e.setAlpha(Math.max(0.0F, Math.min(1.0F, 1.0F - (2.0F * Math.abs(f1)) / (float)g)));
                return true;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
