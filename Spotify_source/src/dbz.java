// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.sony.snei.np.android.common.oauth.exception.OAuthResponseParserException;
import com.sony.snei.np.android.common.oauth.exception.VersaProtocolException;
import com.sony.snei.np.android.common.oauth.exception.VersaServerException;

public final class dbz
{

    public static void a(dby dby1, int i)
    {
        if (!dby1.a())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        try
        {
            if (dby1.b())
            {
                throw new VersaServerException(i, dby1.c(), dby1.d(), dby1.e());
            }
        }
        // Misplaced declaration of an exception variable
        catch (dby dby1)
        {
            throw new VersaProtocolException(i, 2);
        }
        throw new VersaProtocolException(i, dby1.d(), dby1.e());
    }
}
