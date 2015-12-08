// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzed

class zztz
    implements android.content.nterface.OnClickListener
{

    final zzed zztz;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        zztz.zzH("User canceled the download.");
    }

    Listener(zzed zzed1)
    {
        zztz = zzed1;
        super();
    }
}
