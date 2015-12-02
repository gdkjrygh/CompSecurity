// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.contacts.picker.ContactPickerColorScheme;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.f;

public class bb extends f
{

    private final View a;

    public bb(Context context)
    {
        this(context, null, 0);
    }

    public bb(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.orca_contact_picker_section_splitter);
        a = findViewById(i.contact_picker_section_header);
    }

    public void setColorScheme(ContactPickerColorScheme contactpickercolorscheme)
    {
        Resources resources = getResources();
        if (contactpickercolorscheme == ContactPickerColorScheme.DEFAULT_SCHEME)
        {
            a.setBackgroundDrawable(new ColorDrawable(resources.getColor(com.facebook.f.default_contacts_section_background)));
        } else
        if (contactpickercolorscheme == ContactPickerColorScheme.DIVEBAR_SCHEME)
        {
            a.setBackgroundDrawable(new ColorDrawable(resources.getColor(com.facebook.f.divebar_section_background)));
            return;
        }
    }
}
