// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.res.TypedArray;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageButton;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.ui:
//            NowPlayingFragment

class this._cls0
    implements ApiCallback
{

    final NowPlayingFragment this$0;

    public void onError(int i, String s)
    {
    }

    public void onSuccess(Boolean boolean1)
    {
        if (!isAdded())
        {
            return;
        }
        if (boolean1.booleanValue())
        {
            boolean1 = getActivity().getTheme().nStyledAttributes(new int[] {
                0x7f010106
            });
            volumeMuteButton.setColorFilter(boolean1.getColor(0, 0x7f0d0004));
            boolean1.recycle();
            return;
        } else
        {
            volumeMuteButton.clearColorFilter();
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Boolean)obj);
    }

    y()
    {
        this$0 = NowPlayingFragment.this;
        super();
    }
}
