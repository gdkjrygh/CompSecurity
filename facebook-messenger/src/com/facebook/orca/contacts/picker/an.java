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
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.messages.threads.ui.name.ThreadNameView;
import com.facebook.orca.common.ui.widgets.text.a;
import com.facebook.orca.photos.a.e;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.widget.f;
import com.facebook.widget.tiles.ThreadTileView;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ad

public class an extends f
{

    private static final Class a = com/facebook/orca/contacts/picker/an;
    private final ThreadNameView b;
    private final ThreadNameView c;
    private final ThreadTileView d;
    private final View e;
    private final a f;
    private final e g;
    private ad h;

    public an(Context context)
    {
        this(context, null, 0);
    }

    public an(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.orca_contact_picker_list_group_item);
        b = (ThreadNameView)getView(i.group_name);
        c = (ThreadNameView)getView(i.group_description);
        d = (ThreadTileView)getView(i.contact_group_tile_image);
        e = getView(i.contact_divider);
        context = t.a(context);
        f = (a)context.a(com/facebook/orca/common/ui/widgets/text/a);
        g = (e)context.a(com/facebook/orca/photos/a/e);
    }

    private void a()
    {
        ThreadSummary threadsummary = h.a();
        com.facebook.orca.threadview.v v = f.a(threadsummary);
        b.setData(v);
        d.setThreadTileViewData(g.a(threadsummary));
        if (threadsummary.f())
        {
            c.setData(v);
            c.setVisibility(0);
            return;
        } else
        {
            c.setVisibility(8);
            return;
        }
    }

    public ad getContactRow()
    {
        return h;
    }

    public void setColorScheme(ContactPickerColorScheme contactpickercolorscheme)
    {
        while (contactpickercolorscheme == ContactPickerColorScheme.DEFAULT_SCHEME || contactpickercolorscheme != ContactPickerColorScheme.DIVEBAR_SCHEME) 
        {
            return;
        }
        contactpickercolorscheme = getResources();
        setBackgroundDrawable(contactpickercolorscheme.getDrawable(h.divebar_contact_bg));
        e.setBackgroundDrawable(new ColorDrawable(contactpickercolorscheme.getColor(com.facebook.f.divebar_contact_divider)));
        b.setTextColor(contactpickercolorscheme.getColor(com.facebook.f.divebar_contact_name_text));
        c.setTextColor(contactpickercolorscheme.getColor(com.facebook.f.divebar_contact_status_text));
    }

    public void setContactRow(ad ad1)
    {
        h = ad1;
        a();
    }

}
