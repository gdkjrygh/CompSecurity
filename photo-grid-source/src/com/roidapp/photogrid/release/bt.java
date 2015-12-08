// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, ra, PhotoView

public final class bt extends Fragment
    implements android.view.View.OnClickListener
{

    private PhotoGridActivity a;
    private ra b;
    private View c;
    private View d;
    private View e;

    public bt()
    {
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
        if (a != null && !a.isFinishing()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (view.getId())
        {
        default:
            return;

        case 2131559042: 
            c.setBackgroundColor(0xff4968c4);
            d.setBackgroundColor(0);
            e.setBackgroundColor(0);
            if (b.p() != android.text.Layout.Alignment.ALIGN_NORMAL)
            {
                b.a(android.text.Layout.Alignment.ALIGN_NORMAL);
                a.O().invalidate();
                return;
            }
            break;

        case 2131559043: 
            c.setBackgroundColor(0);
            d.setBackgroundColor(0xff4968c4);
            e.setBackgroundColor(0);
            if (b.p() != android.text.Layout.Alignment.ALIGN_CENTER)
            {
                b.a(android.text.Layout.Alignment.ALIGN_CENTER);
                a.O().invalidate();
                return;
            }
            break;

        case 2131559044: 
            c.setBackgroundColor(0);
            d.setBackgroundColor(0);
            e.setBackgroundColor(0xff4968c4);
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (b.p() == android.text.Layout.Alignment.ALIGN_OPPOSITE) goto _L1; else goto _L4
_L4:
        b.a(android.text.Layout.Alignment.ALIGN_OPPOSITE);
        a.O().invalidate();
        return;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = a.O().g();
        if (bundle instanceof ra)
        {
            bundle = (ra)bundle;
        } else
        {
            bundle = null;
        }
        b = bundle;
        if (b == null)
        {
            return null;
        }
        layoutinflater = layoutinflater.inflate(0x7f0300a6, viewgroup, false);
        c = layoutinflater.findViewById(0x7f0d0282);
        d = layoutinflater.findViewById(0x7f0d0283);
        e = layoutinflater.findViewById(0x7f0d0284);
        if (b.p() != android.text.Layout.Alignment.ALIGN_NORMAL) goto _L2; else goto _L1
_L1:
        c.setBackgroundColor(0xff4968c4);
_L4:
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        return layoutinflater;
_L2:
        if (b.p() == android.text.Layout.Alignment.ALIGN_CENTER)
        {
            d.setBackgroundColor(0xff4968c4);
        } else
        if (b.p() == android.text.Layout.Alignment.ALIGN_OPPOSITE)
        {
            e.setBackgroundColor(0xff4968c4);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
