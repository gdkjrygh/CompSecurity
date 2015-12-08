// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ea

final class fk
    implements android.view.View.OnClickListener
{

    final a.a a;
    final Dialog b;

    fk(a.a a1, Dialog dialog)
    {
        a = a1;
        b = dialog;
        super();
    }

    public void onClick(View view)
    {
        a.a((ea)view.getTag());
        b.dismiss();
    }
}
