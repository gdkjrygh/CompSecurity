// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Vibrator;
import android.view.View;
import android.widget.AdapterView;
import com.scannerfire.model.QRModel;
import com.scannerfire.utils.Utils;
import java.util.ArrayList;

// Referenced classes of package com.scannerfire.fragment:
//            FragmentCronology

class val.array
    implements android.widget.ickListener
{

    final FragmentCronology this$0;
    private final ArrayList val$array;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (Utils.getVibratePref(startA.getApplicationContext()))
        {
            ((Vibrator)startA.getSystemService("vibrator")).vibrate(60L);
        }
        Utils.createQuickMenu(startA, (QRModel)val$array.get(i), view, i, arrayAdapter);
        clearCronology();
        view.setBackgroundDrawable(new ColorDrawable(getResources().getColor(0x7f09002a)));
        Utils.setLastElem(((QRModel)val$array.get(i)).getId());
    }

    r()
    {
        this$0 = final_fragmentcronology;
        val$array = ArrayList.this;
        super();
    }
}
