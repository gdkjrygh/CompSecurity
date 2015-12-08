// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.graphics.Rect;
import android.support.v4.view.a.c;
import android.support.v4.widget.k;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.m4b.maps.y.p;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            aa

public final class ca extends k
{

    private static final Rect b = new Rect(-2, -2, -1, -1);
    private final ac.a a;
    private List c;

    public ca(View view, ac.a a1)
    {
        super(view);
        a = a1;
    }

    private static String a(aa aa1)
    {
        Object obj;
        if (aa1 == null)
        {
            obj = "";
        } else
        {
            obj = "";
            String s1 = aa1.m();
            String s = aa1.o();
            aa1 = ((aa) (obj));
            if (!p.b(s1))
            {
                aa1 = String.valueOf(s1).concat(". ");
            }
            obj = aa1;
            if (!p.b(s))
            {
                aa1 = String.valueOf(aa1);
                return (new StringBuilder(String.valueOf(aa1).length() + 1 + String.valueOf(s).length())).append(aa1).append(s).append(".").toString();
            }
        }
        return ((String) (obj));
    }

    protected final int a(float f, float f1)
    {
        if (c != null)
        {
            for (int i = 0; i < c.size(); i++)
            {
                Rect rect = ((aa)c.get(i)).D();
                if (rect != null && rect.contains((int)f, (int)f1))
                {
                    return i;
                }
            }

        }
        return 0x80000000;
    }

    protected final void a(int i, c c1)
    {
        if (c == null || i >= c.size())
        {
            c1.c("");
            c1.b(b);
            return;
        }
        Object obj = (aa)c.get(i);
        c1.c(a(((aa) (obj))));
        c1.a(16);
        obj = ((aa) (obj)).D();
        if (obj == null)
        {
            c1.b(b);
            return;
        } else
        {
            c1.b(((Rect) (obj)));
            c1.a(true);
            return;
        }
    }

    protected final void a(int i, AccessibilityEvent accessibilityevent)
    {
        if (c == null || i >= c.size())
        {
            c = a.c();
        }
        if (c == null || i >= c.size())
        {
            accessibilityevent.setContentDescription("");
            return;
        } else
        {
            accessibilityevent.setContentDescription(a((aa)c.get(i)));
            return;
        }
    }

    protected final void a(List list)
    {
        c = a.c();
        if (c != null)
        {
            int j = c.size();
            int i = 0;
            while (i < j) 
            {
                list.add(Integer.valueOf(i));
                i++;
            }
        }
    }

    protected final boolean a()
    {
        return false;
    }

    public final void b()
    {
        a(-1);
        if (c != null)
        {
            int i = 0;
            while (i < c.size()) 
            {
                a(i);
                i++;
            }
        }
    }

}
