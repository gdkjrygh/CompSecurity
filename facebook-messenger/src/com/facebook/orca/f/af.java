// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.common.time.a;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.s;
import com.facebook.orca.threads.FolderName;
import com.facebook.push.mqtt.v;
import com.google.common.a.ik;
import java.util.Map;

// Referenced classes of package com.facebook.orca.f:
//            ag, ah, ad

public class af
{

    private static final Class a = com/facebook/orca/f/af;
    private final ad b;
    private final v c;
    private final a d;
    private final Map e = ik.a();
    private final Map f = ik.a();
    private final Map g = ik.a();
    private final Map h = ik.a();

    public af(ad ad1, v v1, a a1)
    {
        b = ad1;
        c = v1;
        d = a1;
    }

    private long c(FolderName foldername)
    {
        foldername = (Long)e.get(foldername);
        if (foldername != null)
        {
            return foldername.longValue();
        } else
        {
            return -1L;
        }
    }

    private long c(String s1)
    {
        s1 = (Long)g.get(s1);
        if (s1 != null)
        {
            return s1.longValue();
        } else
        {
            return -1L;
        }
    }

    private long d(FolderName foldername)
    {
        foldername = (Long)f.get(foldername);
        if (foldername != null)
        {
            return foldername.longValue();
        } else
        {
            return -1L;
        }
    }

    private long d(String s1)
    {
        s1 = (Long)h.get(s1);
        if (s1 != null)
        {
            return s1.longValue();
        } else
        {
            return -1L;
        }
    }

    public s a(FolderName foldername, s s1)
    {
        return a(foldername, s1, true).a;
    }

    public s a(String s1, s s2)
    {
        return a(s1, s2, true).a;
    }

    ag a(FolderName foldername, s s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        if (!com.facebook.debug.log.b.b(2))
        {
            break MISSING_BLOCK_LABEL_77;
        }
        stringbuilder = new StringBuilder("upgradeDataFreshnessForThreadListRequest called for:");
        stringbuilder.append(" folder=").append(foldername.b());
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        stringbuilder.append(" freshness=").append(s1.toString());
        stringbuilder.append(" updateTimestamp=").append(flag);
        com.facebook.debug.log.b.a(a, stringbuilder.toString());
        if (s1 != s.DO_NOT_CHECK_SERVER && s1 != s.STALE_DATA_OKAY && s1 != s.CHECK_SERVER_FOR_NEW_DATA) goto _L2; else goto _L1
_L1:
        foldername = new ag(s1, ah.SPECIFIC_INTENTION);
_L3:
        this;
        JVM INSTR monitorexit ;
        return foldername;
_L2:
        long l;
        long l1;
        long l2;
        long l3;
        l = d.a();
        l1 = b.f(foldername);
        l2 = c(foldername);
        l3 = c.g();
        if (com.facebook.debug.log.b.b(2))
        {
            StringBuilder stringbuilder1 = new StringBuilder();
            stringbuilder1.append("upgradeDataFreshnessForThreadListRequest mqtt timestamps:");
            stringbuilder1.append("disconnectedMqttEarliestRetryMs=").append(l2);
            stringbuilder1.append("lastDisconnectionTimeStampMS=").append(l3);
            stringbuilder1.append("lastUpdatedTimeMs=").append(l1);
            stringbuilder1.append("now=").append(l);
            com.facebook.debug.log.b.a(a, stringbuilder1.toString());
        }
        if (l3 <= 0L || l1 >= l3 || l2 >= l)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Upgrading timestamp mDisconnectedMqttEarliestRetryMsForFolders:").append(l2).toString());
        e.put(foldername, Long.valueOf(l + 60000L));
        com.facebook.debug.log.b.a(a, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c of recent mqtt disconnect");
        foldername = new ag(s.CHECK_SERVER_FOR_NEW_DATA, ah.MQTT_RECENTLY_DISCONNECTED);
          goto _L3
        foldername;
        throw foldername;
        if (c.d() || l - l1 < 0x493e0L)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        com.facebook.debug.log.b.a(a, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c mqtt disconnected and 5 minutes since last refresh");
        foldername = new ag(s.CHECK_SERVER_FOR_NEW_DATA, ah.MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED);
          goto _L3
        l2 = d(foldername);
        if (!c.e() || l1 >= c.h() || l2 >= l)
        {
            break MISSING_BLOCK_LABEL_475;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        f.put(foldername, Long.valueOf(l + 60000L));
        com.facebook.debug.log.b.a(a, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c of recent mqtt connect");
        foldername = new ag(s.CHECK_SERVER_FOR_NEW_DATA, ah.MQTT_CONNECTED);
          goto _L3
        if (l - l1 < 0x1b7740L)
        {
            break MISSING_BLOCK_LABEL_512;
        }
        com.facebook.debug.log.b.a(a, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c 30 minutes since last refresh");
        foldername = new ag(s.CHECK_SERVER_FOR_NEW_DATA, ah.OLD_DATA);
          goto _L3
label0:
        {
            if (b.b(foldername))
            {
                break label0;
            }
            com.facebook.debug.log.b.a(a, "Upgrading to PREFER_CACHE_IF_UP_TO_DATE b/c cache is stale");
            foldername = new ag(s.PREFER_CACHE_IF_UP_TO_DATE, ah.DATA_KNOWN_TO_BE_STALE);
        }
          goto _L3
        foldername = new ag(s1, ah.DEFAULT);
          goto _L3
    }

    ag a(String s1, s s2, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (s2 != s.DO_NOT_CHECK_SERVER && s2 != s.STALE_DATA_OKAY && s2 != s.CHECK_SERVER_FOR_NEW_DATA) goto _L3; else goto _L2
_L2:
        s1 = new ag(s2, ah.SPECIFIC_INTENTION);
_L4:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L3:
        long l;
        long l1;
        long l2;
        l = b.a(s1);
        l1 = d.a();
        l2 = c(s1);
        if (l >= c.g() || l2 >= l1)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        g.put(s1, Long.valueOf(l1 + 60000L));
        com.facebook.debug.log.b.a(a, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c of recent mqtt disconnect");
        s1 = new ag(s.CHECK_SERVER_FOR_NEW_DATA, ah.MQTT_RECENTLY_DISCONNECTED);
          goto _L4
        s1;
        throw s1;
        if (c.d() || l1 - l < 0x493e0L)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        com.facebook.debug.log.b.a(a, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c mqtt disconnected and 5 minutes since last refresh");
        s1 = new ag(s.CHECK_SERVER_FOR_NEW_DATA, ah.MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED);
          goto _L4
        l2 = d(s1);
        if (!c.e() || l >= c.h() || l2 >= l1)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        h.put(s1, Long.valueOf(l1 + 60000L));
        com.facebook.debug.log.b.a(a, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c of recent mqtt connect");
        s1 = new ag(s.CHECK_SERVER_FOR_NEW_DATA, ah.MQTT_CONNECTED);
          goto _L4
        if (l1 - l < 0x927c0L)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        com.facebook.debug.log.b.a(a, "Upgrading to CHECK_SERVER_FOR_NEW_THREAD_DATA_THRESHOLD_MS b/c it has been 10 minutes since last thread refresh");
        s1 = new ag(s.CHECK_SERVER_FOR_NEW_DATA, ah.OLD_DATA);
          goto _L4
label0:
        {
            if (b.a(s1, 20))
            {
                break label0;
            }
            com.facebook.debug.log.b.a(a, "Upgrading to PREFER_CACHE_IF_UP_TO_DATE b/c the thread is not up to date");
            s1 = new ag(s.PREFER_CACHE_IF_UP_TO_DATE, ah.DATA_KNOWN_TO_BE_STALE);
        }
          goto _L4
        s1 = new ag(s2, ah.DEFAULT);
          goto _L4
    }

    public boolean a(FolderName foldername)
    {
        boolean flag = false;
        if (a(foldername, null, false).a != null)
        {
            flag = true;
        }
        return flag;
    }

    public boolean a(String s1)
    {
        boolean flag = false;
        if (a(s1, null, false).a != null)
        {
            flag = true;
        }
        return flag;
    }

    public boolean b(FolderName foldername)
    {
        boolean flag = false;
        if (a(foldername, null, false).a == s.CHECK_SERVER_FOR_NEW_DATA)
        {
            flag = true;
        }
        return flag;
    }

    public boolean b(String s1)
    {
        boolean flag = false;
        if (a(s1, null, false).a == s.CHECK_SERVER_FOR_NEW_DATA)
        {
            flag = true;
        }
        return flag;
    }

}
