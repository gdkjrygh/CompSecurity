// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.view.View;

// Referenced classes of package com.android.slyce.report.c:
//            ao

class ap extends android.view.View.AccessibilityDelegate
{

    final ao a;
    private android.view.View.AccessibilityDelegate b;

    public ap(ao ao1, android.view.View.AccessibilityDelegate accessibilitydelegate)
    {
        a = ao1;
        super();
        b = accessibilitydelegate;
    }

    public android.view.View.AccessibilityDelegate a()
    {
        return b;
    }

    public void a(ap ap1)
    {
        if (b == ap1)
        {
            b = ap1.a();
        } else
        if (b instanceof ap)
        {
            ((ap)b).a(ap1);
            return;
        }
    }

    public boolean a(String s)
    {
        if (a.b() == s)
        {
            return true;
        }
        if (b instanceof ap)
        {
            return ((ap)b).a(s);
        } else
        {
            return false;
        }
    }

    public void sendAccessibilityEvent(View view, int i)
    {
        if (i == ao.a(a))
        {
            a.c(view);
        }
        if (b != null)
        {
            b.sendAccessibilityEvent(view, i);
        }
    }
}
