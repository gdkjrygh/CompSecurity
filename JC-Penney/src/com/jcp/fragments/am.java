// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.jcp.fragments:
//            EditAccountFragment

class am
    implements android.view.View.OnClickListener
{

    final Dialog a;
    final EditAccountFragment b;

    am(EditAccountFragment editaccountfragment, Dialog dialog)
    {
        b = editaccountfragment;
        a = dialog;
        super();
    }

    public void onClick(View view)
    {
        a.dismiss();
    }
}
