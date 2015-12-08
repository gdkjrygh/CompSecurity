// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.roidapp.imagelib.a:
//            i

final class n
    implements android.view.View.OnClickListener
{

    final Dialog a;
    final i b;

    n(i i, Dialog dialog)
    {
        b = i;
        a = dialog;
        super();
    }

    public final void onClick(View view)
    {
        a.dismiss();
    }
}
