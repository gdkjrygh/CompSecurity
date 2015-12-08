// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.roidapp.baselib.gl.c;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            w, t

public final class p extends w
{

    private boolean j;
    private boolean k;

    public p(Context context, t t, boolean flag, boolean flag1)
    {
        super(context, 1, t);
        j = flag;
        k = flag1;
        h = 0x7f0702f9;
        if (az.q != 5)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        if (j && k)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        if (j || !k) goto _L2; else goto _L1
_L1:
        af.c(d, "Cloud/share/finish/filter");
        a = 0x7f0204e1;
        g = 0x7f070128;
        b = 0x7f0702ea;
_L4:
        return;
_L2:
        if (j && !k)
        {
            if (c.a().e(d))
            {
                af.c(d, "Cloud/share/finish/retouch");
                a = 0x7f0204e2;
                g = 0x7f07012a;
                b = 0x7f0702ef;
                return;
            } else
            {
                f = true;
                return;
            }
        }
        if (j || k) goto _L4; else goto _L3
_L3:
        af.c(d, "Cloud/share/finish/filter");
        a = 0x7f0204e1;
        g = 0x7f070128;
        b = 0x7f0702ea;
        return;
        if (az.q == 0)
        {
            af.c(d, "Cloud/share/finish/template");
            a = 0x7f0205cf;
            g = 0x7f07012c;
            b = 0x7f0702f0;
            return;
        }
        f = true;
        return;
    }

    public final volatile View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        return super.a(layoutinflater, view, viewgroup);
    }
}
