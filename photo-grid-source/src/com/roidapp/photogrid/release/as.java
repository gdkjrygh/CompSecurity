// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.common.b;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, ih, at, au, 
//            av, aw, ax, fm

public final class as extends DialogFragment
{

    private PhotoGridActivity a;
    private EditText b;
    private EditText c;
    private fm d;
    private boolean e;
    private int f;
    private float g;
    private float h;

    public as()
    {
        e = false;
    }

    static float a(as as1, float f1)
    {
        as1.g = f1;
        return f1;
    }

    static boolean a(as as1)
    {
        String s = as1.b.getText().toString();
        String s1 = as1.c.getText().toString();
        if (s.equals(""))
        {
            an.a(new WeakReference(as1.a), as1.a.getString(0x7f07011b));
            as1.b.requestFocus();
        } else
        if (s1.equals(""))
        {
            an.a(new WeakReference(as1.a), as1.a.getString(0x7f07011b));
            as1.c.requestFocus();
        } else
        if (s.equals("."))
        {
            an.a(new WeakReference(as1.a), as1.a.getString(0x7f070119));
            as1.b.requestFocus();
        } else
        if (s1.equals("."))
        {
            an.a(new WeakReference(as1.a), as1.a.getString(0x7f070119));
            as1.c.requestFocus();
        } else
        {
            float f1 = Float.parseFloat(s);
            float f2 = Float.parseFloat(s1);
            if (f1 <= 0.0F)
            {
                an.a(new WeakReference(as1.a), as1.a.getString(0x7f070119));
                as1.b.requestFocus();
            } else
            if (f2 <= 0.0F)
            {
                an.a(new WeakReference(as1.a), as1.a.getString(0x7f070119));
                as1.c.requestFocus();
            } else
            if (f1 / f2 > 2.0F || f2 / f1 > 2.0F)
            {
                an.a(new WeakReference(as1.a), as1.a.getString(0x7f07011a));
            } else
            {
                as1.e = true;
                return true;
            }
        }
        return false;
    }

    static float b(as as1)
    {
        return as1.g;
    }

    static float b(as as1, float f1)
    {
        as1.h = f1;
        return f1;
    }

    static EditText c(as as1)
    {
        return as1.b;
    }

    static EditText d(as as1)
    {
        return as1.c;
    }

    static float e(as as1)
    {
        return as1.h;
    }

    static boolean f(as as1)
    {
        as1.e = false;
        return false;
    }

    static PhotoGridActivity g(as as1)
    {
        return as1.a;
    }

    static fm h(as as1)
    {
        return as1.d;
    }

    public final void a(fm fm1, int i)
    {
        d = fm1;
        f = i;
    }

    public final void onAttach(Activity activity)
    {
        com.roidapp.photogrid.common.b.a("CustomRatioDialogFragment/onAttach");
        a = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        com.roidapp.photogrid.common.b.a("CustomRatioDialogFragment/onCreateView");
        layoutinflater = layoutinflater.inflate(0x7f03008b, viewgroup, false);
        b = (EditText)layoutinflater.findViewById(0x7f0d0212);
        c = (EditText)layoutinflater.findViewById(0x7f0d0214);
        viewgroup = (LinearLayout)layoutinflater.findViewById(0x7f0d0218);
        bundle = (SeekBar)layoutinflater.findViewById(0x7f0d0216);
        ImageView imageview = (ImageView)layoutinflater.findViewById(0x7f0d0210);
        float af[] = ih.C().Z();
        if (af != null)
        {
            float f1 = (new BigDecimal(af[0])).setScale(2, 4).floatValue();
            float f2 = (new BigDecimal(af[1])).setScale(2, 4).floatValue();
            if (af[2] == 0.0F)
            {
                b.setText(String.valueOf(f1));
                c.setText(String.valueOf(f2));
                bundle.setProgress((int)af[3]);
                if (f1 > f2)
                {
                    b.requestFocus();
                } else
                {
                    c.requestFocus();
                }
            } else
            {
                b.setText(String.valueOf(f2));
                c.setText(String.valueOf(f1));
                bundle.setProgress(100 - (int)af[3]);
                if (f2 > f1)
                {
                    b.requestFocus();
                } else
                {
                    c.requestFocus();
                }
            }
        } else
        {
            bundle.setProgress(50);
        }
        b.setOnEditorActionListener(new at(this));
        c.setOnEditorActionListener(new au(this));
        b.setSelection(b.getText().length());
        c.setSelection(c.getText().length());
        imageview.setOnClickListener(new av(this));
        bundle.setOnSeekBarChangeListener(new aw(this));
        viewgroup.setOnClickListener(new ax(this));
        return layoutinflater;
    }

    public final void onDestroy()
    {
        com.roidapp.photogrid.common.b.a("CustomRatioDialogFragment/onDestroy");
        if (!e)
        {
            if (d != null)
            {
                d.a(f);
            }
            a.i = false;
        }
        super.onDestroy();
    }
}
