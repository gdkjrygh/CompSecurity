// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.ImageButton;
import android.widget.Toast;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            AlbumDetailsFragment

class this._cls0
    implements ApiCallback
{

    final AlbumDetailsFragment this$0;

    public void onError(int i, String s)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            Toast.makeText(getActivity(), 0x7f0700a2, 0).show();
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        while (!isAdded() || !PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("pref_switch_to_remote_after_media_start", true)) 
        {
            return;
        }
        int i = (fabButton.getLeft() + fabButton.getRight()) / 2;
        int j = (fabButton.getTop() + fabButton.getBottom()) / 2;
        UIUtils.switchToRemoteWithAnimation(getActivity(), i, j, exitTransitionView);
    }

    ()
    {
        this$0 = AlbumDetailsFragment.this;
        super();
    }
}
