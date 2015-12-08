// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.d;
import com.fitbit.data.domain.device.e;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity

public class TapGestureSelector extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    protected String a;
    private List b;
    private String c[];
    private Device d;

    public TapGestureSelector()
    {
    }

    private String[] a()
    {
        String as[] = new String[b.size()];
        for (int i = 0; i < b.size(); i++)
        {
            as[i] = ((d)b.get(i)).b();
        }

        return as;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (isResumed())
        {
            dialoginterface = d.o().a(TrackerOption.TAP_GESTURE);
            d d1 = (d)b.get(i);
            if (!d1.equals(dialoginterface.c()))
            {
                dialoginterface.a(d1);
                an.a().a(d, getActivity());
                ((TrackerDetailsActivity)getActivity()).c();
            }
            dismiss();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = an.a().a(a);
        if (d == null)
        {
            dismiss();
        } else
        {
            b = d.t();
            c = a();
            if (d.o() == null)
            {
                d.a(new TrackerSettings());
                return;
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        e e1 = d.o().a(TrackerOption.TAP_GESTURE);
        int i = b.indexOf(e1.c());
        bundle.setSingleChoiceItems(c, i, this);
        bundle.setTitle(0x7f08035d);
        return bundle.create();
    }
}
