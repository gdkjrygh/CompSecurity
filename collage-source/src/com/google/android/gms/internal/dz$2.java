// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            dz

class a
    implements android.content.gInterface.OnClickListener
{

    final dz a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.b("User canceled the download.");
    }

    ckListener(dz dz1)
    {
        a = dz1;
        super();
    }
}
