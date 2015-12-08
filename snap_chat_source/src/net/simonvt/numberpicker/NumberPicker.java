// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import agw;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;
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
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

public class NumberPicker extends LinearLayout
{
    public static class CustomEditText extends EditText
    {

        public void onEditorAction(int i1)
        {
            super.onEditorAction(i1);
            if (i1 == 6)
            {
                clearFocus();
            }
        }

        public CustomEditText(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }
    }

    final class a extends AccessibilityNodeProvider
    {

        private final Rect a = new Rect();
        private final int b[] = new int[2];
        private int c;
        private NumberPicker d;

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
            obj = NumberPicker.b(d).getText();
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && ((CharSequence) (obj)).toString().toLowerCase().contains(s1))
            {
                list.add(createAccessibilityNodeInfo(2));
                return;
            }
            obj = NumberPicker.b(d).getText();
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
            int j1 = NumberPicker.o(d) - 1;
            int i1 = j1;
            if (NumberPicker.p(d))
            {
                i1 = NumberPicker.a(d, j1);
            }
            if (i1 >= NumberPicker.q(d))
            {
                if (NumberPicker.c(d) == null)
                {
                    return NumberPicker.b(d, i1);
                } else
                {
                    return NumberPicker.c(d)[i1 - NumberPicker.q(d)];
                }
            } else
            {
                return null;
            }
        }

        private String d()
        {
            int j1 = NumberPicker.o(d) + 1;
            int i1 = j1;
            if (NumberPicker.p(d))
            {
                i1 = NumberPicker.a(d, j1);
            }
            if (i1 <= NumberPicker.d(d))
            {
                if (NumberPicker.c(d) == null)
                {
                    return NumberPicker.b(d, i1);
                } else
                {
                    return NumberPicker.c(d)[i1 - NumberPicker.q(d)];
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
                NumberPicker.b(d).onInitializeAccessibilityEvent(accessibilityevent);
                NumberPicker.b(d).onPopulateAccessibilityEvent(accessibilityevent);
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
            ((AccessibilityNodeInfo) (obj)).setClassName(net/simonvt/numberpicker/NumberPicker.getName());
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
            int j2 = NumberPicker.h(d);
            return a(3, ((String) (obj)), i1, j1, (l1 - i2) + k1, NumberPicker.n(d) + j2);
_L4:
            AccessibilityNodeInfo accessibilitynodeinfo;
            accessibilitynodeinfo = NumberPicker.b(d).createAccessibilityNodeInfo();
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
            return a(1, d(), d.getScrollX(), NumberPicker.f(d) - NumberPicker.n(d), d.getScrollX() + (d.getRight() - d.getLeft()), d.getScrollY() + (d.getBottom() - d.getTop()));
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
        //                       1 520
        //                       2 271
        //                       3 701;
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
            NumberPicker.a(d, true);
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
            NumberPicker.a(d, false);
            return true;
_L4:
            switch (j1)
            {
            default:
                return NumberPicker.b(d).performAccessibilityAction(j1, bundle);

            case 1: // '\001'
                flag = flag1;
                if (d.isEnabled())
                {
                    flag = flag1;
                    if (!NumberPicker.b(d).isFocused())
                    {
                        return NumberPicker.b(d).requestFocus();
                    }
                }
                break;

            case 2: // '\002'
                flag = flag1;
                if (d.isEnabled())
                {
                    flag = flag1;
                    if (NumberPicker.b(d).isFocused())
                    {
                        NumberPicker.b(d).clearFocus();
                        return true;
                    }
                }
                break;

            case 16: // '\020'
                flag = flag1;
                if (d.isEnabled())
                {
                    NumberPicker.l(d);
                    return true;
                }
                break;

            case 64: // '@'
                flag = flag1;
                if (c != i1)
                {
                    c = i1;
                    a(i1, 32768);
                    NumberPicker.b(d).invalidate();
                    return true;
                }
                break;

            case 128: 
                flag = flag1;
                if (c == i1)
                {
                    c = 0x80000000;
                    a(i1, 0x10000);
                    NumberPicker.b(d).invalidate();
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
                    NumberPicker.a(d, true);
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
                    d.invalidate(0, NumberPicker.f(d), d.getRight(), d.getBottom());
                    return true;
                }
                break;

            case 128: 
                flag = flag1;
                if (c == i1)
                {
                    c = 0x80000000;
                    a(i1, 0x10000);
                    d.invalidate(0, NumberPicker.f(d), d.getRight(), d.getBottom());
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
                    NumberPicker.a(d, flag);
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
                    d.invalidate(0, 0, d.getRight(), NumberPicker.h(d));
                    return true;
                }
                break;

            case 128: 
                flag = flag1;
                if (c == i1)
                {
                    c = 0x80000000;
                    a(i1, 0x10000);
                    d.invalidate(0, 0, d.getRight(), NumberPicker.h(d));
                    return true;
                }
                break;
            }
            if (true) goto _L10; else goto _L17
_L17:
        }

        a()
        {
            d = NumberPicker.this;
            super();
            c = 0x80000000;
        }
    }

    final class b
        implements Runnable
    {

        private NumberPicker a;

        public final void run()
        {
            NumberPicker.l(a);
            NumberPicker.m(a);
        }

        b()
        {
            a = NumberPicker.this;
            super();
        }
    }

    final class c
        implements Runnable
    {

        private boolean a;
        private NumberPicker b;

        static void a(c c1, boolean flag)
        {
            c1.a = flag;
        }

        public final void run()
        {
            NumberPicker.a(b, a);
            b.postDelayed(this, NumberPicker.k(b));
        }

        c()
        {
            b = NumberPicker.this;
            super();
        }
    }

    public static interface d
    {

        public abstract String a(int i1);
    }

    final class e extends NumberKeyListener
    {

        private NumberPicker a;

        public final CharSequence filter(CharSequence charsequence, int i1, int j1, Spanned spanned, int k1, int l1)
        {
            CharSequence charsequence1;
            if (NumberPicker.c(a) != null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            CharSequence charsequence2 = super.filter(charsequence, i1, j1, spanned, k1, l1);
            charsequence1 = charsequence2;
            if (charsequence2 == null)
            {
                charsequence1 = charsequence.subSequence(i1, j1);
            }
            charsequence = (new StringBuilder()).append(String.valueOf(spanned.subSequence(0, k1))).append(charsequence1).append(spanned.subSequence(l1, spanned.length())).toString();
            if (!"".equals(charsequence)) goto _L2; else goto _L1
_L1:
            charsequence1 = charsequence;
_L4:
            return charsequence1;
_L2:
            if (NumberPicker.a(a, charsequence) <= NumberPicker.d(a)) goto _L4; else goto _L3
_L3:
            return "";
            charsequence = String.valueOf(charsequence.subSequence(i1, j1));
            if (TextUtils.isEmpty(charsequence))
            {
                return "";
            }
            charsequence = (new StringBuilder()).append(String.valueOf(spanned.subSequence(0, k1))).append(charsequence).append(spanned.subSequence(l1, spanned.length())).toString();
            spanned = String.valueOf(charsequence).toLowerCase();
            String as[] = NumberPicker.c(a);
            j1 = as.length;
            for (i1 = 0; i1 < j1; i1++)
            {
                String s1 = as[i1];
                if (s1.toLowerCase().startsWith(spanned))
                {
                    NumberPicker.a(a, charsequence.length(), s1.length());
                    return s1.subSequence(k1, s1.length());
                }
            }

            return "";
        }

        protected final char[] getAcceptedChars()
        {
            return NumberPicker.a();
        }

        public final int getInputType()
        {
            return 1;
        }

        e()
        {
            a = NumberPicker.this;
            super();
        }
    }

    public static interface f
    {
    }

    public static interface g
    {
    }

    final class h
        implements Runnable
    {

        private int a;
        private int b;
        private NumberPicker c;

        public final void a()
        {
            b = 0;
            a = 0;
            c.removeCallbacks(this);
            if (NumberPicker.e(c))
            {
                NumberPicker.c(c, false);
                c.invalidate(0, NumberPicker.f(c), c.getRight(), c.getBottom());
            }
            NumberPicker.d(c, false);
            if (NumberPicker.g(c))
            {
                c.invalidate(0, 0, c.getRight(), NumberPicker.h(c));
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
                    NumberPicker.c(c, true);
                    c.invalidate(0, NumberPicker.f(c), c.getRight(), c.getBottom());
                    return;

                case 2: // '\002'
                    NumberPicker.d(c, true);
                    break;
                }
                c.invalidate(0, 0, c.getRight(), NumberPicker.h(c));
                return;

            case 2: // '\002'
                switch (a)
                {
                default:
                    return;

                case 1: // '\001'
                    if (!NumberPicker.e(c))
                    {
                        c.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                    }
                    NumberPicker.i(c);
                    c.invalidate(0, NumberPicker.f(c), c.getRight(), c.getBottom());
                    return;

                case 2: // '\002'
                    break;
                }
                break;
            }
            if (!NumberPicker.g(c))
            {
                c.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            NumberPicker.j(c);
            c.invalidate(0, 0, c.getRight(), NumberPicker.h(c));
        }

        h()
        {
            c = NumberPicker.this;
            super();
        }
    }

    final class i
        implements Runnable
    {

        private int a;
        private int b;
        private NumberPicker c;

        static int a(i i1, int j1)
        {
            i1.a = j1;
            return j1;
        }

        static int b(i i1, int j1)
        {
            i1.b = j1;
            return j1;
        }

        public final void run()
        {
            NumberPicker.b(c).setSelection(a, b);
        }

        i()
        {
            c = NumberPicker.this;
            super();
        }
    }

    final class j
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

        private j()
        {
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                a = new a();
            }
        }

        j(byte byte0)
        {
            this();
        }
    }

    static final class k
        implements d
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

        k()
        {
            a = new StringBuilder();
            d = new Object[1];
            a(Locale.getDefault());
        }
    }


    private static final char ad[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '\u0660', '\u0661', '\u0662', '\u0663', '\u0664', '\u0665', '\u0666', '\u0667', '\u0668', '\u0669', 
        '\u06F0', '\u06F1', '\u06F2', '\u06F3', '\u06F4', '\u06F5', '\u06F6', '\u06F7', '\u06F8', '\u06F9'
    };
    private final agw A;
    private int B;
    private i C;
    private c D;
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
    private boolean Q;
    private boolean R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    int a;
    private j aa;
    private final h ab;
    private int ac;
    int b;
    int c;
    boolean d;
    private final ImageButton e;
    private final ImageButton f;
    private final EditText g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private int l;
    private final boolean m;
    private final int n;
    private int o;
    private String p[];
    private d q;
    private long r;
    private final SparseArray s;
    private final int t[];
    private final Paint u;
    private final Drawable v;
    private int w;
    private int x;
    private int y;
    private final agw z;

    public NumberPicker(Context context)
    {
        this(context, null);
    }

    public NumberPicker(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, agv.a.numberPickerStyle);
    }

    public NumberPicker(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        r = 300L;
        s = new SparseArray();
        t = new int[3];
        x = 0x80000000;
        P = 0;
        ac = -1;
        attributeset = context.obtainStyledAttributes(attributeset, agv.c.NumberPicker, i1, 0);
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
        v = attributeset.getDrawable(9);
        attributeset.recycle();
        ab = new h();
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

            private NumberPicker a;

            public final void onClick(View view)
            {
                NumberPicker.a(a);
                NumberPicker.b(a).clearFocus();
                if (view.getId() == agv.b.np__increment)
                {
                    NumberPicker.a(a, true);
                    return;
                } else
                {
                    NumberPicker.a(a, false);
                    return;
                }
            }

            
            {
                a = NumberPicker.this;
                super();
            }
        };
        onlongclicklistener = new android.view.View.OnLongClickListener() {

            private NumberPicker a;

            public final boolean onLongClick(View view)
            {
                NumberPicker.a(a);
                NumberPicker.b(a).clearFocus();
                if (view.getId() == agv.b.np__increment)
                {
                    NumberPicker.b(a, true);
                    return true;
                } else
                {
                    NumberPicker.b(a, false);
                    return true;
                }
            }

            
            {
                a = NumberPicker.this;
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
        g = (EditText)findViewById(agv.b.np__numberpicker_input);
        g.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private NumberPicker a;

            public final void onFocusChange(View view, boolean flag1)
            {
                if (flag1)
                {
                    NumberPicker.b(a).selectAll();
                    return;
                } else
                {
                    NumberPicker.b(a).setSelection(0, 0);
                    NumberPicker.a(a, view);
                    return;
                }
            }

            
            {
                a = NumberPicker.this;
                super();
            }
        });
        g.setFilters(new InputFilter[] {
            new e()
        });
        g.setRawInputType(2);
        g.setImeOptions(6);
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
        u = context;
        z = new agw(getContext(), null, (byte)0);
        A = new agw(getContext(), new DecelerateInterpolator(2.5F));
        f();
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

    private int a(String s1)
    {
        if (p != null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        int i1 = Integer.parseInt(s1);
        return i1;
        for (i1 = 0; i1 < p.length; i1++)
        {
            s1 = s1.toLowerCase();
            if (p[i1].toLowerCase().startsWith(s1))
            {
                return i1 + a;
            }
        }

        i1 = Integer.parseInt(s1);
        return i1;
        s1;
_L2:
        return a;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static int a(NumberPicker numberpicker, int i1)
    {
        return numberpicker.c(i1);
    }

    static int a(NumberPicker numberpicker, String s1)
    {
        return numberpicker.a(s1);
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
        f();
        e();
        invalidate();
    }

    static void a(NumberPicker numberpicker)
    {
        numberpicker.c();
    }

    static void a(NumberPicker numberpicker, int i1, int j1)
    {
        if (numberpicker.C == null)
        {
            numberpicker.C = numberpicker. new i();
        } else
        {
            numberpicker.removeCallbacks(numberpicker.C);
        }
        i.a(numberpicker.C, i1);
        i.b(numberpicker.C, j1);
        numberpicker.post(numberpicker.C);
    }

    static void a(NumberPicker numberpicker, View view)
    {
        view = String.valueOf(((TextView)view).getText());
        if (TextUtils.isEmpty(view))
        {
            numberpicker.f();
            return;
        } else
        {
            numberpicker.a(numberpicker.a(view.toString()));
            return;
        }
    }

    static void a(NumberPicker numberpicker, boolean flag)
    {
        numberpicker.a(flag);
    }

    private void a(boolean flag)
    {
        if (M)
        {
            g.setVisibility(4);
            if (!a(z))
            {
                a(A);
            }
            B = 0;
            if (flag)
            {
                z.a(-w, 300);
            } else
            {
                z.a(w, 300);
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
        if (D == null)
        {
            D = new c();
        } else
        {
            removeCallbacks(D);
        }
        c.a(D, flag);
        postDelayed(D, l1);
    }

    private boolean a(agw agw1)
    {
        agw1.d = true;
        int l1 = agw1.b - agw1.c;
        int i1 = y;
        int k1 = w;
        k1 = x - (i1 + l1) % k1;
        if (k1 != 0)
        {
            int j1 = k1;
            if (Math.abs(k1) > w / 2)
            {
                if (k1 > 0)
                {
                    j1 = k1 - w;
                } else
                {
                    j1 = k1 + w;
                }
            }
            scrollBy(0, j1 + l1);
            return true;
        } else
        {
            return false;
        }
    }

    static char[] a()
    {
        return ad;
    }

    static EditText b(NumberPicker numberpicker)
    {
        return numberpicker.g;
    }

    static String b(NumberPicker numberpicker, int i1)
    {
        return numberpicker.e(i1);
    }

    private void b()
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
        if (inputmethodmanager != null)
        {
            if (M)
            {
                g.setVisibility(0);
            }
            g.requestFocus();
            inputmethodmanager.showSoftInput(g, 0);
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

    static void b(NumberPicker numberpicker, boolean flag)
    {
        numberpicker.a(flag, 0L);
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

    private void c()
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
        if (inputmethodmanager != null && inputmethodmanager.isActive(g))
        {
            inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
            if (M)
            {
                g.setVisibility(4);
            }
        }
    }

    static boolean c(NumberPicker numberpicker, boolean flag)
    {
        numberpicker.V = flag;
        return flag;
    }

    static String[] c(NumberPicker numberpicker)
    {
        return numberpicker.p;
    }

    static int d(NumberPicker numberpicker)
    {
        return numberpicker.b;
    }

    private void d()
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
            float f3 = u.measureText(f(i1));
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
        f2 = u.measureText(p[i2]);
        j2 = k1;
        if (f2 > (float)k1)
        {
            j2 = (int)f2;
        }
        i2++;
        k1 = j2;
          goto _L7
    }

    private void d(int i1)
    {
        SparseArray sparsearray = s;
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

    static boolean d(NumberPicker numberpicker, boolean flag)
    {
        numberpicker.W = flag;
        return flag;
    }

    private String e(int i1)
    {
        if (q != null)
        {
            return q.a(i1);
        } else
        {
            return f(i1);
        }
    }

    private void e()
    {
        s.clear();
        int ai[] = t;
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

    static boolean e(NumberPicker numberpicker)
    {
        return numberpicker.V;
    }

    static int f(NumberPicker numberpicker)
    {
        return numberpicker.T;
    }

    private static String f(int i1)
    {
        return String.format(Locale.getDefault(), "%d", new Object[] {
            Integer.valueOf(i1)
        });
    }

    private boolean f()
    {
        String s1;
        if (p == null)
        {
            s1 = e(c);
        } else
        {
            s1 = p[c - a];
        }
        if (!TextUtils.isEmpty(s1) && !s1.equals(g.getText().toString()))
        {
            g.setText(s1);
            return true;
        } else
        {
            return false;
        }
    }

    private void g()
    {
        if (D != null)
        {
            removeCallbacks(D);
        }
        if (C != null)
        {
            removeCallbacks(C);
        }
        if (E != null)
        {
            removeCallbacks(E);
        }
        ab.a();
    }

    static boolean g(NumberPicker numberpicker)
    {
        return numberpicker.W;
    }

    static int h(NumberPicker numberpicker)
    {
        return numberpicker.S;
    }

    private boolean h()
    {
        boolean flag = false;
        int j1 = x - y;
        if (j1 != 0)
        {
            B = 0;
            int i1;
            if (Math.abs(j1) > w / 2)
            {
                if (j1 > 0)
                {
                    i1 = -w;
                } else
                {
                    i1 = w;
                }
                i1 += j1;
            } else
            {
                i1 = j1;
            }
            A.a(i1, 800);
            invalidate();
            flag = true;
        }
        return flag;
    }

    static boolean i(NumberPicker numberpicker)
    {
        boolean flag = (byte)(numberpicker.V ^ true);
        numberpicker.V = flag;
        return flag;
    }

    static boolean j(NumberPicker numberpicker)
    {
        boolean flag = (byte)(numberpicker.W ^ true);
        numberpicker.W = flag;
        return flag;
    }

    static long k(NumberPicker numberpicker)
    {
        return numberpicker.r;
    }

    static void l(NumberPicker numberpicker)
    {
        numberpicker.b();
    }

    static boolean m(NumberPicker numberpicker)
    {
        numberpicker.Q = true;
        return true;
    }

    static int n(NumberPicker numberpicker)
    {
        return numberpicker.O;
    }

    static int o(NumberPicker numberpicker)
    {
        return numberpicker.c;
    }

    static boolean p(NumberPicker numberpicker)
    {
        return numberpicker.d;
    }

    static int q(NumberPicker numberpicker)
    {
        return numberpicker.a;
    }

    public void computeScroll()
    {
        agw agw1;
        agw agw2;
        agw2 = z;
        agw1 = agw2;
        if (!agw2.d) goto _L2; else goto _L1
_L1:
        agw2 = A;
        agw1 = agw2;
        if (!agw2.d) goto _L2; else goto _L3
_L3:
        return;
_L2:
        agw1.a();
        int i1 = agw1.c;
        if (B == 0)
        {
            B = agw1.a;
        }
        scrollBy(0, i1 - B);
        B = i1;
        if (agw1.d)
        {
            if (agw1 == z)
            {
                if (!h())
                {
                    f();
                }
                b(0);
                return;
            }
            if (P != 1)
            {
                f();
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
        if (i1 < S)
        {
            i1 = 3;
        } else
        if (i1 > T)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        j1 = motionevent.getAction();
        motionevent = new j((byte)0);
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
        U = i1;
        motionevent.a(i1);
        continue; /* Loop/switch isn't completed */
_L3:
        if (U != i1 && U != -1)
        {
            motionevent.a(U, 256);
            motionevent.a(i1, 128);
            U = i1;
            motionevent.a(i1);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        motionevent.a(i1, 256);
        U = -1;
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
        g();
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
        ac = i1;
        g();
        if (!z.d) goto _L10; else goto _L9
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
        if (ac != i1) goto _L12; else goto _L11
_L11:
        ac = -1;
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
        g();
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
        g();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider()
    {
        if (!M)
        {
            return super.getAccessibilityNodeProvider();
        }
        if (aa == null)
        {
            aa = new j((byte)0);
        }
        return aa.a;
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
        g();
    }

    protected void onDraw(Canvas canvas)
    {
        if (!M)
        {
            super.onDraw(canvas);
        } else
        {
            float f2 = (getRight() - getLeft()) / 2;
            float f1 = y;
            if (v != null && P == 0)
            {
                if (W)
                {
                    v.setState(PRESSED_ENABLED_STATE_SET);
                    v.setBounds(0, 0, getRight(), S);
                    v.draw(canvas);
                }
                if (V)
                {
                    v.setState(PRESSED_ENABLED_STATE_SET);
                    v.setBounds(0, T, getRight(), getBottom());
                    v.draw(canvas);
                }
            }
            int ai[] = t;
            for (int i1 = 0; i1 < 3; i1++)
            {
                int k1 = ai[i1];
                String s1 = (String)s.get(k1);
                if (i1 != 1 || g.getVisibility() != 0)
                {
                    canvas.drawText(s1, f2, f1, u);
                }
                f1 += w;
            }

            if (N != null)
            {
                int j1 = S;
                int l1 = O;
                N.setBounds(0, j1, getRight(), l1 + j1);
                N.draw(canvas);
                j1 = T;
                l1 = O;
                N.setBounds(0, j1 - l1, getRight(), j1);
                N.draw(canvas);
                return;
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(net/simonvt/numberpicker/NumberPicker.getName());
        accessibilityevent.setScrollable(true);
        accessibilityevent.setScrollY((a + c) * w);
        accessibilityevent.setMaxScrollY((b - a) * w);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (!M || !isEnabled())
        {
            return false;
        }
        switch (motionevent.getAction() & 0xff)
        {
        default:
            return false;

        case 0: // '\0'
            g();
            break;
        }
        g.setVisibility(4);
        float f1 = motionevent.getY();
        F = f1;
        G = f1;
        motionevent.getEventTime();
        Q = false;
        R = false;
        if (F >= (float)S) goto _L2; else goto _L1
_L1:
        if (P == 0)
        {
            ab.a(2);
        }
_L4:
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!z.d)
        {
            z.d = true;
            A.d = true;
            b(0);
            return true;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (F > (float)T && P == 0)
        {
            ab.a(1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!A.d)
        {
            z.d = true;
            A.d = true;
            return true;
        }
        if (F < (float)S)
        {
            c();
            a(false, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (F > (float)T)
        {
            c();
            a(true, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        R = true;
        if (E == null)
        {
            E = new b();
        } else
        {
            removeCallbacks(E);
        }
        postDelayed(E, ViewConfiguration.getLongPressTimeout());
        return true;
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
                e();
                i1 = n;
                o = (int)((float)(getBottom() - getTop() - i1 * 3) / 3F + 0.5F);
                w = n + o;
                x = (g.getBaseline() + g.getTop()) - w;
                y = x;
                f();
                setVerticalFadingEdgeEnabled(true);
                setFadingEdgeLength((getBottom() - getTop() - n) / 2);
                S = (getHeight() - h) / 2 - O;
                T = S + O * 2 + h;
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
        boolean flag = true;
        if (isEnabled() && M) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (H == null)
        {
            H = VelocityTracker.obtain();
        }
        H.addMovement(motionevent);
        switch (motionevent.getAction() & 0xff)
        {
        default:
            return true;

        case 2: // '\002'
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            if (E != null)
            {
                removeCallbacks(E);
            }
            if (D != null)
            {
                removeCallbacks(D);
            }
            ab.a();
            VelocityTracker velocitytracker = H;
            velocitytracker.computeCurrentVelocity(1000, K);
            int i1 = (int)velocitytracker.getYVelocity();
            if (Math.abs(i1) > J)
            {
                B = 0;
                float f1;
                if (i1 > 0)
                {
                    z.a(0, 0, i1);
                } else
                {
                    z.a(0x7fffffff, 0, i1);
                }
                invalidate();
                b(2);
            } else
            {
                int j1 = (int)motionevent.getY();
                int k1 = (int)Math.abs((float)j1 - F);
                motionevent.getEventTime();
                ViewConfiguration.getTapTimeout();
                if (k1 <= I)
                {
                    if (R)
                    {
                        R = false;
                        b();
                    } else
                    {
                        j1 = j1 / w - 1;
                        if (j1 > 0)
                        {
                            a(true);
                            ab.b(1);
                        } else
                        if (j1 < 0)
                        {
                            a(false);
                            ab.b(2);
                        }
                    }
                } else
                {
                    h();
                }
                b(0);
            }
            H.recycle();
            H = null;
            return true;
        }
        if (Q) goto _L4; else goto _L3
_L3:
        f1 = motionevent.getY();
        if (P != 1)
        {
            if ((int)Math.abs(f1 - F) > I)
            {
                g();
                b(1);
            }
        } else
        {
            scrollBy(0, (int)(f1 - G));
            invalidate();
        }
        G = f1;
        return true;
    }

    public void scrollBy(int i1, int j1)
    {
        int ai[] = t;
        if (d || j1 <= 0 || ai[1] > a) goto _L2; else goto _L1
_L1:
        y = x;
_L4:
        return;
_L2:
        if (!d && j1 < 0 && ai[1] >= b)
        {
            y = x;
            return;
        }
        y = y + j1;
        do
        {
            do
            {
                if (y - x <= o)
                {
                    continue;
                }
                y = y - w;
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
            y = x;
        } while (true);
        while (y - x < -o) 
        {
            y = y + w;
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
                y = x;
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
        }
        p = as;
        if (p != null)
        {
            g.setRawInputType(0x80001);
        } else
        {
            g.setRawInputType(2);
        }
        f();
        e();
        d();
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
        g.setEnabled(flag);
    }

    public void setFormatter(d d1)
    {
        if (d1 == q)
        {
            return;
        } else
        {
            q = d1;
            e();
            f();
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
        e();
        f();
        d();
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
        e();
        f();
        d();
        invalidate();
    }

    public void setOnLongPressUpdateInterval(long l1)
    {
        r = l1;
    }

    public void setOnScrollListener(f f1)
    {
    }

    public void setOnValueChangedListener(g g1)
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
        new k();
    }
}
