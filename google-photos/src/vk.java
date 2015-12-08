// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;

final class vk extends op
{

    private boolean a;
    private int b;
    private vj c;

    vk(vj vj1)
    {
        c = vj1;
        super();
        a = false;
        b = 0;
    }

    public final void a(View view)
    {
        if (!a)
        {
            a = true;
            if (c.b != null)
            {
                c.b.a(null);
                return;
            }
        }
    }

    public final void b(View view)
    {
        int i = b + 1;
        b = i;
        if (i == c.a.size())
        {
            if (c.b != null)
            {
                c.b.b(null);
            }
            b = 0;
            a = false;
            c.c = false;
        }
    }
}
