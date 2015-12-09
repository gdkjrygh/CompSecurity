// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.r;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.ax;
import com.fitbit.util.f;

public class UnitsPickActivity extends FitbitActivity
{

    protected Spinner a;
    protected Spinner b;
    protected Spinner c;
    private SparseArray d;
    private SparseArray e;
    private SparseArray f;

    public UnitsPickActivity()
    {
        d = new SparseArray();
        d.put(0, com.fitbit.data.domain.Length.LengthUnits.CM);
        d.put(1, com.fitbit.data.domain.Length.LengthUnits.FEET);
        e = new SparseArray();
        e.put(0, com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG);
        e.put(1, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS);
        e.put(2, com.fitbit.data.domain.WeightLogEntry.WeightUnits.STONE);
        f = new SparseArray();
        f.put(0, com.fitbit.data.domain.WaterLogEntry.WaterUnits.OZ);
        f.put(1, com.fitbit.data.domain.WaterLogEntry.WaterUnits.CUP);
        f.put(2, com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML);
    }

    static SparseArray a(UnitsPickActivity unitspickactivity)
    {
        return unitspickactivity.d;
    }

    static SparseArray b(UnitsPickActivity unitspickactivity)
    {
        return unitspickactivity.e;
    }

    static SparseArray c(UnitsPickActivity unitspickactivity)
    {
        return unitspickactivity.f;
    }

    protected void e()
    {
        Object obj = an.a().b();
        com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits = ((Profile) (obj)).w();
        obj = ((Profile) (obj)).v();
        com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits = r.e();
        a.setAdapter(new ax(getString(0x7f080318), true, new String[] {
            getString(0x7f0802c5), getString(0x7f0802f0)
        }));
        a.setPrompt(getString(0x7f080390));
        a.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final UnitsPickActivity a;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = an.a().b();
                view = (com.fitbit.data.domain.Length.LengthUnits)UnitsPickActivity.a(a).get(i);
                if (!view.equals(adapterview.v()))
                {
                    adapterview.b(view);
                    an.a().a(adapterview, a);
            /* block-local class not found */
            class _cls1 {}

                    com.fitbit.util.f.a(new _cls1(a));
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = UnitsPickActivity.this;
                super();
            }
        });
        b.setAdapter(new ax(getString(0x7f080595), true, new String[] {
            getString(0x7f080315), getString(0x7f080337), getString(0x7f080357)
        }));
        b.setPrompt(getString(0x7f080596));
        b.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final UnitsPickActivity a;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = an.a().b();
                view = (com.fitbit.data.domain.WeightLogEntry.WeightUnits)UnitsPickActivity.b(a).get(i);
                if (!view.equals(adapterview.w()))
                {
                    adapterview.a(view);
                    an.a().a(adapterview, a);
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = UnitsPickActivity.this;
                super();
            }
        });
        c.setAdapter(new ax(getString(0x7f080376), true, new String[] {
            getString(0x7f0802f5), getString(0x7f0802d4), getString(0x7f080320)
        }));
        c.setPrompt(getString(0x7f080588));
        c.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final UnitsPickActivity a;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = r.e();
                view = (com.fitbit.data.domain.WaterLogEntry.WaterUnits)UnitsPickActivity.c(a).get(i);
                if (!view.equals(adapterview))
                {
                    r.a(view);
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = UnitsPickActivity.this;
                super();
            }
        });
        a.setSelection(d.indexOfValue(obj));
        b.setSelection(e.indexOfValue(weightunits));
        c.setSelection(f.indexOfValue(waterunits));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040050);
        c = (Spinner)findViewById(0x7f1101d9);
        a = (Spinner)findViewById(0x7f1101d7);
        b = (Spinner)findViewById(0x7f1101d8);
        e();
    }
}
