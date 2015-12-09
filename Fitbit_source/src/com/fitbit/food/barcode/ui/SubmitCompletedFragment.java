// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.net.Uri;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.food.barcode.c.c;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            ScanAnotherBarcodeFragment, SubmitCompletedFragment_

public class SubmitCompletedFragment extends ScanAnotherBarcodeFragment
{

    private static final String e = "SubmitCompletedFragment";
    protected LinearLayout c;
    protected ArrayList d;

    public SubmitCompletedFragment()
    {
    }

    public static SubmitCompletedFragment a(ArrayList arraylist)
    {
        SubmitCompletedFragment submitcompletedfragment = SubmitCompletedFragment_.d().a();
        submitcompletedfragment.d = arraylist;
        return submitcompletedfragment;
    }

    protected void b()
    {
        a.setText(0x7f080076);
        b.setText(0x7f080075);
        c();
    }

    protected void c()
    {
        c.removeAllViews();
        if (d != null)
        {
            Iterator iterator = d.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Uri uri = (Uri)iterator.next();
                if (uri != null)
                {
                    LoadablePicassoImageView loadablepicassoimageview = new LoadablePicassoImageView(getActivity());
                    loadablepicassoimageview.a(true);
                    loadablepicassoimageview.a(com.fitbit.ui.loadable.LoadablePicassoImageView.MeasureMode.b);
                    loadablepicassoimageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                    android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F);
                    layoutparams.setMargins(20, 20, 20, 20);
                    c.addView(loadablepicassoimageview, layoutparams);
                    loadablepicassoimageview.a(uri.toString());
                }
            } while (true);
        }
    }

    public void onDestroy()
    {
        if (isRemoving())
        {
            com.fitbit.food.barcode.c.c.a(getActivity());
        }
        super.onDestroy();
    }
}
