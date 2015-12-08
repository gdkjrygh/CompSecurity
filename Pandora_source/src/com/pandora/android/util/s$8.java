// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.DialogInterface;
import com.pandora.radio.data.ag;
import p.ce.a;
import p.cx.ab;

// Referenced classes of package com.pandora.android.util:
//            s

static final class a
    implements android.content.ogInterface.OnClickListener
{

    final ag a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.i(true);
        ab.a().a(p.ce.a.a());
    }

    ce(ag ag1)
    {
        a = ag1;
        super();
    }
}
