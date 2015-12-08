// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.common.d;

// Referenced classes of package com.roidapp.photogrid:
//            ay

public final class ax extends DialogFragment
{

    public ax()
    {
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        if (getActivity() != null && !getActivity().isFinishing())
        {
            bundle = LayoutInflater.from(getActivity()).inflate(0x7f030065, null);
            ((TextView)bundle.findViewById(0x7f0d0014)).setBackgroundDrawable(n.a(0, 0xfff0f0f0, d.a(getResources(), 2.0F)));
            bundle.findViewById(0x7f0d0014).setOnClickListener(new ay(this));
            n.a((ImageView)bundle.findViewById(0x7f0d0186), 0x7f0203da);
            bundle = (new android.app.AlertDialog.Builder(getActivity())).setView(bundle).create();
            bundle.setCanceledOnTouchOutside(false);
            return bundle;
        } else
        {
            return super.onCreateDialog(bundle);
        }
    }
}
