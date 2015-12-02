// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListEmptyView

class am
    implements android.view.View.OnClickListener
{

    final ThreadListEmptyView a;

    am(ThreadListEmptyView threadlistemptyview)
    {
        a = threadlistemptyview;
        super();
    }

    public void onClick(View view)
    {
        a.a();
    }
}
