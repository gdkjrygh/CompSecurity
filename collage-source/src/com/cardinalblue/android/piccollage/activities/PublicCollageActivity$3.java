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
    implements android.view.Listener
{

    final PublicCollageActivity a;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        menuitem = e.a(null, a.getString(0x7f0700ff), a.getString(0x104000a), new android.content.DialogInterface.OnClickListener() {

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
                    b.j("flag");
                    b.i("success");
                    PublicCollageActivity.c.a a1 = new PublicCollageActivity.c.a(this) {

                        final _cls1 a;

                        public void a()
                        {
                            k.a(a.a.a, 0x7f070245, 0);
                        }

                        public void b()
                        {
                        }

            
            {
                a = _pcls1;
                super();
            }
                    };
                    PublicCollageActivity.c c = new PublicCollageActivity.c(a.a);
                    c.a(a1);
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
                a = PublicCollageActivity._cls3.this;
                super();
            }
        }, a.getString(0x1040000), null);
        k.a(a, menuitem, "confirm_collage_report");
        return true;
    }

    _cls1.a(PublicCollageActivity publiccollageactivity)
    {
        a = publiccollageactivity;
        super();
    }
}
