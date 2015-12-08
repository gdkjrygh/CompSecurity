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
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, dc, PhotoView, cs

public final class dj extends Fragment
    implements android.view.View.OnClickListener
{

    private ImageView a;
    private TextView b;
    private PhotoGridActivity c;
    private boolean d;
    private boolean e;

    public dj()
    {
    }

    public final void a()
    {
        d = true;
    }

    public final boolean b()
    {
        return d;
    }

    public final void onAttach(Activity activity)
    {
        c = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131558963 2131558963: default 24
    //                   2131558963 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (c != null && !c.isFinishing())
        {
            c.O().a();
        }
        if (c != null && !c.isFinishing())
        {
            c.a("FragmentEditTip");
            if (e)
            {
                view = new dc();
                c.a(0x7f0d028d, view, "FragmentGridEdit");
                return;
            } else
            {
                view = new cs();
                c.a(0x7f0d028d, view, "FragmentBottomMain");
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030091, null);
        a = (ImageView)layoutinflater.findViewById(0x7f0d0233);
        a.setOnClickListener(this);
        b = (TextView)layoutinflater.findViewById(0x7f0d01b7);
        if (e)
        {
            b.setText(0x7f070182);
            a.setBackgroundResource(0x7f0200b8);
            layoutinflater.setBackgroundResource(0x7f020074);
        } else
        if (d)
        {
            a.setBackgroundResource(0x7f0200ba);
            if (az.q == 1)
            {
                b.setText(0x7f07017a);
            } else
            {
                b.setText(0x7f070183);
            }
            layoutinflater.setBackgroundResource(0x7f0200a6);
            return layoutinflater;
        }
        return layoutinflater;
    }
}
