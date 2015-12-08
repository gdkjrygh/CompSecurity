// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            dh, gu

class rj
    implements android.content.gInterface.OnClickListener
{

    final dh rj;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dh.b(rj).b("onCalendarEventCanceled", new JSONObject());
    }

    ckListener(dh dh1)
    {
        rj = dh1;
        super();
    }
}
