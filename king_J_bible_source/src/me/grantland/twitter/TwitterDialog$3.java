// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.content.DialogInterface;

// Referenced classes of package me.grantland.twitter:
//            TwitterDialog

class this._cls0
    implements android.content.OnCancelListener
{

    final TwitterDialog this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        TwitterDialog.access$6(TwitterDialog.this).onCancel();
    }

    stener()
    {
        this$0 = TwitterDialog.this;
        super();
    }
}
