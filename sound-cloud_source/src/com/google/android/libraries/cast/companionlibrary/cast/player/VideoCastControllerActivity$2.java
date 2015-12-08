// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            VideoCastControllerActivity, OnVideoCastControllerListener

class this._cls0
    implements android.widget.r
{

    final VideoCastControllerActivity this$0;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        VideoCastControllerActivity.access$200(VideoCastControllerActivity.this).setText(Utils.formatMillis(i));
        try
        {
            if (VideoCastControllerActivity.access$000(VideoCastControllerActivity.this) != null)
            {
                VideoCastControllerActivity.access$000(VideoCastControllerActivity.this).onProgressChanged(seekbar, i, flag);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SeekBar seekbar)
        {
            LogUtils.LOGE(VideoCastControllerActivity.access$100(), "Failed to set the progress result", seekbar);
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        try
        {
            if (VideoCastControllerActivity.access$000(VideoCastControllerActivity.this) != null)
            {
                VideoCastControllerActivity.access$000(VideoCastControllerActivity.this).onStartTrackingTouch(seekbar);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SeekBar seekbar)
        {
            LogUtils.LOGE(VideoCastControllerActivity.access$100(), "Failed to start seek", seekbar);
        }
        finish();
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        try
        {
            if (VideoCastControllerActivity.access$000(VideoCastControllerActivity.this) != null)
            {
                VideoCastControllerActivity.access$000(VideoCastControllerActivity.this).onStopTrackingTouch(seekbar);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SeekBar seekbar)
        {
            LogUtils.LOGE(VideoCastControllerActivity.access$100(), "Failed to complete seek", seekbar);
        }
        finish();
    }

    ()
    {
        this$0 = VideoCastControllerActivity.this;
        super();
    }
}
