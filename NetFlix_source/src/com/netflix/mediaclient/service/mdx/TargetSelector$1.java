// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.os.Handler;
import android.os.Message;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.PreferenceUtils;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetSelector

class this._cls0 extends Handler
{

    final TargetSelector this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.e("nf_mdxTargetSelector", "TragetSelector: unknown message");
            return;

        case 1: // '\001'
            Log.d("nf_mdxTargetSelector", "TragetSelector: target stickiness expired");
            PreferenceUtils.putLongPref(TargetSelector.access$000(TargetSelector.this), "mdx_target_lastactive", System.currentTimeMillis());
            PreferenceUtils.putStringPref(TargetSelector.access$000(TargetSelector.this), "mdx_target_uuid", new String());
            PreferenceUtils.putStringPref(TargetSelector.access$000(TargetSelector.this), "mdx_selected_uuid", new String());
            PreferenceUtils.putStringPref(TargetSelector.access$000(TargetSelector.this), "mdx_selected_dialuuid", new String());
            PreferenceUtils.putStringPref(TargetSelector.access$000(TargetSelector.this), "mdx_selected_fname", new String());
            TargetSelector.access$100(TargetSelector.this).onStickinessExpired();
            return;

        case 2: // '\002'
            if (Log.isLoggable("nf_mdxTargetSelector", 3))
            {
                Log.d("nf_mdxTargetSelector", (new StringBuilder()).append("TragetSelector: new target is selected ").append(TargetSelector.access$200(TargetSelector.this)).toString());
            }
            PreferenceUtils.putLongPref(TargetSelector.access$000(TargetSelector.this), "mdx_target_lastactive", System.currentTimeMillis());
            // fall through

        case 4: // '\004'
            if (Log.isLoggable("nf_mdxTargetSelector", 3))
            {
                Log.d("nf_mdxTargetSelector", (new StringBuilder()).append("TragetSelector: upadte selected target ").append(TargetSelector.access$200(TargetSelector.this)).append(" : ").append(TargetSelector.access$300(TargetSelector.this)).append(" : ").append(TargetSelector.access$400(TargetSelector.this)).append(" : ").append(TargetSelector.access$500(TargetSelector.this)).toString());
            }
            PreferenceUtils.putStringPref(TargetSelector.access$000(TargetSelector.this), "mdx_target_uuid", TargetSelector.access$200(TargetSelector.this));
            PreferenceUtils.putStringPref(TargetSelector.access$000(TargetSelector.this), "mdx_selected_uuid", TargetSelector.access$300(TargetSelector.this));
            PreferenceUtils.putStringPref(TargetSelector.access$000(TargetSelector.this), "mdx_selected_dialuuid", TargetSelector.access$400(TargetSelector.this));
            PreferenceUtils.putStringPref(TargetSelector.access$000(TargetSelector.this), "mdx_selected_fname", TargetSelector.access$500(TargetSelector.this));
            return;

        case 3: // '\003'
            PreferenceUtils.putLongPref(TargetSelector.access$000(TargetSelector.this), "mdx_target_lastactive", System.currentTimeMillis());
            return;
        }
    }

    rgetSelectorInterface()
    {
        this$0 = TargetSelector.this;
        super();
    }
}
