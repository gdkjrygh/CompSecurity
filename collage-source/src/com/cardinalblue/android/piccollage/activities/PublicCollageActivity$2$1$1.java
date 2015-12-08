// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.view.fragments.e;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PublicCollageActivity

class a
    implements a
{

    final a a;

    public void a()
    {
        int j = PublicCollageActivity.g(a.a.a).getCurrentItem();
        com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(a.a.a).a(j);
        PublicCollageActivity.h(a.a.a).deletePhoto(j);
        int i = j;
        if (j > com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(a.a.a).ount())
        {
            i = com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(a.a.a).ount();
        }
        if (com.cardinalblue.android.piccollage.activities.PublicCollageActivity.f(a.a.a).ount() == 0)
        {
            a.a.a.finish();
            return;
        }
        try
        {
            PublicCollageActivity.g(a.a.a).setCurrentItem(i);
            PublicCollageActivity.a(a.a.a, PublicCollageActivity.i(a.a.a));
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            f.a(illegalstateexception);
        }
        return;
    }

    public void b()
    {
        k.a(a.a.a, 0x7f0700df, 0);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PublicCollageActivity$2

/* anonymous class */
    class PublicCollageActivity._cls2
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        final PublicCollageActivity a;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            menuitem = e.a(null, a.getString(0x7f0700fe), a.getString(0x104000a), new PublicCollageActivity._cls2._cls1(this), a.getString(0x1040000), null);
            k.a(a, menuitem, "confirm_collage_deletion");
            return true;
        }

            
            {
                a = publiccollageactivity;
                super();
            }
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PublicCollageActivity$2$1

/* anonymous class */
    class PublicCollageActivity._cls2._cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final PublicCollageActivity._cls2 a;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = null;
            String s = a.a.r();
            dialoginterface = s;
_L2:
            if (dialoginterface == null)
            {
                f.a(new IllegalStateException("Cannot get collage to delete"));
                return;
            } else
            {
                com.cardinalblue.android.piccollage.a.b.j("delete");
                com.cardinalblue.android.piccollage.a.b.t();
                PublicCollageActivity._cls2._cls1._cls1 _lcls1 = new PublicCollageActivity._cls2._cls1._cls1(this);
                PublicCollageActivity.a a1 = new PublicCollageActivity.a(a.a);
                a1.a(_lcls1);
                a1.a(new String[] {
                    dialoginterface
                });
                return;
            }
            IllegalStateException illegalstateexception;
            illegalstateexception;
            if (true) goto _L2; else goto _L1
_L1:
        }

            
            {
                a = _pcls2;
                super();
            }
    }

}
