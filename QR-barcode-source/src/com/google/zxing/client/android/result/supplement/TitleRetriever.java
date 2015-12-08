// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result.supplement;

import android.widget.TextView;
import com.google.zxing.client.android.HttpHelper;
import com.google.zxing.client.android.history.HistoryManager;
import com.google.zxing.client.result.URIParsedResult;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.zxing.client.android.result.supplement:
//            SupplementalInfoRetriever

final class TitleRetriever extends SupplementalInfoRetriever
{

    private static final int MAX_TITLE_LEN = 100;
    private static final Pattern TITLE_PATTERN = Pattern.compile("<title>([^<]+)");
    private final String httpUrl;

    TitleRetriever(TextView textview, URIParsedResult uriparsedresult, HistoryManager historymanager)
    {
        super(textview, historymanager);
        httpUrl = uriparsedresult.getURI();
    }

    void retrieveSupplementalInfo()
    {
        Object obj;
        try
        {
            obj = HttpHelper.downloadViaHttp(httpUrl, com.google.zxing.client.android.HttpHelper.ContentType.HTML, 4096);
        }
        catch (IOException ioexception)
        {
            return;
        }
        if (obj != null && ((CharSequence) (obj)).length() > 0)
        {
            obj = TITLE_PATTERN.matcher(((CharSequence) (obj)));
            if (((Matcher) (obj)).find())
            {
                String s1 = ((Matcher) (obj)).group(1);
                if (s1 != null && s1.length() > 0)
                {
                    String s = s1;
                    if (s1.length() > 100)
                    {
                        s = (new StringBuilder(String.valueOf(s1.substring(0, 100)))).append("...").toString();
                    }
                    s1 = httpUrl;
                    String s2 = httpUrl;
                    append(s1, null, new String[] {
                        s
                    }, s2);
                }
            }
        }
    }

}
