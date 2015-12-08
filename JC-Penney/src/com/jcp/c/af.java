// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.e.ae;
import com.jcp.e.ag;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.f.a;
import com.jcp.http.c;
import com.jcp.model.rewards.RewardsAccount;
import com.jcp.model.rewards.RewardsProfile;
import com.jcp.pojo.Response;
import com.jcp.settings.model.RewardsSettings;
import com.jcp.util.aa;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.jcp.c:
//            b

public final class af extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/af.getSimpleName();
    private static af b;
    private ae c;
    private boolean d;
    private boolean e;

    private af(Context context)
    {
        d = true;
        e = true;
        a(context);
    }

    private void a(int i, int j, Map map)
    {
        c c1 = new c(b(), this);
        c1.b(com.jcp.b.b.t());
        c1.a(i);
        if (map != null)
        {
            c1.a(map);
        }
        c1.b(j);
        c1.execute(new String[0]);
    }

    public static af b(Context context)
    {
        if (b == null)
        {
            b = new af(context);
        }
        return b;
    }

    private RewardsProfile b(String s)
    {
        return (RewardsProfile)aa.a(s, com/jcp/model/rewards/RewardsProfile);
    }

    public void a(ae ae1)
    {
        c = ae1;
    }

    public void a(ag ag1)
    {
        a(((com.jcp.e.f) (ag1)));
    }

    public void a(RewardsAccount rewardsaccount)
    {
        if (rewardsaccount != null)
        {
            a(66, 1, rewardsaccount.toMap());
        }
    }

    public void a(Response response)
    {
        int i;
        int j;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        response = response.getResponseBody();
        if (!com.jcp.http.b.a(j)) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 66 71: default 64
    //                   66 141
    //                   67 64
    //                   68 151
    //                   69 64
    //                   70 64
    //                   71 86;
           goto _L3 _L4 _L3 _L5 _L3 _L3 _L6
_L3:
        if (c() != null)
        {
            ((ag)c()).a_(response, i);
        }
_L8:
        return;
_L6:
        boolean flag = false;
        RewardsProfile rewardsprofile = b(response);
        if (rewardsprofile != null)
        {
            flag = rewardsprofile.getStatus().equalsIgnoreCase("enrolled");
            if (c() != null)
            {
                ((ag)c()).a(rewardsprofile);
            }
        }
        JCP.s().b(flag);
        continue; /* Loop/switch isn't completed */
_L4:
        JCP.s().b(true);
        continue; /* Loop/switch isn't completed */
_L5:
        JCP.s().b(true);
        continue; /* Loop/switch isn't completed */
_L2:
        response = com.jcp.f.a.a(response);
        if (response != null && response.getErrorMessage() != null && c() != null)
        {
            ((ag)c()).a(response.getErrorCode(), response.getErrorMessage(), i);
        }
        if (c == null) goto _L8; else goto _L7
_L7:
        c.a(j, response);
        return;
        if (true) goto _L3; else goto _L9
_L9:
    }

    public void a(RewardsSettings rewardssettings)
    {
        if (rewardssettings != null)
        {
            boolean flag = rewardssettings.isRewardsEnabled();
            com.jcp.util.ae.d(a, (new StringBuilder()).append("[master switch] Rewards enabled ").append(flag).toString());
            d = flag;
        }
    }

    public void a(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("userName", s);
        hashmap.put("password", s1);
        a(68, 1, ((Map) (hashmap)));
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public boolean a()
    {
        return d && e;
    }

    public boolean a(String s)
    {
        return s != null && (s.equalsIgnoreCase("REWARDS_ENROLL_LOYALTY_EMAIL_EXISTS") || s.equalsIgnoreCase("REWARDS_ENROLL_LOYALTY_SERVICE_FAIL") || s.equalsIgnoreCase("REWARDS_SERVICE_ERROR"));
    }

    public boolean d()
    {
        return e;
    }

    public void e()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("status", "OptedOut");
        a(67, 2, hashmap);
    }

    public void f()
    {
        a(71, 0, null);
    }

}
