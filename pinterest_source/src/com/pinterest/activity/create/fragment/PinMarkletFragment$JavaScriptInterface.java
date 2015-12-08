// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.app.Activity;
import com.pinterest.activity.create.model.PinnableImageFeed;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            PinMarkletFragment

class this._cls0
{

    final PinMarkletFragment this$0;

    public void onPinsLoaded(String s)
    {
        android.support.v4.app.FragmentActivity fragmentactivity;
        fragmentactivity = getActivity();
        if (fragmentactivity == null || !StringUtils.isNotEmpty(s))
        {
            break MISSING_BLOCK_LABEL_51;
        }
        class _cls1
            implements Runnable
        {

            final PinMarkletFragment.JavaScriptInterface this$1;
            final PinnableImageFeed val$feed;

            public void run()
            {
                onSuccess(feed);
            }

            _cls1()
            {
                this$1 = PinMarkletFragment.JavaScriptInterface.this;
                feed = pinnableimagefeed;
                super();
            }
        }

        fragmentactivity.runOnUiThread(new _cls1());
        return;
        s;
        CrashReporting.a(s);
        class _cls2
            implements Runnable
        {

            final PinMarkletFragment.JavaScriptInterface this$1;

            public void run()
            {
                PinMarkletFragment.access$000(this$0, 0x7f070287);
            }

            _cls2()
            {
                this$1 = PinMarkletFragment.JavaScriptInterface.this;
                super();
            }
        }

        fragmentactivity.runOnUiThread(new _cls2());
        return;
    }

    _cls2()
    {
        this$0 = PinMarkletFragment.this;
        super();
    }
}
