// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.util.Base64;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.core.Xml;
import com.ford.syncV4.h.b;
import java.util.Map;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkManager

class this._cls0
    implements b
{

    final AppLinkManager this$0;

    private String scanAndDecode(String s, Map map)
    {
        String s1 = s;
        if (map != null)
        {
            s1 = s;
            if (map.containsKey("d"))
            {
                map = (String)map.get("d");
                s1 = s.replaceFirst(map, new String(Base64.decode(map, 0)));
            }
        }
        return s1;
    }

    public void logXmlMsg(String s, String s1)
    {
        Map map = (Map)Xml.parse(s).get("msg");
        String s2 = s;
        if (map != null)
        {
            s = scanAndDecode(s, map);
            s2 = s;
            if (map.containsKey("frame"))
            {
                s2 = scanAndDecode(s, (Map)map.get("frame"));
            }
        }
        LogUtil.wtf("FORDSYNC_AppLinkManager", String.format("%s, %s", new Object[] {
            s2, s1
        }), new Object[0]);
    }

    ()
    {
        this$0 = AppLinkManager.this;
        super();
    }
}
