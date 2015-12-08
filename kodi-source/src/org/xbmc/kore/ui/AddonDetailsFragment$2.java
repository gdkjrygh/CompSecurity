// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.Toast;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.ui:
//            AddonDetailsFragment

class this._cls0
    implements ApiCallback
{

    final AddonDetailsFragment this$0;

    public void onError(int i, String s)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            Toast.makeText(getActivity(), String.format(getString(0x7f07003e), new Object[] {
                s
            }), 0).show();
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((org.xbmc.kore.jsonrpc.type.)obj);
    }

    public void onSuccess(org.xbmc.kore.jsonrpc.type. )
    {
        if (!isAdded())
        {
            return;
        } else
        {
            AddonDetailsFragment.access$000(AddonDetailsFragment.this, );
            return;
        }
    }

    ails()
    {
        this$0 = AddonDetailsFragment.this;
        super();
    }
}
