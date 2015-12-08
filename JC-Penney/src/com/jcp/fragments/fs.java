// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;
import com.jcp.c.q;

// Referenced classes of package com.jcp.fragments:
//            SavedCardFragment

class fs
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final SavedCardFragment b;

    fs(SavedCardFragment savedcardfragment, String s)
    {
        b = savedcardfragment;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SavedCardFragment.V().a(a);
        dialoginterface.dismiss();
    }
}
