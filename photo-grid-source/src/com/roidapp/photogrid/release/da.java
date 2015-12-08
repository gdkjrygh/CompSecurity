// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.roidapp.photogrid.common.az;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, cs, az, ih

public final class da extends Fragment
    implements android.view.View.OnClickListener
{

    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private PhotoGridActivity e;
    private String f;

    public da()
    {
    }

    private void a()
    {
        if (e == null || e.isFinishing())
        {
            return;
        } else
        {
            e.a("FragmentDoodleTop");
            e.a("FragmentDoodle");
            cs cs1 = new cs();
            e.a(0x7f0d028d, cs1, "FragmentBottomMain");
            return;
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        Drawable drawable = getResources().getDrawable(0x7f0203dd);
        Drawable drawable1 = getResources().getDrawable(0x7f020411);
        if (flag)
        {
            drawable.setAlpha(255);
            c.setTextColor(getResources().getColor(0x7f0c00bf));
        } else
        {
            drawable.setAlpha(50);
            c.setTextColor(getResources().getColor(0x7f0c00c0));
        }
        c.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
        if (flag1)
        {
            drawable1.setAlpha(255);
            d.setTextColor(getResources().getColor(0x7f0c00bf));
        } else
        {
            drawable1.setAlpha(50);
            d.setTextColor(getResources().getColor(0x7f0c00c0));
        }
        d.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
    }

    public final void onAttach(Activity activity)
    {
        e = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
        com.roidapp.photogrid.release.az az1;
        boolean flag2;
        boolean flag4;
        flag4 = true;
        flag2 = true;
        az1 = e.P();
        if (az1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (view.getId())
        {
        default:
            return;

        case 2131559073: 
            if (az1.a)
            {
                a();
                az1.a(false);
                az1.g();
                return;
            }
            break;

        case 2131559076: 
            if (az1.a)
            {
                a();
                az1.a(false);
                az1.h();
                return;
            }
            break;

        case 2131559075: 
            if (az1.f())
            {
                boolean flag;
                if (az1.b().size() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (az1.c().size() <= 0)
                {
                    flag2 = false;
                }
                a(flag, flag2);
                return;
            }
            break;

        case 2131559074: 
            az1.e();
            boolean flag1;
            boolean flag3;
            if (az1.b().size() > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (az1.c().size() > 0)
            {
                flag3 = flag4;
            } else
            {
                flag3 = false;
            }
            a(flag1, flag3);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        boolean flag1;
        flag1 = true;
        layoutinflater = layoutinflater.inflate(0x7f0300af, null);
        a = (TextView)layoutinflater.findViewById(0x7f0d02a1);
        b = (TextView)layoutinflater.findViewById(0x7f0d02a4);
        c = (TextView)layoutinflater.findViewById(0x7f0d02a3);
        d = (TextView)layoutinflater.findViewById(0x7f0d02a2);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        az.q;
        JVM INSTR tableswitch 0 10: default 156
    //                   0 207
    //                   1 216
    //                   2 156
    //                   3 156
    //                   4 225
    //                   5 234
    //                   6 156
    //                   7 156
    //                   8 156
    //                   9 262
    //                   10 271;
           goto _L1 _L2 _L3 _L1 _L1 _L4 _L5 _L1 _L1 _L1 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_271;
_L1:
        f = "GridActivity";
_L8:
        viewgroup = e.P();
        if (viewgroup != null)
        {
            boolean flag;
            if (viewgroup.b().size() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (viewgroup.c().size() <= 0)
            {
                flag1 = false;
            }
            a(flag, flag1);
        }
        return layoutinflater;
_L2:
        f = "GridActivity";
          goto _L8
_L3:
        f = "FreeActivity";
          goto _L8
_L4:
        f = "GridActivity/Template";
          goto _L8
_L5:
        if (ih.C().W() == 1)
        {
            f = "GridActivity/Single/Instagram";
        } else
        {
            f = "GridActivity/Single/Original";
        }
          goto _L8
_L6:
        f = "VideoActivity/Single";
          goto _L8
        f = "CameraActivity/Single";
          goto _L8
    }
}
