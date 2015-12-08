// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.content.Context;
import android.text.TextUtils;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.s;
import com.fitbit.data.domain.User;
import com.fitbit.e.a;
import com.fitbit.util.bf;

// Referenced classes of package com.fitbit.settings.ui:
//            ProfileActivity

private static final class b extends bf
{

    private final String a;
    private final long b;

    protected User a()
    {
        com.fitbit.data.domain.RankedUser rankeduser;
        com.fitbit.data.domain.RankedUser rankeduser1;
        if (TextUtils.isEmpty(a))
        {
            rankeduser = s.a(getContext()).a(b);
        } else
        {
            rankeduser = s.a(getContext()).b(a);
        }
        rankeduser1 = rankeduser;
        if (rankeduser == null)
        {
            rankeduser1 = rankeduser;
            if (!TextUtils.isEmpty(a))
            {
                try
                {
                    rankeduser1 = s.a(getContext()).c(a);
                }
                catch (ServerCommunicationException servercommunicationexception)
                {
                    com.fitbit.e.a.e(ProfileActivity.e(), "Could not talk to Server regarding the users friend %s", new Object[] {
                        a, servercommunicationexception
                    });
                    return rankeduser;
                }
            }
        }
        return rankeduser1;
    }

    protected Object f_()
    {
        return a();
    }

    public nicationException(Context context, long l)
    {
        super(context);
        a = null;
        b = l;
    }

    public b(Context context, String s1)
    {
        super(context);
        a = s1;
        b = -1L;
    }
}
