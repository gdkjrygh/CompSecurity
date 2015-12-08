// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.b:
//            as

class at
    implements android.content.DialogInterface.OnCancelListener
{

    final as a;

    at(as as1)
    {
        a = as1;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.cancel();
    }
}
