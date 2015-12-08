// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.sony.snei.np.android.common.oauth.exception.OAuthResponseParserException;
import com.sony.snei.np.android.common.oauth.exception.VersaProtocolException;
import org.apache.http.HttpResponse;

public final class dce extends dcl
{

    public dce(Uri uri)
    {
        super(uri);
    }

    private static dcg b(HttpResponse httpresponse, int i, String s)
    {
        httpresponse = a(i, httpresponse, s);
        try
        {
            s = new dcg();
            s.a = (String)httpresponse.a("user_id");
            s.c = (String)httpresponse.a("sign_in_id", "");
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new VersaProtocolException(i, httpresponse);
        }
        return s;
    }

    protected final Object a(int i, String s)
    {
        a(i, s, super.a);
        throw new VersaProtocolException(i, 1);
    }

    protected final Object a(HttpResponse httpresponse, int i, String s)
    {
        return b(httpresponse, i, s);
    }
}
