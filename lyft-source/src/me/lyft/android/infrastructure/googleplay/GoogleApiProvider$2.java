// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplay;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package me.lyft.android.infrastructure.googleplay:
//            GoogleApiProvider

class this._cls0
    implements android.content.smissListener
{

    final GoogleApiProvider this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        GoogleApiProvider.access$000(GoogleApiProvider.this).finish();
    }

    ()
    {
        this$0 = GoogleApiProvider.this;
        super();
    }
}
