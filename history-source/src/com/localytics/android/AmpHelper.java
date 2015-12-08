// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;
import java.io.File;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            LocalyticsProvider, Constants

final class AmpHelper
{

    AmpHelper()
    {
    }

    public static void destroyLocalAmp(LocalyticsProvider localyticsprovider, Map map, boolean flag)
    {
        int i = ((Integer)map.get("campaign_id")).intValue();
        localyticsprovider.runBatchTransaction(new Runnable(flag, i, localyticsprovider, getRuleIdFromCampaignId(localyticsprovider, i)) {

            final int val$campaignId;
            final boolean val$displayed;
            final LocalyticsProvider val$provider;
            final int val$ruleId;

            public void run()
            {
                ContentValues contentvalues = new ContentValues();
                long al[];
                int l;
                int i1;
                if (displayed)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                contentvalues.put("displayed", Integer.valueOf(l));
                contentvalues.put("campaign_id", Integer.valueOf(campaignId));
                provider.insert("amp_displayed", contentvalues);
                al = AmpHelper.getConditionIdFromRuleId(provider, ruleId);
                i1 = al.length;
                for (l = 0; l < i1; l++)
                {
                    long l1 = al[l];
                    provider.remove("amp_condition_values", String.format("%s = ?", new Object[] {
                        "condition_id_ref"
                    }), new String[] {
                        Long.toString(l1)
                    });
                }

                provider.remove("amp_conditions", String.format("%s = ?", new Object[] {
                    "rule_id_ref"
                }), new String[] {
                    Integer.toString(ruleId)
                });
                provider.remove("amp_ruleevent", String.format("%s = ?", new Object[] {
                    "rule_id_ref"
                }), new String[] {
                    Integer.toString(ruleId)
                });
                provider.remove("amp_rules", String.format("%s = ?", new Object[] {
                    "_id"
                }), new String[] {
                    Integer.toString(ruleId)
                });
            }

            
            {
                displayed = flag;
                campaignId = i;
                provider = localyticsprovider;
                ruleId = j;
                super();
            }
        });
        localyticsprovider = (String)map.get("base_path");
        if (localyticsprovider == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        map = new File(localyticsprovider);
        if (!map.isDirectory()) goto _L2; else goto _L1
_L1:
        String as[];
        int k;
        as = map.list();
        k = as.length;
        int j = 0;
_L3:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        (new File(map, as[j])).delete();
        j++;
        if (true) goto _L3; else goto _L2
_L2:
        if (!map.delete() && Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", String.format("Delete %s failed.", new Object[] {
                localyticsprovider
            }));
        }
        if (!(new File((new StringBuilder()).append(localyticsprovider).append(".zip").toString())).delete() && Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", String.format("Delete %s failed.", new Object[] {
                (new StringBuilder()).append(localyticsprovider).append(".zip").toString()
            }));
        }
_L4:
        return;
        localyticsprovider;
        if (Constants.IS_LOGGABLE)
        {
            Log.e("Localytics", "Localytics library threw an uncaught exception", localyticsprovider);
            return;
        }
          goto _L4
    }

    public static long[] getConditionIdFromRuleId(LocalyticsProvider localyticsprovider, long l)
    {
        LocalyticsProvider localyticsprovider1;
        long al[];
        al = null;
        localyticsprovider1 = al;
        String s = String.format("%s = ?", new Object[] {
            "rule_id_ref"
        });
        localyticsprovider1 = al;
        String s1 = Long.toString(l);
        localyticsprovider1 = al;
        localyticsprovider = localyticsprovider.query("amp_conditions", new String[] {
            "_id"
        }, s, new String[] {
            s1
        }, null);
        localyticsprovider1 = localyticsprovider;
        al = new long[localyticsprovider.getCount()];
        int i = 0;
_L2:
        localyticsprovider1 = localyticsprovider;
        if (!localyticsprovider.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        localyticsprovider1 = localyticsprovider;
        al[i] = localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("_id"));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return al;
        localyticsprovider;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
        }
        throw localyticsprovider;
    }

    public static int getRuleIdFromCampaignId(LocalyticsProvider localyticsprovider, int i)
    {
        LocalyticsProvider localyticsprovider1;
        Object obj;
        boolean flag;
        flag = false;
        obj = null;
        localyticsprovider1 = obj;
        String s = String.format("%s = ?", new Object[] {
            "campaign_id"
        });
        localyticsprovider1 = obj;
        String s1 = Integer.toString(i);
        localyticsprovider1 = obj;
        localyticsprovider = localyticsprovider.query("amp_rules", new String[] {
            "_id"
        }, s, new String[] {
            s1
        }, null);
        i = ((flag) ? 1 : 0);
        localyticsprovider1 = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_92;
        }
        localyticsprovider1 = localyticsprovider;
        i = localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("_id"));
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return i;
        localyticsprovider;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
        }
        throw localyticsprovider;
    }
}
