// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            ao, PhotoView, ra, hc, 
//            PhotoGridActivity, qz, ps, db

final class pn
    implements android.content.DialogInterface.OnClickListener
{

    final ao a;
    final PhotoView b;

    pn(PhotoView photoview, ao ao1)
    {
        b = photoview;
        a = ao1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.x = false;
        b.a = false;
        if (!(a instanceof ra)) goto _L2; else goto _L1
_L1:
        dialoginterface = new hc();
        PhotoView.a(b).a(0x7f0d03ec, dialoginterface, "FragmentTextOrder");
_L4:
        b.invalidate();
        return;
_L2:
        if (a instanceof qz)
        {
            PhotoView.a(b).I();
        } else
        if (a instanceof ps)
        {
            if (!PhotoView.a(b).b("FragmentFreeEdit"))
            {
                dialoginterface = new db();
                PhotoView.a(b).a(0x7f0d028d, dialoginterface, "FragmentFreeEdit");
            } else
            {
                ((db)PhotoView.a(b).c("FragmentFreeEdit")).a();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
