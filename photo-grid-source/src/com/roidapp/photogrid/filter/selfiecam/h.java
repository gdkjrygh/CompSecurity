// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            SelfieCamImageShowActivity

final class h
    implements android.content.DialogInterface.OnClickListener
{

    final SelfieCamImageShowActivity a;

    h(SelfieCamImageShowActivity selfiecamimageshowactivity)
    {
        a = selfiecamimageshowactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
