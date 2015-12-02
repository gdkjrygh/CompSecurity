// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import android.content.Context;
import android.widget.Button;
import com.facebook.contacts.picker.ar;
import com.facebook.contacts.picker.as;
import com.facebook.contacts.picker.c;
import com.facebook.i;
import com.facebook.k;
import com.facebook.orca.common.ui.widgets.FavoritesDragSortListView;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            ad, ae, af

public class ac extends as
{

    private Button a;
    private Button b;
    private af c;

    public ac(Context context, c c1)
    {
        super(context, c1, k.orca_contact_picker_view_for_favorites);
        f();
    }

    static af a(ac ac1)
    {
        return ac1.c;
    }

    protected void a(ar ar1)
    {
        super.a(ar1);
        if (ar1 == ar.NONE || ar1 == ar.UNFILTERED)
        {
            a.setVisibility(0);
            b.setVisibility(8);
            return;
        } else
        {
            a.setVisibility(8);
            b.setVisibility(0);
            return;
        }
    }

    protected void f()
    {
        a = (Button)getView(i.edit_favorites_done_button);
        b = (Button)getView(i.edit_favorites_cancel_button);
        a.setOnClickListener(new ad(this));
        b.setOnClickListener(new ae(this));
    }

    public FavoritesDragSortListView getDraggableList()
    {
        return (FavoritesDragSortListView)getListView();
    }

    public void setOnDoneClickedListener(af af)
    {
        c = af;
    }
}
