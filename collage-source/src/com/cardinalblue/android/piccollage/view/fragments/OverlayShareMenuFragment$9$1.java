// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.net.Uri;
import android.view.View;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.g;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.facebook.share.widget.ShareDialog;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class a
    implements i
{

    final a a;

    public Void a(j j1)
        throws Exception
    {
        if (g.a(((File)j1.e()).getAbsolutePath()))
        {
            j1 = (new com.facebook.share.model.it>()).Video((new com.facebook.share.model.Video()).l(Uri.fromFile((File)j1.e())).l()).ld();
        } else
        {
            j1 = (new com.facebook.share.model.it>()).Photo((new com.facebook.share.model.Photo()).l(Uri.fromFile((File)j1.e())).l()).ld();
        }
        if (com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.i(a.a).canShow(j1))
        {
            com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.i(a.a).show(j1);
        } else
        {
            OverlayShareMenuFragment.a(a.a, 0x7f1001f4, com.cardinalblue.android.piccollage.events.ent._cls9.a);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/view/fragments/OverlayShareMenuFragment$9

/* anonymous class */
    class OverlayShareMenuFragment._cls9
        implements android.view.View.OnClickListener
    {

        final OverlayShareMenuFragment a;

        public void onClick(View view)
        {
            b.as();
            if (!k.p())
            {
                OverlayShareMenuFragment.a(a, 0x7f1001f4, com.cardinalblue.android.piccollage.events.j.a.b);
                return;
            } else
            {
                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.b(a, 0x7f1001f4).c(new OverlayShareMenuFragment._cls9._cls1(this), j.b);
                return;
            }
        }

            
            {
                a = overlaysharemenufragment;
                super();
            }
    }

}
