// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import android.content.DialogInterface;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.fragments.verification:
//            PhoneVerificationFragment

final class c
    implements android.content.ner
{

    private String a[];
    private TextView b;
    private CharSequence c[];
    private PhoneVerificationFragment d;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PhoneVerificationFragment.b(d, a[i]);
        b.setText(c[i]);
        d.u();
        dialoginterface.dismiss();
        PhoneVerificationFragment.r(d);
    }

    (PhoneVerificationFragment phoneverificationfragment, String as[], TextView textview, CharSequence acharsequence[])
    {
        d = phoneverificationfragment;
        a = as;
        b = textview;
        c = acharsequence;
        super();
    }
}
