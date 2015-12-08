// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.b;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.b.a;
import com.roidapp.baselib.b.h;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.cloud.b:
//            f, d

public final class c extends DialogFragment
    implements android.view.View.OnClickListener
{

    private d a;
    private WeakReference b;
    private String c;

    public c()
    {
    }

    static void a(c c1, d d1, String s)
    {
        c1.a = d1;
        c1.c = s;
    }

    static void a(c c1, f f1)
    {
        c1.b = new WeakReference(f1);
    }

    public final void onClick(View view)
    {
label0:
        {
            if (view.getId() != 0x7f0d04f3)
            {
                if (view.getId() != 0x7f0d04f6 || a == null || b == null)
                {
                    break label0;
                }
                view = (f)b.get();
                if (view != null)
                {
                    view.a(a);
                }
            }
            dismissAllowingStateLoss();
        }
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        setStyle(0, 0x7f0b0027);
        return super.onCreateDialog(bundle);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
label0:
        {
            getDialog().setCanceledOnTouchOutside(false);
            layoutinflater = layoutinflater.inflate(0x7f03013c, null);
            layoutinflater.findViewById(0x7f0d04f3).setOnClickListener(this);
            if (a != null && c != null)
            {
                viewgroup = (ImageView)layoutinflater.findViewById(0x7f0d04f5);
                bundle = (TextView)layoutinflater.findViewById(0x7f0d04f7);
                TextView textview = (TextView)layoutinflater.findViewById(0x7f0d04f4);
                layoutinflater.findViewById(0x7f0d04f6).setOnClickListener(this);
                bundle.setText(a.f);
                textview.setText(a.e);
                bundle = viewgroup.getLayoutParams();
                bundle = h.a(c, ((android.view.ViewGroup.LayoutParams) (bundle)).width, ((android.view.ViewGroup.LayoutParams) (bundle)).height);
                if (bundle == null)
                {
                    break label0;
                }
                viewgroup.setImageBitmap(bundle);
            }
            return layoutinflater;
        }
        viewgroup.setImageBitmap(com.roidapp.baselib.b.a.a());
        return layoutinflater;
    }
}
