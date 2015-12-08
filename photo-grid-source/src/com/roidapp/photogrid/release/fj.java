// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            fb, fi, PhotoGridActivity

final class fj
    implements android.view.View.OnClickListener
{

    final fi a;

    fj(fi fi1)
    {
        a = fi1;
        super();
    }

    public final void onClick(View view)
    {
        view = new fb();
        fi.a(a).a(0x7f0d03ec, view, "FragmentLayout");
    }
}
