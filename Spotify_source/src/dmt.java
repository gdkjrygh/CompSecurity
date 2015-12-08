// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dmt
{

    public static String a(List list, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        boolean flag = true;
        while (list.hasNext()) 
        {
            dmm dmm1 = (dmm)list.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append('&');
            }
            stringbuilder.append(URLEncoder.encode((String)dmm1.first, s));
            stringbuilder.append('=');
            stringbuilder.append(URLEncoder.encode((String)dmm1.second, s));
        }
        return stringbuilder.toString();
    }

    public static List a(URI uri, String s)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        uri = uri.getQuery();
        if (TextUtils.isEmpty(uri)) goto _L2; else goto _L1
_L1:
        String as1[];
        int i;
        int j;
        as1 = uri.split("&");
        j = as1.length;
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L3
_L3:
        uri = as1[i];
        String as[] = uri.split("=");
        if (as.length <= 0) goto _L5; else goto _L4
_L4:
        uri = as[0].trim();
_L8:
        String s1;
        if (as.length <= 1)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        s1 = as[1].trim();
          goto _L6
_L2:
        return arraylist;
_L6:
        if (!TextUtils.isEmpty(uri))
        {
            try
            {
                arraylist.add(new dmm(URLDecoder.decode(uri, s), URLDecoder.decode(s1, s)));
            }
            // Misplaced declaration of an exception variable
            catch (URI uri)
            {
                Assertion.a((new StringBuilder("Encoding is not supported: ")).append(s).toString(), uri);
            }
        }
        i++;
          goto _L7
_L5:
        uri = "";
          goto _L8
        s1 = "";
          goto _L6
    }
}
