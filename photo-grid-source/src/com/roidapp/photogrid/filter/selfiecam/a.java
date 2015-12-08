// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import com.roidapp.photogrid.cloud.BaseShareActivity;
import com.roidapp.photogrid.cloud.bf;
import com.roidapp.photogrid.cloud.br;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.hw;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.util.Stack;

public final class a
{

    public Stack a;
    private ParentActivity b;
    private String c;
    private int d;

    public a(ParentActivity parentactivity, String s)
    {
        a = new Stack();
        b = parentactivity;
        c = s;
        d = 0;
    }

    public final void a()
    {
        ig aig[] = ih.C().M();
        if (aig != null && aig.length > 0)
        {
            int i;
            if (hw.b(b))
            {
                i = 1;
            } else
            {
                i = 2;
            }
            br.a(b, 8262, aig[d].d(), i, b.getString(0x7f0702b8), null, null, c, null, true, BaseShareActivity.a);
        }
    }

    public final void b()
    {
        ig aig[] = ih.C().M();
        if (aig != null && aig.length > 0)
        {
            int i;
            if (hw.b(b))
            {
                i = 1;
            } else
            {
                i = 2;
            }
            bf.a(b, 8262, aig[d].d(), i, b.getString(0x7f0702b8), null, null, c, null, true, BaseShareActivity.a);
        }
    }
}
