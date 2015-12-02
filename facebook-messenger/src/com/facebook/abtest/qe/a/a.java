// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.a;

import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.analytics.cc;
import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package com.facebook.abtest.qe.a:
//            b

public class a extends cc
{

    public a(QuickExperimentInfo quickexperimentinfo, b b1, String s, JsonNode jsonnode)
    {
        super("quick_experiment_event");
        e((new StringBuilder()).append("__qe__").append(quickexperimentinfo.a()).toString());
        b("group", quickexperimentinfo.b());
        b("event", b1.toString());
        b("context", s);
        if (jsonnode != null)
        {
            a("extras", jsonnode);
        }
    }
}
