// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            de, gv

class ra
    implements android.content.gInterface.OnClickListener
{

    final de ra;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        de.b(ra).b("onStorePictureCanceled", new JSONObject());
    }

    ckListener(de de1)
    {
        ra = de1;
        super();
    }
}
