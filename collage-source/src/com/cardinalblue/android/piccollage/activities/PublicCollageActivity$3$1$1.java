// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import android.view.MenuItem;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.view.fragments.e;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PublicCollageActivity

class a
    implements a
{

    final a a;

    public void a()
    {
        k.a(a.a.a, 0x7f070245, 0);
    }

    public void b()
    {
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PublicCollageActivity$3

/* anonymous class */
    class PublicCollageActivity._cls3
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        final PublicCollageActivity a;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            menuitem = e.a(null, a.getString(0x7f0700ff), a.getString(0x104000a), new PublicCollageActivity._cls3._cls1(this), a.getString(0x1040000), null);
            k.a(a, menuitem, "confirm_collage_report");
            return true;
        }

            
            {
                a = publiccollageactivity;
                super();
            }
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PublicCollageActivity$3$1

/* anonymous class */
    class PublicCollageActivity._cls3._cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final PublicCollageActivity._cls3 a;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = null;
            String s = a.a.r();
            dialoginterface = s;
_L2:
            if (dialoginterface == null)
            {
                f.a(new IllegalStateException("Cannot get collage to flag"));
                return;
            } else
            {
                com.cardinalblue.android.piccollage.a.b.j("flag");
                com.cardinalblue.android.piccollage.a.b.i("success");
                PublicCollageActivity._cls3._cls1._cls1 _lcls1 = new PublicCollageActivity._cls3._cls1._cls1(this);
                PublicCollageActivity.c c = new PublicCollageActivity.c(a.a);
                c.a(_lcls1);
                c.a(new String[] {
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
                a = _pcls3;
                super();
            }
    }

}
