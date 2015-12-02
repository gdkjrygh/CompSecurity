// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.e;

import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.analytics.av;
import com.facebook.debug.log.b;
import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package com.facebook.abtest.qe.e:
//            b

public class a
{

    private static Class a = com/facebook/abtest/qe/e/a;
    private final av b;

    public a(av av1)
    {
        b = av1;
    }

    private void a(QuickExperimentInfo quickexperimentinfo, String s, JsonNode jsonnode, com.facebook.abtest.qe.a.b b1)
    {
        if (!quickexperimentinfo.c())
        {
            return;
        } else
        {
            b.b(new com.facebook.abtest.qe.a.a(quickexperimentinfo, b1, s, jsonnode));
            com.facebook.debug.log.b.b(a, "Event(%s) Experiment(%s) Group(%s)", new Object[] {
                b1, quickexperimentinfo.a(), quickexperimentinfo.b()
            });
            return;
        }
    }

    public void a(QuickExperimentInfo quickexperimentinfo, com.facebook.abtest.qe.e.b b1)
    {
        a(quickexperimentinfo, b.access$000(b1), null, com.facebook.abtest.qe.a.b.UNDEPLOYMENT);
    }

    public void a(QuickExperimentInfo quickexperimentinfo, String s, JsonNode jsonnode)
    {
        a(quickexperimentinfo, s, jsonnode, com.facebook.abtest.qe.a.b.EXPOSURE);
    }

}
