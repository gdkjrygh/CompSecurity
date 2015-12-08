// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.format;

import android.content.Context;
import android.content.res.Resources;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.User;
import com.fitbit.data.domain.challenges.ChallengeUser;

// Referenced classes of package com.fitbit.util.format:
//            g

public class a extends g
{

    private Profile b;
    private boolean c;

    public a(Context context)
    {
        this(context, 3);
    }

    public a(Context context, int i)
    {
        super(context, i);
        c = false;
        c(0x7f0800de);
        d(0x7f0800e0);
        e(0x7f0b0007);
    }

    public Profile a()
    {
        return b;
    }

    protected String a(ChallengeUser challengeuser)
    {
        String s1 = "";
        if (b == null)
        {
            b = an.a().b();
        }
        String s;
        if (challengeuser.a(b) && c)
        {
            s = d().getResources().getString(0x7f0800d7);
        } else
        {
            s = s1;
            if (challengeuser.g() != null)
            {
                s = s1;
                if (challengeuser.g().P() != null)
                {
                    return challengeuser.g().P();
                }
            }
        }
        return s;
    }

    protected volatile String a(Object obj)
    {
        return a((ChallengeUser)obj);
    }

    public void a(Profile profile)
    {
        b = profile;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public boolean b()
    {
        return c;
    }
}
