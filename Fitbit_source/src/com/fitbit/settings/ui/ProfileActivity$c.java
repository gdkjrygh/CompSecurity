// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.content.Context;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.dg;
import com.fitbit.data.domain.User;
import com.fitbit.util.bf;

// Referenced classes of package com.fitbit.settings.ui:
//            ProfileActivity

private static final class  extends bf
{

    protected User a()
    {
        com.fitbit.data.domain.Profile profile;
        try
        {
            dg.d().r(true, null);
            profile = an.a().c();
        }
        catch (Exception exception)
        {
            return null;
        }
        return profile;
    }

    protected Object f_()
    {
        return a();
    }

    public (Context context)
    {
        super(context);
    }
}
