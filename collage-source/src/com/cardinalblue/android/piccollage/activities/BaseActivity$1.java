// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.cardinalblue.android.piccollage.a.c;
import com.cardinalblue.android.piccollage.a.i;
import com.facebook.GraphResponse;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseActivity

class a
    implements com.facebook.aphJSONObjectCallback
{

    final BaseActivity a;

    public void onCompleted(JSONObject jsonobject, GraphResponse graphresponse)
    {
        if (graphresponse.getError() != null)
        {
            return;
        } else
        {
            c.a(a.getApplicationContext(), jsonobject);
            i.a(a);
            return;
        }
    }

    (BaseActivity baseactivity)
    {
        a = baseactivity;
        super();
    }
}
