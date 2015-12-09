// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;

// Referenced classes of package com.jcp.fragments:
//            FindStoreDetailsFragment

class ar
    implements android.content.DialogInterface.OnClickListener
{

    final FindStoreDetailsFragment a;

    ar(FindStoreDetailsFragment findstoredetailsfragment)
    {
        a = findstoredetailsfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
