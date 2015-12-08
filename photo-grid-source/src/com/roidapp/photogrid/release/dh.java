// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            dc

final class dh
    implements android.view.View.OnClickListener
{

    final Dialog a;
    final dc b;

    dh(dc dc, Dialog dialog)
    {
        b = dc;
        a = dialog;
        super();
    }

    public final void onClick(View view)
    {
        a.dismiss();
    }
}
