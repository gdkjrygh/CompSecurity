// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.content.ContentResolver;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;

// Referenced classes of package org.xbmc.kore.service:
//            LibrarySyncService

class val.callbackHandler
    implements ApiCallback
{

    final val.contentResolver this$0;
    final Handler val$callbackHandler;
    final ContentResolver val$contentResolver;
    final HostConnection val$hostConnection;
    final or val$orchestrator;

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
        cess._mth700(this._cls0.this, val$contentResolver, cess._mth500(this._cls0.this), cess._mth600(this._cls0.this));
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(cess);
        cess._mth800(this._cls0.this, val$orchestrator, val$hostConnection, val$callbackHandler, val$contentResolver, arraylist);
    }

    or()
    {
        this$0 = final_or;
        val$contentResolver = contentresolver;
        val$orchestrator = or1;
        val$hostConnection = hostconnection;
        val$callbackHandler = Handler.this;
        super();
    }
}
