// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package net.simonvt.numberpicker:
//            SnapchatTimePicker

final class c extends AccessibilityNodeProvider
{

    private final Rect a = new Rect();
    private final int b[] = new int[2];
    private int c;
    private SnapchatTimePicker d;

    private AccessibilityNodeInfo a(int i, String s, int j, int k, int l, int i1)
    {
        AccessibilityNodeInfo accessibilitynodeinfo = AccessibilityNodeInfo.obtain();
        accessibilitynodeinfo.setClassName(android/widget/Button.getName());
        accessibilitynodeinfo.setPackageName(d.getContext().getPackageName());
        accessibilitynodeinfo.setSource(d, i);
        accessibilitynodeinfo.setParent(d);
        accessibilitynodeinfo.setText(s);
        accessibilitynodeinfo.setClickable(true);
        accessibilitynodeinfo.setLongClickable(true);
        accessibilitynodeinfo.setEnabled(d.isEnabled());
        s = a;
        s.set(j, k, l, i1);
        accessibilitynodeinfo.setBoundsInParent(s);
        int ai[] = b;
        d.getLocationOnScreen(ai);
        s.offset(ai[0], ai[1]);
        accessibilitynodeinfo.setBoundsInScreen(s);
        if (c != i)
        {
            accessibilitynodeinfo.addAction(64);
        }
        if (c == i)
        {
            accessibilitynodeinfo.addAction(128);
        }
        if (d.isEnabled())
        {
            accessibilitynodeinfo.addAction(16);
        }
        return accessibilitynodeinfo;
    }

    private void a(int i, int j, String s)
    {
        if (((AccessibilityManager)d.getContext().getSystemService("accessibility")).isEnabled())
        {
            AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(j);
            accessibilityevent.setClassName(android/widget/Button.getName());
            accessibilityevent.setPackageName(d.getContext().getPackageName());
            accessibilityevent.getText().add(s);
            accessibilityevent.setEnabled(d.isEnabled());
            accessibilityevent.setSource(d, i);
            d.requestSendAccessibilityEvent(d, accessibilityevent);
        }
    }

    private void a(String s, int i, List list)
    {
        i;
        JVM INSTR tableswitch 1 3: default 28
    //                   1 171
    //                   2 71
    //                   3 29;
           goto _L1 _L2 _L3 _L4
_L1:
        Object obj;
        return;
_L4:
        if (!TextUtils.isEmpty(((CharSequence) (obj = c()))) && ((String) (obj)).toString().toLowerCase().contains(s))
        {
            list.add(createAccessibilityNodeInfo(3));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        obj = SnapchatTimePicker.a(d).getText();
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && ((CharSequence) (obj)).toString().toLowerCase().contains(s))
        {
            list.add(createAccessibilityNodeInfo(2));
            return;
        }
        obj = SnapchatTimePicker.a(d).getText();
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && ((CharSequence) (obj)).toString().toLowerCase().contains(s))
        {
            list.add(createAccessibilityNodeInfo(2));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!TextUtils.isEmpty(((CharSequence) (obj = d()))) && ((String) (obj)).toString().toLowerCase().contains(s))
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
        int j = SnapchatTimePicker.j(d) - 1;
        int i = j;
        if (SnapchatTimePicker.k(d))
        {
            i = SnapchatTimePicker.a(d, j);
        }
        if (i >= SnapchatTimePicker.l(d))
        {
            if (SnapchatTimePicker.m(d) == null)
            {
                return SnapchatTimePicker.b(d, i);
            } else
            {
                return SnapchatTimePicker.m(d)[i - SnapchatTimePicker.l(d)];
            }
        } else
        {
            return null;
        }
    }

    private String d()
    {
        int j = SnapchatTimePicker.j(d) + 1;
        int i = j;
        if (SnapchatTimePicker.k(d))
        {
            i = SnapchatTimePicker.a(d, j);
        }
        if (i <= SnapchatTimePicker.n(d))
        {
            if (SnapchatTimePicker.m(d) == null)
            {
                return SnapchatTimePicker.b(d, i);
            } else
            {
                return SnapchatTimePicker.m(d)[i - SnapchatTimePicker.l(d)];
            }
        } else
        {
            return null;
        }
    }

    public final void a(int i, int j)
    {
        i;
        JVM INSTR tableswitch 1 3: default 28
    //                   1 118
    //                   2 47
    //                   3 29;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L4:
        if (a())
        {
            a(i, j, c());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (((AccessibilityManager)d.getContext().getSystemService("accessibility")).isEnabled())
        {
            AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(j);
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
            a(i, j, d());
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
    {
        i;
        JVM INSTR tableswitch -1 3: default 36
    //                   -1 44
    //                   0 36
    //                   1 462
    //                   2 409
    //                   3 323;
           goto _L1 _L2 _L1 _L3 _L4 _L5
_L1:
        Object obj = super.createAccessibilityNodeInfo(i);
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
        i = d.getScrollX();
        int j = d.getScrollY();
        int k = d.getScrollX();
        int l = d.getRight();
        int i1 = d.getLeft();
        int j1 = SnapchatTimePicker.e(d);
        return a(3, ((String) (obj)), i, j, (l - i1) + k, SnapchatTimePicker.i(d) + j1);
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

    public final List findAccessibilityNodeInfosByText(String s, int i)
    {
        if (TextUtils.isEmpty(s))
        {
            return Collections.emptyList();
        }
        String s1 = s.toLowerCase();
        ArrayList arraylist = new ArrayList();
        switch (i)
        {
        case 0: // '\0'
        default:
            return super.findAccessibilityNodeInfosByText(s, i);

        case -1: 
            a(s1, 3, arraylist);
            a(s1, 2, arraylist);
            a(s1, 1, arraylist);
            return arraylist;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a(s1, i, arraylist);
            break;
        }
        return arraylist;
    }

    public final boolean performAction(int i, int j, Bundle bundle)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        i;
        JVM INSTR tableswitch -1 3: default 40
    //                   -1 52
    //                   0 40
    //                   1 513
    //                   2 271
    //                   3 693;
           goto _L1 _L2 _L1 _L3 _L4 _L5
_L1:
        boolean flag = super.performAction(i, j, bundle);
_L10:
        return flag;
_L2:
        j;
        JVM INSTR lookupswitch 4: default 96
    //                   64: 99
    //                   128: 129
    //                   4096: 161
    //                   8192: 216;
           goto _L1 _L6 _L7 _L8 _L9
_L6:
        flag = flag1;
        if (c != i)
        {
            c = i;
            d.performAccessibilityAction(64, null);
            return true;
        }
          goto _L10
_L7:
        flag = flag1;
        if (c == i)
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
        switch (j)
        {
        default:
            return SnapchatTimePicker.a(d).performAccessibilityAction(j, bundle);

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
            if (c != i)
            {
                c = i;
                a(i, 32768);
                SnapchatTimePicker.a(d).invalidate();
                return true;
            }
            break;

        case 128: 
            flag = flag1;
            if (c == i)
            {
                c = 0x80000000;
                a(i, 0x10000);
                SnapchatTimePicker.a(d).invalidate();
                return true;
            }
            break;
        }
        if (true) goto _L10; else goto _L15
_L15:
_L3:
        switch (j)
        {
        default:
            return false;

        case 16: // '\020'
            flag = flag1;
            if (d.isEnabled())
            {
                SnapchatTimePicker.a(d, true);
                a(i, 1);
                return true;
            }
            break;

        case 64: // '@'
            flag = flag1;
            if (c != i)
            {
                c = i;
                a(i, 32768);
                d.invalidate(0, SnapchatTimePicker.c(d), d.getRight(), d.getBottom());
                return true;
            }
            break;

        case 128: 
            flag = flag1;
            if (c == i)
            {
                c = 0x80000000;
                a(i, 0x10000);
                d.invalidate(0, SnapchatTimePicker.c(d), d.getRight(), d.getBottom());
                return true;
            }
            break;
        }
        if (true) goto _L10; else goto _L16
_L16:
_L5:
        switch (j)
        {
        default:
            return false;

        case 16: // '\020'
            flag = flag1;
            if (d.isEnabled())
            {
                flag = flag2;
                if (i == 1)
                {
                    flag = true;
                }
                SnapchatTimePicker.a(d, flag);
                a(i, 1);
                return true;
            }
            break;

        case 64: // '@'
            flag = flag1;
            if (c != i)
            {
                c = i;
                a(i, 32768);
                d.invalidate(0, 0, d.getRight(), SnapchatTimePicker.e(d));
                return true;
            }
            break;

        case 128: 
            flag = flag1;
            if (c == i)
            {
                c = 0x80000000;
                a(i, 0x10000);
                d.invalidate(0, 0, d.getRight(), SnapchatTimePicker.e(d));
                return true;
            }
            break;
        }
        if (true) goto _L10; else goto _L17
_L17:
    }

    fo(SnapchatTimePicker snapchattimepicker)
    {
        d = snapchattimepicker;
        super();
        c = 0x80000000;
    }
}
