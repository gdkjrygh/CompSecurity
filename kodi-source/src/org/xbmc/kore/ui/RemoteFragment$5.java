// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiMethod;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteFragment

class val.longClickAction
    implements android.view.istener
{

    final RemoteFragment this$0;
    final ApiMethod val$longClickAction;

    public boolean onLongClick(View view)
    {
        UIUtils.handleVibration(getActivity());
        val$longClickAction.execute(RemoteFragment.access$400(RemoteFragment.this).getConnection(), RemoteFragment.access$500(RemoteFragment.this), RemoteFragment.access$600(RemoteFragment.this));
        return true;
    }

    ner()
    {
        this$0 = final_remotefragment;
        val$longClickAction = ApiMethod.this;
        super();
    }
}
