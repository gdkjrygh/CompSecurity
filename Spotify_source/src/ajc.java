// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;
import com.comscore.applications.EventType;
import java.util.concurrent.atomic.AtomicInteger;

public final class ajc extends ajd
{

    protected ajc(aif aif1, EventType eventtype, String s, boolean flag)
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        super(aif1, eventtype, s, flag, true, true);
        a(new ajf("ns_ap_gs", String.valueOf(aif1.p), Boolean.valueOf(false)));
        a(new ajf("ns_ap_install", String.valueOf(aif1.o), Boolean.valueOf(false)));
        a(new ajf("ns_ap_runs", String.valueOf(aif1.l.get()), Boolean.valueOf(false)));
        if (flag)
        {
            a(new ajf("ns_ap_csf", "1", Boolean.valueOf(false)));
        }
        eventtype = "0";
        s = Build.TAGS;
        if (s != null && s.contains("test-keys"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        flag1 = flag2;
_L4:
        if (flag1)
        {
            eventtype = "1";
        }
        a(new ajf("ns_ap_jb", eventtype, Boolean.valueOf(false)));
        a(new ajf("ns_ap_lastrun", String.valueOf(aif1.x), Boolean.valueOf(false)));
        aif1 = aif1.i();
        if (aif1 != null && aif1.length() > 0)
        {
            a(new ajf("ns_ap_updated", aif1, Boolean.valueOf(false)));
        }
        return;
_L2:
        flag1 = flag2;
        if (!ajw.a())
        {
            flag1 = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
