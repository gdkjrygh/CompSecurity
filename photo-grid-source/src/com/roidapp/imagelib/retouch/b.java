// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            a

final class b
    implements android.view.View.OnClickListener
{

    final Dialog a;
    final a b;

    b(a a1, Dialog dialog)
    {
        b = a1;
        a = dialog;
        super();
    }

    public final void onClick(View view)
    {
        a.dismiss();
    }
}
