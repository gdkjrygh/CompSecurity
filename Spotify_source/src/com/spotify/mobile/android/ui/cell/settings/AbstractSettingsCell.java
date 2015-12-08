// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import dtx;
import fop;

public abstract class AbstractSettingsCell extends RelativeLayout
{

    protected ListItemView a;
    protected String b;
    public android.view.View.OnClickListener c;

    public AbstractSettingsCell(Context context)
    {
        super(context);
    }

    AbstractSettingsCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public AbstractSettingsCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void a(ViewGroup viewgroup, boolean flag)
    {
        for (int i = 0; i < viewgroup.getChildCount(); i++)
        {
            View view = viewgroup.getChildAt(i);
            view.setEnabled(flag);
            if (view instanceof ViewGroup)
            {
                a((ViewGroup)view, flag);
            }
        }

    }

    protected final void a()
    {
        ContentValues contentvalues = new ContentValues();
        a(contentvalues);
        if (contentvalues.size() > 0)
        {
            getContext().getContentResolver().update(dtx.a, contentvalues, null, null);
        }
    }

    protected abstract void a(ContentValues contentvalues);

    public abstract void a(Cursor cursor);

    protected final void a(com.spotify.mobile.android.util.ClientEvent.SubEvent subevent, Object obj)
    {
        subevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.a, subevent);
        subevent.a("value", String.valueOf(obj));
        fop.a(getContext(), ViewUri.H, subevent);
    }

    public void a(String s)
    {
        b = s;
    }

    public void b(String s)
    {
        a.a(Html.fromHtml(s));
    }

    public void c(String s)
    {
        a.b(Html.fromHtml(s));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            a = (ListItemView)findViewById(0x7f1104bb);
            a.a(false);
            a.b().setEllipsize(null);
            a.b().setSingleLine(false);
            dmz.a(fop);
            return;
        }
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        a(this, flag);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        c = onclicklistener;
    }
}
