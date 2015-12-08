// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.n;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity

public final class re extends DialogFragment
    implements android.view.View.OnClickListener
{

    private android.view.View.OnClickListener a;

    public re()
    {
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        a = onclicklistener;
    }

    public final void onClick(View view)
    {
        android.support.v4.app.FragmentActivity fragmentactivity;
        if (isAdded())
        {
            if (((fragmentactivity = getActivity()) instanceof ParentActivity) && !fragmentactivity.isFinishing() && !((ParentActivity)fragmentactivity).h())
            {
                switch (view.getId())
                {
                case 2131559635: 
                default:
                    return;

                case 2131559634: 
                    dismiss();
                    return;

                case 2131559636: 
                    break;
                }
                if (a != null)
                {
                    a.onClick(view);
                }
                dismiss();
                return;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03012f, viewgroup, false);
        viewgroup = layoutinflater.findViewById(0x7f0d04d2);
        n.a((ImageView)viewgroup, 0x7f02036b);
        viewgroup.setOnClickListener(this);
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0d04d3);
        if (viewgroup != null)
        {
            viewgroup.setText(Html.fromHtml(getResources().getString(0x7f070236)));
        }
        layoutinflater.findViewById(0x7f0d04d4).setOnClickListener(this);
        return layoutinflater;
    }
}
