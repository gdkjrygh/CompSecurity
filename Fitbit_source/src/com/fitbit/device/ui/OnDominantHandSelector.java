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
import com.fitbit.data.domain.device.e;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity

public class OnDominantHandSelector extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    protected String a;
    private Device b;

    public OnDominantHandSelector()
    {
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (isResumed())
        {
            dialoginterface = b.o().a(TrackerOption.ON_DOMINANT_HAND);
            boolean flag;
            if (i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (((Boolean)dialoginterface.c()).booleanValue() != flag)
            {
                dialoginterface.a(Boolean.valueOf(flag));
                an.a().a(b, getActivity());
                ((TrackerDetailsActivity)getActivity()).c();
            }
            dismiss();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = an.a().a(a);
        if (b == null)
        {
            dismiss();
        } else
        if (b.o() == null)
        {
            b.a(new TrackerSettings());
            return;
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        e e1 = b.o().a(TrackerOption.ON_DOMINANT_HAND);
        String s = getString(0x7f080548);
        String s1 = getString(0x7f080550);
        int i;
        if (((Boolean)e1.c()).booleanValue())
        {
            i = 0;
        } else
        {
            i = 1;
        }
        bundle.setSingleChoiceItems(new String[] {
            s, s1
        }, i, this);
        bundle.setTitle(0x7f08037c);
        return bundle.create();
    }
}
