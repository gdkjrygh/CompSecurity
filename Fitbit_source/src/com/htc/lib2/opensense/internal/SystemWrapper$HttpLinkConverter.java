// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.internal;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;

// Referenced classes of package com.htc.lib2.opensense.internal:
//            SystemWrapper

public static class 
{

    public static String getAsciiLink(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        try
        {
            s = URLDecoder.decode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            SystemWrapper.access$000(s);
            s = null;
        }
        try
        {
            s = new URL(s);
            s = (new URI(s.getProtocol(), s.getUserInfo(), IDN.toASCII(s.getHost()), s.getPort(), s.getPath(), s.getQuery(), s.getRef())).toASCIIString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            SystemWrapper.access$000(s);
            return null;
        }
        return s;
    }

    public ()
    {
    }
}
