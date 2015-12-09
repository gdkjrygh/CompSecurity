// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;
import com.jcp.g.a;

// Referenced classes of package com.jcp.fragments:
//            JCPCreateAccountFragment

class bg
    implements android.content.DialogInterface.OnClickListener
{

    final JCPCreateAccountFragment a;

    bg(JCPCreateAccountFragment jcpcreateaccountfragment)
    {
        a = jcpcreateaccountfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        com.jcp.g.a.e(false);
        com.jcp.fragments.JCPCreateAccountFragment.a(a);
    }
}
