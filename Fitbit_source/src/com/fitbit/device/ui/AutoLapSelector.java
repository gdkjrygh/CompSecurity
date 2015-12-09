// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.AutoLap;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.e;
import java.util.List;

public class AutoLapSelector extends DialogFragment
    implements android.content.DialogInterface.OnClickListener, android.widget.AdapterView.OnItemSelectedListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private static final String a = "encoded_id";
    private String b;
    private Device c;
    private e d;
    private com.fitbit.data.domain.Length.LengthUnits e;
    private List f;
    private int g;
    private Spinner h;
    private Spinner i;
    private Switch j;

    public AutoLapSelector()
    {
        g = -1;
    }

    private int a(Spinner spinner, e e1)
    {
        spinner = spinner.getAdapter();
        for (int k = 0; k < spinner.getCount(); k++)
        {
            if (((AutoLap)spinner.getItem(k)).a().equals(e1.c()))
            {
                return k;
            }
        }

        return 0;
    }

    static com.fitbit.data.domain.Length.LengthUnits a(AutoLapSelector autolapselector)
    {
        return autolapselector.e;
    }

    public static AutoLapSelector a(String s)
    {
        AutoLapSelector autolapselector = new AutoLapSelector();
        Bundle bundle = new Bundle();
        bundle.putString("encoded_id", s);
        autolapselector.setArguments(bundle);
        return autolapselector;
    }

    private void a()
    {
        boolean flag;
        if (((String)d.c()).contains("DISTANCE"))
        {
            i.setSelection(0);
            flag = true;
        } else
        if (((String)d.c()).contains("TIME"))
        {
            i.setSelection(1);
            flag = true;
        } else
        {
            flag = false;
        }
        j.setChecked(flag);
    }

    private void b()
    {
    /* block-local class not found */
    class a {}

        h.setAdapter(new a(com.fitbit.data.domain.device.AutoLap.AutoLapType.TIME, f));
    }

    private void c()
    {
        com.fitbit.data.domain.device.AutoLap.AutoLapType autolaptype;
        if (e.equals(com.fitbit.data.domain.Length.LengthUnits.MILES))
        {
            autolaptype = com.fitbit.data.domain.device.AutoLap.AutoLapType.DISTANCE_MILE;
        } else
        {
            autolaptype = com.fitbit.data.domain.device.AutoLap.AutoLapType.DISTANCE_KM;
        }
        h.setAdapter(new a(autolaptype, f));
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            i.setEnabled(true);
            h.setEnabled(true);
            j.setText(0x7f080354);
            return;
        } else
        {
            i.setEnabled(false);
            h.setEnabled(false);
            j.setText(0x7f080353);
            return;
        }
    }

    public void onClick(DialogInterface dialoginterface, int k)
    {
        k;
        JVM INSTR tableswitch -1 -1: default 20
    //                   -1 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if ((dialoginterface = (AutoLap)h.getSelectedItem()) != null)
        {
            if (j.isChecked())
            {
                dialoginterface = dialoginterface.a();
            } else
            {
                dialoginterface = "OFF";
            }
            if (!dialoginterface.equals(d.c()))
            {
                d.a(dialoginterface);
                an.a().a(c, getActivity());
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = getArguments().getString("encoded_id");
        c = an.a().a(b);
        e = an.a().b().t();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getActivity().getLayoutInflater().inflate(0x7f040083, null);
        j = (Switch)bundle.findViewById(0x7f1100e3);
        j.setOnCheckedChangeListener(this);
        h = (Spinner)bundle.findViewById(0x7f110242);
        i = (Spinner)bundle.findViewById(0x7f110243);
    /* block-local class not found */
    class b {}

        i.setAdapter(new b());
        i.setOnItemSelectedListener(this);
        d = c.o().a(TrackerOption.AUTO_LAP);
        f = c.C();
        a();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setView(bundle);
        builder.setPositiveButton(0x7f08042e, this);
        builder.setNegativeButton(0x7f0802c2, null);
        builder.setTitle(0x7f080060);
        return builder.create();
    }

    public void onItemSelected(AdapterView adapterview, View view, int k, long l)
    {
        int i1;
        switch (adapterview.getId())
        {
        default:
            return;

        case 2131821123: 
            i1 = h.getSelectedItemPosition();
            break;
        }
    /* block-local class not found */
    class FrequencyType {}

        if (adapterview.getItemAtPosition(k) == FrequencyType.a)
        {
            c();
        } else
        {
            b();
        }
        k = a(h, d);
        if (g != -1)
        {
            k = g;
        }
        h.setSelection(k);
        g = i1;
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        i.setSelection(0);
        h.setSelection(0);
    }
}
