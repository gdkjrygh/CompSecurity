// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;

// Referenced classes of package com.jcp.fragments:
//            SavedCardFragment

class fu
    implements android.content.DialogInterface.OnClickListener
{

    final SavedCardFragment a;

    fu(SavedCardFragment savedcardfragment)
    {
        a = savedcardfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
