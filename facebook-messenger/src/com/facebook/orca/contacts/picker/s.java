// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.contacts.picker.ContactPickerColorScheme;
import com.facebook.i;
import com.facebook.k;
import com.facebook.orca.contacts.favorites.EditFavoritesActivity;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            t

public class s extends f
{

    private Context a;
    private final View b;
    private final TextView c;
    private final Button d;

    public s(Context context)
    {
        this(context, null, 0);
    }

    public s(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = context;
        setContentView(k.orca_favorites_contact_picker_section_header);
        b = findViewById(i.contact_picker_section_header);
        c = (TextView)findViewById(i.contact_picker_section_header_text);
        d = (Button)findViewById(i.edit_favorites_button);
        d.setOnClickListener(new t(this));
    }

    private void a()
    {
        Intent intent = new Intent(a, com/facebook/orca/contacts/favorites/EditFavoritesActivity);
        a.startActivity(intent);
    }

    static void a(s s1)
    {
        s1.a();
    }

    public void setColorScheme(ContactPickerColorScheme contactpickercolorscheme)
    {
        Resources resources = getResources();
        if (contactpickercolorscheme == ContactPickerColorScheme.DEFAULT_SCHEME)
        {
            b.setBackgroundDrawable(new ColorDrawable(resources.getColor(com.facebook.f.default_contacts_section_background)));
            c.setTextColor(resources.getColor(com.facebook.f.default_contacts_section_text));
            d.setTextColor(getResources().getColor(com.facebook.f.default_contacts_section_text));
        } else
        if (contactpickercolorscheme == ContactPickerColorScheme.DIVEBAR_SCHEME)
        {
            b.setBackgroundDrawable(new ColorDrawable(resources.getColor(com.facebook.f.divebar_section_background)));
            c.setTextColor(resources.getColor(com.facebook.f.divebar_section_text));
            d.setTextColor(resources.getColor(com.facebook.f.divebar_section_text));
            return;
        }
    }
}
