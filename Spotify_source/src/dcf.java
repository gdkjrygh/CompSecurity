// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.sony.snei.np.android.common.oauth.exception.OAuthResponseParserException;
import com.sony.snei.np.android.common.oauth.exception.VersaProtocolException;
import java.util.Date;
import org.apache.http.HttpResponse;

public final class dcf extends dcl
{

    public dcf(Uri uri)
    {
        super(uri);
    }

    private static dca b(HttpResponse httpresponse, int i, String s)
    {
        httpresponse = a(i, httpresponse, s);
        try
        {
            s = new dca();
            s.a = httpresponse.g();
            s.c = httpresponse.h();
            s.d = httpresponse.i();
            s.e = Integer.valueOf(httpresponse.j());
            s.f = Long.valueOf((new Date()).getTime() + (long)(((dca) (s)).e.intValue() * 1000));
            s.g = httpresponse.b("");
            s.b = httpresponse.k();
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
