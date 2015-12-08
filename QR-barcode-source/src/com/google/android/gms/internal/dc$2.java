// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            dc, gv

class qS
    implements android.content.gInterface.OnClickListener
{

    final dc qS;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dc.b(qS).b("onCalendarEventCanceled", new JSONObject());
    }

    ckListener(dc dc1)
    {
        qS = dc1;
        super();
    }
}
