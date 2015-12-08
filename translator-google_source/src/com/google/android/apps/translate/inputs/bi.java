// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.app.ActionBar;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.app.am;
import android.support.v4.app.an;
import android.support.v4.content.h;
import android.support.v4.content.p;
import android.support.v4.widget.bh;
import android.support.v4.widget.bj;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.s;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.n;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.e;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            a

public final class bi extends a
    implements an, bj, android.widget.AdapterView.OnItemClickListener
{

    private static final Uri f = Uri.parse("content://sms/inbox");
    private static final String g[] = {
        "_id", "address", "date", "body"
    };
    private final bh h;
    private final am i;
    private int j;

    public bi(Context context, Language language, Language language1, am am1)
    {
        super(context, language, language1, "source=sms", s.SMSDialogTheme);
        j = 0;
        requestWindowFeature(8);
        if (o.f)
        {
            getWindow().addFlags(0x80000000);
        }
        setContentView(com.google.android.apps.translate.o.popup_sms_picker);
        setTitle(r.label_sms_translation);
        i = am1;
        int k = com.google.android.apps.translate.o.card_sms_entry;
        int l = m.txt_sms_address;
        int i1 = m.txt_sms_date;
        h = new bh(context, k, new String[] {
            "address", "date", "body"
        }, new int[] {
            l, i1, 0x1020014
        });
        h.l = this;
        context = (ListView)findViewById(0x102000a);
        context.setAdapter(h);
        context.setOnItemClickListener(this);
        Singleton.b().c("sms");
    }

    public final p a()
    {
        return new h(getContext(), f, g);
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        j = ((Cursor) (obj)).getColumnIndex("date");
        findViewById(m.progress_bar).setVisibility(8);
        int k;
        if (((Cursor) (obj)).getCount() > 0)
        {
            k = 0x102000a;
        } else
        {
            k = 0x1020014;
        }
        findViewById(k).setVisibility(0);
        h.b(((Cursor) (obj)));
    }

    public final boolean a(View view, Cursor cursor, int k)
    {
        if (k == j)
        {
            view = (TextView)view;
            Context context = getContext();
            long l = cursor.getLong(k);
            cursor = new Time();
            cursor.set(l);
            Time time = new Time();
            time.setToNow();
            if (((Time) (cursor)).year != time.year)
            {
                k = 0x80b14;
            } else
            if (((Time) (cursor)).yearDay != time.yearDay)
            {
                k = 0x80b10;
            } else
            {
                k = 0x80b01;
            }
            view.setText(DateUtils.formatDateTime(context, l, k));
            return true;
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        h.b(null);
    }

    public final void b(String s1)
    {
        show();
        i.a(this);
        if (getActionBar() != null)
        {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public final void d()
    {
        c();
    }

    public final void dismiss()
    {
        i.a();
        super.dismiss();
    }

    public final void onItemClick(AdapterView adapterview, View view, int k, long l)
    {
        adapterview = ((android.support.v4.widget.m) (h)).c;
        if (adapterview != null)
        {
            adapterview.moveToPosition(k);
            adapterview = n.a(adapterview.getString(adapterview.getColumnIndex("body")));
            if (!adapterview.isEmpty())
            {
                a(adapterview, a, b);
            }
            c();
        }
    }

    public final boolean onMenuItemSelected(int k, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

}
