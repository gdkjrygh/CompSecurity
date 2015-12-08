// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.mdx.cast:
//            CastManager, MdxCastApplication

class this._cls0
    implements Runnable
{

    final CastManager this$0;

    public void run()
    {
        Log.d(CastManager.access$400(), "stop ApiClient");
        if (CastManager.access$600(CastManager.this) != null)
        {
            CastManager.access$600(CastManager.this).stop();
            CastManager.access$602(CastManager.this, null);
        }
        Log.d(CastManager.access$400(), "stop ApiClient done");
    }

    tion()
    {
        this$0 = CastManager.this;
        super();
    }
}
