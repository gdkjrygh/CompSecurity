// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.DialogInterface;
import com.pandora.android.provider.b;
import com.pandora.radio.data.o;
import p.cw.c;
import p.di.r;

// Referenced classes of package com.pandora.android.util:
//            a

static final class ce
    implements android.content.ogInterface.OnClickListener
{

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.a.b().j().e(false);
        (new r()).execute(new Object[0]);
        dialoginterface.cancel();
    }

    ce()
    {
    }
}
