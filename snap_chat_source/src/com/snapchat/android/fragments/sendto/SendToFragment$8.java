// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.sendto;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.snapchat.android.fragments.sendto:
//            SendToFragment

final class a
    implements android.view.ner
{

    private SendToFragment a;

    public final void onClick(View view)
    {
        SendToFragment.m(a).setText("");
    }

    (SendToFragment sendtofragment)
    {
        a = sendtofragment;
        super();
    }
}
