// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.content.ContentResolver;
import java.util.ArrayList;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.service:
//            LibrarySyncService

class tor
    implements ApiCallback
{

    final tor.syncItemFinished this$0;
    final ContentResolver val$contentResolver;
    final tor val$orchestrator;

    public void onError(int i, String s)
    {
        val$orchestrator.syncItemFailed(i, s);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((org.xbmc.kore.jsonrpc.type.cess)obj);
    }

    public void onSuccess(org.xbmc.kore.jsonrpc.type.cess cess)
    {
        cess._mth200(this._cls0.this, val$contentResolver, cess._mth000(this._cls0.this), cess._mth100(this._cls0.this));
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(cess);
        cess._mth300(this._cls0.this, val$orchestrator, val$contentResolver, arraylist);
        val$orchestrator.syncItemFinished();
    }

    tor()
    {
        this$0 = final_tor;
        val$contentResolver = contentresolver;
        val$orchestrator = tor.this;
        super();
    }
}
