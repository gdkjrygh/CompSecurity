// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEventFactory;
import dmz;
import frb;
import fub;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            AbstractSettingsCell

public class ToggleButtonSettingsCell extends AbstractSettingsCell
{

    public Flags d;
    public fub e;
    private com.spotify.mobile.android.util.ClientEvent.SubEvent f;
    private Reason g;
    private boolean h;
    private SwitchCompat i;
    private android.view.View.OnClickListener j = new android.view.View.OnClickListener() {

        private ToggleButtonSettingsCell a;

        public final void onClick(View view)
        {
            ToggleButtonSettingsCell.a(a).toggle();
        }

            
            {
                a = ToggleButtonSettingsCell.this;
                super();
            }
    };
    private android.widget.CompoundButton.OnCheckedChangeListener k = new android.widget.CompoundButton.OnCheckedChangeListener() {

        private ToggleButtonSettingsCell a;

        public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            if (flag != ToggleButtonSettingsCell.b(a))
            {
                if (ToggleButtonSettingsCell.c(a) != Reason.a)
                {
                    dmz.a(frb);
                    frb.a(ToggleButtonSettingsCell.d(a), ToggleButtonSettingsCell.c(a), null, null).a(a.getContext());
                    ToggleButtonSettingsCell.a(a).setChecked(ToggleButtonSettingsCell.b(a));
                } else
                {
                    a.a();
                    if (ToggleButtonSettingsCell.e(a) != null)
                    {
                        ToggleButtonSettingsCell.e(a).a(flag);
                        return;
                    }
                }
            }
        }

            
            {
                a = ToggleButtonSettingsCell.this;
                super();
            }
    };

    public ToggleButtonSettingsCell(Context context)
    {
        super(context);
        g = Reason.a;
    }

    public ToggleButtonSettingsCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = Reason.a;
    }

    static SwitchCompat a(ToggleButtonSettingsCell togglebuttonsettingscell)
    {
        return togglebuttonsettingscell.i;
    }

    public static ToggleButtonSettingsCell a(Context context, ViewGroup viewgroup)
    {
        return (ToggleButtonSettingsCell)LayoutInflater.from(context).inflate(0x7f03012f, viewgroup, false);
    }

    static boolean b(ToggleButtonSettingsCell togglebuttonsettingscell)
    {
        return togglebuttonsettingscell.h;
    }

    static Reason c(ToggleButtonSettingsCell togglebuttonsettingscell)
    {
        return togglebuttonsettingscell.g;
    }

    static Flags d(ToggleButtonSettingsCell togglebuttonsettingscell)
    {
        return togglebuttonsettingscell.d;
    }

    static fub e(ToggleButtonSettingsCell togglebuttonsettingscell)
    {
        return togglebuttonsettingscell.e;
    }

    protected final void a(ContentValues contentvalues)
    {
        boolean flag = i.isChecked();
        contentvalues.put(b, Boolean.valueOf(flag));
        a(f, Boolean.valueOf(flag));
    }

    public final void a(Cursor cursor)
    {
        setOnClickListener(null);
        i.setOnCheckedChangeListener(null);
        boolean flag;
        if (cursor.getInt(cursor.getColumnIndexOrThrow(b)) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        i.setChecked(h);
        setOnClickListener(j);
        i.setOnCheckedChangeListener(k);
    }

    public final void a(String s)
    {
        super.a(s);
        new ClientEventFactory();
        f = ClientEventFactory.a(s);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a.c();
        a.a(false);
        i = new SwitchCompat(getContext());
        a.a(i);
    }
}
