// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;

// Referenced classes of package com.jcp.fragments:
//            t, AddCreditCardFragment

class n
    implements android.content.DialogInterface.OnClickListener
{

    final t a;
    final String b;
    final Fragment c;
    final AddCreditCardFragment d;

    n(AddCreditCardFragment addcreditcardfragment, t t1, String s, Fragment fragment)
    {
        d = addcreditcardfragment;
        a = t1;
        b = s;
        c = fragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a("AddCreditCardFragment", b, c);
    }
}
