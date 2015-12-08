// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import an;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.ui.activity.FacebookPlaceholderActivity;
import com.spotify.mobile.android.ui.activity.PermissionsActivity;
import com.spotify.mobile.android.util.Assertion;
import ctz;
import cu;
import da;
import dty;
import dzs;
import gcw;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            AbstractSettingsCell

public class FacebookSettingsCell extends AbstractSettingsCell
{

    private SwitchCompat d;
    private boolean e;
    private boolean f;
    private dzs g;
    private final String h[] = {
        "permissions"
    };
    private android.view.View.OnClickListener i = new android.view.View.OnClickListener() {

        private FacebookSettingsCell a;

        public final void onClick(View view)
        {
            Assertion.a(a.getContext(), "Context was null, onClick called before view is instantiated properly.");
            view = new Intent(a.getContext(), com/spotify/mobile/android/ui/activity/FacebookPlaceholderActivity);
            a.getContext().startActivity(view);
        }

            
            {
                a = FacebookSettingsCell.this;
                super();
            }
    };
    private android.view.View.OnClickListener j = new android.view.View.OnClickListener() {

        private FacebookSettingsCell a;

        public final void onClick(View view)
        {
            if (FacebookSettingsCell.a(a) != null)
            {
                FacebookSettingsCell.a(a).toggle();
            }
        }

            
            {
                a = FacebookSettingsCell.this;
                super();
            }
    };
    private android.widget.CompoundButton.OnCheckedChangeListener k = new android.widget.CompoundButton.OnCheckedChangeListener() {

        final FacebookSettingsCell a;

        public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            if (flag != FacebookSettingsCell.b(a))
            {
                a.a();
                if (flag)
                {
                    FacebookSettingsCell.d(a).a(new an(this) {

                        private _cls3 a;

                        public final da a(Bundle bundle)
                        {
                            return new cu(a.a.getContext(), dty.a, FacebookSettingsCell.c(a.a), null, null);
                        }

                        public final void a()
                        {
                        }

                        public final void a(Object obj)
                        {
                            obj = (Cursor)obj;
                            ctz.a(obj);
                            if (((Cursor) (obj)).moveToFirst())
                            {
                                obj = ((Cursor) (obj)).getString(0);
                                if (!TextUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).contains("publish_actions"))
                                {
                                    Assertion.a(a.a.getContext(), "Context is null, checked state changed before view was initialized.");
                                    obj = new Intent(a.a.getContext(), com/spotify/mobile/android/ui/activity/PermissionsActivity);
                                    a.a.getContext().startActivity(((Intent) (obj)));
                                }
                                FacebookSettingsCell.d(a.a).a();
                            }
                        }

            
            {
                a = _pcls3;
                super();
            }
                    });
                }
            }
        }

            
            {
                a = FacebookSettingsCell.this;
                super();
            }
    };
    private boolean l;

    public FacebookSettingsCell(Context context)
    {
        super(context);
        g = new dzs();
    }

    public FacebookSettingsCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = new dzs();
    }

    public FacebookSettingsCell(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = new dzs();
    }

    static SwitchCompat a(FacebookSettingsCell facebooksettingscell)
    {
        return facebooksettingscell.d;
    }

    public static FacebookSettingsCell a(Context context, ViewGroup viewgroup)
    {
        return (FacebookSettingsCell)LayoutInflater.from(context).inflate(0x7f03012d, viewgroup, false);
    }

    private void b()
    {
        boolean flag = false;
        a.c();
        a.a(false);
        a.a(getContext().getString(0x7f080476));
        setOnClickListener(i);
        if (!l)
        {
            flag = true;
        }
        setEnabled(flag);
    }

    static boolean b(FacebookSettingsCell facebooksettingscell)
    {
        return facebooksettingscell.f;
    }

    private void c()
    {
        setOnClickListener(null);
        if (d != null)
        {
            d.setOnCheckedChangeListener(null);
        }
    }

    static String[] c(FacebookSettingsCell facebooksettingscell)
    {
        return facebooksettingscell.h;
    }

    static dzs d(FacebookSettingsCell facebooksettingscell)
    {
        return facebooksettingscell.g;
    }

    protected final void a(ContentValues contentvalues)
    {
        Assertion.a(e, "Should never have registered a click handler that leads to saveSetting if we are not connected to facebook");
        boolean flag;
        if (d != null)
        {
            flag = d.isChecked();
        } else
        {
            flag = false;
        }
        contentvalues.put("post_to_facebook", Boolean.valueOf(flag));
        a(com.spotify.mobile.android.util.ClientEvent.SubEvent.bz, Boolean.valueOf(flag));
    }

    public final void a(Cursor cursor)
    {
        Assertion.a(cursor, "Don't pass null cursors to us");
        Assertion.a(cursor.moveToFirst(), "Don't pass empty cursors to us");
        l = gcw.a(cursor, "offline_mode");
        e = gcw.a(cursor, "facebook_connected");
        f = gcw.a(cursor, "post_to_facebook");
        if (e)
        {
            a.c();
            a.a(false);
            a.a(getContext().getString(0x7f0804b2));
            a.b(getContext().getString(0x7f0804ae));
            d = new SwitchCompat(getContext());
            a.a(d);
            c();
            d.setChecked(f);
            setOnClickListener(j);
            if (d != null)
            {
                d.setOnCheckedChangeListener(k);
            }
            return;
        } else
        {
            c();
            b();
            return;
        }
    }

    public final void a(String s)
    {
    }

    public final void b(String s)
    {
    }

    public final void c(String s)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            b();
            return;
        }
    }
}
