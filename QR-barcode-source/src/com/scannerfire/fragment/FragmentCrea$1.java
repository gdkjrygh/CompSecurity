// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.fragment;

import android.content.Intent;
import android.os.Vibrator;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import com.QRBS.activity.CreateApp;
import com.QRBS.activity.CreateBookmarks;
import com.QRBS.activity.CreateCalendar;
import com.QRBS.activity.CreateEmail;
import com.QRBS.activity.CreateGps;
import com.QRBS.activity.CreateTel;
import com.QRBS.activity.CreateUrl;
import com.QRBS.activity.FreeText;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.scannerfire.fragment:
//            FragmentCrea

class this._cls0
    implements android.widget.temClickListener
{

    final FragmentCrea this$0;

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
            FragmentCrea.access$0(FragmentCrea.this);
            return;

        case 1: // '\001'
            adapterview = new Intent(getActivity(), com/QRBS/activity/CreateTel);
            getActivity().startActivity(adapterview);
            return;

        case 2: // '\002'
            adapterview = new Intent(getActivity(), com/QRBS/activity/CreateUrl);
            getActivity().startActivity(adapterview);
            return;

        case 3: // '\003'
            adapterview = new Intent(getActivity(), com/QRBS/activity/CreateEmail);
            getActivity().startActivity(adapterview);
            return;

        case 4: // '\004'
            adapterview = new Intent(getActivity(), com/QRBS/activity/CreateApp);
            getActivity().startActivity(adapterview);
            return;

        case 5: // '\005'
            adapterview = new Intent(getActivity(), com/QRBS/activity/CreateGps);
            getActivity().startActivity(adapterview);
            return;

        case 6: // '\006'
            adapterview = new Intent(getActivity(), com/QRBS/activity/FreeText);
            getActivity().startActivity(adapterview);
            return;

        case 7: // '\007'
            adapterview = new Intent(getActivity(), com/QRBS/activity/CreateBookmarks);
            getActivity().startActivity(adapterview);
            return;

        case 8: // '\b'
            adapterview = new Intent(getActivity(), com/QRBS/activity/CreateCalendar);
            break;
        }
        getActivity().startActivity(adapterview);
    }

    stener()
    {
        this$0 = FragmentCrea.this;
        super();
    }
}
