// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.CheckBox;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class dfo
{

    private final AccessibilityManager a;

    dfo(AccessibilityManager accessibilitymanager)
    {
        a = accessibilitymanager;
    }

    private static int a(boolean flag, boolean flag1, boolean flag2)
    {
        int i = b.ik;
        int j = b.ii;
        int k = b.il;
        int l = b.ij;
        int i1 = b.io;
        int j1 = b.im;
        int k1 = b.ip;
        int l1 = b.in;
        if (flag)
        {
            if (flag1)
            {
                if (flag2)
                {
                    return k1;
                } else
                {
                    return k;
                }
            }
            if (flag2)
            {
                return i1;
            } else
            {
                return i;
            }
        }
        if (flag1)
        {
            if (flag2)
            {
                return l1;
            } else
            {
                return l;
            }
        }
        if (flag2)
        {
            return j1;
        } else
        {
            return j;
        }
    }

    private static String a(long l)
    {
        java.util.Date date = ivc.b(l);
        return SimpleDateFormat.getDateTimeInstance().format(date);
    }

    public static void a(CheckBox checkbox, long l)
    {
        Context context = checkbox.getContext();
        int i = b.ih;
        java.util.Date date = ivc.b(l);
        checkbox.setContentDescription(context.getString(i, new Object[] {
            SimpleDateFormat.getDateInstance().format(date)
        }));
    }

    public static void a(CheckBox checkbox, ekp ekp1)
    {
        if (ekp1 == null)
        {
            return;
        }
        int i;
        if (ekp1.c() == euv.c)
        {
            i = b.in;
        } else
        {
            i = b.ij;
        }
        checkbox.setContentDescription(checkbox.getContext().getString(i, new Object[] {
            a(ekp1.d())
        }));
    }

    public static void a(Boolean boolean1, View view)
    {
        if (boolean1.booleanValue())
        {
            mk.c(view, 1);
            return;
        } else
        {
            mk.c(view, 4);
            return;
        }
    }

    public final void a(View view, ekp ekp1, boolean flag)
    {
        view.setContentDescription(b(view, ekp1, flag));
    }

    public final void a(String s, View view)
    {
        if (a.isEnabled() && view != null)
        {
            AccessibilityEvent accessibilityevent;
            char c;
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                c = '\b';
            } else
            {
                c = '\u4000';
            }
            accessibilityevent = AccessibilityEvent.obtain(c);
            accessibilityevent.setSource(view);
            accessibilityevent.setClassName(view.getContext().getClass().getName());
            accessibilityevent.setPackageName(view.getContext().getPackageName());
            accessibilityevent.setEnabled(true);
            accessibilityevent.getText().add(s);
            a.sendAccessibilityEvent(accessibilityevent);
        }
    }

    public final CharSequence b(View view, ekp ekp1, boolean flag)
    {
        boolean flag1;
        if (ekp1 != null && ekp1.c() == euv.c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (a.isEnabled() && ekp1 != null)
        {
            ekp1 = a(ekp1.d());
            return view.getContext().getString(a(flag, true, flag1), new Object[] {
                ekp1
            });
        } else
        {
            return view.getContext().getString(a(flag, false, flag1));
        }
    }
}
