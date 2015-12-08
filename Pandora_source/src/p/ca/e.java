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
import java.text.DateFormatSymbols;

public class e extends f
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnMultiChoiceClickListener
{

    private AlarmData a;
    private com.pandora.android.data.AlarmData.c b;

    public e()
    {
    }

    public static e a(AlarmData alarmdata)
    {
        e e1 = new e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("intent_alarm_data", alarmdata);
        e1.setArguments(bundle);
        return e1;
    }

    private String[] a()
    {
        String as[] = (new DateFormatSymbols()).getWeekdays();
        return (new String[] {
            as[2], as[3], as[4], as[5], as[6], as[7], as[1]
        });
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(b);
        b.a.e().a(new p.bz.b(a, false));
    }

    public void onClick(DialogInterface dialoginterface, int i, boolean flag)
    {
        b.a(i, flag);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        a = (AlarmData)getArguments().getParcelable("intent_alarm_data");
        b = new com.pandora.android.data.AlarmData.c(a.g().a());
        bundle = a();
        boolean aflag[] = b.b();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle(0x7f08008d).setMultiChoiceItems(bundle, aflag, this).setPositiveButton(0x7f0801f5, this);
        return builder.create();
    }
}
