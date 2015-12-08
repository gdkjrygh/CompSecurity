// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            dw

class a
    implements android.content.gInterface.OnClickListener
{

    final dw a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.b("Operation denied by user.");
    }

    ckListener(dw dw1)
    {
        a = dw1;
        super();
    }
}
