// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.List;

// Referenced classes of package com.pinterest.analytics:
//            PinterestDeepLinkMetaData

public class b
{

    final PinterestDeepLinkMetaData a;
    private PinterestJsonObject b;

    public final boolean a()
    {
        return b.a("+clicked_branch_link", Boolean.valueOf(false)).booleanValue();
    }

    public final boolean b()
    {
        return e() != null;
    }

    public final boolean c()
    {
        return d() != null;
    }

    public final String d()
    {
        if (b.f("$deeplink_path"))
        {
            List list = Uri.parse(b.a("$deeplink_path", null)).getPathSegments();
            if (list.size() >= 2 && TextUtils.equals((CharSequence)list.get(0), "board"))
            {
                if (list.size() == 2)
                {
                    return (String)list.get(1);
                } else
                {
                    return String.format("%s/%s", new Object[] {
                        list.get(1), list.get(2)
                    });
                }
            }
        }
        return null;
    }

    public final String e()
    {
        if (b.f("$deeplink_path"))
        {
            List list = Uri.parse(b.a("$deeplink_path", null)).getPathSegments();
            if (list.size() >= 2 && TextUtils.equals((CharSequence)list.get(0), "pin"))
            {
                return (String)list.get(1);
            }
        }
        return null;
    }

    public (PinterestDeepLinkMetaData pinterestdeeplinkmetadata, PinterestJsonObject pinterestjsonobject)
    {
        a = pinterestdeeplinkmetadata;
        super();
        b = pinterestjsonobject;
    }
}
