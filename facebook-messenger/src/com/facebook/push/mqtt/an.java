// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Intent;
import android.support.v4.a.e;
import com.facebook.push.fbpushdata.a;
import com.facebook.push.g;
import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package com.facebook.push.mqtt:
//            ca

public class an
    implements a
{

    private final e a;

    public an(e e1)
    {
        a = e1;
    }

    public void a(JsonNode jsonnode, g g1)
    {
        if (g.C2DM.equals(g1))
        {
            jsonnode = new Intent();
            jsonnode.setAction(com.facebook.push.mqtt.ca.a);
            a.a(jsonnode);
        }
    }
}
