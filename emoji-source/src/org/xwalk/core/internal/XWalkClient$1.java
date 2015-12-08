// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.DialogInterface;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkClient, XWalkHttpAuthHandler

class andler
    implements android.content.e.OnCancelListener
{

    final XWalkClient this$0;
    final XWalkHttpAuthHandler val$haHandler;

    public void onCancel(DialogInterface dialoginterface)
    {
        val$haHandler.cancel();
    }

    andler()
    {
        this$0 = final_xwalkclient;
        val$haHandler = XWalkHttpAuthHandler.this;
        super();
    }
}
