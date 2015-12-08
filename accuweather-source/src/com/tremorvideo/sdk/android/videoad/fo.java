// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fi

final class fo
    implements android.view.View.OnClickListener
{

    final Dialog a;
    final a.a b;
    final fi c;

    fo(Dialog dialog, a.a a1, fi fi1)
    {
        a = dialog;
        b = a1;
        c = fi1;
        super();
    }

    public void onClick(View view)
    {
        fi.a(a, b, c);
    }
}
