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
import android.widget.CompoundButton;
import com.spotify.android.paste.widget.ListItemView;
import dmz;
import dvq;
import gcw;
import gin;
import gio;
import giq;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            AbstractSettingsCell

public class BroadcastSettingsCell extends AbstractSettingsCell
{

    private SwitchCompat d;
    private boolean e;

    public BroadcastSettingsCell(Context context)
    {
        super(context);
        a(context);
    }

    public BroadcastSettingsCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public BroadcastSettingsCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    static SwitchCompat a(BroadcastSettingsCell broadcastsettingscell)
    {
        return broadcastsettingscell.d;
    }

    private void a(Context context)
    {
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f03012f, this);
        super.onFinishInflate();
        a.c();
        a.a(false);
        d = new SwitchCompat(getContext());
        a.a(d);
        setOnClickListener(new android.view.View.OnClickListener() {

            private BroadcastSettingsCell a;

            public final void onClick(View view)
            {
                BroadcastSettingsCell.a(a).toggle();
            }

            
            {
                a = BroadcastSettingsCell.this;
                super();
            }
        });
        d.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private BroadcastSettingsCell a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag != BroadcastSettingsCell.b(a))
                {
                    BroadcastSettingsCell.a(a, flag);
                    a.a(null);
                }
            }

            
            {
                a = BroadcastSettingsCell.this;
                super();
            }
        });
    }

    static boolean a(BroadcastSettingsCell broadcastsettingscell, boolean flag)
    {
        broadcastsettingscell.e = flag;
        return flag;
    }

    static boolean b(BroadcastSettingsCell broadcastsettingscell)
    {
        return broadcastsettingscell.e;
    }

    protected final void a(ContentValues contentvalues)
    {
        contentvalues = ((giq)dmz.a(giq)).b(getContext()).b();
        contentvalues.a(dvq.a, e);
        contentvalues.b();
    }

    public final void a(Cursor cursor)
    {
        gin gin1 = ((giq)dmz.a(giq)).b(getContext());
        boolean flag = true;
        if (!gin1.f(dvq.a))
        {
            flag = gcw.a(cursor, "post_to_facebook");
        }
        e = gin1.a(dvq.a, flag);
        d.setChecked(e);
    }
}
