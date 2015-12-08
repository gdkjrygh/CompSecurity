// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiMethod;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteFragment

class val.action
    implements android.view.ner
{

    final RemoteFragment this$0;
    final ApiMethod val$action;

    public void onClick(View view)
    {
        val$action.execute(RemoteFragment.access$400(RemoteFragment.this).getConnection(), RemoteFragment.access$500(RemoteFragment.this), RemoteFragment.access$600(RemoteFragment.this));
    }

    ()
    {
        this$0 = final_remotefragment;
        val$action = ApiMethod.this;
        super();
    }
}
