// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.snapchat.android.Timber;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Set;

public final class Iw
{

    public static final int MAX_SUCCESSFUL_STATUS_CODE = 299;
    public static final int MIN_SUCCESSFUL_STATUS_CODE = 200;
    public static final int SC_ANDROID_ID_TOKEN_EXPIRED = 499;
    private static final String TAG = "HttpUtils";

    public static String a(String s, Bundle bundle)
    {
        StringBuilder stringbuilder;
        int i;
        if (bundle == null || s == null || bundle.isEmpty())
        {
            return s;
        }
        stringbuilder = new StringBuilder(s.length() + (bundle.size() << 5));
        stringbuilder.append(s);
        i = s.indexOf('?');
        if (i != -1) goto _L2; else goto _L1
_L1:
        stringbuilder.append('?');
_L7:
        s = bundle.keySet().iterator();
_L5:
        String s1;
        if (!s.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (String)s.next();
        if (s1 == null)
        {
            try
            {
                throw new NullPointerException(String.format("Found null key in %s", new Object[] {
                    bundle
                }));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Timber.e("HttpUtils", "UTF-8 is not supported.", new Object[0]);
            }
            throw new RuntimeException(s);
        }
          goto _L3
_L2:
        if (i != s.length() - 1)
        {
            stringbuilder.append('&');
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (bundle.get(s1) == null)
        {
            throw new NullPointerException(String.format("Found null value for key %s", new Object[] {
                s1
            }));
        }
        stringbuilder.append(s1).append("=").append(URLEncoder.encode(bundle.get(s1).toString(), "UTF-8")).append('&');
        if (true) goto _L5; else goto _L4
_L4:
        stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        return stringbuilder.toString();
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean a(int i)
    {
        return i >= 200 && i <= 299;
    }
}
