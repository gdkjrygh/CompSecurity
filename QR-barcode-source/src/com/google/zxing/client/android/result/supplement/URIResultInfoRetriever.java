// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result.supplement;

import android.content.Context;
import android.widget.TextView;
import com.google.zxing.client.android.HttpHelper;
import com.google.zxing.client.android.history.HistoryManager;
import com.google.zxing.client.result.URIParsedResult;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.zxing.client.android.result.supplement:
//            SupplementalInfoRetriever

final class URIResultInfoRetriever extends SupplementalInfoRetriever
{

    private static final int MAX_REDIRECTS = 5;
    private final String redirectString;
    private final URIParsedResult result;

    URIResultInfoRetriever(TextView textview, URIParsedResult uriparsedresult, HistoryManager historymanager, Context context)
    {
        super(textview, historymanager);
        redirectString = context.getString(com.google.zxing.client.android.R.string.msg_redirect);
        result = uriparsedresult;
    }

    void retrieveSupplementalInfo()
        throws IOException
    {
        Object obj;
        Object obj1;
        int i;
        try
        {
            obj1 = new URI(result.getURI());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj = HttpHelper.unredirect(((URI) (obj1)));
        i = 0;
        do
        {
            if (i >= 5 || ((URI) (obj1)).equals(obj))
            {
                return;
            }
            obj1 = result.getDisplayResult();
            String s = (new StringBuilder(String.valueOf(redirectString))).append(" : ").append(obj).toString();
            String s1 = ((URI) (obj)).toString();
            append(((String) (obj1)), null, new String[] {
                s
            }, s1);
            obj1 = obj;
            obj = HttpHelper.unredirect(((URI) (obj)));
            i++;
        } while (true);
    }
}
