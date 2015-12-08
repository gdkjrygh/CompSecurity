// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Dialog;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            eb

class ew
    implements di.a
{

    final eb a;

    ew(eb eb1)
    {
        a = eb1;
        super();
    }

    public void a(Dialog dialog)
    {
        dialog.dismiss();
    }

    public void a(Dialog dialog, int i)
    {
        a.i = i;
        for (Iterator iterator = a.k.iterator(); iterator.hasNext(); ((eb.c)iterator.next()).a(i)) { }
        dialog.dismiss();
    }
}
