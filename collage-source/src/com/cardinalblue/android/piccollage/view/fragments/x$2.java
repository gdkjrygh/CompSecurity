// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.support.v7.widget.CBluePopupMenu;
import android.view.MenuItem;
import android.view.View;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.RemixableListActivity;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.Collage;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            x

class a
    implements android.view..OnClickListener
{

    final x a;

    public void onClick(View view)
    {
        b.bP();
        view = new CBluePopupMenu(a.getActivity(), view, 0x800055);
        view.setOnDismissListener(new android.support.v7.widget.CBluePopupMenu.OnDismissListener() {

            final x._cls2 a;

            public void onDismiss(CBluePopupMenu cbluepopupmenu)
            {
                d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.OnPopupMenuEvent(false));
            }

            
            {
                a = x._cls2.this;
                super();
            }
        });
        view.inflate(0x7f11000c);
        view.setOnMenuItemClickListener(new android.support.v7.widget.CBluePopupMenu.OnMenuItemClickListener() {

            final x._cls2 a;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.OnPopupMenuEvent(false));
                switch (menuitem.getItemId())
                {
                default:
                    return false;

                case 2131755759: 
                    b.a("activity : floating button");
                    b.bR();
                    b.aM("empty");
                    a.a.startActivityForResult(Collage.a(a.a.getActivity()), 999);
                    return true;

                case 2131755758: 
                    b.bQ();
                    menuitem = new Intent(a.a.getActivity(), com/cardinalblue/android/piccollage/activities/RemixableListActivity);
                    a.a.startActivityForResult(menuitem, 1000);
                    return true;

                case 2131755760: 
                    b.bS();
                    break;
                }
                b.aM("grid");
                menuitem = Collage.a(a.a.getActivity());
                menuitem.putExtra("extra_grid_flow", true);
                a.a.startActivityForResult(menuitem, 999);
                return true;
            }

            
            {
                a = x._cls2.this;
                super();
            }
        });
        d.a().c(new com.cardinalblue.android.piccollage.activities.Activity.OnPopupMenuEvent(true));
        view.show();
    }

    _cls2.a(x x1)
    {
        a = x1;
        super();
    }
}
