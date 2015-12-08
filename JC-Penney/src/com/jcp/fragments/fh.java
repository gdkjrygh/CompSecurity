// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;

// Referenced classes of package com.jcp.fragments:
//            ff

class fh
    implements android.view.View.OnClickListener
{

    final int a;
    final ff b;

    fh(ff ff1, int i)
    {
        b = ff1;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        int i = (int)((float)a * 0.5F - 10F);
        if (ff.a(b) == 2)
        {
            ff.a(b, 0);
            ff.a(b, ff.c(b), i, 1);
        } else
        {
            if (ff.a(b) == 1)
            {
                ff.a(b, ff.b(b), i, 1);
            }
            ff.a(b, ff.c(b), i, 0);
            ff.a(b, 2);
        }
        ff.a(b, ff.f(b));
        ff.e(b);
    }
}
