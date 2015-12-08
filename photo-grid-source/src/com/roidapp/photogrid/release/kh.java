// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            kg

final class kh
    implements android.view.View.OnClickListener
{

    final Dialog a;
    final kg b;

    kh(kg kg, Dialog dialog)
    {
        b = kg;
        a = dialog;
        super();
    }

    public final void onClick(View view)
    {
        a.dismiss();
    }
}
