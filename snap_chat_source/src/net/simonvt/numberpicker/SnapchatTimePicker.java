// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import agw;
import agx;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

public class SnapchatTimePicker extends LinearLayout
{
    final class a extends AccessibilityNodeProvider
    {

        private final Rect a = new Rect();
        private final int b[] = new int[2];
        private int c;
        private SnapchatTimePicker d;

        private AccessibilityNodeInfo a(int i1, String s1, int j1, int k1, int l1, int i2)
        {
            AccessibilityNodeInfo accessibilitynodeinfo = AccessibilityNodeInfo.obtain();
            accessibilitynodeinfo.setClassName(android/widget/Button.getName());
            accessibilitynodeinfo.setPackageName(d.getContext().getPackageName());
            accessibilitynodeinfo.setSource(d, i1);
            accessibilitynodeinfo.setParent(d);
            accessibilitynodeinfo.setText(s1);
            accessibilitynodeinfo.setClickable(true);
            accessibilitynodeinfo.setLongClickable(true);
            accessibilitynodeinfo.setEnabled(d.isEnabled());
            s1 = a;
            s1.set(j1, k1, l1, i2);
            accessibilitynodeinfo.setBoundsInParent(s1);
            int ai[] = b;
            d.getLocationOnScreen(ai);
            s1.offset(ai[0], ai[1]);
            accessibilitynodeinfo.setBoundsInScreen(s1);
            if (c != i1)
            {
                accessibilitynodeinfo.addAction(64);
            }
            if (c == i1)
            {
                accessibilitynodeinfo.addAction(128);
            }
            if (d.isEnabled())
            {
                accessibilitynodeinfo.addAction(16);
            }
            return accessibilitynodeinfo;
        }

        private void a(int i1, int j1, String s1)
        {
            if (((AccessibilityManager)d.getContext().getSystemService("accessibility")).isEnabled())
            {
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(j1);
                accessibilityevent.setClassName(android/widget/Button.getName());
                accessibilityevent.setPackageName(d.getContext().getPackageName());
                accessibilityevent.getText().add(s1);
                accessibilityevent.setEnabled(d.isEnabled());
                accessibilityevent.setSource(d, i1);
                d.requestSendAccessibilityEvent(d, accessibilityevent);
            }
        }

        private void a(String s1, int i1, List list)
        {
            i1;
            JVM INSTR tableswitch 1 3: default 28
        //                       1 171
        //                       2 71
        //                       3 29;
               goto _L1 _L2 _L3 _L4
_L1:
            Object obj;
            return;
_L4:
            if (!TextUtils.isEmpty(((CharSequence) (obj = c()))) && ((String) (obj)).toString().toLowerCase().contains(s1))
            {
                list.add(createAccessibilityNodeInfo(3));
                return;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            obj = SnapchatTimePicker.a(d).getText();
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && ((CharSequence) (obj)).toString().toLowerCase().contains(s1))
            {
                list.add(createAccessibilityNodeInfo(2));
                return;
            }
            obj = SnapchatTimePicker.a(d).getText();
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && ((CharSequence) (obj)).toString().toLowerCase().contains(s1))
            {
                list.add(createAccessibilityNodeInfo(2));
                return;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (!TextUtils.isEmpty(((CharSequence) (obj = d()))) && ((String) (obj)).toString().toLowerCase().contains(s1))
            {
                list.add(createAccessibilityNodeInfo(1));
                return;
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        private boolean a()
        {
            return d.d || d.c > d.a;
        }

        private boolean b()
        {
            return d.d || d.c < d.b;
        }

        private String c()
        {
            int j1 = SnapchatTimePicker.j(d) - 1;
            int i1 = j1;
            if (SnapchatTimePicker.k(d))
            {
                i1 = SnapchatTimePicker.a(d, j1);
            }
            if (i1 >= SnapchatTimePicker.l(d))
            {
                if (SnapchatTimePicker.m(d) == null)
                {
                    return SnapchatTimePicker.b(d, i1);
                } else
                {
                    return SnapchatTimePicker.m(d)[i1 - SnapchatTimePicker.l(d)];
                }
            } else
            {
                return null;
            }
        }

        private String d()
        {
            int j1 = SnapchatTimePicker.j(d) + 1;
            int i1 = j1;
            if (SnapchatTimePicker.k(d))
            {
                i1 = SnapchatTimePicker.a(d, j1);
            }
            if (i1 <= SnapchatTimePicker.n(d))
            {
                if (SnapchatTimePicker.m(d) == null)
                {
                    return SnapchatTimePicker.b(d, i1);
                } else
                {
                    return SnapchatTimePicker.m(d)[i1 - SnapchatTimePicker.l(d)];
                }
            } else
            {
                return null;
            }
        }

        public final void a(int i1, int j1)
        {
            i1;
            JVM INSTR tableswitch 1 3: default 28
        //                       1 118
        //                       2 47
        //                       3 29;
               goto _L1 _L2 _L3 _L4
_L1:
            return;
_L4:
            if (a())
            {
                a(i1, j1, c());
                return;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (((AccessibilityManager)d.getContext().getSystemService("accessibility")).isEnabled())
            {
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(j1);
                SnapchatTimePicker.a(d).onInitializeAccessibilityEvent(accessibilityevent);
                SnapchatTimePicker.a(d).onPopulateAccessibilityEvent(accessibilityevent);
                accessibilityevent.setSource(d, 2);
                d.requestSendAccessibilityEvent(d, accessibilityevent);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (b())
            {
                a(i1, j1, d());
                return;
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i1)
        {
            i1;
            JVM INSTR tableswitch -1 3: default 36
        //                       -1 44
        //                       0 36
        //                       1 462
        //                       2 409
        //                       3 323;
               goto _L1 _L2 _L1 _L3 _L4 _L5
_L1:
            Object obj = super.createAccessibilityNodeInfo(i1);
_L7:
            return ((AccessibilityNodeInfo) (obj));
_L2:
            d.getScrollX();
            d.getScrollY();
            d.getScrollX();
            d.getRight();
            d.getLeft();
            d.getScrollY();
            d.getBottom();
            d.getTop();
            obj = AccessibilityNodeInfo.obtain();
            ((AccessibilityNodeInfo) (obj)).setClassName(net/simonvt/numberpicker/SnapchatTimePicker.getName());
            ((AccessibilityNodeInfo) (obj)).setPackageName(d.getContext().getPackageName());
            ((AccessibilityNodeInfo) (obj)).setSource(d);
            if (a())
            {
                ((AccessibilityNodeInfo) (obj)).addChild(d, 3);
            }
            ((AccessibilityNodeInfo) (obj)).addChild(d, 2);
            if (b())
            {
                ((AccessibilityNodeInfo) (obj)).addChild(d, 1);
            }
            ((AccessibilityNodeInfo) (obj)).setParent((View)d.getParentForAccessibility());
            ((AccessibilityNodeInfo) (obj)).setEnabled(d.isEnabled());
            ((AccessibilityNodeInfo) (obj)).setScrollable(true);
            if (c != -1)
            {
                ((AccessibilityNodeInfo) (obj)).addAction(64);
            }
            if (c == -1)
            {
                ((AccessibilityNodeInfo) (obj)).addAction(128);
            }
            if (d.isEnabled())
            {
                if (d.d || d.c < d.b)
                {
                    ((AccessibilityNodeInfo) (obj)).addAction(4096);
                }
                if (d.d || d.c > d.a)
                {
                    ((AccessibilityNodeInfo) (obj)).addAction(8192);
                }
            }
            return ((AccessibilityNodeInfo) (obj));
_L5:
            obj = c();
            i1 = d.getScrollX();
            int j1 = d.getScrollY();
            int k1 = d.getScrollX();
            int l1 = d.getRight();
            int i2 = d.getLeft();
            int j2 = SnapchatTimePicker.e(d);
            return a(3, ((String) (obj)), i1, j1, (l1 - i2) + k1, SnapchatTimePicker.i(d) + j2);
_L4:
            AccessibilityNodeInfo accessibilitynodeinfo;
            accessibilitynodeinfo = SnapchatTimePicker.a(d).createAccessibilityNodeInfo();
            accessibilitynodeinfo.setSource(d, 2);
            if (c != 2)
            {
                accessibilitynodeinfo.addAction(64);
            }
            obj = accessibilitynodeinfo;
            if (c != 2) goto _L7; else goto _L6
_L6:
            accessibilitynodeinfo.addAction(128);
            return accessibilitynodeinfo;
_L3:
            return a(1, d(), d.getScrollX(), SnapchatTimePicker.c(d) - SnapchatTimePicker.i(d), d.getScrollX() + (d.getRight() - d.getLeft()), d.getScrollY() + (d.getBottom() - d.getTop()));
        }

        public final List findAccessibilityNodeInfosByText(String s1, int i1)
        {
            if (TextUtils.isEmpty(s1))
            {
                return Collections.emptyList();
            }
            String s2 = s1.toLowerCase();
            ArrayList arraylist = new ArrayList();
            switch (i1)
            {
            case 0: // '\0'
            default:
                return super.findAccessibilityNodeInfosByText(s1, i1);

            case -1: 
                a(s2, 3, arraylist);
                a(s2, 2, arraylist);
                a(s2, 1, arraylist);
                return arraylist;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                a(s2, i1, arraylist);
                break;
            }
            return arraylist;
        }

        public final boolean performAction(int i1, int j1, Bundle bundle)
        {
            boolean flag1;
            boolean flag2;
            flag2 = false;
            flag1 = false;
            i1;
            JVM INSTR tableswitch -1 3: default 40
        //                       -1 52
        //                       0 40
        //                       1 513
        //                       2 271
        //                       3 693;
               goto _L1 _L2 _L1 _L3 _L4 _L5
_L1:
            boolean flag = super.performAction(i1, j1, bundle);
_L10:
            return flag;
_L2:
            j1;
            JVM INSTR lookupswitch 4: default 96
        //                       64: 99
        //                       128: 129
        //                       4096: 161
        //                       8192: 216;
               goto _L1 _L6 _L7 _L8 _L9
_L6:
            flag = flag1;
            if (c != i1)
            {
                c = i1;
                d.performAccessibilityAction(64, null);
                return true;
            }
              goto _L10
_L7:
            flag = flag1;
            if (c == i1)
            {
                c = 0x80000000;
                d.performAccessibilityAction(128, null);
                return true;
            }
              goto _L10
_L8:
            flag = flag1;
            if (!d.isEnabled()) goto _L10; else goto _L11
_L11:
            if (d.d)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (d.c >= d.b) goto _L10; else goto _L12
_L12:
            SnapchatTimePicker.a(d, true);
            return true;
_L9:
            flag = flag1;
            if (!d.isEnabled()) goto _L10; else goto _L13
_L13:
            if (d.d)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (d.c <= d.a) goto _L10; else goto _L14
_L14:
            SnapchatTimePicker.a(d, false);
            return true;
_L4:
            switch (j1)
            {
            default:
                return SnapchatTimePicker.a(d).performAccessibilityAction(j1, bundle);

            case 1: // '\001'
                flag = flag1;
                if (d.isEnabled())
                {
                    flag = flag1;
                    if (!SnapchatTimePicker.a(d).isFocused())
                    {
                        return SnapchatTimePicker.a(d).requestFocus();
                    }
                }
                break;

            case 2: // '\002'
                flag = flag1;
                if (d.isEnabled())
                {
                    flag = flag1;
                    if (SnapchatTimePicker.a(d).isFocused())
                    {
                        SnapchatTimePicker.a(d).clearFocus();
                        return true;
                    }
                }
                break;

            case 16: // '\020'
                flag = flag1;
                if (d.isEnabled())
                {
                    return true;
                }
                break;

            case 64: // '@'
                flag = flag1;
                if (c != i1)
                {
                    c = i1;
                    a(i1, 32768);
                    SnapchatTimePicker.a(d).invalidate();
                    return true;
                }
                break;

            case 128: 
                flag = flag1;
                if (c == i1)
                {
                    c = 0x80000000;
                    a(i1, 0x10000);
                    SnapchatTimePicker.a(d).invalidate();
                    return true;
                }
                break;
            }
            if (true) goto _L10; else goto _L15
_L15:
_L3:
            switch (j1)
            {
            default:
                return false;

            case 16: // '\020'
                flag = flag1;
                if (d.isEnabled())
                {
                    SnapchatTimePicker.a(d, true);
                    a(i1, 1);
                    return true;
                }
                break;

            case 64: // '@'
                flag = flag1;
                if (c != i1)
                {
                    c = i1;
                    a(i1, 32768);
                    d.invalidate(0, SnapchatTimePicker.c(d), d.getRight(), d.getBottom());
                    return true;
                }
                break;

            case 128: 
                flag = flag1;
                if (c == i1)
                {
                    c = 0x80000000;
                    a(i1, 0x10000);
                    d.invalidate(0, SnapchatTimePicker.c(d), d.getRight(), d.getBottom());
                    return true;
                }
                break;
            }
            if (true) goto _L10; else goto _L16
_L16:
_L5:
            switch (j1)
            {
            default:
                return false;

            case 16: // '\020'
                flag = flag1;
                if (d.isEnabled())
                {
                    flag = flag2;
                    if (i1 == 1)
                    {
                        flag = true;
                    }
                    SnapchatTimePicker.a(d, flag);
                    a(i1, 1);
                    return true;
                }
                break;

            case 64: // '@'
                flag = flag1;
                if (c != i1)
                {
                    c = i1;
                    a(i1, 32768);
                    d.invalidate(0, 0, d.getRight(), SnapchatTimePicker.e(d));
                    return true;
                }
                break;

            case 128: 
                flag = flag1;
                if (c == i1)
                {
                    c = 0x80000000;
                    a(i1, 0x10000);
                    d.invalidate(0, 0, d.getRight(), SnapchatTimePicker.e(d));
                    return true;
                }
                break;
            }
            if (true) goto _L10; else goto _L17
_L17:
        }

        a()
        {
            d = SnapchatTimePicker.this;
            super();
            c = 0x80000000;
        }
    }

    final class b
        implements Runnable
    {

        private boolean a;
        private SnapchatTimePicker b;

        static void a(b b1, boolean flag)
        {
            b1.a = flag;
        }

        public final void run()
        {
            SnapchatTimePicker.a(b, a);
            b.postDelayed(this, SnapchatTimePicker.h(b));
        }

        b()
        {
            b = SnapchatTimePicker.this;
            super();
        }
    }

    public static interface c
    {

        public abstract String a(int i1);
    }

    public static interface d
    {
    }

    public static interface e
    {

        public abstract void a();
    }

    public static interface f
    {
    }

    final class g
        implements Runnable
    {

        private int a;
        private int b;
        private SnapchatTimePicker c;

        public final void a()
        {
            b = 0;
            a = 0;
            c.removeCallbacks(this);
            if (SnapchatTimePicker.b(c))
            {
                SnapchatTimePicker.c(c, false);
                c.invalidate(0, SnapchatTimePicker.c(c), c.getRight(), c.getBottom());
            }
            SnapchatTimePicker.d(c, false);
            if (SnapchatTimePicker.d(c))
            {
                c.invalidate(0, 0, c.getRight(), SnapchatTimePicker.e(c));
            }
        }

        public final void a(int i1)
        {
            a();
            b = 1;
            a = i1;
            c.postDelayed(this, ViewConfiguration.getTapTimeout());
        }

        public final void b(int i1)
        {
            a();
            b = 2;
            a = i1;
            c.post(this);
        }

        public final void run()
        {
            switch (b)
            {
            default:
                return;

            case 1: // '\001'
                switch (a)
                {
                default:
                    return;

                case 1: // '\001'
                    SnapchatTimePicker.c(c, true);
                    c.invalidate(0, SnapchatTimePicker.c(c), c.getRight(), c.getBottom());
                    return;

                case 2: // '\002'
                    SnapchatTimePicker.d(c, true);
                    break;
                }
                c.invalidate(0, 0, c.getRight(), SnapchatTimePicker.e(c));
                return;

            case 2: // '\002'
                switch (a)
                {
                default:
                    return;

                case 1: // '\001'
                    if (!SnapchatTimePicker.b(c))
                    {
                        c.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                    }
                    SnapchatTimePicker.f(c);
                    c.invalidate(0, SnapchatTimePicker.c(c), c.getRight(), c.getBottom());
                    return;

                case 2: // '\002'
                    break;
                }
                break;
            }
            if (!SnapchatTimePicker.d(c))
            {
                c.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            SnapchatTimePicker.g(c);
            c.invalidate(0, 0, c.getRight(), SnapchatTimePicker.e(c));
        }

        g()
        {
            c = SnapchatTimePicker.this;
            super();
        }
    }

    final class h
    {

        a a;

        public final void a(int i1, int j1)
        {
            if (a != null)
            {
                a.a(i1, j1);
            }
        }

        public final boolean a(int i1)
        {
            if (a != null)
            {
                return a.performAction(i1, 64, null);
            } else
            {
                return false;
            }
        }

        private h()
        {
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                a = new a();
            }
        }

        h(byte byte0)
        {
            this();
        }
    }

    static final class i
        implements c
    {

        private StringBuilder a;
        private char b;
        private Formatter c;
        private Object d[];

        private void a(Locale locale)
        {
            c = new Formatter(a, locale);
            b = b(locale);
        }

        private static char b(Locale locale)
        {
            return (new DecimalFormatSymbols(locale)).getZeroDigit();
        }

        public final String a(int i1)
        {
            Locale locale = Locale.getDefault();
            if (b != b(locale))
            {
                a(locale);
            }
            d[0] = Integer.valueOf(i1);
            a.delete(0, a.length());
            c.format("%02d", d);
            return c.toString();
        }

        i()
        {
            a = new StringBuilder();
            d = new Object[1];
            a(Locale.getDefault());
        }
    }


    private int A;
    private final agw B;
    private final agw C;
    private int D;
    private b E;
    private float F;
    private float G;
    private VelocityTracker H;
    private int I;
    private int J;
    private int K;
    private final int L;
    private final boolean M;
    private final Drawable N;
    private final int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private h V;
    private final g W;
    int a;
    private int aa;
    private e ab;
    int b;
    public int c;
    boolean d;
    private final ImageButton e;
    private final ImageButton f;
    private final TextView g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private int l;
    private final boolean m;
    private final int n;
    private int o;
    private String p[];
    private boolean q;
    private c r;
    private long s;
    private final SparseArray t;
    private final int u[];
    private final Paint v;
    private final Paint w;
    private final Paint x;
    private int y;
    private int z;

    public SnapchatTimePicker(Context context)
    {
        this(context, null);
    }

    public SnapchatTimePicker(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, agv.a.snapchatTimePickerStyle);
    }

    public SnapchatTimePicker(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        q = false;
        s = 300L;
        t = new SparseArray();
        u = new int[3];
        z = 0x80000000;
        P = 0;
        aa = -1;
        attributeset = context.obtainStyledAttributes(attributeset, agv.c.SnapchatTimePicker, i1, 0);
        i1 = attributeset.getResourceId(8, 0);
        boolean flag;
        if (i1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        M = flag;
        L = attributeset.getColor(0, 0);
        N = attributeset.getDrawable(1);
        O = attributeset.getDimensionPixelSize(2, (int)TypedValue.applyDimension(1, 2.0F, getResources().getDisplayMetrics()));
        h = attributeset.getDimensionPixelSize(3, (int)TypedValue.applyDimension(1, 48F, getResources().getDisplayMetrics()));
        i = attributeset.getDimensionPixelSize(4, -1);
        j = attributeset.getDimensionPixelSize(5, -1);
        if (i != -1 && j != -1 && i > j)
        {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        k = attributeset.getDimensionPixelSize(6, -1);
        l = attributeset.getDimensionPixelSize(7, -1);
        if (k != -1 && l != -1 && k > l)
        {
            throw new IllegalArgumentException("minWidth > maxWidth");
        }
        android.view.View.OnLongClickListener onlongclicklistener;
        if (l == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = flag;
        attributeset.recycle();
        W = new g();
        if (!M)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(i1, this, true);
        attributeset = new android.view.View.OnClickListener() {

            private SnapchatTimePicker a;

            public final void onClick(View view)
            {
                SnapchatTimePicker.a(a).clearFocus();
                if (view.getId() == agv.b.np__increment)
                {
                    SnapchatTimePicker.a(a, true);
                    return;
                } else
                {
                    SnapchatTimePicker.a(a, false);
                    return;
                }
            }

            
            {
                a = SnapchatTimePicker.this;
                super();
            }
        };
        onlongclicklistener = new android.view.View.OnLongClickListener() {

            private SnapchatTimePicker a;

            public final boolean onLongClick(View view)
            {
                SnapchatTimePicker.a(a).clearFocus();
                if (view.getId() == agv.b.np__increment)
                {
                    SnapchatTimePicker.b(a, true);
                    return true;
                } else
                {
                    SnapchatTimePicker.b(a, false);
                    return true;
                }
            }

            
            {
                a = SnapchatTimePicker.this;
                super();
            }
        };
        if (!M)
        {
            e = (ImageButton)findViewById(agv.b.np__increment);
            e.setOnClickListener(attributeset);
            e.setOnLongClickListener(onlongclicklistener);
        } else
        {
            e = null;
        }
        if (!M)
        {
            f = (ImageButton)findViewById(agv.b.np__decrement);
            f.setOnClickListener(attributeset);
            f.setOnLongClickListener(onlongclicklistener);
        } else
        {
            f = null;
        }
        g = (TextView)findViewById(agv.b.np__numberpicker_input);
        context = ViewConfiguration.get(context);
        I = context.getScaledTouchSlop();
        J = context.getScaledMinimumFlingVelocity();
        K = context.getScaledMaximumFlingVelocity() / 8;
        n = (int)g.getTextSize();
        context = new Paint();
        context.setAntiAlias(true);
        context.setTextAlign(android.graphics.Paint.Align.CENTER);
        context.setTextSize(n);
        context.setTypeface(g.getTypeface());
        context.setColor(g.getTextColors().getColorForState(ENABLED_STATE_SET, -1));
        v = context;
        w = new Paint();
        w.setAntiAlias(true);
        w.setTextAlign(android.graphics.Paint.Align.CENTER);
        w.setTypeface(agx.a);
        w.setTextSize(h);
        w.setColor(0xff000000);
        x = new Paint(w);
        x.setColor(Color.argb(150, 0, 0, 0));
        x.setTypeface(agx.a);
        x.setTextSize((float)h / 1.7F);
        B = new agw(getContext(), null, (byte)0);
        C = new agw(getContext(), new DecelerateInterpolator(2.5F));
        c();
        if (android.os.Build.VERSION.SDK_INT >= 16 && getImportantForAccessibility() == 0)
        {
            setImportantForAccessibility(1);
        }
    }

    private static int a(int i1, int j1)
    {
        if (j1 != -1) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        switch (l1)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown measure mode: ")).append(l1).toString());

        case -2147483648: 
            return android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k1, j1), 0x40000000);

        case 0: // '\0'
            return android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);

        case 1073741824: 
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static int a(int i1, int j1, int k1)
    {
        if (i1 == -1) goto _L2; else goto _L1
_L1:
        i1 = Math.max(i1, j1);
        j1 = android.view.View.MeasureSpec.getMode(k1);
        k1 = android.view.View.MeasureSpec.getSize(k1);
        j1;
        JVM INSTR lookupswitch 3: default 56
    //                   -2147483648: 58
    //                   0: 56
    //                   1073741824: 69;
           goto _L3 _L4 _L3 _L5
_L3:
        return i1;
_L4:
        if (k1 < i1)
        {
            return 0x1000000 | k1;
        }
          goto _L3
_L5:
        return k1;
_L2:
        return j1;
    }

    static int a(SnapchatTimePicker snapchattimepicker, int i1)
    {
        return snapchattimepicker.c(i1);
    }

    static TextView a(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.g;
    }

    private void a()
    {
        int l1 = 0;
        if (m) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (p != null) goto _L4; else goto _L3
_L3:
        int j2;
        float f1 = 0.0F;
        for (int i1 = 0; i1 <= 9; i1++)
        {
            float f3 = v.measureText(f(i1));
            if (f3 > f1)
            {
                f1 = f3;
            }
        }

        for (int j1 = b; j1 > 0; j1 /= 10)
        {
            l1++;
        }

        j2 = (int)((float)l1 * f1);
_L6:
        int k1 = j2 + (g.getPaddingLeft() + g.getPaddingRight());
        if (l != k1)
        {
            float f2;
            int i2;
            int k2;
            if (k1 > k)
            {
                l = k1;
            } else
            {
                l = k;
            }
            invalidate();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        k2 = p.length;
        i2 = 0;
        k1 = 0;
_L7:
        j2 = k1;
        if (i2 >= k2) goto _L6; else goto _L5
_L5:
        f2 = v.measureText(p[i2]);
        j2 = k1;
        if (f2 > (float)k1)
        {
            j2 = (int)f2;
        }
        i2++;
        k1 = j2;
          goto _L7
    }

    private void a(int i1)
    {
        if (c == i1)
        {
            return;
        }
        if (d)
        {
            i1 = c(i1);
        } else
        {
            i1 = Math.min(Math.max(i1, a), b);
        }
        c = i1;
        c();
        b();
        invalidate();
    }

    static void a(SnapchatTimePicker snapchattimepicker, boolean flag)
    {
        snapchattimepicker.a(flag);
    }

    private void a(boolean flag)
    {
        if (M)
        {
            g.setVisibility(4);
            if (!a(B))
            {
                a(C);
            }
            D = 0;
            if (flag)
            {
                B.a(-y, 300);
            } else
            {
                B.a(y, 300);
            }
            invalidate();
            return;
        }
        if (flag)
        {
            a(c + 1);
            return;
        } else
        {
            a(c - 1);
            return;
        }
    }

    private void a(boolean flag, long l1)
    {
        if (E == null)
        {
            E = new b();
        } else
        {
            removeCallbacks(E);
        }
        b.a(E, flag);
        postDelayed(E, l1);
    }

    private boolean a(agw agw1)
    {
        agw1.d = true;
        int l1 = agw1.b - agw1.c;
        int i1 = A;
        int k1 = y;
        k1 = z - (i1 + l1) % k1;
        if (k1 != 0)
        {
            int j1 = k1;
            if (Math.abs(k1) > y / 2)
            {
                if (k1 > 0)
                {
                    j1 = k1 - y;
                } else
                {
                    j1 = k1 + y;
                }
            }
            scrollBy(0, j1 + l1);
            return true;
        } else
        {
            return false;
        }
    }

    static String b(SnapchatTimePicker snapchattimepicker, int i1)
    {
        return snapchattimepicker.e(i1);
    }

    private void b()
    {
        t.clear();
        int ai[] = u;
        int l1 = c;
        for (int i1 = 0; i1 < 3; i1++)
        {
            int k1 = (i1 - 1) + l1;
            int j1 = k1;
            if (d)
            {
                j1 = c(k1);
            }
            ai[i1] = j1;
            d(ai[i1]);
        }

    }

    private void b(int i1)
    {
        if (P == i1)
        {
            return;
        } else
        {
            P = i1;
            return;
        }
    }

    static void b(SnapchatTimePicker snapchattimepicker, boolean flag)
    {
        snapchattimepicker.a(flag, 0L);
    }

    static boolean b(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.T;
    }

    private int c(int i1)
    {
        int j1;
        if (i1 > b)
        {
            j1 = (a + (i1 - b) % (b - a)) - 1;
        } else
        {
            j1 = i1;
            if (i1 < a)
            {
                return (b - (a - i1) % (b - a)) + 1;
            }
        }
        return j1;
    }

    static int c(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.R;
    }

    private boolean c()
    {
        String s1;
        if (p == null)
        {
            s1 = e(c);
        } else
        {
            s1 = p[c - a];
        }
        return !TextUtils.isEmpty(s1) && !s1.equals(g.getText().toString());
    }

    static boolean c(SnapchatTimePicker snapchattimepicker, boolean flag)
    {
        snapchattimepicker.T = flag;
        return flag;
    }

    private void d()
    {
        if (E != null)
        {
            removeCallbacks(E);
        }
        W.a();
    }

    private void d(int i1)
    {
        SparseArray sparsearray = t;
        if ((String)sparsearray.get(i1) != null)
        {
            return;
        }
        String s1;
        if (i1 < a || i1 > b)
        {
            s1 = "";
        } else
        if (p != null)
        {
            int j1 = a;
            s1 = p[i1 - j1];
        } else
        {
            s1 = e(i1);
        }
        sparsearray.put(i1, s1);
    }

    static boolean d(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.U;
    }

    static boolean d(SnapchatTimePicker snapchattimepicker, boolean flag)
    {
        snapchattimepicker.U = flag;
        return flag;
    }

    static int e(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.Q;
    }

    private String e(int i1)
    {
        if (r != null)
        {
            return r.a(i1);
        } else
        {
            return f(i1);
        }
    }

    private boolean e()
    {
        boolean flag = false;
        int j1 = z - A;
        if (j1 != 0)
        {
            D = 0;
            int i1;
            if (Math.abs(j1) > y / 2)
            {
                if (j1 > 0)
                {
                    i1 = -y;
                } else
                {
                    i1 = y;
                }
                i1 += j1;
            } else
            {
                i1 = j1;
            }
            C.a(i1, 800);
            invalidate();
            flag = true;
        }
        return flag;
    }

    private static String f(int i1)
    {
        return String.format(Locale.getDefault(), "%d", new Object[] {
            Integer.valueOf(i1)
        });
    }

    static boolean f(SnapchatTimePicker snapchattimepicker)
    {
        boolean flag = (byte)(snapchattimepicker.T ^ true);
        snapchattimepicker.T = flag;
        return flag;
    }

    static boolean g(SnapchatTimePicker snapchattimepicker)
    {
        boolean flag = (byte)(snapchattimepicker.U ^ true);
        snapchattimepicker.U = flag;
        return flag;
    }

    static long h(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.s;
    }

    static int i(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.O;
    }

    static int j(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.c;
    }

    static boolean k(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.d;
    }

    static int l(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.a;
    }

    static String[] m(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.p;
    }

    static int n(SnapchatTimePicker snapchattimepicker)
    {
        return snapchattimepicker.b;
    }

    public void computeScroll()
    {
        agw agw1;
        agw agw2;
        agw2 = B;
        agw1 = agw2;
        if (!agw2.d) goto _L2; else goto _L1
_L1:
        agw2 = C;
        agw1 = agw2;
        if (!agw2.d) goto _L2; else goto _L3
_L3:
        return;
_L2:
        agw1.a();
        int i1 = agw1.c;
        if (D == 0)
        {
            D = agw1.a;
        }
        scrollBy(0, i1 - D);
        D = i1;
        if (agw1.d)
        {
            if (agw1 == B)
            {
                if (!e())
                {
                    c();
                }
                b(0);
                return;
            }
            if (P != 1)
            {
                c();
                return;
            }
        } else
        {
            invalidate();
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    protected boolean dispatchHoverEvent(MotionEvent motionevent)
    {
        if (!M)
        {
            return super.dispatchHoverEvent(motionevent);
        }
        if (!((AccessibilityManager)getContext().getSystemService("accessibility")).isEnabled()) goto _L2; else goto _L1
_L1:
        int i1;
        i1 = (int)motionevent.getY();
        int j1;
        if (i1 < Q)
        {
            i1 = 3;
        } else
        if (i1 > R)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        j1 = motionevent.getAction();
        motionevent = new h((byte)0);
        j1 & 0xff;
        JVM INSTR tableswitch 7 10: default 100
    //                   7 142
    //                   8 100
    //                   9 120
    //                   10 191;
           goto _L2 _L3 _L2 _L4 _L5
_L2:
        return false;
_L4:
        motionevent.a(i1, 128);
        S = i1;
        motionevent.a(i1);
        continue; /* Loop/switch isn't completed */
_L3:
        if (S != i1 && S != -1)
        {
            motionevent.a(S, 256);
            motionevent.a(i1, 128);
            S = i1;
            motionevent.a(i1);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        motionevent.a(i1, 256);
        S = -1;
        if (true) goto _L2; else goto _L6
_L6:
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        int i1;
        boolean flag;
        flag = true;
        i1 = keyevent.getKeyCode();
        i1;
        JVM INSTR lookupswitch 4: default 52
    //                   19: 67
    //                   20: 67
    //                   23: 60
    //                   66: 60;
           goto _L1 _L2 _L2 _L3 _L3
_L12:
        flag = super.dispatchKeyEvent(keyevent);
_L10:
        return flag;
_L3:
        d();
        continue; /* Loop/switch isn't completed */
_L2:
        if (!M)
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent.getAction();
        JVM INSTR tableswitch 0 1: default 100
    //                   0 103
    //                   1 185;
           goto _L4 _L5 _L6
_L4:
        continue; /* Loop/switch isn't completed */
_L6:
        continue; /* Loop/switch isn't completed */
_L5:
        if (!d && i1 != 20 ? c <= a : c >= b) goto _L8; else goto _L7
_L8:
        continue; /* Loop/switch isn't completed */
_L7:
        requestFocus();
        aa = i1;
        d();
        if (!B.d) goto _L10; else goto _L9
_L9:
        boolean flag1;
        if (i1 == 20)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag1);
        return true;
        if (aa != i1) goto _L12; else goto _L11
_L11:
        aa = -1;
        return true;
_L1:
        if (true) goto _L12; else goto _L13
_L13:
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 42
    //                   2 36
    //                   3 42;
           goto _L1 _L2 _L1 _L2
_L1:
        return super.dispatchTouchEvent(motionevent);
_L2:
        d();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean dispatchTrackballEvent(MotionEvent motionevent)
    {
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 42
    //                   2 36
    //                   3 42;
           goto _L1 _L2 _L1 _L2
_L1:
        return super.dispatchTrackballEvent(motionevent);
_L2:
        d();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider()
    {
        if (!M)
        {
            return super.getAccessibilityNodeProvider();
        }
        if (V == null)
        {
            V = new h((byte)0);
        }
        return V.a;
    }

    protected float getBottomFadingEdgeStrength()
    {
        return 0.9F;
    }

    public int getSolidColor()
    {
        return L;
    }

    protected float getTopFadingEdgeStrength()
    {
        return 0.9F;
    }

    protected void onDetachedFromWindow()
    {
        d();
    }

    protected void onDraw(Canvas canvas)
    {
        if (!M)
        {
            super.onDraw(canvas);
            return;
        }
        float f2 = (getRight() - getLeft()) / 2;
        float f1 = A - h;
        float f3 = y;
        int ai[] = u;
        int i1 = 0;
        f1 += f3 * 0.95F;
        for (; i1 < 3; i1++)
        {
            int k1 = ai[i1];
            canvas.drawText((String)t.get(k1), (float)y / 5F + f2, f1, w);
            f1 += y;
        }

        if (N != null)
        {
            int j1 = Q;
            int l1 = R;
            N.setBounds(0, j1, getRight(), l1);
            N.draw(canvas);
        }
        String s1;
        if (c == 1)
        {
            s1 = "      second";
        } else
        {
            s1 = "       seconds";
        }
        canvas.drawText(s1, (float)y / 4F + f2, (float)z * 1.1F + (float)y, x);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(net/simonvt/numberpicker/SnapchatTimePicker.getName());
        accessibilityevent.setScrollable(true);
        accessibilityevent.setScrollY((a + c) * y);
        accessibilityevent.setMaxScrollY((b - a) * y);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = true;
        if (M && isEnabled()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        switch (motionevent.getAction() & 0xff)
        {
        default:
            return false;

        case 0: // '\0'
            d();
            break;
        }
        g.setVisibility(4);
        float f1 = motionevent.getY();
        F = f1;
        G = f1;
        motionevent.getEventTime();
        q = false;
        if (F < (float)Q)
        {
            if (P == 0)
            {
                W.a(2);
            }
        } else
        if (F > (float)R && P == 0)
        {
            W.a(1);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        if (B.d)
        {
            break; /* Loop/switch isn't completed */
        }
        B.d = true;
        C.d = true;
        b(0);
        flag = flag1;
        if (c != a)
        {
            flag = flag1;
            if (c != b)
            {
                q = true;
                return true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!C.d)
        {
            B.d = true;
            C.d = true;
            return true;
        }
        if (F < (float)Q)
        {
            a(false, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        flag = flag1;
        if (F > (float)R)
        {
            a(true, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (!M)
        {
            super.onLayout(flag, i1, j1, k1, l1);
        } else
        {
            l1 = getMeasuredWidth();
            k1 = getMeasuredHeight();
            i1 = g.getMeasuredWidth();
            j1 = g.getMeasuredHeight();
            l1 = (l1 - i1) / 2;
            k1 = (k1 - j1) / 2;
            g.layout(l1, k1, i1 + l1, j1 + k1);
            if (flag)
            {
                b();
                i1 = n;
                o = (int)((float)(getBottom() - getTop() - i1 * 3) / 3F + 0.5F);
                y = n + o;
                z = (g.getBaseline() + g.getTop()) - y;
                A = z;
                c();
                setVerticalFadingEdgeEnabled(true);
                setFadingEdgeLength((getBottom() - getTop() - n) / 2);
                Q = (getHeight() - h) / 2 - O;
                R = Q + O * 2 + h;
                return;
            }
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        if (!M)
        {
            super.onMeasure(i1, j1);
            return;
        } else
        {
            super.onMeasure(a(i1, l), a(j1, j));
            setMeasuredDimension(a(k, getMeasuredWidth(), i1), a(i, getMeasuredHeight(), j1));
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled() || !M)
        {
            return false;
        }
        if (H == null)
        {
            H = VelocityTracker.obtain();
        }
        H.addMovement(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 1 2: default 68
    //                   1 70
    //                   2 173;
           goto _L1 _L2 _L3
_L1:
        return true;
_L2:
        int i1;
        if (E != null)
        {
            removeCallbacks(E);
        }
        W.a();
        VelocityTracker velocitytracker = H;
        velocitytracker.computeCurrentVelocity(1000, K);
        i1 = (int)velocitytracker.getYVelocity();
        if (Math.abs(i1) <= J) goto _L5; else goto _L4
_L4:
        D = 0;
        float f1;
        if (i1 > 0)
        {
            B.a(0, 0, i1);
        } else
        {
            B.a(0x7fffffff, 0, i1);
        }
        invalidate();
        b(2);
_L7:
        H.recycle();
        H = null;
        return true;
_L3:
        f1 = motionevent.getY();
        if (P != 1)
        {
            if ((int)Math.abs(f1 - F) > I)
            {
                d();
                b(1);
            }
        } else
        {
            scrollBy(0, (int)(f1 - G));
            invalidate();
        }
        G = f1;
        return true;
_L5:
        i1 = (int)motionevent.getY();
        int j1 = (int)Math.abs((float)i1 - F);
        motionevent.getEventTime();
        ViewConfiguration.getTapTimeout();
        if (j1 <= I)
        {
            i1 = i1 / y - 1;
            if (i1 <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            a(true);
            W.b(1);
        }
_L8:
        e();
        b(0);
        if (true) goto _L7; else goto _L6
_L6:
        if (i1 < 0)
        {
            a(false);
            W.b(2);
        } else
        if (!q)
        {
            ab.a();
        }
          goto _L8
        if (true) goto _L7; else goto _L9
_L9:
    }

    public void scrollBy(int i1, int j1)
    {
        int ai[] = u;
        if (d || j1 <= 0 || ai[1] > a) goto _L2; else goto _L1
_L1:
        A = z;
_L4:
        return;
_L2:
        if (!d && j1 < 0 && ai[1] >= b)
        {
            A = z;
            return;
        }
        A = A + j1;
        do
        {
            do
            {
                if (A - z <= o)
                {
                    continue;
                }
                A = A - y;
                for (i1 = 2; i1 > 0; i1--)
                {
                    ai[i1] = ai[i1 - 1];
                }

                j1 = ai[1] - 1;
                i1 = j1;
                if (d)
                {
                    i1 = j1;
                    if (j1 < a)
                    {
                        i1 = b;
                    }
                }
                ai[0] = i1;
                d(i1);
                a(ai[1]);
            } while (d || ai[1] > a);
            A = z;
        } while (true);
        while (A - z < -o) 
        {
            A = A + y;
            i1 = 0;
            while (i1 < 2) 
            {
                ai[i1] = ai[i1 + 1];
                i1++;
            }
            j1 = ai[1] + 1;
            i1 = j1;
            if (d)
            {
                i1 = j1;
                if (j1 > b)
                {
                    i1 = a;
                }
            }
            ai[2] = i1;
            d(i1);
            a(ai[1]);
            if (!d && ai[1] >= b)
            {
                A = z;
            }
        }
_L6:
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setDisplayedValues(String as[])
    {
        if (p == as)
        {
            return;
        } else
        {
            p = as;
            c();
            b();
            a();
            return;
        }
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        if (!M)
        {
            e.setEnabled(flag);
        }
        if (!M)
        {
            f.setEnabled(flag);
        }
    }

    public void setFormatter(c c1)
    {
        if (c1 == r)
        {
            return;
        } else
        {
            r = c1;
            b();
            c();
            return;
        }
    }

    public void setMaxValue(int i1)
    {
        if (b == i1)
        {
            return;
        }
        if (i1 < 0)
        {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        b = i1;
        if (b < c)
        {
            c = b;
        }
        boolean flag;
        if (b - a > 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWrapSelectorWheel(flag);
        b();
        c();
        a();
        invalidate();
    }

    public void setMinValue(int i1)
    {
        if (a == i1)
        {
            return;
        }
        if (i1 < 0)
        {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        a = i1;
        if (a > c)
        {
            c = a;
        }
        boolean flag;
        if (b - a > 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWrapSelectorWheel(flag);
        b();
        c();
        a();
        invalidate();
    }

    public void setOnLongPressUpdateInterval(long l1)
    {
        s = l1;
    }

    public void setOnScrollListener(d d1)
    {
    }

    public void setOnTimeSelectedListener(e e1)
    {
        ab = e1;
    }

    public void setOnValueChangedListener(f f1)
    {
    }

    public void setValue(int i1)
    {
        a(i1);
    }

    public void setWrapSelectorWheel(boolean flag)
    {
        boolean flag1;
        if (b - a >= 3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((!flag || flag1) && flag != d)
        {
            d = flag;
        }
    }

    static 
    {
        new i();
    }
}
