// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.content.DialogInterface;
import com.google.android.gms.common.api.l;

// Referenced classes of package com.dominos.fragments:
//            GoogleWalletFragment

class this._cls0
    implements android.content.lListener
{

    final GoogleWalletFragment this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        mGoogleApiClient.c();
    }

    ner()
    {
        this$0 = GoogleWalletFragment.this;
        super();
    }
}
