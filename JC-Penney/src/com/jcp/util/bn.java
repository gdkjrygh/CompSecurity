// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import com.jcp.JCP;
import com.jcp.activities.MainActivity;
import com.jcp.b.a;
import com.jcp.c.af;
import com.jcp.fragments.bh;
import com.jcp.fragments.rewards.RewardsDashboardFragment;
import com.jcp.fragments.rewards.RewardsLandingFragment;
import com.jcp.fragments.t;
import com.jcp.model.rewards.Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.util:
//            b, y, af

public final class bn
{

    public static List a(List list, String s)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            Certificate certificate = (Certificate)iterator.next();
            if (certificate.getType().contains(s))
            {
                arraylist1.add(certificate);
            } else
            {
                arraylist.add(certificate);
            }
        }

        Collections.sort(arraylist, new b());
        Collections.sort(arraylist1, new b());
        list.clear();
        list.addAll(arraylist);
        list.addAll(arraylist1);
        return list;
    }

    public static void a(Button button, Certificate certificate, Context context)
    {
        button.setTag(certificate);
        String s = context.getString(0x7f070086);
        int i = 0x7f0d006b;
        int j;
        if (certificate.isApplied())
        {
            j = 0x7f020226;
            i = 0x7f0d005e;
            certificate = (new StringBuilder()).append(context.getString(0x7f070149)).append(com.jcp.util.y.a(certificate.getAmount().doubleValue(), true)).toString();
        } else
        {
            j = 0;
            certificate = s;
        }
        button.setText(certificate);
        button.setTextColor(context.getResources().getColor(i));
        button.setCompoundDrawablesWithIntrinsicBounds(0, 0, j, 0);
    }

    public static void a(t t1)
    {
        a(t1, false);
    }

    public static void a(t t1, Activity activity, boolean flag)
    {
        if (t1 != null && activity != null)
        {
            if (af.b(activity).a())
            {
                a(t1, flag);
            } else
            {
                if (flag)
                {
                    t1.a(new bh(), "RewardsFragment");
                } else
                {
                    t1.c(new bh(), "RewardsFragment");
                }
                if (activity instanceof MainActivity)
                {
                    activity.findViewById(0x7f0e0164).setVisibility(8);
                    return;
                }
            }
        }
    }

    public static void a(t t1, boolean flag)
    {
        if (JCP.s().d())
        {
            if (flag)
            {
                t1.a(new RewardsDashboardFragment(), a.b);
                return;
            } else
            {
                t1.c(new RewardsDashboardFragment(), a.b);
                return;
            }
        }
        if (flag)
        {
            t1.a(new RewardsLandingFragment(), "RewardsLandingFragment");
            return;
        } else
        {
            t1.c(new RewardsLandingFragment(), "RewardsLandingFragment");
            return;
        }
    }
}
