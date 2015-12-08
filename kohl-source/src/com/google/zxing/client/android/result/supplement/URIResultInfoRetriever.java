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
        Object obj = new URI(result.getURI());
        URI uri = HttpHelper.unredirect(((URI) (obj)));
        for (int i = 0; i < 5 && !((URI) (obj)).equals(uri); i++)
        {
            obj = result.getDisplayResult();
            String s = (new StringBuilder()).append(redirectString).append(" : ").append(uri).toString();
            String s1 = uri.toString();
            append(((String) (obj)), null, new String[] {
                s
            }, s1);
            obj = uri;
            uri = HttpHelper.unredirect(uri);
        }

        break MISSING_BLOCK_LABEL_111;
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
    }
}
