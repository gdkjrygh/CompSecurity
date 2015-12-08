// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.ui.activity.LastFmLoginDialog;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import dtx;
import fop;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            AbstractSettingsCell

public class LastFmSettingsCell extends AbstractSettingsCell
{

    private SwitchCompat d;
    private String e;
    private String f;
    private android.widget.CompoundButton.OnCheckedChangeListener g;

    public LastFmSettingsCell(Context context)
    {
        super(context);
        e = "";
        f = "";
        a(context);
    }

    public LastFmSettingsCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = "";
        f = "";
        a(context);
    }

    static SwitchCompat a(LastFmSettingsCell lastfmsettingscell)
    {
        return lastfmsettingscell.d;
    }

    private void a(Context context)
    {
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f03012f, this);
        super.onFinishInflate();
        a.c();
        a.a(false);
        d = new SwitchCompat(getContext());
        a.a(d);
    }

    public static void a(Context context, String s, String s1)
    {
        Object obj = new ContentValues();
        ((ContentValues) (obj)).put("lastfm_username", s);
        ((ContentValues) (obj)).put("lastfm_password", s1);
        context.getContentResolver().update(dtx.a, ((ContentValues) (obj)), null, null);
        s1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.a, com.spotify.mobile.android.util.ClientEvent.SubEvent.bv);
        obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.a, com.spotify.mobile.android.util.ClientEvent.SubEvent.bw);
        s1.a("value", String.valueOf(s));
        ((ClientEvent) (obj)).a("value", "");
        dmz.a(fop);
        fop.a(context, ViewUri.H, s1);
        fop.a(context, ViewUri.H, ((ClientEvent) (obj)));
    }

    static void b(LastFmSettingsCell lastfmsettingscell)
    {
        Context context = lastfmsettingscell.getContext();
        context.startActivity(LastFmLoginDialog.a(context, lastfmsettingscell.e));
    }

    static String c(LastFmSettingsCell lastfmsettingscell)
    {
        return lastfmsettingscell.e;
    }

    protected final void a(ContentValues contentvalues)
    {
    }

    public final void a(Cursor cursor)
    {
        e = cursor.getString(cursor.getColumnIndexOrThrow("lastfm_username"));
        f = cursor.getString(cursor.getColumnIndexOrThrow("lastfm_password"));
        d.setOnCheckedChangeListener(null);
        cursor = d;
        boolean flag;
        if (!TextUtils.isEmpty(e) && "xXxXxXxXx".equals(f))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cursor.setChecked(flag);
        d.setOnCheckedChangeListener(g);
        setOnClickListener(new android.view.View.OnClickListener() {

            private LastFmSettingsCell a;

            public final void onClick(View view)
            {
                if (!LastFmSettingsCell.a(a).isChecked())
                {
                    LastFmSettingsCell.a(a).setChecked(true);
                    return;
                } else
                {
                    LastFmSettingsCell.b(a);
                    return;
                }
            }

            
            {
                a = LastFmSettingsCell.this;
                super();
            }
        });
        g = new android.widget.CompoundButton.OnCheckedChangeListener() {

            private LastFmSettingsCell a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
            {
                if (flag1)
                {
                    LastFmSettingsCell.b(a);
                    return;
                } else
                {
                    LastFmSettingsCell.a(a.getContext(), LastFmSettingsCell.c(a), "");
                    return;
                }
            }

            
            {
                a = LastFmSettingsCell.this;
                super();
            }
        };
        d.setOnCheckedChangeListener(g);
    }

    public final void a(String s)
    {
    }
}
