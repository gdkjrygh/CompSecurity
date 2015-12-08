// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.sony.snei.np.android.account.oauth.InsufficientApkCapabilityException;
import com.sony.snei.np.android.account.oauth.MalformedApkException;

public final class dap
{

    public dap()
    {
    }

    public static dam a(Context context, dba dba)
    {
        dbn dbn1;
        try
        {
            dbn1 = dbm.b(context);
        }
        catch (MalformedApkException malformedapkexception)
        {
            dbt.b();
            return new dan(context, dba);
        }
        if (dbn1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (dbn1.b == 3)
        {
            if (dbn1.a > 0)
            {
                return new day(context, dbn1.c, dba);
            } else
            {
                throw new InsufficientApkCapabilityException();
            }
        }
        dan dan1 = new dan(context, dba);
        return dan1;
    }
}
