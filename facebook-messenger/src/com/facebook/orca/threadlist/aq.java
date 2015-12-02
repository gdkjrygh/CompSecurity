// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListFragment

class aq
    implements android.content.DialogInterface.OnClickListener
{

    final ThreadListFragment a;

    aq(ThreadListFragment threadlistfragment)
    {
        a = threadlistfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
    }
}
