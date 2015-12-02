// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.contacts.contactcard.entry.a;
import com.facebook.contacts.contactcard.entry.b;
import com.facebook.contacts.contactcard.entry.f;
import com.facebook.contacts.contactcard.entry.g;
import com.facebook.contacts.contactcard.entry.h;
import com.facebook.contacts.contactcard.entry.l;
import com.facebook.contacts.models.EntrySection;
import com.facebook.contacts.models.entry.Entry;
import com.facebook.contacts.models.entry.PhoneEntry;
import com.facebook.contacts.models.entry.d;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.e;
import com.google.common.a.es;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.facebook.contacts.contactcard:
//            SectionView, ae, ad, ac, 
//            af

public class EntrySectionView extends e
{

    private final TextView a;
    private final SectionView b;
    private ArrayList c;
    private b d;
    private EntrySection e;
    private af f;

    public EntrySectionView(Context context)
    {
        this(context, null);
    }

    public EntrySectionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
        setContentView(k.contacts_entry_section_view);
        a = (TextView)a(i.entry_section_label);
        b = (SectionView)a(i.entry_section_section_view);
        c = new ArrayList();
    }

    static af a(EntrySectionView entrysectionview)
    {
        return entrysectionview.f;
    }

    private void a()
    {
        a.setVisibility(8);
        b.setVisibility(8);
        b.b();
        c.clear();
    }

    private void a(Entry entry)
    {
        com.facebook.contacts.contactcard.ae.a[entry.a().ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 45
    //                   2 100
    //                   3 115
    //                   4 130;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        Object obj = new l(getContext());
_L7:
        ((h) (obj)).setEntry(entry);
        ((h) (obj)).setEntryViewListener(new ad(this));
        b.setVisibility(0);
        b.b(((android.view.View) (obj)));
        c.add(obj);
        return;
_L3:
        obj = new g(getContext());
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new a(getContext());
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new f(getContext());
        if (true) goto _L7; else goto _L6
_L6:
    }

    public String getAddEntryValue()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.getInputValue();
        }
    }

    public EntrySection getEntrySection()
    {
        return e;
    }

    public void setEditMode(boolean flag)
    {
        int j = 0;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((h)iterator.next()).setEditMode(flag)) { }
        if (flag)
        {
            if (d == null)
            {
                d = new b(getContext());
                d.setListener(new ac(this));
            }
            if (e != null)
            {
                SectionView sectionview;
                boolean flag1;
                if (e.getHiddenEntries().size() > 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                d.setPlusButtonVisibility(flag1);
            }
            b.b(d);
        } else
        if (d != null)
        {
            b.a(d);
        }
        if (c.size() == 0)
        {
            sectionview = b;
            if (!flag)
            {
                j = 8;
            }
            sectionview.setVisibility(j);
        }
    }

    public void setEntryListener(af af)
    {
        f = af;
    }

    public void setEntrySection(EntrySection entrysection)
    {
        e = entrysection;
        a.setText(entrysection.getTitle());
        a();
        for (Iterator iterator = entrysection.getEntries().iterator(); iterator.hasNext(); a((PhoneEntry)iterator.next())) { }
        if (d != null)
        {
            boolean flag;
            if (entrysection.getHiddenEntries().size() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d.setPlusButtonVisibility(flag);
        }
    }
}
