// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.contacts.picker.ContactPickerColorScheme;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.f;

public class ba extends f
{

    private final Context a;
    private final View b;
    private final TextView c;

    public ba(Context context)
    {
        this(context, null, 0);
    }

    public ba(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = context;
        setContentView(k.orca_contact_picker_section_header);
        b = findViewById(i.contact_picker_section_header);
        c = (TextView)findViewById(i.contact_picker_section_header_text);
    }

    public void setColorScheme(ContactPickerColorScheme contactpickercolorscheme)
    {
        Resources resources = getResources();
        if (contactpickercolorscheme == ContactPickerColorScheme.DEFAULT_SCHEME)
        {
            b.setBackgroundDrawable(new ColorDrawable(resources.getColor(com.facebook.f.default_contacts_section_background)));
            if (c != null)
            {
                c.setTextColor(resources.getColor(com.facebook.f.default_contacts_section_text));
            }
        } else
        if (contactpickercolorscheme == ContactPickerColorScheme.DIVEBAR_SCHEME)
        {
            b.setBackgroundDrawable(new ColorDrawable(resources.getColor(com.facebook.f.divebar_section_background)));
            if (c != null)
            {
                c.setTextColor(resources.getColor(com.facebook.f.divebar_section_text));
                return;
            }
        }
    }

    public void setText(String s)
    {
        c.setText(s);
    }
}
