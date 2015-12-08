// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.ContentValues;

// Referenced classes of package com.localytics.android:
//            AmpHelper, LocalyticsProvider

static final class val.ruleId
    implements Runnable
{

    final int val$campaignId;
    final boolean val$displayed;
    final LocalyticsProvider val$provider;
    final int val$ruleId;

    public void run()
    {
        ContentValues contentvalues = new ContentValues();
        long al[];
        int i;
        int j;
        if (val$displayed)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("displayed", Integer.valueOf(i));
        contentvalues.put("campaign_id", Integer.valueOf(val$campaignId));
        val$provider.insert("amp_displayed", contentvalues);
        al = AmpHelper.getConditionIdFromRuleId(val$provider, val$ruleId);
        j = al.length;
        for (i = 0; i < j; i++)
        {
            long l = al[i];
            val$provider.remove("amp_condition_values", String.format("%s = ?", new Object[] {
                "condition_id_ref"
            }), new String[] {
                Long.toString(l)
            });
        }

        val$provider.remove("amp_conditions", String.format("%s = ?", new Object[] {
            "rule_id_ref"
        }), new String[] {
            Integer.toString(val$ruleId)
        });
        val$provider.remove("amp_ruleevent", String.format("%s = ?", new Object[] {
            "rule_id_ref"
        }), new String[] {
            Integer.toString(val$ruleId)
        });
        val$provider.remove("amp_rules", String.format("%s = ?", new Object[] {
            "_id"
        }), new String[] {
            Integer.toString(val$ruleId)
        });
    }

    ovider(boolean flag, int i, LocalyticsProvider localyticsprovider, int j)
    {
        val$displayed = flag;
        val$campaignId = i;
        val$provider = localyticsprovider;
        val$ruleId = j;
        super();
    }
}
