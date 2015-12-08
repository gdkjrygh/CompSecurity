// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Vibrator;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.scannerfire.fragment.FragmentCronology;
import com.scannerfire.utils.Utils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.scannerfire.model:
//            CustomListAdapter, QRModel

class val.position
    implements android.view.
{

    final CustomListAdapter this$0;
    private final QRModel val$model;
    private final int val$position;
    private final View val$row;

    public void onClick(View view)
    {
        if (Utils.getVibratePref(a.getApplicationContext()))
        {
            ((Vibrator)a.getSystemService("vibrator")).vibrate(60L);
        }
        Utils.createQuickMenu(a, val$model, val$row, val$position, CustomListAdapter.this);
        ((FragmentCronology)((SherlockFragmentActivity)a).getSupportFragmentManager().getFragments().get(1)).clearCronology();
        view.setBackgroundDrawable(new ColorDrawable(a.getResources().getColor(0x7f09002a)));
        Utils.setLastElem(((QRModel)m.get(val$position)).getId());
    }

    ()
    {
        this$0 = final_customlistadapter;
        val$model = qrmodel;
        val$row = view;
        val$position = I.this;
        super();
    }
}
