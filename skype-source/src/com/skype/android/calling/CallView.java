// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.skype.android.video.ControlUnit;
import com.skype.android.video.ViewSnapper;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.calling:
//            ViewCallback, VideoCall, CallViewAdapter, d, 
//            a, CallViewElementFactory, UnhandledGestureListener, c, 
//            CameraFacing

public class CallView extends ViewGroup
    implements android.view.View.OnTouchListener, ViewCallback, com.skype.android.video.ControlUnit.StateListener
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/skype/android/calling/CallView$a, s1);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("AUTO", 0);
            b = new a("MANUAL", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static final Logger b;
    private Rect A;
    private Rect B;
    private Rect C;
    private android.view.View.OnLayoutChangeListener D;
    private ViewSnapper a;
    private WindowManager c;
    private OrientationEventListener d;
    private int e;
    private VideoCall f;
    private Map g;
    private Map h;
    private Map i;
    private View j;
    private View k;
    private View l;
    private UnhandledGestureListener m;
    private CallViewElementFactory n;
    private CallViewAdapter o;
    private Set p;
    private Set q;
    private com.skype.android.calling.a r;
    private a s;
    private boolean t;
    private int u;
    private Rect v;
    private com.skype.android.video.ViewSnapper.HorizontalSnap w;
    private com.skype.android.video.ViewSnapper.VerticalSnap x;
    private boolean y;
    private int z;

    public CallView(Context context)
    {
        this(context, null);
    }

    public CallView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CallView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        A = new Rect();
        B = new Rect();
        C = new Rect();
        t = true;
        u = 2;
        v = new Rect(0, 0, 0, 0);
        z = 1;
        g = new HashMap();
        h = new HashMap();
        i = new HashMap();
        e = -1;
        p = new LinkedHashSet();
        q = new LinkedHashSet();
        s = a.a;
        c = (WindowManager)getContext().getSystemService("window");
        if (!isInEditMode())
        {
            d = new OrientationEventListener(getContext()) {

                final CallView a;

                public final void onOrientationChanged(int j1)
                {
                    j1 = CallView.a(a).getDefaultDisplay().getRotation();
                    if (j1 != CallView.b(a))
                    {
                        CallView.a(a, j1);
                        CallView.c(a);
                        ControlUnit.sendControlCommand(2, 0, CallView.b(a) * 90, 0);
                    }
                }

            
            {
                a = CallView.this;
                super(context, 2);
            }
            };
        }
        e = c.getDefaultDisplay().getRotation();
        ControlUnit.sendControlCommand(2, 0, e * 90, 0);
        a = new ViewSnapper(new Rect());
        setRibbonSnapping(com.skype.android.video.ViewSnapper.HorizontalSnap.RIGHT, com.skype.android.video.ViewSnapper.VerticalSnap.BOTTOM);
        a.addViewSnapperListener(new com.skype.android.video.ViewSnapper.ViewSnapperListener() {

            final CallView a;

            public final void onDragStarted()
            {
            }

            public final void onDragStopped()
            {
            }

            public final void onDragUpdated()
            {
                CallView.d(a);
            }

            
            {
                a = CallView.this;
                super();
            }
        });
    }

    static int a(CallView callview, int i1)
    {
        callview.e = i1;
        return i1;
    }

    private View a(View view)
    {
        if (view != null)
        {
            addView(view);
            bringChildToFront(view);
        }
        return view;
    }

    static WindowManager a(CallView callview)
    {
        return callview.c;
    }

    private void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        s = a1;
        if (o != null)
        {
            o.onFocusModeChanged();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    private void a(com.skype.android.calling.a a1, int i1, int j1, int k1, int l1)
    {
        View view = d(a1);
        if (view == null) goto _L2; else goto _L1
_L1:
        int i2;
        if (!y && (a1 instanceof d) && ((d)a1).o())
        {
            i2 = 0;
        } else
        {
            i2 = 4;
        }
        view.setVisibility(i2);
        view.getVisibility();
        JVM INSTR lookupswitch 2: default 76
    //                   0: 93
    //                   4: 83;
           goto _L2 _L3 _L4
_L2:
        return;
_L4:
        view.layout(0, 0, 0, 0);
        return;
_L3:
        bringChildToFront(view);
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 - i1, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(l1 - j1, 0x80000000));
        view.layout(i1, j1, k1, view.getMeasuredHeight() + j1);
        return;
    }

    private boolean a(com.skype.android.calling.a a1, boolean flag)
    {
_L2:
        return false;
        if (j() || !a1.h() || d() && !flag) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!p.contains(a1) || p.size() != 1)
        {
            a(a.b);
            b.info((new StringBuilder("kicked everyone to add participant to the stage ")).append(a1).toString());
            LinkedHashSet linkedhashset = new LinkedHashSet(p);
            f(a1);
            p.add(a1);
            p.retainAll(Collections.singleton(a1));
            linkedhashset.remove(a1);
            for (a1 = linkedhashset.iterator(); a1.hasNext(); b((com.skype.android.calling.a)a1.next(), false)) { }
            if (r == null)
            {
                b.info("activity monitor is null, updating it");
                k();
            }
            return true;
        }
        continue; /* Loop/switch isn't completed */
        if (!(a1 instanceof d) || p.contains(a1)) goto _L2; else goto _L3
_L3:
        if (p.size() != u)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((d)a1).m())
        {
            continue; /* Loop/switch isn't completed */
        }
        com.skype.android.calling.a a2 = m();
        if ((a2 instanceof d) && ((d)a2).n())
        {
            if (a1.h() || ((d)a1).m())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b(a2, flag);
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L4
_L4:
        b.info((new StringBuilder("add participant to the stage ")).append(a1).toString());
        f(a1);
        p.add(a1);
        return true;
    }

    static int b(CallView callview)
    {
        return callview.e;
    }

    private boolean b(com.skype.android.calling.a a1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = p.contains(a1);
        if (!flag1) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L2:
        boolean flag2 = false;
        if (q.contains(a1))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        b.info((new StringBuilder("add participant to the ribbon ")).append(a1).toString());
        q.add(a1);
        flag2 = true;
        flag1 = flag2;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (!(a1 instanceof d))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (a1.equals(r))
        {
            continue; /* Loop/switch isn't completed */
        }
        b.info((new StringBuilder("add participant to the activity monitor ")).append(a1).toString());
        r = a1;
        flag1 = true;
        if (true) goto _L4; else goto _L3
_L3:
        a1;
        throw a1;
    }

    private View c(com.skype.android.calling.a a1)
    {
        if (o != null && n == null || f == null || f.g())
        {
            return null;
        }
        if (!h.containsKey(a1))
        {
            View view = a(n.createParticipantTileView());
            if (view != null)
            {
                h.put(a1, view);
                o.bindTileView(view, a1.a());
            }
        }
        return (View)h.get(a1);
    }

    static void c(CallView callview)
    {
        callview.h();
    }

    private View d(com.skype.android.calling.a a1)
    {
        if (o == null || f == null || f.g())
        {
            return null;
        }
        if (!i.containsKey(a1))
        {
            View view = a(n.createParticipantDisplayName(a1.a()));
            if (view != null)
            {
                i.put(a1, view);
            }
        }
        return (View)i.get(a1);
    }

    static void d(CallView callview)
    {
        callview.g();
    }

    static boolean e(CallView callview)
    {
        return callview.j();
    }

    private boolean e(com.skype.android.calling.a a1)
    {
        boolean flag = p.remove(a1);
        if (flag)
        {
            b.info((new StringBuilder("remove participant from the stage ")).append(a1).toString());
            if (d())
            {
                a(a.a);
            }
        }
        return flag;
    }

    static void f(CallView callview)
    {
        if (callview.m != null)
        {
            callview.m.onUnhandledGesture();
        }
    }

    private boolean f()
    {
        return getResources().getConfiguration().orientation == 2;
    }

    private boolean f(com.skype.android.calling.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = q.contains(a1);
        if (flag) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        b.info((new StringBuilder("remove participant from the ribbon ")).append(a1).toString());
        q.remove(a1);
        if (a1.equals(r))
        {
            k();
        }
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        a1;
        throw a1;
    }

    static Set g(CallView callview)
    {
        return callview.p;
    }

    private void g()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        Object obj2;
        int i1;
        int l1;
        int k2;
        int i3;
        boolean flag;
        int i4;
        int j4;
        int k4;
        k2 = getResources().getDimensionPixelSize(com.skype.android.video.R.dimen.pip_size) * z;
        obj = new Rect();
        obj1 = a.getHorizontalSnap();
        obj2 = a.getVerticalSnap();
        if (obj1 == com.skype.android.video.ViewSnapper.HorizontalSnap.LEFT || obj1 == com.skype.android.video.ViewSnapper.HorizontalSnap.RIGHT)
        {
            w = ((com.skype.android.video.ViewSnapper.HorizontalSnap) (obj1));
        }
        if (obj2 == com.skype.android.video.ViewSnapper.VerticalSnap.TOP || obj2 == com.skype.android.video.ViewSnapper.VerticalSnap.BOTTOM)
        {
            x = ((com.skype.android.video.ViewSnapper.VerticalSnap) (obj2));
        }
        if (x == com.skype.android.video.ViewSnapper.VerticalSnap.TOP)
        {
            l1 = a.getCurrentPosition().top;
            i1 = l1 + k2;
        } else
        {
            i1 = a.getCurrentPosition().bottom;
            l1 = i1 - k2;
        }
        if (w == com.skype.android.video.ViewSnapper.HorizontalSnap.LEFT)
        {
            flag = true;
            k2 = a.getCurrentPosition().left;
            i3 = k2;
        } else
        {
            flag = false;
            i3 = a.getCurrentPosition().right;
            k2 = i3;
        }
        ((Rect) (obj)).set(k2, l1, i3, i1);
        obj1 = f.h();
        obj2 = ((c) (obj1)).a(getContext());
        if (obj2 == null || ((View) (obj2)).getParent() != this || p.contains(obj1)) goto _L4; else goto _L3
_L3:
        if (((c) (obj1)).h())
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((View) (obj2)).setVisibility(i1);
        ((View) (obj2)).getVisibility();
        JVM INSTR lookupswitch 2: default 256
    //                   0: 932
    //                   4: 905;
           goto _L5 _L6 _L7
_L5:
        if (k == null) goto _L9; else goto _L8
_L8:
        float f1;
        int k3;
        if (t && r != null && r.h())
        {
            k3 = 1;
        } else
        {
            k3 = 0;
        }
        if (r != null && k3 == 0 && p.size() > 0 && !f.g())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj1 = k;
        if (i1 != 0)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((View) (obj1)).setVisibility(i1);
        k4 = ((Rect) (obj)).height();
        l1 = 0;
        i1 = 0;
        i4 = ((Rect) (obj)).top;
        j4 = ((Rect) (obj)).bottom;
        k.getVisibility();
        JVM INSTR lookupswitch 2: default 404
    //                   0: 1226
    //                   4: 1212;
           goto _L10 _L11 _L12
_L10:
        if (r == null) goto _L9; else goto _L13
_L13:
        obj1 = r.a(getContext());
        i3 = i1;
        k2 = l1;
        if (obj1 == null) goto _L15; else goto _L14
_L14:
        i3 = i1;
        k2 = l1;
        if (((View) (obj1)).getParent() != this) goto _L15; else goto _L16
_L16:
        if (k3 != 0)
        {
            k2 = 0;
        } else
        {
            k2 = 4;
        }
        ((View) (obj1)).setVisibility(k2);
        ((View) (obj1)).getVisibility();
        JVM INSTR lookupswitch 2: default 496
    //                   0: 1410
    //                   4: 1399;
           goto _L17 _L18 _L19
_L17:
        k2 = l1;
        i3 = i1;
_L15:
        i1 = i3;
        l1 = k2;
_L24:
        a(r, l1, i4, i1, j4);
_L9:
        if (l == null) goto _L21; else goto _L20
_L20:
        l1 = ((Rect) (obj)).width();
        i1 = ((Rect) (obj)).height();
        l1 = android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x80000000);
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        l.measure(l1, i1);
        l.getVisibility();
        JVM INSTR lookupswitch 2: default 612
    //                   0: 1628
    //                   4: 1614;
           goto _L21 _L22 _L23
_L21:
        v.set(((Rect) (obj)));
        a.updateRectSize(v.width(), v.height());
        B.set(C);
        C.set(a.getCurrentPosition());
        if (D != null)
        {
            D.onLayoutChange(this, C.left, C.top, C.right, C.bottom, B.left, B.top, B.right, B.bottom);
        }
        obj = f.f().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            obj1 = (com.skype.android.calling.a)((Iterator) (obj)).next();
            if ((obj1 instanceof d) && !p.contains(obj1))
            {
                if (!obj1.equals(r))
                {
                    ((com.skype.android.calling.a) (obj1)).a(getContext()).setVisibility(8);
                    obj2 = d(((com.skype.android.calling.a) (obj1)));
                    if (obj2 != null)
                    {
                        ((View) (obj2)).setVisibility(8);
                    }
                }
                obj1 = c(((com.skype.android.calling.a) (obj1)));
                if (obj1 != null)
                {
                    ((View) (obj1)).setVisibility(8);
                }
            }
        }
          goto _L1
_L7:
        ((View) (obj2)).layout(0, 0, 0, 0);
        if (j != null)
        {
            j.setVisibility(4);
        }
          goto _L5
_L6:
        bringChildToFront(((View) (obj2)));
        k3 = (int)((float)((Rect) (obj)).height() * ((float)((c) (obj1)).e() / (float)((c) (obj1)).f()));
        k2 = ((Rect) (obj)).top;
        i3 = ((Rect) (obj)).bottom;
        if (flag)
        {
            l1 = ((Rect) (obj)).right;
            i1 = l1 + k3;
            ((Rect) (obj)).set(((Rect) (obj)).left, k2, i1, i3);
        } else
        {
            i1 = ((Rect) (obj)).left;
            l1 = i1 - k3;
            ((Rect) (obj)).set(l1, k2, ((Rect) (obj)).right, i3);
        }
        ((View) (obj2)).layout(l1, k2, i1, i3);
        if (j != null)
        {
            if (((c) (obj1)).j().containsAll(EnumSet.of(CameraFacing.a, CameraFacing.b)))
            {
                j.setVisibility(0);
                bringChildToFront(j);
                f1 = ((TextView)j).getTextSize();
                l1 = android.view.View.MeasureSpec.makeMeasureSpec((int)f1, 0x80000000);
                i3 = android.view.View.MeasureSpec.makeMeasureSpec((int)f1, 0x80000000);
                j.measure(l1, i3);
                j.layout(i1 - j.getMeasuredWidth(), k2, i1, j.getMeasuredHeight() + k2);
            } else
            {
                j.setVisibility(8);
            }
        }
          goto _L5
_L4:
        if (j != null)
        {
            j.setVisibility(8);
        }
          goto _L5
_L12:
        k.layout(0, 0, 0, 0);
          goto _L10
_L11:
        bringChildToFront(k);
        if (flag)
        {
            l1 = ((Rect) (obj)).right;
            i1 = l1 + k4;
            ((Rect) (obj)).set(((Rect) (obj)).left, i4, i1, j4);
        } else
        {
            i1 = ((Rect) (obj)).left;
            l1 = i1 - k4;
            ((Rect) (obj)).set(l1, i4, ((Rect) (obj)).right, j4);
        }
        k2 = android.view.View.MeasureSpec.makeMeasureSpec(k4, 0x40000000);
        i3 = android.view.View.MeasureSpec.makeMeasureSpec(k4, 0x40000000);
        b.info(String.format("ribbon left %d, top %d, right %d, bottom %d", new Object[] {
            Integer.valueOf(l1), Integer.valueOf(i4), Integer.valueOf(i1), Integer.valueOf(j4)
        }));
        k.measure(k2, i3);
        k.layout(l1, i4, i1, j4);
          goto _L10
_L19:
        ((View) (obj1)).layout(0, 0, 0, 0);
          goto _L24
_L18:
        int l3 = (int)((float)r.e() * ((float)k4 / (float)r.f()));
        int j1;
        int i2;
        if (flag)
        {
            i2 = ((Rect) (obj)).right;
            j1 = i2 + l3;
            ((Rect) (obj)).set(((Rect) (obj)).left, i4, j1, j4);
        } else
        {
            j1 = ((Rect) (obj)).left;
            i2 = j1 - l3;
            ((Rect) (obj)).set(i2, i4, ((Rect) (obj)).right, j4);
        }
        b.info(String.format("ribbon left %d, top %d, right %d, bottom %d", new Object[] {
            Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(j1), Integer.valueOf(j4)
        }));
        bringChildToFront(((View) (obj1)));
        ((View) (obj1)).layout(i2, i4, j1, j4);
        i3 = j1;
        k2 = i2;
        if (r instanceof d)
        {
            d d1 = (d)r;
            d1.b(l3, k4);
            d1.j();
            i3 = j1;
            k2 = i2;
        }
          goto _L15
_L23:
        l.layout(0, 0, 0, 0);
          goto _L21
_L22:
        int l2 = ((Rect) (obj)).top;
        int j3 = ((Rect) (obj)).bottom;
        int k1;
        int j2;
        if (flag)
        {
            j2 = ((Rect) (obj)).right;
            k1 = l.getMeasuredWidth() + j2;
            ((Rect) (obj)).set(((Rect) (obj)).left, l2, k1, j3);
        } else
        {
            k1 = ((Rect) (obj)).left;
            j2 = k1 - l.getMeasuredWidth();
            ((Rect) (obj)).set(j2, l2, ((Rect) (obj)).right, j3);
        }
        bringChildToFront(l);
        l.layout(j2, l2, k1, j3);
          goto _L21
    }

    static VideoCall h(CallView callview)
    {
        return callview.f;
    }

    private void h()
    {
        post(new Runnable() {

            final CallView a;

            public final void run()
            {
                a.requestLayout();
            }

            
            {
                a = CallView.this;
                super();
            }
        });
    }

    static Set i(CallView callview)
    {
        return callview.q;
    }

    private void i()
    {
        post(new Runnable() {

            final CallView a;

            public final void run()
            {
                if (CallView.j(a) != null)
                {
                    CallView.j(a).onDisplayedVideoCountChanged(CallView.g(a).size());
                    CallView.j(a).onMinimizedParticipantCountChanged(CallView.k(a));
                }
            }

            
            {
                a = CallView.this;
                super();
            }
        });
    }

    static CallViewAdapter j(CallView callview)
    {
        return callview.o;
    }

    private boolean j()
    {
        return u == 0;
    }

    static int k(CallView callview)
    {
        int i1 = 0;
        if (callview.f == null || callview.r == null)
        {
            return 0;
        }
        int j1 = callview.q.size();
        if (callview.q.contains(callview.f.h()))
        {
            i1 = 1;
        }
        return j1 - i1 - 1;
    }

    private void k()
    {
        com.skype.android.calling.a a2 = null;
        com.skype.android.calling.a a3 = null;
        Iterator iterator = q.iterator();
        do
        {
label0:
            {
                com.skype.android.calling.a a1 = a2;
                if (iterator.hasNext())
                {
                    a1 = (com.skype.android.calling.a)iterator.next();
                    if (!(a1 instanceof d))
                    {
                        continue;
                    }
                    if (!((d)a1).m() || !a1.h())
                    {
                        break label0;
                    }
                }
                if (a1 != null)
                {
                    r = a1;
                } else
                {
                    r = a3;
                }
                b.info((new StringBuilder("participant on the activity monitor ")).append(r).toString());
                post(new Runnable() {

                    final CallView a;

                    public final void run()
                    {
                        if (CallView.l(a) != null && CallView.j(a) != null)
                        {
                            CallView.j(a).bindTileView(CallView.m(a), CallView.l(a).a());
                        }
                    }

            
            {
                a = CallView.this;
                super();
            }
                });
                return;
            }
            if (((d)a1).m() || a1.h())
            {
                a2 = a1;
            } else
            if (a3 != null && a1.g() > a3.g())
            {
                a3 = a1;
            } else
            if (a3 == null)
            {
                a3 = a1;
            }
        } while (true);
    }

    static com.skype.android.calling.a l(CallView callview)
    {
        return callview.r;
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = f;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        boolean flag = false;
        obj = f.f().iterator();
_L12:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        com.skype.android.calling.a a1 = (com.skype.android.calling.a)((Iterator) (obj)).next();
        if (!(a1 instanceof d)) goto _L6; else goto _L5
_L5:
        if (!((d)a1).q()) goto _L8; else goto _L7
_L7:
        if (!j()) goto _L10; else goto _L9
_L9:
        boolean flag2 = b(a1, true);
          goto _L11
_L10:
        flag2 = a(a1, true);
          goto _L11
_L8:
        if (!a1.h())
        {
            break MISSING_BLOCK_LABEL_157;
        }
        flag2 = a(a1, false);
label0:
        {
            if (!flag2)
            {
                break label0;
            }
            flag |= flag2;
        }
          goto _L12
        Exception exception;
        boolean flag1;
        if (j() || ((d)a1).m())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag |= b(a1, flag2);
          goto _L12
label1:
        {
            if (!((d)a1).n())
            {
                break label1;
            }
            flag = flag | e(a1) | b(a1, ((d)a1).m());
        }
          goto _L12
        if ((a1 instanceof d) && ((d)a1).p() > 5)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1) goto _L12; else goto _L13
_L13:
        flag1 = flag | e(a1);
_L15:
        flag = flag1 | f(a1);
          goto _L12
_L6:
        flag1 = flag;
        if (!a1.h()) goto _L15; else goto _L14
_L14:
        flag |= b(a1, false);
          goto _L12
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        h();
        i();
        postDelayed(new Runnable() {

            final CallView a;

            public final void run()
            {
                CallView.n(a);
            }

            
            {
                a = CallView.this;
                super();
            }
        }, 1000L);
          goto _L1
        exception;
        throw exception;
_L11:
        if (!flag2) goto _L12; else goto _L16
_L16:
        flag |= true;
          goto _L12
    }

    static View m(CallView callview)
    {
        return callview.k;
    }

    private com.skype.android.calling.a m()
    {
        if (p.isEmpty())
        {
            return null;
        }
        com.skype.android.calling.a a1 = null;
        Iterator iterator = p.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.skype.android.calling.a a2 = (com.skype.android.calling.a)iterator.next();
            if (a1 == null || a2.g() < a1.g())
            {
                a1 = a2;
            }
        } while (true);
        p.remove(a1);
        return a1;
    }

    static void n(CallView callview)
    {
        callview.l();
    }

    public final int a()
    {
        return v.width();
    }

    public final void a(Rect rect)
    {
        rect.set(C);
    }

    public final void a(VideoCall videocall)
    {
        f = videocall;
        if (f != null)
        {
            f.a(this);
            videocall = f.f().iterator();
            do
            {
                if (!videocall.hasNext())
                {
                    break;
                }
                com.skype.android.calling.a a1 = (com.skype.android.calling.a)videocall.next();
                if (a1 instanceof d)
                {
                    c(a1);
                    d(a1);
                }
                View view = a1.a(getContext());
                android.view.ViewParent viewparent = view.getParent();
                if (viewparent != this)
                {
                    b.info((new StringBuilder()).append(a1).append(" attach view ").append(view.getClass().getName()).toString());
                    if (viewparent instanceof ViewGroup)
                    {
                        ((ViewGroup)viewparent).removeView(view);
                    }
                    addView(view);
                    view.setTag(a1);
                    view.setOnTouchListener(this);
                }
            } while (true);
            l();
        }
    }

    public final void a(com.skype.android.calling.a a1)
    {
        if (o != null && f != null)
        {
            View view = c(a1);
            if (view != null)
            {
                o.onParticipantTileViewStatusChanged(a1.a(), view);
            }
            if (a1.equals(r) && k != null)
            {
                o.onParticipantTileViewStatusChanged(a1.a(), k);
            }
            h();
        }
    }

    public final void a(String s1, com.skype.Video.STATUS status)
    {
        if (o != null)
        {
            o.onVideoDisplayChanged(s1, status);
        }
        if (j())
        {
            g();
        }
    }

    public final void a(boolean flag)
    {
        y = flag;
        if (y)
        {
            for (Iterator iterator = i.values().iterator(); iterator.hasNext(); ((View)iterator.next()).setVisibility(8)) { }
        }
    }

    public final void b()
    {
        if (z == 1)
        {
            z = 2;
        } else
        {
            z = 1;
        }
        g();
    }

    public final boolean b(com.skype.android.calling.a a1)
    {
        b.info((new StringBuilder("toggleFullScreen ")).append(a1).append(" ").append(s).toString());
        boolean flag;
        if (s == a.a || !p.contains(a1))
        {
            boolean flag1 = a(a1, true);
            flag = flag1;
            if (flag1)
            {
                h();
                i();
                flag = flag1;
            }
        } else
        {
            boolean flag2 = e(a1);
            flag = flag2;
            if (flag2)
            {
                l();
                return flag2;
            }
        }
        return flag;
    }

    public final void c()
    {
        if (f != null)
        {
            g.clear();
            h.clear();
            com.skype.android.calling.a a1;
            for (Iterator iterator = f.f().iterator(); iterator.hasNext(); a1.d())
            {
                a1 = (com.skype.android.calling.a)iterator.next();
                getContext();
            }

            removeAllViews();
            f.a(null);
            f = null;
            v = new Rect(0, 0, 0, 0);
        }
    }

    public final boolean d()
    {
        return s == a.b;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        a.onTouchEvent(motionevent);
        return super.dispatchTouchEvent(motionevent);
    }

    public final boolean e()
    {
        if (!d())
        {
            return false;
        }
        Object obj = p.iterator();
        if (((Iterator) (obj)).hasNext())
        {
            obj = (com.skype.android.calling.a)((Iterator) (obj)).next();
        } else
        {
            obj = null;
        }
        return obj != null && b(((com.skype.android.calling.a) (obj)));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ControlUnit.registerStateListener(this);
        if (d.canDetectOrientation())
        {
            d.enable();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ControlUnit.unregisterStateListener(this);
        if (d.canDetectOrientation())
        {
            d.disable();
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        float f1;
        float f2;
        float f3;
        com.skype.android.calling.a a1;
        View view;
        View view1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        if (f == null)
        {
            return;
        }
        f.h().k();
        i2 = getMeasuredWidth();
        k2 = getMeasuredHeight();
        j2 = 0;
        l2 = p.size();
        Iterator iterator;
        if (f())
        {
            f1 = (float)i2 / (float)l2;
        } else
        {
            f1 = i2;
        }
        if (!f())
        {
            f2 = (float)k2 / (float)l2;
        } else
        {
            f2 = k2;
        }
        iterator = p.iterator();
_L12:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_808;
        }
        a1 = (com.skype.android.calling.a)iterator.next();
        if (f())
        {
            f3 = (float)j2 * f1;
        } else
        {
            f3 = 0.0F;
        }
        j3 = (int)f3;
        if (!f())
        {
            f3 = (float)j2 * f2;
        } else
        {
            f3 = 0.0F;
        }
        k3 = (int)f3;
        l3 = j3 + (int)f1;
        i4 = k3 + (int)f2;
        view = a1.a(getContext());
        if (a1.h())
        {
            i2 = 0;
        } else
        {
            i2 = 4;
        }
        view.setVisibility(i2);
        view1 = c(a1);
        i2 = j2;
        if (view1 == null) goto _L2; else goto _L1
_L1:
        if (a1.h())
        {
            i2 = 4;
        } else
        {
            i2 = 0;
        }
        view1.setVisibility(i2);
        view1.getVisibility();
        JVM INSTR lookupswitch 2: default 268
    //                   0: 425
    //                   4: 409;
           goto _L3 _L4 _L5
_L3:
        i2 = j2;
_L2:
        i3 = j3;
        l2 = k3;
        k2 = l3;
        j4 = i4;
        j2 = i2;
        if (view.getParent() != this) goto _L7; else goto _L6
_L6:
        view.getVisibility();
        JVM INSTR lookupswitch 2: default 332
    //                   0: 502
    //                   4: 470;
           goto _L8 _L9 _L10
_L9:
        break MISSING_BLOCK_LABEL_502;
_L8:
        j2 = i2;
        j4 = i4;
        k2 = l3;
        l2 = k3;
        i3 = j3;
_L7:
        a(a1, i3, l2, k2, j4);
        continue; /* Loop/switch isn't completed */
_L5:
        view1.layout(0, 0, 0, 0);
        i2 = j2;
          goto _L2
_L4:
        view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)f1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec((int)f2, 0x40000000));
        view1.layout(j3, k3, l3, i4);
        i2 = j2 + 1;
          goto _L2
_L10:
        view.layout(0, 0, 0, 0);
        i3 = j3;
        l2 = k3;
        k2 = l3;
        j4 = i4;
        j2 = i2;
          goto _L7
        j2 = a1.e();
        k2 = a1.f();
        b.info(String.format("onLayout index %d | width %d, height %d, l %d, t %d, r %d, b %d", new Object[] {
            Integer.valueOf(i2), Integer.valueOf(j2), Integer.valueOf(k2), Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1), Integer.valueOf(l1)
        }));
        i3 = j3;
        l2 = k3;
        k2 = l3;
        j2 = i4;
        if (a1 instanceof c)
        {
            i3 = j3;
            l2 = k3;
            k2 = l3;
            j2 = i4;
            if (((c)a1).a(j3, k3, l3, i4, A))
            {
                i3 = A.left;
                k2 = A.right;
                l2 = A.top;
                j2 = A.bottom;
            }
        }
        view.layout(i3, l2, k2, j2);
        b.info(String.format("onLayout index %d | left %d, top %d, right %d, bottom %d", new Object[] {
            Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(l2), Integer.valueOf(k2), Integer.valueOf(j2)
        }));
        if (a1 instanceof d)
        {
            d d1 = (d)a1;
            d1.b((int)f1, (int)f2);
            d1.j();
        }
        i2++;
        j4 = j2;
        j2 = i2;
          goto _L7
        g();
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected void onMeasure(int i1, int j1)
    {
        i1 = android.view.View.MeasureSpec.getSize(i1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        if (f != null)
        {
            f.h().k();
        }
        setMeasuredDimension(i1, j1);
    }

    public void onStateChanged(int i1, int j1, int k1)
    {
        b.info((new StringBuilder("onStateChanged what:")).append(i1).append(" arg1:").append(j1).append(" arg2:").append(k1).toString());
        if (f == null)
        {
            return;
        }
        if (i1 == 272)
        {
            f.h().a(j1, k1);
        }
        h();
        postInvalidate();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (f != null)
        {
            GestureDetector gesturedetector1 = (GestureDetector)g.get(view);
            GestureDetector gesturedetector = gesturedetector1;
            if (gesturedetector1 == null)
            {
                com.skype.android.calling.a a1 = (com.skype.android.calling.a)view.getTag();
                gesturedetector = gesturedetector1;
                if (a1 != null)
                {
                    gesturedetector = new GestureDetector(getContext(), new android.view.GestureDetector.SimpleOnGestureListener(a1) {

                        final com.skype.android.calling.a a;
                        final CallView b;

                        public final boolean onDoubleTap(MotionEvent motionevent1)
                        {
                            if (!CallView.e(b)) goto _L2; else goto _L1
_L1:
                            CallView.f(b);
_L4:
                            return true;
_L2:
                            if (CallView.g(b).contains(a) && CallView.h(b).g())
                            {
                                a.i();
                                if (a instanceof c)
                                {
                                    b.requestLayout();
                                }
                            } else
                            {
                                b.b(a);
                            }
                            if (true) goto _L4; else goto _L3
_L3:
                        }

                        public final boolean onDown(MotionEvent motionevent1)
                        {
                            return true;
                        }

                        public final boolean onSingleTapConfirmed(MotionEvent motionevent1)
                        {
                            if (CallView.i(b).contains(a))
                            {
                                b.b();
                            } else
                            {
                                CallView.f(b);
                            }
                            return true;
                        }

            
            {
                b = CallView.this;
                a = a1;
                super();
            }
                    });
                    g.put(view, gesturedetector);
                }
            }
            if (gesturedetector != null)
            {
                gesturedetector.onTouchEvent(motionevent);
                return true;
            }
        }
        return false;
    }

    public void setAdapter(CallViewAdapter callviewadapter)
    {
        o = callviewadapter;
    }

    public void setFactory(CallViewElementFactory callviewelementfactory)
    {
        n = callviewelementfactory;
        k = a(callviewelementfactory.createTileView());
        l = a(callviewelementfactory.createParticipantPlusView());
    }

    public void setMaxVideosOnStage(int i1)
    {
        u = i1;
    }

    public void setOverlayBounds(Rect rect)
    {
        a.setBounds(rect);
        h();
    }

    public void setRibbonLayoutListener(android.view.View.OnLayoutChangeListener onlayoutchangelistener)
    {
        D = onlayoutchangelistener;
    }

    public void setRibbonSnapping(com.skype.android.video.ViewSnapper.HorizontalSnap horizontalsnap, com.skype.android.video.ViewSnapper.VerticalSnap verticalsnap)
    {
        w = horizontalsnap;
        x = verticalsnap;
        a.snapTo(w, x);
    }

    public void setShowVideoOnRibbon(boolean flag)
    {
        t = flag;
    }

    public void setUnhandledGestureListener(UnhandledGestureListener unhandledgesturelistener)
    {
        m = unhandledgesturelistener;
    }

    public void setViewSnapperListener(com.skype.android.video.ViewSnapper.ViewSnapperListener viewsnapperlistener)
    {
        a.addViewSnapperListener(viewsnapperlistener);
    }

    static 
    {
        b = VideoCall.a;
    }
}
