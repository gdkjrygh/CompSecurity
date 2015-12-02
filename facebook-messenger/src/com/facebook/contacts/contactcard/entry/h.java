// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard.entry;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.contacts.models.entry.Entry;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.CustomRelativeLayout;

// Referenced classes of package com.facebook.contacts.contactcard.entry:
//            i, j, k

public abstract class h extends CustomRelativeLayout
{

    private final TextView a;
    private final TextView b;
    private final ImageButton c;
    private Entry d;
    private com.facebook.contacts.contactcard.entry.k e;

    public h(Context context)
    {
        this(context, null);
    }

    public h(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public h(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        setContentView(k.contacts_entry_view);
        setClickable(true);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setBackgroundResource(com.facebook.h.orca_item_background_holo_light);
        } else
        {
            setBackgroundResource(0x1080062);
        }
        setOnClickListener(new com.facebook.contacts.contactcard.entry.i(this));
        b = (TextView)a(i.item_value);
        a = (TextView)a(i.item_label);
        c = (ImageButton)a(i.item_remove_button);
        c.setOnClickListener(new j(this));
    }

    static com.facebook.contacts.contactcard.entry.k a(h h1)
    {
        return h1.e;
    }

    static Entry b(h h1)
    {
        return h1.d;
    }

    protected abstract void a(TextView textview);

    protected abstract void b(TextView textview);

    public Entry getEntry()
    {
        return d;
    }

    public void setEditMode(boolean flag)
    {
        if (flag)
        {
            setClickable(false);
            c.setVisibility(0);
            return;
        } else
        {
            setClickable(true);
            c.setVisibility(8);
            return;
        }
    }

    public void setEntry(Entry entry)
    {
        d = entry;
        a(a);
        b(b);
    }

    public void setEntryViewListener(com.facebook.contacts.contactcard.entry.k k1)
    {
        e = k1;
    }
}
