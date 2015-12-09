// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import com.sony.snei.np.android.account.oauth.hide.ApiException;
import java.io.IOException;

public abstract class dbl
{

    public dbi c;

    public dbl()
    {
        c = null;
    }

    public static void a(Bundle bundle)
    {
        if (bundle != null)
        {
            if (!bundle.getBoolean("booleanResult"))
            {
                int i = bundle.getInt("errorCode", -1);
                if (i > 0)
                {
                    bundle = bundle.getString("errorMessage");
                    if (i == 3)
                    {
                        throw new IOException(bundle);
                    }
                    if (i == 6)
                    {
                        throw new UnsupportedOperationException(bundle);
                    }
                    if (i == 5)
                    {
                        throw new AuthenticatorException(bundle);
                    }
                    if (i == 7)
                    {
                        throw new IllegalArgumentException(bundle);
                    } else
                    {
                        throw new AuthenticatorException(bundle);
                    }
                } else
                {
                    throw new ApiException(bundle);
                }
            } else
            {
                return;
            }
        } else
        {
            throw new OperationCanceledException("No bundle");
        }
    }

    public abstract Object a(dar dar, Exception exception);

    public abstract Object a(dar dar, Object obj);

    public abstract void a(dar dar);

    public abstract Object b(dar dar);

    public Object b(dar dar, Exception exception)
    {
        c.a = true;
        return a(dar, exception);
    }

    public Object b(dar dar, Object obj)
    {
        c.a = true;
        return a(dar, obj);
    }
}
