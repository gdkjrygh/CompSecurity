// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            i

class j
    implements android.view.View.OnClickListener
{

    final String a;
    final i b;

    j(i k, String s)
    {
        b = k;
        a = s;
        super();
    }

    public void onClick(View view)
    {
        if (view.getTag().equals(a))
        {
            i.a(b);
            return;
        } else
        {
            i.b(b);
            return;
        }
    }
}
