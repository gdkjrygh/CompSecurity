// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.translate.pref:
//            NetworkChoicePref

final class h
    implements android.content.DialogInterface.OnClickListener
{

    final NetworkChoicePref a;

    h(NetworkChoicePref networkchoicepref)
    {
        a = networkchoicepref;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        NetworkChoicePref.a(a, i);
        NetworkChoicePref.a(a);
    }
}
