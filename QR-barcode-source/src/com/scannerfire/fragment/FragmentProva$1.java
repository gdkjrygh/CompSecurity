// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.fragment;

import android.content.Intent;
import android.os.Vibrator;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import com.QRBS.activity.FromURL;
import com.QRBS.activity.ManualInsert;
import com.QRBS.activity.QrActivity;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.scannerfire.fragment:
//            FragmentProva

class this._cls0
    implements android.widget.emClickListener
{

    final FragmentProva this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (Utils.getVibratePref(getActivity().getApplicationContext()))
        {
            vib.vibrate(60L);
        }
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            adapterview = new Intent(getActivity(), com/QRBS/activity/QrActivity);
            getActivity().startActivity(adapterview);
            return;

        case 1: // '\001'
            adapterview = new Intent(getActivity(), com/QRBS/activity/ManualInsert);
            getActivity().startActivity(adapterview);
            return;

        case 2: // '\002'
            FragmentProva.access$0(FragmentProva.this);
            return;

        case 3: // '\003'
            adapterview = new Intent(getActivity(), com/QRBS/activity/FromURL);
            break;
        }
        getActivity().startActivity(adapterview);
    }

    tener()
    {
        this$0 = FragmentProva.this;
        super();
    }
}
