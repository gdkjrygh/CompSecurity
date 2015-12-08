// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.fragment;

import android.content.pm.PackageManager;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.pinterest.kit.utils.AppUtils;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.web.fragment:
//            WebViewFragment

class val.view
{

    final WebViewFragment this$0;
    final View val$view;

    public void setValue(String s)
    {
        if (!StringUtils.isNotEmpty(s)) goto _L2; else goto _L1
_L1:
        final HashMap dataMap;
        dataMap = new HashMap();
        s = new PinterestJsonArray(s);
        int i = 0;
_L6:
        PinterestJsonObject pinterestjsonobject;
        if (i < s.a())
        {
            pinterestjsonobject = s.c(i);
            break MISSING_BLOCK_LABEL_43;
        }
        if (dataMap.isEmpty()) goto _L2; else goto _L3
_L3:
        intent = AppUtils.getAppLinkIntent(dataMap);
        pinterestjsonobject = null;
        s = pinterestjsonobject;
        if (getActivity() == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        packagemanager = getActivity().getPackageManager();
        s = pinterestjsonobject;
        if (packagemanager == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        s = packagemanager.resolveActivity(intent, 0x10000);
        if (s == null) goto _L2; else goto _L4
_L4:
        getActivity().runOnUiThread(new _cls1());
_L2:
        return;
        class _cls1
            implements Runnable
        {

            final WebViewFragment._cls1 this$1;
            final HashMap val$dataMap;
            final Intent val$intent;

            public void run()
            {
                Object obj;
                if (view != null)
                {
                    if ((obj = (ViewStub)view.findViewById(0x7f0f02eb)) != null)
                    {
                        WebViewFragment.access$002(this$0, (WebViewOpeninAppBar)((ViewStub) (obj)).inflate());
                        String s2 = (String)dataMap.get("al:android:app_name");
                        Button button = (Button)WebViewFragment.access$000(this$0).findViewById(0x7f0f030a);
                        obj = s2;
                        if (StringUtils.isEmpty(s2))
                        {
                            obj = "";
                        }
                        button.setText(Resources.string(0x7f0703d9, new Object[] {
                            obj
                        }));
                        WebViewFragment.access$000(this$0).setIntent(intent);
                        return;
                    }
                }
            }

            _cls1()
            {
                this$1 = WebViewFragment._cls1.this;
                dataMap = hashmap;
                intent = intent1;
                super();
            }
        }

        final Intent intent;
        PackageManager packagemanager;
        if (pinterestjsonobject != null)
        {
            try
            {
                String s1 = pinterestjsonobject.a("property", "");
                if (StringUtils.isNotEmpty(s1))
                {
                    dataMap.put(s1, pinterestjsonobject.a("content", ""));
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                CrashReporting.a(s);
                return;
            }
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    _cls1()
    {
        this$0 = final_webviewfragment;
        val$view = View.this;
        super();
    }
}
