// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ah, f, a, h, 
//            ac

class g extends ah
{

    final a a;
    final f b;

    g(f f1, View view, a a1)
    {
        b = f1;
        a = a1;
        super(view);
    }

    public ac a()
    {
        if (android.support.v7.widget.a.a(b.a) == null)
        {
            return null;
        } else
        {
            return android.support.v7.widget.a.a(b.a).c();
        }
    }

    public boolean b()
    {
        b.a.d();
        return true;
    }

    public boolean c()
    {
        if (android.support.v7.widget.a.b(b.a) != null)
        {
            return false;
        } else
        {
            b.a.e();
            return true;
        }
    }
}
