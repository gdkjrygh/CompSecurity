// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;

// Referenced classes of package org.chromium.content.browser:
//            TracingControllerAndroid

class this._cls0 extends BroadcastReceiver
{

    final TracingControllerAndroid this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().endsWith("GPU_PROFILER_START"))
        {
            context = intent.getStringExtra("categories");
            String s;
            if (TextUtils.isEmpty(context))
            {
                context = TracingControllerAndroid.access$000(TracingControllerAndroid.this);
            } else
            {
                context = context.replaceFirst("_DEFAULT_CHROME_CATEGORIES", TracingControllerAndroid.access$000(TracingControllerAndroid.this));
            }
            if (intent.getStringExtra("continuous") == null)
            {
                s = "record-until-full";
            } else
            {
                s = "record-continuously";
            }
            intent = intent.getStringExtra("file");
            if (intent != null)
            {
                startTracing(intent, true, context, s);
                return;
            } else
            {
                startTracing(true, context, s);
                return;
            }
        }
        if (intent.getAction().endsWith("GPU_PROFILER_STOP"))
        {
            stopTracing();
            return;
        }
        if (intent.getAction().endsWith("GPU_PROFILER_LIST_CATEGORIES"))
        {
            getCategoryGroups();
            return;
        } else
        {
            Log.e("TracingControllerAndroid", (new StringBuilder()).append("Unexpected intent: ").append(intent).toString());
            return;
        }
    }

    ()
    {
        this$0 = TracingControllerAndroid.this;
        super();
    }
}
