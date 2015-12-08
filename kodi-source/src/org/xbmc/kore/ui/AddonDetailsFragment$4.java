// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.Toast;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.ui:
//            AddonDetailsFragment

class val.isEnabled
    implements ApiCallback
{

    final AddonDetailsFragment this$0;
    final Boolean val$isEnabled;

    public void onError(int i, String s)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            Toast.makeText(getActivity(), String.format(getString(0x7f070048), new Object[] {
                s
            }), 0).show();
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        boolean flag = false;
        if (!isAdded())
        {
            return;
        }
        int i;
        if (!val$isEnabled.booleanValue())
        {
            i = 0x7f07001b;
        } else
        {
            i = 0x7f07001a;
        }
        Toast.makeText(getActivity(), i, 0).show();
        s = AddonDetailsFragment.this;
        if (!val$isEnabled.booleanValue())
        {
            flag = true;
        }
        AddonDetailsFragment.access$100(s, flag);
    }

    ()
    {
        this$0 = final_addondetailsfragment;
        val$isEnabled = Boolean.this;
        super();
    }
}
