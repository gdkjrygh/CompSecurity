// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.support.v7.widget.CBluePopupMenu;
import android.view.MenuItem;
import android.view.View;
import com.cardinalblue.android.piccollage.activities.RemixableListActivity;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.Collage;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ak

class a
    implements android.support.v7.widget.pupMenu.OnMenuItemClickListener
{

    final tActivityForResult a;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        d.a().c(new com.cardinalblue.android.piccollage.activities.ivity.OnPopupMenuEvent(false));
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131755759: 
            com.cardinalblue.android.piccollage.a.b.a("activity : floating button");
            com.cardinalblue.android.piccollage.a.b.bR();
            com.cardinalblue.android.piccollage.a.b.aM("empty");
            a.a.startActivityForResult(Collage.a(a.a.getActivity()), 999);
            return true;

        case 2131755758: 
            com.cardinalblue.android.piccollage.a.b.bQ();
            menuitem = new Intent(a.a.getActivity(), com/cardinalblue/android/piccollage/activities/RemixableListActivity);
            a.a.startActivityForResult(menuitem, 1000);
            return true;

        case 2131755760: 
            com.cardinalblue.android.piccollage.a.b.bS();
            break;
        }
        com.cardinalblue.android.piccollage.a.b.aM("grid");
        menuitem = Collage.a(a.a.getActivity());
        menuitem.putExtra("extra_grid_flow", true);
        a.a.startActivityForResult(menuitem, 999);
        return true;
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/view/fragments/ak$2

/* anonymous class */
    class ak._cls2
        implements android.view.View.OnClickListener
    {

        final ak a;

        public void onClick(View view)
        {
            com.cardinalblue.android.piccollage.a.b.bP();
            view = new CBluePopupMenu(a.getActivity(), view, 0x800055);
            view.setOnDismissListener(new ak._cls2._cls1());
            view.inflate(0x7f11000c);
            view.setOnMenuItemClickListener(new ak._cls2._cls2(this));
            d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.OnPopupMenuEvent(true));
            view.show();
        }

            
            {
                a = ak1;
                super();
            }

        // Unreferenced inner class com/cardinalblue/android/piccollage/view/fragments/ak$2$1

/* anonymous class */
        class ak._cls2._cls1
            implements android.support.v7.widget.CBluePopupMenu.OnDismissListener
        {

            final ak._cls2 a;

            public void onDismiss(CBluePopupMenu cbluepopupmenu)
            {
                d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.OnPopupMenuEvent(false));
            }

                    
                    {
                        a = ak._cls2.this;
                        super();
                    }
        }

    }

}
