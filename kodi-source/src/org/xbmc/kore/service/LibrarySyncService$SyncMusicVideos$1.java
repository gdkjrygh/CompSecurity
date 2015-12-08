// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.content.ContentResolver;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.service:
//            LibrarySyncService

class val.orchestrator
    implements ApiCallback
{

    final val.contentResolver this$0;
    final ContentResolver val$contentResolver;
    final val.contentResolver val$orchestrator;

    public void onError(int i, String s)
    {
        val$orchestrator.yncItemFailed(i, s);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    public void onSuccess(List list)
    {
        cess._mth1800(this._cls0.this, val$contentResolver, cess._mth1700(this._cls0.this));
        cess._mth1900(this._cls0.this, val$orchestrator, val$contentResolver, list);
    }

    ()
    {
        this$0 = final_;
        val$contentResolver = contentresolver;
        val$orchestrator = val.orchestrator.this;
        super();
    }
}
