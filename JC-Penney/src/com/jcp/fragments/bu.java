// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.support.v4.app.ac;
import android.support.v4.app.aj;
import android.view.View;

// Referenced classes of package com.jcp.fragments:
//            bt

class bu
    implements android.view.View.OnClickListener
{

    final bt a;

    bu(bt bt1)
    {
        a = bt1;
        super();
    }

    public void onClick(View view)
    {
        a.i().getActionBar().show();
        a.i().f().c();
    }
}
