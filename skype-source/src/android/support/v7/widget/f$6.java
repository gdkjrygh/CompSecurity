// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.af;
import android.support.v4.view.x;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            f

final class <init> extends <init>
{

    final clerView.v a;
    final int b;
    final int c;
    final af d;
    final f e;

    public final void a(View view)
    {
    }

    public final void b(View view)
    {
        d.a(null);
        e.e(a);
        f.g(e).remove(a);
        f.e(e);
    }

    public final void c(View view)
    {
        if (b != 0)
        {
            x.a(view, 0.0F);
        }
        if (c != 0)
        {
            x.b(view, 0.0F);
        }
    }

    clerView.v(f f1, clerView.v v, int i, int j, af af1)
    {
        e = f1;
        a = v;
        b = i;
        c = j;
        d = af1;
        super((byte)0);
    }
}
