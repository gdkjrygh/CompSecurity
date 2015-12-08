// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.c;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.style.ImageSpan;
import kik.android.e.f;

// Referenced classes of package com.kik.android.c:
//            i, e

public class b extends ImageSpan
    implements i
{

    private final String a;
    private final f b;
    private final boolean c;
    private final int d;
    private final String e;

    public b(Drawable drawable, String s, String s1, f f1, int j, boolean flag)
    {
        super(drawable);
        a = s1;
        b = f1;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = j;
        e = s;
    }

    public final void a()
    {
        if (b != null && a != null)
        {
            f f1 = b;
            String s = e;
            String s1 = a;
            String s2 = com.kik.android.c.e.a(a);
            new Bundle();
            f1.a(s, s1, s2);
        }
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        return e;
    }

    public final int d()
    {
        return d;
    }

    public final boolean e()
    {
        return c;
    }
}
