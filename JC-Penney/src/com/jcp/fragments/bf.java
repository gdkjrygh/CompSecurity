// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;
import android.widget.RadioButton;
import com.jcp.c.af;
import com.jcp.g.a;

// Referenced classes of package com.jcp.fragments:
//            JCPCreateAccountFragment

class bf
    implements android.content.DialogInterface.OnClickListener
{

    final af a;
    final JCPCreateAccountFragment b;

    bf(JCPCreateAccountFragment jcpcreateaccountfragment, af af1)
    {
        b = jcpcreateaccountfragment;
        a = af1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (a.a())
        {
            if (b.radioNotInterestedInRewards.isChecked())
            {
                a.e();
            }
            return;
        } else
        {
            com.jcp.g.a.e(false);
            com.jcp.fragments.JCPCreateAccountFragment.a(b);
            return;
        }
    }
}
