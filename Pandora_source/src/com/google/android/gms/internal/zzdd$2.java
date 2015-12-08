// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzdd

class a
    implements android.content.nterface.OnClickListener
{

    final zzdd a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.zzQ("User canceled the download.");
    }

    Listener(zzdd zzdd1)
    {
        a = zzdd1;
        super();
    }
}
