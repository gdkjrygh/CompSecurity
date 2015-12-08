// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.fragment;

import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import com.pinterest.activity.web.view.WebViewOpeninAppBar;
import com.pinterest.kit.application.Resources;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.web.fragment:
//            WebViewFragment

class val.intent
    implements Runnable
{

    final val.intent this$1;
    final HashMap val$dataMap;
    final Intent val$intent;

    public void run()
    {
        Object obj;
        if (view != null)
        {
            if ((obj = (ViewStub)view.findViewById(0x7f0f02eb)) != null)
            {
                WebViewFragment.access$002(_fld0, (WebViewOpeninAppBar)((ViewStub) (obj)).inflate());
                String s = (String)val$dataMap.get("al:android:app_name");
                Button button = (Button)WebViewFragment.access$000(_fld0).findViewById(0x7f0f030a);
                obj = s;
                if (StringUtils.isEmpty(s))
                {
                    obj = "";
                }
                button.setText(Resources.string(0x7f0703d9, new Object[] {
                    obj
                }));
                WebViewFragment.access$000(_fld0).setIntent(val$intent);
                return;
            }
        }
    }

    ()
    {
        this$1 = final_;
        val$dataMap = hashmap;
        val$intent = Intent.this;
        super();
    }
}
