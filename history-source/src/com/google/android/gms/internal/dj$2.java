// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            dj, gu

class rr
    implements android.content.gInterface.OnClickListener
{

    final dj rr;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dj.b(rr).b("onStorePictureCanceled", new JSONObject());
    }

    ckListener(dj dj1)
    {
        rr = dj1;
        super();
    }
}
