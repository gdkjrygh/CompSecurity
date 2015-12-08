// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.f;
import com.pandora.android.data.AlarmData;
import com.pandora.android.provider.b;

public class g extends f
    implements android.content.DialogInterface.OnClickListener
{

    private AlarmData a;

    public g()
    {
    }

    public static g a(AlarmData alarmdata)
    {
        g g1 = new g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("intent_alarm_data", alarmdata);
        g1.setArguments(bundle);
        return g1;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.d(i * 5);
        b.a.e().a(new p.bz.b(a, false));
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        a = (AlarmData)getArguments().getParcelable("intent_alarm_data");
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(0x7f080095).setItems(0x7f0e0002, this);
        return bundle.create();
    }
}
