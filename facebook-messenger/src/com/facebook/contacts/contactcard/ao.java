// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.contacts.models.entry.Entry;
import com.facebook.contacts.models.entry.PhoneEntry;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.threads.n;
import com.facebook.user.i;
import com.facebook.widget.CustomRelativeLayout;

public class ao extends CustomRelativeLayout
{

    private final n a;
    private final i b;
    private final TextView c;
    private final TextView d;
    private final TextView e;

    public ao(Context context)
    {
        this(context, null);
    }

    public ao(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ao(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        context = getInjector();
        a = (n)context.a(com/facebook/orca/threads/n);
        b = (i)context.a(com/facebook/user/i);
        setContentView(k.contacts_hidden_entry_list_row);
        c = (TextView)a(com.facebook.i.hidden_entry_value);
        d = (TextView)a(com.facebook.i.hidden_entry_source);
        e = (TextView)a(com.facebook.i.hidden_entry_time_stamp);
    }

    public void setEntry(Entry entry)
    {
        entry = (PhoneEntry)entry;
        String s = b.c(entry.getNumber());
        c.setText(s);
        d.setText(entry.getSource());
        entry = a.a(1000L * entry.getCreationTime());
        e.setText(entry);
    }
}
