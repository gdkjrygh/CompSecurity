// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment

class bn
    implements android.content.DialogInterface.OnClickListener
{

    final ThreadViewFragment a;

    bn(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
    }
}
