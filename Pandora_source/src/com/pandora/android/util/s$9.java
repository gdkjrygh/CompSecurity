// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.DialogInterface;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.util:
//            s

static final class ce
    implements android.content.ogInterface.OnClickListener
{

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
        b.a.C().a(new PandoraIntent("user_acknowledged_error"));
    }

    ce()
    {
    }
}
