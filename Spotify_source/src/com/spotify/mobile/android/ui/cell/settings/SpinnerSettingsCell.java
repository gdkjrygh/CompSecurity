// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEventFactory;
import dmz;
import frb;
import fua;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            AbstractSettingsCell

public class SpinnerSettingsCell extends AbstractSettingsCell
{

    public Spinner d;
    public fua e;
    public Reason f[];
    public Flags g;
    private com.spotify.mobile.android.util.ClientEvent.SubEvent h;
    private int i;
    private android.widget.AdapterView.OnItemSelectedListener j = new android.widget.AdapterView.OnItemSelectedListener() {

        private SpinnerSettingsCell a;

        public final void onItemSelected(AdapterView adapterview, View view, int k, long l)
        {
            if (SpinnerSettingsCell.a(a) != null && SpinnerSettingsCell.a(a).length > k && SpinnerSettingsCell.a(a)[k] != Reason.a)
            {
                dmz.a(frb);
                frb.a(SpinnerSettingsCell.b(a), SpinnerSettingsCell.a(a)[k], null, null).a(a.getContext());
                SpinnerSettingsCell.d(a).setSelection(SpinnerSettingsCell.c(a));
            } else
            {
                int i1 = SpinnerSettingsCell.c(a);
                SpinnerSettingsCell.a(a, k);
                if (i1 != SpinnerSettingsCell.c(a))
                {
                    a.a();
                    return;
                }
            }
        }

        public final void onNothingSelected(AdapterView adapterview)
        {
            SpinnerSettingsCell.a(a, -1);
        }

            
            {
                a = SpinnerSettingsCell.this;
                super();
            }
    };

    public SpinnerSettingsCell(Context context)
    {
        super(context);
        i = -1;
    }

    public SpinnerSettingsCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = -1;
    }

    public SpinnerSettingsCell(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        i = -1;
    }

    static int a(SpinnerSettingsCell spinnersettingscell, int k)
    {
        spinnersettingscell.i = k;
        return k;
    }

    public static SpinnerSettingsCell a(Context context, ViewGroup viewgroup)
    {
        return (SpinnerSettingsCell)LayoutInflater.from(context).inflate(0x7f03012e, viewgroup, false);
    }

    static Reason[] a(SpinnerSettingsCell spinnersettingscell)
    {
        return spinnersettingscell.f;
    }

    static Flags b(SpinnerSettingsCell spinnersettingscell)
    {
        return spinnersettingscell.g;
    }

    static int c(SpinnerSettingsCell spinnersettingscell)
    {
        return spinnersettingscell.i;
    }

    static Spinner d(SpinnerSettingsCell spinnersettingscell)
    {
        return spinnersettingscell.d;
    }

    protected final void a(ContentValues contentvalues)
    {
        if (i >= 0)
        {
            int k = e.a(i);
            contentvalues.put(b, Integer.valueOf(k));
            a(h, Integer.valueOf(k));
        }
    }

    public final void a(Cursor cursor)
    {
        d.setOnItemSelectedListener(null);
        i = e.b(cursor.getInt(cursor.getColumnIndexOrThrow(b)));
        if (i >= d.getCount())
        {
            i = d.getCount() - 1;
        }
        d.setSelection(i);
        d.setOnItemSelectedListener(j);
    }

    public final void a(String s)
    {
        super.a(s);
        new ClientEventFactory();
        h = ClientEventFactory.a(s);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a.c();
        a.a(false);
        d = new Spinner(getContext());
        a.a(d);
    }
}
