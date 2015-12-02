// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync.user;

import com.facebook.abtest.qe.protocol.sync.SyncQuickExperimentParams;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.ew;
import java.util.Iterator;

// Referenced classes of package com.facebook.abtest.qe.protocol.sync.user:
//            c, SyncQuickExperimentUserInfoResult

public class d
{

    private static final Class a = com/facebook/abtest/qe/protocol/sync/user/d;

    public d()
    {
    }

    public SyncQuickExperimentUserInfoResult a(JsonNode jsonnode, SyncQuickExperimentParams syncquickexperimentparams)
    {
        Object obj;
        if (jsonnode != null && syncquickexperimentparams != null)
        {
            if ((obj = jsonnode.get("data")) != null)
            {
                c c1 = new c();
                c1.a(syncquickexperimentparams.a());
                c1.a(((JsonNode) (obj)).get(0).get("in_experiment").booleanValue());
                c1.c(((JsonNode) (obj)).get(0).get("hash").textValue());
                syncquickexperimentparams = ((JsonNode) (obj)).get(0).get("group").textValue();
                jsonnode = syncquickexperimentparams;
                if (syncquickexperimentparams == null)
                {
                    jsonnode = "local_default_group";
                }
                c1.b(jsonnode);
                jsonnode = new ew();
                syncquickexperimentparams = ((JsonNode) (obj)).get(0).get("params");
                obj = syncquickexperimentparams.fieldNames();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    String s = (String)((Iterator) (obj)).next();
                    int i = syncquickexperimentparams.get(s).get("type").asInt();
                    String s1 = syncquickexperimentparams.get(s).get("value").asText();
                    if (i == 1 || i == 2)
                    {
                        jsonnode.b(s, s1);
                    }
                } while (true);
                c1.a(jsonnode.b());
                return c1.a();
            }
        }
        return null;
    }

}
