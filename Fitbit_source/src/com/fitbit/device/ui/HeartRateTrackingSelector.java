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
import com.fitbit.data.domain.device.TrackerHeartRateTrackingType;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.e;
import com.fitbit.util.d;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity

public class HeartRateTrackingSelector extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    protected String a;
    private final TrackerHeartRateTrackingType b[] = TrackerHeartRateTrackingType.getAllTypes();
    private Device c;

    public HeartRateTrackingSelector()
    {
    }

    private String[] a()
    {
        String as[] = new String[b.length];
        for (int i = 0; i < b.length; i++)
        {
            as[i] = b[i].getLocalizedName();
        }

        return as;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (isResumed())
        {
            dialoginterface = c.o().a(TrackerOption.HEART_RATE_TRACKING);
            TrackerHeartRateTrackingType trackerheartratetrackingtype = b[i];
            if (!trackerheartratetrackingtype.equals(dialoginterface))
            {
                dialoginterface.a(trackerheartratetrackingtype);
                an.a().a(c, getActivity());
                ((TrackerDetailsActivity)getActivity()).c();
            }
            dismiss();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = an.a().a(a);
        if (c == null)
        {
            dismiss();
        } else
        if (c.o() == null)
        {
            c.a(new TrackerSettings());
            return;
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        e e1 = c.o().a(TrackerOption.HEART_RATE_TRACKING);
        int i = d.a(b, e1.c());
        bundle.setSingleChoiceItems(a(), i, this);
        bundle.setTitle(0x7f080242);
        return bundle.create();
    }
}
