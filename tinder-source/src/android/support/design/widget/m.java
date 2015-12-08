// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.x;
import android.view.View;

final class m
{

    final View a;
    int b;
    int c;
    int d;
    int e;

    public m(View view)
    {
        a = view;
    }

    final void a()
    {
        x.e(a, d - (a.getTop() - b));
        x.f(a, e - (a.getLeft() - c));
        android.view.ViewParent viewparent = a.getParent();
        if (viewparent instanceof View)
        {
            ((View)viewparent).invalidate();
        }
    }

    public final boolean a(int i)
    {
        if (d != i)
        {
            d = i;
            a();
            return true;
        } else
        {
            return false;
        }
    }
}
