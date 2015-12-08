// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            HandShake

private class id
{

    int id;
    String scheme;
    final HandShake this$0;

    boolean checkAvailability(Context context)
    {
        Intent intent;
        if (scheme.contains("://"))
        {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(scheme));
        } else
        {
            intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append(scheme).append("://").toString()));
        }
        return context.getPackageManager().queryIntentActivities(intent, 0x10000).size() > 0;
    }

    void deserializeFromObj(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        } else
        {
            scheme = jsonobject.optString("scheme", null);
            id = jsonobject.optInt("schemeid");
            return;
        }
    }

    ()
    {
        this$0 = HandShake.this;
        super();
    }

    this._cls0(String s, int i)
    {
        this$0 = HandShake.this;
        super();
        scheme = s;
        id = i;
    }
}
