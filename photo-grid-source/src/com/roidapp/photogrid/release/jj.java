// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.photogrid.common.az;
import java.io.File;

// Referenced classes of package com.roidapp.photogrid.release:
//            jk, jl

public final class jj extends DialogFragment
    implements android.view.View.OnClickListener
{

    private ImageView a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private RelativeLayout g;
    private ProgressBar h;
    private Bitmap i;
    private int j;
    private int k;
    private boolean l;
    private String m;
    private Handler n;

    public jj()
    {
        n = new jk(this);
    }

    static int a(jj jj1, int i1)
    {
        jj1.j = i1;
        return i1;
    }

    static Bitmap a(jj jj1, Bitmap bitmap)
    {
        jj1.i = bitmap;
        return bitmap;
    }

    static ProgressBar a(jj jj1)
    {
        return jj1.h;
    }

    private void a()
    {
        if (a != null)
        {
            a.setImageBitmap(null);
        }
        if (i != null && !i.isRecycled())
        {
            i.recycle();
        }
        i = null;
    }

    static boolean a(jj jj1, boolean flag)
    {
        jj1.l = flag;
        return flag;
    }

    static int b(jj jj1, int i1)
    {
        jj1.k = i1;
        return i1;
    }

    static Bitmap b(jj jj1)
    {
        return jj1.i;
    }

    static ImageView c(jj jj1)
    {
        return jj1.a;
    }

    static RelativeLayout d(jj jj1)
    {
        return jj1.g;
    }

    static ImageView e(jj jj1)
    {
        return jj1.b;
    }

    static TextView f(jj jj1)
    {
        return jj1.f;
    }

    static Handler g(jj jj1)
    {
        return jj1.n;
    }

    public final void a(String s)
    {
        m = s;
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131559113: 
        default:
            return;

        case 2131559115: 
            view = new Intent("android.intent.action.VIEW");
            view.setDataAndType(Uri.fromFile(new File(m)), "image/*");
            try
            {
                startActivity(view);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                view.printStackTrace();
            }
            a();
            dismissAllowingStateLoss();
            return;

        case 2131558442: 
            a();
            dismissAllowingStateLoss();
            return;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b5, viewgroup, false);
        if (az.q == 8)
        {
            layoutinflater.setBackgroundResource(0x7f02008e);
        }
        c = (TextView)layoutinflater.findViewById(0x7f0d02ca);
        d = (TextView)layoutinflater.findViewById(0x7f0d002a);
        e = (TextView)layoutinflater.findViewById(0x7f0d02cb);
        a = (ImageView)layoutinflater.findViewById(0x7f0d02ce);
        b = (ImageView)layoutinflater.findViewById(0x7f0d02cf);
        f = (TextView)layoutinflater.findViewById(0x7f0d02d0);
        g = (RelativeLayout)layoutinflater.findViewById(0x7f0d02cd);
        h = (ProgressBar)layoutinflater.findViewById(0x7f0d0094);
        b.setVisibility(8);
        f.setVisibility(8);
        c.setVisibility(8);
        layoutinflater.findViewById(0x7f0d02c9).setOnClickListener(this);
        e.setVisibility(0);
        e.setOnClickListener(this);
        d.setText(0x7f070304);
        d.setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d02cc).setVisibility(8);
        j = getResources().getDisplayMetrics().widthPixels;
        if (az.g == 0)
        {
            viewgroup = new Rect();
            getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(viewgroup);
            if (((Rect) (viewgroup)).top > 0)
            {
                az.g = ((Rect) (viewgroup)).top;
            }
        }
        k = getResources().getDisplayMetrics().heightPixels - az.g - getResources().getDimensionPixelSize(0x7f0900f5);
        viewgroup = m;
        int i1 = j;
        int j1 = k;
        if (a != null)
        {
            a.setImageBitmap(null);
        }
        if (i != null && !i.isRecycled())
        {
            i.recycle();
        }
        if (h != null)
        {
            h.setVisibility(0);
        }
        (new Thread(new jl(this, viewgroup, i1, j1))).start();
        return layoutinflater;
    }

    public final void onPause()
    {
        super.onPause();
        a();
        dismissAllowingStateLoss();
    }
}
