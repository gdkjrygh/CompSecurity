// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.widget.ListView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.TrackerSettings;
import java.util.List;

public class ClockFaceSelector extends DialogFragment
{

    protected String a;
    private List b;
    private Device c;
    private ListView d;
    private a e;

    public ClockFaceSelector()
    {
    }

    static Device a(ClockFaceSelector clockfaceselector)
    {
        return clockfaceselector.c;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = an.a().a(a);
        if (c == null || c.s() == null)
        {
            dismiss();
        } else
        {
            b = c.s();
            if (c.o() == null)
            {
                c.a(new TrackerSettings());
                return;
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        d = (ListView)getActivity().getLayoutInflater().inflate(0x7f040137, null);
    /* block-local class not found */
    class a {}

        e = new a(getActivity(), b);
        d.setAdapter(e);
        d.setChoiceMode(1);
        d.setOnItemClickListener(new _cls1());
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setView(d);
        bundle.setTitle(0x7f080102);
        return bundle.create();
    }

    /* member class not found */
    class _cls1 {}

}
